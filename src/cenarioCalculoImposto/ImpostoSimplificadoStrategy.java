package cenarioCalculoImposto;

public class ImpostoSimplificadoStrategy implements IMetodoCalculo{
    @Override
    public double calcular(ImpostoDeRenda imposto) {
        return imposto.getValor() * 0.25;
    }
}
