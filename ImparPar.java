import java.lang.management.ThreadInfo;
import java.lang.reflect.Method;
import java.util.Scanner;

import javax.swing.InputMap;

public class ImparPar{

    public static void main( String [] args){
        Scanner entrada = new Scanner(System.in);
        
        int num1;
    System.out.println("Escreva o número.");
    num1 = entrada.nextInt();

if (num1 % 2 == 0) {
    System.out.println("O número é par.");
} else {
System.out.println("O número é impar.");    
}       
}
}