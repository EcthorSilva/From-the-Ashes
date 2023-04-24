import java.util.Random;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome, String arma, int vida, int forca, int defesa, int destreza, int estusFlask) {
        super(nome, arma, vida, forca, defesa, destreza, estusFlask);
    }

    Random rand = new Random();

    @Override
    public int atacar() {
        int min = getForca() / 2;
        int max = getForca() + getDefesa();
        int dano = 0;

        if(rand.nextDouble() < 0.85){ // 85% de chances de acertar e 15% de errar
            if(rand.nextDouble() < 0.15){ // Ataque critico (15% de chances de acerto critico)
                dano = (rand.nextInt(max - min + 1) + min) * 2;
                System.out.printf("Você atirou uma flecha com o seu %s e causou %d de dano CRITICO!\n", getArma(), dano);
            }else{ // Ataque normal
                dano = rand.nextInt(max - min + 1) + min;
                System.out.printf("Você atirou uma flecha com o seu %s e causou %d de dano!\n", getArma(), dano);
            }
        }else{ // errou
            System.out.printf("Você errou o ataque!\n");
        }
        return dano;
    }

    @Override
    public int fugir() {
        double chanceDeFuga = getDestreza() * 0.05;
        if (rand.nextDouble() <= chanceDeFuga) {
            System.out.printf("Você conseguiu fugir da batalha!\n\n");
            return 1;
        } else {
            System.out.printf("Você não conseguiu fugir!\n\n");
            return 0;
        }
    }
}