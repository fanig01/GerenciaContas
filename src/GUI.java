import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class GUI extends JFrame implements ActionListener{

	
	private JTextField name;
	private JTextField amount;
	private JTextField amount2;
	private JTextField accountNumber;
	private JTextField accountNumber2;
	private JTextField accountNumber3;
	private JTextField accountNumber4;
	private JTextField initial;
	
	private TextArea details;
	private JLabel balanceDetail;
	private JLabel chequeDetail;
	private JLabel depositDetail;
	
	private JButton clear;
	private JButton clear2;
	private JButton clear3;
	private JButton clear4;
	
	private Conta account1;
	
	public GUI(){
		super("Banco Virtual");
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		/****************************
		*Tab 1 Initialisation
		*****************************/
		//create textboxes
		name = new JTextField(10);
		accountNumber = new JTextField(10);
		initial = new JTextField(10);
		
		// set up the details TextArea
        details = new TextArea("",3,15);
        details.setEditable(false);
        details.setForeground(Color.red);
        details.setBackground(Color.white);
        
        
        //create buttons
        JButton submit = new JButton("Criar Conta Corrente");
        JButton submit2 = new JButton("Criar Conta Poupanca");
        clear = new JButton("Limpar");
        clear.setEnabled(false);
        submit.addActionListener(this);
        submit2.addActionListener(this);
        clear.addActionListener(this);
        
        
		
		//create panels
		JPanel namePanel = new JPanel();
		JPanel accountNumberPanel= new JPanel();
		JPanel balancePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel mainPanel1 = new JPanel();
		
		//add to the panels
		namePanel.add(new JLabel("                    Nome: "));
		namePanel.add(name);
		accountNumberPanel.add(new JLabel("Numero da Conta: "));
		accountNumberPanel.add(accountNumber);
		balancePanel.add(new JLabel("      Primeiro Deposito:"));
		balancePanel.add(initial);
		buttonPanel.add(submit);
		buttonPanel.add(submit2);
		buttonPanel.add(clear);
		
		//add the panels to the mainPanel
		mainPanel1.setLayout(new GridLayout(5,1));
		mainPanel1.add(namePanel);
		mainPanel1.add(accountNumberPanel);
		mainPanel1.add(balancePanel);
		mainPanel1.add(buttonPanel);
		mainPanel1.add(details);
		
		
		
		
		//add main panel to the JTabbedPane
		
		tabbedPane.addTab("Nova Conta", null,mainPanel1,"Create");

		
		/****************************
		*Tab 2 Initialisation
		*****************************/
		
		//Create text fields
		accountNumber2 = new JTextField(10);
		JButton display = new JButton("Mostrar");
		clear2 = new JButton("Outra Conta");
		clear2.setEnabled(false);
		display.addActionListener(this);
		clear2.addActionListener(this);
		
		// set up the balanceDetail label
        balanceDetail = new JLabel();
        balanceDetail.setForeground(Color.red);
        balanceDetail.setBackground(Color.white);
        balanceDetail.setOpaque( true );
		
		
		//create panels
		JPanel accntPanel = new JPanel();
		JPanel buttnPanel = new JPanel();
		
		//add to the panels
		accntPanel.add(new JLabel("Numero da Conta:"));
		accntPanel.add(accountNumber2);
		buttnPanel.add(display);
		buttnPanel.add(clear2);
		
		//add the panels to the mainPanel1
		JPanel mainPanel2 = new JPanel();
		mainPanel2.setLayout(new GridLayout(3,1));
		mainPanel2.add(accntPanel);
		mainPanel2.add(buttnPanel);
		mainPanel2.add(balanceDetail);
		
		//add mainPanel2 to tabbedPane
		tabbedPane.addTab("Saldo", null,mainPanel2,"Balance");
		
		/****************************
		*Tab 3 Initialisation
		*****************************/
		
		//instatiating textfields and buttons
		accountNumber3 = new JTextField(10);
		amount = new JTextField(10);
		JButton  process = new JButton("Sacar");
		clear3 = new JButton("Novo Saque");
		clear3.setEnabled(false);
		process.addActionListener(this);
		clear3.addActionListener(this);
		
		// set up the chequeDetail label
        chequeDetail = new JLabel();
        chequeDetail.setForeground(Color.red);
        chequeDetail.setBackground(Color.white);
        chequeDetail.setOpaque( true );
		
		//create panels
		JPanel accntPanel2 = new JPanel();
		JPanel amountPanel = new JPanel();
		JPanel buttnPanel2 = new JPanel();
		
		//add to the panels
		accntPanel2.add(new JLabel("  Numero da Conta:"));
		accntPanel2.add(accountNumber3);
		amountPanel.add(new JLabel("Quantidade a Sacar:"));
		amountPanel.add(amount);
		buttnPanel2.add(process);
		buttnPanel2.add(clear3);
		
		//add the panels to the mainPanel1
		JPanel mainPanel3 = new JPanel();
		mainPanel3.setLayout(new GridLayout(4,1));
		mainPanel3.add(accntPanel2);
		mainPanel3.add(amountPanel);
		mainPanel3.add(buttnPanel2);
		mainPanel3.add(chequeDetail);
		
		//add mainPanel3 to tabbedPane
		tabbedPane.addTab("Saques", null,mainPanel3,"Cheques");
		
		/****************************
		*Tab 4 Initialisation
		*****************************/
		//instatiating TextFields labels and buttons
		accountNumber4 = new JTextField(10);
		amount2 = new JTextField(10);
		depositDetail = new JLabel();
		JButton  deposit = new JButton("Depositar");
		clear4 = new JButton("Novo Deposito");
		clear4.setEnabled(false);
		clear4.addActionListener(this);
		deposit.addActionListener(this);
		
		// set up the depositDetail label
        depositDetail = new JLabel();
        depositDetail.setForeground(Color.red);
        depositDetail.setBackground(Color.white);
        depositDetail.setOpaque( true );
		
		//create panels
		JPanel accntPanel3 = new JPanel();
		JPanel amountPanel2 = new JPanel();
		JPanel buttnPanel3 = new JPanel();
		
		//add to the panels
		accntPanel3.add(new JLabel("  Numero da Conta:"));
		accntPanel3.add(accountNumber4);
		amountPanel2.add(new JLabel("    Quantidade a Depositar:"));
		amountPanel2.add(amount2);
		buttnPanel3.add(deposit);
		buttnPanel3.add(clear4);
		
		
		//add the panels to the mainPanel1
		JPanel mainPanel4 = new JPanel();
		mainPanel4.setLayout(new GridLayout(4,1));
		mainPanel4.add(accntPanel3);
		mainPanel4.add(amountPanel2);
		mainPanel4.add(buttnPanel3);
		mainPanel4.add(depositDetail);
		
		//add mainPanel3 to tabbedPane
		tabbedPane.addTab("Depositos", null,mainPanel4,"Depositos");
		add(tabbedPane);
				
	}//Constructor ends here
	
	/***************************************
	 * Action Listeners
	 ***************************************/
	
	public void actionPerformed(ActionEvent evt){
		String click = evt.getActionCommand();
		if
			(click.equals("Criar Conta Corrente"))
			{	
				String personName = name.getText();
				String personAccount = accountNumber.getText();
				double personInitial = Double.parseDouble(initial.getText());
				account1 = new ContaCorrente(personAccount,personName, personInitial);
				clear.setEnabled(true);
				details.setText(account1.toString());
			}
		else if
		(click.equals("Criar Conta Poupanca"))
		{	
			String personName = name.getText();
			String personAccount = accountNumber.getText();
			double personInitial = Double.parseDouble(initial.getText());
			account1 = new ContaPoupanca(personAccount,personName, personInitial);
			clear.setEnabled(true);
			details.setText(account1.toString());
		}
		else if
			(click.equals("Limpar"))
			{
				name.setText("");
				accountNumber.setText("");
				initial.setText("");
				details.setText("");
				name.requestFocus();
				clear.setEnabled(false);
			}
		else if (click.equals("Mostrar"))
		{
			String comp1 = account1.getAccntNumber();
			String comp2 = accountNumber2.getText();
			if(Integer.parseInt(comp1)==Integer.parseInt(comp2))
			{
				balanceDetail.setText("Saldo: " +account1.getBalance());
				clear2.setEnabled(true);
			}
			else 
			{
				balanceDetail.setText("Insira um Numero de Conta Valido");
				clear2.setEnabled(true);
			}
		}
		else if (click.equals("Outra Conta"))
		{
			accountNumber2.setText("");
			balanceDetail.setText("");
			accountNumber2.requestFocus();
			clear2.setEnabled(false);
		}
		else if
			(click.equals("Sacar"))
			{
				String comp1 = account1.getAccntNumber();
				String comp2 = accountNumber3.getText();
				int amnt = Integer.parseInt(amount.getText());
				if (Integer.parseInt(comp1)==Integer.parseInt(comp2))
				{
					account1.processCheque(amnt);
					chequeDetail.setText("Saque Realizado com Sucesso");
					clear3.setEnabled(true);
				}
				else 
				{
				
					chequeDetail.setText("Insira um Numero de Conta Valido");
					clear3.setEnabled(true);
				}
				
			}
		else if
				(click.equals("Novo Saque"))
				{
					amount.setText("");
					accountNumber3.setText("");
					chequeDetail.setText("");
					accountNumber3.requestFocus();
					clear3.setEnabled(false);
				}		
					
			
		else if
			(click.equals("Depositar"))
			{
				int accnt = Integer.parseInt(accountNumber4.getText());
				double amnt= Double.parseDouble(amount2.getText());
				int comp = Integer.parseInt(account1.getAccntNumber()); 
				if (accnt==comp)
				{
					clear4.setEnabled(true);
					account1.deposit(amnt);
					depositDetail.setText("Voce Depositou R$: "+amnt);
				}
				else
				{
					clear4.setEnabled(true);
					depositDetail.setText("Insira um Numero de Conta Valido");
				}
			}
		else if
			(click.equals("Novo Deposito"))
			{
				amount2.setText("");
				accountNumber4.setText("");
				clear4.setEnabled(false);
			}				
	}
}
		 
	
	
