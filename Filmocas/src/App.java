import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



public class App {
	public static void main(String[] args) {	


/* Frame */	
		
		JFrame frame = new JFrame("Fiap Movies");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);
			
/* Painel */

		// Cadastro
		
		JPanel panel = new JPanel();	
		panel.setLayout(new BorderLayout(20,0));
		
		//imagem da esquerda
		
		JPanel panelimagem = new JPanel();	
			
		// Caracteristicas
		
		JPanel panelcaracteristicas = new JPanel(new GridLayout(0,1));	
		
		// Referencias
		
		JPanel panelreferencias = new JPanel(new GridLayout(0,1));
		panelreferencias.setPreferredSize(new Dimension(130,400));
		
		//botoes
		
		JPanel panelbotoes = new JPanel();
		
		// distruibui os paineis nos lugares 
		
		panel.add(panelimagem, BorderLayout.WEST);
		panel.add(panelcaracteristicas, BorderLayout.CENTER);
		panel.add(panelreferencias, BorderLayout.EAST);
		panel.add(panelbotoes, BorderLayout.SOUTH);
		
// traz a imagem da esquerida
		
		panelimagem.add(new Serieimagem(new ImageIcon("C:\\Users\\bacci\\eclipse-workspace\\Filmocas\\Imagens\\BaBr.jpg")));	
		
/* Label e Text Field */
						
		panelcaracteristicas.add(new MeuLabel("Titulo"));
		panelcaracteristicas.add(new MeuTextField());	
		
		panelcaracteristicas.add(new MeuLabel("Sinopse"));
		panelcaracteristicas.add(new MeuTextField());
		
			
/* Combo Box */			

		panelcaracteristicas.add(new MeuLabel("Genero"));
		String[] genero = {"Suspense", "Ação", "Aventura"};
		panelcaracteristicas.add(new JComboBox<String>(genero));		

/* Radio Group */		
		
		panelreferencias.add(new MeuLabel("Onde assistir?"));	
		List<String> listaDeOpcoes = List.of("Netflix", "Prime Video", "Disney+");
		MeuRadioGroup group = new MeuRadioGroup(listaDeOpcoes);
		panelreferencias.add(group);
				

/* Check Box */		
					
		panelreferencias.add(new MeuCheckBox("Assistido"));
				
/* Star Rate */			
		
		panelreferencias.add(new MeuLabel("Avaliações"));
		panelreferencias.add(new StarRater());
		
/* Butões */
		
		JButton salvar = new JButton("Salvar");
		panelbotoes.add(salvar);
		
		JButton cancelar = new JButton("Cancelar");
		panelbotoes.add(cancelar);
		
/* Tabbed Pane */	
		
		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", panel);
		abas.add("Lista", new JPanel());
		
		frame.add(abas);
		
		frame.setVisible(true);			
		
	}	
}


