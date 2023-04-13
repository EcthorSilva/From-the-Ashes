import java.util.Random;

public class Mago extends Personagem {
    public Mago(String nome, String arma, int vida, int forca, int defesa, int destreza) {
        super(nome, arma, vida, forca, defesa, destreza);
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
}