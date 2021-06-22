package contato;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda
{   
    private ArrayList<Contato>contatos;
    
    Agenda(){   
        contatos=new ArrayList();
    }
    
    public void inserir(Contato c){   
        contatos.add(c);
    }
    
    public Contato contadobuscar(String nome){   
        for(int i=0;i<contatos.size();i++)
        {   Contato c=contatos.get(i);
             if(c.getNome().equalsIgnoreCase(nome))
               return contatos.get(i);
        }
        return null;
    }
    
    public Object Contadobuscar(int pos){  
         if(pos>=0 &&pos<contatos.size())
        {
            return contatos.get(pos);
        }
        return null;
    }
    
    public Object Contatobuscar(String email){   
        
        for(int i=0;i<contatos.size();i++)
        {   
            if(contatos.get(i) != null )
            {
              Contato c=(Contato)contatos.get(i);
              if(c.getEmail().equalsIgnoreCase(email))
              return (Contato)contatos.get(i);
            }
        }
        return null;
    }
    
     public Contato[] buscarTodos(){   
        
        Contato[] vet=new Contato[contatos.size()];
        return (contatos.toArray(vet));

    }
    
    public static void excluir(ArrayList contatos){
        
        Scanner ler = new Scanner(System.in);
        String nome;
    
        
    
        System.out.println("Informe o nome do contado a ser excluido:");
        nome = ler.next();
    
        
        contatos.remove(nome);
    }
}
