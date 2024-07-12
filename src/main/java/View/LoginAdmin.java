package View;

import Registro.*;
import Controllers.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class LoginAdmin extends javax.swing.JFrame {

    public PersonasController controladorPersona;
    public GeneralController controladorUsuario;
    public IngresoPersonalController controladorEntrada;
    public salidaPersonalController controladorSalida;
    public PertenenciasEntradaController controladorEpertenencias;
    public PertenenciasSalidaController controladorSpertenencias;
    public DefaultTableModel tableModel;
    private int id;
    public boolean editing;

    public String headere[] = {"id", "nombre", "apellido", "cedula", "contacto", "direccion", "email", "password"}; //Usuarios
    public String header[] = {"id", "nombre", "apellido", "cedula", "rol", " ficha_o_cFormacion", "tipo_transporte", "placa", "color", "marca"}; //Personas
    public String headero[] = {"id", "id_persona", "fecha", " hora_entrada"}; 
    public String headeri[] = {"id", "id_persona", "fecha", " hora_salida"};
    public String headera[] = {"id_pertenencias", "serial", "tipo_pertenencias", " id_persona"}; //Entrada Pertenencia
    public String headeraa[] = {"id_pertenencias", "serial", "tipo_pertenencias", "id_persona"}; //Salida Pertenencia

    
    public LoginAdmin() {
        initComponents();

//PERSONAS
        editing = false;
        Object[][] content = null;
        this.controladorPersona = new PersonasController();
        content = controladorPersona.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, header);
        JTableDatos.setModel(tableModel);
        //JTable table = new JTable(tableModel);

//USUARIOS
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setPreferredSize(screenSize);
        setSize(1200, 700);
        editing = false;
        this.controladorUsuario = new GeneralController();
        content = controladorUsuario.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headere);
        JTableDatos.setModel(tableModel);

//ENTRADAS(Horas)
        this.controladorEntrada = new IngresoPersonalController();
        content = controladorEntrada.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headero);
        JTableDatos.setModel(tableModel);

//SALIDAS       
        this.controladorSalida = new salidaPersonalController();
        content = controladorSalida.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headeri);
        JTableDatos.setModel(tableModel);

//PERTENENCIAS ENTRADAS       
        this.controladorEpertenencias = new PertenenciasEntradaController();
        content = controladorEpertenencias.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headera);
        JTableDatos.setModel(tableModel);

