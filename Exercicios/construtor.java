class Empregado
{
public Empregado(String n, double s ) {
    nome=n;
    salario=s;
    id=0;
}
public String getNome(){
    return nome;
}
public double getSalario(){
    return salario;
}
public int getId(){
    return id;
}
public void setId(){
    id=nextId;
    nextId++;
}
public static int getNextId(){
    return nextId;
}

    public static void main(String args []){
       Empregado[] ficha= new Empregado[3];

       ficha[0]= new Empregado("Dourado",2000);
       ficha[1]= new Empregado("João",6000);
       ficha[2]= new Empregado("Fred",5000);
    for(Empregado e : ficha){
        e.setId();
        
        System.out.println("Nome= "+e.getNome());
        System.out.println("Id= "+e.getId());
        System.out.println("Salário= "+e.getSalario());
    }
    int nextid= Empregado.getNextId();
    System.out.println("Proximo id:"+nextid);
}
private String nome;
private double salario;
private int id;
private static int nextId;
}
