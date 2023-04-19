import java.util.Scanner;
public class Game {
    // Variavel para verificar se o personagem esta ou não defendendo
    static boolean defendendo = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        // Boas vindas
        Metodos.clearConsole(); // Limpa o console
        System.out.printf("Bem-vindo ao From the Ashes\n");
        System.out.printf("\nPressione Enter para iniciar o jogo...");
        scanner.nextLine(); // Avança para a próxima linha
        
        // Menu Principal
        while (!sair) {
            Metodos.clearConsole(); // Limpa o console
            System.out.printf("Escolha uma das opções abaixo: \n\n1. Introdução\n2. Jogar\n3. Créditos\n4. Sair\n");
            System.out.printf("\n>"); // Indica onde o usuario irá digitar
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Avança para a próxima linha
            
            switch (opcao) {
                case 1:
                    Metodos.clearConsole(); // Limpa o console
                    System.out.printf("-- INTRODUÇÃO --\n");
                    System.out.printf("\nEste jogo se passa em um mundo governado por deuses, onde humanos e criaturas das trevas lutam pela sobrevivência. \nUm grande demônio, conhecido como Rei Demônio, lidera um exército de monstros e demônios das profundezas do submundo, ameaçando o mundo e marcando possivelmente o seu fim. \nPara salvar a humanidade você precisará lutar contra monstros poderosos e se aprofundar cada vez mais neste universo.\n");
                    System.out.printf("\nDurante a sua aventura, você irá se deparar com diversos monstros que precisam ser derrotados para que você possa avançar na história. \nPara enfrentá-los, você terá a opção de atacar, defender ou até mesmo fugir. \nSuas escolhas durante as batalhas serão cruciais para o resultado final e para o seu progresso na jornada. \n\nPortanto, escolha sabiamente e use suas habilidades e recursos com cautela para vencer essas batalhas épicas. \nBoa sorte!\n\n");
                    Metodos.delay(1500); // Adiciona atraso 
                    System.out.println(" ");
                    System.out.print("Pressione Enter para continuar...");
                    scanner.nextLine(); // Avança para a próxima linha
                    System.out.println(" ");
                    break;
                case 2:
                    Metodos.clearConsole(); // Limpa o console
                    jogar(); // Inicia o Jogo
                    break;
                case 3:
                    Metodos.clearConsole(); // Limpa o console
                    System.out.printf("--CRÉDITOS--");
                    Metodos.delay(1000); // Adiciona atraso 
                    System.out.println(" ");
                    System.out.println("Desenvolvido por: Ecthor Silva");
                    Metodos.delay(1500); // Adiciona atraso 
                    System.out.println(" ");
                    System.out.printf("Pressione Enter para continuar...");
                    scanner.nextLine(); // Avança para a próxima linha
                    System.out.println(" ");
                    break;
                case 4:
                    sair = true;
                    Metodos.clearConsole(); // Limpa o console
                    System.out.println("Saindo do jogo...\n");
                    Metodos.delay(1500); // Adiciona atraso 
                    break;
                default:
                    Metodos.clearConsole(); // Limpa o console
                    System.out.print("Opção inválida, pressione Enter para tentar novamente!");
                    scanner.nextLine(); // Avança para a próxima linha
                    System.out.println(" ");
            }
        }
        scanner.close();
    }
    // Iniciando o jogo
    public static void jogar(){
        Scanner scanner = new Scanner(System.in);

        Metodos.clearConsole(); // Limpa o console
        System.out.print("Carregando...");
        Metodos.delay(1000); // Adiciona atraso 
        Metodos.clearConsole(); // Limpa o console
        Metodos.delay(1000); // Adiciona atraso 
        System.out.printf("Era uma vez um mundo governado por deuses poderosos, onde humanos e criaturas das trevas lutavam pela sobrevivência. \nA humanidade vivia em cidades fortificadas, protegidas por muros altos e magia antiga. No entanto, mesmo com todos esses recursos, uma ameaça se aproximava do horizonte.\n");
        Metodos.delay(1000); // Adiciona atraso
        System.out.println(" ");
        System.out.printf("Rumores surgiram de que um grande demônio estava se aproximando, liderando um exército de monstros e demônios das profundezas do submundo. \nO demônio era conhecido como o Rei Demônio e muitos acreditavam que sua chegada marcaria o fim do mundo.\n");
        Metodos.delay(1000); // Adiciona atraso
        
        // Criar personagem
        Personagem personagem = Metodos.criarPersonagem(scanner);

        Metodos.delay(1000);
        System.out.printf("\n-- ATO I --\n\n");
        Metodos.delay(1000);
        
        /* Ato I */ 
        Atos.visitarTaverna(personagem, scanner);

        Metodos.delay(1000);
        System.out.printf("\n-- Fim do ATO I --\n");
        Metodos.delay(1000);
        
        System.out.printf("\nPressione Enter para continuar...");
        
        scanner.nextLine(); // Avança para a próxima linha
        Metodos.clearConsole(); // Limpa o console
    }
}