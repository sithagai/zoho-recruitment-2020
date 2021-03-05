import java.util.Scanner;

public class JavaPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    Scanner key = new Scanner(System.in);
	    System.out.println("Enter input");
	    String input = key.nextLine();
	    
	    char[] inputArr = input.toCharArray();
	    
	    for (int i = input.length(); i >= 0; i--)
        {
          
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            int charval = (input.length()/2);
            for (int k = i; k <= input.length(); k++)
            {
            	if(charval >= input.length())
            	{
            	charval = 0;
            	}
                System.out.print(inputArr[charval]);
                charval++;
            }
            System.out.println();
        }
    
	    
	    
	    
	
}

}
