//4.19
import javax.swing.JFrame;
public class DrawPanelTest {
    public static void main(String[] args){
        DrawPanel panel = new DrawPanel();
        //DrawPanel1 panel1 = new DrawPanel1();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        //application.add(panel1);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
