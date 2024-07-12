package Registro;


public class salidaPersonal {
    int id ;
    String fecha ;
    String hora_salida ;
    int id_persona ;

    public salidaPersonal(int id) {
        this.id = id;
    }

    
    public salidaPersonal(String fecha, String hora_salida, int id_persona) {
        this.fecha = fecha;
        this.hora_salida = hora_salida;
        this.id_persona = id_persona;
    }

    
    public salidaPersonal(int id, String fecha, String hora_salida, int id_persona) {
        this.id = id;
        this.fecha = fecha;
        this.hora_salida = hora_salida;
        this.id_persona = id_persona;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    
}