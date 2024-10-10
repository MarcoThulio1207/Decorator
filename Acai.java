public class Acai implements Adicional { //implementação concreta da interface Adicional

    
    public float custo(Tamanho tamanho) {
        switch (tamanho) {
            case PEQUENO: return 8.5f;
            case MEDIO: return 10.5f;
            case GRANDE: return 15.5f;
            default: return 0;
        }
    }

    public String getDescricao() {
        
        return "Açai Simples";
    }
    
    
}
