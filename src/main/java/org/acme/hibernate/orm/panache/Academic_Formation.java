package org.acme.hibernate.orm.panache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Cacheable
public class Academic_Formation extends PanacheEntity {
    
    @Column(length = 40, unique = true)
    public String course;

    @Column(length = 40, unique = true)
    public String degree;

    @Column(length = 40, unique = true)
    public String institution;

    @Column(length = 40, unique = true)
    public int startYear;

    @Column(length = 40, unique = true)
    public int endYear;

}
