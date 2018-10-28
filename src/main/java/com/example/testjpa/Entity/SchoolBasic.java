package com.example.testjpa.Entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SchoolBasic  {

    @Id
    @GeneratedValue
    @Column
    Long id;

    @Column
    String name;

    public SchoolBasic() {

    }

    public SchoolBasic(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
