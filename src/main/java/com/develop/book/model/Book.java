package com.develop.book.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.jmx.export.naming.IdentityNamingStrategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String isbn;

    private String author;

    @Builder()
    public Book(String isbn, String name){
        this.name=isbn;
        this.name=name;
    }


}
