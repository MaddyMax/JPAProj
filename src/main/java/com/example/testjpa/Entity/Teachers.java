package com.example.testjpa.Entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "T")
public class Teachers extends SchoolBasic {
    @Column
    String subject;


    public Teachers() {
    }

    public Teachers(Long id, String name, String subject){
        super(id,name);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
