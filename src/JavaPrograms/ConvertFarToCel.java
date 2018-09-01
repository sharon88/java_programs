package JavaPrograms;

import java.util.Scanner;

public class ConvertFarToCel {

    private int getFarValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the far value:");
        int farValue=scanner.nextInt();
        return farValue;
    }

    public void convertToCelcius(){
        int farValue=getFarValue();
        float celsius = (farValue-32)/1.8f;
        System.out.println("Celsius value is:"+celsius);
    }
}
