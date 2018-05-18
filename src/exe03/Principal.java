package exe03;

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
		JFrame formulario = new JFrame("Situação do aluno");
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(400, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//Instanciar Label
		JLabel nota1 = new JLabel("Infrome a primeira nota");
		nota1.setBounds(10, 10, 150, 20);
		
		JLabel nota2 = new JLabel("Informe a segunda nota");
		nota2.setBounds(10, 30, 150, 20);
		
		JLabel nota3 = new JLabel("Informe a terceira nota");
		nota3.setBounds(10, 50, 150, 20);
		
		JLabel nota4 = new JLabel("Informe a quarta nota");
		nota4.setBounds(10, 70, 150, 20);
		
		//JTextField
		JTextField campoa = new JTextField();
		campoa.setBounds(200, 10, 120, 20);
		
		JTextField campob = new JTextField();
		campob.setBounds(200, 30, 120, 20);
		
		JTextField campoc = new JTextField();
		campoc.setBounds(200, 50, 120, 20);
		
		JTextField campod = new JTextField();
		campod.setBounds(200, 70, 120, 20);
		
		//Button
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(120, 150, 150, 20);
		
		//Adicionar ação para o botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double nota1 = Double.parseDouble(campoa.getText());
				double nota2 = Double.parseDouble(campob.getText());
				double nota3 = Double.parseDouble(campoc.getText());
				double nota4 = Double.parseDouble(campod.getText());
				
				double media = (nota1+nota2+nota3+nota4)/4;
				
				if (media >= 7 && media <= 10) {
					JOptionPane.showMessageDialog(null, "A média é "+String.format("%.2f", media)+"\nAprovado");
				}else if (media >= 5 && media <7) {
					JOptionPane.showMessageDialog(null, "A média é "+String.format("%.2f", media)+"\nEm Exame");
				}else{
					JOptionPane.showMessageDialog(null, "A média é "+String.format("%.2f", media)+"\nReprovado");
				}
				
				//Limpar o campo
				campoa.setText("");
				campob.setText("");
				campoc.setText("");
				campod.setText("");
				
				//Auto focus
				campoa.requestFocus();
				
			}
		});
		
		//Adicionar elementos ao JFrame
		formulario.add(nota1);
		formulario.add(nota2);
		formulario.add(nota3);
		formulario.add(nota4);
		formulario.add(campoa);
		formulario.add(campob);
		formulario.add(campoc);
		formulario.add(campod);
		formulario.add(botao);
		
		//Exibir resultados
		formulario.repaint();
		formulario.setVisible(true);
		
	}	
}
