package decorator;

public class Morango extends BaseFrutas {

    public Morango(BaseSorvete sorveteToDecorate) {
        super(sorveteToDecorate);
        this.preco = 0.5;
    }

    public String getDescricao() {
        return baseSorvete.getDescricao() + " , Morango ";
    }

}