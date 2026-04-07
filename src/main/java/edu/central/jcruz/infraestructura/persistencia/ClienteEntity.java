package edu.central.jcruz.infraestructura.persistencia;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "cliente")
public class ClienteEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    public Long idCliente;

    @Column(name = "tipo_documento", nullable = false, length = 20)
    public String tipoDocumento;

    @Column(name = "numero_documento", nullable = false, unique = true, length = 20)
    public String numeroDocumento;

    @Column(nullable = false, length = 100)
    public String nombres;

    @Column(nullable = false, length = 100)
    public String apellidos;

    @Column(name = "fecha_nacimiento", nullable = false)
    public LocalDate fechaNacimiento;

    @Column(nullable = false, length = 20)
    public String genero;

    @Column(name = "estado_civil", nullable = false, length = 30)
    public String estadoCivil;

    @Column(name = "direccion_residencia", nullable = false, length = 150)
    public String direccionResidencia;

    @Column(name = "ciudad_municipio", nullable = false, length = 100)
    public String ciudadMunicipio;

    @Column(length = 100)
    public String barrio;

    @Column(name = "telefono_principal", nullable = false, length = 20)
    public String telefonoPrincipal;

    @Column(name = "telefono_secundario", length = 20)
    public String telefonoSecundario;

    @Column(name = "correo_electronico", nullable = false, length = 100)
    public String correoElectronico;

    @Column(name = "estrato_socioeconomico", nullable = false, length = 20)
    public String estratoSocioeconomico;

    @Column(name = "ingresos_mensuales", nullable = false, length = 50)
    public String ingresosMensuales;

    @Column(nullable = false, length = 50)
    public String ocupacion;

    @Column(name = "es_poblacion_vulnerable", nullable = false)
    public Boolean esPoblacionVulnerable;

    @Column(name = "tipo_poblacion_vulnerable", length = 100)
    public String tipoPoblacionVulnerable;

    @Column(name = "fecha_registro", nullable = false)
    public LocalDateTime fechaRegistro;

    @Column(name = "acepta_habeas_data", nullable = false)
    public Boolean aceptaHabeasData;

    @Column(name = "estado_usuario", nullable = false, length = 20)
    public String estadoUsuario;
}
