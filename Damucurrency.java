//Currency Converter project is made with the help of SpringFrame.

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Damucurrency extends JFrame {
	private JTextField txtamount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Damucurrency frame = new Damucurrency();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Damucurrency() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 466);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Enter the currency");
		contentPane.add(lblNewLabel);
		
		txtamount = new JTextField();
		contentPane.add(txtamount);
		txtamount.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("FROM");
		contentPane.add(lblNewLabel_1);
		
		JComboBox txtfrom = new JComboBox();
		txtfrom.setModel(new DefaultComboBoxModel(new String[] {"USD"}));
		txtfrom.setSelectedIndex(0);
		txtfrom.setEditable(true);
		contentPane.add(txtfrom);
		
		JLabel lblNewLabel_2 = new JLabel("TO");
		contentPane.add(lblNewLabel_2);
		
		JComboBox txtto = new JComboBox();
		txtto.setEnabled(true);
		txtto.setEditable(true);
		txtto.setModel(new DefaultComboBoxModel(new String[] {"", "Indian Rupees", "Dinar Rupees"}));
		txtto.setSelectedIndex(0);
		contentPane.add(txtto);
		
		JButton btnNewButton = new JButton("CONVERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Double tot;
			Double amount =Double.parseDouble(txtamount.getText());
			if(txtfrom.getSelectedItem().toString()=="USD"&& txtto.getSelectedItem().toString()=="ndian Rupees") {
				
				tot=amount*81.64;
			//	JOptionPane.showInputDialog(this, e,"Your amount will be....."+tot.toString());
				JOptionPane.showInternalMessageDialog(this, "Your amount will be....."+tot.toString()));
			}
			
			
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.disabledShadow"));
		contentPane.add(btnNewButton);
	}

}
