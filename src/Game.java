import java.util.Scanner;
import java.util.Random;
public class Game {
    // Variavel para verificar se o personagem esta ou não defendendo
    static boolean defendendo = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        // Boas vindas
        clearConsole(); // Limpa o console
        System.out.printf("Bem-vindo ao From the Ashes\n");
        System.out.printf("\nPressione Enter para iniciar o jogo...");
        scanner.nextLine(); // Avança para a próxima linha
        
        // Menu Principal
        while (!sair) {
            clearConsole(); // Limpa o console
            System.out.printf("Escolha uma das opções abaixo: \n\n1. Introdução\n2. Jogar\n3. Créditos\n4. Sair\n");
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

        delay(1500);
        System.out.printf("\n-- ATO I --\n\n");
        delay(1500);
        
        // Ato I - Parte 1
        visitarTaverna(personagem, scanner);

        System.out.printf("\n-- Fim do ATO I --\n");
        System.out.printf("\nPressione Enter para continuar...");
        scanner.nextLine(); // Avança para a próxima linha
        clearConsole(); // Limpa o console
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
        
        switch (escolha) {
            case 1:
            clearConsole(); // Limpa o console
                // Missão
                System.out.printf("\nAo sair da taverna e voltar para a estrada, seguindo o caminho que o homem misterioso indicou. \nVocê começa a notar uma neblina escura se aproximando, o que torna difícil ver o que está a sua frente.\n");
                System.out.printf("\nDe repente, um som terrível ecoa no ar e você percebe que demônios estão se aproximando. Eles vêm de todos os lados, emergindo da névoa negra e avançando em sua direção.\n");
                System.out.printf("\nVocê se vira e corre em direção à floresta, buscando refúgio, mas um dos demônios te persegue sem piedade. Não há escapatória, então você decide encarar a criatura.\nCom o seu %s em mãos, você se posiciona proximo a uma clareira aberta. Suas mãos tremem e seu coração bate forte no peito, \nenquanto o monstro se aproxima com passos pesados, rosnando com uma fúria impiedosa.\n\n", personagem.getArma());

                // Geração aleatória do monstro
                Monstro monstro = gerarMonstroAleatorio();
                // Loop da Batalha
                loopBatalha(personagem, monstro, scanner);

                /* criar um sistema de itens de cura para prosseguir com essa historia na segunda parte */ 
                
                System.out.printf("\nPressione Enter para continuar...");
                scanner.nextLine(); // Avança para a próxima linha
                clearConsole(); // Limpa o console
                oPortal(personagem, scanner);
                break;
            case 2:
            clearConsole(); // Limpa o console
                // Missão
                System.out.printf("Ao recusar a missão, o homem misterioso se levanta da mesa com um olhar furioso e começa a murmurar palavras ofensivas e insultos em sua direção, \nfazendo com que a tensão aumente no ambiente. Você se prepara para uma possível luta segurando o seu %s.\n", personagem.getArma());
                System.out.printf("\nNo entanto, antes que o pior aconteça, o dono da taverna bruscamente interrompe a discussão vocês. \nAo se aproximar da mesa o dono da taverna diz ao homem misterioso que não é permitido causar problemas neste estabelecimento.\n");
                System.out.printf("\nO homem misterioso solta um grunhido de insatisfação e se senta novamente. A fim de evitar uma nova briga você vira as costas e segue seu caminha em direção a estrada.\n");


                System.out.printf("\nPressione Enter para continuar...");
                scanner.nextLine(); // Avança para a próxima linha
                clearConsole(); // Limpa o console
                explorarFloresta(personagem, scanner);
                break;
            default:
                System.out.println("Escolha inválida!");
                visitarTaverna(personagem, scanner);
                scanner.nextLine(); // Avança para a próxima linha
                break;
        }
    }
    // ATO I - Parte 2
    public static void explorarFloresta(Personagem personagem, Scanner scanner) {
        System.out.printf("Enquanto caminhava pela estrada, você ouviu um grito de socorro vindo da floresta próxima e decidiu seguir a voz para investigar. \nO som fica mais alto à medida que você se aproxima. Ao chegar no local você se depara com um soldado que esta lutando contra um demônio.\n");
        System.out.printf("\nO demônio é uma criatura horrenda, com garras afiadas e olhos ardentes. Sem hesitar, você puxa o seu %s e corre para o combate. \n\n", personagem.getArma());
        
        // Geração aleatória do monstro
        Monstro monstro = gerarMonstroAleatorio();
        // Loop da Batalha
        loopBatalha(personagem, monstro, scanner);

        clearConsole(); // Limpa o console
        System.out.printf("Com o inimigo morto, você se aproxima do soldado ferido e percebe que ele está à beira da morte. \nEle estende a mão e entrega a você um pequeno frasco contendo uma poção de cura. \nVocê tenta dar a poção, mas é tarde demais. O soldado morre em seus braços.\n");
        System.out.printf("\nVocê se levanta e segue com a sua jornada.\n");

        // criar um sistema de itens de cura para prosseguir com essa historia na segunda parte
        acharCura(personagem);
        System.out.println("passou aqui");

        System.out.printf("\nPressione Enter para continuar...");
        scanner.nextLine(); // Avança para a próxima linha
        clearConsole(); // Limpa o console
        oPortal(personagem, scanner);
    }
    // ATO I - Parte 3
    public static void oPortal(Personagem personagem, Scanner scanner) {
        System.out.printf("Enquanto caminha você avista uma luz intensa. A luminosidade é tão forte que transforma a noite em dia, deixando você curioso sobre o que pode estar acontecendo. \nDecidido a desvendar o mistério, você avança em direção a luz.\n");
        System.out.printf("\nA medida que você avança, percebe que a luz parece vir de uma clareira à frente. \nQuando chega mais perto, vê que há uma espécie de portal brilhante no centro da clareira, que parece estar se expandindo e pulsando. \nO vento sopra forte e uma energia estranha parece envolver tudo ao seu redor.\n");
        System.out.printf("\nCurioso, você se aproxima do portal e sente uma sensação de formigamento em todo o corpo. \nAntes que você possa decidir o que fazer, uma figura encapuzada surge do outro lado do portal e começa a falar com você em um idioma desconhecido.\n");

        System.out.printf("\nPressione Enter para continuar...");
        scanner.nextLine(); // Avança para a próxima linha
        clearConsole(); // Limpa o console

        if(personagem.getNome().equals("Mago")){
            System.out.printf("Você se aproxima do portal com cautela, observando atentamente os símbolos e marcas inscritos em torno dele \ne imediatamente reconhece que esses murmuros se tratam de uma língua antiga e esquecida, usada há milhares de anos atrás.\n");
            System.out.printf("\nSua curiosidade e desejo por conhecimento o impulsionam a se aproximar ainda mais. Você tenta lançar um feitiço, \nmas ao terminar de erguer a mão em direção do portal ele desaparece abruptamente, deixando para trás apenas uma chave misteriosa, que brilha suavemente na palma de sua mão.\n");
        }else{
            // Geração aleatória do monstro
            Monstro monstro = gerarMonstroAleatorio();
            // Loop da Batalha
            loopBatalha(personagem, monstro, scanner);
            System.out.printf("\nEnquanto você tenta se aproximar ainda mais do portal, uma onda de energia poderosa o empurra para trás, fazendo com que caia no chão, sentindo-se desnorteado. \nApós se recuperar, percebe que o portal desapareceu completamente, deixando para trás apenas uma chave misteriosa, que brilha suavemente na palma de sua mão, \ncomo um lembrete da estranha experiência que teve.\n");
        }
        System.out.printf("\nPressione Enter para continuar...");
        scanner.nextLine(); // Avança para a próxima linha
        clearConsole(); // Limpa o console
    }
    // ATO II - Parte 1

