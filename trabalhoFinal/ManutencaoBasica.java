public class ManutencaoBasica implements Manutencao {
    private Carro carro;
    private String descricao;
    private double custo;

    public ManutencaoBasica(Carro carro, String descricao, double custo) {
        this.carro = carro;
        this.descricao = descricao;
        this.custo = custo;
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção Básica Realizada no carro: " + carro.getModelo() + " - " + descricao);
    }

    @Override
    public String obterDetalhesManutencao() {
        return "Carro: " + carro.getModelo() + ", Descrição: " + descricao + ", Custo: " + custo;
    }
}
