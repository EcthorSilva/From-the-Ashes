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
    // Força
    public int getForca() {
        return forca;
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
        return destreza;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public abstract int atacar();

    public void defender() {
        this.defesa += 10;
        // System.out.println("Você se prepara para o próximo ataque!");
    }

    public void tomarDano(int dano) {
        vida -= dano;
    }
}