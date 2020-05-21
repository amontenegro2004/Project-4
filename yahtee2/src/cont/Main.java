package cont;
import javax.swing.JOptionPane;
public class Main {
	/* Main method to run the program and the method below.
	*/
	public static void main(String[] args) {
		hello();
	}
	/* Method that controls the game rules and interface. Starts off with making the 
	* window and then gives an option box, that has what dice roll you would like to change.
	* If not, then it takes you to an input box that asks what rol you want to increase the value of.
	* If so, it will randomize the dice you choose and then repeat the process as stated before.
	* After, 3 rounds, to win you have to get 50 points. If you have it, then you won and asks if
	* you want to play again. If not, then you lose.
	*/
	public static void hello() {
		
		JOptionPane.showMessageDialog(null, "Welcome to One Player Yahtzee");
		//INSTANCE VARIABLES
		int x =0;
		int rolls2 = 1;
		int score2=0;
		
		Window w= new Window();
		boolean oneuse=false;
		boolean twouse=false;
		boolean threeuse=false;
		boolean fouruse=false;
		boolean fiveuse=false;
		boolean sixuse=false;
	
		while(rolls2 <=3) {
			//INSTANCE VARIABLES
			int num1 = (int)(Math.random()*6 +1);
			int num2 = (int)(Math.random()*6 +1);
			int num3 = (int)(Math.random()*6 +1);
			int num4 = (int)(Math.random()*6 +1);
			int num5 = (int)(Math.random()*6 +1);
			ifSeven(num1);
			ifSeven(num2);
			ifSeven(num3);
			ifSeven(num4);
			ifSeven(num5);
			int Rolls = 3;
			
			int result2=0;
			
			String[] options1 = {"Dice 1","Dice 2","Dice 3","Dice 4","Dice 5","Change Nothing","Help","Exit"};
			String[] options2 = {"Dice 1","Dice 2","Dice 3","Dice 4","Dice 5"};
			String[] options3 = {"1","2","3","4","5","6"};
			
			for(int i = 0; i<Rolls;i+=0) {
				int result = w.option(options1,"Select the numbers of the dice to be changed:" +"\nRolls:" +Rolls+" ("+num1+") "+" ("+num2+") "+" ("+num3+") "+" ("+num4+") "+" ("+num5+") ")+1;
				buttons(result,Rolls);
				if(result ==6) {
					Rolls=0;
				}
				else if(result!=7&&result!=0) {
					Rolls-=1;
				}
				//Check if num1 is through all if statements
				if(result ==1||result ==2||result ==3||result ==4||result ==5) {
					for(int p = 0; p<result;p++) {
						result2 = w.option(options2,"Change these number rolls of the dice:"+" ("+num1+") "+" ("+num2+") "+" ("+num3+") "+" ("+num4+") "+" ("+num5+") ")+1;
						int l = result2;
						
						if(l ==1) {
							num1 = (int)(Math.random()*6 +1);
							
							System.out.println("n1");
							
						
						}
						if(l ==2) {
							num2 = (int)(Math.random()*6 +1);
							
							System.out.println("n2");
							
						
						}
						if(l ==3) {
							num3 = (int)(Math.random()*6 +1);
							
							System.out.println("n3");
							
							
						}
						if(l ==4) {
							num4 = (int)(Math.random()*6 +1);
							
							System.out.println("n4");
							
						}
						if(l ==5) {
							num5 = (int)(Math.random()*6 +1);
						
							System.out.println("n5");
							
							
						}
					}
				}
				
			}
			String s = JOptionPane.showInputDialog(null,"("+num1+")"+"("+num2+")"+"("+num3+")"+"("+num4+")"+"("+num5+")"+"\nWhich number would you increase the value of to help you win? "
					+ "\n You must type an integer into the input box"+
					"\n Choose to increase the ones:      1"+"   = - = Value = " +ones(0,num1,num2,num3,num4,num5)*1 +
					"\n Choose to increase the twos:      2"+"    = - = Value = " +twos(0,num1,num2,num3,num4,num5)*2 +
					"\n Choose to increase the threes:      3"+"    = - = Value = " +threes(0,num1,num2,num3,num4,num5)*3 +
					"\n Choose to increase the fours:      4"+"    = - = Value = " +fours(0,num1,num2,num3,num4,num5)*4 +
					"\n Choose to increase the fives:      5"+"    = - = Value = " +fives(0,num1,num2,num3,num4,num5)*5 +
					"\n Choose to increase the sixes:      6"+"    = - = Value = " +sixes(0,num1,num2,num3,num4,num5)*6);
		
			
			int score = Integer.parseInt(s);
			if(ones(score,num1,num2,num3,num4,num5)*1 == 3) {
				JOptionPane.showMessageDialog(null, "You got three of a kind of ones");
				x = x +num1+ num2+num3 +num4+num5 - 3;
			}
			if(twos(score,num1,num2,num3,num4,num5)*2 == 6) {
				JOptionPane.showMessageDialog(null, "You got three of a kind of twos");
				x = x +num1+ num2+num3 +num4+num5 - 6;
			}

			if(threes(score,num1,num2,num3,num4,num5)*3 == 9) {
				JOptionPane.showMessageDialog(null, "You got three of a kind of threes");
				x = x +num1+ num2+num3 +num4+num5 -9;
			}
			if(fours(score,num1,num2,num3,num4,num5)*4 == 12) {
				JOptionPane.showMessageDialog(null, "You got three of a kind of fours");
				x = x +num1+ num2+num3 +num4+num5 -12;
			}
			if(fives(score,num1,num2,num3,num4,num5)*5 == 15) {
				JOptionPane.showMessageDialog(null, "You got three of a kind of fives");
				x = x +num1+ num2+num3 +num4+num5-15;
			}
			if(sixes(score,num1,num2,num3,num4,num5)*6 == 18) {
				JOptionPane.showMessageDialog(null, "You got three of a kind of sixes");
				x = x +num1+ num2+num3 +num4+num5-18;
			}
			
			if(ones(score,num1,num2,num3,num4,num5)*1 == 4) {
				JOptionPane.showMessageDialog(null, "You got four of a kind of ones");
				x = x +num1+ num2+num3 +num4+num5-4;
			}
			if(twos(score,num1,num2,num3,num4,num5)*2 == 8) {
				JOptionPane.showMessageDialog(null, "You got four of a kind of twos");
				x = x +num1+ num2+num3 +num4+num5-8;
			}

			if(threes(score,num1,num2,num3,num4,num5)*3 == 12) {
				JOptionPane.showMessageDialog(null, "You got four of a kind of threes");
				x = x +num1+ num2+num3 +num4+num5-12;
			}
			if(fours(score,num1,num2,num3,num4,num5)*4 == 16) {
				JOptionPane.showMessageDialog(null, "You got four of a kind of fours");
				x = x +num1+ num2+num3 +num4+num5-16;
			}
			if(fives(score,num1,num2,num3,num4,num5)*5 == 20) {
				JOptionPane.showMessageDialog(null, "You got four of a kind of fives");
				x = x +num1+ num2+num3 +num4+num5-20;
			}
			if(sixes(score,num1,num2,num3,num4,num5)*6 == 25) {
				JOptionPane.showMessageDialog(null, "You got four of a kind of sixes");
				x = x +num1+ num2+num3 +num4+num5-25;
							}
			
			
			
			
			if(score == 1 && oneuse ==false) {
				
				
				
				w.msg("Your score before extra points is" +ones(score,num1,num2,num3,num4,num5)*1);
				
				score2+=ones(score,num1,num2,num3,num4,num5)*1;
				ones2(oneuse);
				
			}
			if(score == 2 && twouse ==false) {
			
				
				w.msg("Your score before extra points is" +twos(score,num1,num2,num3,num4,num5)*2);
				score2+=twos(score,num1,num2,num3,num4,num5)*2;
				twos2(twouse);
				
			}
			if(score == 3 && threeuse ==false) {
				
				w.msg("Your score before extra points is" +threes(score,num1,num2,num3,num4,num5)*3);
				score2+=threes(score,num1,num2,num3,num4,num5)*3;
				threes2(threeuse);
				
			}
			if(score == 4 && fouruse ==false) {
				
				
				w.msg("Your score before extra points is" +fours(score,num1,num2,num3,num4,num5)*4);
				score2+=fours(score,num1,num2,num3,num4,num5)*4;
				fours2(fouruse);
				
			}
			if(score == 5 && fiveuse ==false) {
				
				w.msg("Your score before extra points is" +fives(score,num1,num2,num3,num4,num5)*5);
				score2+=fives(score,num1,num2,num3,num4,num5)*5;
				fives2(fiveuse);
			
			}
			if(score == 6 && sixuse ==false) {
				
				w.msg("Your score before extra points is" +sixes(score,num1,num2,num3,num4,num5)*6);
				score2+=sixes(score,num1,num2,num3,num4,num5)*6;
				sixes2(sixuse);
				
				
				
				
				
			}
			
			
			
			
			
			x+=score2;
			w.msg("The total score is:" +x);
			
			
			
			
			
			
			
			if(x >= 50) {
				
				JOptionPane.showMessageDialog(null, "You won a Yahtzee");
				String f=JOptionPane.showInputDialog("Do you want to play again");
				if(f.equalsIgnoreCase("yes")){
					hello();
				}
				if(f.equalsIgnoreCase("no")){
					System.exit(0);
				}
				else {
					JOptionPane.showMessageDialog(null, "You need to type YES or NO");
				}
				
			}
			
			if(rolls2 == 3) {
				
				JOptionPane.showMessageDialog(null, "Your turns have ended");
				if(x >=50) {
					JOptionPane.showMessageDialog(null, "You won a Yahtzee");
					String f=JOptionPane.showInputDialog("Do you want to play again");
					if(f.equalsIgnoreCase("yes")){
						hello();
					}
					if(f.equalsIgnoreCase("no")){
						System.exit(0);
					}
					else {
						JOptionPane.showMessageDialog(null, "You need to type YES or NO");
					}
				}
				if(x <50) {
					
					String f=JOptionPane.showInputDialog("Do you want to play again");
					if(f.equalsIgnoreCase("yes")){
						hello();
					}
					if(f.equalsIgnoreCase("no")){
						System.exit(0);
					}
					else {
						JOptionPane.showMessageDialog(null, "You need to type YES or NO");
					}
				}
				
			}
			rolls2++;
		}
		
	}
	
