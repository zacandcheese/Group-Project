//import javax.swing.*;
//import java.awt.*;
//import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*public class Testfile{
   Testfile(){*/
//from  w w w . ja v a2 s  .com
public class Main extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("");
    Group root = new Group();
    Scene scene = new Scene(root, 300, 250, Color.WHITE);

    HBox hbox = new HBox();
    Button button1 = new Button("Add               ");
    Button button2 = new Button("Remove   ");
    HBox.setHgrow(button1, Priority.ALWAYS);
    HBox.setHgrow(button2, Priority.ALWAYS);
    button1.setMaxWidth(Double.MAX_VALUE);
    button2.setMaxWidth(Double.MAX_VALUE);
    hbox.getChildren().addAll(button1, button2);
    
    root.getChildren().add(hbox);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
/*      JFrame frame = new JFrame();
      JButton Q = new JButton("Q");
      JButton W = new JButton("W");
      JButton E = new JButton("E");
      Q.setSize(100, 100);
      W.setSize(100, 100);
      frame.add(Q);
      frame.add(W);
      frame.add(E);
      frame.setTitle("An Empty Frame");
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   public static void main(String[] args){
      Testfile m = new Testfile();
   }
}*/