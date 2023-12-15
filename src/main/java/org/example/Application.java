package org.example;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneprestiti");

    public static void main(String[] args) {

    }
}
