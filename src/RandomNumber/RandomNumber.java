package RandomNumber;

import javax.swing.JOptionPane;

public class RandomNumber {
	public static void main( String[] args)
	 {
 
	  int CompMove;
	  int UserMove;
	  

	  int playoption = 0;
	  int compWin = 0;
	  int userWin = 0;
	  
	  
	  do {
		  CompMove = 0 +(int)(Math.random()*10);
		  UserMove = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number 0 to 10"));
		  
		  if (UserMove == CompMove) 
		  {
			  JOptionPane.showMessageDialog(null,"You Win \n Both Choose Same Number \n" + UserMove);
			  userWin = userWin + 1;
		  }
		  else
		  {
			  if (CompMove < UserMove)
				  {
					  JOptionPane.showMessageDialog(null,"You Loose \n You number is High");
				  }
			  else
				  {
					  JOptionPane.showMessageDialog(null,"You Loose \n You number is Low");
				  }
			  compWin = compWin + 1;
		  }
		 
		  playoption = playoption + 1; 
	  
      } while (playoption < 3);
	  
	  JOptionPane.showMessageDialog(null,"You Wins " + userWin + " times \n" + "Computer Wins " + compWin + " times \n");
	  
	 }
}