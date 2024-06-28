public class LocacaoCarro implements Locacao {
    private Carro carroAlugado;
    private int diasAlugados;

    public LocacaoCarro(Carro carroAlugado, int diasAlugados) {
        this.carroAlugado = carroAlugado;
        this.diasAlugados = diasAlugados;
    }

    @Override
    public double calcularValorAluguel() {
        return carroAlugado.calcularCustoAluguel(diasAlugados);
    }

    @Override
    public boolean verificarDisponibilidade() {
        return carroAlugado.isDisponivel();
    }
}
