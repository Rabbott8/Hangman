
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *This class creates all the buttons and has the paint method that draws the hangman
 * @author rabbott8
 * @author vthanig8
 * @author dtarson8
 * @author akunche8
 * 
 * 
 */ 
public class NewJFrame extends JFrame {
    private String str1 = "";
    private int tC = 0;
    private int x =150;
    private int y = 0;
    private int z=150;
    private int a = 200;
    private int b = 360;
    private ArrayList<String> checker = new ArrayList<String>();
    private boolean check = true;
    private static int num = 0;
    private static SecretWord thiarr = null;
    private static ArrayList<Integer> guy = new ArrayList<Integer>();
    private String str2 = "doge";
    private String name =System.getProperty("user.name");
    private String ios9 = System.getProperty("os.name");
    private int ctr  = 1001;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();

    }
    /**
     * Paint method for applet.
     * 
     * Creates the Introduction of the JFrame
     * 
     */
    public void paint(Graphics g)
    {
        g.setFont(new Font("TimesNewRoman", Font.BOLD, 10));

        g.drawString("Made by Vikram, Ryan, Dylan, and Allen", 0,50);
        g.drawString(name +"-" + ios9, 250, 50);
        g.setColor(Color.RED);

        g.setFont(new Font("Impact", Font.BOLD, 20));
        g.drawString("Hover Over The Letters To See Which Has Been Clicked" ,250,100);

        /**
         * Creates the Hangman
         */
        if(guy==null && check)
        {tC++;}

        if (tC==0){g.setColor(Color.blue);
            g.fillRect(50,300,55,10);
            g.fillRect(75,70,5,232);
            g.fillRect(75,70,75,5);
            g.fillRect(125,70,5,50);}

        g.setColor(Color.red);

        //Head
        if(tC == 1 && check)
        {g.fillOval(100,100,50,50);
        }

        //Body
        if(tC == 2 && check){
            g.fillRect(125,125,3,100);}

        //arms
        if(tC == 3 && check){
            g.drawLine(125,175,160,150);}
        if(tC == 4 && check){
            g.drawLine(125,175,90,150);}

        //Legs
        if(tC == 5 && check){
            g.drawLine(126,223,90,250);}
        if(tC == 6 && check){
            g.drawLine(126,223,160,250);}

        if(tC==7 && check){
            //Eyes
            g.setColor(Color.black);
            g.drawLine(110,115,120,125);
            g.drawLine(120,115,110,125);
            g.drawLine(130,115,140,125);
            g.drawLine(140,115,130,125);

            //Mouth
            g.drawArc(110,135,30,12,0,180);
            g.setFont(new Font("Impact", Font.BOLD, 40));
            g.drawString("You Lose!", 250,250);
        }

        //string

        g.setFont(new Font("TimesNewRoman", Font.BOLD, 30));

        //x+=40;
        //if (x>=700)
        // {
        //   x=190;
        //   z+=50;
        //   }
        int c = num;
        //num = 5;
        while(num>0){
            g.setColor(Color.BLACK);
            g.drawLine(a,b,a+50,b);
            int n = 0;

            if (guy!= null)
            {
                for (int y = 0;y<guy.size();y++){
                    int e = guy.get(y);
                    if(e>6){
                        e-=7;
                    }
                    g.drawString(str1,220+(70*(e)),360+((guy.get(y)/7)*50));}
            }
            a+=70;

            if (a>=690)
            {
                a = 200;
                b = 410;

            }
            num--;
            n++;

        }
        a = 200;
        b = 360;
        num = c;
        check = true;
        y = 0;
    }

    /**
    * Creates 26 buttons
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        guy.add(0);

        jButton1 = new JButton();
        jPanel1 = new JPanel();
        jPanel1.setPreferredSize(new Dimension(700,300));
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton2 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        jButton18 = new JButton();
        jButton19 = new JButton();
        jButton20 = new JButton();
        jButton21 = new JButton();
        jButton22 = new JButton();
        jButton23 = new JButton();
        jButton25 = new JButton();
        jButton26 = new JButton();
        jButton24 = new JButton();
        jButton17 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jButton1.setText("A");
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jButton1.setToolTipText("You have Used this Letter");
                    buttonAction("a");
                }
            });
        jButton3.setText("B");
        jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jButton3.setToolTipText("You have Used this Letter");
                    buttonAction("b");
                }
            });

        jButton4.setText("C");
        jButton4.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton4.setToolTipText("You have Used this Letter");
                    buttonAction("c");
                }
            });
        jButton5.setText("G");
        jButton5.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton5.setToolTipText("You have Used this Letter");
                    buttonAction("g");
                }
            });
        jButton6.setText("F");
        jButton6.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton6.setToolTipText("You have Used this Letter");
                    buttonAction("f");
                }
            });
        jButton7.setText("E");
        jButton7.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton7.setToolTipText("You have Used this Letter");
                    buttonAction("e");
                }
            });
        jButton2.setText("D");
        jButton2.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton2.setToolTipText("You have Used this Letter");
                    buttonAction("d");
                }
            });

        jButton8.setText("H");
        jButton8.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton8.setToolTipText("You have Used this Letter");
                    buttonAction("h");

                }
            });
        jButton9.setText("I");
        jButton9.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton9.setToolTipText("You have Used this Letter");
                    buttonAction("i");
                }
            });
        jButton10.setText("J");
        jButton10.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton10.setToolTipText("You have Used this Letter");
                    buttonAction("j");
                }
            });

        jButton11.setText("K");
        jButton11.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton11.setToolTipText("You have Used this Letter");
                    buttonAction("k");
                }
            });

        jButton12.setText("L");
        jButton12.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton12.setToolTipText("You have Used this Letter");
                    buttonAction("l");
                }
            });

        jButton13.setText("M");
        jButton13.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton13.setToolTipText("You have Used this Letter");
                    buttonAction("m");
                }
            });

        jButton14.setText("N");
        jButton14.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton14.setToolTipText("You have Used this Letter");
                    buttonAction("n");
                }
            });

        jButton15.setText("W");
        jButton15.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton15.setToolTipText("You have Used this Letter");
                    buttonAction("w");
                }
            });

        jButton16.setText("R");
        jButton16.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton16.setToolTipText("You have Used this Letter");
                    buttonAction("r");
                }
            });
        jButton18.setText("O");
        jButton18.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton18.setToolTipText("You have Used this Letter");
                    buttonAction("o");
                }
            });
        jButton19.setText("P");
        jButton19.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton19.setToolTipText("You have Used this Letter");
                    buttonAction("p");
                }
            });
        jButton20.setText("X");
        jButton20.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton20.setToolTipText("You have Used this Letter");
                    buttonAction("x");
                }
            });
        jButton21.setText("Z");
        jButton21.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton21.setToolTipText("You have Used this Letter");
                    buttonAction("z");
                }
            });
        jButton22.setText("Y");
        jButton22.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton22.setToolTipText("You have Used this Letter");
                    buttonAction("y");
                }
            });
        jButton23.setText("Q");
        jButton23.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton23.setToolTipText("You have Used this Letter");
                    buttonAction("q");
                }
            });
        jButton25.setText("V");
        jButton25.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton25.setToolTipText("You have Used this Letter");
                    buttonAction("v");
                }
            });
        jButton26.setText("U");
        jButton26.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton26.setToolTipText("You have Used this Letter");
                    buttonAction("u");
                }
            });
        jButton24.setText("S");
        jButton24.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton24.setToolTipText("You have Used this Letter");
                    buttonAction("s");
                }
            });
        jButton17.setText("T");
        jButton17.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    jButton17.setToolTipText("You have Used this Letter");
                    buttonAction("t");

                }
            });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton16)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton26)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton21))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton10)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton19)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton7)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton19)
                    .addComponent(jButton18)
                    .addComponent(jButton23))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton20)
                    .addComponent(jButton15)
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jButton17)
                    .addComponent(jButton24)
                    .addComponent(jButton16))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>                        
    /**
     * Actions for all the buttons here
     */
    public static void numSpaces(int i)
    {
        num = i;
    }

    public static void setArray(SecretWord p)
    {
        thiarr = p;
    }

    public String buttonAction(String str){
        str1 = str;
        guy = thiarr.isLetter(str);
        check = true;
        if (tC == 0)
            repaint();

        for (int i = 0; i<checker.size();i++)
        {
            if (checker.get(i).equals(str1))
                check = false;
        }
        repaint();
        checker.add(str);
        //check = true;

        return str;
    }

    public String getString(){
        return str1;
    }

    // Variables declaration - do not modify                     
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton2;
    private JButton jButton20;
    private JButton jButton21;
    private JButton jButton22;
    private JButton jButton23;
    private JButton jButton24;
    private JButton jButton25;
    private JButton jButton26;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JPanel jPanel1;

    // End of variables declaration                   
}
