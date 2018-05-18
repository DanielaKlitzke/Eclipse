package exe09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//JFrame
		JFrame menor = new JFrame("O menor número");
		menor.setSize(300, 200);
		menor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menor.setLocationRelativeTo(null);
		menor.setLayout(null);
		
		//JLabel
		JLabel numero1 = new JLabel("Informe o primeiro número");
		numero1.setBounds(10, 10, 200, 20);
		
		JLabel numero2 = new JLabel("Informe o segundo número");
		numero2.setBounds(10, 30, 200, 20);
		
		JLabel numero3 = new JLabel("Informe o terceiro número");
		numero3.setBounds(10, 50, 200, 20);
		
		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(210, 10, 50, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(210, 30, 50, 20);
		
		JTextField campo3 = new JTextField();
		campo3.setBounds(210, 50, 50, 20);
		
		//Button
		JButton botao = new JButton("Clique Aqui!");
		botao.setBounds(100, 100,	150, 20);
		
		//Ação Button
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(campo1.getText());
				int n2 = Integer.parseInt(campo2.getText());
				int n3 = Integer.parseInt(campo3.getText());
			
				if ((n1 < n2) && (n1 < n3)) {
					JOptionPane.showMessageDialog(null, "O menor número é "+n1);
				}else if ((n2 < n1) && (n2 < n3)) {
					JOptionPane.showMessageDialog(null, "O menor número é "+n2);
				}else if((n3 < n2) && (n3 < n1)){
					JOptionPane.showMessageDialog(null, "O menor número é "+n3);
				}else{
					JOptionPane.showMessageDialog(null, "Há números repetidos");
				}
				
				campo1.setText("");
				campo2.setText("");
				campo3.setText("");
				
				campo1.requestFocus();
			}
		});
		
		//Adicionar elementos ao JFrame
		menor.add(numero1);
		menor.add(numero2);
		menor.add(numero3);
		menor.add(campo1);
		menor.add(campo2);
		menor.add(campo3);
		menor.add(botao);
		
		//Exibir tela
		menor.repaint();
		menor.setVisible(true);

	}

}
