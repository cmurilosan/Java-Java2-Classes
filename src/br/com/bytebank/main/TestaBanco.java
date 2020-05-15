package br.com.bytebank.main;

import br.com.bytebank.model.Cliente;
import br.com.bytebank.model.Conta;

public class TestaBanco {

    public static void main(String[] args) {

        Cliente kakashi = new Cliente();

        //Acesso livre aos atributos
        kakashi.nome = "Kakashi Sensei";
        kakashi.cpf = "111.222.333-44";
        kakashi.profissao = "Hokage aposentado";

        Conta contaDoKakashi = new Conta();
        contaDoKakashi.deposita(100);

        contaDoKakashi.titular = kakashi;
        System.out.println("Mostra o valor do atributo: " + contaDoKakashi.titular.nome);
        System.out.println("Mostra o OBJETO: " + contaDoKakashi.titular);

    }
}
