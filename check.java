package whether_prime;
import java.util.Scanner;
public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int user_input = input.nextInt();
        int x = user_input ;
        for (int i = 2; i<x;i++){
        	
        	boolean isPrime = true;
        	
        	
        		if (x%i == 0){
        			isPrime = false;
        			
        		}
        		if (isPrime){
            		System.out.print("It is a prime number");
            		break;
        		}
        		else{
        			System.out.println("It is a composite number");
        			break;
        		}
        		
        	}
        
        }
        
	}