	/* Checks if the roll is greater than seven, if so, remove one 
	* because the max roll is a 6.
	*/
	public static int ifSeven(int x) {
		if(x>6) {
			x--;
		}
		return x;
	}
	
	/* Method to be use to describe what the buttons are used for. If its the 9th button, 
	* it exits the program. If its the 8th button, then it displays a help section. Finally,
	* if its the 7th button, then it takes you to not change anythign for your roll.
	*/
	public static void buttons(int result,int Rolls) {
		if(result ==8) {
			System.exit(0);
		}
		if(result==7) {
			JOptionPane.showMessageDialog(null,"Help section: \n Press on the numbers that are to be changed of the dices value\n And then with those value, you have to correlate them with the exact value\n if the value is larger, it is then going to be worth more points\n, \nIf you get a three of a kind you get extra points added to your total of all the values together,\n and the same goes for four of a kind");
			
		}
		if(result==6) {
			Rolls=0;
		}
	}
	
	/* If the value of the returned value is a number, then set then parameters for each number equal to
	*  a random value of a roll.
	*/
	public static void reRoll(int score, int return2, int num1, int num2, int num3, int num4, int num5) {
		if(return2 ==1) {
			num1 = (int)(Math.random()*6 +1);
		}
		if(return2 ==2) {
			num2 = (int)(Math.random()*6 +1);
		}
		if(return2 ==3) {
			num3 = (int)(Math.random()*6 +1);
		}
		if(return2 ==4) {
			num4 = (int)(Math.random()*6 +1);
		}
		if(return2 ==5) {
			num5 = (int)(Math.random()*6 +1);
		}
		
	}
	/* If the roll for each dice is equal to one, then add one to a counter 
	* of ones. Then it returns the number of ones that was played in the 
	* round.
	*/
	public static int ones(int score, int num1, int num2, int num3, int num4, int num5) {
		int ones = 0;
		if(num1==1) {
			ones++;
		}
		if(num2==1) {
			ones++;
		}
		if(num3==1) {
			ones++;
		}
		if(num4==1) {
			ones++;
		}
		if(num5==1) {
			ones++;
		}
		
		return ones;
	}
	/* If the roll for each dice is equal to two, then add one to a counter 
	* of twos. Then it returns the number of twos that was played in the 
	* round.
	*/
	public static int twos(int score, int num1, int num2, int num3, int num4, int num5) {
		int twos = 0;
		if(num1==2) {
			twos++;
		}
		if(num2==2) {
			twos++;
		}
		if(num3==2) {
			twos++;
		}
		if(num4==2) {
			twos++;
		}
		if(num5==2) {
			twos++;
		}
		return twos;
	}
	
