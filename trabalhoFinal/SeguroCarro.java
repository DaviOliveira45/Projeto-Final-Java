public class SeguroCarro implements Seguro {
    private Carro carro;
    private String tipo;
    private String cobertura;
    private String telefoneContato;

    public SeguroCarro(Carro carro, String tipo, String cobertura, String telefoneContato) {
        this.carro = carro;
        this.tipo = tipo;
        this.cobertura = cobertura;
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String obterTipoSeguro() {
        return tipo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public Carro getCarro() {
        return carro;
    }
}
