class Empregado
{
private String nome;
private double salario;
private double salarioanual;
public double salarioanualaumento;
private String sobrenome;

public Empregado(String n, String sobre ,double s ) {
    nome=n;
    salario=s;
    sobrenome=sobre;
}
public Empregado() {
}

public String getNome(){
    return nome;
}
public String getSobreome(){
    return sobrenome;
}
public double getSalario(){
    if (salario>0){
        return salario;
    }
    else return salario=0.0;
}

public double getSalarioanual(){
    if(salario>0){
         return salarioanual=(salario*12) ; 
    }
    else return salarioanual=0.0;
}
public double getSalarioanualaumento(){
    if(salario>0){
        return salarioanualaumento=(salario*12*0.10+salarioanual);
    }
    else return salarioanualaumento=0.0;
}
public static class empregadoTeste {
    public static void main (String args []){
       Empregado[] ficha= new Empregado[3];

       ficha[0]= new Empregado("Dourado","Rodrigo",2000);
       ficha[1]= new Empregado("João","Victor",6000);
       ficha[2]= new Empregado("Fred","Carlos",5000);
    for(Empregado e : ficha){
        
        System.out.println("Nome="+e.getNome()+" Sobrenome="+e.getSobreome()+" Salário="+e.getSalario()+" Salário anual="+e.getSalarioanual());
        System.out.println("Salário com aumento de 10%= "+e.getSalarioanualaumento());
    }
   }
 }

}
