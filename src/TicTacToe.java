/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 13/06/21
 */
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;
import java.text.*;
import java.util.*; 
		
   
public class TicTacToe  implements ActionListener  {
	

/*Instance Variables*/
private JFrame window = new JFrame("Tic-Tac-Toe");
private JButton button1 = new JButton("");
private JButton button2 = new JButton("");
private JButton button3 = new JButton("");
private JButton button4 = new JButton("");
private JButton button5 = new JButton("");
private JButton button6 = new JButton("");
private JButton button7 = new JButton("");
private JButton button8 = new JButton("");
private JButton button9 = new JButton("");
private JButton button10 = new JButton("score");
private String letter = "";
private int count = 0;
private boolean win = false;
  
   
 

public TicTacToe(){
/*Create Window*/
 JPanel p = new JPanel();
 

window.setSize(500,500);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setLayout(new GridLayout(3,3));


/*Add Buttons To The Window*/
window.add(button1);
window.add(button2);
window.add(button3);
window.add(button4);
window.add(button5);
window.add(button6);
window.add(button7);
window.add(button8);
window.add(button9);
JMenuBar menuBar = new JMenuBar(); 
JMenu fileMenu = new JMenu("Game"); 
fileMenu.setMnemonic('G');

JMenu editMenu = new JMenu("Help"); 
editMenu.setMnemonic('H');
JMenuItem newMenuItem = new JMenuItem("NewGame"); 
JMenuItem openMenuItem = new JMenuItem("Scores"); 
JMenuItem saveMenuItem = new JMenuItem("Save"); 
JMenuItem exitMenuItem = new JMenuItem("Exit");
JMenuItem new1MenuItem = new JMenuItem("help"); 
JMenuItem new2MenuItem = new JMenuItem("about"); 
fileMenu.add(newMenuItem); 
fileMenu.add(openMenuItem); 
fileMenu.add(saveMenuItem); 
fileMenu.add(exitMenuItem); 
editMenu.add(new1MenuItem);

editMenu.add(new2MenuItem);


menuBar.add(fileMenu); 
menuBar.add(editMenu); 

window.setJMenuBar(menuBar);

/*Add The Action Listener To The Buttons*/
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
button8.addActionListener(this);
button9.addActionListener(this);
newMenuItem.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent ae)
{new TicTacToe();
}
});
exitMenuItem.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent m)
	{
		System.exit(0);
	}
});
new2MenuItem.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent n)
	{
		JOptionPane.showMessageDialog(null,"this game is developed by tendoeschate");
	}
});
openMenuItem.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent x)
	{
	SimpleTableExample mainFrame	= new SimpleTableExample();
		mainFrame.setVisible( true );
		
	}

 } );

new1MenuItem.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent u)
	{
		JOptionPane.showMessageDialog(null,"simple game played by two players with the help of mouse click");
	}
});
saveMenuItem.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent z)
		
	{
		JFrame frame=new JFrame();
		JFileChooser fileSave = new JFileChooser(); 
fileSave.showSaveDialog(frame); 
SaveFile s=new SaveFile();
s.saveFile(fileSave.getSelectedFile());
	}
});

/*Make The Window Visible*/
window.setVisible(true);
}

public void actionPerformed(ActionEvent a) {
count++;

/*Calculate Who's Turn It Is*/
if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9){

letter = "X";


} else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10){
	
letter = "O";

}

/*Display X's or O's on the buttons*/
if(a.getSource() == button1){
button1.setText(letter);
button1.setEnabled(false);
button1.setBackground(Color.WHITE);
} else if(a.getSource() == button2){
button2.setText(letter);
button2.setEnabled(false);
button2.setBackground(Color.WHITE);
} else if(a.getSource() == button3){
button3.setText(letter);
button3.setEnabled(false);
button3.setBackground(Color.WHITE);
} else if(a.getSource() == button4){
button4.setText(letter);
button4.setEnabled(false);
button4.setBackground(Color.WHITE);
} else if(a.getSource() == button5){
button5.setText(letter);
button5.setEnabled(false);
button5.setBackground(Color.WHITE);
} else if(a.getSource() == button6){
button6.setText(letter);
button6.setEnabled(false);
button6.setBackground(Color.WHITE);
} else if(a.getSource() == button7){
button7.setText(letter);
button7.setEnabled(false);
button7.setBackground(Color.WHITE);
} else if(a.getSource() == button8){
button8.setText(letter);
button8.setEnabled(false);
button8.setBackground(Color.WHITE);
} else if(a.getSource() == button9){
button9.setText(letter);
button9.setEnabled(false);
button9.setBackground(Color.WHITE);
}

