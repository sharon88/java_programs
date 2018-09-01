package JavaPrograms;

public class MainArguments {

    public static void main(String args[]) {
        int argumentLenght,i=0;
        System.out.println("test");
        argumentLenght = args.length;
        while (i < argumentLenght){
            System.out.println(args[i]);
            i ++;
        }
    }
}
