package com.example.testjpa.Entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "S")
public class Student extends SchoolBasic {
    @Column
    String standard;

    public Student() {
        super();
    }

    public Student(Long id, String name, String standard) {
        super(id, name);
        this.standard = standard;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
