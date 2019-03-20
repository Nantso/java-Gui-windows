

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Fenetre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre();
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
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOuvrirCalculatrice = new JButton("Ouvrir  Word2016");
		btnOuvrirCalculatrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Runtime r = Runtime.getRuntime();
				try {
					String[] command ={"C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\WINWORD.EXE"}; //mettre dans un tableau le chemin de microsoft word
					r.exec(command); //executer la commande
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnOuvrirCalculatrice.setBounds(128, 74, 153, 34);
		contentPane.add(btnOuvrirCalculatrice);
		
		JButton btnOuvrirReboot = new JButton("Redemarrer le systeme");
		btnOuvrirReboot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Runtime r = Runtime.getRuntime();
				try {
					r.exec("Shutdown -r -t 10");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnOuvrirReboot.setBounds(128, 123, 153, 34);
		contentPane.add(btnOuvrirReboot);
		
		JButton btnOuvrirRestart = new JButton("Eteindre le systeme");
		btnOuvrirRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Runtime r = Runtime.getRuntime();
				try {
					r.exec("Shutdown -s -t 10");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnOuvrirRestart.setBounds(128, 170, 153, 34);
		contentPane.add(btnOuvrirRestart);
		
		JButton btnNewButton = new JButton("Poste de travail");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Runtime r = Runtime.getRuntime();
				try {
					String[] command ={"C:\\Windows\\explorer.exe"}; //mettre dans un tableau le chemin de microsoft word
					r.exec(command); //executer la commande
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(128, 29, 153, 34);
		contentPane.add(btnNewButton);
	}
}
