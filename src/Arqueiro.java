import java.util.Random;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome, String arma, int vida, int forca, int defesa, int destreza, int estusFlask) {
        super(nome, arma, vida, forca, defesa, destreza, estusFlask);
    }

    @Override
    public int atacar() {
        Random rand = new Random();
        int min = getForca() / 2;
        int max = getForca() + getDefesa();
        int dano = rand.nextInt(max - min + 1) + min;
        System.out.printf("Você atirou uma flecha com o seu %s e causou %d de dano!\n", getArma(), dano);
        return dano;
    }
}