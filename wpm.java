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
		
		Random random = new Random();
        for(int i= 0; i< 9; i++){
            System.out.print(words[random.nextInt(8)] + " ");       
        } 

        double begin = LocalTime.now().toNanoOfDay();

        System.out.println();

        Scanner scan = new Scanner(System.in);
        String wordsTyped = scan.nextLine();


        double finish = LocalTime.now().toNanoOfDay();
        double time = finish - begin;
        double seconds = time / 1000000000.0;
        int characters = wordsTyped.length();

        //wpm formula
        //(x characters / 5) / 1 min = y wpm
        int wpm = (int) ((((double) characters / 5) / seconds)* 60);

        System.out.println("your words per minute is" + wpm);

	}

}