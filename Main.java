// Name: Tyler Oakes
//Date: 02/16/2025
// COLLABORATORS: <tutors, instructor, or anyone else who helped you>

// DESCRIPTION: <a sentence about what the purpose of this program is>

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double initialAmount = 4.15;
    int centsRemaining = 0;
    int numQuarters = 0;
    int numDimes = 0;
    int numNickels = 0;

    //CALCULATION SECTION
    centsRemaining = (int) (initialAmount * 100);
    numQuarters = centsRemaining / 25; //integer division 
    centsRemaining = centsRemaining % 25; //or centsRemaining %= 25;
    numDimes = centsRemaining / 10; //divide to get dimes
    centsRemaining %= 10; //get remaining cents after exchange for dimes
    numNickels = centsRemaining / 5; //divdie to get nickels
    centsRemaining %= 5; //get remaining cents after exchanging for nickels
    //OUTPUT SECTION
    System.out.println(centsRemaining); 
    System.out.println(numQuarters);
    System.out.println(numDimes);
    System.out.println(numNickels);

    System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickels, and %d pennies.", 
    initialAmount, numQuarters, numDimes, numNickels, centsRemaining);

  }

}
