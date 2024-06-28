public class Assistencia implements AssistenciaVeicular {
    private String tipo;
    private String cobertura;
    private String telefoneContato;

    public Assistencia(String tipo, String cobertura, String telefoneContato) {
        this.tipo = tipo;
        this.cobertura = cobertura;
        this.telefoneContato = telefoneContato;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @Override
    public void acionarAssistencia() {
        System.out.println("Assistência acionada.");
    }

    @Override
    public String detalhesCobertura() {
        return cobertura;
    }
}
