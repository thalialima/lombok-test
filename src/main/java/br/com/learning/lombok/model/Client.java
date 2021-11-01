package br.com.learning.lombok.model;

import lombok.*;
//construtor com atributos específicos
@RequiredArgsConstructor
//construtor com todoos os atributos
@AllArgsConstructor
//construtor sem atributos
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//cria os getters e setters da classe
@Getter
@Setter
@ToString
//gera o padrão de projeto builder
@Builder
public class Client {
    //inclui o id nos métodos equals e hashcode
    @EqualsAndHashCode.Include
    //impede o Lombok de gerar o setter para esse atributo
    @Setter(value = AccessLevel.NONE)
    //impede o lombok de incluir o atributo no toString
    @ToString.Exclude
    private Long id;

    @NonNull
    private String name;


}
