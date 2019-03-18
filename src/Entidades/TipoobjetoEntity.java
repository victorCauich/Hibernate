package Entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipoobjeto", schema = "oda")
public class TipoobjetoEntity {
    private int idTipoobjeto;
    private String nombreTipoobjeto;

    @Id
    @Column(name = "id_tipoobjeto", nullable = false)
    public int getIdTipoobjeto() {
        return idTipoobjeto;
    }

    public void setIdTipoobjeto(int idTipoobjeto) {
        this.idTipoobjeto = idTipoobjeto;
    }

    @Basic
    @Column(name = "nombre_tipoobjeto", nullable = false, length = 10)
    public String getNombreTipoobjeto() {
        return nombreTipoobjeto;
    }

    public void setNombreTipoobjeto(String nombreTipoobjeto) {
        this.nombreTipoobjeto = nombreTipoobjeto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoobjetoEntity that = (TipoobjetoEntity) o;
        return idTipoobjeto == that.idTipoobjeto &&
                Objects.equals(nombreTipoobjeto, that.nombreTipoobjeto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoobjeto, nombreTipoobjeto);
    }
}
