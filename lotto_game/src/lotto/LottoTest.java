package dayoon_lee_exercise2;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {

		int attempt;
		
	    for (attempt = 1; attempt <= 5; attempt++)
	    {
	    	Scanner input = new Scanner(System.in);
			
			System.out.print(" Enter the random number between 3 and 27: ");			
		    int userInput = input.nextInt();
		    
		    Lotto lotto = new Lotto();
		    
		    int randomSum = 0;
		    for (int counter = 0; counter < lotto.returnArray().length; counter++) {
		    	randomSum += lotto.returnArray()[counter];
		    }
		    
		    if (randomSum == userInput)
		    {
		    	System.out.println(" Win!");
		    	break;
		    }
		    else
		    {
		    	System.out.println(" Try again!");
		    }
	    }
	    if (attempt >= 5)
	    {
	    	System.out.println(" Lose..");
	    }
	}

}
