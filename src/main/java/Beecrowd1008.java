import java.util.Scanner;
public class Beecrowd1008 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int number,hours;
        float amount,salary;
       
        //ler variáveis
        number = leitor.nextInt();
        hours = leitor.nextInt();
        amount = leitor.nextFloat();
        
        salary = hours*amount;
            
        //mostrar resultado no console
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", number,salary);
    }
}