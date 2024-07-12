package AccesoDao;

import Registro.*;
import java.sql.*;
import java.util.*;

public class UsuariosDao {

//    private static final String SQL_ALL = "SELECT id_usuarios, nombre,"
//            + "apellido, cedula, contacto, direccion,Email, password FROM usuarios";
    
    private static final String SQL_ALL =  "SELECT * FROM usuarios";
            
    private static final String SQL_INSERT = "INSERT INTO usuarios (id_usuarios, nombre,"
            + "apellido, cedula, contacto, direccion,Email, password) VALUES (?,?,?,?,?,?,?,?)";
    
    private static final String SQL_EDIT = "UPDATE usuarios SET nombre=?,"
            + "apellido=?, cedula=?, contacto=?, direccion=?,Email=?, password=? WHERE id_usuarios=?";
    
    private static final String SQL_DELETE = "DELETE FROM usuarios WHERE id_usuarios=?";
    
    private static String SQL_USUARIOS_BY_ID = "SELECT * FROM usuarios WHERE id_usuarios=";

    
    public ArrayList<Usuarios> getAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Usuarios> usuario = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_usuarios = rs.getInt("id_usuarios");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String cedula = rs.getString("cedula");
                String contacto = rs.getString("contacto");
                String direccion = rs.getString("direccion");
                String Email = rs.getString("email");
                String password = rs.getString("password");
                usuario.add(new Usuarios(id_usuarios, nombre, apellido, cedula, contacto, direccion, Email, password));
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
        System.out.println(usuario.toString());
        return usuario;
    }

    
    public Object[][] getAllV(ArrayList<Usuarios> usuario) {
        Object[][] matriz = new Object[usuario.size()][8];
        for (int i = 0; i < usuario.size(); i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][0] = usuario.get(i).getId_usuarios();
                matriz[i][1] = usuario.get(i).getNombre();
                matriz[i][2] = usuario.get(i).getApellido();
                matriz[i][3] = usuario.get(i).getCedula();
                matriz[i][4] = usuario.get(i).getContacto();
                matriz[i][5] = usuario.get(i).getDireccion();
                matriz[i][6] = usuario.get(i).getEmail();
                matriz[i][7] = usuario.get(i).getPassword();
            }
        }
        return matriz;
    }

    
    public int insert(Usuarios usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, usuario.getId_usuarios());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getCedula());
            ps.setString(5, usuario.getContacto());
            ps.setString(6, usuario.getDireccion());
            ps.setString(7, usuario.getEmail());
            ps.setString(8, usuario.getPassword());
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

    
    public int edit(Usuarios usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_EDIT);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getCedula());
            ps.setString(4, usuario.getContacto());
            ps.setString(5, usuario.getDireccion());
            ps.setString(6, usuario.getEmail());
            ps.setString(7, usuario.getPassword());
            ps.setInt(8, usuario.getId_usuarios());
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
        Usuarios UsuariosByID = null;
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
    
    
    public String[] searchUsuariosById(int id) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String[] datos = new String[8];
        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_USUARIOS_BY_ID + id);
            if (rs.next()) {
                String IdUsuarios = String.valueOf(id);
                String nombre_ = rs.getString("nombre");
                String apellido_ = rs.getString("apellido");
                String cedula_ = rs.getString("cedula");
                String contacto_ = rs.getString("contacto");
                String direccion_ = rs.getString("direccion");
                String Email_ = rs.getString("email");
                String password_ = rs.getString("password");

                datos[0] = IdUsuarios;
                datos[1] = nombre_;
                datos[2] = apellido_;
                datos[3] = cedula_;
                datos[4] = contacto_;
                datos[5] = direccion_;
                datos[5] = Email_;
                datos[5] = password_;
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


