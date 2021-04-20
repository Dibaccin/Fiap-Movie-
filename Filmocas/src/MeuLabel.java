import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MeuLabel extends JLabel{

	private int size = 16;
	private Color cor = new Color(0, 0, 0);
	
	public MeuLabel(String texto) {
		super(texto);
		init();		
	}
	
	
	public MeuLabel(String texto, Color cor) {
		super(texto);
		this.cor = cor;
		init();
		
	}
	
	private void init() {
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setForeground(cor);
		this.setFont(new Font(null, Font.BOLD, size));
	}
	
}
