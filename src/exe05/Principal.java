package exe05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar JFrame
		JFrame ano = new JFrame("Ano");
		ano.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ano.setSize(400, 200);
		ano.setLocationRelativeTo(null);
		ano.setLayout(null);
		
		//Instanciar Label
		JLabel obterAno = new JLabel("Digite um dia do mês de fevereiro de 2018");
		obterAno.setBounds(10, 10, 250, 20);
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(260, 10, 50, 20);
		
		//JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(120, 100, 150, 20);
		
		//Adicionar ação para o botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int escolha = Integer.parseInt(campo.getText());
				
				if ((escolha == 3)||(escolha == 4)||(escolha == 10)||(escolha == 11)||(escolha == 17)||(escolha == 18)||(escolha == 24)||(escolha == 25)) {
					JOptionPane.showMessageDialog(null, "Final de semana!");
				}else if ((escolha < 1)||(escolha > 28)) {
					JOptionPane.showMessageDialog(null, "Inválido! Escolha um dia entre 1 e 28");
				}else {
					JOptionPane.showMessageDialog(null, "Dia de semana!");
				}
				
				//Limpar campo
				campo.setText("");
				
				//Auto focus
				campo.requestFocus();
			}
		});
		
		//Adicionar elementos ao JFrame
		ano.add(obterAno);
		ano.add(campo);
		ano.add(botao);
		
		//Exibir ano
		ano.repaint();
		ano.setVisible(true);
		

	}

}
