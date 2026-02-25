package org.viraj.jdbcprojectforjggmasalas.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
@Table(name = "masala")
public class Masala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String nameofm;
    @Column
    private double in10gm;
    @Column
    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameofm() {
        return nameofm;
    }

    public void setNameofm(String nameofm) {
        this.nameofm = nameofm;
    }

    public double getIn10gm() {
        return in10gm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIn10gm(double in10gm) {
        this.in10gm = in10gm;
    }

    @Override
    public String toString() {
        return "Masala{" +
                "id=" + id +
                ", nameofm='" + nameofm + '\'' +
                ", in10gm=" + in10gm +
                ", price=" + price +
                '}';
    }
}