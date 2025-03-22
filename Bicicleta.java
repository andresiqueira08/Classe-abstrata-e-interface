public class Bicicleta extends Transporte {
    public Bicicleta(int capacidade){
        super(capacidade);
    }
    @Override
    public void mover(){
        System.out.println("A bicicleta está andando");
    }
    public void exibirCapacidade(){
        super.exibirCapacidade();
    }
    
}
