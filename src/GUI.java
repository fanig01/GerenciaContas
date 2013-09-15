import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class GUI extends JFrame implements ActionListener{

	
	private JTextField nome;
	private JTextField quantia;
	private JTextField quantia2;
	private JTextField nroConta;
	private JTextField nroConta2;
	private JTextField nroConta3;
	private JTextField nroConta4;
	private JTextField pmroDeposito;
	
	private TextArea info;
	private JLabel infoSaldo;
	private JLabel infoSaque;
	private JLabel infoDeposito;
	
	private JButton limpar;
	private JButton limpar2;
	private JButton limpar3;
	private JButton limpar4;
	
	private Conta conta1;
	
	public GUI(){
		super("Banco Virtual");
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		/****************************
		1
		*****************************/
		//labels
		nome = new JTextField(10);
		nroConta = new JTextField(10);
		pmroDeposito = new JTextField(10);
		
		//textos
        info = new TextArea("",3,15);
        info.setEditable(false);
        info.setForeground(Color.red);
        info.setBackground(Color.white);
        
        
        //buttons
        JButton submit = new JButton("Criar Conta Corrente");
        JButton submit2 = new JButton("Criar Conta Poupanca");
        limpar = new JButton("Limpar");
        limpar.setEnabled(false);
        submit.addActionListener(this);
        submit2.addActionListener(this);
        limpar.addActionListener(this);
        
        
		
		//panels
		JPanel nomePanel = new JPanel();
		JPanel nroContaPanel= new JPanel();
		JPanel balancePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel mainPanel1 = new JPanel();
		
		//+ panels
		nomePanel.add(new JLabel("                    Nome: "));
		nomePanel.add(nome);
		nroContaPanel.add(new JLabel("Numero da Conta: "));
		nroContaPanel.add(nroConta);
		balancePanel.add(new JLabel("      Primeiro Deposito:"));
		balancePanel.add(pmroDeposito);
		buttonPanel.add(submit);
		buttonPanel.add(submit2);
		buttonPanel.add(limpar);
		
		//mainPanel
		mainPanel1.setLayout(new GridLayout(5,1));
		mainPanel1.add(nomePanel);
		mainPanel1.add(nroContaPanel);
		mainPanel1.add(balancePanel);
		mainPanel1.add(buttonPanel);
		mainPanel1.add(info);
		
		
		
		
		//Pane
		
		tabbedPane.addTab("Nova Conta", null,mainPanel1,"Create");

		
		/****************************
		2
		*****************************/
		
		//textos
		nroConta2 = new JTextField(10);
		JButton display = new JButton("Mostrar");
		limpar2 = new JButton("Outra Conta");
		limpar2.setEnabled(false);
		display.addActionListener(this);
		limpar2.addActionListener(this);
		
		//labels
        infoSaldo = new JLabel();
        infoSaldo.setForeground(Color.red);
        infoSaldo.setBackground(Color.white);
        infoSaldo.setOpaque( true );
		
		
		//panels
		JPanel accntPanel = new JPanel();
		JPanel buttnPanel = new JPanel();
		
		//+ panels
		accntPanel.add(new JLabel("Numero da Conta:"));
		accntPanel.add(nroConta2);
		buttnPanel.add(display);
		buttnPanel.add(limpar2);
		
		//mainPanel
		JPanel mainPanel2 = new JPanel();
		mainPanel2.setLayout(new GridLayout(3,1));
		mainPanel2.add(accntPanel);
		mainPanel2.add(buttnPanel);
		mainPanel2.add(infoSaldo);
		
		//Pane
		tabbedPane.addTab("Saldo", null,mainPanel2,"Balance");
		
		/****************************
		3
		*****************************/
		
		//buttons
		nroConta3 = new JTextField(10);
		quantia = new JTextField(10);
		JButton  process = new JButton("Sacar");
		limpar3 = new JButton("Novo Saque");
		limpar3.setEnabled(false);
		process.addActionListener(this);
		limpar3.addActionListener(this);
		
		//label
        infoSaque = new JLabel();
        infoSaque.setForeground(Color.red);
        infoSaque.setBackground(Color.white);
        infoSaque.setOpaque( true );
		
		//panels
		JPanel accntPanel2 = new JPanel();
		JPanel quantiaPanel = new JPanel();
		JPanel buttnPanel2 = new JPanel();
		
		//+panels
		accntPanel2.add(new JLabel("  Numero da Conta:"));
		accntPanel2.add(nroConta3);
		quantiaPanel.add(new JLabel("Quantidade a Sacar:"));
		quantiaPanel.add(quantia);
		buttnPanel2.add(process);
		buttnPanel2.add(limpar3);
		
		//mainPane
		JPanel mainPanel3 = new JPanel();
		mainPanel3.setLayout(new GridLayout(4,1));
		mainPanel3.add(accntPanel2);
		mainPanel3.add(quantiaPanel);
		mainPanel3.add(buttnPanel2);
		mainPanel3.add(infoSaque);
		
		//Pane
		tabbedPane.addTab("Saques", null,mainPanel3,"Cheques");
		
		/****************************
		4
		*****************************/
		//textos e buttons
		nroConta4 = new JTextField(10);
		quantia2 = new JTextField(10);
		infoDeposito = new JLabel();
		JButton  deposit = new JButton("Depositar");
		limpar4 = new JButton("Novo Deposito");
		limpar4.setEnabled(false);
		limpar4.addActionListener(this);
		deposit.addActionListener(this);
		
		//label
        infoDeposito = new JLabel();
        infoDeposito.setForeground(Color.red);
        infoDeposito.setBackground(Color.white);
        infoDeposito.setOpaque( true );
		
		//panels
		JPanel accntPanel3 = new JPanel();
		JPanel quantiaPanel2 = new JPanel();
		JPanel buttnPanel3 = new JPanel();
		
		//+panels
		accntPanel3.add(new JLabel("  Numero da Conta:"));
		accntPanel3.add(nroConta4);
		quantiaPanel2.add(new JLabel("    Quantidade a Depositar:"));
		quantiaPanel2.add(quantia2);
		buttnPanel3.add(deposit);
		buttnPanel3.add(limpar4);
		
		
		//mainPane
		JPanel mainPanel4 = new JPanel();
		mainPanel4.setLayout(new GridLayout(4,1));
		mainPanel4.add(accntPanel3);
		mainPanel4.add(quantiaPanel2);
		mainPanel4.add(buttnPanel3);
		mainPanel4.add(infoDeposito);
		
		//Pane
		tabbedPane.addTab("Depositos", null,mainPanel4,"Depositos");
		add(tabbedPane);
				
	}//end
	
	/***************************************
	 Açoes
	 ***************************************/
	
	public void actionPerformed(ActionEvent evt){
		String click = evt.getActionCommand();
		if
			(click.equals("Criar Conta Corrente"))
			{	
				String personnome = nome.getText();
				String personAccount = nroConta.getText();
				double personpmroDeposito = Double.parseDouble(pmroDeposito.getText());
				conta1 = new ContaCorrente(personAccount,personnome, personpmroDeposito);
				limpar.setEnabled(true);
				info.setText(conta1.toString());
			}
		else if
		(click.equals("Criar Conta Poupanca"))
		{	
			String personnome = nome.getText();
			String personAccount = nroConta.getText();
			double personpmroDeposito = Double.parseDouble(pmroDeposito.getText());
			conta1 = new ContaPoupanca(personAccount,personnome, personpmroDeposito);
			limpar.setEnabled(true);
			info.setText(conta1.toString());
		}
		else if
			(click.equals("Limpar"))
			{
				nome.setText("");
				nroConta.setText("");
				pmroDeposito.setText("");
				info.setText("");
				nome.requestFocus();
				limpar.setEnabled(false);
			}
		else if (click.equals("Mostrar"))
		{
			String comp1 = conta1.getAccntNumber();
			String comp2 = nroConta2.getText();
			if(Integer.parseInt(comp1)==Integer.parseInt(comp2))
			{
				infoSaldo.setText("Saldo: " +conta1.getBalance());
				limpar2.setEnabled(true);
			}
			else 
			{
				infoSaldo.setText("Insira um Numero de Conta Valido");
				limpar2.setEnabled(true);
			}
		}
		else if (click.equals("Outra Conta"))
		{
			nroConta2.setText("");
			infoSaldo.setText("");
			nroConta2.requestFocus();
			limpar2.setEnabled(false);
		}
		else if
			(click.equals("Sacar"))
			{
				String comp1 = conta1.getAccntNumber();
				String comp2 = nroConta3.getText();
				int amnt = Integer.parseInt(quantia.getText());
				if (Integer.parseInt(comp1)==Integer.parseInt(comp2))
				{
					conta1.processCheque(amnt);
					infoSaque.setText("Saque Realizado com Sucesso");
					limpar3.setEnabled(true);
				}
				else 
				{
				
					infoSaque.setText("Insira um Numero de Conta Valido");
					limpar3.setEnabled(true);
				}
				
			}
		else if
				(click.equals("Novo Saque"))
				{
					quantia.setText("");
					nroConta3.setText("");
					infoSaque.setText("");
					nroConta3.requestFocus();
					limpar3.setEnabled(false);
				}		
					
			
		else if
			(click.equals("Depositar"))
			{
				int accnt = Integer.parseInt(nroConta4.getText());
				double amnt= Double.parseDouble(quantia2.getText());
				int comp = Integer.parseInt(conta1.getAccntNumber()); 
				if (accnt==comp)
				{
					limpar4.setEnabled(true);
					conta1.deposit(amnt);
					infoDeposito.setText("Voce Depositou R$: "+amnt);
				}
				else
				{
					limpar4.setEnabled(true);
					infoDeposito.setText("Insira um Numero de Conta Valido");
				}
			}
		else if
			(click.equals("Novo Deposito"))
			{
				quantia2.setText("");
				nroConta4.setText("");
				limpar4.setEnabled(false);
			}				
	}
}
		 
	
	
