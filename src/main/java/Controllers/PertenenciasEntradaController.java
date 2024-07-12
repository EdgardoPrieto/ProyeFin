package Controllers;



import AccesoDao.PertenenciasEntradaDao;
import Registro.PertenenciasEntrada;
import java.util.ArrayList;


public class PertenenciasEntradaController {
    
   public PertenenciasEntradaDao perdao = new PertenenciasEntradaDao();

    
    public PertenenciasEntradaController(){
        

    }
    
    public Object[][] loadDataforTableModel(){
        ArrayList<PertenenciasEntrada> pertenencia = perdao.getAll();
        Object[][] content = perdao.getAllV(pertenencia);
        return content;
    }
    
    
  public int insert(PertenenciasEntrada pertenencias){
        perdao= new PertenenciasEntradaDao();
        int reg = perdao.insert(pertenencias);
        return reg;
    }
    
    
    
    public int edit(PertenenciasEntrada pertenencias){
       perdao= new PertenenciasEntradaDao();
        int reg = perdao.edit(pertenencias);
        return reg;
    }
    
    
    public int delete(int Id){
       perdao= new PertenenciasEntradaDao();
        int reg = perdao.delete(Id);
        return reg;
    }
    
    public String[] searchpertenenciasById(int Id){
        PertenenciasEntradaDao perdao = new PertenenciasEntradaDao();
        String[] reg = perdao.searchpertenenciasById(Id);
        return reg;
    }
    
}
