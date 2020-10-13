package decorator;

public abstract class BaseChocolate extends BaseDecorator {

    public BaseSorvete baseSorvete;

    public BaseChocolate(BaseSorvete sorveteToDecorate){
        this.baseSorvete = sorveteToDecorate;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public double getPreco() {
        return (this.baseSorvete.getPreco() + this.preco);
    }
}
