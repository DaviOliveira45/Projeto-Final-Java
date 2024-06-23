class Aluguel {
    private Carro carroAlugado;
    private Cliente cliente;
    private int diasAlugados;
    private double valorTotal;

    public Aluguel(Carro carroAlugado, Cliente cliente, int diasAlugados) {
        this.carroAlugado = carroAlugado;
        this.cliente = cliente;
        this.diasAlugados = diasAlugados;
        this.valorTotal = calcularValorAluguel();
    }

    // Getters e Setters

    public Carro getCarroAlugado() {
        return carroAlugado;
    }

    public void setCarroAlugado(Carro carroAlugado) {
        this.carroAlugado = carroAlugado;
        this.valorTotal = calcularValorAluguel();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDiasAlugados() {
        return diasAlugados;
    }

    public void setDiasAlugados(int diasAlugados) {
        this.diasAlugados = diasAlugados;
        this.valorTotal = calcularValorAluguel();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    // Funções adicionais

    public double calcularValorAluguel() {
        return carroAlugado.calcularCustoAluguel(diasAlugados);
    }

    public boolean verificarDisponibilidade() {
        return carroAlugado.isDisponivel();
    }
}
