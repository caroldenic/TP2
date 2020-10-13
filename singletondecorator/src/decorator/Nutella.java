package decorator;

public class Nutella extends BaseChocolate {

    public Nutella(BaseSorvete sorveteToDecorate) {
        super(sorveteToDecorate);
        this.preco = 2.0;
    }

    public String getDescricao() {
        return baseSorvete.getDescricao() + " , Nutella ";
    }

}
