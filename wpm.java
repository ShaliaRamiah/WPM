import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class wpm {
	
	static String[] words = {"the", "quick", "brown", "fox", "jumped", "over", "lazy", "dog"};

	public static void main(String[] args) throws InterruptedException {

		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);

		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		

        //random number generator
		Random random = new Random();
        for(int i= 0; i< 8; i++){
            System.out.print(words[random.nextInt(7)] + " ");       
        } 

        double begin = LocalTime.now().toNanoOfDay(); //start timer (double = double variable)

        System.out.println(); //printing a new line 

        Scanner scan = new Scanner(System.in);
        String wordsTyped = scan.nextLine();


        double finish = LocalTime.now().toNanoOfDay(); //ending timer
        double time = finish - begin; //subtracting the difference
        double seconds = time / 1000000000.0; //convert it to seconds
        int characters = wordsTyped.length(); //number of input characters

        //wpm formula
        //(x characters / 5) / 1 min = y wpm
        int wpm = (int) ((((double) characters / 5) / seconds)* 60);

        System.out.println("your words per minute is " + wpm);

	}

}