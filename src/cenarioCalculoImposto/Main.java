package cenarioCalculoImposto;

public class Main {
    public static void main(String[] args) {
        ImpostoDeRenda imposto1 = ImpostoDeRendaFactory.newImpostoDeRenda(100);
        ImpostoDeRenda imposto2 = ImpostoDeRendaFactory.newImpostoDeRenda(200);
        System.out.println(imposto1.calcular());
        System.out.println(imposto2.calcular());

    }
}
