package helperv1b;

// @author Jeff
import javax.swing.JButton;
import javax.swing.JTextArea;

public class RightPanel extends TextAreaWithButton {
    
    public RightPanel getRightPanel() {
        return this;
    }

    @Override
    public JTextArea getTextArea() {
        return super.getTextArea();
    }

    @Override
    public JButton getBtnClipboard() {
        return super.getBtnClipboard();
    }

    public String getText() {
        return getTextArea().getText();
    }
   
    public void displayText(String str) {
        getTextArea().setText(str);
    }
}
