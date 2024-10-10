public class Banana extends BaseDecorator {

    public Banana (Adicional wrappee) {
        super(wrappee);
    }

    public String getDescricao (){
        return wrappee.getDescricao() + " + banana";
    }

    
    public float custo (Tamanho tamanho) {
        float custoAdd = 0;
        switch (tamanho) {
            case PEQUENO: custoAdd = 1.0f; break;
            case MEDIO: custoAdd = 2.0f; break;
            case GRANDE: custoAdd = 3.0f; break;
        }
        return wrappee.custo(tamanho) + custoAdd;
    }
    


}
