package Entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "licenciatura_unidadaprendizaje", schema = "oda")
public class LicenciaturaUnidadaprendizajeEntity {
    private int idLicenciatura;
    private String nombreLicenciatura;
    private String nombreUnidadaprendizaje;

    @Id
    @Column(name = "id_licenciatura", nullable = false)
    public int getIdLicenciatura() {
        return idLicenciatura;
    }

    public void setIdLicenciatura(int idLicenciatura) {
        this.idLicenciatura = idLicenciatura;
    }

    @Basic
    @Column(name = "nombre_licenciatura", nullable = true, length = 100)
    public String getNombreLicenciatura() {
        return nombreLicenciatura;
    }

    public void setNombreLicenciatura(String nombreLicenciatura) {
        this.nombreLicenciatura = nombreLicenciatura;
    }

    @Basic
    @Column(name = "nombre_unidadaprendizaje", nullable = true, length = 100)
    public String getNombreUnidadaprendizaje() {
        return nombreUnidadaprendizaje;
    }

    public void setNombreUnidadaprendizaje(String nombreUnidadaprendizaje) {
        this.nombreUnidadaprendizaje = nombreUnidadaprendizaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LicenciaturaUnidadaprendizajeEntity that = (LicenciaturaUnidadaprendizajeEntity) o;
        return idLicenciatura == that.idLicenciatura &&
                Objects.equals(nombreLicenciatura, that.nombreLicenciatura) &&
                Objects.equals(nombreUnidadaprendizaje, that.nombreUnidadaprendizaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLicenciatura, nombreLicenciatura, nombreUnidadaprendizaje);
    }
}
