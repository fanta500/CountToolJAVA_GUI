import javax.swing.*;
import java.awt.*;
import java.awt.desktop.OpenFilesEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static java.awt.BorderLayout.*;

public class GUI {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    JFileChooser fileChooser = new JFileChooser();
    public void createWindow(){
        /**
         * Setting up the frame
         */
        JFrame frame = new JFrame("Baser Aps sick leave prototype");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(screenSize.width,screenSize.height);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        /**
         * Setting up the main layout
         */
        Container allContent = frame.getContentPane();
        allContent.setLayout(new BorderLayout()); //main layout is BorderLayout

        /**
         * Stuff in the content pane
         */
        JButton button = new JButton("Press");
        JTextPane text = new JTextPane();
        text.setText("POTATO TEST");
        text.setEditable(false);
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        JMenuItem open = new JMenuItem("Open...");
        JMenuItem saveAs = new JMenuItem("Save as");
        open.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fileChooser.showOpenDialog(frame);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        file.add(open);
        file.add(saveAs);
        menuBar.add(file);
        menuBar.add(help);

        allContent.add(button, LINE_START); // Adds Button to content pane of frame at position LINE_START
        allContent.add(text, LINE_END); // Adds the text to the frame, at position LINE_END
        allContent.add(menuBar, PAGE_START);



        frame.setVisible(true);
    }
}