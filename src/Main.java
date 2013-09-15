/******************************************************************
*This program simualtes a bank account,When the details are entered
*into the form a CheckingAccount object is created, this object can
*check its balance, deposit into the account and process cheques.
*******************************************************************/

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Main {
	
	public static void main( String[] args ){
		GUI tabbedPaneFrame = new GUI();
		
        Toolkit tk = Toolkit.getDefaultToolkit();
    	Dimension screenSize = tk.getScreenSize();
    	int screenHeight = screenSize.height;
    	int screenWidth = screenSize.width;
    	tabbedPaneFrame.setSize(screenWidth / 2, screenHeight / 2);
    	tabbedPaneFrame.setLocation(screenWidth / 4, screenHeight / 4);
		tabbedPaneFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		tabbedPaneFrame.setSize( 450,300);
		tabbedPaneFrame.setVisible( true );
	}
}