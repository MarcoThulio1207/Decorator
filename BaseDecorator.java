public class BaseDecorator implements Adicional {

    protected Adicional wrappee;

    public BaseDecorator (Adicional wrappee){
        this.wrappee = wrappee;
    }

    public float custo(Tamanho tamanho) {
        return wrappee.custo(tamanho);
    }

    public String getDescricao() {
        return wrappee.getDescricao();
    }

}
