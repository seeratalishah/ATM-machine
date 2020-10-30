import java.util.*;
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount sa = new SavingAccount();
		int b = sa.getPin();
		
		System.out.println("Enter the pin");
		int x;
		
		Scanner obj = new Scanner(System.in);
		x= obj.nextInt();
		
		System.out.println("Select account type");
		System.out.println("Press 1 for saving account");
		System.out.println("Press 2 for current account");
		int y;
		y = obj.nextInt();
		if(b==x && y==1) {
			
			sa.savingTransactions();
			
		}
		
	
		

	}

}
