import javax.swing.JFrame;

public class Lab3Exercises {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Gilson Rivera");
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        myFrame.setLocation(890, 390);
        myFrame.setSize(200, 200);
        myFrame.setVisible(true);
        
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
        
    }
}