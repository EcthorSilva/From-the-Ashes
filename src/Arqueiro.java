public class Arqueiro extends Personagem {
    public Arqueiro(String nome, int vida, int forca, int defesa) {
        super(nome, vida, forca, defesa);
    }

    @Override
    public int atacar() {
        System.out.println(getNome() + " atirou uma flecha!");
        return getForca() + 1;
    }
    
    @Override
    public void defender() {
        super.defender();
        System.out.println(getNome() + " também recuou para uma posição mais defensiva!");
    }
}