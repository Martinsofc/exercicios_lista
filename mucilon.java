//Hiury Maertins 
import java.util.Scanner;
import javax.swing.*;
public class mucilon {
    
    public static void main(String[] args){
       try (Scanner imput = new Scanner(System.in)){
        int idade;
          System.out.println( "Digite sua idade:");
          idade = imput.nextInt();

          if (idade <= 2)
          {
            JOptionPane.showMessageDialog(null, "Bebê");
          }

          if (idade <= 11)
            {
                JOptionPane.showMessageDialog(null, "Criança");
            }

          if (idade <= 19) 
          {
            JOptionPane.showMessageDialog(null, "Adolescente");
          } 
          if (idade <= 30)
          {
            JOptionPane.showMessageDialog(null, "Jovem");
          }

          if (idade <= 60)
          {
            JOptionPane.showMessageDialog(null, "Adulto");
          }

          if (idade <= 61) 
          {
            JOptionPane.showMessageDialog(null, "Idoso");
          } 

     

       }   
    }
}
