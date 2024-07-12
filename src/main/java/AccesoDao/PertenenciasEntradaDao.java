package AccesoDao;

import Registro.*;
import java.sql.*;
import java.util.ArrayList;


public class PertenenciasEntradaDao {
//     private static final String SQL_ALL = "SELECT id_pertenencias, serial, tipo_pertenencias "
//            + "FROM pertenenciasEntrada";
    
    private static final String SQL_ALL = "SELECT * FROM pertenenciasEntrada";
    
    private static final String SQL_INSERT = "INSERT INTO pertenenciasEntrada (id_pertenencias,"
            + "serial, tipo_pertenencias, id_persona) VALUES (?,?,?,?)";
    
    private static final String SQL_EDIT = "UPDATE pertenenciasEntrada SET serial=?,"
            + "tipo_pertenencias=? WHERE Id_pertenencias=?";
   
    private static final String SQL_DELETE = "DELETE FROM pertenenciasEntrada WHERE id_pertenencias=?";
    
    private static final String SQL_PERTENENCIAS_BY_ID = "SELECT * FROM pertenenciasEntrada WHERE id_pertenencias=?";

    
    public ArrayList<PertenenciasEntrada> getAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList <PertenenciasEntrada> pertenencia = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_pertenencias = rs.getInt("id_pertenencias");
                String serial = rs.getString("serial");
                String tipo_pertenencias = rs.getString("tipo_pertenencias");
                int id_persona = rs.getInt("id_persona");
                pertenencia.add(new PertenenciasEntrada(id_pertenencias, serial, tipo_pertenencias, id_persona));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        System.out.println(pertenencia.toString());
        return pertenencia;
    }

    
    public Object[][] getAllV(ArrayList<PertenenciasEntrada> pertenencia) {
        Object[][] matriz = new Object[pertenencia.size()][4];
        for (int i = 0; i < pertenencia.size(); i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][0] = pertenencia.get(i).getId_pertenencias();
                matriz[i][1] = pertenencia.get(i).getSerial();
                matriz[i][2] = pertenencia.get(i).getTipo_pertenencias();
                matriz[i][3] = pertenencia.get(i).getId_persona();                
            }
        }
        return matriz;
    }

    
    public int insert(PertenenciasEntrada pertenencias) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, pertenencias.getId_pertenencias());
            ps.setString(2, pertenencias.getSerial());
            ps.setString(3, pertenencias.getTipo_pertenencias());
            ps.setInt(4, pertenencias.getId_persona());
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    
    public int edit(PertenenciasEntrada pertenencias) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_EDIT);
            ps.setString(1, pertenencias.getSerial());
            ps.setString(2, pertenencias.getTipo_pertenencias());
            ps.setInt(3, pertenencias.getId_pertenencias());
            registros = ps.executeUpdate();      
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    
    
    public int delete(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        PertenenciasEntrada PertenenciasByID = null;
        int reg = 0;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, id);
            reg = ps.executeUpdate();
            System.out.println("reg dentro de DAO = " + reg);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                conn.close();
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return reg;
    }

    
    public String[] searchpertenenciasById(int id) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        String[] datos = new String[8];
        try {
            conn = Conexion.getConnection();
            st = conn.prepareStatement(SQL_PERTENENCIAS_BY_ID);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                String IdPertenencia = String.valueOf(id);
                String serial_ = rs.getString("serial");
                String tipo_pertenencias_ = rs.getString("nombre"); 
                String IdPersona = String.valueOf(id);
                datos[0] = IdPertenencia;
                datos[1] = serial_;
                datos[2] = tipo_pertenencias_;
                datos[3] = IdPersona;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return datos;
    }
}



