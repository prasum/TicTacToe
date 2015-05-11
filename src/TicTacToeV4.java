import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.io.*;
import java.util.*;
import java.text.*;
import javax.swing.*;

public class TicTacToeV4 implements ActionListener {
    /*Instance Variables*/
    private int[][] winCombinations = new int[][] {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, //horizontal wins
            {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, //virticle wins
            {1, 5, 9}, {3, 5, 7}             //diagonal wins
        };
    private JFrame window = new JFrame("Tic-Tac-Toe");
    private JButton buttons[] = new JButton[10];
    private int count = 0;
    private String letter = "";
    private boolean win = false;
    
    public TicTacToeV4(){
    /*Create Window*/
    window.setPreferredSize(new Dimension(300,300));
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(new GridLayout(3,3));
    
    /*Add Buttons To The Window*/
    for(int i = 1; i<=9; i++){
        buttons[i] = new JButton();
        window.add(buttons[i]);
        buttons[i].addActionListener(this);
    }
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
    /*Make The Window Visible*/
    window.setVisible(true);
    window.pack();
    
newMenuItem.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent ae)
{new TicTacToeV4();
}
});
openMenuItem.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent x)
	{
	SimpleTableExample1 mainFrame	= new SimpleTableExample1();
		mainFrame.setVisible( true );
		
	}

 } );
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
new1MenuItem.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent u)
	{
		JOptionPane.showMessageDialog(null,"simple game played by one player and AI with the help of mouse click");
	}
});

