package br.com.learning.lombok.test;

import br.com.learning.lombok.model.Client;

public class LombokTest {
    public static void main(String[] args) {
        Client client1 = new Client();

        client1.setName("Thalia");

        System.out.println(client1.toString());

        Client client2 = new Client();

        client2.setName("Irene");

        System.out.println(client1.equals(client2));

        //instancia o a classe já com os atributos
        Client client = Client.builder()
                .id(1L)
                .name("Carla")
                .build();

        System.out.println(client);
    }
}
