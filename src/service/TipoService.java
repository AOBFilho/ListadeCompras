package service;

import java.util.List;

import dao.DAOException;
import dao.TipoDAO;
import entity.Tipo;;

public class TipoService extends Service{
	public List<Tipo> getTipoByNome(String nome) throws ServiceException {
		try {
			TipoDAO tipoDAO = daoFactory.getTipoDAO();
			List<Tipo> tipo = tipoDAO.getTipoByNome(nome);
			return tipo;
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
	public Tipo getTipoById(Integer id) throws ServiceException {
		try {
			TipoDAO tipoDAO = daoFactory.getTipoDAO();
			Tipo tipo = tipoDAO.getTipoById(id);
			return tipo;
		} catch (DAOException e){
			throw new ServiceException(e);
		}
	}
}
