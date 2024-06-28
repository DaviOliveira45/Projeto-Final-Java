public class CategoriaCarro extends Carro {
    private String nome;
    private String tipoSeguro;

    public CategoriaCarro(String modelo, String placa, int ano, double quilometragem, double custoDiario, String nome, String tipoSeguro) {
        super(modelo, placa, ano, quilometragem, custoDiario);
        this.nome = nome;
        this.tipoSeguro = tipoSeguro;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }
}
