package contabancaria.model;

public class Conta {

    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;

    public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(float valor) {
        if (getSaldo() < valor) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        setSaldo(getSaldo() - valor);
        System.out.println("Saque efetuado com sucesso");
        System.out.println("Seu saldo agora é de: " + getSaldo());
        return true;

    }

    public void depositar() {
        
    }

    public void visualizar() {
        System.out.println("\n*********************************");
        System.out.println("Dados da conta");
        System.out.println("\n*********************************");
        System.out.println("\nNúmero da conta" + numero);
        System.out.println("\nNúmero da agencia" + agencia);
        System.out.println("\nTipo da agencia" + tipo);
        System.out.println("\nTitular" + titular);
        System.out.println("\nSaldo" + saldo);


    }

    public static void main(String[] args) {

        Conta conta = new Conta(21, 21, 1, "Davi", 2000.0f);

        System.out.println(conta.getNumero() + "" + conta.getAgencia());

    }
}