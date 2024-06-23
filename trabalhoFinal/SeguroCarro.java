public class SeguroCarro implements Seguro {
    private String tipo;

    public SeguroCarro(String tipo) {
        this.tipo = tipo;
    }

    // Implementação da interface Seguro

    @Override
    public String obterTipoSeguro() {
        return tipo;
    }
}
