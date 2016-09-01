package py.edu.facitec.springtaller.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

public abstract class DAOGenerico<T> {
	
	
	private Class<T> entityClass;
	
	public DAOGenerico(Class<T> entityClass) {
		this.entityClass=entityClass;
	}
		protected abstract EntityManager getEntityManager();
public void insertar(T entity){
	getEntityManager().persist(entity);
	
}

public void actualizar(T entity){
	getEntityManager().merge(entity);
}

public void eliminar(T entity){
	getEntityManager().remove(getEntityManager().contains(entity)?
			entity:getEntityManager().merge(entity)
			);
	
}
}
