
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Tom";
		String lastName = "Bell";
		
		double itemPrice = 20.00;
		double amtInWallet = 38.00;
		double newAmtInWallet = amtInWallet - itemPrice;
		System.out.println("After I bought a shirt, I have " + "$" + newAmtInWallet + " left in my wallet.");
		
		
		int numberOfFriends = 2;
		int age = 38;
		double myFriends = age + numberOfFriends;
		String fullName = firstName + " " + lastName;
		System.out.println("I've made " + numberOfFriends + " friends each year of my life. " + "Now I have " + myFriends + " friends.");
		System.out.println("My friends full name is " + fullName);
		
	}

}