	/* If the roll for each dice is equal to three, then add one to a counter 
	* of threes. Then it returns the number of threes that was played in the 
	* round.
	*/
	public static int threes(int score, int num1, int num2, int num3, int num4, int num5) {
		int threes = 0;
		if(num1==3) {
			threes++;
		}
		if(num2==3) {
			threes++;
		}
		if(num3==3) {
			threes++;
		}
		if(num4==3) {
			threes++;
		}
		if(num5==3) {
			threes++;
		}
		return threes;
	}
	/* If the roll for each dice is equal to four, then add one to a counter 
	* of fours. Then it returns the number of fours that was played in the 
	* round.
	*/
	public static int fours(int score, int num1, int num2, int num3, int num4, int num5) {
		int fours = 0;
		if(num1==4) {
			fours++;
		}
		if(num2==4) {
			fours++;
		}
		if(num3==4) {
			fours++;
		}
		if(num4==4) {
			fours++;
		}
		if(num5==4) {
			fours++;
		}
		return fours;
	}
	/* If the roll for each dice is equal to five, then add one to a counter 
	* of fives. Then it returns the number of fives that was played in the 
	* round.
	*/
	public static int fives(int score, int num1, int num2, int num3, int num4, int num5) {
		int fives = 0;
		if(num1==5) {
			fives++;
		}
		if(num2==5) {
			fives++;
		}
		if(num3==5) {
			fives++;
		}
		if(num4==5) {
			fives++;
		}
		if(num5==5) {
			fives++;
		}
		return fives;
	}
	/* If the roll for each dice is equal to six, then add one to a counter 
	* of sixes. Then it returns the number of sixes that was played in the 
	* round.
	*/
	public static int sixes(int score, int num1, int num2, int num3, int num4, int num5) {
		int sixes = 0;
		if(num1==6) {
			sixes++;
		}
		if(num2==6) {
			sixes++;
		}
		if(num3==6) {
			sixes++;
		}
		if(num4==6) {
			sixes++;
		}
		if(num5==6) {
			sixes++;
		}
		return sixes;
	}
	
	/* Sets the value of increasing the value of one
	* equal to true, if you chose to increase its
	* value.
	*/
	public static void ones2(boolean oneuse) {
		oneuse = true;
	}
	/* Sets the value of increasing the value of three
	* equal to true, if you chose to increase its
	* value.
	*/
	public static void threes2(boolean threeuse) {
		threeuse = true;
	}
	/* Sets the value of increasing the value of two
	* equal to true, if you chose to increase its
	* value.
	*/
	public static void twos2(boolean twouse) {
		twouse = true;
	}
	/* Sets the value of increasing the value of four
	* equal to true, if you chose to increase its
	* value.
	*/
	public static void fours2(boolean fouruse) {
		fouruse = true;
	}
	/* Sets the value of increasing the value of five
	* equal to true, if you chose to increase its
	* value.
	*/
	public static void fives2(boolean fiveuse) {
		fiveuse = true;
	}
	/* Sets the value of increasing the value of six
	* equal to true, if you chose to increase its
	* value.
	*/
	public static void sixes2(boolean sixuse) {
		sixuse = true;
	}
		
}
