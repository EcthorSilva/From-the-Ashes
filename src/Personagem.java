public abstract class Personagem {
    private String nome;
    private String arma;
    private int vida;
    private int forca;
    private int defesa;
    private int destreza;
    private boolean defendendo;
    private int estusFlask;

    public Personagem(String nome, String arma, int vida, int forca, int defesa, int destreza, int estusFlask) {
        this.nome = nome;
        this.arma = arma;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.destreza = destreza;
    }

    // Getters e Setters
    // Nome
    public String getNome() {
        return nome;
    }
    // Arma
    public String getArma() {
        return arma;
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
        return destreza;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    // Cura
    public int getEstusFlask() {
        return estusFlask;
    }
    public int setEstusFlask(int estusFlask) {
        return this.estusFlask = estusFlask;
    }

    // Funções 
    public void defender() {
        this.defendendo = true;
    }
    public void tomarDano(int dano) {
        if (defendendo) {
            dano /= 2;
            defendendo = false;
        }
        this.vida -= dano;
    }
    public abstract int atacar();
}