    // Funções/Métodos Auxiliares //
    
    // Seleção da Classe do personagem
    public static Personagem criarPersonagem(Scanner scanner) {
        System.out.printf("\nAntes de iniciar você precisará selecionar cuidadosamente sua classe. \nSeu treinamento e habilidades em batalha serão essenciais para superar os desafios que encontrará em sua jornada.\n\n");
        delay(1500); // Adiciona atraso 
        System.out.printf("Escolha sua classe: \n\n1. Guerreiro \n2. Mago \n3. Arqueiro");
    
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int classeEscolhida = scanner.nextInt();
        scanner.nextLine(); // Avança para a próxima linha
    
        // Escolha de classe
        Personagem personagem = null;
        switch (classeEscolhida) { // Selecionar a classe do personagem
            case 1:
                personagem = new Guerreiro("Guerreiro", "machado", 200, 30, 40, 10, 0); // nome, arma, vida, forca, defesa, destreza e estusFlask
                break;
            case 2:
                personagem = new Mago("Mago", "cajado", 150, 35, 45, 20, 0); // nome, arma, vida, forca, defesa, destreza e estusFlask
                break;
            case 3:
                personagem = new Arqueiro("Arqueiro", "arco", 170, 25, 15, 35, 0); // nome, arma, vida, forca, defesa, destreza e estusFlask
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
        System.out.printf("\nVocê tem %d de vida.\n", personagem.getVida());
        System.out.printf("O %s tem %d de vida.\n\n", monstro.getNome(), monstro.getVida());

        System.out.printf("\nVocê tem %d de estus flask.\n", personagem.getEstusFlask());
    }
    // Função para verificar se o personagem foi derrotado
    public static void VerificarPersonagem(Personagem personagem, Monstro monstro, Scanner scanner){
        // Verifica se o personagem foi derrotado
        if (personagem.getVida() <= 0) {
            // GAME OVER - PERDEU A BATALHA
            System.out.printf("GAME OVER! Você foi derrotado pelo %s!\n\n", monstro.getNome());
            System.out.println("Pressione Enter para voltar ao Menu Principal...");
            scanner.nextLine(); // Avança para a próxima linha
            main(null); // Retorna para o inicio do jogo
        } else {
            System.out.printf("Você derrotou o %s!\n\n", monstro.getNome());
        }
    }
    // Função para iniciar o loop da batalha
    public static void loopBatalha(Personagem personagem, Monstro monstro, Scanner scanner) {
        System.out.printf("Um %s apareceu!\n", monstro.getNome());

        cont(personagem, monstro); // Exibe a vida do personagem e do monstro

        // Loop da batalha
        while (personagem.getVida() > 0 && monstro.getVida() > 0) {
            System.out.printf("Escolha sua ação: \n\n1. Atacar \n2. Defender \n3. Fugir");
            System.out.printf("\n>"); // Indica onde o usuario irá digitar
            int acao = scanner.nextInt();
            scanner.nextLine(); // Avança para a próxima linha

            switch (acao) {
                case 1:
                    clearConsole(); // Limpa o console
                    // ATAQUE
                    int danoCausado = personagem.atacar();
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
                        System.out.printf("Você conseguiu fugir da batalha!\n\n");
                        return;
                    } else {
                        System.out.printf("Você não conseguiu fugir!\n\n");
                    }
                    break;
                default:
                    // AI CÊ TA FORÇANDO A AMIZADE, NÉ AMIGO?
                    clearConsole(); // Limpa o console
                    System.out.printf("Opção inválida! Tente novamente.\n\n");
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
    public static void acharCura(Personagem personagem){
        if (personagem.getEstusFlask() < 3){
            int estusFlask = personagem.getEstusFlask();
            personagem.setEstusFlask(estusFlask + 1);
            System.out.printf("Você encontrou %d Estus e guardou em seu inventario.", personagem.getEstusFlask());         
        }else{
            System.out.printf("Você tem %d Estus em seu inventario.", personagem.getEstusFlask());
        }
    }
}