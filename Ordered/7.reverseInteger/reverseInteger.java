import java.util.Scanner;

public class reverseInteger {

	public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a number to reverse : ");

			int original = scanner.nextInt();
			long reverse = 0;
			long remainder;

			while(original !=0){

				remainder = original % 10;
				reverse = reverse *10 +remainder;
				original = original / 10; //remove the last value(remainder)
			
			}

			System.out.println("Reverse of number is :" + reverse);


	}
}