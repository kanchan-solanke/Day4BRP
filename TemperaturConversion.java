import java.util.Scanner;

public class Temperature {
    static double celsius(double f)
    {
        return  (f-32)*5/9;
    }
    static double fahrenheit(double c){
        return (c* 9/5)+32;
    }
    public static void main(String[] args) {
        double a,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Fahrenheit temperature: ");
        a=sc.nextDouble();
        System.out.println("Celsius temperature is = "+celsius(a));
        System.out.println("Enter Celsius temperature: ");
        c=sc.nextDouble();
        System.out.println("Fahrenheit temperature is: "+fahrenheit(c));

    }

}



