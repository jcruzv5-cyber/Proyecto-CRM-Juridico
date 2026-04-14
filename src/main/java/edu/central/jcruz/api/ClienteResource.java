package edu.central.jcruz.api;

import edu.central.jcruz.aplicacion.ClienteServicio;
import edu.central.jcruz.dominio.modelo.Cliente;
import edu.central.jcruz.infraestructura.dto.ClienteRequest;
import edu.central.jcruz.infraestructura.dto.ClienteResponse;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {

    @Inject
    ClienteServicio clienteServicio;

    @POST
    public Response crear(@Valid ClienteRequest request) {
        try {
            Cliente cliente = clienteServicio.crearCliente(request);
            return Response.status(Response.Status.CREATED)
                    .entity(toResponse(cliente))
                    .build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(new MensajeError(e.getMessage()))
                    .build();
        }
    }

    @GET
    public Response listar() {
        List<ClienteResponse> clientes = clienteServicio.listarClientes()
                .stream()
                .map(this::toResponse)
                .toList();

        return Response.ok(clientes).build();
    }

    @GET
    @Path("/{id}")
    public Response buscarPorId(@PathParam("id") Long id) {
        try {
            Cliente cliente = clienteServicio.buscarPorId(id);
            return Response.ok(toResponse(cliente)).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(new MensajeError(e.getMessage()))
                    .build();
        }
    }

    @GET
    @Path("/documento/{numeroDocumento}")
    public Response buscarPorNumeroDocumento(@PathParam("numeroDocumento") String numeroDocumento) {
        try {
            Cliente cliente = clienteServicio.buscarPorNumeroDocumento(numeroDocumento);
            return Response.ok(toResponse(cliente)).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(new MensajeError(e.getMessage()))
                    .build();
        }
    }

    private ClienteResponse toResponse(Cliente cliente) {
        ClienteResponse response = new ClienteResponse();
        response.idCliente = cliente.getIdCliente();
        response.tipoDocumento = cliente.getTipoDocumento();
        response.numeroDocumento = cliente.getNumeroDocumento();
        response.nombres = cliente.getNombres();
        response.apellidos = cliente.getApellidos();
        response.fechaNacimiento = cliente.getFechaNacimiento();
        response.genero = cliente.getGenero();
        response.estadoCivil = cliente.getEstadoCivil();
        response.direccionResidencia = cliente.getDireccionResidencia();
        response.ciudadMunicipio = cliente.getCiudadMunicipio();
        response.barrio = cliente.getBarrio();
        response.telefonoPrincipal = cliente.getTelefonoPrincipal();
        response.telefonoSecundario = cliente.getTelefonoSecundario();
        response.correoElectronico = cliente.getCorreoElectronico();
        response.estratoSocioeconomico = cliente.getEstratoSocioeconomico();
        response.ingresosMensuales = cliente.getIngresosMensuales();
        response.ocupacion = cliente.getOcupacion();
        response.esPoblacionVulnerable = cliente.getEsPoblacionVulnerable();
        response.tipoPoblacionVulnerable = cliente.getTipoPoblacionVulnerable();
        response.fechaRegistro = cliente.getFechaRegistro();
        response.aceptaHabeasData = cliente.getAceptaHabeasData();
        response.estadoUsuario = cliente.getEstadoUsuario();
        return response;
    }

    public static class MensajeError {
        public String mensaje;

        public MensajeError() {
        }

        public MensajeError(String mensaje) {
            this.mensaje = mensaje;
        }
    }
}