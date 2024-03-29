package entity;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="Tipo")
public class Tipo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2052710247678215081L;
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@SuppressWarnings("unused")
	private void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tipo other = (Tipo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
