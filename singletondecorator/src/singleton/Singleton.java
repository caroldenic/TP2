package singleton;

public class Singleton {

    public static void main(String[] args) {
        
        Nome carol = Nome.getSingletonInstance("Carol De Nicola");
        Nome job = Nome.getSingletonInstance("Joberson Elias");
        
        System.out.println(carol.getNome());
        System.out.println(job.getNome());
        
        try{
            Nome carlos = carol.clone();
            System.out.println(carlos.getNome());
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }

    }

}