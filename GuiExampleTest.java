import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class GuiExampleTest extends JFrame { 
    JButton jbutton = new JButton("Start"); 

    public GuiExampleTest() { 
        String[] p = null;
        setLayout(null); 
        jbutton.setBounds(0, 0, 200, 200); 
        jbutton.setFocusable(true); 
        add(jbutton); 
        jbutton.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent epa) { 
                    fgh.main(p);
                } 
  }); 
  jbutton.setToolTipText("Press to Start the Epic Game");
        jbutton.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        jbutton.setBackground(Color.BLUE);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        jbutton.setBackground(UIManager.getColor("control"));
    }
});
    } 

    public static void main(String[] args) { 
        GuiExampleTest sl = new GuiExampleTest(); 
        sl.setSize(300, 300); 
        sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        sl.setVisible(true); 
    } 
    
} 

