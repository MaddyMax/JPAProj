package com.example.testjpa;


import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
}
