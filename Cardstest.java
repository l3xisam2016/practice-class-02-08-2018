package playing;
import java.util.Scanner;
public class Cardstest {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	Cards card1type1= new Cards(3,"Clover");//1st Type
	Cards card2type2 =new Cards(1,"Diamond");
	Cards card3type3= new Cards(4,"Spades");
	Cards Lucky= new Cards(1,"Spades");//Lucky Type
	Cards card4type4= new Cards(8,"Clover");
	Cards card5type5= new Cards(2,"Hearts");
	Cards card6type6= new Cards(10,"Hearts");//3rd Type
	Cards card7type7= new Cards(5,"Diamond");
	Cards card8type8= new Cards(3,"Spades");//2nd Type
	
	System.out.println(card1type1.Number+card1type1.Suit);
	System.out.println(card2type2.Number+card2type2.Suit);
	System.out.println(card3type3.Number+card3type3.Suit);
	System.out.println(Lucky.Number+Lucky.Suit);
	System.out.println(card4type4.Number+card4type4.Suit);
	System.out.println(card5type5.Number+card5type5.Suit);
	System.out.println(card6type6.Number+card6type6.Suit);
	System.out.println(card7type7.Number+card7type7.Suit);
	System.out.println(card8type8.Number+card8type8.Suit);
	
	System.out.println("What suit do you want?");
	String Suit=scanner.nextLine();
	
	System.out.println("What number do you want?");
	int number=scanner.nextInt();
	
	if(Suit.equalsIgnoreCase("Spades") &&(number==1)) {
		System.out.println("You win");
				} else {

		System.out.println("You lose");
	}
		
		
	}
	
	
	}


	
	

