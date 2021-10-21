package cenarioCalculoImposto;

public class ImpostoCompletoStrategy implements IMetodoCalculo {
    @Override
    public double calcular(ImpostoDeRenda imposto) {
        return imposto.getValor() * 0.75;
    }
}
