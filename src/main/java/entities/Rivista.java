package entities;

import javax.persistence.*;

@Entity
public class Rivista extends Catalogo {

    @Enumerated(EnumType.STRING)
    @Column(name = "periodicita", nullable = true)
    private Periodicita periodicita;


    public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }
    @Override
    public String toString(){
        return "Rivista{" +
                "periodicita" + periodicita +
                '}';
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }
}

