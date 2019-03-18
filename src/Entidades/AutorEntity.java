package Entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "autor", schema = "oda")
public class AutorEntity {
    private int idAutor;
    private String nombreAutor;
    private String apellidopaternoAutor;
    private String apellidomaternoAutor;
    private String tipoAutor;

    @Id
    @Column(name = "id_autor", nullable = false)
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    @Basic
    @Column(name = "nombre_autor", nullable = false, length = 50)
    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    @Basic
    @Column(name = "apellidopaterno_autor", nullable = true, length = 50)
    public String getApellidopaternoAutor() {
        return apellidopaternoAutor;
    }

    public void setApellidopaternoAutor(String apellidopaternoAutor) {
        this.apellidopaternoAutor = apellidopaternoAutor;
    }

    @Basic
    @Column(name = "apellidomaterno_autor", nullable = true, length = 50)
    public String getApellidomaternoAutor() {
        return apellidomaternoAutor;
    }

    public void setApellidomaternoAutor(String apellidomaternoAutor) {
        this.apellidomaternoAutor = apellidomaternoAutor;
    }

    @Basic
    @Column(name = "tipo_autor", nullable = true, length = 10)
    public String getTipoAutor() {
        return tipoAutor;
    }

    public void setTipoAutor(String tipoAutor) {
        this.tipoAutor = tipoAutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutorEntity that = (AutorEntity) o;
        return idAutor == that.idAutor &&
                Objects.equals(nombreAutor, that.nombreAutor) &&
                Objects.equals(apellidopaternoAutor, that.apellidopaternoAutor) &&
                Objects.equals(apellidomaternoAutor, that.apellidomaternoAutor) &&
                Objects.equals(tipoAutor, that.tipoAutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutor, nombreAutor, apellidopaternoAutor, apellidomaternoAutor, tipoAutor);
    }
}
