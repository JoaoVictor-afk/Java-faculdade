class Empregado
{
    private String nome;
    private double salario;
    private double salarioanual;
    public double salarioanualaumento;
    public String sobrenome;

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
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome=sobrenome;
    }
    
    public double getSalario(){
        if (salario>0){
            return salario;
        }
        else return salario=0.0;
    }
    
    public void setSalario(double salario){
        this.salario=salario;
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
        
            Empregado ficha= new Empregado();
            ficha.setNome("João");
            ficha.setSobrenome("Victor");
            ficha.setSalario(5000);
            
            Empregado ficha1= new Empregado();
            ficha1.setNome("Nicole");
            ficha1.setSobrenome("Spelocin");
            ficha1.setSalario(4000);
            
            System.out.println("Nome="+ficha.getNome()+" Sobrenome="+ficha.getSobrenome()+" Salário="+ficha.getSalario()+" Salário anual="+ficha.getSalarioanual());
            System.out.println("Salário com aumento de 10%= "+ficha.getSalarioanualaumento());
            System.out.println("Nome="+ficha1.getNome()+" Sobrenome="+ficha1.getSobrenome()+" Salário="+ficha1.getSalario()+" Salário anual="+ficha1.getSalarioanual());
            System.out.println("Salário com aumento de 10%="+ficha1.getSalarioanualaumento());
    }
  }
}


