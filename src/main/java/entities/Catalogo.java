package entities;


public class Catalogo {
    private String codiceIsbn;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;

    public Catalogo(String codiceIsbnisbn, String titolo, int annoPubblicazione, int numeroPagine) {
        this.codiceIsbn = codiceIsbnisbn;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString(){
        return
                "isbn='" + codiceIsbn + '\'' +
                        ", titolo='" + titolo + '\'' +
                        ", annoPubblicazione=" + annoPubblicazione +
                        ", numberoPagine=" + numeroPagine;
    }
    public String getIsbn(){
        return codiceIsbn;
    }
    public String getTitolo(){
        return titolo;
    }
    public int getAnnoPubblicazione(){
        return annoPubblicazione;
    }
    public int getNumeroPagine(){
        return numeroPagine;
    }

}
