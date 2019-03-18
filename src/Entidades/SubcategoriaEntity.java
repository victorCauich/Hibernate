package Entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subcategoria", schema = "oda")
public class SubcategoriaEntity {
    private int idSubcategoria;
    private String nombreSubcategoria;

    @Id
    @Column(name = "id_subcategoria", nullable = false)
    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    @Basic
    @Column(name = "nombre_subcategoria", nullable = false, length = 100)
    public String getNombreSubcategoria() {
        return nombreSubcategoria;
    }

    public void setNombreSubcategoria(String nombreSubcategoria) {
        this.nombreSubcategoria = nombreSubcategoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubcategoriaEntity that = (SubcategoriaEntity) o;
        return idSubcategoria == that.idSubcategoria &&
                Objects.equals(nombreSubcategoria, that.nombreSubcategoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubcategoria, nombreSubcategoria);
    }
}
