
public class Week2_CodingAssignment_05Loops {

	public static void main(String[] args) {
		/*
		Week 2 Coding Assignment
		Coding Step 5
  		Student: Greg Beinecke
  		*/

System.out.println("A. A while loop that prints all even numbers from 0 to 100");
int x = 0;
		
while (x <= 100) {
	System.out.println(x);
	x += 2;}


System.out.println("B. A while loop that prints every 3rd number going backwards from 100 until we reach 0.");
x = 100;

while (x >= 0) {
	System.out.println(x);
	x -= 3;}

System.out.println("C. A for loop that prints every other number from 1 to 100.");
for (int i = 1; i <= 100; i += 2) {
	System.out.println(i);}

System.out.println("D. A for loop that prints every number from 0 to 100, \n" + 
		" but if the number is divisible by 3, it prints “Hello” \n" + 
		" instead of the number, and if the number is divisible by 5, \n" + 
		" it prints “World” instead of the number, and if it is divisible \n" + 
		" by both 3 and 5, it prints “HelloWorld” instead of the number.");
for (int i = 0; i <= 100; i++) {
	
	if (i % 15 == 0) {
		System.out.println("HelloWorld");
	} else if (i % 5 == 0) {
		System.out.println("World");
	} else if (i % 3 == 0) {
		System.out.println("Hello");
	} else {
		System.out.println(i);}
	
}
}
}