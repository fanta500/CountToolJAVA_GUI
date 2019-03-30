import production.AWTCounter;
import production.GUI;

public class EntryClass {
    private GUI gui = new GUI();

    public static void main(String args[]) {
        EntryClass ec = new EntryClass();
        ec.runProgram();
    }
    public void runProgram() {
        AWTCounter awtCounter = new AWTCounter();
    }
}