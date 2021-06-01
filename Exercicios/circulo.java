import java.util.Scanner;
public class circulo {
    public static void main(String [] args)
    { 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva o diametro do circulo:");
        
        int diametro = sc.nextInt();  
        
        int raio=(diametro)/2;
        
        double raio1 = Math.pow(raio, 2);
        
        double area=(raio1)*3.14;
        
        System.out.println("o valor da area:"+area);
    }
}
