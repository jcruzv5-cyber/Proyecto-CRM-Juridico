package edu.central.jcruz.infraestructura.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class ClienteRequest {

    @NotBlank
    public String tipoDocumento;

    @NotBlank
    public String numeroDocumento;

    @NotBlank
    public String nombres;

    @NotBlank
    public String apellidos;

    @NotNull
    public LocalDate fechaNacimiento;

    @NotBlank
    public String genero;

    @NotBlank
    public String estadoCivil;

    @NotBlank
    public String direccionResidencia;

    @NotBlank
    public String ciudadMunicipio;

    public String barrio;

    @NotBlank
    public String telefonoPrincipal;

    public String telefonoSecundario;

    @NotBlank
    @Email
    public String correoElectronico;

    @NotBlank
    public String estratoSocioeconomico;

    @NotBlank
    public String ingresosMensuales;

    @NotBlank
    public String ocupacion;

    @NotNull
    public Boolean esPoblacionVulnerable;

    public String tipoPoblacionVulnerable;

    @NotNull
    public Boolean aceptaHabeasData;

    public String estadoUsuario;
}