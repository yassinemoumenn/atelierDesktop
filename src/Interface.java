import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;


public class Interface extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public Interface() {
	super("Le saviez-vous");
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setSize(600, 400 );
	this.setLocationRelativeTo(null);
	
	JPanel contentPane = (JPanel) this.getContentPane();
	contentPane.setLayout(null);
	JLabel label = new JLabel("Le saviez-vous?");
	label.setBounds(8,10,350,110);	
	contentPane.add(label);
	JButton btnMonter = new JButton("Montrer un autre fait");
	btnMonter.setBounds(180,300,200,50);
	btnMonter.addActionListener(this);
	contentPane.add(btnMonter);
}
	public static void main(String[] args) throws Exception {
		
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

		Interface Interface = new Interface();
		Interface.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		JOptionPane.showInternalMessageDialog(null, "hello");
		ArrayList<String> quotes = new ArrayList<>();
        quotes.add("La bière ne fait pas prendre du ventre!!");
        quotes.add("Etre amoureux vous rendre fainéant");
		
	}

} 