saveMenuItem.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent z)
		
	{
		JFrame frame=new JFrame();
		JFileChooser fileSave = new JFileChooser(); 
fileSave.showSaveDialog(frame); 
SaveFile1 s=new SaveFile1();
s.saveFile(fileSave.getSelectedFile());
	}
});
}
 
    public void actionPerformed(ActionEvent a) {


        /*Write the letter to the button and deactivate it*/
        for(int i = 1; i<= 9; i++){
            if(a.getSource() == buttons[i]){
                buttons[i].setText("X");
                buttons[i].setEnabled(false);
                buttons[i].setBackground(Color.WHITE);

            }
        }
        
        count++;        
        AI();

    }
    
    public void AI(){
        count++;
        if(buttons[1].getText().equals("O") && buttons[2].getText().equals("O") && buttons[3].getText().equals("")){
            buttons[3].setText("O");
            buttons[3].setEnabled(false);
        } else if(buttons[4].getText().equals("O") && buttons[5].getText().equals("O") && buttons[6].getText().equals("")){
            buttons[6].setText("O");
            buttons[6].setEnabled(false);
        } else if(buttons[7].getText().equals("O") && buttons[8].getText().equals("O") && buttons[9].getText().equals("")){
            buttons[9].setText("O");
            buttons[9].setEnabled(false);                
        } 
        
        else if(buttons[2].getText().equals("O") && buttons[3].getText().equals("O") && buttons[1].getText().equals("")){
            buttons[1].setText("O");
            buttons[1].setEnabled(false);                
        } else if(buttons[5].getText().equals("O") && buttons[6].getText().equals("O") && buttons[4].getText().equals("")){
            buttons[4].setText("O");
            buttons[4].setEnabled(false);                
        } else if(buttons[8].getText().equals("O") && buttons[9].getText().equals("O") && buttons[7].getText().equals("")){
            buttons[7].setText("O");
            buttons[7].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("O") && buttons[3].getText().equals("O") && buttons[2].getText().equals("")){
            buttons[2].setText("O");
            buttons[2].setEnabled(false);                
        } else if(buttons[4].getText().equals("O") && buttons[6].getText().equals("O") && buttons[5].getText().equals("")){
            buttons[5].setText("O");
            buttons[5].setEnabled(false);                
        } else if(buttons[7].getText().equals("O") && buttons[9].getText().equals("O") && buttons[8].getText().equals("")){
            buttons[8].setText("O");
            buttons[8].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("O") && buttons[4].getText().equals("O") && buttons[7].getText().equals("")){
            buttons[7].setText("O");
            buttons[7].setEnabled(false);                
        } else if(buttons[2].getText().equals("O") && buttons[5].getText().equals("O") && buttons[8].getText().equals("")){
            buttons[4].setText("O");
            buttons[4].setEnabled(false);                
        } else if(buttons[3].getText().equals("O") && buttons[6].getText().equals("O") && buttons[9].getText().equals("")){
            buttons[9].setText("O");
            buttons[9].setEnabled(false);                
        }
        
        else if(buttons[4].getText().equals("O") && buttons[7].getText().equals("O") && buttons[1].getText().equals("")){
            buttons[1].setText("O");
            buttons[1].setEnabled(false);                
        } else if(buttons[5].getText().equals("O") && buttons[8].getText().equals("O") && buttons[2].getText().equals("")){
            buttons[2].setText("O");
            buttons[2].setEnabled(false);                
        } else if(buttons[6].getText().equals("O") && buttons[9].getText().equals("O") && buttons[3].getText().equals("")){
            buttons[3].setText("O");
            buttons[3].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("O") && buttons[7].getText().equals("O") && buttons[4].getText().equals("")){
            buttons[4].setText("O");
            buttons[4].setEnabled(false);                
        } else if(buttons[2].getText().equals("O") && buttons[8].getText().equals("O") && buttons[5].getText().equals("")){
            buttons[5].setText("O");
            buttons[5].setEnabled(false);                
        } else if(buttons[3].getText().equals("O") && buttons[9].getText().equals("O") && buttons[6].getText().equals("")){
            buttons[6].setText("O");
            buttons[6].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("O") && buttons[5].getText().equals("O") && buttons[9].getText().equals("")){
            buttons[9].setText("O");
            buttons[9].setEnabled(false);                
        } else if(buttons[5].getText().equals("O") && buttons[9].getText().equals("O") && buttons[1].getText().equals("")){
            buttons[1].setText("O");
            buttons[1].setEnabled(false);                
        } else if(buttons[1].getText().equals("O") && buttons[9].getText().equals("O") && buttons[5].getText().equals("")){
            buttons[5].setText("O");
            buttons[5].setEnabled(false);                
        }
        
        else if(buttons[3].getText().equals("O") && buttons[5].getText().equals("O") && buttons[7].getText().equals("")){
            buttons[7].setText("O");
            buttons[7].setEnabled(false);                
        } else if(buttons[7].getText().equals("O") && buttons[5].getText().equals("O") && buttons[3].getText().equals("")){
            buttons[3].setText("O");
            buttons[3].setEnabled(false);                
        } else if(buttons[7].getText().equals("O") && buttons[3].getText().equals("O") && buttons[5].getText().equals("")){
            buttons[5].setText("O");
            buttons[5].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("X") && buttons[2].getText().equals("X") && buttons[3].getText().equals("")){
            buttons[3].setText("O");
            buttons[3].setEnabled(false);
        } else if(buttons[4].getText().equals("X") && buttons[5].getText().equals("X") && buttons[6].getText().equals("")){
            buttons[6].setText("O");
            buttons[6].setEnabled(false);                
        } else if(buttons[7].getText().equals("X") && buttons[8].getText().equals("X") && buttons[9].getText().equals("")){
            buttons[9].setText("O");
            buttons[9].setEnabled(false);                
        } 
        
        else if(buttons[2].getText().equals("X") && buttons[3].getText().equals("X") && buttons[1].getText().equals("")){
            buttons[1].setText("O");
            buttons[1].setEnabled(false);                
        } else if(buttons[5].getText().equals("X") && buttons[6].getText().equals("X") && buttons[4].getText().equals("")){
            buttons[4].setText("O");
            buttons[4].setEnabled(false);                
        } else if(buttons[8].getText().equals("X") && buttons[9].getText().equals("X") && buttons[7].getText().equals("")){
            buttons[7].setText("O");
            buttons[7].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("X") && buttons[3].getText().equals("X") && buttons[2].getText().equals("")){
            buttons[2].setText("O");
            buttons[2].setEnabled(false);                
        } else if(buttons[4].getText().equals("X") && buttons[6].getText().equals("X") && buttons[5].getText().equals("")){
            buttons[5].setText("O");
            buttons[5].setEnabled(false);                
        } else if(buttons[7].getText().equals("X") && buttons[9].getText().equals("X") && buttons[8].getText().equals("")){
            buttons[8].setText("O");
            buttons[8].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("X") && buttons[4].getText().equals("X") && buttons[7].getText().equals("")){
            buttons[7].setText("O");
            buttons[7].setEnabled(false);                
        } else if(buttons[2].getText().equals("X") && buttons[5].getText().equals("X") && buttons[8].getText().equals("")){
            buttons[8].setText("O");
            buttons[8].setEnabled(false);                
        } else if(buttons[3].getText().equals("X") && buttons[6].getText().equals("X") && buttons[9].getText().equals("")){
            buttons[9].setText("O");
            buttons[9].setEnabled(false);                
        }
        
        else if(buttons[4].getText().equals("X") && buttons[7].getText().equals("X") && buttons[1].getText().equals("")){
            buttons[1].setText("O");
            buttons[1].setEnabled(false);                
        } else if(buttons[5].getText().equals("X") && buttons[8].getText().equals("X") && buttons[2].getText().equals("")){
            buttons[2].setText("O");
            buttons[2].setEnabled(false);                
        } else if(buttons[6].getText().equals("X") && buttons[9].getText().equals("X") && buttons[3].getText().equals("")){
            buttons[3].setText("O");
            buttons[3].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("X") && buttons[7].getText().equals("X") && buttons[4].getText().equals("")){
            buttons[4].setText("O");
            buttons[4].setEnabled(false);                
        } else if(buttons[2].getText().equals("X") && buttons[8].getText().equals("X") && buttons[5].getText().equals("")){
            buttons[5].setText("O");
            buttons[5].setEnabled(false);                
        } else if(buttons[3].getText().equals("X") && buttons[9].getText().equals("X") && buttons[6].getText().equals("")){
            buttons[6].setText("O");
            buttons[6].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("X") && buttons[5].getText().equals("X") && buttons[9].getText().equals("")){
            buttons[9].setText("O");
            buttons[9].setEnabled(false);                
        } else if(buttons[5].getText().equals("X") && buttons[9].getText().equals("X") && buttons[1].getText().equals("")){
            buttons[1].setText("O");
            buttons[1].setEnabled(false);                
        } else if(buttons[1].getText().equals("X") && buttons[9].getText().equals("X") && buttons[5].getText().equals("")){
            buttons[5].setText("O");
            buttons[5].setEnabled(false);                
        }
        
        else if(buttons[3].getText().equals("X") && buttons[5].getText().equals("X") && buttons[7].getText().equals("")){
            buttons[7].setText("O");
            buttons[7].setEnabled(false);                
        } else if(buttons[7].getText().equals("X") && buttons[5].getText().equals("X") && buttons[3].getText().equals("")){
            buttons[3].setText("O");
            buttons[3].setEnabled(false);                
        } else if(buttons[7].getText().equals("X") && buttons[3].getText().equals("X") && buttons[5].getText().equals("")){
            buttons[5].setText("O");
            buttons[5].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("X") && buttons[5].getText().equals("O") && buttons[9].getText().equals("X")) {
            buttons[6].setText("O");
            buttons[6].setEnabled(false);            
        }    
        
        else if(buttons[3].getText().equals("X") && buttons[5].getText().equals("O") && buttons[7].getText().equals("X")) {
            buttons[4].setText("O");
            buttons[4].setEnabled(false);            
        }
        
        else if(buttons[5].getText().equals("")){
            buttons[5].setText("O");
            buttons[5].setEnabled(false);                
        }
        
        else if(buttons[1].getText().equals("")){
            buttons[1].setText("O");
            buttons[1].setEnabled(false);                
        }
        else {
            if(count >= 9)
                checkWin();
            else
                RandomMove();
        }
        
        checkWin();

    }
    
    public void RandomMove(){
        Random x = new Random();
        int y = 1 + x.nextInt(9);
        if(buttons[y].getText().equals("O") || buttons[y].getText().equals("X") ){
            RandomMove();
        } else {
            buttons[y].setText("O");
            buttons[y].setEnabled(false);
        }
    }
    
    public void checkWin(){ 
            
        /*Determine who won*/
        for(int i=0; i<=7; i++){
            if( buttons[winCombinations[i][0]].getText().equals(buttons[winCombinations[i][1]].getText()) && 
                buttons[winCombinations[i][1]].getText().equals(buttons[winCombinations[i][2]].getText()) && 
                !buttons[winCombinations[i][0]].getText().equals("")) {
                win = true;
            }
        }

        if(count % 2 == 0)
            letter = "O";
        else
            letter = "X";
        
        /*Show a dialog when game is over*/
        if(win == true){
            JOptionPane.showMessageDialog(null, letter + " wins!");
if(letter=="X")
{
Global1.check_wins++;
Global1.total_games++;
}
else if(letter=="O"){
Global1.check_wins1++;
Global1.total_games++;
}
            
        } else if(count >= 9 && win == false){
Global1.total_games++;
            JOptionPane.showMessageDialog(null, "The game was tie!");
            
        }
    }
    public static void main(String[] args){
        new TicTacToeV4();
    }
}
class SaveFile1
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
class SimpleTableExample1 extends JFrame 
 {
	// Instance attributes used in this example
	private	JPanel		topPanel;
	private	JTable		table;
	private	JScrollPane scrollPane;
	


	
	public SimpleTableExample1()
	{
		// Set the frame characteristics
		setTitle( "Simple Table Application" );
		setSize( 300, 200 );
	    setBackground( Color.gray );

		// Create a panel to hold all other components
		topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );
Global1.percentage_games=(((Global1.check_wins)/(Global1.total_games)))*100;
Global1.percentage_games1=(((Global1.check_wins1)/(Global1.total_games)))*100;

		// Create columns names
		String columnNames[] = { "Player", "Wins","PercentageWin","TotalGames" };

		// Create some data
		Double dataValues[][] =
		{
			{ 1.0,Global1.check_wins,Global1.percentage_games,Global1.total_games  },
			{ 2.0,Global1.check_wins1,Global1.percentage_games1,Global1.total_games },
			
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
class Global1 {

public static double  check_wins=0;
public static double  check_wins1=0;
public static double  total_games=0;
public static double  percentage_games;
public static double percentage_games1;
}