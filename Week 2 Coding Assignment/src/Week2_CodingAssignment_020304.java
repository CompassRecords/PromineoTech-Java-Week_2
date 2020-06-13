
public class Week2_CodingAssignment_020304 {

	public static void main(String[] args) {
		/*
		Week 2 Coding Assignment
		Coding Steps: 2,3,4
		Student: Greg Beinecke
		 */
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 3;
		double moneyInWallet = 20;
		int howThirstyAreYou = 8;
				
		if (isHotOutside && hasMoneyInPocket);
			System.out.println("True");
		if (isHotOutside && isWeekday);
			System.out.println("True");
		if (isHotOutside && hasMoneyInPocket && isWeekday);
			System.out.println("True");
		if (isHotOutside && howThirstyAreYou >= 3 && moneyInWallet >= costOfMilk * 2);
		System.out.println("True");
	}
}