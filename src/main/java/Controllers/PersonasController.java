package Controllers;

import AccesoDao.PersonasDao;
import Registro.Personas;
import View.Login;
import java.util.ArrayList;


public class PersonasController {
    
    public PersonasDao personadao = new PersonasDao();
// public usuariosDao usuariodao = new usuariosDao();
    
    public PersonasController(){
        
    }
    
    /* Lanzar formulario Customers */
//    public void init(){
//        personas TotalPersonas = new personas();
////        TotalUsuarios.setResizable(false);
////        TotalUsuarios.setLocationRelativeTo(null);
//        TotalPersonas.setVisible(true);
//    }
    
    public void init(){                                                       //Metodo sin retorno        
        Login sedeTable = new Login();                                    //Es una clase que extiende de Jframe (ventana GIU)
        sedeTable.setResizable(false);                               
        sedeTable.setLocationRelativeTo(null);
        sedeTable.setVisible(true);
    }
    
    public Object[][] loadDataforTableModel(){
        ArrayList<Personas> persona = personadao.getAll();
        Object[][] content = personadao.getAllV(persona);
        return content;
    }
    
    public int insert(Personas persona){
        personadao= new PersonasDao();
        int reg = personadao.insert(persona);
        return reg;
    }
    
    
    public int edit(Personas persona){
       personadao= new PersonasDao();
        int reg = personadao.edit(persona);
        return reg;
    }
    
    
    public int delete(int Id){
        personadao= new PersonasDao();
        int reg = personadao.delete(Id);
        return reg;
    }
    
    public String[] searchPersonasById(int Id){
        PersonasDao personaDao = new PersonasDao();
        String[] reg = personaDao.searchPersonasById(Id);
        return reg;
    }
    
}
