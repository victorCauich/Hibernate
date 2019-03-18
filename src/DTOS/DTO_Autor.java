package DTOS;

import java.io.Serializable;

public class DTO_Autor implements Serializable {
    private int idAutor;
    private String nombreAutor;
    private String apellidoPaternoAutor;
    private String apellidoMaternoAutor;
    private String tipoAutor;

    public DTO_Autor(){}

    public DTO_Autor(String nombreAutor, String apellidoPaternoAutor, String apellidoMaternoAutor, String tipoAutor){
        this.setNombreAutor(nombreAutor);
        this.setApellidoPaternoAutor(apellidoPaternoAutor);
        this.setApellidoMaternoAutor(apellidoMaternoAutor);
        this.setTipoAutor(tipoAutor);
    }


    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoPaternoAutor() {
        return apellidoPaternoAutor;
    }

    public void setApellidoPaternoAutor(String apellidoPaternoAutor) {
        this.apellidoPaternoAutor = apellidoPaternoAutor;
    }

    public String getApellidoMaternoAutor() {
        return apellidoMaternoAutor;
    }

    public void setApellidoMaternoAutor(String apellidoMaternoAutor) {
        this.apellidoMaternoAutor = apellidoMaternoAutor;
    }

    public String getTipoAutor() {
        return tipoAutor;
    }

    public void setTipoAutor(String tipoAutor) {
        this.tipoAutor = tipoAutor;
    }
}
