package decorator;

public class Banana extends BaseFrutas {

    public Banana(BaseSorvete sorveteToDecorate) {
        super(sorveteToDecorate);
        this.preco = 3.5;
    }

    public String getDescricao() {
        return baseSorvete.getDescricao() + " , Banana  ";
    }
}