package org.acme.hibernate.orm.panache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Cacheable
public class Certification extends PanacheEntity {
    
    @Column(length = 40, unique = true)
    public String name;

    @Column(length = 40, unique = true)
    public String organization;

    @Column(length = 40, unique = true)
    public int year;
}