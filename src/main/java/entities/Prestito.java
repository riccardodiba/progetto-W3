package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
 public class Prestito {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name ="numero_tessera_utente",nullable = false)
    private Utente utente;
    @OneToOne
    @JoinColumn(name = "codice_isbn",nullable = false)
    private Catalogo elementoPrestato;
    @Column(name="data_inizio_prestito", nullable = false)
    private LocalDate dataInizioPrestito;
    @Column(name="data_restituzione_prevista", nullable = false)
    private LocalDate dataRestituzionePrevista;
    @Column(name="data_restituizione_effettiva", nullable = false)
    private LocalDate dataRestituzioneEffettiva;

    public Prestito(Utente utente, Catalogo elementoPrestato, LocalDate dataInizioPrestito, LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
        this.utente = utente;
        this.elementoPrestato = elementoPrestato;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataRestituzionePrevista;
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    public UUID getId() {
        return id;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Catalogo getElementoPrestato() {
        return elementoPrestato;
    }

    public void setElementoPrestato(Catalogo elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public LocalDate getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public LocalDate getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }
}