import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    double F;
	    double C;
	    double K;
	    String choice;
	    
	    Scanner input = new Scanner(System.in);
	    Scanner input1 = new Scanner(System.in);
	    
	    System.out.println("Type in the Farhenheit(F), Celsius(C), and Kelvin(K): ");
	    System.out.print("\n\tF: ");
	    F = input.nextDouble();
	    System.out.print("\n\tC: ");
	    C = input.nextDouble();
	    System.out.print("\n\tK: ");
	    K = input.nextDouble();
	    
	    temperature temp = new temperature(F, C, K);
	    
	    System.out.println("\nConverting Farhenheit to Celsius => " + temp.FToC(F) + "\n");
	    System.out.println("Converting Celsius to Farhenheit => " + temp.CToF(C) + "\n");
	    
	    System.out.print("Do you want to see the conversion to Kelvin? Yes(y) or No(n):");
	    choice = input1.nextLine();
	    
	    if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("Y")) {
	        System.out.println("Converting Farhenheit to Kelvin => " + temp.FToK(F) + "\n");
	        System.out.println("Converting Celsius to Kelvin => " + temp.CToK(C) + "\n");
	    }
	    else 
	        System.out.println("\nOkay, but I will tell you about how \ndoes it feels at that temperature.\n");
	   System.out.print("At " + C + " degrees it is ");
	   temp.howItFeels(C);
	   
	}
}
