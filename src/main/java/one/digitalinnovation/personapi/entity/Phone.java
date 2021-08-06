package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data // getter e setter
@Builder // define um padrao para projetos
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera um id automaticamente como chave primária
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) // esquema para torna-los obrigatórios
    private PhoneType type;

    @Column(nullable = false)
    private String number;


}
