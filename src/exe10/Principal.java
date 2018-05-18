package exe10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		JFrame cofre = new JFrame("Cofre");
		cofre.setSize(500, 400);
		cofre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cofre.setLocationRelativeTo(null);
		cofre.setLayout(null);
		
		JLabel um = new JLabel("00,01");
		um.setBounds(10, 10, 50, 20);
		
		JLabel cinco = new JLabel("00,05");
		cinco.setBounds(10, 30, 50, 20);
		
		JLabel dez = new JLabel("00,10");
		dez.setBounds(10, 50, 50, 20);
		
		JLabel vinteCinco = new JLabel("00,25");
		vinteCinco.setBounds(10, 70, 50, 20);
		
		JLabel cinquenta = new JLabel("00,50");
		cinquenta.setBounds(10, 90,	50, 20);
		
		JLabel umReal = new JLabel("01,00");
		umReal.setBounds(10, 110, 50, 20);
		
		JTextField campo1 = new JTextField();
		campo1.setBounds(80, 10, 50, 20);
		
		JTextField campo5 = new JTextField();
		campo5.setBounds(80, 30, 50, 20);
		
		JTextField campo10 = new JTextField();
		campo10.setBounds(80, 50, 50, 20);
		
		JTextField campo25= new JTextField();
		campo25.setBounds(80, 70, 50, 20);
		
		JTextField campo50 = new JTextField();
		campo50.setBounds(80, 90, 50, 20);
		
		JTextField campo1R = new JTextField();
		campo1R.setBounds(80, 110, 50, 20);

		JButton botao = new JButton("Clique Aqui para somar!");
		botao.setBounds(100, 200, 200, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double m1 = Double.parseDouble(campo1.getText());
				double m5 = Double.parseDouble(campo5.getText());
				double m10 = Double.parseDouble(campo10.getText());
				double m25 = Double.parseDouble(campo25.getText());
				double m50 = Double.parseDouble(campo50.getText());
				double m1R = Double.parseDouble(campo1R.getText());
				
				double um, cinco, dez;
				
				
				JOptionPane.showMessageDialog(null, "00,01 X "+m1+" = "+String.format("%.2f", m1*0.01)
						+"\n00,05 X "+m5+" = "+String.format("%.2f", m5*0.05)
						+"\n00,10 X "+m10+" = "+String.format("%.2f", m10*0.10)
						+"\n00,25 X "+m25+" = "+String.format("%.2f", m25*0.25)
						+"\n00,50 X "+m50+" = "+String.format("%.2f", m50*0.50)
						+"\n01,00 X "+m1R+" = "+String.format("%.2f", m1R*1.0)+"\nO total é ");
				
				campo1.setText("");
				campo5.setText("");
				campo10.setText("");
				campo25.setText("");
				campo50.setText("");
				campo1R.setText("");
				
				campo1.requestFocus();
					
			}
		});
		
		cofre.add(um);
		cofre.add(cinco);
		cofre.add(dez);
		cofre.add(vinteCinco);
		cofre.add(cinquenta);
		cofre.add(umReal);
		cofre.add(campo1);
		cofre.add(campo5);
		cofre.add(campo10);
		cofre.add(campo25);
		cofre.add(campo50);
		cofre.add(campo1R);
		cofre.add(botao);
		
		cofre.repaint();
		cofre.setVisible(true);
		
		
		
		
		
		
	}

}
