package decorator;

public class ChocolateBranco extends BaseChocolate {

    public ChocolateBranco(BaseSorvete sorveteToDecorate) {
        super(sorveteToDecorate);
        this.preco = 2.7;
    }

    public String getDescricao() {

        return baseSorvete.getDescricao() + " , Chocolate Branco ";
    }
}