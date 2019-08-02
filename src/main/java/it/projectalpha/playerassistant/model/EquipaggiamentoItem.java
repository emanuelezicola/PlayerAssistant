package it.projectalpha.playerassistant.model;

import javax.persistence.*;

@Entity
public class EquipaggiamentoItem {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer quantita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personaggio_id", nullable = false)
    private Personaggio personaggio;

    public EquipaggiamentoItem(String nome, Integer quantita, Personaggio personaggio) {
        this.nome = nome;
        this.quantita = quantita;
        this.personaggio = personaggio;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    public Personaggio getPersonaggio() {
        return personaggio;
    }

    public void setPersonaggio(Personaggio personaggio) {
        this.personaggio = personaggio;
    }
}
