
import java.util.*;
public class SavingAccount extends Account {
	
	int currentBalance =0;
	public int getPin()
	{
		pin = 1234;
		
		return pin;
	}
	
	public void savingTransactions()
	{
		System.out.println("What type of transaction do you want");
		System.out.println("Press 1 for Withdraw amount");
		System.out.println("Press 2 for Deposite amount");
		System.out.println("Press 3 for Check balance");
		
		int type;
		
		Scanner obj = new Scanner(System.in);
		type = obj.nextInt();
		
		switch(type)
		{
		case 1:
			
			int withdrawAmount;
			System.out.println("Enter the amount you want to withdraw");
			
			withdrawAmount = obj.nextInt();
			
			if( currentBalance >withdrawAmount)
			{
				currentBalance = currentBalance - withdrawAmount;
			}
			
			else
			{
				System.out.println("You have not sufficient balance");
			}
			break;
			
		case 2:
			
			int depositAmount;
			System.out.println("Enter the amount you want to deposite");
			depositAmount = obj.nextInt();
			
			currentBalance = currentBalance + depositAmount;
			break;
			
		case 3:
			System.out.println("Your current balance is : "+ currentBalance);
			break;
			
			default:
				System.out.println("Invalid transaction");
				break;				
		}
		
		System.out.println("Do you want to continue 1 for yes and 2 for no");
		int a;
		a = obj.nextInt();
		
		if(a==1)
		{
			savingTransactions();
		}
		
		else
			System.out.println("Thank you for using atm");
		
	}
	
	

}
