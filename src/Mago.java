public class Mago extends Personagem {
    public Mago(String nome, int vida, int forca, int defesa) {
        super(nome, vida, forca, defesa);
    }
    
    @Override
    public int atacar() {
        System.out.println(getNome() + " lançou um feitiço!");
        return getForca() + 3;
    }
    
    @Override
    public void defender() {
        System.out.println(getNome() + " não pode defender!");
    }
}