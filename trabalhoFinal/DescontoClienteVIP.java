public class DescontoClienteVIP implements Desconto {
    private double percentual;

    public DescontoClienteVIP(double percentual) {
        this.percentual = percentual;
    }


    @Override
    public void aplicarDesconto() {
        System.out.println("Desconto aplicado: " + percentual + "%");
    }
}
