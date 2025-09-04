package org.example;

import java.util.Objects;

public class Person {
    private String nom;
    private String prenom;

    public Person( String nom, String prenom){
        this.nom= nom;
        this.prenom= prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return nom +" "+ prenom;
    }

    @Override
    public boolean equals(Object o){
        if (this== o) return true;
        if (!(o instanceof Person)) return false;
        Person person= (Person) o;
        return Objects.equals(nom, person.nom) &&
                Objects.equals(prenom, person.prenom);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nom, prenom);
    }
}
