package entities;

public class Rivista extends Catalogo {

    private Periodicita periodicita;

    public Rivista(String codiceIsbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(codiceIsbn, titolo, annoPubblicazione, numeroPagine);
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

