import java.awt.*;
import javax.swing.*;

public class FieldOverviewPane extends JPanel {

    int appWidth;
    int appHeigth;

    FieldOverviewPane(int appWidth, int appHeigth) {
        this.appWidth = appWidth;
        this.appHeigth = appHeigth;

        setPreferredSize(new Dimension(this.appWidth, this.appHeigth));
        setBackground(new Color(0x333333));
    }
}
