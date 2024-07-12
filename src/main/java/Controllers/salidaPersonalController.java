package Controllers;


import AccesoDao.salidaPersonalDao;
import Registro.salidaPersonal;
import java.util.ArrayList;


public class salidaPersonalController {
    
    
    public salidaPersonalDao Horasdao = new salidaPersonalDao();
// public usuariosDao usuariodao = new usuariosDao();
    
    
    public salidaPersonalController(){
    }

    
    public Object[][] loadDataforTableModel(){
        ArrayList<salidaPersonal> ingresoSalida = Horasdao.getAll();
        Object[][] content = Horasdao.getAllV(ingresoSalida);
        return content;
    }
    
    public int insert(salidaPersonal persona){
        Horasdao= new salidaPersonalDao();
        int reg = Horasdao.insert(persona);
        return reg;
    }
    
    
    public int edit(salidaPersonal persona){
        Horasdao= new salidaPersonalDao();
        int reg = Horasdao.edit(persona);
        return reg;
    }
       
    public int delete(int Id){
       Horasdao= new salidaPersonalDao();
        int reg = Horasdao.delete(Id);
        return reg;
    }
    
    public String[] searchhorariosById(int Id){
        salidaPersonalDao Horasdao = new salidaPersonalDao();
        String[] reg = Horasdao.searchhorariosById(Id);
        return reg;
    }
    
}
