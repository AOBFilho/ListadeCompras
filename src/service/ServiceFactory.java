package service;

public class ServiceFactory {
	private static ServiceFactory instance;
	private ServiceFactory(){
		
	}
	public static ServiceFactory getInstance(){
		if (instance == null ){
			instance = new ServiceFactory();
		}
		return instance;
	}
	public TipoService getTipoService(){
		TipoService tipoService = new TipoService();
		return tipoService;
	}
	
}
