package exe01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		//Instanciar o JFrame
		JFrame perguntas = new JFrame();
		perguntas.setVisible(true);
		perguntas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		perguntas.setSize(500,  300);
		perguntas.setLocationRelativeTo(null);
		perguntas.setTitle("Perguntas");
		perguntas.setLayout(null);
		
		//Instanciar Label
		JLabel nome = new JLabel();
		nome.setText("Informe o seu nome");
		nome.setBounds(10, 10, 120, 20);
		
		JLabel idade = new JLabel();
		idade.setText("Informe a sua idade");
		idade.setBounds(10, 30, 120, 20);
		
		JLabel cidade = new JLabel();
		cidade.setText("Em qual cidade você mora?");
		cidade.setBounds(10, 50, 250, 20);
		
		
		//JTextFild
		JTextField campoa = new JTextField();
		campoa.setBounds(140, 10, 150, 20);
		
		JTextField campob = new JTextField();
		campob.setBounds(140, 30, 150, 20);
		
		JTextField campoc = new JTextField();
		campoc.setBounds(180, 50, 150, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(60, 100, 150, 20);
		
		//Adicionar uma ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Exibir o texto
				JOptionPane.showMessageDialog(null, "Olá "+campoa.getText()+", você tem "+campob.getText()+" anos de idade e mora em "+campoc.getText());
				
				//Limpar o campo contendo o nome idade e cidade
				campoa.setText("");
				campob.setText("");
				campoc.setText("");
				
				//Selecionar o campo nome
				campoa.requestFocus();
				
			}
		});
		
		//adicionar elementos ao JFrame
		perguntas.add(nome);
		perguntas.add(idade);
		perguntas.add(cidade);
		perguntas.add(campoa);
		perguntas.add(campob);
		perguntas.add(campoc);
		perguntas.add(botao);
		
		//Exibir formulário
		perguntas.repaint();
		perguntas.setVisible(true);
		

	}

}
