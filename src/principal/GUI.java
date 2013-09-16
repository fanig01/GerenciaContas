package principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


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
        info.setForeground(Color.darkGray);
        info.setBackground(Color.white);
        
        
        //buttons
        JButton submit = new JButton("Criar Conta Corrente");
        JButton submit2 = new JButton("Criar Conta Poupanca");
        submit.addActionListener(this);
        submit2.addActionListener(this);
        
        
		
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
		
		//mainPanel
		mainPanel1.setLayout(new GridLayout(5,1));
		mainPanel1.add(nomePanel);
		mainPanel1.add(nroContaPanel);
		mainPanel1.add(balancePanel);
		mainPanel1.add(buttonPanel);
		mainPanel1.add(info);
		
		
		
		
		//Pane
		
		tabbedPane.addTab("Nova Conta", null,mainPanel1,"Nova Conta");

		
		/****************************
		2
		*****************************/
		
		//textos
		nroConta2 = new JTextField(10);
		
		//labels
        infoSaldo = new JLabel();
        infoSaldo.setForeground(Color.darkGray);
        infoSaldo.setBackground(Color.white);
        infoSaldo.setOpaque( true );
		
		
		//panels
		JPanel accntPanel = new JPanel();
		JPanel buttnPanel = new JPanel();
		
		//+ panels
		accntPanel.add(new JLabel("Numero da Conta:"));
		accntPanel.add(nroConta2);
		
		//mainPanel
		JPanel mainPanel2 = new JPanel();
		mainPanel2.setLayout(new GridLayout(3,1));
		mainPanel2.add(accntPanel);
		JButton display = new JButton("Mostrar");
		accntPanel.add(display);
		display.addActionListener(this);
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
		process.addActionListener(this);
		
		//label
        infoSaque = new JLabel();
        infoSaque.setForeground(Color.darkGray);
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
		deposit.addActionListener(this);
		
		//label
        infoDeposito = new JLabel();
        infoDeposito.setForeground(Color.darkGray);
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
		
		
		//mainPane
		JPanel mainPanel4 = new JPanel();
		mainPanel4.setLayout(new GridLayout(4,1));
		mainPanel4.add(accntPanel3);
		mainPanel4.add(quantiaPanel2);
		mainPanel4.add(buttnPanel3);
		mainPanel4.add(infoDeposito);
		
		//Pane
		tabbedPane.addTab("Depositos", null,mainPanel4,"Depositos");
		getContentPane().add(tabbedPane);
				
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
				int personAccount = Integer.parseInt(nroConta.getText());
				double personpmroDeposito = Double.parseDouble(pmroDeposito.getText());
				conta1 = new ContaCorrente(personAccount,personnome, personpmroDeposito);
				info.setText(conta1.toString());
			}
		else if
		(click.equals("Criar Conta Poupanca"))
		{	
			String personnome = nome.getText();
			String personAccount = nroConta.getText();
			double personpmroDeposito = Double.parseDouble(pmroDeposito.getText());
			conta1 = new ContaPoupanca(personAccount,personnome, personpmroDeposito);
			info.setText(conta1.toString());
		}

		else if (click.equals("Mostrar"))
		{
			int comp1 = conta1.getNroConta();
			int comp2 = Integer.parseInt(nroConta2.getText());
			if(comp1==comp2)
			{
				infoSaldo.setText("Saldo: " +conta1.getSaldo());
			}
			else 
			{
				infoSaldo.setText("Insira um Numero de Conta Valido");
			}
		}

		else if
			(click.equals("Sacar"))
			{
				int comp1 = conta1.getNroConta();
				int comp2 = Integer.parseInt(nroConta3.getText());
				int amnt = Integer.parseInt(quantia.getText());
				if (comp1==comp2)
				{
					conta1.processarSaque(amnt);
					infoSaque.setText("Saque Realizado com Sucesso");
				}
				else 
				{
				
					infoSaque.setText("Insira um Numero de Conta Valido");
				}
				
			}	
					
			
		else if
			(click.equals("Depositar"))
			{
				int accnt = Integer.parseInt(nroConta4.getText());
				double amnt= Double.parseDouble(quantia2.getText());
				int comp = conta1.getNroConta(); 
				if (accnt==comp)
				{
					conta1.deposit(amnt);
					infoDeposito.setText("Voce Depositou R$: "+amnt);
				}
				else
				{
					infoDeposito.setText("Insira um Numero de Conta Valido");
				}
			}			
	}
}
		 
	
	
