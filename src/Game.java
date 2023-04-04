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
        System.out.print("Pressione Enter para iniciar o jogo...");
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

            System.out.printf("\n>"); // Indica onde o usuario irá digitar
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Avança para a próxima linha
            
            switch (opcao) {
                case 1:
                    clearConsole(); // Limpa o console
                    System.out.printf("-- INTRODUÇÃO --\n");
                    System.out.printf("\nEste jogo se passa em um mundo governado por deuses, onde humanos e criaturas das trevas lutam pela sobrevivência. \nUm grande demônio, conhecido como Rei Demônio, lidera um exército de monstros e demônios das profundezas do submundo, ameaçando o mundo e marcando possivelmente o seu fim. \nPara salvar a humanidade você precisará lutar contra monstros poderosos e se aprofundar cada vez mais neste universo.\n");
                    System.out.printf("\nDurante a sua aventura, você irá se deparar com diversos monstros que precisam ser derrotados para que você possa avançar na história. \nPara enfrentá-los, você terá a opção de atacar, defender ou até mesmo fugir. \nSuas escolhas durante as batalhas serão cruciais para o resultado final e para o seu progresso na jornada. \n\nPortanto, escolha sabiamente e use suas habilidades e recursos com cautela para vencer essas batalhas épicas. \nBoa sorte!\n\n");
                    delay(1500); // Adiciona atraso 
                    System.out.println(" ");
                    System.out.print("Pressione Enter para continuar...");
                    scanner.nextLine(); // Avança para a próxima linha
                    System.out.println(" ");
                    break;
                case 2:
                    clearConsole(); // Limpa o console
                    jogar(); // Inicia o Jogo
                    break;
                case 3:
                    clearConsole(); // Limpa o console
                    System.out.printf("--CRÉDITOS--");
                    delay(1000); // Adiciona atraso 
                    System.out.println(" ");
                    System.out.println("Desenvolvido por: Ecthor Silva");
                    delay(1500); // Adiciona atraso 
                    System.out.println(" ");
                    System.out.print("Pressione Enter para continuar...");
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
                    System.out.print("Opção inválida, pressione Enter para tentar novamente!");
                    scanner.nextLine(); // Avança para a próxima linha
                    System.out.println(" ");
            }
        }
    }
    // Iniciando o jogo
    public static void jogar(){
        Scanner scanner = new Scanner(System.in);

        clearConsole(); // Limpa o console
        System.out.print("Carregando...");
        delay(1000); // Adiciona atraso 
        clearConsole(); // Limpa o console
        delay(1000); // Adiciona atraso 
        System.out.printf("Era uma vez um mundo governado por deuses poderosos, onde humanos e criaturas das trevas lutavam pela sobrevivência. \nA humanidade vivia em cidades fortificadas, protegidas por muros altos e magia antiga. No entanto, mesmo com todos esses recursos, uma ameaça se aproximava do horizonte.\n");
        delay(1000); // Adiciona atraso
        System.out.println(" ");
        System.out.printf("Rumores surgiram de que um grande demônio estava se aproximando, liderando um exército de monstros e demônios das profundezas do submundo. \nO demônio era conhecido como o Rei Demônio e muitos acreditavam que sua chegada marcaria o fim do mundo.\n");
        delay(1500); // Adiciona atraso
        
        // Criar personagem
        Personagem personagem = criarPersonagem(scanner);

        System.out.println("");
        delay(1500);
        System.out.printf("-- ATO I --\n");
        System.out.println("");
        delay(1500);
        // teste
        visitarTaverna(personagem, scanner);

        explorarFloresta(personagem, scanner);
    }

    // ATO I - Parte 1
    public static void visitarTaverna(Personagem personagem, Scanner scanner) {
        System.out.printf("Você estava caminhando pela estrada durante a noite, sentindo-se exausto e faminto. Avistou uma avistou uma taverna e, mesmo hesitante, decidiu entrar para descansar um pouco. \nAo entrar, você percebe que o local estava relativamente vazio, com apenas algumas pessoas sentadas em mesas espalhadas pelo ambiente. Você se senta no balcão e pede uma bebida ao garçom.\n");
        System.out.printf("\nEnquanto descansa, você percebe que tem um homem misterioso sentado em uma mesa no canto da taverna. O homem parecia estar te observando com bastante interesse. \nO homem misterioso se aproxima de você e oferece uma missão arriscada, mas altamente lucrativa, ele diz precisa de alguém para recuperar um objeto valioso em uma caverna perigosa e está disposto a pagar generosamente por isso.");
        System.out.printf("\n\nA decisão é sua. Você pode aceitar a missão e enfrentar os perigos da caverna, ou recusar e seguir em frente em sua jornada.\n\n");
        System.out.println("1. Aceitar a missão.");
        System.out.println("2. Recusar a missão.");
        
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Avança para a próxima linha
        
        if (escolha == 1) {
            System.out.printf("\nVocê aceita a missão e se prepara para partir no dia seguinte.");
            System.out.println("1");
            scanner.nextLine(); // Avança para a próxima linha
            clearConsole();
            System.out.println("2");
        } else if (escolha == 2) {
            clearConsole();
            System.out.println("Você recusa a missão e decide procurar outra oportunidade.");
            scanner.nextLine(); // Avança para a próxima linha
            explorarFloresta(personagem, scanner);
        } else {
            System.out.println("Escolha inválida!");
            visitarTaverna(personagem, scanner);
            scanner.nextLine(); // Avança para a próxima linha
        }
    }
    public static void explorarFloresta(Personagem personagem, Scanner scanner) {
        System.out.println("Você caminha pela floresta e encontra uma caverna escura.");
        System.out.println("Você entra na caverna e encontra um tesouro antigo!");
        System.out.println("Você decide levar o tesouro e voltar para a cidade.");
        clearConsole(); // Limpa o console
        System.out.println("Você seguiu pela saída à esquerda. Há uma sala cheia de inimigos à sua frente!");               
        // Geração aleatória do monstro
        Monstro monstro = gerarMonstroAleatorio();
        // Loop da Batalha
        loopBatalha(personagem, monstro, scanner);
        System.out.println("Fim do primeiro ato!");
        scanner.nextLine(); // Avança para a próxima linha
    }

    // Funções/Métodos Auxiliares //
    
    // Seleção da Classe do personagem
    public static Personagem criarPersonagem(Scanner scanner) {
        System.out.printf("\nAntes de iniciar você precisará selecionar cuidadosamente sua classe. \nSeu treinamento e habilidades em batalha serão essenciais para superar os desafios que encontrará em sua jornada.\n");
        System.out.println("");
        delay(1500); // Adiciona atraso 
        System.out.println("Escolha sua classe: ");
        System.out.println("");
        System.out.println("1. Guerreiro");
        System.out.println("2. Mago");
        System.out.println("3. Arqueiro");
    
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
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

        clearConsole(); // Limpa o console
        System.out.printf("Você escolheu a classe %s.\n", personagem.getNome());
        delay(1500); // Adiciona atraso 

        return personagem;
    }
    
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
        System.out.printf("Você tem %d de vida.\n", personagem.vida);
        System.out.printf("O %s tem %d de vida.\n", monstro.getNome(), monstro.getVida());
        System.out.println("");
    }
    // Função para verificar se o personagem foi derrotado
    public static void VerificarPersonagem(Personagem personagem, Monstro monstro, Scanner scanner){
        // Verifica se o personagem foi derrotado
        if (personagem.getVida() <= 0) {
            // GAME OVER - PERDEU A BATALHA
            System.out.printf("GAME OVER! Você foi derrotado pelo %s!\n", monstro.getNome());
            System.out.println(" ");
            System.out.println("Pressione Enter para voltar ao Menu Principal...");
            scanner.nextLine(); // Avança para a próxima linha
            main(null); // Retorna para o inicio do jogo
        } else {
            System.out.printf("Você derrotou o %s!\n", monstro.getNome());
        }
    }
    // Função para iniciar o loop da batalha
    public static void loopBatalha(Personagem personagem, Monstro monstro, Scanner scanner) {
        System.out.printf("Um %s apareceu!\n", monstro.getNome());

        cont(personagem, monstro); // Exibe a vida do personagem e do monstro

        // Variavel para saber se o personagem esta ou não defendendo
        boolean defendendo = false;

        // Loop da batalha
        while (personagem.getVida() > 0 && monstro.getVida() > 0) {
            System.out.println("Escolha sua ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Fugir");

            System.out.printf("\n>"); // Indica onde o usuario irá digitar
            int acao = scanner.nextInt();
            scanner.nextLine(); // Avança para a próxima linha

            switch (acao) {
                case 1:
                    clearConsole(); // Limpa o console
                    // ATAQUE
                    int danoCausado = personagem.atacar();
                    System.out.printf("Você causou %d de dano!\n", danoCausado);
                    monstro.tomarDano(danoCausado);
                    break;
                case 2:
                    clearConsole(); // Limpa o console
                    // DEFESA
                    System.out.printf("Você está defendendo do ataque do %s e receberá apenas metade do dano!\n", monstro.getNome());
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
                    // AI CÊ TA FORÇANDO A AMIZADE, NÉ AMIGO?
                    clearConsole(); // Limpa o console
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
                        System.out.printf("O %s causou %d de dano!\n", monstro.getNome(), (danoRecebido / 2));
                        
                        defendendo = false; // Atribui o valor falso a variavel defendendo
                    } else {
                        System.out.printf("O %s causou %d de dano!\n", monstro.getNome(), danoRecebido);
                    }

                } else {
                    System.out.printf("O %s não conseguiu te atacar!\n", monstro.getNome());
                }
            }
            cont(personagem, monstro); // Exibe a vida do personagem e do monstro
        }
        VerificarPersonagem(personagem, monstro, scanner); // Verificar se o personagem foi derrotado
    }
}