//PERTENENCIAS SALIDAS
        this.controladorSpertenencias = new PertenenciasSalidaController();
        content = controladorSpertenencias.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headeraa);
        JTableDatos.setModel(tableModel);
    }


    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane21 = new javax.swing.JScrollPane();
        jEditorPane6 = new javax.swing.JEditorPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnMostrarPersonas = new javax.swing.JButton();
        btnMostrarUsuarios = new javax.swing.JButton();
        btnMostrarEntradasSede = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableDatos = new javax.swing.JTable();
        btnMostrarSalidaSede = new javax.swing.JButton();
        btnMostrarEntradaPertenencias = new javax.swing.JButton();
        btnMostrarSalidaPertenencias = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        textId = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        textNombre = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        textApellido = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        textCedula = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        textRol = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        textFicha = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        textTransporte = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        textPlaca = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        textColor = new javax.swing.JTextPane();
        jScrollPane22 = new javax.swing.JScrollPane();
        textMarca = new javax.swing.JTextPane();
        btnInsertarPersona = new javax.swing.JButton();
        Txtid = new javax.swing.JScrollPane();
        txtId = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtApellido = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtnombre = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCedula = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtContacto = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtPassword = new javax.swing.JTextPane();
        btnInsertarUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextofechaEntradaSede = new javax.swing.JTextPane();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        TextoHoraIngresoSede = new javax.swing.JTextPane();
        btnIngresoSede = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane17 = new javax.swing.JScrollPane();
        IdEntradaSede = new javax.swing.JTextPane();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        IdSalidaSede = new javax.swing.JTextPane();
        jScrollPane34 = new javax.swing.JScrollPane();
        TextofechaSalidaSede = new javax.swing.JTextPane();
        jScrollPane45 = new javax.swing.JScrollPane();
        TextoHoraSalidaSede = new javax.swing.JTextPane();
        jLabel64 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane49 = new javax.swing.JScrollPane();
        IdPertenenciasEntrada = new javax.swing.JTextPane();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane50 = new javax.swing.JScrollPane();
        TipoPertenenciaEntrada = new javax.swing.JTextPane();
        jScrollPane51 = new javax.swing.JScrollPane();
        SerialEntradaPerte = new javax.swing.JTextPane();
        jScrollPane52 = new javax.swing.JScrollPane();
        IdPertenenciasSalida = new javax.swing.JTextPane();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane53 = new javax.swing.JScrollPane();
        SerialSalidaPerte = new javax.swing.JTextPane();
        jScrollPane54 = new javax.swing.JScrollPane();
        TipoPertenenciaSalida = new javax.swing.JTextPane();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel72 = new javax.swing.JLabel();
        btnSalidaSede = new javax.swing.JButton();
        btnEntradaPertenencias = new javax.swing.JButton();
        btnSalidaPertenencias = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        NombreEditar = new javax.swing.JTextPane();
        jScrollPane27 = new javax.swing.JScrollPane();
        DireccionEditar = new javax.swing.JTextPane();
        jScrollPane28 = new javax.swing.JScrollPane();
        ContactoEditar = new javax.swing.JTextPane();
        jScrollPane29 = new javax.swing.JScrollPane();
        EmailEditar = new javax.swing.JTextPane();
        jScrollPane30 = new javax.swing.JScrollPane();
        PasswordEditar = new javax.swing.JTextPane();
        jScrollPane31 = new javax.swing.JScrollPane();
        ApellidoEditar = new javax.swing.JTextPane();
        jScrollPane32 = new javax.swing.JScrollPane();
        IdentificacionEditar = new javax.swing.JTextPane();
        jLabel29 = new javax.swing.JLabel();
        btnEditarUsuario = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txId = new javax.swing.JScrollPane();
        IdEdita = new javax.swing.JTextPane();
        jScrollPane35 = new javax.swing.JScrollPane();
        NombreEdita = new javax.swing.JTextPane();
        jScrollPane36 = new javax.swing.JScrollPane();
        ApellidoEdita = new javax.swing.JTextPane();
        txCedula = new javax.swing.JScrollPane();
        CedulaEdita = new javax.swing.JTextPane();
        jScrollPane38 = new javax.swing.JScrollPane();
        FichaEdita = new javax.swing.JTextPane();
        jScrollPane39 = new javax.swing.JScrollPane();
        PlacaEdita = new javax.swing.JTextPane();
        jScrollPane40 = new javax.swing.JScrollPane();
        RolEdita = new javax.swing.JTextPane();
        jScrollPane41 = new javax.swing.JScrollPane();
        TransporteEdita = new javax.swing.JTextPane();
        jScrollPane42 = new javax.swing.JScrollPane();
        MarcaEdita = new javax.swing.JTextPane();
        jScrollPane43 = new javax.swing.JScrollPane();
        ColorEdita = new javax.swing.JTextPane();
        btnEditarPersona = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane44 = new javax.swing.JScrollPane();
        editarFechaIngresoSede = new javax.swing.JTextPane();
        jScrollPane46 = new javax.swing.JScrollPane();
        idEditarIngresoSede = new javax.swing.JTextPane();
        jScrollPane47 = new javax.swing.JScrollPane();
        salidaEdit = new javax.swing.JTextPane();
        jScrollPane48 = new javax.swing.JScrollPane();
        entradaEdit = new javax.swing.JTextPane();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        IdEditar = new javax.swing.JTextPane();
        btnEditarIngresoSede = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jScrollPane55 = new javax.swing.JScrollPane();
        idEditarSalidaSede = new javax.swing.JTextPane();
        jScrollPane56 = new javax.swing.JScrollPane();
        editarFechaSalidaSede = new javax.swing.JTextPane();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane57 = new javax.swing.JScrollPane();
        idEditarEntradaPertenencia = new javax.swing.JTextPane();
        jScrollPane58 = new javax.swing.JScrollPane();
        EditarSerialEntrada = new javax.swing.JTextPane();
        jScrollPane59 = new javax.swing.JScrollPane();
        EditarTipoPerteEntrada = new javax.swing.JTextPane();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel87 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jScrollPane60 = new javax.swing.JScrollPane();
        idEditarSalidaPertenencia = new javax.swing.JTextPane();
        jScrollPane61 = new javax.swing.JScrollPane();
        EditarSerialSalida = new javax.swing.JTextPane();
        jScrollPane62 = new javax.swing.JScrollPane();
        EditarTipoPerteSalida = new javax.swing.JTextPane();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        btnEditarSalidaSede = new javax.swing.JButton();
        btnEditarIngresoPertenencia = new javax.swing.JButton();
        btnEditarSalidaPertenencia = new javax.swing.JButton();
        jScrollPane63 = new javax.swing.JScrollPane();
        idPersonaEditarIngresoSede = new javax.swing.JTextPane();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane64 = new javax.swing.JScrollPane();
        idPersonaEditarSalidaSede = new javax.swing.JTextPane();
        jLabel90 = new javax.swing.JLabel();
        jScrollPane65 = new javax.swing.JScrollPane();
        idPersonaEditarEntradaPerte = new javax.swing.JTextPane();
        jLabel91 = new javax.swing.JLabel();
        jScrollPane66 = new javax.swing.JScrollPane();
        idPersonaEditarSalidaPerte = new javax.swing.JTextPane();
        jLabel92 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBorrarUsuario = new javax.swing.JButton();
        btnBorrarPersona = new javax.swing.JButton();
        BtnBorrarIngresoSede = new javax.swing.JButton();
        jScrollPanePersona = new javax.swing.JScrollPane();
        textIdPersona = new javax.swing.JTextPane();
        jScrollPaneIngresosySalidas = new javax.swing.JScrollPane();
        textIdIngresoSede = new javax.swing.JTextPane();
        jScrollPaneIdUsuario = new javax.swing.JScrollPane();
        textIdUsuario = new javax.swing.JTextPane();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jScrollPaneIngresosySalidas1 = new javax.swing.JScrollPane();
        textIdSalidaSede = new javax.swing.JTextPane();
        jLabel74 = new javax.swing.JLabel();
        BtnBorrarSalidaSede = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPaneIngresosySalidas2 = new javax.swing.JScrollPane();
        textIdEntradaPertenencia = new javax.swing.JTextPane();
        jLabel77 = new javax.swing.JLabel();
        jScrollPaneIngresosySalidas3 = new javax.swing.JScrollPane();
        textIdSalidaPertenencia = new javax.swing.JTextPane();
        jLabel78 = new javax.swing.JLabel();
        BtnBorrarEntradaPertenencias = new javax.swing.JButton();
        BtnBorrarSalidaPertenencias = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jScrollPane21.setViewportView(jEditorPane6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnMostrarPersonas.setText("Personas");
        btnMostrarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPersonasActionPerformed(evt);
            }
        });

        btnMostrarUsuarios.setText("Usuarios");
        btnMostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUsuariosActionPerformed(evt);
            }
        });

        btnMostrarEntradasSede.setText("Ingresos a la sede");
        btnMostrarEntradasSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEntradasSedeActionPerformed(evt);
            }
        });

        JTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JTableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableDatosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTableDatosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(JTableDatos);

        btnMostrarSalidaSede.setText("Salidas de la sede");
        btnMostrarSalidaSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSalidaSedeActionPerformed(evt);
            }
        });

        btnMostrarEntradaPertenencias.setText("Entrada Pertenencias");
        btnMostrarEntradaPertenencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEntradaPertenenciasActionPerformed(evt);
            }
        });

        btnMostrarSalidaPertenencias.setText("Salida Pertenencias");
        btnMostrarSalidaPertenencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSalidaPertenenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarEntradasSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarEntradaPertenencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarSalidaSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarSalidaPertenencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnMostrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnMostrarPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnMostrarEntradasSede, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnMostrarSalidaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnMostrarEntradaPertenencias)
                        .addGap(31, 31, 31)
                        .addComponent(btnMostrarSalidaPertenencias))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mostrar", jPanel2);

        jScrollPane11.setViewportView(textId);

        jScrollPane12.setViewportView(textNombre);

        jScrollPane13.setViewportView(textApellido);

        jScrollPane14.setViewportView(textCedula);

        jScrollPane15.setViewportView(textRol);

        jScrollPane16.setViewportView(textFicha);

        jScrollPane18.setViewportView(textTransporte);

        jScrollPane19.setViewportView(textPlaca);

        jScrollPane20.setViewportView(textColor);

        jScrollPane22.setViewportView(textMarca);

        btnInsertarPersona.setBackground(new java.awt.Color(204, 255, 255));
        btnInsertarPersona.setText("Guardar");
        btnInsertarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarPersonaActionPerformed(evt);
            }
        });

        Txtid.setViewportView(txtId);

        jScrollPane4.setViewportView(txtApellido);

        jScrollPane5.setViewportView(txtnombre);

        jScrollPane6.setViewportView(txtCedula);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Persona");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Usuario");

        jScrollPane7.setViewportView(txtContacto);

        jScrollPane8.setViewportView(txtDireccion);

        jScrollPane9.setViewportView(txtEmail);

        jScrollPane10.setViewportView(txtPassword);

        btnInsertarUsuario.setBackground(new java.awt.Color(204, 255, 255));
        btnInsertarUsuario.setText("Guardar");
        btnInsertarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        jLabel6.setText("N° Identificacion");

        jLabel7.setText("Contacto");

        jLabel8.setText("Direccion");

        jLabel9.setText("Email");

        jLabel10.setText("Contraseña");

        jLabel11.setText("ID");

        jLabel12.setText("Nombre");

        jLabel13.setText("Apellido");

        jLabel14.setText("N° Identificacion");

        jLabel15.setText("Rol");

        jLabel16.setText("Ficha o Centro");

        jLabel19.setText("Tipo de Transporte");

        jLabel20.setText("Placa");

        jLabel21.setText("Color");

        jLabel22.setText("Marca");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Ingresos a la sede");

        jLabel25.setText("ID");

        jLabel24.setText("Fecha");

        jScrollPane2.setViewportView(TextofechaEntradaSede);

        jLabel26.setText("Hora de Ingreso");

        jScrollPane23.setViewportView(TextoHoraIngresoSede);

        btnIngresoSede.setBackground(new java.awt.Color(204, 255, 255));
        btnIngresoSede.setText("Guardar");
        btnIngresoSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoSedeActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 255, 255));

        jScrollPane17.setViewportView(IdEntradaSede);

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel60.setText("Salidas de la sede");

        jLabel62.setText("ID");

        jLabel63.setText("Fecha");

        jScrollPane33.setViewportView(IdSalidaSede);

        jScrollPane34.setViewportView(TextofechaSalidaSede);

        jScrollPane45.setViewportView(TextoHoraSalidaSede);

        jLabel64.setText("Hora de Salida");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setText("Entrada de Pertenencias");

        jScrollPane49.setViewportView(IdPertenenciasEntrada);

        jLabel66.setText("ID");

        TipoPertenenciaEntrada.setPreferredSize(new java.awt.Dimension(65, 20));
        jScrollPane50.setViewportView(TipoPertenenciaEntrada);

        jScrollPane51.setViewportView(SerialEntradaPerte);

        jScrollPane52.setViewportView(IdPertenenciasSalida);

        jLabel67.setText("Serial");

        jLabel68.setText("Tipo de Pertenencia");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel69.setText("Salida de Pertenencias");

        jLabel70.setText("ID");

        jLabel71.setText("Serial");

        jScrollPane53.setViewportView(SerialSalidaPerte);

        TipoPertenenciaSalida.setPreferredSize(new java.awt.Dimension(65, 20));
        jScrollPane54.setViewportView(TipoPertenenciaSalida);

        jLabel72.setText("Tipo de Pertenencia");

        btnSalidaSede.setBackground(new java.awt.Color(204, 255, 255));
        btnSalidaSede.setText("Guardar");
        btnSalidaSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaSedeActionPerformed(evt);
            }
        });

        btnEntradaPertenencias.setBackground(new java.awt.Color(204, 255, 255));
        btnEntradaPertenencias.setText("Guardar");
        btnEntradaPertenencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaPertenenciasActionPerformed(evt);
            }
        });

        btnSalidaPertenencias.setBackground(new java.awt.Color(204, 255, 255));
        btnSalidaPertenencias.setText("Guardar");
        btnSalidaPertenencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaPertenenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsertarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addComponent(jSeparator4)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnEntradaPertenencias, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane54)
                                                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSalidaPertenencias, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalidaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInsertarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIngresoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel63)
                                .addComponent(jLabel62))
                            .addComponent(jLabel64))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSalidaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEntradaPertenencias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSalidaPertenencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Insertar", jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(1321, 570));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Usuario");

        jScrollPane26.setViewportView(NombreEditar);

        jScrollPane27.setViewportView(DireccionEditar);

        jScrollPane28.setViewportView(ContactoEditar);

        jScrollPane29.setViewportView(EmailEditar);

        jScrollPane30.setViewportView(PasswordEditar);

        jScrollPane31.setViewportView(ApellidoEditar);

        jScrollPane32.setViewportView(IdentificacionEditar);

        jLabel29.setText("ID");

        btnEditarUsuario.setBackground(new java.awt.Color(204, 255, 255));
        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        jLabel30.setText("Nombre");

        jLabel31.setText("Apellido");

        jLabel32.setText("N° Identificacion");

        jLabel33.setText("Contacto");

        jLabel34.setText("Direccion");

        jLabel35.setText("Email");

        jLabel36.setText("Contraseña");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Personas");

        txId.setViewportView(IdEdita);

        jScrollPane35.setViewportView(NombreEdita);

        jScrollPane36.setViewportView(ApellidoEdita);

        txCedula.setViewportView(CedulaEdita);

        jScrollPane38.setViewportView(FichaEdita);

        jScrollPane39.setViewportView(PlacaEdita);

        jScrollPane40.setViewportView(RolEdita);

        jScrollPane41.setViewportView(TransporteEdita);

        jScrollPane42.setViewportView(MarcaEdita);

        jScrollPane43.setViewportView(ColorEdita);

        btnEditarPersona.setBackground(new java.awt.Color(204, 255, 255));
        btnEditarPersona.setText("Editar");
        btnEditarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPersonaActionPerformed(evt);
            }
        });

        jLabel38.setText("ID");

        jLabel39.setText("Nombre");

        jLabel40.setText("Apellido");

        jLabel41.setText("N° Identificacion");

        jLabel42.setText("Rol");

        jLabel43.setText("Tipo de Transporte");

        jLabel45.setText("Placa");

        jLabel46.setText("Ficha o Centro ");

        jLabel47.setText("Marca");

        jLabel48.setText("Color");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setText("Ingresos a la sede");

        jScrollPane44.setViewportView(editarFechaIngresoSede);

        jScrollPane46.setViewportView(idEditarIngresoSede);

        salidaEdit.setMinimumSize(new java.awt.Dimension(65, 20));
        salidaEdit.setPreferredSize(new java.awt.Dimension(65, 20));
        jScrollPane47.setViewportView(salidaEdit);

        entradaEdit.setMinimumSize(new java.awt.Dimension(65, 20));
        entradaEdit.setPreferredSize(new java.awt.Dimension(65, 20));
        jScrollPane48.setViewportView(entradaEdit);

        jLabel50.setText("ID");

        jLabel51.setText("Fecha");

        jLabel52.setText("Hora de Entrada");

        jLabel53.setText("Hora de Salida");

        jScrollPane37.setViewportView(IdEditar);

        btnEditarIngresoSede.setBackground(new java.awt.Color(204, 255, 255));
        btnEditarIngresoSede.setText("Editar");
        btnEditarIngresoSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarIngresoSedeActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(204, 255, 255));

        jSeparator9.setBackground(new java.awt.Color(204, 255, 255));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel79.setText("Salidas de la sede");

        jLabel80.setText("ID");

        jScrollPane55.setViewportView(idEditarSalidaSede);

        jScrollPane56.setViewportView(editarFechaSalidaSede);

        jLabel81.setText("Fecha");

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel82.setText("Salida de Pertenencias");

        jLabel83.setText("ID");

        jScrollPane57.setViewportView(idEditarEntradaPertenencia);

        jScrollPane58.setViewportView(EditarSerialEntrada);

        jScrollPane59.setViewportView(EditarTipoPerteEntrada);

        jLabel84.setText("Serial ");

        jLabel85.setText("Tipo de pertenencia");

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel86.setText("Entrada de Pertenencias");

        jLabel87.setText("ID");

        jSeparator12.setBackground(new java.awt.Color(204, 255, 255));

        jScrollPane60.setViewportView(idEditarSalidaPertenencia);

        jScrollPane61.setViewportView(EditarSerialSalida);

        jScrollPane62.setViewportView(EditarTipoPerteSalida);

        jLabel88.setText("Serial ");

        jLabel89.setText("Tipo de pertenencia");

        btnEditarSalidaSede.setBackground(new java.awt.Color(204, 255, 255));
        btnEditarSalidaSede.setText("Editar");
        btnEditarSalidaSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSalidaSedeActionPerformed(evt);
            }
        });

        btnEditarIngresoPertenencia.setBackground(new java.awt.Color(204, 255, 255));
        btnEditarIngresoPertenencia.setText("Editar");
        btnEditarIngresoPertenencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarIngresoPertenenciaActionPerformed(evt);
            }
        });

        btnEditarSalidaPertenencia.setBackground(new java.awt.Color(204, 255, 255));
        btnEditarSalidaPertenencia.setText("Editar");
        btnEditarSalidaPertenencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSalidaPertenenciaActionPerformed(evt);
            }
        });

        jScrollPane63.setViewportView(idPersonaEditarIngresoSede);

        jLabel61.setText("ID_Persona");

        jScrollPane64.setViewportView(idPersonaEditarSalidaSede);

        jLabel90.setText("ID_Persona");

        jScrollPane65.setViewportView(idPersonaEditarEntradaPerte);

        jLabel91.setText("ID_Persona");

        jScrollPane66.setViewportView(idPersonaEditarSalidaPerte);

        jLabel92.setText("ID_Persona");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditarIngresoPertenencia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel43)
                                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel45))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(btnEditarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel30)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel31))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel33)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarSalidaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel51))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarIngresoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane62)
                            .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarSalidaPertenencia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel46)
                    .addComponent(jLabel43)
                    .addComponent(jLabel45)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52)
                        .addComponent(jLabel61))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50)
                        .addComponent(jLabel51)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditarIngresoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jLabel53)
                    .addComponent(jLabel81)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditarSalidaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(jLabel84))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel85))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarIngresoPertenencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(jLabel88)
                            .addComponent(jLabel89)
                            .addComponent(jLabel92))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEditarSalidaPertenencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar", jPanel4);

        btnBorrarUsuario.setText("Borrar");
        btnBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUsuarioActionPerformed(evt);
            }
        });

        btnBorrarPersona.setText("Borrar");
        btnBorrarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPersonaActionPerformed(evt);
            }
        });

        BtnBorrarIngresoSede.setText("Borrar");
        BtnBorrarIngresoSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarIngresoSedeActionPerformed(evt);
            }
        });

        jScrollPanePersona.setViewportView(textIdPersona);

        jScrollPaneIngresosySalidas.setViewportView(textIdIngresoSede);

        jScrollPaneIdUsuario.setViewportView(textIdUsuario);

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("Persona");

        jLabel55.setText("ID");

        jLabel56.setText("ID");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Usuario");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("Ingreso a la sede");

        jLabel59.setText("ID");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel73.setText("Salida de la sede");

        jScrollPaneIngresosySalidas1.setViewportView(textIdSalidaSede);

        jLabel74.setText("ID");

        BtnBorrarSalidaSede.setText("Borrar");
        BtnBorrarSalidaSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarSalidaSedeActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel75.setText("Entrada de pertenencia");

        jLabel76.setText("ID");

        jScrollPaneIngresosySalidas2.setViewportView(textIdEntradaPertenencia);

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel77.setText("Salida de pertenencia");

        jScrollPaneIngresosySalidas3.setViewportView(textIdSalidaPertenencia);

        jLabel78.setText("ID");

        BtnBorrarEntradaPertenencias.setText("Borrar");
        BtnBorrarEntradaPertenencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarEntradaPertenenciasActionPerformed(evt);
            }
        });

        BtnBorrarSalidaPertenencias.setText("Borrar");
        BtnBorrarSalidaPertenencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarSalidaPertenenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPaneIdUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(jScrollPanePersona, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPaneIngresosySalidas, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPaneIngresosySalidas1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPaneIngresosySalidas2)
                        .addComponent(jScrollPaneIngresosySalidas3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBorrarIngresoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBorrarSalidaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnBorrarEntradaPertenencias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBorrarSalidaPertenencias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 728, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPanePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBorrarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneIngresosySalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrarIngresoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneIngresosySalidas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrarSalidaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneIngresosySalidas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrarEntradaPertenencias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneIngresosySalidas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrarSalidaPertenencias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Borrar", jPanel1);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        Login log = new Login();
        log.setVisible(true);
        //        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresoSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoSedeActionPerformed
        int resp = 0;
        int id_persona;
        if (IdEntradaSede.getText().equals("")) {
            id_persona = 0;
        } else {
            id_persona = Integer.parseInt(IdEntradaSede.getText());
        }

        String fecha = TextofechaEntradaSede.getText();
        String hora_entrada = TextoHoraIngresoSede.getText();

        if (id_persona == 0 || TextofechaEntradaSede.getText().equals("") || TextoHoraIngresoSede.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "Guardar registro", JOptionPane.ERROR_MESSAGE);
        } else {
            resp = controladorEntrada.insert(new ingresoPersonal(id_persona, fecha, hora_entrada));
            if (resp == 0) {
                JOptionPane.showMessageDialog(null, "Error en el registro de ingreso", "Guardar registro", JOptionPane.ERROR_MESSAGE);
                this.IdEntradaSede.setText("");
                this.TextofechaEntradaSede.setText("");
                this.TextoHoraIngresoSede.setText("");
            } else {
                cleanDataTable();
                Object[][] content = controladorEntrada.loadDataforTableModel();
                tableModel = new DefaultTableModel(content, header);
                JTableDatos.setModel(tableModel);
                JOptionPane.showMessageDialog(null, "Ingreso a la sede guardada correctamente", "Guardar registro", JOptionPane.INFORMATION_MESSAGE);
                    this.IdEntradaSede.setText("");
                    this.TextofechaEntradaSede.setText("");
                    this.TextoHoraIngresoSede.setText("");
            }
        }

        //        int idPersona = Integer.parseInt(TextoId.getText());
        //        String fecha = TextoFecha.getText();
        //        String hora_entrada = TextoHoraIngreso.getText();
        //        String hora_salida = TextoHoraSalida.getText();
        //
        //        int resp = controladorHoras.insert(new IngresoYsalida(id_persona, fecha, hora_entrada, hora_salida));
        //        if (resp == 0) {
            //            JOptionPane.showMessageDialog(null, "Error en el registro del cliente", "Guardar cliente", JOptionPane.ERROR_MESSAGE);
            //        } else {
            //            cleanDataTable();
            //            Object[][] content = controladorHoras.loadDataforTableModel();
            //            tableModel = new DefaultTableModel(content, header);
            //            JTableDatos.setModel(tableModel);
            //            JOptionPane.showMessageDialog(null, "Registro de cliente exitoso", "Guardar cliente", JOptionPane.INFORMATION_MESSAGE);
            //        }
    }//GEN-LAST:event_btnIngresoSedeActionPerformed

    
    
    private void btnInsertarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarUsuarioActionPerformed
        int resp = 0;
        int id_usuarios;
        if (txtId.getText().equals("")) {
            id_usuarios = 0;
        } else {
            id_usuarios = Integer.parseInt(txtId.getText());
        }

        String nombre = txtnombre.getText();
        String apellido = txtApellido.getText();
        String cedula = txtCedula.getText();
        String contacto = txtContacto.getText();
        String direccion = txtDireccion.getText();
        String Email = txtEmail.getText();
        String password = txtPassword.getText();

        if (id_usuarios == 0 || txtnombre.getText().equals("") || txtApellido.getText().equals("")
            || txtCedula.getText().equals("") || txtContacto.getText().equals("") || txtDireccion.getText().equals("")
            || txtEmail.getText().equals("") || txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "Guardar usuario", JOptionPane.ERROR_MESSAGE);
        } else {
            resp = controladorUsuario.insert(new Usuarios(id_usuarios, nombre, apellido, cedula, contacto, direccion, Email, password));
            if (resp == 0) {
                JOptionPane.showMessageDialog(null, "Error en el registro del usuario", "Guardar usuario", JOptionPane.ERROR_MESSAGE);
                this.txtId.setText("");
                this.txtnombre.setText("");
                this.txtApellido.setText("");
                this.txtCedula.setText("");
                this.txtContacto.setText("");
                this.txtDireccion.setText("");
                this.txtEmail.setText("");
                this.txtPassword.setText("");
            } else {
                cleanDataTable();
                Object[][] content = controladorUsuario.loadDataforTableModel();
                tableModel = new DefaultTableModel(content, header);
                JTableDatos.setModel(tableModel);
                JOptionPane.showMessageDialog(null, "Registro de usuario exitoso", "Guardar usuario", JOptionPane.INFORMATION_MESSAGE);
                this.txtId.setText("");
                this.txtnombre.setText("");
                this.txtApellido.setText("");
                this.txtCedula.setText("");
                this.txtContacto.setText("");
                this.txtDireccion.setText("");
                this.txtEmail.setText("");
                this.txtPassword.setText("");
            }
        }
    }//GEN-LAST:event_btnInsertarUsuarioActionPerformed

    private void btnInsertarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPersonaActionPerformed
        int resp = 0;
        int id;
        if (textId.getText().equals("")) {
            id = 0;
        } else {
            id = Integer.parseInt(textId.getText());
        }

        String nombre = textNombre.getText();
        String apellido = textApellido.getText();
        String cedula = textCedula.getText();
        String rol = textRol.getText();
        String ficha_o_cFormacion = textFicha.getText();
        String tipo_transporte = textTransporte.getText();
        String placa = textPlaca.getText();
        String color = textColor.getText();
        String marca = textMarca.getText();

        if (id == 0 || textNombre.getText().equals("") || textApellido.getText().equals("")
            || textCedula.getText().equals("") || textRol.getText().equals("") || textFicha.getText().equals("")
            || textTransporte.getText().equals("") || textPlaca.getText().equals("")
            || textColor.getText().equals("") || textMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "Guardar persona", JOptionPane.ERROR_MESSAGE);
                this.textId.setText("");
                this.textNombre.setText("");
                this.textApellido.setText("");
                this.textCedula.setText("");
                this.textRol.setText("");
                this.textFicha.setText("");
                this.textTransporte.setText("");
                this.textPlaca.setText("");
                this.textColor.setText("");
                this.textMarca.setText("");
        } else {
            resp = controladorPersona.insert(new Personas(id, nombre, apellido, cedula, rol, ficha_o_cFormacion, tipo_transporte, placa, color, marca));
            if (resp == 0) {
                JOptionPane.showMessageDialog(null, "Error en el registro del persona", "Guardar persona", JOptionPane.ERROR_MESSAGE);
                this.textId.setText("");
                this.textNombre.setText("");
                this.textApellido.setText("");
                this.textCedula.setText("");
                this.textRol.setText("");
                this.textFicha.setText("");
                this.textTransporte.setText("");
                this.textPlaca.setText("");
                this.textColor.setText("");
                this.textMarca.setText("");
            } else {
                cleanDataTable();
                Object[][] content = controladorPersona.loadDataforTableModel();
                tableModel = new DefaultTableModel(content, header);
                JTableDatos.setModel(tableModel);
                //textId.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Registro de persona exitoso", "Guardar persona", JOptionPane.INFORMATION_MESSAGE);
                this.textId.setText("");
                this.textNombre.setText("");
                this.textApellido.setText("");
                this.textCedula.setText("");
                this.textRol.setText("");
                this.textFicha.setText("");
                this.textTransporte.setText("");
                this.textPlaca.setText("");
                this.textColor.setText("");
                this.textMarca.setText("");
            }
        }
    }//GEN-LAST:event_btnInsertarPersonaActionPerformed

    
    
    
    private void btnEditarIngresoSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarIngresoSedeActionPerformed
        int resp = 0;
        int id = Integer.parseInt(idEditarIngresoSede.getText());
        String fecha = editarFechaIngresoSede.getText();
        String hora_entrada = entradaEdit.getText();
        int id_persona = Integer.parseInt(idPersonaEditarIngresoSede.getText()); 


        resp = controladorEntrada.edit(new ingresoPersonal(id, fecha, hora_entrada, id_persona));
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error en el editar", "Guardar editar", JOptionPane.ERROR_MESSAGE);
        } else {
            cleanDataTable();
            Object[][] content = controladorEntrada.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, header);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Editado correctamente", "Guardar editar", JOptionPane.INFORMATION_MESSAGE);
                this.idEditarIngresoSede.setText("");
                this.editarFechaIngresoSede.setText("");
                this.entradaEdit.setText("");
                this.idPersonaEditarIngresoSede.setText("");
        }
    }//GEN-LAST:event_btnEditarIngresoSedeActionPerformed
    
    private void btnEditarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPersonaActionPerformed
        int resp = 0;
        int id = Integer.parseInt(IdEdita.getText());
        String nombre = NombreEdita.getText();
        String apellido = ApellidoEdita.getText();
        String cedula = CedulaEdita.getText();
        String rol = RolEdita.getText();
        String ficha_o_cFormacion = FichaEdita.getText();
        String tipo_transporte = TransporteEdita.getText();
        String placa = PlacaEdita.getText();
        String color = ColorEdita.getText();
        String marca = MarcaEdita.getText();

        resp = controladorPersona.edit(new Personas(id, nombre, apellido, cedula, rol, ficha_o_cFormacion, tipo_transporte, placa, color, marca));
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error en el editar de persona", "Guardar persona", JOptionPane.ERROR_MESSAGE);
        } else {
            cleanDataTable();
            Object[][] content = controladorPersona.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, header);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Editado correctamente", "Guardar persona", JOptionPane.INFORMATION_MESSAGE);
                this.IdEdita.setText("");
                this.NombreEdita.setText("");
                this.ApellidoEdita.setText("");
                this.CedulaEdita.setText("");
                this.RolEdita.setText("");
                this.FichaEdita.setText("");
                this.TransporteEdita.setText("");
                this.PlacaEdita.setText("");
                this.ColorEdita.setText("");
                this.MarcaEdita.setText("");
        }
    }//GEN-LAST:event_btnEditarPersonaActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        int resp = 0;
        int id = Integer.parseInt(IdEditar.getText());
        String nombre = NombreEditar.getText();
        String apellido = ApellidoEditar.getText();
        String cedula = IdentificacionEditar.getText();
        String contacto = ContactoEditar.getText();
        String direccion = DireccionEditar.getText();
        String Email = EmailEditar.getText();
        String password = PasswordEditar.getText();

        resp = controladorUsuario.edit(new Usuarios(id, nombre, apellido, cedula, contacto, direccion, Email, password));
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error en el edit del usuario", "Guardar usuario", JOptionPane.ERROR_MESSAGE);
        } else {
            cleanDataTable();
            Object[][] content = controladorUsuario.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, headere);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Editado correctamente", "Guardar usuario", JOptionPane.INFORMATION_MESSAGE);
                this.IdEditar.setText("");
                this.NombreEditar.setText("");
                this.ApellidoEditar.setText("");
                this.IdentificacionEditar.setText("");
                this.ContactoEditar.setText("");
                this.DireccionEditar.setText("");
                this.EmailEditar.setText("");
                this.PasswordEditar.setText("");     
        }
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    
    
    
    private void BtnBorrarIngresoSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarIngresoSedeActionPerformed
        int resp = 0;
        int id = Integer.parseInt(textIdIngresoSede.getText());
        resp = controladorEntrada.delete(id);
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error al borrar", "Guardar cliente", JOptionPane.ERROR_MESSAGE);
            this.textIdIngresoSede.setText("");
        } else {
            cleanDataTable();
            Object[][] content = controladorEntrada.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, headero);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Borrado correctamente", "Guardar cliente", JOptionPane.INFORMATION_MESSAGE);
            this.textIdIngresoSede.setText("");
        }
    }//GEN-LAST:event_BtnBorrarIngresoSedeActionPerformed

    private void btnBorrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPersonaActionPerformed
        int resp = 0;
        int id = Integer.parseInt(textIdPersona.getText());
        resp = controladorPersona.delete(id);
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error al borrar", "Guardar persona", JOptionPane.ERROR_MESSAGE);
            this.textIdPersona.setText("");
        } else {
            cleanDataTable();
            Object[][] content = controladorPersona.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, header);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Borrado correctamente", "Guardar persona", JOptionPane.INFORMATION_MESSAGE);
            this.textIdPersona.setText("");
        }
    }//GEN-LAST:event_btnBorrarPersonaActionPerformed

    private void btnBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUsuarioActionPerformed
        int resp = 0;
        int id = Integer.parseInt(textIdUsuario.getText());
        resp = controladorUsuario.delete(id);
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error al borrar", "Guardar usuario", JOptionPane.ERROR_MESSAGE);
            this.textIdUsuario.setText("");
        } else {
            cleanDataTable();
            Object[][] content = controladorUsuario.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, headere);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Borrado correctamente", "Guardar usuario", JOptionPane.INFORMATION_MESSAGE);
            this.textIdUsuario.setText("");
        }
    }//GEN-LAST:event_btnBorrarUsuarioActionPerformed

    
    
   
    private void btnMostrarSalidaPertenenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSalidaPertenenciasActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
        editing = false;
        Object[][] content = null;
        this.controladorSpertenencias = new PertenenciasSalidaController();
        content = controladorSpertenencias.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headeraa);
        JTableDatos.setModel(tableModel);
    }//GEN-LAST:event_btnMostrarSalidaPertenenciasActionPerformed

    private void btnMostrarEntradaPertenenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEntradaPertenenciasActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
        editing = false;
        Object[][] content = null;
        this.controladorEpertenencias = new PertenenciasEntradaController();
        content = controladorEpertenencias.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headera);
        JTableDatos.setModel(tableModel);
    }//GEN-LAST:event_btnMostrarEntradaPertenenciasActionPerformed

    private void btnMostrarSalidaSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSalidaSedeActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
        editing = false;
        Object[][] content = null;
        this.controladorSalida = new salidaPersonalController();
        content = controladorSalida.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headeri);
        JTableDatos.setModel(tableModel);
    }//GEN-LAST:event_btnMostrarSalidaSedeActionPerformed


    
    private void JTableDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableDatosMousePressed
