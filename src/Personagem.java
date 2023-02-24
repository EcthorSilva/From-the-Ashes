import java.util.Random;

public abstract class Personagem {
    protected String nome;
    private int vida;
    private int forca;
    private int defesa;
    private int destreza;

    public Personagem(String nome, int vida, int forca, int defesa, int destreza) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.destreza = destreza;
    }

    public String getNome() {
        return nome;
    }
    // Vida
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    // Força
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    // Defesa
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    // Destreza
    public int getDestreza() {
        return vida;
    }
    public void setDestreza(int destreza) {
        this.vida = destreza;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public abstract int atacar();

    public void defender() {
        setDefesa(getDefesa() + 1);
        System.out.println(getNome() + " se defendeu e aumentou sua defesa!");
    }

    public void receberDano(int dano) {
        int danoRecebido = dano - getDefesa();
        if (danoRecebido > 0) {
            setVida(getVida() - danoRecebido);
            System.out.println(getNome() + " recebeu " + danoRecebido + " de dano!");
            if (!estaVivo()) {
                System.out.println(getNome() + " foi derrotado!");
            }
        } else {
            System.out.println(getNome() + " se defendeu completamente!");
        }
    }

    public void tomarDano(int danoSofrido) {
    }

    public int fugir() {
        Random random = new Random();
        int chanceDeFuga = this.destreza * 10;
        int resultadoDoDado = random.nextInt(100) + 1;
        if (resultadoDoDado <= chanceDeFuga) {
            return chanceDeFuga;
        } else {
            return 0;
        }
    }
}