import java.util.Random;

public class Monstro {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Monstro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void tomarDano(int dano) {
        vida -= dano;
    }

    public int atacar() {
        Random rand = new Random();
        int min = getAtaque() / 2;
        int max = getAtaque() + getDefesa();
        int dano = rand.nextInt(max - min + 1) + min;
        return dano;
    }
}