//        int selectedRow = JTableDatos.getSelectedRow();             //devuelve el índice de la fila seleccionada actualmente en la tabla.  
//        if (selectedRow == -1) {                                    //Si no hay ninguna fila seleccionada, devuelve -1.
//            return;
//        }

////MOSTRAR PERSONA
//        Object id = JTableDatos.getValueAt(selectedRow, 0);
//        Object nombres = JTableDatos.getValueAt(selectedRow, 1);
//        Object apellidos = JTableDatos.getValueAt(selectedRow, 2);
//        Object cedulas = JTableDatos.getValueAt(selectedRow, 3);
//        Object rol = JTableDatos.getValueAt(selectedRow, 4);
//        Object ficha = JTableDatos.getValueAt(selectedRow, 5);
//        Object transporte = JTableDatos.getValueAt(selectedRow, 6);
//        Object placa = JTableDatos.getValueAt(selectedRow, 7);
//        Object color = JTableDatos.getValueAt(selectedRow, 8);
//        Object marca = JTableDatos.getValueAt(selectedRow, 9);
//
//        IdEdita.setText(ide.toString());
//        NombreEdita.setText(nombres.toString());
//        ApellidoEdita.setText(apellidos.toString());
//        CedulaEdita.setText(cedulas.toString());
//        RolEdita.setText(rol.toString());
//        FichaEdita.setText(ficha.toString());
//        TransporteEdita.setText(transporte.toString());
//        PlacaEdita.setText(placa.toString());
//        ColorEdita.setText(color.toString());
//        MarcaEdita.setText(marca.toString());
//
//        IdEdita.setEnabled(false);
//        NombreEdita.setEnabled(true);
//        ApellidoEdita.setEnabled(true);
//        txCedula.setEnabled(true);
//        RolEdita.setEnabled(true);
//        FichaEdita.setEnabled(true);
//        TransporteEdita.setEnabled(true);
//        PlacaEdita.setEnabled(true);
//        ColorEdita.setEnabled(true);
//        MarcaEdita.setEnabled(true);   
    }//GEN-LAST:event_JTableDatosMousePressed

    private void JTableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableDatosMouseClicked
