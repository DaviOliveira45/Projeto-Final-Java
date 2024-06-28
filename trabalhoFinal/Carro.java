import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;
    private double quilometragem;
    private double custoDiario;
    private boolean disponivel;
    private List<Manutencao> manutencoes;
    private List<Seguro> seguros;

    public Carro(String modelo, String placa, int ano, double quilometragem, double custoDiario) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.custoDiario = custoDiario;
        this.disponivel = true;
        this.manutencoes = new ArrayList<>();
        this.seguros = new ArrayList<>();
    }

    public double calcularCustoAluguel(int dias) {
        double custoTotal = dias * custoDiario;
        return custoTotal;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getCustoDiario() {
        return custoDiario;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponibilidade(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void adicionarManutencao(Manutencao manutencao) {
        manutencoes.add(manutencao);
    }

    public void adicionarSeguro(Seguro seguro) {
        seguros.add(seguro);
    }

    public List<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public List<Seguro> getSeguros() {
        return seguros;
    }
}
