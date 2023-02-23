import java.util.Random;

public class Mago extends Personagem {
    public Mago(String nome, int vida, int forca, int defesa) {
        super(nome, vida, forca, defesa);
    }

    @Override
    public int atacar() {
        Random rand = new Random();
        int min = getForca() / 2;
        int max = getForca() + getDefesa();
        int dano = rand.nextInt(max - min + 1) + min;
        System.out.println(getNome() + " lançou um feitiço e causou " + dano + " de dano!");
        return dano;
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " não pode defender!");
    }
}