import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* This class provides the mainframe of the entire app, it starts out with the 
different buttons on top */

public class App {

    private JFrame frame;
    public String mechanicString[] = {"Gleichmäßig Beschleunigte Bewegung", "Gleichförmige Bewegung", "Gleichmäßig"};

    public static void main(String[] args) {
        App app = new App();
        app.initializeApp();
    }

    public App() {
        frame = new JFrame("PHYSICALC");
    }

    public void initializeApp() {
        setupFrame();
        createFieldButtons();
    }

    // The frame is being setup with a FlowLayout
    private void setupFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 700);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.getContentPane().setBackground(new Color(0x333333));
        frame.setVisible(true);
    }

    // The buttons for the homepage are initialized here. The FieldButton class is used for this
    private void createFieldButtons() {
        FieldButton mechanicField = new FieldButton("Mechanics");
        FieldButton.setButtonSize(mechanicField, 200, 40);
        frame.add(mechanicField);

        FieldButton electricityField = new FieldButton("Electricity");
        FieldButton.setButtonSize(electricityField, 200, 40);
        frame.add(electricityField);

        FieldButton searchField = new FieldButton("Search");
        FieldButton.setButtonSize(searchField, 200, 40);
        searchField.setEnabled(false);
        frame.add(searchField);

        // The ActionListeners are implemented
        mechanicField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FieldOverviewPane mechanicOverviewPane = new FieldOverviewPane(1400, 700);
                frame.add(mechanicOverviewPane);
                frame.pack();
                frame.remove(mechanicField);
                frame.remove(electricityField);
                frame.remove(searchField);
            }
        });

        electricityField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FieldOverviewPane electricOverviewPane = new FieldOverviewPane(1400, 700);
                electricOverviewPane.setLayout(new FlowLayout(FlowLayout.LEFT));
                frame.add(electricOverviewPane);
                frame.pack();
                frame.remove(mechanicField);
                frame.remove(electricityField);
                frame.remove(searchField);
            }
        });
    }
}