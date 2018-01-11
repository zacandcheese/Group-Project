import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JTextField;

public class Testfile{
    Testfile(){
       JFrame frame = new JFrame() {
          @Override public void paint(Graphics g) {
            for(int j = 0; j<3; j++){
               for(int i = 0; i<=10-j; i++){
                  g.drawRect(100+100*i+j*50, 100+100*j, 100, 100);
               }
            }
            
          }
        };

        frame.setSize(3000, 4000);
        //frame.pack();
        frame.setTitle("An Empty Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
   }
   public static void main(String[] args){
      Testfile m = new Testfile();
   }
}
