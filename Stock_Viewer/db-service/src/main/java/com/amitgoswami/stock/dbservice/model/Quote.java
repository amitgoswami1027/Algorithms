package com.amitgoswami.stock.dbservice.model;

import javax.persistence.*;

@Entity
@Table(name= "quotes", catalog="test")
public class Quote {

    public Quote() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getQuote() {
        return quote;
    }

    public void setQuote(Integer quote) {
        this.quote = quote;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name= "id")
    private Integer id;

    @Column (name ="user_name")
    private String userName;

    @Column (name="quote")
    private Integer quote;


}