/*Determine who won*/
//horizontal wins
if( button1.getText() == button2.getText() && button2.getText() == button3.getText() && button1.getText() != ""){
win = true;
}
else if(button4.getText() == button5.getText() && button5.getText() == button6.getText() && button4.getText() != ""){
win = true;
}
else if(button7.getText() == button8.getText() && button8.getText() == button9.getText() && button7.getText() != ""){
win = true;
}

//virticle wins
else if(button1.getText() == button4.getText() && button4.getText() == button7.getText() && button1.getText() != ""){
win = true;
}
else if(button2.getText() == button5.getText() && button5.getText() == button8.getText() && button2.getText() != ""){
win = true;
}
else if(button3.getText() == button6.getText() && button6.getText() == button9.getText() && button3.getText() != ""){
win = true;
}

//diagonal wins
else if(button1.getText() == button5.getText() && button5.getText() == button9.getText() && button1.getText() != ""){
win = true;
}
else if(button3.getText() == button5.getText() && button5.getText() == button7.getText() && button3.getText() != ""){
win = true;
}
else {
win = false;
}

/*Show a dialog if someone wins or the game is tie*/
if(win == true){
if(letter=="X")

{
 Global.total_games++;
	Global.check_wins++;
	
	



}
  else if(letter=="O")
  {	
Global.total_games++;
	Global.check_wins1++;
	
	
}	
JOptionPane.showMessageDialog(null, letter + " WINS!");


} else if(count == 9 && win == false){
JOptionPane.showMessageDialog(null, "Tie Game!");
Global.total_games++;
}


 
}

public static void main(String[] args){
	
new TicTacToe();

}
}
class SimpleTableExample extends JFrame 
 {
	// Instance attributes used in this example
	private	JPanel		topPanel;
	private	JTable		table;
	private	JScrollPane scrollPane;
	


	
	public SimpleTableExample()
	{
		// Set the frame characteristics
		setTitle( "Simple Table Application" );
		setSize( 300, 200 );
	    setBackground( Color.gray );

		// Create a panel to hold all other components
		topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );
Global.percentage_games=(((Global.check_wins)/(Global.total_games)))*100;
Global.percentage_games1=(((Global.check_wins1)/(Global.total_games)))*100;

		// Create columns names
		String columnNames[] = { "Player", "Wins","PercentageWin","TotalGames" };

		// Create some data
		Double dataValues[][] =
		{
			{ 1.0,Global.check_wins,Global.percentage_games,Global.total_games  },
			{ 2.0,Global.check_wins1,Global.percentage_games1,Global.total_games },
			
		};

		// Create a new table instance
		table = new JTable( dataValues, columnNames );

		// Add the table to a scrolling pane
		scrollPane = new JScrollPane( table );
		topPanel.add( scrollPane, BorderLayout.CENTER );
	
	}

	// Main entry point for this example
	public static void main( String args[] )
	{
		// Create an instance of the test application
		
	}
}
class Global {

public static double  check_wins=0;
public static double  check_wins1=0;
public static double  total_games=0;
public static double  percentage_games;
public static double percentage_games1;
}
		
class SaveFile
{
JFrame frame=new JFrame();
JTextArea area=new JTextArea();
  void  saveFile(File file) { 
frame.setTitle(file.getName() ); 
try { 
FileWriter writer = new FileWriter(file); 
writer.write(area.getText() ); 
writer.close(); 
} catch (IOException ex) { 
System.out.println("cannot save file"); 
ex.printStackTrace(); 
} 
} 
public static void main(String h[])
{
}
}
