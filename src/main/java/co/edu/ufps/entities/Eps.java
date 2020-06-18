package co.edu.ufps.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the eps database table.
 * 
 */
@Entity
@Table(name="eps")
@NamedQuery(name="Eps.findAll", query="SELECT e FROM Ep e")
public class Eps implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	//bi-directional many-to-one association to Basico
	@OneToMany(mappedBy="eps")
	private List<Basico> basicos;

	public Eps() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Basico> getBasicos() {
		return this.basicos;
	}

	public void setBasicos(List<Basico> basicos) {
		this.basicos = basicos;
	}

	public Basico addBasico(Basico basico) {
		getBasicos().add(basico);
		basico.setEp(this);

		return basico;
	}

	public Basico removeBasico(Basico basico) {
		getBasicos().remove(basico);
		basico.setEp(null);

		return basico;
	}

}