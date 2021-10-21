package cenarioCalculoImposto;

public class ImpostoDeRenda {
    double valor;
    IMetodoCalculo metodo;

    public ImpostoDeRenda(double valor, IMetodoCalculo metodo) {
        this.valor = valor;
        this.metodo = metodo;
    }

    public double calcular() {
        return metodo.calcular(this);
    }

    public double getValor() {
        return valor;
    }
}
