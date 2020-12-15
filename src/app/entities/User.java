package app.entities;

public class User {
    protected int id;
    protected String name;
    protected String surname;
    protected String country;

    public User() {}

    public User(String name, String surname, String country) {
        super();
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public User(int id, String name, String surname, String country) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}