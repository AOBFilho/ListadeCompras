package dao;

import java.util.List;

import entity.Tipo;

public class TipoDAO extends DAO<Tipo>{
	
	public TipoDAO(){
		super(Tipo.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Tipo> getTipoByNome(String nome) throws DAOException{
		nome = nome.toUpperCase();
		String hql = "FROM Tipo t WHERE UPPER(t.nome) LIKE '%"+nome+"%'";
		return (List<Tipo>) list(hql);
	}
	
	public Tipo getTipoById(Integer id) throws DAOException{
		String hql = "FROM Tipo t WHERE t.id = "+id.toString();
		return (Tipo) list(hql).get(0);
	}	
}
