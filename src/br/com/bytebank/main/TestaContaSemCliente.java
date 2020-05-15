package br.com.bytebank.main;

import br.com.bytebank.model.Cliente;
import br.com.bytebank.model.Conta;

public class TestaContaSemCliente {

    public static void main(String[] args) {

        Conta contaDoSasuke = new Conta();
        System.out.println(contaDoSasuke.getSaldo());

        contaDoSasuke.titular = new Cliente();
        System.out.println(contaDoSasuke.titular);

        contaDoSasuke.titular.nome = "Sasuke";
        System.out.println(contaDoSasuke.titular.nome);
    }
}
