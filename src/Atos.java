import java.util.Scanner;

/* Funções de historia */

public class Atos {
    /* ATO I - Parte 1 */ 
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
                Metodos.clearConsole(); // Limpa o console
                // Missão
                System.out.printf("\nAo sair da taverna e voltar para a estrada, seguindo o caminho que o homem misterioso indicou. \nVocê começa a notar uma neblina escura se aproximando, o que torna difícil ver o que está a sua frente.\n");
                System.out.printf("\nDe repente, um som terrível ecoa no ar e você percebe que demônios estão se aproximando. Eles vêm de todos os lados, emergindo da névoa negra e avançando em sua direção.\n");
                System.out.printf("\nVocê se vira e corre em direção à floresta, buscando refúgio, mas um dos demônios te persegue sem piedade. Não há escapatória, então você decide encarar a criatura.\nCom o seu %s em mãos, você se posiciona proximo a uma clareira aberta. Suas mãos tremem e seu coração bate forte no peito, \nenquanto o monstro se aproxima com passos pesados, rosnando com uma fúria impiedosa.\n\n", personagem.getArma());

                // Geração aleatória do monstro
                Monstro monstro = Metodos.gerarMonstroAleatorio();
                // Loop da Batalha
                Metodos.loopBatalha(personagem, monstro, scanner);
                // Encontrou uma cura 
                Personagem.acharCura(personagem);
                
                System.out.printf("\nPressione Enter para continuar...");
                scanner.nextLine(); // Avança para a próxima linha
                Metodos.clearConsole(); // Limpa o console
                oPortal(personagem, scanner);
                break;
            case 2:
                Metodos.clearConsole(); // Limpa o console
                // Missão
                System.out.printf("Ao recusar a missão, o homem misterioso se levanta da mesa com um olhar furioso e começa a murmurar palavras ofensivas e insultos em sua direção, \nfazendo com que a tensão aumente no ambiente. Você se prepara para uma possível luta segurando o seu %s.\n", personagem.getArma());
                System.out.printf("\nNo entanto, antes que o pior aconteça, o dono da taverna bruscamente interrompe a discussão vocês. \nAo se aproximar da mesa o dono da taverna diz ao homem misterioso que não é permitido causar problemas neste estabelecimento.\n");
                System.out.printf("\nO homem misterioso solta um grunhido de insatisfação e se senta novamente. A fim de evitar uma nova briga você vira as costas e segue seu caminha em direção a estrada.\n");

                System.out.printf("\nPressione Enter para continuar...");
                scanner.nextLine(); // Avança para a próxima linha
                Metodos.clearConsole(); // Limpa o console
                explorarFloresta(personagem, scanner);
                break;
            default:
                System.out.println("Escolha inválida!");
                visitarTaverna(personagem, scanner);
                scanner.nextLine(); // Avança para a próxima linha
                break;
        }
    }
    /* ATO I - Parte 2 */
    public static void explorarFloresta(Personagem personagem, Scanner scanner) {
        System.out.printf("Enquanto caminhava pela estrada, você ouviu um grito de socorro vindo da floresta próxima e decidiu seguir a voz para investigar. \nO som fica mais alto à medida que você se aproxima. Ao chegar no local você se depara com um soldado que esta lutando contra um demônio.\n");
        System.out.printf("\nO demônio é uma criatura horrenda, com garras afiadas e olhos ardentes. Sem hesitar, você puxa o seu %s e corre para o combate. \n\n", personagem.getArma());
        
        // Geração aleatória do monstro
        Monstro monstro = Metodos.gerarMonstroAleatorio();
        // Loop da Batalha
        Metodos.loopBatalha(personagem, monstro, scanner);

        Metodos.clearConsole(); // Limpa o console
        System.out.printf("Com o inimigo morto, você se aproxima do soldado ferido e percebe que ele está à beira da morte. \nEle estende a mão e entrega a você um pequeno frasco contendo uma poção de cura. \nVocê tenta dar a poção, mas é tarde demais. O soldado morre em seus braços.\n");
        System.out.printf("\nVocê se levanta e segue com a sua jornada.\n");

        // Encontrou uma cura 
        Personagem.acharCura(personagem);

        System.out.printf("\nPressione Enter para continuar...");
        scanner.nextLine(); // Avança para a próxima linha
        Metodos.clearConsole(); // Limpa o console
        oPortal(personagem, scanner);
    }
    /* ATO I - Parte 3 */ 
    public static void oPortal(Personagem personagem, Scanner scanner) {
        System.out.printf("Enquanto caminha você avista uma luz intensa. A luminosidade é tão forte que transforma a noite em dia, deixando você curioso sobre o que pode estar acontecendo. \nDecidido a desvendar o mistério, você avança em direção a luz.\n");
        System.out.printf("\nA medida que você avança, percebe que a luz parece vir de uma clareira à frente. \nQuando chega mais perto, vê que há uma espécie de portal brilhante no centro da clareira, que parece estar se expandindo e pulsando. \nO vento sopra forte e uma energia estranha parece envolver tudo ao seu redor.\n");
        System.out.printf("\nCurioso, você se aproxima do portal e sente uma sensação de formigamento em todo o corpo. \nAntes que você possa decidir o que fazer, uma figura encapuzada surge do outro lado do portal e começa a falar com você em um idioma desconhecido.\n");

        System.out.printf("\nPressione Enter para continuar...");
        scanner.nextLine(); // Avança para a próxima linha
        Metodos.clearConsole(); // Limpa o console

        if(personagem.getNome().equals("Mago")){
            System.out.printf("Você se aproxima do portal com cautela, observando atentamente os símbolos e marcas inscritos em torno dele \ne imediatamente reconhece que esses murmuros se tratam de uma língua antiga e esquecida, usada há milhares de anos atrás.\n");
            System.out.printf("\nSua curiosidade e desejo por conhecimento o impulsionam a se aproximar ainda mais. Você tenta lançar um feitiço, \nmas ao terminar de erguer a mão em direção do portal ele desaparece abruptamente, deixando para trás apenas uma chave misteriosa, que brilha suavemente na palma de sua mão.\n");
        }else{
            /* Batalha adicionada para testar as funções achar cura e usar cura */
            // Geração aleatória do monstro
            Monstro monstro = Metodos.gerarMonstroAleatorio();
            // Loop da Batalha
            Metodos.loopBatalha(personagem, monstro, scanner);
            System.out.printf("\nEnquanto você tenta se aproximar ainda mais do portal, uma onda de energia poderosa o empurra para trás, fazendo com que caia no chão, sentindo-se desnorteado. \nApós se recuperar, percebe que o portal desapareceu completamente, deixando para trás apenas uma chave misteriosa, que brilha suavemente na palma de sua mão, \ncomo um lembrete da estranha experiência que teve.\n");
        }
        System.out.printf("\nPressione Enter para continuar...");
        scanner.nextLine(); // Avança para a próxima linha
        Metodos.clearConsole(); // Limpa o console
    }
    /* ATO II - Parte 1 */
}