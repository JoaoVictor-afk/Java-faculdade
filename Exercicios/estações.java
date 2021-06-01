import java.util.Scanner;

class datas 
{
    public static void main(String [] args)
    {  
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva o dia:");
        
        int dia = sc.nextInt();  
        
        System.out.println("Escreva o mes:");
        
        int mes = sc.nextInt();    
        
        if((mes== 12 && dia >= 16 &&  dia <= 31)|| (mes == 1 && dia >= 1 && dia<= 31)
        || (mes== 2 && dia>= 1 && dia <= 28 )|| (mes == 3 && dia >= 1 && dia <= 15))
        {
            System.out.println("Inverno");
        }
        else if((mes== 3 && dia >= 16 &&  dia <= 31)|| (mes == 4 && dia >= 1 && dia<= 30)
        || (mes== 5 && dia >= 1 && dia <= 31 )|| (mes == 6 && dia >= 1 && dia <= 15))
        {
            System.out.println("Primavera");
        }
        else if((mes== 6 && dia >= 16 &&  dia <= 30)|| (mes == 7 && dia >= 1 && dia<= 31)
        || (mes== 8 && dia >= 1 && dia <= 31 )|| (mes == 9 && dia >= 1 && dia <= 15))
        {
            System.out.println("Verão");
        }
        else 
        
        System.out.println("Outono");
    
        
    }
}
