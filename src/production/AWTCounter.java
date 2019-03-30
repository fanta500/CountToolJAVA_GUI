package production;

import com.sun.jdi.FloatValue;

import javax.swing.*;
import java.awt.*;         // Using AWT's containers and components
import java.awt.event.*;   // Using AWT's event classes and listener interfaces
import java.text.DecimalFormat;     //converting large numbers to exponential form

// An AWT production.GUI program inherits the top-level container java.awt.Frame
public class AWTCounter extends JFrame {
    private GridBagLayout layout = new GridBagLayout();
    private GridBagConstraints constraints = new GridBagConstraints();
    private JLabel lblCount;     // Declare component Label
    private JLabel nLabel;     // Declare component Label
    private JLabel facOfNLabel;     // Declare component Label
    private JTextField tfCount;  // Declare component TextField
    private JTextField nTextField;  // Declare component TextField
    private JTextField nFacTextField;  // Declare component TextField
    private JButton btnCountDown;    // Declare component Button
    private JButton btnCountUp;    // Declare component Button
    private long count = 0;      // counter's value
    private long facOfCount = 0;      // counter's value
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private DecimalFormat dc = new DecimalFormat("0.00e0000");

    // Constructor to setup UI components and event handlers
    public AWTCounter () {
        constraints.weighty=0.2;
        setLayout(layout);
        // "super" Frame sets layout to FlowLayout, which arranges
        //  Components from left-to-right, then top-to-bottom.

        lblCount = new JLabel("Counter"); // Construct component Label
        constraints.weightx=0.1;                    // no idea honestly
        constraints.gridx=0;                        // column 0 (left most)
        constraints.gridy=0;                        // row 0 (top most)
        add(lblCount,constraints);                   // "super" Frame adds Label

        tfCount = new JTextField(count + "", 5); // Construct component TextField
        tfCount.setEditable(false);                 // read-only
        constraints.weightx=0.1;
        constraints.gridx=1;                         // column 1
        constraints.gridy=0;                        // row 0
        add(tfCount,constraints);                     // "super" Frame adds TextField

        btnCountDown = new JButton("Count Down");   // Construct component Button
        constraints.weightx=0;
        constraints.gridx=2;
        constraints.gridy=0;
        add(btnCountDown,constraints);                    // "super" Frame adds Button
        btnCountDown.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (count>0) {                  // can only display positive numbers
                    --count;                     // Decrease the counter value
                    tfCount.setText(count + ""); // Display on the TextField
                    nTextField.setText(count+"");
                    if (Long.valueOf(factorial(count)).toString().length()>10) {
                        nFacTextField.setText(dc.format(factorial(count))+"");
                    } else {
                        nFacTextField.setText(factorial(count) + "");
                    }
                }
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

        btnCountUp = new JButton("Count Up");   // Construct component Button
        constraints.weightx=0.1;
        constraints.gridx=3;
        constraints.gridy=0;
        add(btnCountUp, constraints);                    // "super" Frame adds Button
        btnCountUp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                ++count;                     // Increase the counter value
                tfCount.setText(count + ""); // Display on the TextField
                nTextField.setText(count+"");
                if (Long.valueOf(factorial(count)).toString().length()>10) {
                    nFacTextField.setText(dc.format(factorial(count))+"");
                } else {
                    nFacTextField.setText(factorial(count) + "");
                }
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

        nLabel = new JLabel("n");
        constraints.weightx=0;
        constraints.gridx=0;
        constraints.gridy=1;
        add(nLabel,constraints);

        nTextField = new JTextField(count + "", 5);
        nTextField.setEditable(false);
        constraints.weightx=0;
        constraints.gridx=1;
        constraints.gridy=1;
        add(nTextField, constraints);

        facOfNLabel = new JLabel("fac(n)");
        constraints.weightx=0;
        constraints.gridx=2;
        constraints.gridy=1;
        add(facOfNLabel, constraints);

        nFacTextField = new JTextField(facOfCount+"", 20);
        nFacTextField.setEditable(false);
        constraints.weightx=0;
        constraints.gridx=3;
        constraints.gridy=1;
        add(nFacTextField, constraints);


        setSize(500, 130);       // "super" Frame sets initial size
        setTitle("Swing Tool"); // "super" Frame sets title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // pressing X will now terminate the program
        setLocation(screenSize.width/2-getWidth()/2,screenSize.height/2-getHeight()/2); // places the program in the middle of any screen
        setVisible(true);        // show "super" Frame
    }

    public long factorial(long n) {
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}