//        int selectedRow = JTableDatos.getSelectedRow();
//        if (selectedRow == -1) {
//            return;
//        }
//
////MOSTRAR USUARIOS
//        Object id = JTableDatos.getValueAt(selectedRow, 0);                     // Obtener datos de la fila seleccionada
//        Object nombre = JTableDatos.getValueAt(selectedRow, 1);
//        Object apellido = JTableDatos.getValueAt(selectedRow, 2);
//        Object cedula = JTableDatos.getValueAt(selectedRow, 3);
//        Object contacto = JTableDatos.getValueAt(selectedRow, 4);
//        Object direccion = JTableDatos.getValueAt(selectedRow, 5);
//        Object Email = JTableDatos.getValueAt(selectedRow, 6);
//        Object password = JTableDatos.getValueAt(selectedRow, 7);
//
//        IdEditar.setText(id.toString());
//        NombreEditar.setText(nombre.toString());
//        ApellidoEditar.setText(apellido.toString());
//        IdentificacionEditar.setText(cedula.toString());
//        ContactoEditar.setText(contacto.toString());
//        DireccionEditar.setText(direccion.toString());
//        EmailEditar.setText(Email.toString());
//        PasswordEditar.setText(password.toString());
//
//        IdEditar.setEnabled(false);
//        NombreEditar.setEnabled(true);
//        ApellidoEditar.setEnabled(true);
//        IdentificacionEditar.setEnabled(true);
//        ContactoEditar.setEnabled(true);
//        DireccionEditar.setEnabled(true);
//        EmailEditar.setEnabled(true);
//        PasswordEditar.setEnabled(true);



