package cat.itacademy.barcelonactiva.Leal.Victor.s04.t02.n02.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="fruites")
public class Fruita {
	
	@Id
	//@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	@Column (name="nom")
	private String nom;
	@Column (name="quantitat_quilos")
	private int quantitatQuilos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}
	public void setQuantitatQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}
	
	@Override
	public String toString() {
		return "Fruita [id=" + id + ", nom=" + nom + ", quantitat_Quilos=" + quantitatQuilos + "]";
	}
	
	
}
