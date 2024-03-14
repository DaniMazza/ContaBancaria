public class TesteBanco {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(2000, "Zuri");
        conta1.depositar(100);
        System.out.println(conta1.getSaldo());
        ContaBancaria conta2 = new ClienteEspecial(2000, "Zuri", 1252);
        conta1.sacar(100);
        conta2.sacar(100);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());


    }
}
