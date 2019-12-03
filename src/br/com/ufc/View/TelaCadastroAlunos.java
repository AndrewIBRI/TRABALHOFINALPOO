package br.com.ufc.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.ufc.testepoo.Aluno;
import br.com.ufc.testepoo.CadastroDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldMatricula;
	private JTextField textFieldCurso;
	private JTextField textFieldCpf;
	private JTextField textFieldDataNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroAlunos frame = new TelaCadastroAlunos();
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
	public TelaCadastroAlunos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 580, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeAlunos = new JLabel("Cadastro de Alunos");
		lblCadastroDeAlunos.setBounds(166, 12, 164, 15);
		contentPane.add(lblCadastroDeAlunos);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(25, 44, 66, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula");
		lblNewLabel_1.setBounds(25, 108, 66, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Curso");
		lblNewLabel_2.setBounds(25, 168, 66, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cpf");
		lblNewLabel_3.setBounds(25, 223, 66, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de nascimento");
		lblNewLabel_4.setBounds(25, 282, 164, 15);
		contentPane.add(lblNewLabel_4);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(25, 63, 223, 19);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldMatricula = new JTextField();
		textFieldMatricula.setBounds(25, 135, 223, 19);
		contentPane.add(textFieldMatricula);
		textFieldMatricula.setColumns(10);
		
		textFieldCurso = new JTextField();
		textFieldCurso.setBounds(25, 192, 223, 19);
		contentPane.add(textFieldCurso);
		textFieldCurso.setColumns(10);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(25, 250, 223, 19);
		contentPane.add(textFieldCpf);
		textFieldCpf.setColumns(10);
		
		textFieldDataNascimento = new JTextField();
		textFieldDataNascimento.setBounds(25, 309, 124, 19);
		contentPane.add(textFieldDataNascimento);
		textFieldDataNascimento.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar Aluno");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Aluno aluno = new Aluno(
						textFieldNome.getText(), 
						textFieldMatricula.getText(), 
						textFieldCurso.getText(), 
						textFieldCpf.getText(),
						textFieldDataNascimento.getText());
				
				CadastroDAO.setAlunos(aluno);
				
				
				JOptionPane.showMessageDialog(contentPane, "Aluno Cadastrado com sucesso");
				
			}
		});
		btnNewButton.setBounds(223, 298, 164, 40);
		contentPane.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaBibliotecaria tela = new TelaBibliotecaria();
				tela.setVisible(true);
				setVisible(false);
				
			}
		});
		btnVoltar.setBounds(429, 298, 114, 40);
		contentPane.add(btnVoltar);
	}

}
