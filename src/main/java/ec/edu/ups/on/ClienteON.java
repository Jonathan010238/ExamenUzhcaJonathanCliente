package ec.edu.ups.on;

import ec.edu.ups.modelo.Cliente;

public interface ClienteON {
	public boolean guardarCliente(Cliente cliente)throws Exception;
	public Cliente buscar(String cedula);

}
