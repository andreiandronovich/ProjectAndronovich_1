package ru.andronovich.springapp.ProjectAndronovich.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Exhibition")
public class Exhibition {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    @Column (name = "date")
    private String date;

    @Column(name = "image")
    private String image;

    @Column(name = "_text")
    private String _text;

    @Column(name = "article")
    private String article;

    @Column(name = "amount ")
    private String amount;

    @Column(name = "address")
    private String address;

    @ManyToMany(mappedBy = "exhibitions", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Person> people;


    public Exhibition(String description) {
        this.description = description;
    }

    public Exhibition() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String get_text() {
        return _text;
    }

    public void set_text(String _text) {
        this._text = _text;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
