package edu.central.jcruz.aplicacion;

import edu.central.jcruz.dominio.modelo.Cliente;
import edu.central.jcruz.dominio.repositorio.ClienteRepositorio;
import edu.central.jcruz.infraestructura.dto.ClienteRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class ClienteServicio {

    @Inject
    ClienteRepositorio clienteRepositorio;

    public Cliente crearCliente(ClienteRequest request) {
        if (Boolean.FALSE.equals(request.aceptaHabeasData)) {
            throw new IllegalArgumentException("Debe aceptar habeas data para registrar el cliente.");
        }

        clienteRepositorio.buscarPorNumeroDocumento(request.numeroDocumento)
                .ifPresent(cliente -> {
                    throw new IllegalArgumentException("Ya existe un cliente con ese número de documento.");
                });

        Cliente cliente = new Cliente();
        cliente.setTipoDocumento(request.tipoDocumento);
        cliente.setNumeroDocumento(request.numeroDocumento);
        cliente.setNombres(request.nombres);
        cliente.setApellidos(request.apellidos);
        cliente.setFechaNacimiento(request.fechaNacimiento);
        cliente.setGenero(request.genero);
        cliente.setEstadoCivil(request.estadoCivil);
        cliente.setDireccionResidencia(request.direccionResidencia);
        cliente.setCiudadMunicipio(request.ciudadMunicipio);
        cliente.setBarrio(request.barrio);
        cliente.setTelefonoPrincipal(request.telefonoPrincipal);
        cliente.setTelefonoSecundario(request.telefonoSecundario);
        cliente.setCorreoElectronico(request.correoElectronico);
        cliente.setEstratoSocioeconomico(request.estratoSocioeconomico);
        cliente.setIngresosMensuales(request.ingresosMensuales);
        cliente.setOcupacion(request.ocupacion);
        cliente.setEsPoblacionVulnerable(request.esPoblacionVulnerable);
        cliente.setTipoPoblacionVulnerable(request.tipoPoblacionVulnerable);
        cliente.setAceptaHabeasData(request.aceptaHabeasData);
        cliente.setEstadoUsuario(
                request.estadoUsuario != null && !request.estadoUsuario.isBlank()
                        ? request.estadoUsuario
                        : "Activo"
        );

        return clienteRepositorio.guardar(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepositorio.listar();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepositorio.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado."));
    }

    public Cliente buscarPorNumeroDocumento(String numeroDocumento) {
        if (numeroDocumento == null || numeroDocumento.isBlank()) {
            throw new IllegalArgumentException("El número de documento es obligatorio.");
        }

        return clienteRepositorio.buscarPorNumeroDocumento(numeroDocumento)
                .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado con ese número de documento."));
    }
}