import classes.*;

import java.util.Random;
import java.util.Scanner;

/* Funções Auxiliares */
public class Metodos {
    // Variavel para verificar se o personagem esta ou não defendendo
    static boolean defendendo = false;
    
    // Menu
    public static void menu() {
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
                    delay(1000); // Adiciona atraso 
                    System.out.printf("\nEste jogo se passa em um mundo governado por deuses, onde humanos e criaturas das trevas lutam pela sobrevivência. \nUm grande demônio, conhecido como Rei Demônio, lidera um exército de monstros e demônios das profundezas do submundo, ameaçando o mundo e marcando possivelmente o seu fim. \nPara salvar a humanidade você precisará lutar contra monstros poderosos e se aprofundar cada vez mais neste universo.\n");
                    System.out.printf("\nDurante a sua aventura, você irá se deparar com diversos monstros que precisam ser derrotados para que você possa avançar na história. \nPara enfrentá-los, você terá a opção de atacar, defender ou até mesmo fugir. \nSuas escolhas durante as batalhas serão cruciais para o resultado final e para o seu progresso na jornada. \n\nPortanto, escolha sabiamente e use suas habilidades e recursos com cautela para vencer essas batalhas épicas. \nBoa sorte!\n\n");
                    delay(1500); // Adiciona atraso 
                    System.out.print("Pressione Enter para continuar...");
                    scanner.nextLine(); // Avança para a próxima linha
                    break;
                case 2:
                    clearConsole(); // Limpa o console
                    jogar(); // Inicia o Jogo
                    break;
                case 3:
                    clearConsole(); // Limpa o console
                    System.out.printf("--CRÉDITOS--\n\n");
                    delay(1000); // Adiciona atraso 
                    System.out.printf("Desenvolvido por: Ecthor Silva\n\n");
                    delay(1500); // Adiciona atraso 
                    System.out.printf("Pressione Enter para continuar...");
                    scanner.nextLine(); // Avança para a próxima linha
                    break;
                case 4:
                    sair = true;
                    clearConsole(); // Limpa o console
                    System.out.print("Saindo do jogo...");
                    delay(1000); // Adiciona atraso 
                    break;
                default:
                    clearConsole(); // Limpa o console
                    System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
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
        delay(1000); // Adiciona atraso
        
        // Criar personagem
        Personagem personagem = criarPersonagem(scanner);

        delay(1000); // Adiciona atraso 
        System.out.printf("\n-- ATO I --\n\n");
        delay(1000); // Adiciona atraso 
        
        /* Ato I */ 
        Atos.visitarTaverna(personagem, scanner);

        delay(1000); // Adiciona atraso 
        System.out.printf("\n-- Fim do ATO I --\n");
        delay(1000); // Adiciona atraso 
        System.out.printf("\nObrigado por jogar esta demo\n");
        delay(1000); // Adiciona atraso 
        
        System.out.printf("\nPressione Enter para continuar...");
        
        scanner.nextLine(); // Avança para a próxima linha
        clearConsole(); // Limpa o console
    }
    // Seleção da Classe do personagem
    public static Personagem criarPersonagem(Scanner scanner) {
        System.out.printf("\nAntes de iniciar você precisará selecionar cuidadosamente sua classe. \nSeu treinamento e habilidades em batalha serão essenciais para superar os desafios que encontrará em sua jornada.\n\n");
        delay(1500); // Adiciona atraso 
        System.out.printf("Escolha sua classe: \n\n1. Guerreiro \n2. Mago \n3. Arqueiro\n4. Clerigo");
    
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int classeEscolhida = scanner.nextInt();
        scanner.nextLine(); // Avança para a próxima linha
       
        // Escolha de classe
        Personagem personagem = null;
        switch (classeEscolhida) { // Selecionar a classe do personagem
            case 1:
                personagem = new Guerreiro("Guerreiro", "machado", 257, 70, 43, 10, 0); // nome, arma, vida, forca, defesa, destreza e estusFlask
                break;
            case 2:
                personagem = new Mago("Mago", "cajado", 190, 46, 41, 20, 0); // nome, arma, vida, forca, defesa, destreza e estusFlask
                break;
            case 3:
                personagem = new Arqueiro("Arqueiro", "arco", 200, 50, 39, 35, 0); // nome, arma, vida, forca, defesa, destreza e estusFlask
                break;
            case 4: 
                personagem = new Clerigo("Clérigo", "castiçal de clérigo", 201, 27, 37, 5, 0); // nome, arma, vida, forca, defesa, destreza e estusFlask
                break;
            default:
                clearConsole(); // Limpa o console
                System.out.println("Opção inválida. Tente novamente...");
                // Caso escolha uma opção inexistente o jogo retorna para a criação de personagem
                delay(1000);
                return criarPersonagem(scanner);
        }
        clearConsole(); // Limpa o console
        System.out.printf("Você escolheu a classe %s.\n", personagem.getNome());
        if(personagem.getNome().equals("Clérigo")){
            System.out.printf("\nCalma, você realmente escolheu essa classe?\nDe todas as outras vc escolheu essa? Boa sorte! kkkkkkkk\n");
        }
        delay(1500); // Adiciona atraso 
        return personagem;
    }
    // Gerador de monstros aleatorios
    public static Monstro gerarMonstroAleatorio() {
        Random rand = new Random();
        String[] nomes = { "Demônio Elemental", "Demônio Abissal", "Demônio da Morte", "Demônio do Caos", "Demônio do Medo" };
        int vida = rand.nextInt(100) + 100; // Vida do Monstro
        int ataque = rand.nextInt(30) + 20; // Ataque do Monstro
        int defesa = rand.nextInt(30) + 20; // Defesa do Monstro
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
        System.out.printf("Você tem %d de estus flask.\n\n", personagem.getEstusFlask());
    }
    // Função para verificar se o personagem foi derrotado
    public static void VerificarPersonagem(Personagem personagem, Monstro monstro, Scanner scanner){
        // Verifica se o personagem foi derrotado
        if (personagem.getVida() <= 0) {
            // GAME OVER - PERDEU A BATALHA
            System.out.printf("GAME OVER! Você foi derrotado pelo %s!\n\n", monstro.getNome());
            delay(1000); // Adiciona atraso
            System.out.print("Pressione Enter para voltar ao Menu Principal...");
            scanner.nextLine(); // Avança para a próxima linha
            Game.main(null); // Retorna para o inicio do jogo
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
            System.out.printf("Escolha sua ação: \n\n1. Atacar \n2. Defender \n3. Fugir\n4. Curar");
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
                    // FUGIR
                    if(personagem.fugir() == 1){
                        return;
                    }
                    break;
                case 4: 
                    // CURAR
                    clearConsole(); // Limpa o console
                    Personagem.usarCura(personagem);
                    System.out.println("");
                    personagem.defender();
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
}