////MOSTRAR INGRESOS
//        int selectedRow = JTableDatos.getSelectedRow();
//        if (selectedRow == -1) {
//            return;
//        }
//        
//        Object Id = JTableDatos.getValueAt(selectedRow, 0);
//        Object id_persona = JTableDatos.getValueAt(selectedRow, 1);
//        Object fecha = JTableDatos.getValueAt(selectedRow, 2);
//        Object hora_entrada = JTableDatos.getValueAt(selectedRow, 3);
//        
//        idEditarIngresoSede.setText(Id.toString());
//        idPersonaEditarIngresoSede.setText(id_persona.toString());
//        editarFechaIngresoSede.setText(fecha.toString());
//        entradaEdit.setText(hora_entrada.toString());
//
//        idEditarIngresoSede.setEnabled(false);
//        idPersonaEditarIngresoSede.setEnabled(false);
//        editarFechaIngresoSede.setEnabled(true);
//        TextoHoraIngresoSede.setEnabled(true);
//        

////MOSTRAR SALIDAS        
////int selectedRow = JTableDatos.getSelectedRow();        
//        if (selectedRow == -1) {
//            return;
//        }        

//        //Object Id = JTableDatos.getValueAt(selectedRow, 0);
//        Object id_persona = JTableDatos.getValueAt(selectedRow, 1);
//        Object fecha = JTableDatos.getValueAt(selectedRow, 2);
//        Object hora_salida = JTableDatos.getValueAt(selectedRow, 3);
//
//        IdEntradaSede.setText(id_persona.toString());
//        TextofechaEntradaSede.setText(fecha.toString());
//        TextoHoraIngresoSede.setText(hora_entrada.toString());
//
//        IdEntradaSede.setEnabled(true);
//        TextofechaEntradaSede.setEnabled(true);
//        TextoHoraIngresoSede.setEnabled(true);
    }//GEN-LAST:event_JTableDatosMouseClicked

    
    
    
    private void btnMostrarEntradasSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEntradasSedeActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
        editing = false;
        Object[][] content = null;
        this.controladorEntrada = new IngresoPersonalController();
        content = controladorEntrada.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headero);
        JTableDatos.setModel(tableModel);
    }//GEN-LAST:event_btnMostrarEntradasSedeActionPerformed

    private void btnMostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUsuariosActionPerformed
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setPreferredSize(screenSize);
        setExtendedState(MAXIMIZED_BOTH);
        editing = false;
        Object[][] content = null;
        this.controladorUsuario = new GeneralController();
        content = controladorUsuario.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, headere);
        JTableDatos.setModel(tableModel);
    }//GEN-LAST:event_btnMostrarUsuariosActionPerformed

    private void btnMostrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPersonasActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
        editing = false;
        Object[][] content = null;
        this.controladorPersona = new PersonasController();
        content = controladorPersona.loadDataforTableModel();
        tableModel = new DefaultTableModel(content, header);
        JTableDatos.setModel(tableModel);
    }//GEN-LAST:event_btnMostrarPersonasActionPerformed

    
    
    private void BtnBorrarSalidaSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarSalidaSedeActionPerformed
        // TODO add your handling code here:
        int resp = 0;
        int id = Integer.parseInt(textIdSalidaSede.getText());
        resp = controladorSalida.delete(id);
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error al borrar", "Guardar cliente", JOptionPane.ERROR_MESSAGE);
            this.textIdSalidaSede.setText("");
        } else {
            cleanDataTable();
            Object[][] content = controladorSalida.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, headero);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Borrado correctamente", "Guardar cliente", JOptionPane.INFORMATION_MESSAGE);
            this.textIdSalidaSede.setText("");
        }
    }//GEN-LAST:event_BtnBorrarSalidaSedeActionPerformed

    private void BtnBorrarEntradaPertenenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarEntradaPertenenciasActionPerformed
        ///////////////// TODO add your handling code here:
        int resp = 0;
        int id = Integer.parseInt(textIdEntradaPertenencia.getText());
        resp = controladorEpertenencias.delete(id);
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error al borrar", "Guardar cliente", JOptionPane.ERROR_MESSAGE);
            this.textIdEntradaPertenencia.setText("");
        } else {
            cleanDataTable();
            Object[][] content = controladorEpertenencias.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, headero);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Borrado correctamente", "Guardar cliente", JOptionPane.INFORMATION_MESSAGE);
            this.textIdEntradaPertenencia.setText("");
        }
    }//GEN-LAST:event_BtnBorrarEntradaPertenenciasActionPerformed

    private void BtnBorrarSalidaPertenenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarSalidaPertenenciasActionPerformed
        // TODO add your handling code here:
        int resp = 0;
        int id = Integer.parseInt(textIdSalidaPertenencia.getText());
        resp = controladorSpertenencias.delete(id);
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error al borrar", "Guardar cliente", JOptionPane.ERROR_MESSAGE);
            this.textIdSalidaPertenencia.setText("");
        } else {
            cleanDataTable();
            Object[][] content = controladorSpertenencias.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, headero);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Borrado correctamente", "Guardar cliente", JOptionPane.INFORMATION_MESSAGE);
            this.textIdSalidaPertenencia.setText("");
        }
    }//GEN-LAST:event_BtnBorrarSalidaPertenenciasActionPerformed

    
    
    private void btnEditarSalidaSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSalidaSedeActionPerformed
        int resp = 0;
        int id = Integer.parseInt(idEditarSalidaSede.getText());
        String fecha = editarFechaSalidaSede.getText();
        String hora_salida = salidaEdit.getText();
        int id_persona = Integer.parseInt(idPersonaEditarSalidaSede.getText());
            
        this.idEditarSalidaSede.setEnabled(false);
        this.idPersonaEditarSalidaSede.setEnabled(false);
        
        resp = controladorSalida.edit(new salidaPersonal(id,fecha, hora_salida, id_persona));
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error en el editar", "Guardar editar", JOptionPane.ERROR_MESSAGE);
        } else {
            cleanDataTable();
            Object[][] content = controladorSalida.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, header);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Editado correctamente", "Guardar editar", JOptionPane.INFORMATION_MESSAGE);
                this.idEditarSalidaSede.setText("");
                this.editarFechaSalidaSede.setText("");
                this.salidaEdit.setText("");
                this.idPersonaEditarSalidaSede.setText("");
        }
    }//GEN-LAST:event_btnEditarSalidaSedeActionPerformed

    private void btnEditarIngresoPertenenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarIngresoPertenenciaActionPerformed
        int resp = 0;
        int Id_pertenencias = Integer.parseInt(idEditarEntradaPertenencia.getText());
        String serial = EditarSerialEntrada.getText();
        String tipo_Pertenencia = EditarTipoPerteEntrada.getText();
        int id_persona = Integer.parseInt(idPersonaEditarEntradaPerte.getText());

        resp = controladorEpertenencias.edit(new PertenenciasEntrada(Id_pertenencias, serial, tipo_Pertenencia, id_persona));
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error en el editar", "Guardar editar", JOptionPane.ERROR_MESSAGE);
        } else {
            cleanDataTable();
            Object[][] content = controladorEpertenencias.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, header);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Editado correctamente", "Guardar editar", JOptionPane.INFORMATION_MESSAGE);
                this.idEditarEntradaPertenencia.setText("");
                this.EditarSerialEntrada.setText("");
                this.EditarTipoPerteEntrada.setText("");
                this.idPersonaEditarEntradaPerte.setText("");
        }
    }//GEN-LAST:event_btnEditarIngresoPertenenciaActionPerformed

    private void btnEditarSalidaPertenenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSalidaPertenenciaActionPerformed
        int resp = 0;
        int Id_pertenencias = Integer.parseInt(idEditarSalidaPertenencia.getText());
        String serial = EditarSerialSalida.getText();
        String tipo_Pertenencia = EditarTipoPerteSalida.getText();
        int id_persona = Integer.parseInt(idPersonaEditarSalidaPerte.getText());


        resp = controladorSpertenencias.edit(new PertenenciasSalida(Id_pertenencias, serial, tipo_Pertenencia, id_persona));
        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Error en el editar", "Guardar editar", JOptionPane.ERROR_MESSAGE);
        } else {
            cleanDataTable();
            Object[][] content = controladorSpertenencias.loadDataforTableModel();
            tableModel = new DefaultTableModel(content, header);
            JTableDatos.setModel(tableModel);
            JOptionPane.showMessageDialog(null, "Editado correctamente", "Guardar editar", JOptionPane.INFORMATION_MESSAGE);
                this.idEditarSalidaPertenencia.setText("");
                this.EditarSerialSalida.setText("");
                this.EditarTipoPerteSalida.setText(""); //EditarTipoPerteSalida
                this.idPersonaEditarSalidaPerte.setText("");
        }
    }//GEN-LAST:event_btnEditarSalidaPertenenciaActionPerformed

    
    
    
    private void btnSalidaSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaSedeActionPerformed
        int resp = 0;
        int id_persona;
        if (IdSalidaSede.getText().equals("")) {
            id_persona = 0;
        } else {
            id_persona = Integer.parseInt(IdSalidaSede.getText());
        }

        String fecha = TextofechaSalidaSede.getText();
        String hora_salida = TextoHoraSalidaSede.getText();

        if (id_persona == 0 || TextofechaSalidaSede.getText().equals("") || TextoHoraSalidaSede.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "Guardar registro", JOptionPane.ERROR_MESSAGE);
        } else {
            resp = controladorSalida.insert(new salidaPersonal(fecha, hora_salida, id_persona));
            if (resp == 0) {
                JOptionPane.showMessageDialog(null, "Error en el registro de salida", "Guardar registro", JOptionPane.ERROR_MESSAGE);
                    this.IdSalidaSede.setText("");
                    this.TextofechaSalidaSede.setText("");
                    this.TextoHoraSalidaSede.setText("");
            } else {
                cleanDataTable();
                Object[][] content = controladorSalida.loadDataforTableModel();
                tableModel = new DefaultTableModel(content, header);
                JTableDatos.setModel(tableModel);
                JOptionPane.showMessageDialog(null, "Salida de la sede, guardada correctamente.", "Guardar registro", JOptionPane.INFORMATION_MESSAGE);
                    this.IdSalidaSede.setText("");
                    this.TextofechaSalidaSede.setText("");
                    this.TextoHoraSalidaSede.setText("");
            }
        }
    }//GEN-LAST:event_btnSalidaSedeActionPerformed
    
    private void btnEntradaPertenenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaPertenenciasActionPerformed
        int resp = 0;
        int id_persona;
        if (IdPertenenciasEntrada.getText().equals("")) {
            id_persona = 0;
        } else {
            id_persona = Integer.parseInt(IdPertenenciasEntrada.getText());
        }

        String serial = SerialEntradaPerte.getText();
        String tipo_Pertenencia = TipoPertenenciaEntrada.getText();

        if (id_persona == 0 || SerialEntradaPerte.getText().equals("") || TipoPertenenciaEntrada.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "Guardar registro", JOptionPane.ERROR_MESSAGE);
        } else {
            resp = controladorEpertenencias.insert(new PertenenciasEntrada(serial,tipo_Pertenencia,id_persona));
            if (resp == 0) {
                JOptionPane.showMessageDialog(null, "Error en el registro de pertenencia", "Guardar registro", JOptionPane.ERROR_MESSAGE);
                    this.IdPertenenciasEntrada.setText("");
                    this.SerialEntradaPerte.setText("");
                    this.TipoPertenenciaEntrada.setText("");
            } else {
                cleanDataTable();
                Object[][] content = controladorEpertenencias.loadDataforTableModel();
                tableModel = new DefaultTableModel(content, header);
                JTableDatos.setModel(tableModel);
                JOptionPane.showMessageDialog(null, "Pertenencia de entrada guardada correctamente", "Guardar registro", JOptionPane.INFORMATION_MESSAGE);
                    this.IdPertenenciasEntrada.setText("");
                    this.SerialEntradaPerte.setText("");
                    this.TipoPertenenciaEntrada.setText("");
            }
        } 
    }//GEN-LAST:event_btnEntradaPertenenciasActionPerformed
    
    private void btnSalidaPertenenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaPertenenciasActionPerformed
        int resp = 0;
        int id_persona;
        if (IdPertenenciasSalida.getText().equals("")) {
            id_persona = 0;
        } else {
            id_persona = Integer.parseInt(IdPertenenciasSalida.getText());
        }

        String serial = SerialSalidaPerte.getText();
        String tipo_Pertenencia = TipoPertenenciaSalida.getText();

        if (id_persona == 0 || SerialSalidaPerte.getText().equals("") || TipoPertenenciaSalida.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos.", "Guardar registro", JOptionPane.ERROR_MESSAGE);
        } else {
            resp = controladorSpertenencias.insert(new PertenenciasSalida(serial, tipo_Pertenencia, id_persona));
            if (resp == 0) {
                JOptionPane.showMessageDialog(null, "Error en el registro de pertenencia.", "Guardar registro", JOptionPane.ERROR_MESSAGE);
                    this.IdPertenenciasSalida.setText("");
                    this.SerialSalidaPerte.setText("");
                    this.TipoPertenenciaSalida.setText("");
            } else {
                cleanDataTable();
                Object[][] content = controladorSpertenencias.loadDataforTableModel();
                tableModel = new DefaultTableModel(content, header);
                JTableDatos.setModel(tableModel);
                JOptionPane.showMessageDialog(null, "Pertenencia de salida, guardada correctamente.", "Guardar registro", JOptionPane.INFORMATION_MESSAGE);
                    this.IdPertenenciasSalida.setText("");
                    this.SerialSalidaPerte.setText("");
                    this.TipoPertenenciaSalida.setText("");
            }
        } 
    }//GEN-LAST:event_btnSalidaPertenenciasActionPerformed




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
//                new LoginAdmin().setVisible(true);
//            }
//        });
//    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane ApellidoEdita;
    private javax.swing.JTextPane ApellidoEditar;
    private javax.swing.JButton BtnBorrarEntradaPertenencias;
    private javax.swing.JButton BtnBorrarIngresoSede;
    private javax.swing.JButton BtnBorrarSalidaPertenencias;
    private javax.swing.JButton BtnBorrarSalidaSede;
    private javax.swing.JTextPane CedulaEdita;
    private javax.swing.JTextPane ColorEdita;
    private javax.swing.JTextPane ContactoEditar;
    private javax.swing.JTextPane DireccionEditar;
    private javax.swing.JTextPane EditarSerialEntrada;
    private javax.swing.JTextPane EditarSerialSalida;
    private javax.swing.JTextPane EditarTipoPerteEntrada;
    private javax.swing.JTextPane EditarTipoPerteSalida;
    private javax.swing.JTextPane EmailEditar;
    private javax.swing.JTextPane FichaEdita;
    private javax.swing.JTextPane IdEdita;
    private javax.swing.JTextPane IdEditar;
    private javax.swing.JTextPane IdEntradaSede;
    private javax.swing.JTextPane IdPertenenciasEntrada;
    private javax.swing.JTextPane IdPertenenciasSalida;
    private javax.swing.JTextPane IdSalidaSede;
    private javax.swing.JTextPane IdentificacionEditar;
    private javax.swing.JTable JTableDatos;
    private javax.swing.JTextPane MarcaEdita;
    private javax.swing.JTextPane NombreEdita;
    private javax.swing.JTextPane NombreEditar;
    private javax.swing.JTextPane PasswordEditar;
    private javax.swing.JTextPane PlacaEdita;
    private javax.swing.JTextPane RolEdita;
    private javax.swing.JTextPane SerialEntradaPerte;
    private javax.swing.JTextPane SerialSalidaPerte;
    private javax.swing.JTextPane TextoHoraIngresoSede;
    private javax.swing.JTextPane TextoHoraSalidaSede;
    private javax.swing.JTextPane TextofechaEntradaSede;
    private javax.swing.JTextPane TextofechaSalidaSede;
    private javax.swing.JTextPane TipoPertenenciaEntrada;
    private javax.swing.JTextPane TipoPertenenciaSalida;
    private javax.swing.JTextPane TransporteEdita;
    private javax.swing.JScrollPane Txtid;
    private javax.swing.JButton btnBorrarPersona;
    private javax.swing.JButton btnBorrarUsuario;
    private javax.swing.JButton btnEditarIngresoPertenencia;
    private javax.swing.JButton btnEditarIngresoSede;
    private javax.swing.JButton btnEditarPersona;
    private javax.swing.JButton btnEditarSalidaPertenencia;
    private javax.swing.JButton btnEditarSalidaSede;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEntradaPertenencias;
    private javax.swing.JButton btnIngresoSede;
    private javax.swing.JButton btnInsertarPersona;
    private javax.swing.JButton btnInsertarUsuario;
    private javax.swing.JButton btnMostrarEntradaPertenencias;
    private javax.swing.JButton btnMostrarEntradasSede;
    private javax.swing.JButton btnMostrarPersonas;
    private javax.swing.JButton btnMostrarSalidaPertenencias;
    private javax.swing.JButton btnMostrarSalidaSede;
    private javax.swing.JButton btnMostrarUsuarios;
    private javax.swing.JButton btnSalidaPertenencias;
    private javax.swing.JButton btnSalidaSede;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextPane editarFechaIngresoSede;
    private javax.swing.JTextPane editarFechaSalidaSede;
    private javax.swing.JTextPane entradaEdit;
    private javax.swing.JTextPane idEditarEntradaPertenencia;
    private javax.swing.JTextPane idEditarIngresoSede;
    private javax.swing.JTextPane idEditarSalidaPertenencia;
    private javax.swing.JTextPane idEditarSalidaSede;
    private javax.swing.JTextPane idPersonaEditarEntradaPerte;
    private javax.swing.JTextPane idPersonaEditarIngresoSede;
    private javax.swing.JTextPane idPersonaEditarSalidaPerte;
    private javax.swing.JTextPane idPersonaEditarSalidaSede;
    private javax.swing.JEditorPane jEditorPane6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane62;
    private javax.swing.JScrollPane jScrollPane63;
    private javax.swing.JScrollPane jScrollPane64;
    private javax.swing.JScrollPane jScrollPane65;
    private javax.swing.JScrollPane jScrollPane66;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPaneIdUsuario;
    private javax.swing.JScrollPane jScrollPaneIngresosySalidas;
    private javax.swing.JScrollPane jScrollPaneIngresosySalidas1;
    private javax.swing.JScrollPane jScrollPaneIngresosySalidas2;
    private javax.swing.JScrollPane jScrollPaneIngresosySalidas3;
    private javax.swing.JScrollPane jScrollPanePersona;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane salidaEdit;
    private javax.swing.JTextPane textApellido;
    private javax.swing.JTextPane textCedula;
    private javax.swing.JTextPane textColor;
    private javax.swing.JTextPane textFicha;
    private javax.swing.JTextPane textId;
    private javax.swing.JTextPane textIdEntradaPertenencia;
    private javax.swing.JTextPane textIdIngresoSede;
    private javax.swing.JTextPane textIdPersona;
    private javax.swing.JTextPane textIdSalidaPertenencia;
    private javax.swing.JTextPane textIdSalidaSede;
    private javax.swing.JTextPane textIdUsuario;
    private javax.swing.JTextPane textMarca;
    private javax.swing.JTextPane textNombre;
    private javax.swing.JTextPane textPlaca;
    private javax.swing.JTextPane textRol;
    private javax.swing.JTextPane textTransporte;
    private javax.swing.JScrollPane txCedula;
    private javax.swing.JScrollPane txId;
    private javax.swing.JTextPane txtApellido;
    private javax.swing.JTextPane txtCedula;
    private javax.swing.JTextPane txtContacto;
    private javax.swing.JTextPane txtDireccion;
    private javax.swing.JTextPane txtEmail;
    private javax.swing.JTextPane txtId;
    private javax.swing.JTextPane txtPassword;
    private javax.swing.JTextPane txtnombre;
    // End of variables declaration//GEN-END:variables

}
