package classes;

public abstract class Personagem {
    private String nome;
    private String arma;
    private int vida;
    private int forca;
    private int defesa;
    private int destreza;
    private int estusFlask;
    private boolean defendendo;

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

    /* Funções */

    // Defender
    public void defender() {
        this.defendendo = true;
    }
    // Tomar Dano
    public void tomarDano(int dano) {
        if (defendendo) {
            dano /= 2;
            defendendo = false;
        }
        this.vida -= dano;
    }
    // Atacar
    public abstract int atacar();
    // Fugir
    public abstract int fugir();
    // Encontrar cura
    public static void acharCura(Personagem personagem){
        if (personagem.getEstusFlask() < 3){
            int estusFlask = personagem.getEstusFlask();
            personagem.setEstusFlask(estusFlask + 1);
            System.out.printf("Você encontrou %d poção de cura e guardou em seu inventario.\n", personagem.getEstusFlask());         
        }else{
            System.out.printf("Você tem %d poção de cura em seu inventario.\n", personagem.getEstusFlask());
        }
    }
    // Usar cura
    public static void usarCura(Personagem personagem) {
        int estusFlask = personagem.getEstusFlask();
        int vidaMaxima = personagem.getVida();

        if(estusFlask > 0){
            // Define a vida maxima de cada uma das classes
            if(personagem.getNome().equals("classes.Guerreiro")){
                vidaMaxima = 257;
            }else if(personagem.getNome().equals("classes.Mago")){
                vidaMaxima = 190;
            }else if(personagem.getNome().equals("classes.Arqueiro")){
                vidaMaxima = 200;
            }
            
            int vidaAtual = personagem.getVida();
            int cura = (int) (vidaMaxima * 0.4); // cura 40% de vida do personagem

            if (vidaAtual + cura > vidaMaxima) {
                personagem.setVida(vidaMaxima);
            } else {
                personagem.setVida(vidaAtual + cura);
            }
            personagem.setEstusFlask(estusFlask - 1);
            System.out.printf("Você usou um item de cura e esta com %d de vida\n", personagem.getVida());

        }else{
            System.out.printf("Inventário vazio.\n");
        }
    }
}