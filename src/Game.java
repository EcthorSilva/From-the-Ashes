import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        clearConsole(); // Limpa o console
        System.out.println("Bem-vindo ao Souls.txt");
        System.out.println(" ");
        System.out.printf("Pressione Enter para iniciar o jogo...");
        scanner.nextLine(); // Avança para a próxima linha
        System.out.println(" ");
        
        while (!sair) {

            clearConsole(); // Limpa o console
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println(" ");
            System.out.println("1. Introdução");
            System.out.println("2. Jogar");
            System.out.println("3. Créditos");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Avança para a próxima linha
            
            switch (opcao) {
                case 1:
                    clearConsole(); // Limpa o console
                    System.out.println("Introdução:");
                    System.out.println(" ");
                    delay(1500); // Adiciona atraso 
                    System.out.println("Você é um aventureiro em busca do tesouro lendário que se encontra em um castelo antigo. Para chegar lá, você precisa passar por uma estrada perigosa cheia de monstros ferozes.");
                    System.out.println("Durante a jornada, você encontrará monstros que precisará derrotar para avançar. Use as opções 'Atacar' e 'Defender' para lutar contra eles.");
                    delay(1500); // Adiciona atraso 
                    System.out.println(" ");
                    System.out.printf("Pressione Enter para continuar...");
                    scanner.nextLine(); // Avança para a próxima linha
                    System.out.println(" ");
                    break;
                case 2:
                    clearConsole(); // Limpa o console
                    jogar(); // Inicia o Jogo
                    break;
                case 3:
                    clearConsole(); // Limpa o console
                    System.out.println("Créditos:");
                    delay(1000); // Adiciona atraso 
                    System.out.println(" ");
                    System.out.println("Desenvolvido por: Ecthor Silva");
                    delay(1500); // Adiciona atraso 
                    System.out.println(" ");
                    System.out.printf("Pressione Enter para continuar...");
                    scanner.nextLine(); // Avança para a próxima linha
                    System.out.println(" ");
                    break;
                case 4:
                    sair = true;

                    clearConsole(); // Limpa o console
                    System.out.println("Saindo do jogo...");
                    scanner.nextLine(); // Avança para a próxima linha
                    System.out.println(" ");
                    break;
                default:
                    clearConsole(); // Limpa o console
                    System.out.printf("Opção inválida, pressione Enter para tentar novamente!");
                    scanner.nextLine(); // Avança para a próxima linha
                    System.out.println(" ");
            }
        }
    }

    public static void jogar(){
        Scanner scanner = new Scanner(System.in);

        clearConsole(); // Limpa o console
        System.out.printf("Carregando...");
        delay(1000); // Adiciona atraso 
        clearConsole(); // Limpa o console
        delay(1000); // Adiciona atraso 
        System.out.println("Você é um aventureiro em busca do tesouro lendário que se encontra em um castelo antigo. Para chegar lá, você precisa passar por uma estrada perigosa cheia de monstros ferozes.");
        delay(1500); // Adiciona atraso 
        System.out.println("Enquanto caminhava pela estrada, um monstro feroz apareceu do nada!");

        System.out.println("");
        delay(1500); // Adiciona atraso 
        System.out.println("Escolha sua classe: ");
        System.out.println("");
        System.out.println("1. Guerreiro");
        System.out.println("2. Mago");
        System.out.println("3. Arqueiro");

        int classeEscolhida = scanner.nextInt();
        scanner.nextLine(); // Avança para a próxima linha

        Personagem personagem = null;
        switch (classeEscolhida) { // Selecionar a classe do personagem
            case 1:
                personagem = new Guerreiro("guerreiro", 8, 8, 5); // nome, vida, forca, defesa
                break;
            case 2:
                personagem = new Mago("Mago", 3, 9, 3); // nome, vida, forca, defesa
                break;
            case 3:
                personagem = new Arqueiro("Arqueiro", 6, 7, 4); // nome, vida, forca, defesa
                break;
            default:
                System.out.println("Opção inválida, saindo...");
                System.exit(0);
        }
        System.out.println("Você escolheu a classe " + personagem.getNome() + ".");

        while (true) { // Entrar em combate!
            Monstro monstro = gerarMonstroAleatorio();
            System.out.println("Um " + monstro.getNome() + " apareceu! Ele é um dos guardiões do tesouro lendário, e não permitirá que você passe facilmente!");

            while (personagem.getVida() > 0 && monstro.getVida() > 0) {
                System.out.println("Escolha sua ação:");
                System.out.println("1. Atacar");
                System.out.println("2. Defender");

                int acao = scanner.nextInt();
                scanner.nextLine(); // Avança para a próxima linha

                switch (acao) {
                    case 1:
                        int danoCausado = personagem.atacar();
                        System.out.println("Você causou " + danoCausado + " de dano!");
                        monstro.tomarDano(danoCausado);
                        break;
                    case 2:
                        personagem.defender();
                        System.out.println("Você está defendendo.");
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }

                if (monstro.getVida() > 0) {
                    int danoSofrido = monstro.atacar();
                    System.out.println("O " + monstro.getNome() + " causou " + danoSofrido + " de dano!");
                    personagem.tomarDano(danoSofrido);
                }
            }
            if (personagem.getVida() > 0) {
                System.out.println("Você venceu o " + monstro.getNome() + "! Ele caiu morto no chão.");
            }
        }
    }

    public static Monstro gerarMonstroAleatorio() {
        Random rand = new Random();
        String[] nomes = { "Esqueleto", "Orc", "Troll", "Goblin", "Dragão" };
        int vida = rand.nextInt(100) + 50;
        int ataque = rand.nextInt(20) + 10;
        int defesa = rand.nextInt(20) + 10;
        return new Monstro(nomes[rand.nextInt(nomes.length)], vida, ataque, defesa);
    }

    // Funções/Métodos Auxiliares

    // Função para adicionar delay aos textos do console
    private static void delay(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Função para limpar o console e reposicionar o cursor
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}