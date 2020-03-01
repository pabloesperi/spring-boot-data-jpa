package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;
//la clase dao es una clase de persistencia que se utiliza para acceder a los datos 
//son consultas que van a la clase Entity. NO A LA TABLA.

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

@Repository
public class ClienteDao implements IClienteDao {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true) //toma el contenido del metodo y lo envuelve en una transacción
	@Override
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return em.createQuery("from cliente").getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public Cliente getCliente(int id) {
		// TODO Auto-generated method stub
		return em.find(Cliente.class, id);
	}

	@Override
	public void deleteCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		em.remove(cliente);
	}

	@Transactional
	@Override
	public void saveCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		em.persist(cliente);
	}

}
