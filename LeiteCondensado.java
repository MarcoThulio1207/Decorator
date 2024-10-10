public class LeiteCondensado extends BaseDecorator {

    public LeiteCondensado (Adicional wrappee){
        super(wrappee);
    }

    public String getDescricao (){
        return wrappee.getDescricao() + " + leite condensado";
    }

    
    public float custo (Tamanho tamanho) {
        float custoAdd = 0;
        switch (tamanho) {
            case PEQUENO: custoAdd = 1.3f; break;
            case MEDIO: custoAdd = 2.8f; break;
            case GRANDE: custoAdd = 3.6f; break;
        }
        return wrappee.custo(tamanho) + custoAdd;
    }
    

}
