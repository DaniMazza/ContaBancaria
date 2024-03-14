public class ContaBancaria {

    private double saldo;
    private String nome;


    public ContaBancaria(){}

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }


    public void depositar(double valor){
        this.saldo = saldo + valor;
    }


    public void sacar(double valor){
        double tarifa = valor * 0.05;
        setSaldo(getSaldo() - (valor + tarifa));
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
