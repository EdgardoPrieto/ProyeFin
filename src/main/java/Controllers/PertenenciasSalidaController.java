package Controllers;




import AccesoDao.PertenenciasSalidaDao;
import Registro.PertenenciasSalida;
import java.util.ArrayList;


public class PertenenciasSalidaController {
    
   public PertenenciasSalidaDao perdao = new PertenenciasSalidaDao();
    
    public PertenenciasSalidaController(){
       
    }
    
    
    public Object[][] loadDataforTableModel(){
        ArrayList<PertenenciasSalida> pertenencia = perdao.getAll();
        Object[][] content = perdao.getAllV(pertenencia);
        return content;
    }
    
  public int insert(PertenenciasSalida pertenencias){
        perdao= new PertenenciasSalidaDao();
        int reg = perdao.insert(pertenencias);
        return reg;
    }
    
    
    
    public int edit(PertenenciasSalida pertenencias){
       perdao= new PertenenciasSalidaDao();
        int reg = perdao.edit(pertenencias);
        return reg;
    }
    
    
    public int delete(int Id){
       perdao= new PertenenciasSalidaDao();
        int reg = perdao.delete(Id);
        return reg;
    }
    
    public String[] searchpertenenciasById(int Id){
        PertenenciasSalidaDao perdao = new PertenenciasSalidaDao();
        String[] reg = perdao.searchpertenenciasById(Id);
        return reg;
    }
    
}
