package Entidades;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "objetoaprendizaje", schema = "oda")
public class ObjetoaprendizajeEntity {
    private int idObjetoaprendizaje;
    private String nombreObjetoaprendizaje;
    private Time duracionObjetoaprendizaje;
    private String objetivoObjetoaprendizaje;
    private String descripcionObjetoaprendizaje;
    private String enlaceObjetoaprendizaje;

    @Id
    @Column(name = "id_objetoaprendizaje", nullable = false)
    public int getIdObjetoaprendizaje() {
        return idObjetoaprendizaje;
    }

    public void setIdObjetoaprendizaje(int idObjetoaprendizaje) {
        this.idObjetoaprendizaje = idObjetoaprendizaje;
    }

    @Basic
    @Column(name = "nombre_objetoaprendizaje", nullable = false, length = 100)
    public String getNombreObjetoaprendizaje() {
        return nombreObjetoaprendizaje;
    }

    public void setNombreObjetoaprendizaje(String nombreObjetoaprendizaje) {
        this.nombreObjetoaprendizaje = nombreObjetoaprendizaje;
    }

    @Basic
    @Column(name = "duracion_objetoaprendizaje", nullable = false)
    public Time getDuracionObjetoaprendizaje() {
        return duracionObjetoaprendizaje;
    }

    public void setDuracionObjetoaprendizaje(Time duracionObjetoaprendizaje) {
        this.duracionObjetoaprendizaje = duracionObjetoaprendizaje;
    }

    @Basic
    @Column(name = "objetivo_objetoaprendizaje", nullable = true, length = 500)
    public String getObjetivoObjetoaprendizaje() {
        return objetivoObjetoaprendizaje;
    }

    public void setObjetivoObjetoaprendizaje(String objetivoObjetoaprendizaje) {
        this.objetivoObjetoaprendizaje = objetivoObjetoaprendizaje;
    }

    @Basic
    @Column(name = "descripcion_objetoaprendizaje", nullable = true, length = 500)
    public String getDescripcionObjetoaprendizaje() {
        return descripcionObjetoaprendizaje;
    }

    public void setDescripcionObjetoaprendizaje(String descripcionObjetoaprendizaje) {
        this.descripcionObjetoaprendizaje = descripcionObjetoaprendizaje;
    }

    @Basic
    @Column(name = "enlace_objetoaprendizaje", nullable = true, length = 150)
    public String getEnlaceObjetoaprendizaje() {
        return enlaceObjetoaprendizaje;
    }

    public void setEnlaceObjetoaprendizaje(String enlaceObjetoaprendizaje) {
        this.enlaceObjetoaprendizaje = enlaceObjetoaprendizaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoaprendizajeEntity that = (ObjetoaprendizajeEntity) o;
        return idObjetoaprendizaje == that.idObjetoaprendizaje &&
                Objects.equals(nombreObjetoaprendizaje, that.nombreObjetoaprendizaje) &&
                Objects.equals(duracionObjetoaprendizaje, that.duracionObjetoaprendizaje) &&
                Objects.equals(objetivoObjetoaprendizaje, that.objetivoObjetoaprendizaje) &&
                Objects.equals(descripcionObjetoaprendizaje, that.descripcionObjetoaprendizaje) &&
                Objects.equals(enlaceObjetoaprendizaje, that.enlaceObjetoaprendizaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObjetoaprendizaje, nombreObjetoaprendizaje, duracionObjetoaprendizaje, objetivoObjetoaprendizaje, descripcionObjetoaprendizaje, enlaceObjetoaprendizaje);
    }
}
