package DTOS;

import java.io.Serializable;

public class DTO_TipoObjeto implements Serializable {
    private int idTipoObjeto;
    private String nombreTipoObjeto;

    public DTO_TipoObjeto() {
    }

    public DTO_TipoObjeto(String nombreTipoObjeto) {
        this.setNombreTipoObjeto(nombreTipoObjeto);
    }

    public int getIdTipoObjeto() {
        return idTipoObjeto;
    }

    public void setIdTipoObjeto(int idTipoObjeto) {
        this.idTipoObjeto = idTipoObjeto;
    }

    public String getNombreTipoObjeto() {
        return nombreTipoObjeto;
    }

    public void setNombreTipoObjeto(String nombreTipoObjeto) {
        this.nombreTipoObjeto = nombreTipoObjeto;
    }
}