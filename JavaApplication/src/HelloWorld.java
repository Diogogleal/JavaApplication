
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {

		Scanner reader = new Scanner (System.in);
		int num;
		String word;
		System.out.println("Option 1 if you are human.\nOption 2 if you are a robot.");
		num=reader.nextInt();
		if (num==1){
			System.out.println("Enter your name");
			word=reader.next();
			System.out.println("Hello this is" +word);
		}else {System.out.println("Stupid Robot!!");}
		
	}

}
