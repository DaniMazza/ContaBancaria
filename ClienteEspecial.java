public class ClienteEspecial  extends ContaBancaria {
    private int contaCorrente;

    public ClienteEspecial(int contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ClienteEspecial(double saldo, int contaCorrente) {
        super(saldo);
        this.contaCorrente = contaCorrente;
    }

    public ClienteEspecial(double saldo, String nome, int contaCorrente) {
        super(saldo, nome);
        this.contaCorrente = contaCorrente;
    }

    public void depositar(int valor) {
        super.depositar(valor);
    }


    public void sacar(double valor){
        double tarifa = valor * 0.01;
        setSaldo(getSaldo() - (valor + tarifa));
    }



    public int getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(int contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
