package AccesoDao;

import Registro.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class salidaPersonalDao {
//    private static final String SQL_ALL = "SELECT id, fecha,"
//            + "hora_salida, id_persona FROM SalidaPersonal";
   
    private static final String SQL_ALL = "SELECT * FROM salidaPersonal";
    
    private static final String SQL_INSERT = "INSERT INTO salidaPersonal (id, fecha,"
            + "hora_salida, id_persona) VALUES (?,?,?,?)";
    
    private static final String SQL_EDIT = "UPDATE salidaPersonal SET fecha=?,"
            + "hora_salida=? WHERE id=?";
   
    private static final String SQL_DELETE = "DELETE FROM salidaPersonal WHERE id=?";
    
    private static final String SQL_SALIDAPERSONAL_BY_ID = "SELECT * FROM salidaPersonal WHERE id=?";

    
    public ArrayList<salidaPersonal> getAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList <salidaPersonal> ingresoSalida = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String fecha = rs.getString("fecha");
                String hora_salida = rs.getString("hora_salida");
                int id_persona = rs.getInt("id_persona");
                ingresoSalida.add(new salidaPersonal(id, fecha, hora_salida, id_persona));
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
        System.out.println(ingresoSalida.toString());
        return ingresoSalida;
    }

    
    public Object[][] getAllV(ArrayList<salidaPersonal> ingresoSalida) {
        Object[][] matriz = new Object[ingresoSalida.size()][4];
        for (int i = 0; i < ingresoSalida.size(); i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][0] = ingresoSalida.get(i).getId();
                matriz[i][1] = ingresoSalida.get(i).getId_persona();
                matriz[i][2] = ingresoSalida.get(i).getFecha();
                matriz[i][3] = ingresoSalida.get(i).getHora_salida();
            }
        }
        return matriz;
    }
    
    
    public int insert(salidaPersonal ingresoSalida) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, ingresoSalida.getId());
            ps.setString(2, ingresoSalida.getFecha());
            ps.setString(3, ingresoSalida.getHora_salida());
            ps.setInt(4, ingresoSalida.getId_persona());
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
    
    
    public int edit(salidaPersonal ingresoSalida) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_EDIT); 
            ps.setString(1, ingresoSalida.getFecha());
            ps.setString(2, ingresoSalida.getHora_salida());
            ps.setInt(3, ingresoSalida.getId());
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
        Usuarios ingresoSalidaByID = null;
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

    
    public String[] searchhorariosById(int id) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String[] datos = new String[4];
        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_SALIDAPERSONAL_BY_ID + id);
            if (rs.next()) {
                String IdUsuarios = String.valueOf(id);
                String fecha_ = rs.getString("nombre");
                String hora_ = rs.getString("apellido");
                String tipo_ = rs.getString("cedula");            
                datos[0] = IdUsuarios;
                datos[1] = fecha_;
                datos[2] = hora_;
                datos[3] = tipo_;
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
