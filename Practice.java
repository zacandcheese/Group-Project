import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//Added These to Change BTN Size
import javax.swing.*;
import java.awt.*;

public class Practice extends JFrame implements ActionListener {
   private JLabel person;     // Label for hourly salary
   private JTextField name;  // Displays hourly salary 
   private JButton letterA;   // Triggers salary calculation
   private JButton letterB;
   private JButton letterQ;
   private JTextField write;
   private String typed = ""; // User specified hourly wage
   private JButton deleteKey;
   
   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   Practice() {
      // Used to specify GUI component layout
      GridBagConstraints positionConst = null;

      // Set frame's title
      setTitle("Keyboard");

      // Set hourly and yearly salary labels
      person = new JLabel("PERSON");

      //name = new JTextField(15);
      //name.setEditable(true);
      //name.setText("name");

      write = new JTextField(20);
      write.setEditable(false);
      
      // Create a "Calculate" button
      letterA = new JButton("A");
      letterB = new JButton("B");
      letterQ = new JButton("Q");
      deleteKey = new JButton("Delete");
      deleteKey.setPreferredSize(new Dimension(100, 26));//Change Btn Size
      
      // Use "this" class to handle button presses
      letterA.addActionListener(this);
      letterB.addActionListener(this);
      deleteKey.addActionListener(this);
      letterQ.addActionListener(this);
      //IF SOMEONE WANTS TO MESS WITH THE SIDES
      //https://docs.oracle.com/javase/7/docs/api/java/awt/GridBagLayout.html
      
      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      positionConst = new GridBagConstraints();

      // Specify component's grid location
      //positionConst.gridx = 0;
      //positionConst.gridy = 0;
      // 10 pixels of padding around component
      //positionConst.insets = new Insets(10, 10, 10, 10);

   /*
   
         setFont(new Font("SansSerif", Font.PLAIN, 14));
         setLayout(gridbag);

         c.fill = GridBagConstraints.BOTH;
         c.weightx = 1.0;
         makebutton("Button1", gridbag, c);
         makebutton("Button2", gridbag, c);
         makebutton("Button3", gridbag, c);

         c.gridwidth = GridBagConstraints.REMAINDER; //end row
         makebutton("Button4", gridbag, c);

         c.weightx = 0.0;                //reset to the default
         makebutton("Button5", gridbag, c); //another row

         c.gridwidth = GridBagConstraints.RELATIVE; //next-to-last in row
         makebutton("Button6", gridbag, c);

         c.gridwidth = GridBagConstraints.REMAINDER; //end row
         makebutton("Button7", gridbag, c);

         c.gridwidth = 1;                //reset to the default
         c.gridheight = 2;
         c.weighty = 1.0;
         makebutton("Button8", gridbag, c);

         c.weighty = 0.0;                //reset to the default
         c.gridwidth = GridBagConstraints.REMAINDER; //end row
         c.gridheight = 1;               //reset to the default
         makebutton("Button9", gridbag, c);
         makebutton("Button10", gridbag, c);

   */
      positionConst.gridx = 0;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(0, 0, 0, 0);
      add(write, positionConst);
      
      //Keys
      positionConst.gridx = 1;
      positionConst.gridy = 1;
      add(letterQ, positionConst);

      positionConst.gridx = 1;
      positionConst.gridy = 2;
      add(letterA, positionConst);
      
      positionConst.gridx = 2;
      positionConst.gridy = 2;
      positionConst.gridwidth = GridBagConstraints.RELATIVE; //next-to-last in row
      add(deleteKey, positionConst);
      
      //positionConst.gridx = 3;
      positionConst.gridy = 3;
      positionConst.weighty = 0.0;                //reset to the default
      positionConst.gridwidth = GridBagConstraints.REMAINDER; //end row
      positionConst.gridheight = 1;               //reset to the default
      add(letterB, positionConst);
   }

   /* Method is automatically called when an event 
      occurs (e.g, button is pressed) */
   @Override
      public void actionPerformed(ActionEvent event) {
         // Get source of event (2 buttons in GUI)
         JButton sourceEvent = (JButton) event.getSource();

         // User pressed the reserve button
         /*if (sourceEvent == letterA) {
            write.setText(typed+"A");
            typed+="A";
         }*/
         if(sourceEvent == deleteKey){
            if(typed.length()>0){
               typed = typed.substring(0,typed.length()-1);
            }
         }
         else{
            typed+=sourceEvent.getText();
         }
         write.setText(typed);

         
         return;
   }

   /* Creates a SalaryCalculatorFrame and makes it visible */
   public static void main(String[] args) {
      // Creates SalaryLabelFrame and its components
      Practice myFrame = new Practice();
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);

      return;
   }
}