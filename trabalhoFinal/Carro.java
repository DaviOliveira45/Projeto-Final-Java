class Carro {
    private String modelo;
    private String placa;
    private int ano;
    private double custoDiario;
    private double quilometragem;
    private boolean disponibilidade;

    public Carro(String modelo, String placa, int ano, double quilometragem, double custoDiario) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.custoDiario = custoDiario;
        this.quilometragem = quilometragem;
        this.disponibilidade = true; // inicialmente disponível
    }

    // Getters e Setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCustoDiario() {
        return custoDiario;
    }

    public void setCustoDiario(double custoDiario) {
        this.custoDiario = custoDiario;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    // Funções adicionais

    public double calcularCustoAluguel(int dias) {
        return dias * this.custoDiario;
    }
}
