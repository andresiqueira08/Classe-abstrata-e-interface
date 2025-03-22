public abstract class Transporte{
    protected int capacidade;

    public Transporte(int capacidade){
        this.capacidade = capacidade;
    }

    public int getCapacidade(){
        return capacidade;
    }
    public void exibirCapacidade(){
        System.out.println("A capacidade é de: " + capacidade);
    }
    public abstract void mover();
    
}