package edu.central.jcruz.dominio.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente {

    private Long idCliente;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String genero;
    private String estadoCivil;
    private String direccionResidencia;
    private String ciudadMunicipio;
    private String barrio;
    private String telefonoPrincipal;
    private String telefonoSecundario;
    private String correoElectronico;
    private String estratoSocioeconomico;
    private String ingresosMensuales;
    private String ocupacion;
    private Boolean esPoblacionVulnerable;
    private String tipoPoblacionVulnerable;
    private LocalDateTime fechaRegistro;
    private Boolean aceptaHabeasData;
    private String estadoUsuario;

    public Cliente() {
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCiudadMunicipio() {
        return ciudadMunicipio;
    }

    public void setCiudadMunicipio(String ciudadMunicipio) {
        this.ciudadMunicipio = ciudadMunicipio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getTelefonoPrincipal() {
        return telefonoPrincipal;
    }

    public void setTelefonoPrincipal(String telefonoPrincipal) {
        this.telefonoPrincipal = telefonoPrincipal;
    }

    public String getTelefonoSecundario() {
        return telefonoSecundario;
    }

    public void setTelefonoSecundario(String telefonoSecundario) {
        this.telefonoSecundario = telefonoSecundario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEstratoSocioeconomico() {
        return estratoSocioeconomico;
    }

    public void setEstratoSocioeconomico(String estratoSocioeconomico) {
        this.estratoSocioeconomico = estratoSocioeconomico;
    }

    public String getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(String ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Boolean getEsPoblacionVulnerable() {
        return esPoblacionVulnerable;
    }

    public void setEsPoblacionVulnerable(Boolean esPoblacionVulnerable) {
        this.esPoblacionVulnerable = esPoblacionVulnerable;
    }

    public String getTipoPoblacionVulnerable() {
        return tipoPoblacionVulnerable;
    }

    public void setTipoPoblacionVulnerable(String tipoPoblacionVulnerable) {
        this.tipoPoblacionVulnerable = tipoPoblacionVulnerable;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getAceptaHabeasData() {
        return aceptaHabeasData;
    }

    public void setAceptaHabeasData(Boolean aceptaHabeasData) {
        this.aceptaHabeasData = aceptaHabeasData;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
}