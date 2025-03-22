public class Main {
    public static void main(String[] args) {
    Transporte[] t = new Transporte[3];
    t[0] = new Bicicleta(1);
    t[1] = new CarroEletrico(4);
    t[2] = new CarroEletrico(7);

    for(int i = 0; i < t.length; i++ ){
        t[i].exibirCapacidade();
        t[i].mover();
        if(t[i] instanceof CarroEletrico){
            CarroEletrico carro = (CarroEletrico) t[i];
            carro.carregarBateria();
        }
    }


    }
}

