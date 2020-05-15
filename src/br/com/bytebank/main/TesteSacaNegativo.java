package br.com.bytebank.main;

import br.com.bytebank.model.Conta;

public class TesteSacaNegativo {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.deposita(100);

        System.out.println(conta.saca(101));

        conta.saca(101);

        System.out.println(conta.getSaldo());
    }
}

//Testes que verificam se é possivel sacar valores negativos
