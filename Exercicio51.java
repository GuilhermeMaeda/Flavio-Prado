import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Exercicio51 {

	public static void main(String[] args) {
		
		
		JFrame janela = new JFrame("Cadastro de Usu�rio.");
		JLabel capa = new JLabel("Para cadastrar os cliente clique em Iniciar!");
		capa.setHorizontalAlignment(SwingConstants.CENTER);
		capa.setVisible(true);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(800, 600);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.getContentPane().setBackground(Color.white);
		janela.add(capa);
		//janela.setResizable(false);
		
		JButton bot�o = new JButton("Iniciar");
		bot�o.setSize(100, 50);
		bot�o.setLocation(300, 400);
		bot�o.setVisible(true);
		janela.add(bot�o);
		
		JButton bot�o2 = new JButton("Sair");
		bot�o2.setSize(100, 50);
		bot�o2.setLocation(401, 400);
		bot�o2.setVisible(true);
		janela.add(bot�o2);
		
	}
}