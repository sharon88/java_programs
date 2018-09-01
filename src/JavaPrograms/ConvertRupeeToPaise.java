package JavaPrograms;

import java.util.Scanner;

public class ConvertRupeeToPaise {

    public float readRupee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupee:");
        float value = sc.nextFloat();
        return value;
    }

    public void convertToPaise(float value){
        int paiseValue = (int)(value*100);
        System.out.println("The paise value is "+paiseValue);
    }
}
