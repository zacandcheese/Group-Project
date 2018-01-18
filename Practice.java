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
   private JButton letterAccent;
   private JButton letterOne;
   private JButton letterTwo;
   private JButton letterThree;
   private JButton letterFour;
   private JButton letterFive;
   private JButton letterSix;
   private JButton letterSeven;
   private JButton letterEight;
   private JButton letterNine;
   private JButton letterZero;
   private JButton letterDash;
   private JButton letterEqua;
   private JButton deleteKey;
   private JButton letterTab;
   private JButton letterQ;
   private JButton letterW;
   private JButton letterE;
   private JButton letterR;
   private JButton letterT;
   private JButton letterY;
   private JButton letterU;
   private JButton letterI;
   private JButton letterO;
   private JButton letterP;
   private JButton letterOpBrak;
   private JButton letterCloBrak;
   private JButton letterBSlash;
   private JButton letterCapLock;
   private JButton letterA;   // Triggers salary calculation
   private JButton letterS;
   private JButton letterD;
   private JButton letterF;
   private JButton letterG;
   private JButton letterH;
   private JButton letterJ;
   private JButton letterK;
   private JButton letterL;
   private JButton letterSemiCol;
   private JButton letterApo;
   private JButton letterEnter;
   private JButton letterShiftOne;
   private JButton letterZ;
   private JButton letterX;
   private JButton letterC;
   private JButton letterV;
   private JButton letterB;
   private JButton letterN;
   private JButton letterM;
   private JButton letterComma;
   private JButton letterPeriod;
   private JButton letterFSlash;
   private JButton letterShiftTwo;
   private JButton letterSpace;
   private JTextField write;
   private String typed = ""; // User specified hourly wage
   
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
      /*letterAccent = new JButton("`");
      letterOne = new JButton("1");
      letterTwo = new JButton("2");
      letterThree = new JButton("3");
      letterFour = new JButton("4");
      letterFive = new JButton("5");
      letterSix = new JButton("6");
      letterSeven = new JButton("7");
      letterEight = new JButton("8");
      letterNine = new JButton("9");
      letterZero = new JButton("0");
      letterDash = new JButton("-");
      letterEqua = new JButton("=");
      deleteKey = new JButton("Backspace");
      letterTab = new JButton("   ");*/
      deleteKey = new JButton("Backspace");
      letterQ = new JButton("Q");
      letterW = new JButton("W");
      letterE = new JButton("E");
      letterR = new JButton("R");
      letterT = new JButton("T");
      letterY = new JButton("Y");
      letterU = new JButton("U");
      letterI = new JButton("I");
      letterO = new JButton("O");
      letterP = new JButton("P");
      /*letterOpBrak = new JButton("[");
      letterCloBrak = new JButton("]");
      letterBSlash = new JButton("\\");
      letterCapLock = new JButton("Caps Lock");*/
      letterA = new JButton("A");
      letterS = new JButton("S");
      letterD = new JButton("D");
      letterF = new JButton("F");
      letterG = new JButton("G");
      letterH = new JButton("H");
      letterJ = new JButton("J");
      letterK = new JButton("K");
      letterL = new JButton("L");
      /*letterSemiCol = new JButton(";");
      letterApo = new JButton("'");
      letterEnter = new JButton("Enter");;
      letterShiftOne = new JButton("Shift");*/
      letterZ = new JButton("Z");
      letterX = new JButton("X");
      letterC = new JButton("C");
      letterV = new JButton("V");
      letterB = new JButton("B");
      letterN = new JButton("N");
      letterM = new JButton("M");
      /*letterComma = new JButton(",");
      letterPeriod = new JButton(".");
      letterFSlash = new JButton("/");
      letterShiftWro = new JButton("Shift");
      letterSpace = new JButton(" ");*/
      deleteKey.setPreferredSize(new Dimension(100, 26));//Change Btn Size
      
      // Use "this" class to handle button presses
      letterA.addActionListener(this);
      letterS.addActionListener(this);
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
      add(letterS, positionConst);
      
      positionConst.gridx = 3;
      positionConst.gridy = 2;
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