package edu.central.jcruz.infraestructura.persistencia;

import edu.central.jcruz.dominio.modelo.Cliente;
import edu.central.jcruz.dominio.repositorio.ClienteRepositorio;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class ClienteRepositorioImpl implements ClienteRepositorio {

    @Override
    @Transactional
    public Cliente guardar(Cliente cliente) {
        ClienteEntity entity = new ClienteEntity();
        entity.tipoDocumento = cliente.getTipoDocumento();
        entity.numeroDocumento = cliente.getNumeroDocumento();
        entity.nombres = cliente.getNombres();
        entity.apellidos = cliente.getApellidos();
        entity.fechaNacimiento = cliente.getFechaNacimiento();
        entity.genero = cliente.getGenero();
        entity.estadoCivil = cliente.getEstadoCivil();
        entity.direccionResidencia = cliente.getDireccionResidencia();
        entity.ciudadMunicipio = cliente.getCiudadMunicipio();
        entity.barrio = cliente.getBarrio();
        entity.telefonoPrincipal = cliente.getTelefonoPrincipal();
        entity.telefonoSecundario = cliente.getTelefonoSecundario();
        entity.correoElectronico = cliente.getCorreoElectronico();
        entity.estratoSocioeconomico = cliente.getEstratoSocioeconomico();
        entity.ingresosMensuales = cliente.getIngresosMensuales();
        entity.ocupacion = cliente.getOcupacion();
        entity.esPoblacionVulnerable = cliente.getEsPoblacionVulnerable();
        entity.tipoPoblacionVulnerable = cliente.getTipoPoblacionVulnerable();
        entity.aceptaHabeasData = cliente.getAceptaHabeasData();
        entity.estadoUsuario = cliente.getEstadoUsuario() != null ? cliente.getEstadoUsuario() : "Activo";
        entity.fechaRegistro = LocalDateTime.now();

        entity.persist();

        return toDomain(entity);
    }

    @Override
    public List<Cliente> listar() {
        return ClienteEntity.listAll().stream()
                .map(item -> toDomain((ClienteEntity) item))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {
        ClienteEntity entity = ClienteEntity.findById(id);
        return entity != null ? Optional.of(toDomain(entity)) : Optional.empty();
    }

    @Override
    public Optional<Cliente> buscarPorNumeroDocumento(String numeroDocumento) {
        ClienteEntity entity = ClienteEntity.find("numeroDocumento", numeroDocumento).firstResult();
        return entity != null ? Optional.of(toDomain(entity)) : Optional.empty();
    }

    private Cliente toDomain(ClienteEntity entity) {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(entity.idCliente);
        cliente.setTipoDocumento(entity.tipoDocumento);
        cliente.setNumeroDocumento(entity.numeroDocumento);
        cliente.setNombres(entity.nombres);
        cliente.setApellidos(entity.apellidos);
        cliente.setFechaNacimiento(entity.fechaNacimiento);
        cliente.setGenero(entity.genero);
        cliente.setEstadoCivil(entity.estadoCivil);
        cliente.setDireccionResidencia(entity.direccionResidencia);
        cliente.setCiudadMunicipio(entity.ciudadMunicipio);
        cliente.setBarrio(entity.barrio);
        cliente.setTelefonoPrincipal(entity.telefonoPrincipal);
        cliente.setTelefonoSecundario(entity.telefonoSecundario);
        cliente.setCorreoElectronico(entity.correoElectronico);
        cliente.setEstratoSocioeconomico(entity.estratoSocioeconomico);
        cliente.setIngresosMensuales(entity.ingresosMensuales);
        cliente.setOcupacion(entity.ocupacion);
        cliente.setEsPoblacionVulnerable(entity.esPoblacionVulnerable);
        cliente.setTipoPoblacionVulnerable(entity.tipoPoblacionVulnerable);
        cliente.setFechaRegistro(entity.fechaRegistro);
        cliente.setAceptaHabeasData(entity.aceptaHabeasData);
        cliente.setEstadoUsuario(entity.estadoUsuario);
        return cliente;
    }
}