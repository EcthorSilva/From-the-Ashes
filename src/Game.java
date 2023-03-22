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
                personagem = new Guerreiro("guerreiro", 120, 25, 35, 10); // nome, vida, forca, defesa e destreza
                break;
            case 2:
                personagem = new Mago("Mago", 65, 30, 30, 15); // nome, vida, forca, defesa e destreza
                break;
            case 3:
                personagem = new Arqueiro("Arqueiro", 80, 20, 20, 25); // nome, vida, forca, defesa e destreza
                break;
            default:
                System.out.println("Opção inválida, saindo...");
                System.exit(0);
        }
        // Informa a classe que você escolheu
        clearConsole(); // Limpa o console
        System.out.println("Você escolheu a classe " + personagem.getNome() + ".");
        delay(1500); // Adiciona atraso 
        System.out.println("");

        // Inicio da aventura
        System.out.println("Você entrou na masmorra...");
        System.out.println("");
        System.out.println("Após caminhar um pouco você consegue chegar ao final do corredor.");
        System.out.println("Lá, você encontra uma porta à sua frente e duas saídas, uma à direita e outra à esquerda.");
        System.out.println("");

        while (true) {
            System.out.println("O que deseja fazer?");
            System.out.println("");
            System.out.println("1. Abrir a porta à frente");
            System.out.println("2. Seguir pela saída à direita");
            System.out.println("3. Seguir pela saída à esquerda");
            System.out.println("4. Fugir da masmorra");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Avança para a próxima linha

            switch (escolha) {
                case 1:
                    clearConsole(); // Limpa o console
                    System.out.println("Você abriu a porta à sua frente. Há um corredor escuro à sua frente.");
                    System.out.println("");
                    System.out.println("O que deseja fazer?");
                    System.out.println("");
                    System.out.println("1. Seguir em frente");
                    System.out.println("2. Voltar para a sala anterior");

                    int escolha2 = scanner.nextInt();
                    scanner.nextLine(); // Avança para a próxima linha

                    if (escolha2 == 1) {
                        clearConsole(); // Limpa o console
                        System.out.println("Você seguiu pelo corredor e encontrou uma sala com um tesouro brilhante!");
                        System.out.println(" ");
                        System.out.println("Você venceu o jogo! Parabéns!");
                        scanner.nextLine(); // Avança para a próxima linha
                        return;
                    } else {
                        clearConsole(); // Limpa o console
                        System.out.println("Você voltou para a sala anterior.");
                    }
                    break;
                case 2:
                    clearConsole(); // Limpa o console
                    System.out.println("Você seguiu pela saída à direita. Há uma sala vazia à sua frente.");
                    System.out.println("");
                    System.out.println("O que deseja fazer?");
                    System.out.println("");
                    System.out.println("1. Procurar por itens");
                    System.out.println("2. Voltar para a sala anterior");

                    int escolha3 = scanner.nextInt();
                    scanner.nextLine(); // Avança para a próxima linha

                    if (escolha3 == 1) {
                        clearConsole(); // Limpa o console
                        System.out.println("Você procurou pela sala e encontrou uma espada!");
                        System.out.println("Você equipou a espada.");
                    } else {
                        clearConsole(); // Limpa o console
                        System.out.println("Você voltou para a sala anterior.");
                    }
                    break;
                case 3:
                    clearConsole(); // Limpa o console
                    System.out.println("Você seguiu pela saída à esquerda. Há uma sala cheia de inimigos à sua frente!");               
                    // Geração aleatória do monstro
                    Monstro monstro = gerarMonstroAleatorio();
                    // Loop da Batalha
                    loopBatalha(personagem, monstro, scanner);
                    break;
                case 4:
                    clearConsole(); // Limpa o console
                    System.out.println("Você fugiu da masmorra. Fim de jogo!");
                    scanner.nextLine(); // Avança para a próxima linha
                    return;
                default:
                    clearConsole(); // Limpa o console
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
        int vida = rand.nextInt(100) + 100; // Vida do Monstro
        int ataque = rand.nextInt(20) + 20; // Ataque do Monstro
        int defesa = rand.nextInt(20) + 20; // Defesa do Monstro
        return new Monstro(nomes[rand.nextInt(nomes.length)], vida, ataque, defesa);
    }

    // Função para adicionar delay aos textos do console
    public static void delay(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    // Função para limpar o console e reposicionar o cursor
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    // Função que exibe a vida do personagem e do monstro
    public static void cont(Personagem personagem, Monstro monstro){
        System.out.println("");
        System.out.println("Você tem " + personagem.getVida() + " de vida.");
        System.out.println("O " + monstro.getNome() + " tem " + monstro.getVida() + " de vida.");
        System.out.println("");
    }
    // Função para iniciar o loop da batalha
    public static void loopBatalha(Personagem personagem, Monstro monstro, Scanner scanner) {
        System.out.println("Um " + monstro.getNome() + " apareceu!");

        System.out.println(" ");
        System.out.println("Você tem " + personagem.getVida() + " de vida.");
        System.out.println("O " + monstro.getNome() + " tem " + monstro.getVida() + " de vida.");
        System.out.println(" ");

        // Variavel para saber se o personagem esta ou não defendendo
        boolean defendendo = false;

        // Loop da batalha
        while (personagem.getVida() > 0 && monstro.getVida() > 0) {
            System.out.println("Escolha sua ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Fugir");

            int acao = scanner.nextInt();
            scanner.nextLine(); // Avança para a próxima linha

            switch (acao) {
                case 1:
                    clearConsole(); // Limpa o console
                    // ATAQUE
                    int danoCausado = personagem.atacar();
                    System.out.println("Você causou " + danoCausado + " de dano!");
                    monstro.tomarDano(danoCausado);
                    break;
                case 2:
                    clearConsole(); // Limpa o console
                    // DEFESA
                    System.out.println("Você está defendendo do ataque do " + monstro.getNome() + " e receberá apenas metade do dano!");
                    defendendo = true; // Atribui o valor verdadeiro a variavel defendendo
                    System.out.println("");
                    personagem.defender();
                    break;
                case 3:
                    clearConsole(); // Limpa o console
                    // TENTAR FUGIR DA BATALHA
                    double chanceDeFuga = personagem.getDestreza() * 0.05;
                    if (Math.random() <= chanceDeFuga) {
                        System.out.println("Você conseguiu fugir da batalha!");
                        System.out.println("");
                        return;
                    } else {
                        System.out.println("Você não conseguiu fugir!");
                        System.out.println("");
                    }
                    break;
                default:
                    clearConsole(); // Limpa o console
                    // AI CÊ TA FORÇANDO A AMIZADE, NÉ AMIGO?
                    System.out.println("Opção inválida! Tente novamente.");
                    System.out.println("");
                    break;
            }

            // Ataque do Monstro
            if (monstro.getVida() > 0) {
                int danoRecebido = monstro.atacar();
                if (danoRecebido > 0) {
                    personagem.tomarDano(danoRecebido);
                    // Condicional que verifica se o status defendendo é diferente de falso
                    if (defendendo != false) {
                        // Caso seja diferente de falso ele mostra o valor do dano recebido dividido por dois e atribui o valor falso para o status defendendo.
                        System.out.println("O " + monstro.getNome() + " causou " + (danoRecebido / 2) + " de dano!");
                        defendendo = false; // Atribui o valor falso a variavel defendendo
                    } else {
                        System.out.println("O " + monstro.getNome() + " causou " + danoRecebido + " de dano!");
                    }

                } else {
                    System.out.println("O " + monstro.getNome() + " não conseguiu te atacar!");
                }
            }
            cont(personagem, monstro); // Exibe a vida do personagem e do monstro
        }

        // Verifica se o personagem foi derrotado
        if (personagem.getVida() <= 0) {
            // GAME OVER - PERDEU A BATALHA
            System.out.println("GAME OVER! Você foi derrotado pelo " + monstro.getNome() + "!");
            System.out.println(" ");
            System.out.println("Pressione Enter para voltar ao Menu Principal...");
            scanner.nextLine(); // Avança para a próxima linha
            main(null); // Retorna para o inicio do jogo
        } else {
            System.out.println("Você derrotou o " + monstro.getNome() + "!");
            System.out.println("");
            System.out.println("Há uma passagem secreta na sala.");
            System.out.println("O que deseja fazer?");
            System.out.println("");
            System.out.println("1. Seguir pela passagem secreta");
            System.out.println("2. Voltar para a sala anterior");

            int escolha4 = scanner.nextInt();
            scanner.nextLine(); // Avança para a próxima linha

            if (escolha4 == 1) {
                System.out.println("Você seguiu pela passagem secreta e encontrou uma sala com um tesouro brilhante!");
                System.out.println("Você venceu o jogo! Parabéns!");
                scanner.nextLine(); // Avança para a próxima linha
                main(null); // Retorna para o inicio do jogo
            } else {
                System.out.println("Você voltou para a sala anterior.");
            }
        }
    }
}