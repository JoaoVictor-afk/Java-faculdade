package arrays;
import java.util.ArrayList;
import java.util.Scanner;
import javax.lang.model.type.ArrayType;
import javax.print.attribute.standard.Media;
import java.util.stream.*;

public class media {
    public int media;
    public int soma;
    
    public media(double i){
        i= media;

    }
    public media(){
    }
    
    public static  int getMedia(int soma){
       
        return soma/20;
    }

    public static void main(String[] args){
            
            System.out.println("Escreva 20 numeros, se quiser cancelar a operação digite -1.");
            
            int[] nota = new int[20];
            Scanner entrada = new Scanner(System.in);
            
            
            for(int indice=0 ; indice < 20 ; indice++){
                System.out.print("\nEntre com o número " + (indice+1) + ": ");
                nota[indice] = entrada.nextInt();
             
                if(nota[indice]==-1){
                    System.out.println("Tchau!");
                    System.exit(0);
                }
               
            }
            
            for(int indice=1 ; indice < 20 ; indice++){
                System.out.printf("Número %d -> Valor armazenado: %d\n",indice+1, nota[indice]);
            }
            
            int soma = IntStream.of(nota).sum();
            
            System.out.println(getMedia(soma));      
        }

    
    }


   
    

