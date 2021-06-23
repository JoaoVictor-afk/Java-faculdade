import java.util.Scanner;  

public class Temperatura {
  
    public double temperatura;
    static char menu;
    static double tempx;
    static char menuPara;

 
    
    public Temperatura() {
    }
    
   
    
        public static double getconvDeCelsius( double value ,char unitPara) {
    
            if(unitPara=='a')
            {
                return value;
            }
            else if(unitPara=='b') 
            {
                double newvalue=(1.8 * value) + 32;
                return newvalue;
            }
            else if(unitPara=='c') 
            {
                double newvalue = value + 273.15;
                return newvalue;
            }     
       
       return 0;     
        }  
        
        public static double getconvDeFahrenheit( double value, char unitPara ){             
            
            if(unitPara=='a')
            {
                double newvalue=(value - 32)*5/9;
                return newvalue;
            }
            else if(unitPara=='b') 
            {
                return value;
            }
            else if(unitPara=='c') 
            {
                double newvalue=(value + 459.67) * 5/9 ;
                return newvalue;
            }
            return 0;  
           
        }  
  
         
        public static double getconvDeKelvin( double value, char unitPara ){  
            if(unitPara=='a')
            {
                double newvalue = value - 273.15;
                return newvalue;
            }
            else if(unitPara=='b') 
            {
                double newvalue=value * 9/5 - 459.67;
                return newvalue;
            }
            else if(unitPara=='c') 
            {
                return value;
            }
            return 0;  
               
        }  
        
        public static double convertTemp( char uPara, double temp, char uTo ){  
               
               double tempConv = temp;
              
            if(uPara=='a'){  
                return getconvDeCelsius(tempConv, uTo); 
            }
            else if(uPara=='b'){  
                return getconvDeFahrenheit(tempConv, uTo);  
            }
            else if(uPara=='c'){  
                return getconvDeKelvin(tempConv, uTo);  
           }  
             return 0;  
                      
        }  
        
        private static void displayResult(char scaleDe, double tempDe,char scalePara, double result) {  
                  
            System.out.println("Primeira opção: "+scaleDe+  
                                "\nTemperatura:"+tempDe+  
                                "\nFoi convertido:"+scalePara+  
                                "\nO resultado é:"+result); 
            
            System.out.println("");
            Scanner in = new Scanner(System.in);
            System.out.println("tem mais alguma converção?(Y/N): ");
            String next = in.next();
            next= next.toUpperCase();
            if(next.equals("N")){
                System.exit(0);
            }
              
        }  
        
        
        private static double getTemperatura() {  
              
            System.out.println("Coloque a temperatura: ");  
              
            Scanner sc = new Scanner(System.in);  
            tempx = Double.parseDouble(sc.nextLine());  
              
            return tempx;  
        }  
  
        private static char getUnitTo() {  
  
                System.out.println();  
                System.out.println("============================"+  
                        "\nConversão de temperatura"+  
                        "\n=========== MENU ==========="+  
                        "\na.Para Celsius"+  
                        "\nb.Para Fahrenheit"+  
                        "\nc.Para Kelvin"+  
                        "\nx.Sair"+  
                        "\n============================"+  
                        "\nEscolha a sua opção:");  
                try {  
                      
                     Scanner sc = new Scanner(System.in);
                     
                     String menu1=sc.nextLine(); 
                                     
                     menuPara = menu1.charAt(0);  
                      
                    switch (menuPara) {  
                      
                    case 'a':  
                        
                        break;  
                          
                    case 'b':   
                         
                        break;    
                          
                    case 'c':  
                        
                        break;  
                          
                    case 'x':  
                        System.out.println("Tchau!!");  
                        System.exit(0);  
                          
                        break;    
                          
                    default:  
                        System.out.println("Entre com um valor valido");  
                        break;  
                    }  
                } catch (NumberFormatException e) {  
                      
                    e.printStackTrace();  
                }  
              
            return menuPara;  
        }  
      
        private static char displayMenu() {  
              
            System.out.println();  
            System.out.println("============================"+  
                    "\nConversão de temperatura"+  
                    "\n=========== MENU ==========="+  
                    "\na.De Celsius"+  
                    "\nb.De Fahrenheit"+  
                    "\nc.De Kelvin"+  
                    "\nx.Sair"+  
                    "\n============================"+  
                    "\nEscolha a sua opção:");  
            try {  
                  
                Scanner sc = new Scanner(System.in);
                
                String menu1 = sc.nextLine(); 
                                
                menu = menu1.charAt(0);  
                
                switch (menu) {  
                case 'a':  
                   
                      
                    break;  
                      
                case 'b':   
                    
                    break;    
                      
                case 'c':  
                    
                    break;  
                      
                case 'x':  
                    System.out.println("Tchau!!");  
                    System.exit(0);  
                    
                    break;    
                      
                default:  
                    System.out.println("Entre com um valor valido");  
                    break;  
                }  
            } catch (NumberFormatException e) {  
                
                e.printStackTrace();  
            }  
            return menu ;  
              
        }  
        public static void main( String[] args ){  
              
            	            	
            char   scaleDe= ' ';  
            char   scalePara= ' ';   
              
            double tempDe= 0.0;   
            double result= 0.0; 
        do {  
                  
                
                  
                scaleDe = displayMenu();  
                  
                  
               
                if ( scaleDe != 'x' ){  
                  
                    
                    tempDe = getTemperatura();  
                      
                      
                   
                    scalePara = getUnitTo();  
                      
                    
                    result = convertTemp( scaleDe, tempDe, scalePara );  
                      
                    
                    displayResult( scaleDe, tempDe, scalePara, result );  
                      
                }  
            } while ( scaleDe != 'x' );  
        }  
          
        
        
       
                      
          
} 
  


