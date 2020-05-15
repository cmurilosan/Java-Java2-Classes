package br.com.bytebank.model;

public class Conta {

    private double saldo;   //Atributo privado
    public int agencia = 42;
    public int numero;
    public Cliente titular;

    public void deposita(double valor) {

        this.saldo += valor;
    }

    public boolean saca (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){   //Método para acessar o atributo privado

        return this.saldo;
    }

}
