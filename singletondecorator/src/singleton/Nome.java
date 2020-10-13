package singleton;

public class Nome {

    private String n;

    private static Nome nome;

    private Nome(String n) {
        this.n = n;
        System.out.println("Meu nome e: " + this.n);
    }

    public static Nome getSingletonInstance(String n) {
        if (nome == null){
            nome = new Nome(n);
        }
        else{
            System.out.println("O objeto "+ n + " nao pode ser criado porque ja existe un objeto da clase Nome");
        }
        
        return nome;
    }
    
    @Override
    public Nome clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Não pode clonar objeto da classe Nome");
        }
        return null; 
    }

    public String getNome() {
        return n;
    }

    public void setNome(String n) {
        this.n = n;
    }

}