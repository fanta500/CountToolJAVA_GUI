import production.AWTCounter;
import production.ArrayManipulator;
import production.GUI;

public class EntryClass {
    private GUI gui = new GUI();
    private ArrayManipulator arrayManipulator = new ArrayManipulator(10,10);
    public static void main(String args[]) {
        EntryClass ec = new EntryClass();
        ec.runProgram();

    }
    public void runProgram() {
        AWTCounter awtCounter = new AWTCounter();
    }
}