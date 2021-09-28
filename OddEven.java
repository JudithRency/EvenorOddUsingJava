import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ac= new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num= ac.nextInt();
        if (num%2==0)
        {
        	System.out.println("Even");
        }
        else
        {
        	System.out.println("Odd");
        }
        ac.close();
	}

}