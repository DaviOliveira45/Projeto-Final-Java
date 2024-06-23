class ClienteVIP extends Cliente {
    private boolean statusFidelidade;
    private double descontosAdicionais;

    public ClienteVIP(String nome, String CPF, String telefone, String email, boolean statusFidelidade) {
        super(nome, CPF, telefone, email);
        this.statusFidelidade = statusFidelidade;
        this.descontosAdicionais = 0.0;
    }

    // Getters e Setters

    public boolean isStatusFidelidade() {
        return statusFidelidade;
    }

    public void setStatusFidelidade(boolean statusFidelidade) {
        this.statusFidelidade = statusFidelidade;
    }

    public double getDescontosAdicionais() {
        return descontosAdicionais;
    }

    public void setDescontosAdicionais(double descontosAdicionais) {
        this.descontosAdicionais = descontosAdicionais;
    }

    // Funções adicionais

    public void aplicarDescontosEspeciais() {
        descontosAdicionais = 0.15; // Exemplo: 15% de desconto adicional
    }

    public void gerenciarBeneficios() {
        System.out.println("Gerenciando benefícios para cliente VIP.");
    }
}
