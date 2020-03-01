package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IClienteDao {
	
	public List<Cliente> getClientes();
	public Cliente getCliente(int id);
	public void deleteCliente(Cliente cliente);
	public void saveCliente(Cliente cliente);

}
