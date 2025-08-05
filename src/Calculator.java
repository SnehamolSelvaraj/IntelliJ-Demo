import java.util.Scanner;


public class Calculator {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);

     System.out.print("enter a number(p):");
     double principal=sc.nextDouble();
     System.out.print("enter a number(R):");
     double rate=sc.nextDouble();
     System.out.print("enter a number(T):");
     double time=sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest (SI) = ₹" + simpleInterest);

        sc.close();


    }

}
