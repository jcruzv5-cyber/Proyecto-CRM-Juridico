package edu.central.jcruz.infraestructura.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ClienteResponse {

    public Long idCliente;
    public String tipoDocumento;
    public String numeroDocumento;
    public String nombres;
    public String apellidos;
    public LocalDate fechaNacimiento;
    public String genero;
    public String estadoCivil;
    public String direccionResidencia;
    public String ciudadMunicipio;
    public String barrio;
    public String telefonoPrincipal;
    public String telefonoSecundario;
    public String correoElectronico;
    public String estratoSocioeconomico;
    public String ingresosMensuales;
    public String ocupacion;
    public Boolean esPoblacionVulnerable;
    public String tipoPoblacionVulnerable;
    public LocalDateTime fechaRegistro;
    public Boolean aceptaHabeasData;
    public String estadoUsuario;
}