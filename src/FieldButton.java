import javax.swing.*;
import java.awt.*;

/* This class provides the buttons, which are showcasing the different fields
of physics in the start menu*/

public class FieldButton extends JButton {
    public FieldButton(String physicsField) {
        this.setText(physicsField);
        this.setBackground(new Color(0x666666));
        this.setForeground(new Color(0xbbbbee));
        this.setFont(new Font("Arial", Font.BOLD, 20));
    }

    public static void setButtonSize(JButton button, int buttonWidth, int buttonHeight) {
        button.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
    }
}
