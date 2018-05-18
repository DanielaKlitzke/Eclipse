package exe04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		// Instanciar JFrame
		JFrame formulario = new JFrame("Desconto para produtos");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 400);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		// Instanciar Label
		JLabel nomeProduto = new JLabel("Informe o nome do produto");
		nomeProduto.setBounds(10, 10, 250, 20);

		JLabel valor = new JLabel("Informe o valor do produto");
		valor.setBounds(10, 30, 250, 20);

		// JTextField
		JTextField campoProduto = new JTextField();
		campoProduto.setBounds(260, 10, 100, 20);

		JTextField campoValor = new JTextField();
		campoValor.setBounds(260, 30, 100, 20);

		// RadioButton
		JRadioButton vista = new JRadioButton("À vista");
		vista.setBounds(10, 200, 100, 20);

		JRadioButton prazo = new JRadioButton("À prazo");
		prazo.setBounds(110, 200, 100, 20);

		// JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(120, 250, 150, 20);

		// Adicionar ação ao botão
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double valor = Double.parseDouble(campoValor.getText());
				double desconto = (valor * 0.90);

				if ((valor >= 500) && (vista.isSelected())) {
					JOptionPane.showMessageDialog(null,"O produto " + campoProduto + " custará " + String.format("%.2f", desconto) + ".");
				} else {
					JOptionPane.showMessageDialog(null,"O Produto " + campoProduto + " custará " + valor + " sem desconto.");
				}

				// Limpar o campo
				campoProduto.setText("");
				campoValor.setText("");

				// Auto focus
				campoProduto.requestFocus();
			}
		});

		// Adicionar elementos ao JFrame
		formulario.repaint();
		formulario.add(nomeProduto);
		formulario.add(campoValor);
		formulario.add(vista);
		formulario.add(prazo);
		formulario.add(campoProduto);
		formulario.add(botao);
		formulario.add(valor);
		
		
		formulario.setVisible(true);
		
	}

}
