import javax.swing.*;
public class Frame extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Hello World");
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}