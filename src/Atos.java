import classes.Monstro;
import classes.Personagem;

import java.util.Scanner;

/* Funções de historia */

public class Atos {
    /* ATO I - Parte 1 */ 
    public static void visitarTaverna(Personagem personagem, Scanner input) {
        System.out.printf("Você estava caminhando pela estrada durante a noite, sentindo-se exausto e faminto. Avistou uma taverna e, mesmo hesitante, decidiu entrar para descansar um pouco. \nAo entrar, você percebe que o local estava relativamente vazio, com apenas algumas pessoas sentadas em mesas espalhadas pelo ambiente. Você se senta no balcão e pede uma bebida ao garçom.\n");
        Metodos.delay(1500); // Adiciona atraso
        System.out.printf("\nEnquanto descansa, você percebe que tem um homem misterioso sentado em uma mesa no canto da taverna. O homem parecia estar te observando com bastante interesse. \nO homem misterioso se aproxima de você e oferece uma missão arriscada, mas altamente lucrativa, ele diz precisa de alguém para recuperar um objeto valioso em uma caverna perigosa e está disposto a pagar generosamente por isso.");
        Metodos.delay(1500); // Adiciona atraso
        System.out.printf("\n\nA decisão é sua. Você pode aceitar a missão e enfrentar os perigos da caverna, ou recusar e seguir em frente em sua jornada.\n\n");
        Metodos.delay(1000); // Adiciona atraso
        System.out.println("1. Aceitar a missão.");
        System.out.println("2. Recusar a missão.");
        
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha
        
        switch (escolha) {
            case 1:
                Metodos.clearConsole(); // Limpa o console
                // Missão
                System.out.printf("\nAo sair da taverna e voltar para a estrada, seguindo o caminho que o homem misterioso indicou. \nVocê começa a notar uma neblina escura se aproximando, o que torna difícil ver o que está a sua frente.\n");
                Metodos.delay(1000); // Adiciona atraso
                System.out.printf("\nDe repente, um som terrível ecoa no ar e você percebe que demônios estão se aproximando. Eles vêm de todos os lados, emergindo da névoa negra e avançando em sua direção.\n");
                Metodos.delay(1000); // Adiciona atraso
                System.out.printf("\nVocê se vira e corre em direção à floresta, buscando refúgio, mas um dos demônios te persegue sem piedade. Não há escapatória, então você decide encarar a criatura.\nCom o seu %s em mãos, você se posiciona proximo a uma clareira aberta. Suas mãos tremem e seu coração bate forte no peito, \nenquanto o monstro se aproxima com passos pesados, rosnando com uma fúria impiedosa.\n\n", personagem.getArma());
                Metodos.delay(1000); // Adiciona atraso
                // Geração aleatória do monstro
                Monstro monstro = Metodos.gerarMonstroAleatorio();
                // Loop da Batalha
                Metodos.loopBatalha(personagem, monstro, input);
                // Encontrou uma cura 
                Personagem.acharCura(personagem);
                Metodos.delay(1500); // Adiciona atraso
                System.out.printf("\nPressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                Metodos.clearConsole(); // Limpa o console
                oPortal(personagem, input);
                break;
            case 2:
                Metodos.clearConsole(); // Limpa o console
                // Missão
                System.out.printf("Ao recusar a missão, o homem misterioso se levanta da mesa com um olhar furioso e começa a murmurar palavras ofensivas e insultos em sua direção, \nfazendo com que a tensão aumente no ambiente. Você se prepara para uma possível luta segurando o seu %s.\n", personagem.getArma());
                Metodos.delay(1000); // Adiciona atraso
                System.out.printf("\nNo entanto, antes que o pior aconteça, o dono da taverna bruscamente interrompe a discussão vocês. \nAo se aproximar da mesa o dono da taverna diz ao homem misterioso que não é permitido causar problemas neste estabelecimento.\n");
                Metodos.delay(1000); // Adiciona atraso
                System.out.printf("\nO homem misterioso solta um grunhido de insatisfação e se senta novamente. A fim de evitar uma nova briga você vira as costas e segue seu caminha em direção a estrada.\n");
                Metodos.delay(1500); // Adiciona atraso
                System.out.printf("\nPressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                Metodos.clearConsole(); // Limpa o console
                explorarFloresta(personagem, input);
                break;
            default:
                System.out.println("Escolha inválida!");
                visitarTaverna(personagem, input);
                input.nextLine(); // Avança para a próxima linha
                break;
        }
    }
    /* ATO I - Parte 2 */
    public static void explorarFloresta(Personagem personagem, Scanner input) {
        System.out.printf("Enquanto caminhava pela estrada, você ouviu um grito de socorro vindo da floresta próxima e decidiu seguir a voz para investigar. \nO som fica mais alto à medida que você se aproxima. Ao chegar no local você se depara com um soldado que esta lutando contra um demônio.\n");
        Metodos.delay(1000); // Adiciona atraso
        System.out.printf("\nO demônio é uma criatura horrenda, com garras afiadas e olhos ardentes. Sem hesitar, você puxa o seu %s e corre para o combate. \n\n", personagem.getArma());
        Metodos.delay(1000); // Adiciona atraso
        // Geração aleatória do monstro
        Monstro monstro = Metodos.gerarMonstroAleatorio();
        // Loop da Batalha
        Metodos.loopBatalha(personagem, monstro, input);

        Metodos.clearConsole(); // Limpa o console
        System.out.printf("Com o inimigo morto, você se aproxima do soldado ferido e percebe que ele está à beira da morte. \nEle estende a mão e entrega a você um pequeno frasco contendo uma poção de cura. \nVocê tenta dar a poção, mas é tarde demais. O soldado morre em seus braços.\n");
        Metodos.delay(1000); // Adiciona atraso
        System.out.printf("\nVocê se levanta e segue com a sua jornada.\n");

        // Encontrou uma cura 
        Personagem.acharCura(personagem);

        System.out.printf("\nPressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha
        Metodos.clearConsole(); // Limpa o console
        oPortal(personagem, input);
    }
    /* ATO I - Parte 3 */ 
    public static void oPortal(Personagem personagem, Scanner input) {
        System.out.printf("Enquanto caminha você avista uma luz intensa. A luminosidade é tão forte que transforma a noite em dia, deixando você curioso sobre o que pode estar acontecendo. \nDecidido a desvendar o mistério, você avança em direção a luz.\n");
        Metodos.delay(1000); // Adiciona atraso
        System.out.printf("\nA medida que você avança, percebe que a luz parece vir de uma clareira à frente. \nQuando chega mais perto, vê que há uma espécie de portal brilhante no centro da clareira, que parece estar se expandindo e pulsando. \nO vento sopra forte e uma energia estranha parece envolver tudo ao seu redor.\n");
        Metodos.delay(1000); // Adiciona atraso
        System.out.printf("\nCurioso, você se aproxima do portal e sente uma sensação de formigamento em todo o corpo. \nAntes que você possa decidir o que fazer, uma figura encapuzada surge do outro lado do portal e começa a falar com você em um idioma desconhecido.\n");
        Metodos.delay(1500); // Adiciona atraso
        System.out.printf("\nPressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha
        Metodos.clearConsole(); // Limpa o console

        if(personagem.getNome().equals("classes.Mago")){
            System.out.printf("Você se aproxima do portal com cautela, observando atentamente os símbolos e marcas inscritos em torno dele \ne imediatamente reconhece que esses murmuros se tratam de uma língua antiga e esquecida, usada há milhares de anos atrás.\n");
            Metodos.delay(1000); // Adiciona atraso
            System.out.printf("\nSua curiosidade e desejo por conhecimento o impulsionam a se aproximar ainda mais. Você tenta lançar um feitiço, \nmas ao terminar de erguer a mão em direção do portal ele desaparece abruptamente, deixando para trás apenas uma chave misteriosa, que brilha suavemente na palma de sua mão.\n");
        }else{
            System.out.printf("\nEnquanto você tenta se aproximar ainda mais do portal, uma onda de energia poderosa o empurra para trás, fazendo com que caia no chão, sentindo-se desnorteado. \nApós se recuperar, percebe que o portal desapareceu completamente, deixando para trás apenas uma chave misteriosa, que brilha suavemente na palma de sua mão, \ncomo um lembrete da estranha experiência que teve.\n");
        }
        Metodos.delay(1500); // Adiciona atraso
        System.out.printf("\nPressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha
        Metodos.clearConsole(); // Limpa o console
    }
    /* ATO II - Parte 1 */
    public static void aCaverna(Personagem personagem, Scanner input) {
        System.out.printf("Confuso com o que acabou de presenciar, você se afasta das marcas deixadas no chão pelo portal e decide seguir adiante, buscando sair da clareira e retomar o seu caminho. \nNo entanto, a sensação de que algo está te perseguindo permanece. Sem hesitar, você toma uma decisão rápida e instintiva correndo em direção a uma caverna próxima para buscar abrigo e se esconder.\n\n");
        Metodos.delay(1000); // Adiciona atraso
        System.out.printf("Ao adentrar a caverna escura tudo o que você consegue ouvir são os sons dos seus passos ecoando pelas paredes rochosas. \nA escuridão se intensifica a cada passo que você dá em direção ao interior da caverna. \nEnquanto você se move cautelosamente, apoiando-se nas paredes para obter equilíbrio, uma entrada secreta, antes perfeitamente camuflada nas paredes de pedra, se abre ao seu lado.\n");
        Metodos.delay(1000); // Adiciona atraso
        System.out.printf("\nA abertura revela um corredor estreito e misterioso que se estende para além da vista: \n\n1) Seguir através da entrada secreta.\n2) Continuar seu caminho ao interior da caverna.\n");

        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha

        switch (escolha) {
            case 1:
                Metodos.clearConsole(); // Limpa o console
                // Passagem secreta
                System.out.printf("À medida que avança, o som dos seus passos ecoa pelas paredes rochosas, criando uma atmosfera sinistra e desconcertante. \nSeus sentidos estão alertas, buscando detectar qualquer sinal de perigo iminente.\n\n");
                Metodos.delay(1000); // Adiciona atraso
                System.out.printf("Após alguns passos, você entra em uma sala ampla e iluminada por velas trêmulas. \nNo centro, encontra-se uma figura encapuzada ajoelhada em frente a um antigo altar.\n\n");
                Metodos.delay(1000); // Adiciona atraso
                System.out.printf("Conforme você se aproxima, a figura encapuzada se levanta lentamente, revelando uma aura sinistra que emana de seu corpo. \nEm um instante, sua forma se distorce e se transforma em uma criatura horrenda.\n\n");
                Metodos.delay(1000); // Adiciona atraso
                // Geração aleatória do monstro
                Monstro monstro = Metodos.gerarMonstroAleatorio();
                // Loop da Batalha
                Metodos.loopBatalha(personagem, monstro, input);
                // Encontrou uma cura 
                Personagem.acharCura(personagem);
                Metodos.delay(1500); // Adiciona atraso
                System.out.printf("\nPressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                Metodos.clearConsole();
                System.out.printf("Após uma luta árdua e repleta de tensão, suas habilidades superam a criatura das trevas. \nEla emite um grito final e desaparece em uma névoa sombria, dissipando-se lentamente no ar.\n\n");
                System.out.printf("A sala volta a ser iluminada apenas pelas velas. \nEnquanto recupera o fôlego e avalia os ferimentos, seu olhar é atraído para uma porta no fundo da sala, antes oculta pelas sombras. \nA porta, agora aberta, revela uma passagem que se estende em direção ao desconhecido.\n");
                // Aquela pausinha marota
                System.out.printf("\nPressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                Metodos.clearConsole(); // Limpa o console
                /* Chamar o proximo capitulo*/
                break;
            case 2:
                Metodos.clearConsole(); // Limpa o console
                // Segue o baile
                System.out.printf("Você decide continuar seu caminho ao interior da caverna, ignorando a entrada secreta que se revelou ao seu lado.\nEnquanto avança, a escuridão ao seu redor fica cada vez mais densa e impenetrável.\n\n");
                Metodos.delay(1000); // Adiciona atraso
                System.out.printf("Após algum tempo de exploração, você finalmente avista uma fraca claridade adiante. Seu coração se enche de esperança ao perceber que uma saída pode estar próxima. \nVocê acelera o passo, movendo-se em direção à luz e se aproximando de uma abertura no final da caverna.\n\n");
                Metodos.delay(1000); // Adiciona atraso
                System.out.printf("Ao alcançar a saída, você se depara com uma paisagem deslumbrante.\n\n");
                // Aquela pausinha marota
                System.out.printf("\nPressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                Metodos.clearConsole(); // Limpa o console
                /* Chamar o proximo capitulo*/
                break;
            default:
                System.out.println("Escolha inválida!");
                aCaverna(personagem, input);
                input.nextLine(); // Avança para a próxima linha
                break;
        }

    }
}