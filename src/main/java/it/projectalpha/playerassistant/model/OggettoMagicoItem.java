package it.projectalpha.playerassistant.model;


import javax.persistence.*;

@Entity
public class OggettoMagicoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer caricheResidue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personaggio_id", nullable = false)
    private Personaggio personaggio;


    public OggettoMagicoItem(String nome, Integer caricheResidue, Personaggio personaggio) {
        this.nome = nome;
        this.caricheResidue = caricheResidue;
        this.personaggio = personaggio;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCaricheResidue() {
        return caricheResidue;
    }

    public void setCaricheResidue(Integer caricheResidue) {
        this.caricheResidue = caricheResidue;
    }

    public Personaggio getPersonaggio() {
        return personaggio;
    }

    public void setPersonaggio(Personaggio personaggio) {
        this.personaggio = personaggio;
    }
}
