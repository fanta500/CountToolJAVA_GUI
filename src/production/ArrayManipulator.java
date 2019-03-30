package production;

import javax.swing.*;
import java.awt.*;

public class ArrayManipulator {
    private JFrame frame = new JFrame();
    private GridLayout layout;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public ArrayManipulator(int rows, int columns) {
        layout = new GridLayout(rows, columns);
        frame.setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
