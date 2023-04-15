import java.util.Random;

public class Mago extends Personagem {
    public Mago(String nome, String arma, int vida, int forca, int defesa, int destreza, int estusFlask) {
        super(nome, arma, vida, forca, defesa, destreza, estusFlask);
    }

    @Override
    public int atacar() {
        Random rand = new Random();
        int min = getForca() / 2;
        int max = getForca() + getDefesa();
        int dano = rand.nextInt(max - min + 1) + min;
        System.out.printf("Você lançou um feitiço com o seu %s e causou %d de dano!\n", getArma(), dano);
        return dano;
    }
    
    @Override
    public int fugir() {
        double chanceDeFuga = getDestreza() * 0.05;
        if (Math.random() <= chanceDeFuga) {
            System.out.printf("Você conseguiu fugir da batalha!\n\n");
            return 1;
        } else {
            System.out.printf("Você não conseguiu fugir!\n\n");
            return 0;
        }
    }
}