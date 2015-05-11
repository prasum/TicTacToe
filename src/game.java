import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class game extends JFrame  {
game()
{
	
final JFrame  f=new JFrame();
JPanel panel=new JPanel();
JLabel label=new JLabel("Select Game Mode");
JButton button1=new JButton("AI");
		JButton button2=new JButton("TWO PLAYER");
		f.setVisible(true);
		f.setTitle("GameMode");
		f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		label.setLayout(new BorderLayout(5,5));
		panel.add(label);
		
		panel.add(button1);
		panel.add(button2);
		f.getContentPane().add(panel);
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{ 
			f.setVisible(false);	
				new TicTacToe();
				
			}
		});
                button1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent g)
{
f.setVisible(false);
new TicTacToeV4();
}
});
	}
	


	public static void main(String args[])
	{
	}
	}

