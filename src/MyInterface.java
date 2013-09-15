import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class MyInterface extends JFrame implements ActionListener{

	
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
	
	private CheckingAccount account1;
	
	public MyInterface(){
		super("Bank Account");
		
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
        JButton submit = new JButton("Submit");
        clear = new JButton("Clear");
        clear.setEnabled(false);
        submit.addActionListener(this);
        clear.addActionListener(this);
        
        
		
		//create panels
		JPanel namePanel = new JPanel();
		JPanel accountNumberPanel= new JPanel();
		JPanel balancePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel mainPanel1 = new JPanel();
		
		//add to the panels
		namePanel.add(new JLabel("                    Name: "));
		namePanel.add(name);
		accountNumberPanel.add(new JLabel("Account Number: "));
		accountNumberPanel.add(accountNumber);
		balancePanel.add(new JLabel("      Initial Balance:"));
		balancePanel.add(initial);
		buttonPanel.add(submit);
		buttonPanel.add(clear);
		
		//add the panels to the mainPanel
		mainPanel1.setLayout(new GridLayout(5,1));
		mainPanel1.add(namePanel);
		mainPanel1.add(accountNumberPanel);
		mainPanel1.add(balancePanel);
		mainPanel1.add(buttonPanel);
		mainPanel1.add(details);
		
		
		
		
		//add main panel to the JTabbedPane
		
		tabbedPane.addTab("Create Account", null,mainPanel1,"Create");

		
		/****************************
		*Tab 2 Initialisation
		*****************************/
		
		//Create text fields
		accountNumber2 = new JTextField(10);
		JButton display = new JButton("Display");
		clear2 = new JButton("Clear Label");
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
		accntPanel.add(new JLabel("Account Number:"));
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
		tabbedPane.addTab("Check Balance", null,mainPanel2,"Balance");
		
		/****************************
		*Tab 3 Initialisation
		*****************************/
		
		//instatiating textfields and buttons
		accountNumber3 = new JTextField(10);
		amount = new JTextField(10);
		JButton  process = new JButton("Process");
		clear3 = new JButton("Restart");
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
		accntPanel2.add(new JLabel("  Account Number:"));
		accntPanel2.add(accountNumber3);
		amountPanel.add(new JLabel("Withdraw Amount:"));
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
		tabbedPane.addTab("Process Cheques", null,mainPanel3,"Cheques");
		
		/****************************
		*Tab 4 Initialisation
		*****************************/
		//instatiating TextFields labels and buttons
		accountNumber4 = new JTextField(10);
		amount2 = new JTextField(10);
		depositDetail = new JLabel();
		JButton  deposit = new JButton("Deposit");
		clear4 = new JButton("Start Again");
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
		accntPanel3.add(new JLabel("  Account Number:"));
		accntPanel3.add(accountNumber4);
		amountPanel2.add(new JLabel("    Deposit Amount:"));
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
		tabbedPane.addTab("Deposit", null,mainPanel4,"Deposit");
		add(tabbedPane);
				
	}//Constructor ends here
	
	/***************************************
	 * Action Listeners
	 ***************************************/
	
	public void actionPerformed(ActionEvent evt){
		String click = evt.getActionCommand();
		if
			(click.equals("Submit"))
			{	
				String personName = name.getText();
				String personAccount = accountNumber.getText();
				double personInitial = Double.parseDouble(initial.getText());
				account1 = new CheckingAccount(personAccount,personName, personInitial);
				clear.setEnabled(true);
				details.setText(account1.toString());
			}
		else if
			(click.equals("Clear"))
			{
				name.setText("");
				accountNumber.setText("");
				initial.setText("");
				details.setText("");
				name.requestFocus();
				clear.setEnabled(false);
			}
		else if (click.equals("Display"))
		{
			String comp1 = account1.getAccntNumber();
			String comp2 = accountNumber2.getText();
			if(Integer.parseInt(comp1)==Integer.parseInt(comp2))
			{
				balanceDetail.setText("Account Balance: " +account1.getBalance());
				clear2.setEnabled(true);
			}
			else 
			{
				balanceDetail.setText("The account number you have entered does not exist");
				clear2.setEnabled(true);
			}
		}
		else if (click.equals("Clear Label"))
		{
			accountNumber2.setText("");
			balanceDetail.setText("");
			accountNumber2.requestFocus();
			clear2.setEnabled(false);
		}
		else if
			(click.equals("Process"))
			{
				String comp1 = account1.getAccntNumber();
				String comp2 = accountNumber3.getText();
				int amnt = Integer.parseInt(amount.getText());
				if (Integer.parseInt(comp1)==Integer.parseInt(comp2))
				{
					account1.processCheque(amnt);
					chequeDetail.setText("*****The cheque has been processed. Thank You****");
					clear3.setEnabled(true);
				}
				else 
				{
				
					chequeDetail.setText("The account number you have entered does not exist");
					clear3.setEnabled(true);
				}
				
			}
		else if
				(click.equals("Restart"))
				{
					amount.setText("");
					accountNumber3.setText("");
					chequeDetail.setText("");
					accountNumber3.requestFocus();
					clear3.setEnabled(false);
				}		
					
			
		else if
			(click.equals("Deposit"))
			{
				int accnt = Integer.parseInt(accountNumber4.getText());
				double amnt= Double.parseDouble(amount2.getText());
				int comp = Integer.parseInt(account1.getAccntNumber()); 
				if (accnt==comp)
				{
					clear4.setEnabled(true);
					account1.deposit(amnt);
					depositDetail.setText("You successfully deposited N$: "+amnt);
				}
				else
				{
					clear4.setEnabled(true);
					depositDetail.setText("The account number you have entered does not exist");
				}
			}
		else if
			(click.equals("Start Again"))
			{
				amount2.setText("");
				accountNumber4.setText("");
				clear4.setEnabled(false);
			}				
	}
}
		 
	
	
