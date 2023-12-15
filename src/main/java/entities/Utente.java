package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
class Utente {
    @Id
    @GeneratedValue
    private UUID numeroTessera;
    @Column (name = "nome",nullable = false)
    private String nome;
    @Column (name = "cognome",nullable = false)
    private String cognome;
    @Column (name = "data_nascita",nullable = false)
    private LocalDate dataNascita;
    @OneToMany(mappedBy = "utente", cascade = CascadeType.ALL)
    private List<Prestito> prestiti = new ArrayList<>();

    public UUID getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(UUID numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public List<Prestito> getPrestiti() {
        return prestiti;
    }

    public void setPrestiti(List<Prestito> prestiti) {
        this.prestiti = prestiti;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "numeroTessera=" + numeroTessera +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", prestiti=" + prestiti +
                '}';
    }

    public Utente(UUID numeroTessera, String nome, String cognome, LocalDate dataNascita, List<Prestito> prestiti) {
        this.numeroTessera = numeroTessera;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.prestiti = prestiti;


    }
}