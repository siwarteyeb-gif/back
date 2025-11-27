package com.siwar.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Parfum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParfum;

    private String marqueParfum;
    private String nomParfum;
    private int prixParfum;
    private String contenanceParfum;
    private String email;

    @ManyToOne
    @JoinColumn(name = "genre_id")   // 🔥 clé étrangère créée automatiquement
    private Genre genre;

    public Parfum() {
        super();
    }

    public Parfum(String marqueParfum, String nomParfum, int prixParfum, 
                  String contenanceParfum, String email) {
        this.marqueParfum = marqueParfum;
        this.nomParfum = nomParfum;
        this.prixParfum = prixParfum;
        this.contenanceParfum = contenanceParfum;
        this.email = email;
    }

    public Long getIdParfum() {
        return idParfum;
    }

    public void setIdParfum(Long idParfum) {
        this.idParfum = idParfum;
    }

    public String getMarqueParfum() {
        return marqueParfum;
    }

    public void setMarqueParfum(String marqueParfum) {
        this.marqueParfum = marqueParfum;
    }

    public String getNomParfum() {
        return nomParfum;
    }

    public void setNomParfum(String nomParfum) {
        this.nomParfum = nomParfum;
    }

    public int getPrixParfum() {
        return prixParfum;
    }

    public void setPrixParfum(int prixParfum) {
        this.prixParfum = prixParfum;
    }

    public String getContenanceParfum() {
        return contenanceParfum;
    }

    public void setContenanceParfum(String contenanceParfum) {
        this.contenanceParfum = contenanceParfum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 🔥 très important : rendre PUBLIC
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

	@Override
	public String toString() {
		return "Parfum [idParfum=" + idParfum + ", marqueParfum=" + marqueParfum + ", nomParfum=" + nomParfum
				+ ", prixParfum=" + prixParfum + ", contenanceParfum=" + contenanceParfum + ", email=" + email
				+ ", genre=" + genre + "]";
	}
    
}

