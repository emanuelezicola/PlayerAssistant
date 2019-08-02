package it.projectalpha.playerassistant.model;


import javax.persistence.*;

@Entity
public class Mostro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer gradoSfida;
    private Integer numeroDiGiocatori;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personaggio_id", nullable = false)
    private Personaggio personaggio;


    public Mostro() {}

    public Mostro(String nome, Integer gradoSfida, Integer numeroDiGiocatori, Personaggio personaggio) {
        this.nome = nome;
        this.gradoSfida = gradoSfida;
        this.numeroDiGiocatori = numeroDiGiocatori;
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

    public Integer getGradoSfida() {
        return gradoSfida;
    }

    public void setGradoSfida(Integer gradoSfida) {
        this.gradoSfida = gradoSfida;
    }

    public Integer getNumeroDiGiocatori() {
        return numeroDiGiocatori;
    }

    public void setNumeroDiGiocatori(Integer numeroDiGiocatori) {
        this.numeroDiGiocatori = numeroDiGiocatori;
    }

    public Personaggio getPersonaggio() {
        return personaggio;
    }

    public void setPersonaggio(Personaggio personaggio) {
        this.personaggio = personaggio;
    }
}
