//import stuff here
import java.util.Scanner;

//Your code here
public class Program8 {
    public static void main(String[] args) {
        int number1;
        
        int number2;
        
        
        
        System.out.println("Enter number 1: ");
        System.out.println();
        
        Scanner numberScanner1 = new Scanner(System.in);
        number1 = numberScanner1.nextInt();
        System.out.println();
        
    
        System.out.println("Enter number 2: ");
        System.out.println();

        Scanner numberScanner2 = new Scanner(System.in);
        number2 = numberScanner2.nextInt();
        
        
        Calculator calculate = new Calculator(number1, number2);
        System.out.println();
        System.out.println("Sum: " + calculate.getSum());
        System.out.println();
        System.out.println("Difference: " + calculate.getDifference());
        System.out.println();
        System.out.println("Product: " + calculate.getProduct());
        System.out.println();
        System.out.println("Average: " + calculate.getAverage());
        System.out.println();
        System.out.println("AbsoluteValue: " + calculate.getAbsoluteValue());
        System.out.println();
        System.out.println("MaximumValue: " + calculate.getMaximumValue());
        System.out.println();
        System.out.println("MinimumValue: " + calculate.getMinimumValue());
        System.out.println();

        
        
    }
}
//Paste console output below:
/*
Enter number 1: 

13

Enter number 2: 

20

Sum: 33

Difference: -7

Product: 260

Average: 16.5

AbsoluteValue: 7

MaximumValue: 20

MinimumValue: 13


*/


--------------------------------------------------------------------------------------------------------------------------------

public class Calculator
{
    
    int Sum;
    
    int Difference;
    
    int Product;
    
    double Average;
    
    int AbsoluteValue;
    
    int MaximumValue;
    
    int MinimumValue;

    
    public Calculator(int number1, int number2)
    {
        
        Sum = number1 + number2;
        
        Difference = number1 - number2;
        
        Product = number1 * number2;
        
        Average = (number1 + number2) / 2.0;
        
        AbsoluteValue = Math.abs(number1 - number2);
        
        MaximumValue = (number1 + number2 + AbsoluteValue) / 2;
        
        MinimumValue = (number1 + number2 - AbsoluteValue) / 2;
        
        
    }

    public int getSum() {
    return Sum;
}

    public int getDifference() {
    return Difference;
}

    public int getProduct() {
    return Product;
}

    public double getAverage() {
    return Average;
}

    public int getAbsoluteValue() {
    return AbsoluteValue;
}

    public int getMaximumValue() { 
    return MaximumValue;
}

    public int getMinimumValue() {
    return MinimumValue;
}
    }
