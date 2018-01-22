import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
//Added These to Change BTN Size
import javax.swing.*;
import java.awt.*;

public class FINAL extends JFrame implements ActionListener{
   private JLabel person;    
   private JTextField name;  
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
   private JButton letterA;   
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
   private String typed = ""; 
   private JButton BLANK;
   private JButton BLANK1;
   private JButton letterShiftWro;
   private JButton space;
   private JButton gucci;
   private JButton star;
   //TEXT AREA
   private JTextArea output;
   //AUDIO
   private AudioInputStream clipNameAIS;
   private Clip clipNameClip;
   private boolean isLocked = false;
   private boolean isShifted = false;
     FINAL() {
      // Used to specify GUI component layout
      GridBagConstraints positionConst = null;

      // Set frame's title
      setTitle("Keyboard");
      
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
      letterEnter = new JButton("Enter");;
      letterZ = new JButton("Z");
      letterX = new JButton("X");
      letterC = new JButton("C");
      letterV = new JButton("V");
      letterB = new JButton("B");
      letterN = new JButton("N");
      letterM = new JButton("M");
      BLANK = new JButton("");
      BLANK1 = new JButton("");
      letterShiftWro = new JButton("Shift");
      space = new JButton("Space");
      gucci = new JButton("Gucci Gang");
      star = new JButton("APPLE ROSEGOLD");
      
       // Use a GridBagLayout
      GridBagConstraints c = null;
      GridBagLayout gridbag = new GridBagLayout();
      setLayout(gridbag);
      c = new GridBagConstraints();
      setFont(new Font("SansSerif", Font.PLAIN, 40));
      c.weighty = 1.0;
      //FIRST ROW
       c.fill = GridBagConstraints.BOTH;      
       c.weightx = 1.0;
       add(letterTab,c);
       letterTab.addActionListener(this);
       add(letterQ,c);
       letterQ.addActionListener(this);
       add(letterW,c);
       letterW.addActionListener(this);
       add(letterE,c);
       letterE.addActionListener(this);
       add(letterR,c);
       letterR.addActionListener(this);
       add(letterT,c);
       letterT.addActionListener(this);
       add(letterY,c);
       letterY.addActionListener(this);
       add(letterU,c);
       letterU.addActionListener(this);
       add(letterI,c);
       letterI.addActionListener(this);
       add(letterO,c);
       letterO.addActionListener(this);
       add(letterP,c);
       letterP.addActionListener(this);
       c.gridwidth = GridBagConstraints.REMAINDER;
       add(deleteKey,c);
       deleteKey.addActionListener(this);
       
       //SECOND ROW
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 1.0;
        add(letterCapLock,c); 
        letterCapLock.addActionListener(this);   
        c.gridwidth = 1;
        c.gridheight = 1;
        add(letterA,c);
        letterA.addActionListener(this);
        add(letterS,c);
        letterS.addActionListener(this);
        add(letterD,c);
        letterD.addActionListener(this);
        add(letterF,c);
        letterF.addActionListener(this);
        add(letterG,c);
        letterG.addActionListener(this);
        add(letterH,c);
        letterH.addActionListener(this);
        add(letterJ,c);
        letterJ.addActionListener(this);
        add(letterK,c);
        letterK.addActionListener(this);
        add(letterL,c);
        letterL.addActionListener(this);
        c.gridwidth = GridBagConstraints.REMAINDER;
        add(letterEnter,c);
        letterEnter.addActionListener(this);
        
        //THIRD ROW         
         c.gridwidth = 3;
         c.gridheight = 1;
         c.weightx = 1.0;
         c.gridheight = 1;
         add(letterShiftWro,c);
         letterShiftWro.addActionListener(this);
         c.gridwidth = 1;
         c.weighty = 0.0;
         c.gridheight = 1;   
         add(letterZ,c);
         letterZ.addActionListener(this);
         add(letterX,c);
         letterX.addActionListener(this);
         add(letterC,c);
         letterC.addActionListener(this);
         add(letterV,c);
         letterV.addActionListener(this);
         add(letterB,c);
         letterB.addActionListener(this);
         add(letterN,c);
         letterN.addActionListener(this);
         add(letterM,c);
         letterM.addActionListener(this);     
         c.gridwidth = GridBagConstraints.REMAINDER;
         add(BLANK,c);
         
        //FOURTH ROW
         c.gridwidth = 2;
         c.gridheight = 1;
         c.weightx = 1.0;
         c.weighty = 1.0;
         add(BLANK1,c);
         c.gridwidth = GridBagConstraints.RELATIVE;
         c.weighty = 0.0;
         c.gridheight = 1;   
         add(space,c);
         space.addActionListener(this);
         c.gridwidth = GridBagConstraints.REMAINDER;
         add(gucci,c);
         gucci.addActionListener(this);
         
         //SCROLL TEXT BOX
         output = new JTextArea(10, 10);
         JScrollPane scroll = new JScrollPane(output); 
         output.setEditable(false);
         c.insets = new Insets(10, 10, 10 ,10);
         c.fill = GridBagConstraints.HORIZONTAL;
         c.gridwidth = 6;
         add(scroll, c);
         c.gridwidth = GridBagConstraints.REMAINDER;
         add(star,c);
         star.addActionListener(this); 
   }
   @Override
      public void actionPerformed(ActionEvent event) {
         // Get source of event (2+ buttons in GUI)
         JButton sourceEvent = (JButton) event.getSource();
           
         if(sourceEvent == deleteKey){
            if(typed.length()>0){
               typed = typed.substring(0,typed.length()-1);
            }
         }
         else if(sourceEvent == star){
            typed="";
         }
         else if(sourceEvent == letterEnter){
            typed+="\n";
         }
         else if(sourceEvent == space){
            typed+=" ";
         }
         else if(sourceEvent == letterTab){
            typed+="   ";
         }
         else if(sourceEvent == letterCapLock){
            if(isLocked){
               isLocked = false;
            }
            else{
               isLocked = true;
            }
         }
         else if(sourceEvent == letterShiftWro){
            isShifted = true;
         }
         else if(sourceEvent == gucci){
         try{
               clipNameAIS = AudioSystem.getAudioInputStream(getClass().getResourceAsStream("GucciGang.wav"));
               clipNameClip = AudioSystem.getClip();
               clipNameClip.open(clipNameAIS);
            }catch(Exception e){System.out.println("Failure to load sound");}
            //Action where .wav is played
            clipNameClip.setFramePosition(0);
            clipNameClip.start();

         }
         else{
            if(isLocked && isShifted){
               typed+=sourceEvent.getText().toLowerCase();
               isShifted = false;
            }
            else if(isLocked || isShifted){
               typed+=sourceEvent.getText();
               isShifted = false;
            }
            else{
               typed+=sourceEvent.getText().toLowerCase();
            }
         }
         output.setText(typed);

         
         return;
   }
   public static void main(String[] args) {
      // Creates SalaryLabelFrame and its components
      FINAL myFrame = new FINAL();
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.getContentPane().setBackground(Color.PINK);
      myFrame.pack();
      myFrame.setVisible(true);

      return;
   }


}