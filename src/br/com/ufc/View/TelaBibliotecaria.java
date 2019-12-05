package br.com.ufc.View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.ufc.testepoo.Acervo;

public class TelaBibliotecaria extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBibliotecaria frame = new TelaBibliotecaria();
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
	public TelaBibliotecaria() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 649, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(37, 54, 415, 354);
		contentPane.add(list);
		
		JButton btnListarLivros = new JButton("Listar Livros");
		btnListarLivros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel listaAlunos = new DefaultListModel();
				
				if(Acervo.tamanho()>0) {	for (int i =0; i < Acervo.tamanho();i++){
					listaAlunos.addElement(Acervo.getAcervos(i));
				};
				}else listaAlunos.addElement("Nenhum Livro Cadastrado");
				
				list.setModel(listaAlunos);
				
			
			
			
			
			
			}
		});
		btnListarLivros.setBounds(37, 12, 197, 25);
		contentPane.add(btnListarLivros);
		
		JButton btnLivrosDisp = new JButton("Livros disponiveis");
		btnLivrosDisp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				DefaultListModel listaAlunos = new DefaultListModel();
				
				if(Acervo.tamanho()>0) {	for (int i =0; i < Acervo.tamanho();i++){
					if(Acervo.getAcervos(i).getAlugado().equals("Nao")){
							
							listaAlunos.addElement(Acervo.getAcervos(i));
							}
				}
				}else listaAlunos.addElement("Nenhum Livro Disponivel");
				
				list.setModel(listaAlunos);
			
			
			
			}
		});
		btnLivrosDisp.setBounds(260, 12, 192, 25);
		contentPane.add(btnLivrosDisp);
		
		JButton btnLivrosEmprest = new JButton("Livros emprestados");
		btnLivrosEmprest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel listaAlunos = new DefaultListModel();
				
				if(Acervo.tamanho()>0) {	for (int i =0; i < Acervo.tamanho();i++){
					if(Acervo.getAcervos(i).getAlugado().equals("Sim")){
							
							listaAlunos.addElement(Acervo.getAcervos(i));
							}
				}
				}else listaAlunos.addElement("Nenhum Livro Alugado");
				
				list.setModel(listaAlunos);
			
			
			
			}
		});
		btnLivrosEmprest.setBounds(464, 82, 159, 25);
		contentPane.add(btnLivrosEmprest);
		
		JButton btnNewButton = new JButton("Cadastrar Livro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastro tela = new TelaCadastro();
				tela.setVisible(true);
				setVisible(false);
						
			}
		});
		btnNewButton.setBounds(464, 164, 161, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir Livro");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				DefaultListModel listaAlunos = new DefaultListModel();
				
				if(Acervo.tamanho()>0) {
					Acervo.remover(list.getSelectedIndex());
					
					for (int i =0; i < Acervo.tamanho();i++){
					listaAlunos.addElement(Acervo.getAcervos(i));
				};
				}else listaAlunos.addElement("Nenhum Livro Cadastrado");
				
				list.setModel(listaAlunos);
			}
		});
		btnNewButton_1.setBounds(464, 246, 161, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("cadastrar alunos ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroAlunos tela = new TelaCadastroAlunos();
				tela.setVisible(true);
				setVisible(false);
				
				
			}
		});
		btnNewButton_2.setBounds(464, 312, 159, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telal = new TelaLogin();
				
				telal.setVisible(true);
				setVisible(false);
				
			}
		});
		btnVoltar.setBounds(464, 365, 159, 23);
		contentPane.add(btnVoltar);
	}
}
