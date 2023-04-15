import java.util.Random;
import java.util.Scanner;

/* Funções Auxiliares */

public class Metodos {
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
                personagem = new Clerigo("Clerigo", "castiçal de clérigo", 201, 27, 37, 5, 0); // nome, arma, vida, forca, defesa, destreza e estusFlask
                break;
            default:
                System.out.println("Opção inválida, saindo...");
                System.exit(0);
        }
        clearConsole(); // Limpa o console
        System.out.printf("Você escolheu a classe %s.\n", personagem.getNome());
        if(personagem.getNome().equals("Clerigo")){
            System.out.printf("\nCalma, você realmente escolheu essa classe?\nDe todas as outras vc escolheu essa? Boa sorte! kkkkkkkk\n");
        }
        delay(1500); // Adiciona atraso 

        return personagem;
    }
    // Gerador de monstros aleatorios
    public static Monstro gerarMonstroAleatorio() {
        Random rand = new Random();
        String[] nomes = { "Esqueleto", "Orc", "Troll", "Goblin", "Dragão" };
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
            System.out.println("Pressione Enter para voltar ao Menu Principal...");
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
                    Game.defendendo = true; // Atribui o valor verdadeiro a variavel defendendo
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
                    if (Game.defendendo != false) {
                        // Caso seja diferente de falso ele mostra o valor do dano recebido dividido por dois e atribui o valor falso para o status defendendo.
                        System.out.printf("O %s causou %d de dano!\n", monstro.getNome(), (danoRecebido / 2));
                        Game.defendendo = false; // Atribui o valor falso a variavel defendendo
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