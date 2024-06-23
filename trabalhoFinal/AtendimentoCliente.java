public class AtendimentoCliente {
    private String nomeAtendente;
    private String tipoAtendimento;
    private String detalhes;

    public AtendimentoCliente(String nomeAtendente, String tipoAtendimento, String detalhes) {
        this.nomeAtendente = nomeAtendente;
        this.tipoAtendimento = tipoAtendimento;
        this.detalhes = detalhes;
    }

    // Getters e Setters

    public String getNomeAtendente() {
        return nomeAtendente;
    }

    public void setNomeAtendente(String nomeAtendente) {
        this.nomeAtendente = nomeAtendente;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    // Funções adicionais

    public void registrarAtendimento() {
        System.out.println("Atendimento registrado.");
    }
}
