package cenarioCalculoImposto;

public class ImpostoDeRendaFactory {
    public static ImpostoDeRenda newImpostoDeRenda(double valor) {
        if(valor <= 100 && valor >= 0) {
            return new ImpostoDeRenda(100, new ImpostoSimplificadoStrategy());
        }else {
            return new ImpostoDeRenda(100, new ImpostoCompletoStrategy());
        }
    }
}
