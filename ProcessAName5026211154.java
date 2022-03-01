import java.util.Scanner;

public class ProcessAName5026211154 {

public static void main(String[] args){
    Scanner console = new Scanner (System.in);
    System.out.print("Type your name is:");

    String name = console.nextLine();
    int index = name.indexOf(' ');
    String result1 = name.substring(index + 1);
    String result2 = name.substring(0,1);

    System.out.println("Your name is: "+result1+", "+result2+".");
    
    }
}
