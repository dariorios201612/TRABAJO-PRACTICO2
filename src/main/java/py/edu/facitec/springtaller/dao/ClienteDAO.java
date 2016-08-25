package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.model.Cliente;

@Repository
//Clase encargada de la manipulacion de datos, posibilita posteriormente utilizar la anotacion Awwired
public class ClienteDAO {
	//Gestionar el entity manager
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Cliente cliente){
		manager.persist(cliente);
	}
}
