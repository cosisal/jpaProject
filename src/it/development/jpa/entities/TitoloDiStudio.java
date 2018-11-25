package it.development.jpa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: TitoloDiStudio
 *
 */
@Entity

public class TitoloDiStudio implements Serializable {

	   
	@Id
	private int id;
	private String codiceFiscale;
	private String titoloDiStudio;
	private String tipologiaTitoloDiStudio;
	private static final long serialVersionUID = 1L;

	public TitoloDiStudio() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getCodiceFiscale() {
		return this.codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}   
	public String getTitoloDiStudio() {
		return this.titoloDiStudio;
	}

	public void setTitoloDiStudio(String titoloDiStudio) {
		this.titoloDiStudio = titoloDiStudio;
	}   
	public String getTipologiaTitoloDiStudio() {
		return this.tipologiaTitoloDiStudio;
	}

	public void setTipologiaTitoloDiStudio(String tipologiaTitoloDiStudio) {
		this.tipologiaTitoloDiStudio = tipologiaTitoloDiStudio;
	}
   
}
