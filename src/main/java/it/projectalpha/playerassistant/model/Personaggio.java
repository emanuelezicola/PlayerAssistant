package it.projectalpha.playerassistant.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Personaggio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer vita;
    private Long esperienza;
    private Long oro;
    private String sesso;
    private String classe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "personaggio", orphanRemoval = true)
    private List<EquipaggiamentoItem> equipaggiamento = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "personaggio", orphanRemoval = true)
    private List<OggettoMagicoItem> oggettiMagici = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "personaggio", orphanRemoval = true)
    private List<Mostro> mostriSconfitti = new ArrayList<>();

    public Personaggio() {}


    public Personaggio(Integer vita, Long esperienza, Long oro, String sesso, String classe, Utente utente) {
        this.vita = vita;
        this.esperienza = esperienza;
        this.oro = oro;
        this.sesso = sesso;
        this.classe = classe;
        this.utente = utente;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVita() {
        return vita;
    }

    public void setVita(Integer vita) {
        this.vita = vita;
    }

    public Long getEsperienza() {
        return esperienza;
    }

    public void setEsperienza(Long esperienza) {
        this.esperienza = esperienza;
    }

    public Long getOro() {
        return oro;
    }

    public void setOro(Long oro) {
        this.oro = oro;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public List<EquipaggiamentoItem> getEquipaggiamento() {
        return equipaggiamento;
    }

    public void setEquipaggiamento(List<EquipaggiamentoItem> equipaggiamento) {
        this.equipaggiamento = equipaggiamento;
    }

    public List<OggettoMagicoItem> getOggettiMagici() {
        return oggettiMagici;
    }

    public void setOggettiMagici(List<OggettoMagicoItem> oggettiMagici) {
        this.oggettiMagici = oggettiMagici;
    }

    public List<Mostro> getMostriSconfitti() {
        return mostriSconfitti;
    }

    public void setMostriSconfitti(List<Mostro> mostriSconfitti) {
        this.mostriSconfitti = mostriSconfitti;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
