package entities;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Libro extends Catalogo{

    private String autore;
    private String genere;

    public Libro(UUID isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(isbn, titolo, LocalDate.ofEpochDay(annoPubblicazione), numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }
}
