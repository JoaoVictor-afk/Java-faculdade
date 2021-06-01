import java.util.Scanner;

class Grau {
    
    public static void main(String [] args)
    {   
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        
        
        System.out.println("Escreva o A:");
        
        a = sc.nextDouble();  
        
        System.out.println("Escreva o B:");
        
        b = sc.nextDouble();   
        
        System.out.println("Escreva o C:");

        c = sc.nextDouble();

        delta =((b*b)-(4*a*c));

        if(delta>=0){
            x1 =  (-b + Math.sqrt (delta))  / ( 2*a );
            x2 =  (-b - Math.sqrt (delta)) / ( 2*a );

            System.out.println("valor de x1:"+x1);
            
            System.out.println("");
            
            System.out.println("valor de x2:"+x2);

        }
        else
        {
            System.out.println("Não pertence ao conjutos dos numeros reais");
        }
    }
}


