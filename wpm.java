import java.util.Random;
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
		System.out.println(words[random.nextInt(8)]);


	}

}