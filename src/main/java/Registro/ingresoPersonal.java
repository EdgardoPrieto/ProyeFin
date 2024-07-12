package Registro;


public class ingresoPersonal {
    int id ;
    String fecha ;
    String hora_entrada ;
    int id_persona ;

    
    public ingresoPersonal() {
    }

    
//SIN ID
    public ingresoPersonal(int id_persona, String fecha, String hora_entrada) {
        this.id_persona = id_persona;
        this.fecha = fecha;
        this.hora_entrada = hora_entrada;
    }

//TODO    
//    public ingresoPersonal(int id, int id_persona, String fecha, String hora_entrada) {
//        this.id = id;
//        this.id_persona = id_persona;
//        this.fecha = fecha;
//        this.hora_entrada = hora_entrada;
//    }

    public ingresoPersonal(int id, String fecha, String hora_entrada, int id_persona) {
        this.id = id;
        this.fecha = fecha;
        this.hora_entrada = hora_entrada;
        this.id_persona = id_persona;
    }
    
    
  
    
    public ingresoPersonal(String fecha, String hora_entrada, int id_persona) {
        this.fecha = fecha;
        this.hora_entrada = hora_entrada;
        this.id_persona = id_persona;
    }
     

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }


    
    
}

    