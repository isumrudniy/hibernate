package org.javarush.entity;


import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "players")
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

}
