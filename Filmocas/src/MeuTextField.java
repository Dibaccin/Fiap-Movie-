import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
 
public class MeuTextField extends JTextField {
 
    private static final long serialVersionUID = 1L;
  
    public MeuTextField() {
        super();
        init();
    }
 
    private void init() {
        this.setPreferredSize(new Dimension(100,50));
        this.setBackground(Color.WHITE);
        this.setForeground(new Color(50,50,50));
        this.setBorder(new LineBorder(new Color(26,108,163)));

    }
 
}