package br.com.ufc.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.javafx.css.CascadingStyle;

import br.com.ufc.testepoo.Acervo;
import br.com.ufc.testepoo.CadastroDAO;
import br.com.ufc.testepoo.UsuarioSecao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCpf;
	private JTextField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 537, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTelaDeLogin = new JLabel("TELA DE LOGIN");
		lblTelaDeLogin.setBounds(158, 12, 138, 15);
		contentPane.add(lblTelaDeLogin);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(28, 59, 66, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SENHA");
		lblNewLabel_1.setBounds(28, 120, 66, 15);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Aluno");
		comboBox.addItem("Funcionario");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(28, 229, 169, 24);
		contentPane.add(comboBox);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(28, 86, 199, 19);
		contentPane.add(textFieldCpf);
		textFieldCpf.setColumns(10);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(28, 147, 199, 19);
		contentPane.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Selecione uma opcao");
		lblNewLabel_2.setBounds(28, 189, 199, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try{String comboBox1 = comboBox.getSelectedItem().toString();
				}catch(NullPointerException e) {
					JOptionPane.showMessageDialog(contentPane, "Escolha Uma Opcao");
				}
						
				
				if (comboBox.getSelectedItem() == "Funcionario" && textFieldCpf.getText().equals("admin") && textFieldSenha.getText().equals("admin")) {
					
						TelaBibliotecaria telab = new TelaBibliotecaria();
						telab.setVisible(true);
						setVisible(false);
						
						
					
				}if (comboBox.getSelectedItem() == "Funcionario" && textFieldCpf.getText().equals("") && textFieldSenha.getText().equals("")) {
					JOptionPane.showMessageDialog(contentPane, "login invalido");
				}
					
					
				if (comboBox.getSelectedItem() != "Funcionario") {
					for (int i =0; i < CadastroDAO.tamanho();i++){ 
						if(CadastroDAO.getAluno(i).getCpf().equals(textFieldCpf.getText())) {
							
							if(UsuarioSecao.alunosa.size()<0) {
								UsuarioSecao.alunosa.remove(0);
							}
							UsuarioSecao.alunosa.add(CadastroDAO.getAluno(i));
					
							TelaAluno telaa = new TelaAluno();
							telaa.setVisible(true);
							setVisible(false);
					
						}
					}try{if (UsuarioSecao.alunosa.get(0) == null | textFieldCpf.getText().equals("") && textFieldSenha.getText().equals("")) {
						JOptionPane.showMessageDialog(contentPane, "Login Invalido");
					}
					}catch(IndexOutOfBoundsException e){
						JOptionPane.showMessageDialog(contentPane, "Login Invalido"); 
					}
				}
				
			}
		});
		btnNewButton.setBounds(302, 229, 114, 25);
		contentPane.add(btnNewButton);
	}
}
