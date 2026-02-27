package com.practiceSpringJPA.SpringJPApro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100, unique = true)
    private String name;

    @OneToOne
    private Doctor headDoctor;

    @ManyToMany
    @JoinTable( name= "my_dpt_table", joinColumns = @JoinColumn(name= "dpt_id" ),
                inverseJoinColumns = @JoinColumn(name = "doctor_id"))
    private Set<Doctor> doctors= new HashSet<>();
}
