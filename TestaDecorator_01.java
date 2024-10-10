import java.util.Scanner;

public class TestaDecorator_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Seja muito bem-vindo ao Açai's");
        System.out.println("Monte seu açaí, digite um número para escolher: ");
        System.out.println("1 - PEQUENO");
        System.out.println("2 - MÉDIO");
        System.out.println("3 - GRANDE");
        int opcao1 = scan.nextInt();

        System.out.println("Agora, selecione se quer com complemento ou simples:");
        System.out.println("Digite um número para escolher:");
        System.out.println("1 - Açaí Simples");
        System.out.println("2 - Açaí com Morango");
        System.out.println("3 - Açaí com Banana");
        System.out.println("4 - Açaí com Leite condensado");
        System.out.println("5 - Açaí com todos os complementos");
        int opcao2 = scan.nextInt();

        Tamanho tamanho = null;

        
        switch (opcao1) {
            case 1:
                tamanho = Tamanho.PEQUENO;
                break;
            case 2:
                tamanho = Tamanho.MEDIO;
                break;
            case 3:
                tamanho = Tamanho.GRANDE;
                break;
            default:
                System.out.println("Opção inválida. Usando PEQUENO como padrão.");
                tamanho = Tamanho.PEQUENO;
        }

       
        Adicional acai = new Acai();

        
        switch (opcao2) {
            case 1:
                
                break;
            case 2:
                acai = new Morango(acai);
                break;
            case 3:
                acai = new Banana(acai);
                break;
            case 4:
                acai = new LeiteCondensado(acai);
                break;
            case 5:
                acai = new Morango(acai);
                acai = new Banana(acai);
                acai = new LeiteCondensado(acai);
                break;
            default:
                System.out.println("Opção inválida para o complemento.");
        }

        
        System.out.println("Você pediu: " + acai.getDescricao());
        System.out.printf("Preço total: R$ %.2f%n", acai.custo(tamanho));

        
        scan.close();
    }
}
