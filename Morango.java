public class Morango extends BaseDecorator{

    public Morango(Adicional wrappee) {
        super(wrappee);
    }

    public String getDescricao(){
        return wrappee.getDescricao() + " + morango";
    }

    public float custo (Tamanho tamanho) {
        float custoAdd = 0;
        switch (tamanho) {
            case PEQUENO: custoAdd = 1.5f; break;
            case MEDIO: custoAdd = 2.5f; break;
            case GRANDE: custoAdd = 3.5f; break;
        }
        return wrappee.custo(tamanho) + custoAdd;
    }
    
}
