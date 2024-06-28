import java.util.ArrayList;

public class Filial {
    private String endereco;
    private String gerente;
    private ArrayList<Carro> carrosDisponiveis;

    public Filial(String endereco, String gerente) {
        this.endereco = endereco;
        this.gerente = gerente;
        this.carrosDisponiveis = new ArrayList<>();
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Carro> getCarrosDisponiveis() {
        return carrosDisponiveis;
    }

    public void adicionarCarro(Carro carro) {
        carrosDisponiveis.add(carro);
    }

    public void removerCarro(Carro carro) {
        carrosDisponiveis.remove(carro);
    }

    public Carro buscarCarro(String modelo) {
        for (Carro carro : carrosDisponiveis) {
            if (carro.getModelo().equals(modelo)) {
                return carro;
            }
        }
        return null;
    }
}
