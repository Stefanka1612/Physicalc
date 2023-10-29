import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* This class provides the buttons, which are showcasing the different fields
of physics in the start menu*/

public class FieldButton extends JButton {
    public FieldButton(String physicsField, int xPos, int yPos) {
        this.setText(physicsField);
        this.setBackground(new Color(0x666666));
        this.setForeground(new Color(0xbbbbee));
        this.setFont(new Font("Arial", Font.BOLD, 20));
        this.setBounds(xPos, yPos, 200, 100);
    }
}
