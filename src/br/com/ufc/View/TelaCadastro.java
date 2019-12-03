package br.com.ufc.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.ufc.testepoo.Acervo;
import br.com.ufc.testepoo.Livro;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 623, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloDoLivro = new JLabel("Titulo do livro ");
		lblTituloDoLivro.setBounds(30, 74, 149, 15);
		contentPane.add(lblTituloDoLivro);
		
		textField = new JTextField();
		textField.setBounds(30, 91, 215, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Autor ");
		lblNewLabel.setBounds(30, 135, 66, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblDescrio = new JLabel("descrição");
		lblDescrio.setBounds(30, 283, 66, 15);
		contentPane.add(lblDescrio);
		
		JLabel lblIsbn = new JLabel("Isbn");
		lblIsbn.setBounds(30, 205, 66, 15);
		contentPane.add(lblIsbn);
		
		textField_1 = new JTextField();
		textField_1.setBounds(30, 162, 215, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(30, 310, 347, 53);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(30, 233, 215, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar livro ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Livro livro =new Livro(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText());
			Acervo acervo = new Acervo();
			Acervo.setAcervos(livro);
			
			
			
			
				JOptionPane.showMessageDialog(contentPane, "Livro Cadastrado com sucesso");
			}
		});
		btnNewButton.setBounds(372, 88, 193, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaBibliotecaria tela = new TelaBibliotecaria();
				tela.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(372, 159, 193, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblTelaDeCadastro = new JLabel("TELA DE CADASTRO");
		lblTelaDeCadastro.setBounds(211, 23, 217, 15);
		contentPane.add(lblTelaDeCadastro);
	}
}
