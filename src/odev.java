import java.util.Random;

public class odev {

	public static void main(String[] args) {
		int[] numbers= {58,56,2,30,7,40};
		BogoSort(numbers);
		
	}
	
	public static int[] BogoSort(int[] numbers)
	{
	    Random rnd = new Random();
	    while(true)
	    {
	        boolean sorted = true;
	        for(int i = 0; i < numbers.length-1; i++) {
	            if(numbers[i] > numbers[i+1])
	                sorted = false;
	        }
	        if (sorted) {
	        	for(int i=0;i<numbers.length;i++)
	        		System.out.println(numbers[i]);
	            return numbers;
	        }
	        for(int i = numbers.length - 1; i > 0; i--)
	        {

	            int rand = rnd.nextInt(i);
	            int temp = numbers[i];
	            numbers[i] = numbers[rand];
	            numbers[rand] = temp;
 
	        }
	    }
	}

}

