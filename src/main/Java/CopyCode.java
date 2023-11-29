import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.ui.Messages;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.URLEncoder;

import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class CopyCode extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        DataContext dataContext = e.getDataContext();

        Editor editor = CommonDataKeys.EDITOR.getData(dataContext);
        if (editor == null) {
            return;
        }

        VirtualFile virtualFile = FileDocumentManager.getInstance().getFile(editor.getDocument());
        if (virtualFile == null) {
            return;
        }

        String language = determineLanguage(virtualFile);
        if (language == null) {
            return;
        }

        SelectionModel selectionModel = editor.getSelectionModel();
        String selectedText = selectionModel.getSelectedText();

        if (selectedText == null || selectedText.isEmpty()) {
            return;
        }

        if (selectedText.contains("```")) {
            int answer = Messages.showYesNoDialog(
                    "Multiline quotation marks (```) were detected. Do you want to reformat the code?",
                    "Confirmation",
                    Messages.getQuestionIcon()
            );
            if (answer == Messages.YES) {
                selectedText = selectedText.replace("```", "` ` `");
            }
        }

        String message = "```" + language + "\n" + selectedText + "\n```";


        if ("Copy Selected".equals(e.getPresentation().getText())) {
            StringSelection selection = new StringSelection(message);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, null);
        } else if ("Send With Copy Selected".equals(e.getPresentation().getText())) {
            int maximum_telegram_massage = 1150;
            if (message.length() < maximum_telegram_massage) {
                openTelegramSharePage(message);
            } else {
                Messages.showWarningDialog("Too many letters to forward", "Warning");
            }
        } else if("Cut Selected".equals(e.getPresentation().getText())){
            StringSelection selection = new StringSelection(message);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, null);
            WriteCommandAction.runWriteCommandAction(e.getProject(), () -> {
                editor.getDocument().deleteString(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd());
            });
        }

    }

    private String determineLanguage(VirtualFile virtualFile) {
        String extension = virtualFile.getExtension();
        if (extension != null) {
            return extension;
        }
        return null;
    }

    private void openTelegramSharePage(String message) {
        try {
            String encodedMessage = URLEncoder.encode(message, StandardCharsets.UTF_8.toString());
            String url = "https://t.me/share/url?url=" + encodedMessage;
            Desktop desktop = Desktop.getDesktop();
            if (Desktop.isDesktopSupported() && desktop.isSupported(Desktop.Action.BROWSE)) {
                desktop.browse(new URI(url));
            } else { // Platform is not allowing to open browser
                Messages.showErrorDialog("Your Ide isn't have browser access", "Error 404");
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
