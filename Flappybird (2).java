import javax.swing.*;
public class app {
    public static void main(String[] args) throws Exception {
        int bordwidth = 360;
        int bordheight = 640;
        JFrame frame = new JFrame("Flappy Bird");
        frame.setVisible(true);
        frame.setSize(bordwidth, bordheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        flappyBird flappyBird= new flappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}