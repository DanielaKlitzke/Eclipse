package exe08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar JFrame
		JFrame calculadora = new JFrame("Calculadora");
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadora.setSize(400, 300);
		calculadora.setLocationRelativeTo(null);
		calculadora.setLayout(null);
		
		//Instanciar Label
		JLabel numero1 = new JLabel("Digite o primeiro número");
		numero1.setBounds(10, 10, 150, 20);
		
		JLabel numero2 = new JLabel("Digite o segundo número");
		numero2.setBounds(10, 30, 150, 20);
		
		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(160, 10, 50, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(160, 30, 50, 20);
		
		//RadioButton
		JRadioButton soma = new JRadioButton("Soma");
		soma.setBounds(10, 50, 100, 20);
		
		JRadioButton subtracao = new JRadioButton("Subtração");
		subtracao.setBounds(10, 70, 100, 20);
		
		JRadioButton divisao = new JRadioButton("Divisão");
		divisao.setBounds(10, 90, 100, 20);
		
		JRadioButton multiplicacao = new JRadioButton("Multiplicação");
		multiplicacao.setBounds(10, 110, 100, 20);
		
		//ButtonGroup
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(soma);
		grupo.add(subtracao);
		grupo.add(divisao);
		grupo.add(multiplicacao);
		
		
		//Button
		JButton botao = new JButton("Clique Aqui");
		botao.setBounds(100, 150, 150, 20);
		
		//Adicionar uma ação para o botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double n1 = Double.parseDouble(campo1.getText());
				double n2 = Double.parseDouble(campo2.getText());
				double resultado;
				
				if (soma.isSelected()) {
					resultado = n1+n2;
				}else if (subtracao.isSelected()) {
					resultado = n1-n2;
				}else if (divisao.isSelected()) {
					resultado = n1/n2;
				}else {
					resultado = n1*n2;
				}
				
				JOptionPane.showMessageDialog(null, "O resultado é "+String.format("%.2f",resultado));
				
				campo1.setText("");
				campo2.setText("");
				
				campo1.requestFocus();
				
			}
		});
		
		//Adicionar elementos ao JFrame
		calculadora.add(numero1);
		calculadora.add(numero2);
		calculadora.add(campo1);
		calculadora.add(campo2);
		calculadora.add(soma);
		calculadora.add(subtracao);
		calculadora.add(multiplicacao);
		calculadora.add(divisao);
		calculadora.add(botao);
		
		//Exibir calculadora
		calculadora.repaint();
		calculadora.setVisible(true);
		
	}

}
