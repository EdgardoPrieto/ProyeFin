package View;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    int intentos;
    private Timer timer;
    private Connection connection;
    private final String url = "jdbc:mysql://localhost:3306/registros?useSSL=false&allowPublicKeyRetrieval=true"; 
    private final String user = "root";
    private final String password = "123456";

    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        timer = new Timer(1000, (ActionEvent e) -> {
            txtPassword.setEchoChar('*');
            timer.stop();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        jblUsuario = new javax.swing.JLabel();
        jblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jblUsuario1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jVista = new javax.swing.JLabel();
        btnSalirse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));

        Login.setBackground(new java.awt.Color(51, 51, 255));

        jblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jblUsuario.setText("Usuario:");

        jblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jblContraseña.setText("Contraseña:");

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jblUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jblUsuario1.setText("¿No te encuentras registrado? ");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        jLabel1.setAutoscrolls(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jVista.setBackground(new java.awt.Color(51, 255, 204));
        jVista.setForeground(new java.awt.Color(51, 255, 204));
        jVista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jVista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eye_vision_view_icon.png"))); // NOI18N
        jVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 204), new java.awt.Color(51, 255, 204), new java.awt.Color(51, 255, 204), new java.awt.Color(51, 255, 204)));
        jVista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jVista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jVistaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblContraseña))
                .addGap(40, 40, 40)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jVista, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                        .addComponent(jblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarse)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblContraseña)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVista, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarse)
                        .addGap(43, 43, 43))))
        );

        btnSalirse.setText("Salir");
        btnSalirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalirse, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSalirse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtUsuario.setText("");                   
        txtPassword.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

   
    
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        Registrarse re = new Registrarse();
        re.setVisible(true);
        re.setExtendedState(MAXIMIZED_BOTH);
        re.pack();
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String username = txtUsuario.getText();
        String password = new String(txtPassword.getPassword());

        if (isAdmin(username, password)) {
            LoginAdmin adminFrame = new LoginAdmin();
            adminFrame.setExtendedState(MAXIMIZED_BOTH);
            adminFrame.setLocationRelativeTo(null); 
            adminFrame.setVisible(true);
            this.dispose(); 

        } else {
            int userId = getUserId(username, password);
            if (userId != -1) {
                LoginUsuario userFrame = new LoginUsuario();
                userFrame.setExtendedState(MAXIMIZED_BOTH);
                userFrame.setVisible(true);
                this.dispose(); 

            } else if (intentos == 3) {
                JOptionPane.showMessageDialog(null, "Has excedido el número de intentos permitidos", "Verificar datos", JOptionPane.ERROR_MESSAGE);
                System.exit(0); 

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. \nQuedan " + (3 - intentos) + " intentos permitidos");
                txtUsuario.setText(""); 
                txtPassword.setText(""); 
                txtUsuario.requestFocus();
                intentos++;
            }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    
    private void jVistaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVistaMousePressed
        txtPassword.setEchoChar((char) 0);
        if (!timer.isRunning()) {
            timer.start();
        }
    }//GEN-LAST:event_jVistaMousePressed

        
    private void btnSalirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirseActionPerformed

    
    private boolean isAdmin(String username, String password) {
        String usuario = "admin";
        String Password = "root";
        return username.equals(usuario) && password.equals(Password);
    }
    
    
    private int getUserId(String nombre, String password) {
        try {
            connection = DriverManager.getConnection(url, user, this.password);
            String query = "SELECT id_usuarios FROM usuarios WHERE nombre =? AND password =?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nombre);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("id_usuarios");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return -1;
    }
    
    
    private void UserInfo(int userId) {                                         
        try {
            connection = DriverManager.getConnection(url, user, password);
            DefaultTableModel tableModel = new DefaultTableModel();             //Default almacena los datos recuperados de la BD y lo muestra en una tabla.
//            String query = "SELECT u.*, p.*, i.* FROM usuarios u "
//                    + "INNER JOIN personas p ON u.id = p.id "
//                    + "INNER JOIN ingresoYsalida i ON u.id = i.id "
//                    + "WHERE u.id = ?";
            String query = "SELECT u.id_usuarios, u.nombre AS 'Nombre Usuario', u.apellido AS 'Apellido Usuario', "
                    + "p.tipo_transporte, p.placa, p.color, p.marca, "
                    + "i.fecha, i.hora_entrada, i.hora_salida "
                    + "FROM usuarios u "
                    + "INNER JOIN personas p ON u.id = p.id "
                    + "INNER JOIN ingresoYsalida i ON u.id = i.id "
                    + "WHERE u.id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(metaData.getColumnLabel(i));
            }
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getObject(i);
                }
                tableModel.addRow(rowData);
            }

//Mostrar la tabla en una ventana (se crea la tabla para mostrar los datos(obtenidos por Default)
            JTable table = new JTable(tableModel);
            JFrame userInfoFrame = new JFrame("Informacion de usuario");
            userInfoFrame.add(new JScrollPane(table));
            userInfoFrame.setSize(800, 900);
            userInfoFrame.setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSalirse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jVista;
    private javax.swing.JLabel jblContraseña;
    private javax.swing.JLabel jblUsuario;
    private javax.swing.JLabel jblUsuario1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
