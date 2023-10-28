import java.awt.*;
import javax.swing.*;

/* This class provides the mainframe of the entire app, it starts out with the 
different buttons on top */

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PHYSICALC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 700);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x333333));
        frame.setVisible(true);

        FieldButton mechanicField = new FieldButton("Mechanics", 50, 50);
        frame.add(mechanicField);

        FieldButton electicityField = new FieldButton("Electricity", 300, 50);
        frame.add(electicityField);

        FieldButton searchField = new FieldButton("Search", 550, 50);
        frame.add(searchField);

    }
}