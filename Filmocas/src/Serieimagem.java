import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;



import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Serieimagem extends JLabel {


private static final long serialVersionUID = 1L;



public Serieimagem(ImageIcon imageIcon) {
super(imageIcon);
init();
}


private void init() {
this.setHorizontalAlignment(JLabel.CENTER);
this.setPreferredSize(new Dimension(200, 200));

	}

}