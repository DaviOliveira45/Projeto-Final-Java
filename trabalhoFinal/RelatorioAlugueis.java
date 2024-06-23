import java.util.ArrayList;

public class RelatorioAlugueis implements Relatorio {
    private ArrayList<Aluguel> listaAlugueis;

    public RelatorioAlugueis(ArrayList<Aluguel> listaAlugueis) {
        this.listaAlugueis = listaAlugueis;
    }

    // Implementação da interface Relatorio

    @Override
    public void gerarRelatorio() {
        for (Aluguel aluguel : listaAlugueis) {
            System.out.println("Cliente: " + aluguel.getCliente().getNome() +
                               ", Carro: " + aluguel.getCarroAlugado().getModelo() +
                               ", Valor Total: " + aluguel.getValorTotal());
        }
    }
}
