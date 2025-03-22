public class CarroEletrico extends Transporte implements Eletrico {
    public CarroEletrico(int capacidade){
        super(capacidade);
    }
    @Override
    public void carregarBateria(){
        System.out.println("Bateria carregando");
    }
    @Override
    public void mover(){
        System.out.println("O carro está parado");
    }
    public void exibirCapacidade(){
        super.exibirCapacidade();
    }
}
