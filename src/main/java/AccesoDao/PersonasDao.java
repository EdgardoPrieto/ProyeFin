package AccesoDao;

import Registro.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonasDao {
//    private static final String SQL_ALL = "SELECT Id, nombre, apellido,"
//            + "cedula, rol, ficha_o_cFormacion, tipo_transporte, placa, color, marca FROM personas";
    
    private static final String SQL_ALL = "SELECT * FROM personas ";
    
    private static final String SQL_INSERT = "INSERT INTO personas (nombre, apellido,"
            + "cedula, rol, ficha_o_cFormacion, tipo_transporte, placa, color, marca) VALUES (?,?,?,?,?,?,?,?,?)";
    
    private static final String SQL_EDIT = "UPDATE personas SET nombre=?,"
            + "apellido=?, cedula=?, rol=?, ficha_o_cFormacion=?, tipo_transporte=?, placa=?, color=?, marca=? WHERE Id=?";
    
    private static final String SQL_DELETE = "DELETE FROM personas WHERE Id=?";
    
    private static final String SQL_PERSONAS_BY_ID = "SELECT * FROM personas WHERE Id=";
    
    
    public ArrayList<Personas> getAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Personas> persona = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String cedula = rs.getString("cedula");
                String rol = rs.getString("rol");
                String ficha_o_cFormacion = rs.getString("ficha_o_cFormacion");
//                String pertenencias = rs.getString("pertenencias");
                String tipo_transporte = rs.getString("tipo_transporte");
                String placa = rs.getString("placa");
                String color = rs.getString("color");
                String marca = rs.getString("marca");
                persona.add(new Personas(id, nombre, apellido, cedula, rol, ficha_o_cFormacion, tipo_transporte, placa, color, marca));
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
        System.out.println(persona.toString());
        return persona;
    }

    
    public Object[][] getAllV(ArrayList<Personas> persona) {
        Object[][] matriz = new Object[persona.size()][11];
        for (int i = 0; i < persona.size(); i++) {
            for (int j = 0; j < 11; j++) {
                matriz[i][0] = persona.get(i).getId();
                matriz[i][1] = persona.get(i).getNombre();
                matriz[i][2] = persona.get(i).getApellido();
                matriz[i][3] = persona.get(i).getCedula();
                matriz[i][4] = persona.get(i).getRol();
                matriz[i][5] = persona.get(i).getFicha_o_cFormacion();            
//                matriz[i][6] = persona.get(i).getPertenencias();
                matriz[i][6] = persona.get(i).getTipo_transporte();
                matriz[i][7] = persona.get(i).getPlaca();
                matriz[i][8] = persona.get(i).getColor();
                matriz[i][9] = persona.get(i).getMarca();
            }
        }
        return matriz;
    }
    
    
    public int insert(Personas persona) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            //ps.setInt(1, persona.getId());
            ps.setString(1, persona.getNombre());
            ps.setString(2,persona.getApellido());
            ps.setString(3,persona.getCedula());
            ps.setString(4, persona.getRol());
            ps.setString(5, persona.getFicha_o_cFormacion());
//            ps.setString(7, persona.getPertenencias());
            ps.setString(6, persona.getTipo_transporte());
            ps.setString(7, persona.getPlaca());
            ps.setString(8, persona.getColor());
            ps.setString(9, persona.getMarca());
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
    
    
    public int edit(Personas persona) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_EDIT);
            ps.setString(1, persona.getNombre());
            ps.setString(2,persona.getApellido());
            ps.setString(3, persona.getCedula());
            ps.setString(4, persona.getRol());
            ps.setString(5, persona.getFicha_o_cFormacion());
            ps.setString(6, persona.getTipo_transporte());
            ps.setString(7, persona.getPlaca());
            ps.setString(8, persona.getColor());
            ps.setString(9, persona.getMarca());
            ps.setInt(10, persona.getId());
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
        Personas personasByID = null;
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

    public String[] searchPersonasById(int id) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String[] datos = new String[8];
        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_PERSONAS_BY_ID + id);
            if (rs.next()) {
                String Id = String.valueOf(id);
                String nombre_ = rs.getString("nombre");
                String apellido_ = rs.getString("apellido");
                String cedula_ = rs.getString("cedula");
                String rol_ = rs.getString("rol");
                String ficha_o_cFormacion_ = rs.getString("Ficha_o_cFormacion");
//                String pertenencias_ = rs.getString("Pertenencias");
                String tipo_transporte_ = rs.getString("Tipo_transporte");
                String placa_ = rs.getString("Placa");
                String color_ = rs.getString("Color");
                String marca_ = rs.getString("Marca");
                
                datos[0] = Id;
                datos[1] = nombre_;
                datos[2] = apellido_;
                datos[3] = cedula_;
                datos[4] = rol_;
                datos[5] = ficha_o_cFormacion_;
//                datos[6] = pertenencias_;
                datos[6] = tipo_transporte_;
                datos[7] = placa_;
                datos[8] = color_;
                datos[9] = marca_;
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
