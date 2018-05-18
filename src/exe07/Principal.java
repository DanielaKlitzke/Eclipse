package exe07;

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
		JFrame tabela = new JFrame("Tabela");
		tabela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabela.setSize(300, 200);
		tabela.setLocationRelativeTo(null);
		tabela.setLayout(null);
		
		//Instanciar Label
		JLabel numero = new JLabel("Informe um número");
		numero.setBounds(10, 10, 150, 20);
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(160, 10, 50, 20);
		
		//Button
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(50, 100, 150, 20);
		
		//Adicionar uma ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int n = Integer.parseInt(campo.getText());
				int resultado;
				
				String texto = "***Tabuada***\n\n";
	
				for(int i=0; i<11; i++){
					resultado = n*i;
					texto += ""+n+" X "+i+" = "+resultado+"\n";
				}
				JOptionPane.showMessageDialog(null, texto);
				
				//Limpar campo
				campo.setText("");
				
				//Auto focus
				campo.requestFocus();
				
			}
		});
		
		//Adicionar elementos ao JFrame
		tabela.add(numero);
		tabela.add(campo);
		tabela.add(botao);
		
		//Exibir a tabela
		tabela.repaint();
		tabela.setVisible(true);
	}

}
