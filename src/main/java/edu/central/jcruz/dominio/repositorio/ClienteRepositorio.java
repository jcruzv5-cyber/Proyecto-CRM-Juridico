package edu.central.jcruz.dominio.repositorio;

import edu.central.jcruz.dominio.modelo.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepositorio {

    Cliente guardar(Cliente cliente);

    List<Cliente> listar();

    Optional<Cliente> buscarPorId(Long id);

    Optional<Cliente> buscarPorNumeroDocumento(String numeroDocumento);
}