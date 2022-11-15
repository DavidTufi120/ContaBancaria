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
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(float valor) {
        if (this.getSaldo() < valor) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Saque efetuado com sucesso");
        System.out.println("Seu saldo agora é de: " + this.getSaldo());
        return true;

    }

    public void depositar(float valor) {
        try {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depositado com sucesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Agradecemos a preferência");
        }

    }

    public void visualizar() {
        String tipo = "";
        switch (this.tipo) {
            case 1:
                tipo = "Conta Corrente";
                break;

            case 2:
                tipo = "Conta Poupança";
                break;
        }
        System.out.println("\n*********************************");
        System.out.println("Dados da conta");
        System.out.println("\n*********************************");
        System.out.println("\nNúmero da conta" + this.numero);
        System.out.println("\nNúmero da agencia" + this.agencia);
        System.out.println("\nTipo da conta" + tipo);
        System.out.println("\nTitular" + this.titular);
        System.out.println("\nSaldo" + this.saldo);


    }

    public static void main(String[] args) {

    }
}