package it.development.jpa.beans;

import java.util.List;

import javax.ejb.Remote;

import it.development.jpa.entities.Anagrafica;

@Remote
public interface AnagraficaDaoRemote {
	
	public void addAnagrafica(Anagrafica anagrafica);
	public void removeAnagrafica(Anagrafica anagrafica);
	public void updateAnagrateafica(Anagrafica anagrafica);
	public Anagrafica findAnagrafica(Anagrafica anagrafica);
	public List<Anagrafica> retrieveAnagraficaByName(String name);
	public List<Anagrafica> retrieveAllAnagrafica();
	
}
