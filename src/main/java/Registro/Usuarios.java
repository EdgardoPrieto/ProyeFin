package Registro;

public class Usuarios {
    int id_usuarios ;
    String nombre ;
    String apellido;
    String cedula ;                     //numero de identificacion
    String contacto ;
    String direccion ;
    String Email ;
    String password;
    //int id_usuario;

    
    public Usuarios(int id) {
        this.id_usuarios = id;
    }

//Sin ID
    public Usuarios(String nombre, String apellido, String cedula, String contacto, String direccion, String Email, String password /*int id_usuario*/) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.contacto = contacto;
        this.direccion = direccion;
        this.Email = Email;
        this.password = password;
        //this.id_usuario = id_usuario;
    }

    public Usuarios(int id_usuarios, String nombre, String apellido, String cedula, String contacto, String direccion, String Email, String password) {
        this.id_usuarios = id_usuarios;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.contacto = contacto;
        this.direccion = direccion;
        this.Email = Email;
        this.password = password;
    }

    
//    public Usuarios(int id_usuarios, String nombre, String apellido, String cedula, String contacto, String direccion, String Email, String password, int id_usuario) {
//        this.id_usuarios = id_usuarios;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.cedula = cedula;
//        this.contacto = contacto;
//        this.direccion = direccion;
//        this.Email = Email;
//        this.password = password;
//        //this.id_usuario = id_usuario;
//    }

    
    public int getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public int getId_usuario() {
//        return id_usuario;
//    }
//
//    public void setId_usuario(int id_usuario) {
//        this.id_usuario = id_usuario;
//    }

}