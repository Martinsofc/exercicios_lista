import java.util.Scanner;
public class atividade1pg32{
    public static void main(String[] args) {
      
    int impar = 0, i = 0;
    double par = 1;
        
    while (i != 29)
        {
            i = i + 1;
            
            if (i % 2 == 1)  {
                impar = i + impar;
            } else {
                par = par * i;                
            }
        }   
        System.out.println(Math.round(par));
        System.out.println(impar);
    }
}