package Controllers;



import AccesoDao.*;
import Registro.*;
import java.util.ArrayList;


public class IngresoPersonalController {
    
    public IngresoPersonalDao Horasdao = new IngresoPersonalDao();
// public usuariosDao usuariodao = new usuariosDao();
    
    
    public IngresoPersonalController(){
       
    }

    
    public Object[][] loadDataforTableModel(){
        ArrayList<ingresoPersonal> ingresoSalida = Horasdao.getAll();
        Object[][] content = Horasdao.getAllV(ingresoSalida);
        return content;
    }
    
    public int insert(ingresoPersonal persona){
        Horasdao= new IngresoPersonalDao();
        int reg = Horasdao.insert(persona);
        return reg;
    }
    
    
    public int edit(ingresoPersonal persona){
        Horasdao= new IngresoPersonalDao();
        int reg = Horasdao.edit(persona);
        return reg;
    }
       
    public int delete(int Id){
       Horasdao= new IngresoPersonalDao();
        int reg = Horasdao.delete(Id);
        return reg;
    }
    
    public String[] searchhorariosById(int Id){
        IngresoPersonalDao Horasdao = new IngresoPersonalDao();
        String[] reg = Horasdao.searchhorariosById(Id);
        return reg;
    }
    
}
