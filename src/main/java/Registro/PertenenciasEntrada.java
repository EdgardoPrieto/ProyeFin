package Registro;

public class PertenenciasEntrada {
    int id_pertenencias;
    String serial;
    String tipo_pertenencias;
    int id_persona;

    
    public PertenenciasEntrada(int id_pertenencias) {
        this.id_pertenencias = id_pertenencias;
    }

        
    public PertenenciasEntrada(String serial, String tipo_pertenencias, int id_persona) { 
        this.serial = serial;
        this.tipo_pertenencias = tipo_pertenencias;
        this.id_persona = id_persona;
    }

    public PertenenciasEntrada(int id_pertenencias, String serial, String tipo_pertenencias, int id_persona) {
        this.id_pertenencias = id_pertenencias;
        this.serial = serial;
        this.tipo_pertenencias = tipo_pertenencias;
        this.id_persona = id_persona;
    }
    
    

    public int getId_pertenencias() {
        return id_pertenencias;
    }

    public void setId_pertenencias(int id_pertenencias) {
        this.id_pertenencias = id_pertenencias;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getTipo_pertenencias() {
        return tipo_pertenencias;
    }

    public void setTipo_pertenencias(String tipo_pertenencias) {
        this.tipo_pertenencias = tipo_pertenencias;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

}

