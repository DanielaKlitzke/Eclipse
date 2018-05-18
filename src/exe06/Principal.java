package exe06;

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
		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 200);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//Instancair Label
		JLabel numero1 = new JLabel("Informe o primeiro número");
		numero1.setBounds(10, 10, 200, 20);
		
		JLabel numero2 = new JLabel("Informe o segundo número");
		numero2.setBounds(10, 30, 200, 20);
		
		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(210, 10, 50, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(210, 30, 50, 20);
		
		//JButton
		JButton botao = new JButton("Clique Aqui");
		botao.setBounds(100, 100, 100, 20);
		
		//Adicionar ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(campo1.getText());
				int n2 = Integer.parseInt(campo2.getText());
				int resultado;
				
				if (n1 == n2) {
					resultado = n1+n2;
					JOptionPane.showMessageDialog(null,""+n1+" + "+n2+" = "+resultado );
				}else{
					resultado = n1*n2;
					JOptionPane.showMessageDialog(null,""+n1+" * "+n2+" = "+resultado );
				}
				
				//Limpar campo
				campo1.setText("");
				campo2.setText("");
				
				//Auto focus
				campo1.requestFocus();
				
			}
		});
		
		//Adicionar elementos ao JFrame
		formulario.add(numero1);
		formulario.add(numero2);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(botao);
		
		//Exibir formulario
		formulario.repaint();
		formulario.setVisible(true);
		

	}

}
