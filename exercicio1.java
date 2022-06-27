
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class exercicio1 {

public static void main( String [] args) {
   try (Scanner input   = new Scanner(System.in)) {
    int numero1;
    double soma;
    int numero2;
    double subtracao;
    double divisao;
    double multiplicacao;
      System.out.println( "Digite o primeiro número");
      numero1 = input.nextInt();
    
      System.out.println( "Digite o segundo número");
      numero2 = input.nextInt();
    
      soma = numero1 + numero2;
      subtracao = numero1 - numero2;
      divisao = numero1 / numero2;
      multiplicacao = numero1 * numero2;
    
      System.out.println("A soma é: " + soma);
      System.out.println("A subtracao é: " + subtracao);
      System.out.println("A divisao é: " + divisao);
      System.out.println("A multiplicacao é: " + multiplicacao);
  }
 }
}
