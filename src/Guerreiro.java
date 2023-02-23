public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida, int forca, int defesa) {
        super(nome, vida, forca, defesa);
    }
    
    @Override
    public int atacar() {
        System.out.println(getNome() + " atacou com sua espada!");
        return getForca() + 2;
    }
    
    @Override
    public void defender() {
        super.defender();
        setForca(getForca() + 1);
    }
}