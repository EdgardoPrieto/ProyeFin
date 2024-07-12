package View;

import Controllers.*;
import Registro.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JFrameEntrada extends javax.swing.JFrame {

    public PertenenciasEntradaController controladorPertenencias;
    public IngresoPersonalController controladorIngresoYsalida;
    public DefaultTableModel tableModel;
    private int id;
    public boolean editing;
    public String header[] = {"id_pertenencias", "serial", "tipo_pertenencias", " id_persona"};
    public String headero[] = {"id", "fecha", " hora_entrada"};

    
    public JFrameEntrada() {
        initComponents();

//PERTENENCIAS
        editing = false;
        Object[][] content = null;
        this.controladorPertenencias = new PertenenciasEntradaController();
        content = controladorPertenencias.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, header);

//INGRESOS
        this.controladorIngresoYsalida = new IngresoPersonalController();
        content = controladorIngresoYsalida.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headero);
        //TotalPersonas.setModel(tableModel);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPertenencia = new javax.swing.JTextField();
        btnIngresarPertenencia = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenidos");

        jLabel2.setText("Numero de Serial");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Digite sus pertenencias de entrada");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setText("Pertenencia");

        btnIngresarPertenencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIngresarPertenencia.setText("Ingresar Pertenencia");
        btnIngresarPertenencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPertenenciaActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setText("Salir");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPertenencia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(242, 242, 242)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnIngresarPertenencia, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(214, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnIngresarPertenencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPertenencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnIngresarPertenenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPertenenciaActionPerformed
//Obtiene la fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String fechaActual = fechaHoraActual.format(formatterFecha);
        String horaActual = fechaHoraActual.format(formatterHora);

//Otros datos que quieres insertar
        String nombre = txtNombre.getText();
        String serial = txtSerial.getText();
        String tipo_pertenencias = txtPertenencia.getText();

//Obtener el ID de usuario   
    int id_persona = obtenerIdUsuario(nombre);
//Verificamos si el nombre no se encontró en la base de datos
    if (id_persona == -1) {
        JOptionPane.showMessageDialog(null, "Nombre no encontrado en la base de datos.", "Guardar pertenencias", JOptionPane.ERROR_MESSAGE);
    } else {
        // Insertamos los datos en la tabla y manejamos la respuesta como antes
        int resp = controladorPertenencias.insert(new PertenenciasEntrada(serial, tipo_pertenencias, id_persona));
        int respo = controladorIngresoYsalida.insert(new ingresoPersonal(fechaActual, horaActual, id_persona));
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error en el registro", "Guardar pertenencias", JOptionPane.ERROR_MESSAGE);
        } else {
            cleanDataTable();
            Object[][] content = controladorPertenencias.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, header);
            JOptionPane.showMessageDialog(null, "Pertenencia Registrada", "Guardar pertenencias", JOptionPane.INFORMATION_MESSAGE);
            this.txtSerial.setText("");
            this.txtPertenencia.setText("");
            this.txtNombre.setText("");
        }
    }
    }//GEN-LAST:event_btnIngresarPertenenciaActionPerformed


    
    private int obtenerIdUsuario(String nombre) {
        int id_persona = 0;
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/registros?useSSL=false&allowPublicKeyRetrieval=true", "root", "123456");
            PreparedStatement consulta = conexion.prepareStatement("SELECT id FROM personas WHERE nombre =?");
            consulta.setString(1, nombre);
            ResultSet resultado = consulta.executeQuery();

            if (resultado.next()) {
                id_persona = resultado.getInt("id");
                //PreparedStatement insertar = conexion.prepareStatement("INSERT INTO pertenencias (id_persona) VALUES (?)");
                //insertar.setInt(1, id_persona);
                //insertar.executeUpdate();
            } else {
                id_persona = -1;
            }
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id_persona;
    }
    
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose(); 
        Login log = new Login ();
        //log.setExtendedState(MAXIMIZED_BOTH);
        log.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed
      
    
    
    
    public void setId(int i) {
        this.id = i;
    }

    
    public int getId() {
        return this.id;
    }

    
    private void cleanDataTable() {
        Object[][] content = null;
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
    }

    
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFrameEntrada().setVisible(true);
//            }
//        });
//    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarPertenencia;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPertenencia;
    private javax.swing.JTextField txtSerial;
    // End of variables declaration//GEN-END:variables
}
