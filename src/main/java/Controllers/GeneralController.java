package Controllers;

import AccesoDao.UsuariosDao;
import Registro.Usuarios;
import java.util.ArrayList;


public class GeneralController {
    
    public UsuariosDao usuariodao = new UsuariosDao();
    
    public GeneralController(){
       
    }
   
    
    public Object[][] loadDataforTableModel(){
        ArrayList<Usuarios> usuarios = usuariodao.getAll();
        Object[][] content = usuariodao.getAllV(usuarios);
        return content;
    }
    
    public int insert(Usuarios usuarios){
        usuariodao= new UsuariosDao();
        int reg = usuariodao.insert(usuarios);
        return reg;
    }
    
    
    public int edit(Usuarios usuarios){
        UsuariosDao usuariodao = new UsuariosDao();
        int reg =  usuariodao.edit(usuarios);
        return reg;
    }
    
    
    public int delete(int Id){
        UsuariosDao usuariodao = new UsuariosDao();
        int reg = usuariodao.delete(Id);
        return reg;
    }
    
    public String[] searchUsuariosById(int Id){
        UsuariosDao usuariodao = new UsuariosDao();
        String[] reg = usuariodao.searchUsuariosById(Id);
        return reg;
    }
    
}
