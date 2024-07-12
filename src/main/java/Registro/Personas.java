package Registro;

public class Personas {

    int id;
    String nombre;
    String apellido;
    String cedula;
    String rol;
    String ficha_o_cFormacion;
    String tipo_transporte;
    String placa;
    String color;
    String marca;
    //int id_usuario;

    public Personas() {
    }

    public Personas(int id) {
        this.id = id;
    }


//Sin id, Sin Id_Usuario 
    public Personas(String nombre, String apellido, String cedula, String rol, String ficha_o_cFormacion, String tipo_transporte, String placa, String color, String marca) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.rol = rol;
        this.ficha_o_cFormacion = ficha_o_cFormacion;
        this.tipo_transporte = tipo_transporte;
        this.placa = placa;
        this.color = color;
        this.marca = marca;
    }

    
    public Personas(int id, String nombre, String apellido, String cedula, String rol, String ficha_o_cFormacion, String tipo_transporte, String placa, String color, String marca) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.rol = rol;
        this.ficha_o_cFormacion = ficha_o_cFormacion;
        this.tipo_transporte = tipo_transporte;
        this.placa = placa;
        this.color = color;
        this.marca = marca;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFicha_o_cFormacion() {
        return ficha_o_cFormacion;
    }

    public void setFicha_o_cFormacion(String ficha_o_cFormacion) {
        this.ficha_o_cFormacion = ficha_o_cFormacion;
    }

    public String getTipo_transporte() {
        return tipo_transporte;
    }

    public void setTipo_transporte(String tipo_transporte) {
        this.tipo_transporte = tipo_transporte;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

//    public int getId_usuario() {
//        return id_usuario;
//    }
//
//    public void setId_usuario(int id_usuario) {
//        this.id_usuario = id_usuario;
//    }
    

}

    