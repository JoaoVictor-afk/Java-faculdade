package contato;

import java.util.ArrayList;

abstract public class Contato
{   protected String nome;
    protected String email;
    protected String telefone;
    protected ArrayList<Contato>telefones;
    
    public Contato()
    {  nome="";
       telefones=new ArrayList();
       email="";
    }
    public Contato(String nome,String email)
    {   this.nome = nome;
        telefones=new ArrayList();
        this.email=email;
    }
    public String getTelefone()
    {   
        return telefone;
    }

    public String getNome(){ 
        return nome; 
    }
    public String getEmail() {
        return email;
      }
    public void setNome(String nome){ 
        this.nome = nome;
    }
    public void setTelefone( ArrayList<Contato> telefones)
    {   
        this.telefones=telefones;
    }
   
}


