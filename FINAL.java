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

public class FINAL extends JFrame {//implements ActionListener{
   private JLabel person;     // person
   private JTextField name;  // there name
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
   private JButton BLANK;
   private JButton BLANK1;
   
     FINAL() {
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
      */
      letterTab = new JButton("TAB");
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
      letterBSlash = new JButton("\\");*/
      letterCapLock = new JButton("Caps Lock");
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
      BLANK = new JButton("");
      BLANK1 = new JButton("");
       // Use a GridBagLayout
      GridBagConstraints c = null;
      GridBagLayout gridbag = new GridBagLayout();
      setLayout(gridbag);
      c = new GridBagConstraints();
      setFont(new Font("SansSerif", Font.PLAIN, 40));

      //TAB qwertyuiop
       c.fill = GridBagConstraints.BOTH;      
       c.weightx = 1.0;
       //c.gridwidth = GridBagConstraints.RELATIVE;
       add(letterTab,c);
       //c.gridwidth = 10;
       add(letterQ,c);
       add(letterW,c);
       add(letterE,c);
       add(letterR,c);
       add(letterT,c);
       add(letterY,c);
       add(letterU,c);
       add(letterI,c);
       add(letterO,c);
       c.gridwidth = GridBagConstraints.REMAINDER;
       add(letterP,c);
       
       //CAPS LOCK asdfghjkl
        c.gridwidth = 2;                //reset to the default
         c.gridheight = 1;
         c.weightx = 1.0;
         c.weighty = 1.0;
         add(letterCapLock,c);
         
         c.gridwidth = 1;
         c.weighty = 0.0;
         c.gridheight = 1;               //reset to the default
         add(letterA,c);
         add(letterB,c);
         
       c.gridwidth = GridBagConstraints.REMAINDER;
         add(letterC,c);
         
         c.gridwidth = 1;
         c.gridheight = 1;
         c.weightx = 1.0;
         c.weighty = 0.0;
         c.gridheight = 2;
         add(letterZ,c);
              /*
      add(letterD,c);
      add(letterF,c);
      add(letterG,c);
      add(letterH,c);
      add(letterJ,c);
      add(letterK,c);*/      
   }
    /* Creates a SalaryCalculatorFrame and makes it visible */
   public static void main(String[] args) {
      // Creates SalaryLabelFrame and its components
      FINAL myFrame = new FINAL();
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);

      return;
   }


}