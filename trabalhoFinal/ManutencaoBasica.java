public class ManutencaoBasica implements Manutencao {
    private String descricao;
    private double custo;

    public ManutencaoBasica(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção Básica Realizada: " + descricao);
    }

    @Override
    public String obterDetalhesManutencao() {
        return "Descrição: " + descricao + ", Custo: " + custo;
    }
}
