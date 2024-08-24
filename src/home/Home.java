package home;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a: ");
        a= sc.nextInt();
        System.out.println("nhap so b: ");
        b= sc.nextInt();

	int sum = a+b;
	int sub = a-b;
	int multi = a*b;
	float div = (float)a/b;
	float modulus = (float)a%b;
	        
	System.out.println("sum= "+sum);
	System.out.println("sub= "+sub);
	System.out.println("multi= "+multi);
	System.out.println("div= "+div);
	System.out.println("modulus= "+modulus);
    }
    
}
