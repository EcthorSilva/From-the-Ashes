import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        // Boas vindas
        clearConsole(); // Limpa o console
        System.out.println("Bem-vindo ao Souls.txt");
        System.out.println(" ");
        System.out.printf("Pressione Enter para iniciar o jogo...");
        scanner.nextLine(); // Avança para a próxima linha
        System.out.println(" ");
        
        // Menu Principal
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
        System.out.println("Você é um aventureiro em busca do tesouro lendário que se encontra em um castelo antigo. Para chegar lá, você precisa passar por uma jornada longa e perigosa, cheia de monstros ferozes.");
        delay(1500); // Adiciona atraso
        System.out.println("Antes de iniciar sua jornada é necessario escolher sua classe.");
        System.out.println("Escolha com sabedoria.");

        System.out.println("");
        delay(1500); // Adiciona atraso 
        System.out.println("Escolha sua classe: ");
        System.out.println("");
        System.out.println("1. Guerreiro");
        System.out.println("2. Mago");
        System.out.println("3. Arqueiro");

        int classeEscolhida = scanner.nextInt();
        scanner.nextLine(); // Avança para a próxima linha

        // Escolha de classe
        Personagem personagem = null;
        switch (classeEscolhida) { // Selecionar a classe do personagem
            case 1:
                personagem = new Guerreiro("guerreiro", 8, 8, 5, 5); // nome, vida, forca, defesa
                break;
            case 2:
                personagem = new Mago("Mago", 3, 9, 3, 7); // nome, vida, forca, defesa
                break;
            case 3:
                personagem = new Arqueiro("Arqueiro", 6, 7, 4, 9); // nome, vida, forca, defesa
                break;
            default:
                System.out.println("Opção inválida, saindo...");
                System.exit(0);
        }
        System.out.println("Você escolheu a classe " + personagem.getNome() + ".");

        // Inicio da aventura
        System.out.println("Você entrou na masmorra...");
        System.out.println("");
        System.out.println("Após caminhar um pouco você consegue chegar ao final do corredor.");
        System.out.println("Lá, você encontra uma porta à sua frente e duas saídas, uma à direita e outra à esquerda.");

        while (true) {
            System.out.println("O que deseja fazer?");
            System.out.println("");
            System.out.println("1. Abrir a porta à frente");
            System.out.println("2. Seguir pela saída à direita");
            System.out.println("3. Seguir pela saída à esquerda");
            System.out.println("4. Fugir da masmorra");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Você abriu a porta à sua frente. Há um corredor escuro à sua frente.");
                    System.out.println("");
                    System.out.println("O que deseja fazer?");
                    System.out.println("");
                    System.out.println("1. Seguir em frente");
                    System.out.println("2. Voltar para a sala anterior");

                    int escolha2 = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha2 == 1) {
                        System.out.println("Você seguiu pelo corredor e encontrou uma sala com um tesouro brilhante!");
                        System.out.println("Você venceu o jogo! Parabéns!");
                        scanner.nextLine(); // Avança para a próxima linha
                        return;
                    } else {
                        System.out.println("Você voltou para a sala anterior.");
                    }
                    break;
                case 2:
                    System.out.println("Você seguiu pela saída à direita. Há uma sala vazia à sua frente.");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1. Procurar por itens");
                    System.out.println("2. Voltar para a sala anterior");

                    int escolha3 = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha3 == 1) {
                        System.out.println("Você procurou pela sala e encontrou uma espada!");
                        System.out.println("Você equipou a espada.");
                    } else {
                        System.out.println("Você voltou para a sala anterior.");
                    }
                    break;
                case 3:
                    System.out.println("Você seguiu pela saída à esquerda. Há uma sala cheia de inimigos à sua frente!");

                    Monstro monstro = gerarMonstroAleatorio();
                    System.out.println("Um " + monstro.getNome() + " apareceu!");

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
                                System.out.println("Você se defendeu do ataque do " + monstro.getNome() + "!");
                                personagem.defender();
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                                break;
                        }
                        if (monstro.getVida() > 0) {
                            int danoRecebido = monstro.atacar();
                            System.out.println("O " + monstro.getNome() + " causou " + danoRecebido + " de dano!");
                            personagem.tomarDano(danoRecebido);
                        }

                        System.out.println("Você tem " + personagem.getVida() + " de vida.");
                        System.out.println("O " + monstro.getNome() + " tem " + monstro.getVida() + " de vida.");
                    }

                    if (personagem.getVida() <= 0) {
                        System.out.println("Você foi derrotado pelo " + monstro.getNome() + ". Game Over!");
                        return;
                    } else {
                        System.out.println("Você derrotou o " + monstro.getNome() + "!");
                        System.out.println("Há uma passagem secreta na sala.");
                        System.out.println("O que deseja fazer?");
                        System.out.println("1. Seguir pela passagem secreta");
                        System.out.println("2. Voltar para a sala anterior");

                        int escolha4 = scanner.nextInt();
                        scanner.nextLine();

                        if (escolha4 == 1) {
                            System.out.println("Você seguiu pela passagem secreta e encontrou uma sala com um tesouro brilhante!");
                            System.out.println("Você venceu o jogo! Parabéns!");
                            scanner.nextLine(); // Avança para a próxima linha
                            return;
                        } else {
                            System.out.println("Você voltou para a sala anterior.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Você fugiu da masmorra. Fim de jogo!");
                    scanner.nextLine(); // Avança para a próxima linha
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
    // Funções/Métodos Auxiliares //

    // Gerador de monstros aleatorios
    public static Monstro gerarMonstroAleatorio() {
        Random rand = new Random();
        String[] nomes = { "Esqueleto", "Orc", "Troll", "Goblin", "Dragão" };
        int vida = rand.nextInt(100) + 50;
        int ataque = rand.nextInt(20) + 10;
        int defesa = rand.nextInt(20) + 10;
        return new Monstro(nomes[rand.nextInt(nomes.length)], vida, ataque, defesa);
    }

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