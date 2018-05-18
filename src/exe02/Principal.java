package exe02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//instanciar o JFrame
		JFrame layout = new JFrame("Desconto");
		layout.setVisible(true);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setSize(400, 300);
		layout.setLocationRelativeTo(null);
		layout.setLayout(null);
		
		//Instanciar Label
		JLabel produto = new JLabel("Informe o valor pago pelo produto");
		produto.setBounds(10, 10, 200, 20);
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(210, 10, 120, 20);
		
		//JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(120, 100, 150, 20);
		
		//Adicionar ação para o botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Fazer o cálculo
				double preco = Double.parseDouble( campo.getText());
				
				double desconto = preco * 0.90;
						
				//Exibir o resultado
				JOptionPane.showMessageDialog(null, "O valor final é "+String.format("%.2f",desconto));
				
				//Limpar o campo
				campo.setText("");
				
			}
		});
		
		//Adicionar elementos ao JFrame
		layout.add(produto);
		layout.add(campo);
		layout.add(botao);
		
		//Exibir layout
		layout.repaint();
		layout.setVisible(true);

	}

}
