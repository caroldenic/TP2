package decorator;


public class Principal {
    
    public static void main(String[] args) {

        BaseSorvete s1 = new SorveteNormal();
        System.out.println( s1.getDescricao() + " $" + s1.getPreco());

        s1 = new Nutella(s1);
        System.out.println( s1.getDescricao() + " $ " + s1.getPreco());

        s1 = new Morango(s1);
        System.out.println( s1.getDescricao() + " $ " +  s1.getPreco());


        BaseSorvete s2 = new SorveteNormal();
        System.out.println( s2.getDescricao() + " $" + s2.getPreco());

        s2 = new ChocolateBranco(s2);
        System.out.println( s2.getDescricao() + " $ " + s2.getPreco());

        s2 = new Banana(s2);
        System.out.println( s2.getDescricao() + " $ " +  s2.getPreco());

    }
}
