package br.com.ufc.View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.ufc.testepoo.Acervo;
import br.com.ufc.testepoo.UsuarioSecao;

public class TelaAluno extends JFrame {

	private JPanel contentPane;
	private JTextField campoPesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAluno frame = new TelaAluno();
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
	public TelaAluno() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 585, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList MeusLivros = new JList();
		MeusLivros.setBounds(10, 229, 373, 142);
		contentPane.add(MeusLivros);
		
		JList acervo = new JList();
		acervo.setBounds(10, 63, 373, 142);
		contentPane.add(acervo);
		
		campoPesquisa = new JTextField();
		campoPesquisa.setBounds(145, 32, 143, 20);
		contentPane.add(campoPesquisa);
		campoPesquisa.setColumns(10);
		
		JLabel lblPesquisarLivros = new JLabel("Pesquisar Livros");
		lblPesquisarLivros.setBounds(163, 9, 143, 14);
		contentPane.add(lblPesquisarLivros);
		
		JButton btnNewButton = new JButton(" Solicitar Emprestimo");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(Acervo.tamanho()>0) {
					Acervo.setEmprestimo(acervo.getSelectedIndex(), UsuarioSecao.alunosa.get(0));
				}
				
				DefaultListModel listaLivros = new DefaultListModel();
				DefaultListModel listaMeus = new DefaultListModel();
				
				if(Acervo.tamanho()>0) {
					
					for (int i =0; i < Acervo.tamanho();i++){
					listaLivros.addElement(Acervo.getAcervos(i));
				};
				}else listaLivros.addElement("Nenhum Livro Cadastrado");
				
				acervo.setModel(listaLivros);
				
				if(Acervo.tamanho()>0) {
					
					for (int i =0; i < Acervo.tamanho();i++){
						if (Acervo.getAcervos(i).getAlugado().equals("Sim")) {
					listaMeus.addElement(Acervo.getAcervos(i));
						}
				}
				}else listaMeus.addElement("Nenhum Livro Cadastrado");
				
				MeusLivros.setModel(listaMeus);
				
			}
		});
		
		btnNewButton.setBounds(410, 146, 133, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telal = new TelaLogin();
				telal.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(410, 31, 133, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Atualizar listas");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel listaLivros = new DefaultListModel();
				DefaultListModel listaMeus = new DefaultListModel();
				
				if(Acervo.tamanho()>0) {
					
					for (int i =0; i < Acervo.tamanho();i++){
					listaLivros.addElement(Acervo.getAcervos(i));
				};
				}else listaLivros.addElement("Nenhum Livro Cadastrado");
				
				acervo.setModel(listaLivros);
				
				if(Acervo.tamanho()>0) {
					
					for (int i =0; i < Acervo.tamanho();i++){
						if (Acervo.getAcervos(i).getAlugado().equals("Sim")) {
					listaMeus.addElement(Acervo.getAcervos(i));
						}
				}
				}else listaMeus.addElement("Nenhum Livro Cadastrado");
				
				MeusLivros.setModel(listaMeus);
			}
		});
		btnNewButton_2.setBounds(410, 207, 134, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Devolver");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(Acervo.tamanho()>0) {
					Acervo.setDevolucao(MeusLivros.getSelectedValue().toString());
				}
				
				
				
				
				
				
				
				
				DefaultListModel listaLivros = new DefaultListModel();
				DefaultListModel listaMeus = new DefaultListModel();
				
				if(Acervo.tamanho()>0) {
					
					for (int i =0; i < Acervo.tamanho();i++){
					listaLivros.addElement(Acervo.getAcervos(i));
				};
				}else listaLivros.addElement("Nenhum Livro Cadastrado");
				
				acervo.setModel(listaLivros);
				
				if(Acervo.tamanho()>0) {
					
					for (int i =0; i < Acervo.tamanho();i++){
						if (Acervo.getAcervos(i).getAlugado().equals("Sim")) {
					listaMeus.addElement(Acervo.getAcervos(i));
						}
				}
				}else listaMeus.addElement("Nenhum Livro Cadastrado");
				
				MeusLivros.setModel(listaMeus);
			}
		});
		btnNewButton_3.setBounds(410, 276, 133, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Renovar");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(Acervo.tamanho()>0) {
					Acervo.renovar(MeusLivros.getSelectedIndex());
				}	
				
				DefaultListModel listaLivros = new DefaultListModel();
				DefaultListModel listaMeus = new DefaultListModel();
				
				if(Acervo.tamanho()>0) {
					
					for (int i =0; i < Acervo.tamanho();i++){
					listaLivros.addElement(Acervo.getAcervos(i));
				};
				}else listaLivros.addElement("Nenhum Livro Cadastrado");
				
				acervo.setModel(listaLivros);
				
				if(Acervo.tamanho()>0) {
					
					for (int i =0; i < Acervo.tamanho();i++){
						if (Acervo.getAcervos(i).getAlugado().equals("Sim")) {
					listaMeus.addElement(Acervo.getAcervos(i));
						}
				}
				}else listaMeus.addElement("Nenhum Livro Cadastrado");
				
				MeusLivros.setModel(listaMeus);
			}
		});
		btnNewButton_4.setBounds(410, 318, 133, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblMeusLivros = new JLabel("Meus Livros");
		lblMeusLivros.setBounds(10, 211, 133, 14);
		contentPane.add(lblMeusLivros);
		
		JLabel lblAcervoDeLivros = new JLabel("Acervo de Livros");
		lblAcervoDeLivros.setBounds(10, 38, 133, 14);
		contentPane.add(lblAcervoDeLivros);
		
		JButton btnNewButton_5 = new JButton("Pesquisar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel listaAlunos = new DefaultListModel();
				
				if(Acervo.tamanho()>0) {
					for (int i =0; i < Acervo.tamanho();i++){
						if(Acervo.getAcervos(i).getTitulo().contains(campoPesquisa.getText())) {
					listaAlunos.addElement(Acervo.getAcervos(i));
						}
						}
				}else listaAlunos.addElement("Nenhum Livro Cadastrado");
				
				acervo.setModel(listaAlunos);
				
				
			}
		});
		btnNewButton_5.setBounds(294, 31, 89, 23);
		contentPane.add(btnNewButton_5);
	}
}
