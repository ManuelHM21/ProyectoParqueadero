/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Vista;

import SQL.ConexionSQL;
import SQL.crudsql;
import com.clases.Prueba;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class Mapa extends javax.swing.JFrame {
    /**
     * Creates new form Mapa
     */
    public Mapa() {
        initComponents();
        this.setLocationRelativeTo(null);
        invisible();
        pisoN.setVisible(false);
        pisoN.setText("1");
        llenar("a");
    }
    
    public void cambiar(){
        int piso = Integer.parseInt(pisoN.getText());        
        switch (piso) {
            case 1:
                pisoM.setText("A");
                llenar("a");
                break;      
            case 2:
                pisoM.setText("B");
                llenar("b");
                break;
            case 3:
                pisoM.setText("C");
                llenar("c");
                break;
            case 4:
                pisoM.setText("D");
                llenar("d");
                break;
            case 5:
                pisoM.setText("E");
                llenar("e");
                break;
        }
    }
    
    public void mensaje(String Npuesto){         
        crud.buscarCarro(Npuesto,pisoM.getText().toLowerCase());
        String propietario = pru.getPropietario();
        String color = pru.getColor();
        String puesto = pru.getPuesto();
        String piso = pru.getPiso();
        String marca = pru.getMarca();
        String modelo = pru.getModelo();
        String placa = pru.getPlaca();
        String hora_llegada = pru.getHora_llegada(); 
        JOptionPane.showMessageDialog(null, "\nINFORMACION DEL VEHICULO\n\nPropietario: "+propietario+"\nMarca: "+marca+"\nModelo: "+modelo+"\nColor: : "+color+"\nPlaca: "+placa+"\nPuesto: "+puesto+"\nPiso: : "+piso+"\nFecha de llegada: "+hora_llegada, "Consulta de auto", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mensajeBuscar(){                                     
        crud.buscar(tfBuscar.getText());
        String propietario = pru.getPropietario();
        String color = pru.getColor();
        String puesto = pru.getPuesto();
        String piso = pru.getPiso();
        String marca = pru.getMarca();
        String modelo = pru.getModelo();
        String placa = pru.getPlaca();
        String hora_llegada = pru.getHora_llegada(); 
        if (placa==""){
            //JOptionPane.showMessageDialog(null, "No hay registro");
        }else{
            JOptionPane.showMessageDialog(null, "\nINFORMACION DEL VEHICULO\n\nPropietario: "+propietario+"\nMarca: "+marca+"\nModelo: "+modelo+"\nColor: : "+color+"\nPlaca: "+placa+"\nPuesto: "+puesto+"\nPiso: : "+piso+"\nFecha de llegada: "+hora_llegada, "Consulta de auto", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    ConexionSQL con = new ConexionSQL();
    java.sql.Statement st;
    ResultSet rs;
    public void llenar(String piso){
        String puesto=null;
        try {
            Connection conexion=con.conectar();
            st=conexion.createStatement();
            String sql= "SELECT * FROM "+piso+";";
            rs=st.executeQuery(sql);
            while(rs.next()){
                   puesto=rs.getString("puesto");
                   switch (puesto) {
                    case "1":
                        Auto_1.setVisible(true);
                        break;
                    case "2":
                        Auto_2.setVisible(true);
                        break;
                    case "3":
                        Auto_3.setVisible(true);
                        break;
                    case "4":
                        Auto_4.setVisible(true);
                        break;
                    case "5":
                        Auto_5.setVisible(true);
                        break;
                    case "6":
                        Auto_6.setVisible(true);
                        break;
                    case "7":
                        Auto_7.setVisible(true);
                        break;
                    case "8":
                        Auto_8.setVisible(true);
                        break;
                    case "9":
                        Auto_9.setVisible(true);
                        break;
                    case "10":
                        Auto_10.setVisible(true);
                        break;
                    case "11":
                        Auto_11.setVisible(true);
                        break;
                    case "12":
                        Auto_12.setVisible(true);
                        break;
                    case "13":
                        Auto_13.setVisible(true);
                        break;
                    case "14":
                        Auto_14.setVisible(true);
                        break;
                    case "15":
                        Auto_15.setVisible(true);
                        break;
                    case "16":
                        Auto_16.setVisible(true);
                        break;
                    case "17":
                        Auto_17.setVisible(true);
                        break;
                    case "18":
                        Auto_18.setVisible(true);
                        break;
                    case "19":
                        Auto_19.setVisible(true);
                        break;
                    case "20":
                        Auto_20.setVisible(true);
                        break;
                    case "21":
                        Auto_21.setVisible(true);
                        break;
                    case "22":
                        Auto_22.setVisible(true);
                        break;
                    case "23":
                        Auto_23.setVisible(true);
                        break;
                    case "24":
                        Auto_24.setVisible(true);
                        break;
                    case "25":
                        Auto_25.setVisible(true);
                        break;
                    case "26":
                        Auto_26.setVisible(true);
                        break;
                    case "27":
                        Auto_27.setVisible(true);
                        break;
                    case "28":
                        Auto_28.setVisible(true);
                        break;
                    case "29":
                        Auto_29.setVisible(true);
                        break;
                    case "30":
                        Auto_30.setVisible(true);
                        break;
                    case "31":
                        Auto_31.setVisible(true);
                        break;
                    case "32":
                        Auto_32.setVisible(true);
                        break; 

                }
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL SISTEMA DE BUSQUEDA"+e, "mensaje", JOptionPane.ERROR_MESSAGE);           
        } 
    }
    
    public void invisible(){
        Auto_1.setVisible(false);
        Auto_2.setVisible(false);
        Auto_3.setVisible(false);
        Auto_4.setVisible(false);
        Auto_4.setVisible(false);
        Auto_5.setVisible(false);
        Auto_6.setVisible(false);
        Auto_7.setVisible(false);
        Auto_8.setVisible(false);
        Auto_9.setVisible(false);
        Auto_10.setVisible(false);
        Auto_11.setVisible(false);
        Auto_12.setVisible(false);
        Auto_13.setVisible(false);
        Auto_14.setVisible(false);
        Auto_14.setVisible(false);
        Auto_15.setVisible(false);
        Auto_16.setVisible(false);
        Auto_17.setVisible(false);
        Auto_18.setVisible(false);
        Auto_19.setVisible(false);
        Auto_20.setVisible(false);
        Auto_21.setVisible(false);
        Auto_22.setVisible(false);
        Auto_23.setVisible(false);
        Auto_24.setVisible(false);
        Auto_24.setVisible(false);
        Auto_25.setVisible(false);
        Auto_26.setVisible(false);
        Auto_27.setVisible(false);
        Auto_28.setVisible(false);
        Auto_29.setVisible(false);
        Auto_30.setVisible(false);
        Auto_31.setVisible(false);
        Auto_32.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tfBuscar = new javax.swing.JTextField();
        btmConsultar = new javax.swing.JButton();
        btnVOLVER = new javax.swing.JButton();
        btmConsultar1 = new javax.swing.JButton();
        btmConsultar2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        derecha = new javax.swing.JButton();
        izquierda = new javax.swing.JButton();
        pisoN = new javax.swing.JLabel();
        pisoM = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Auto_5 = new javax.swing.JButton();
        Auto_23 = new javax.swing.JButton();
        Auto_2 = new javax.swing.JButton();
        Auto_4 = new javax.swing.JButton();
        Auto_3 = new javax.swing.JButton();
        Auto_16 = new javax.swing.JButton();
        Auto_25 = new javax.swing.JButton();
        Auto_13 = new javax.swing.JButton();
        Auto_15 = new javax.swing.JButton();
        Auto_19 = new javax.swing.JButton();
        Auto_21 = new javax.swing.JButton();
        Auto_10 = new javax.swing.JButton();
        Auto_11 = new javax.swing.JButton();
        Auto_17 = new javax.swing.JButton();
        Auto_20 = new javax.swing.JButton();
        Auto_14 = new javax.swing.JButton();
        Auto_18 = new javax.swing.JButton();
        Auto_22 = new javax.swing.JButton();
        Auto_7 = new javax.swing.JButton();
        Auto_1 = new javax.swing.JButton();
        Auto_24 = new javax.swing.JButton();
        Auto_12 = new javax.swing.JButton();
        Auto_26 = new javax.swing.JButton();
        Auto_27 = new javax.swing.JButton();
        Auto_28 = new javax.swing.JButton();
        Auto_29 = new javax.swing.JButton();
        Auto_30 = new javax.swing.JButton();
        Auto_31 = new javax.swing.JButton();
        Auto_32 = new javax.swing.JButton();
        Auto_6 = new javax.swing.JButton();
        Auto_9 = new javax.swing.JButton();
        Auto_8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(2, 32, 47));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(20, 33, 61));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(tfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 120, 40));

        btmConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btmConsultar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btmConsultar.setForeground(new java.awt.Color(0, 0, 0));
        btmConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/search_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        btmConsultar.setText("Consultar");
        btmConsultar.setBorder(null);
        btmConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btmConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 100, 40));

        btnVOLVER.setBackground(new java.awt.Color(255, 255, 255));
        btnVOLVER.setForeground(new java.awt.Color(0, 0, 0));
        btnVOLVER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/home_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        btnVOLVER.setText("Volver");
        btnVOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVOLVERActionPerformed(evt);
            }
        });
        jPanel3.add(btnVOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 90, 40));

        btmConsultar1.setBackground(new java.awt.Color(255, 255, 255));
        btmConsultar1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btmConsultar1.setForeground(new java.awt.Color(0, 0, 0));
        btmConsultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/near_me_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        btmConsultar1.setText("Ubicasion actual");
        btmConsultar1.setBorder(null);
        btmConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmConsultar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btmConsultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 120, 40));

        btmConsultar2.setBackground(new java.awt.Color(255, 255, 255));
        btmConsultar2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btmConsultar2.setForeground(new java.awt.Color(0, 0, 0));
        btmConsultar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/qr_code_scanner_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        btmConsultar2.setText("Escanear QR");
        btmConsultar2.setBorder(null);
        btmConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmConsultar2ActionPerformed(evt);
            }
        });
        jPanel3.add(btmConsultar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 100, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingresa la Placa:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 760, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 724));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        derecha.setBackground(new java.awt.Color(255, 255, 255));
        derecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/--->.png"))); // NOI18N
        derecha.setBorder(null);
        derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaActionPerformed(evt);
            }
        });
        jPanel1.add(derecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 400, 40, 60));

        izquierda.setBackground(new java.awt.Color(255, 255, 255));
        izquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/<---.png"))); // NOI18N
        izquierda.setBorder(null);
        izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(izquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 40, 60));

        pisoN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        pisoN.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(pisoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 50, 40));

        pisoM.setFont(new java.awt.Font("Arial Black", 1, 80)); // NOI18N
        pisoM.setForeground(new java.awt.Color(255, 255, 255));
        pisoM.setText("A");
        jPanel1.add(pisoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 200, 90, 70));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Consulta de usuario");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 140, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, -1));

        Auto_5.setBackground(new java.awt.Color(0, 0, 0));
        Auto_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_5.setText("jButton1");
        Auto_5.setBorder(null);
        Auto_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_5ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 80, 110));

        Auto_23.setBackground(new java.awt.Color(0, 0, 0));
        Auto_23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_23.setText("jButton1");
        Auto_23.setBorder(null);
        Auto_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_23ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 80, 110));

        Auto_2.setBackground(new java.awt.Color(0, 0, 0));
        Auto_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_2.setText("jButton1");
        Auto_2.setBorder(null);
        Auto_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_2ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 80, 110));

        Auto_4.setBackground(new java.awt.Color(0, 0, 0));
        Auto_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_4.setText("jButton1");
        Auto_4.setBorder(null);
        Auto_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_4ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 80, 110));

        Auto_3.setBackground(new java.awt.Color(0, 0, 0));
        Auto_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_3.setText("jButton1");
        Auto_3.setBorder(null);
        Auto_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_3ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 80, 110));

        Auto_16.setBackground(new java.awt.Color(0, 0, 0));
        Auto_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_16.setText("jButton1");
        Auto_16.setBorder(null);
        Auto_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_16ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 80, 110));

        Auto_25.setBackground(new java.awt.Color(0, 0, 0));
        Auto_25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_25.setText("jButton1");
        Auto_25.setBorder(null);
        Auto_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_25ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, 80, 110));

        Auto_13.setBackground(new java.awt.Color(0, 0, 0));
        Auto_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_13.setText("jButton1");
        Auto_13.setBorder(null);
        Auto_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_13ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 80, 110));

        Auto_15.setBackground(new java.awt.Color(0, 0, 0));
        Auto_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_15.setText("jButton1");
        Auto_15.setBorder(null);
        Auto_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_15ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 80, 110));

        Auto_19.setBackground(new java.awt.Color(0, 0, 0));
        Auto_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_19.setText("jButton1");
        Auto_19.setBorder(null);
        Auto_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_19ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 80, 110));

        Auto_21.setBackground(new java.awt.Color(0, 0, 0));
        Auto_21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_21.setText("jButton1");
        Auto_21.setBorder(null);
        Auto_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_21ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 80, 110));

        Auto_10.setBackground(new java.awt.Color(0, 0, 0));
        Auto_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_10.setText("jButton1");
        Auto_10.setBorder(null);
        Auto_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_10ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 80, 110));

        Auto_11.setBackground(new java.awt.Color(0, 0, 0));
        Auto_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_11.setText("jButton1");
        Auto_11.setBorder(null);
        Auto_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_11ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 80, 110));

        Auto_17.setBackground(new java.awt.Color(0, 0, 0));
        Auto_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_17.setText("jButton1");
        Auto_17.setBorder(null);
        Auto_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_17ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 80, 110));

        Auto_20.setBackground(new java.awt.Color(0, 0, 0));
        Auto_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_20.setText("jButton1");
        Auto_20.setBorder(null);
        Auto_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_20ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 80, 110));

        Auto_14.setBackground(new java.awt.Color(0, 0, 0));
        Auto_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_14.setText("jButton1");
        Auto_14.setBorder(null);
        Auto_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_14ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 80, 110));

        Auto_18.setBackground(new java.awt.Color(0, 0, 0));
        Auto_18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_18.setText("jButton1");
        Auto_18.setBorder(null);
        Auto_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_18ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 80, 110));

        Auto_22.setBackground(new java.awt.Color(0, 0, 0));
        Auto_22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_22.setText("jButton1");
        Auto_22.setBorder(null);
        Auto_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_22ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 80, 110));

        Auto_7.setBackground(new java.awt.Color(0, 0, 0));
        Auto_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_7.setText("jButton1");
        Auto_7.setBorder(null);
        Auto_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_7ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 80, 110));

        Auto_1.setBackground(new java.awt.Color(0, 0, 0));
        Auto_1.setForeground(new java.awt.Color(0, 0, 0));
        Auto_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_1.setText("jButton1");
        Auto_1.setBorder(null);
        Auto_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_1ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 80, 110));

        Auto_24.setBackground(new java.awt.Color(0, 0, 0));
        Auto_24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_24.setText("jButton1");
        Auto_24.setBorder(null);
        Auto_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_24ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 80, 110));

        Auto_12.setBackground(new java.awt.Color(0, 0, 0));
        Auto_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_12.setText("jButton1");
        Auto_12.setBorder(null);
        Auto_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_12ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 80, 110));

        Auto_26.setBackground(new java.awt.Color(0, 0, 0));
        Auto_26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_26.setText("jButton1");
        Auto_26.setBorder(null);
        Auto_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_26ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 80, 110));

        Auto_27.setBackground(new java.awt.Color(0, 0, 0));
        Auto_27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_27.setText("jButton1");
        Auto_27.setBorder(null);
        Auto_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_27ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 80, 110));

        Auto_28.setBackground(new java.awt.Color(0, 0, 0));
        Auto_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_28.setText("jButton1");
        Auto_28.setBorder(null);
        Auto_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_28ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 90, 110));

        Auto_29.setBackground(new java.awt.Color(0, 0, 0));
        Auto_29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_29.setText("jButton1");
        Auto_29.setBorder(null);
        Auto_29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_29ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, 90, 110));

        Auto_30.setBackground(new java.awt.Color(0, 0, 0));
        Auto_30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_30.setText("jButton1");
        Auto_30.setBorder(null);
        Auto_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_30ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_30, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, 90, 110));

        Auto_31.setBackground(new java.awt.Color(0, 0, 0));
        Auto_31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_31.setText("jButton1");
        Auto_31.setBorder(null);
        Auto_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_31ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 660, 90, 110));

        Auto_32.setBackground(new java.awt.Color(0, 0, 0));
        Auto_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_32.setText("jButton1");
        Auto_32.setBorder(null);
        Auto_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_32ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 660, 90, 110));

        Auto_6.setBackground(new java.awt.Color(0, 0, 0));
        Auto_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_6.setText("jButton1");
        Auto_6.setBorder(null);
        Auto_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_6ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 80, 110));

        Auto_9.setBackground(new java.awt.Color(0, 0, 0));
        Auto_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_9.setText("jButton1");
        Auto_9.setBorder(null);
        Auto_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_9ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 80, 110));

        Auto_8.setBackground(new java.awt.Color(0, 0, 0));
        Auto_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/icons8-vista-superior-del-coche-48 (4).png"))); // NOI18N
        Auto_8.setText("jButton1");
        Auto_8.setBorder(null);
        Auto_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auto_8ActionPerformed(evt);
            }
        });
        jPanel1.add(Auto_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 80, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/Entrada.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1160, -1));

        jLabel3.setFont(new java.awt.Font("Gurmukhi MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PARQUEO INTELIGENTE ULTRA 4K SMART");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/cubo-en-la-antartica_3840x2160_xtrafondos.com.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    crudsql crud = new crudsql();
    Prueba pru = new Prueba();
    private void btmConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmConsultarActionPerformed
        mensajeBuscar();
        pisoM.setText(pru.getPiso().toUpperCase());
        invisible();
        llenar(pru.getPiso());
        tfBuscar.setText("");
    }//GEN-LAST:event_btmConsultarActionPerformed

    private void btnVOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVOLVERActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVOLVERActionPerformed

    private void Auto_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_5ActionPerformed
        mensaje("5");
    }//GEN-LAST:event_Auto_5ActionPerformed

    private void Auto_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_23ActionPerformed
        mensaje("23");
    }//GEN-LAST:event_Auto_23ActionPerformed

    private void Auto_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_2ActionPerformed
        mensaje("22");
    }//GEN-LAST:event_Auto_2ActionPerformed

    private void Auto_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_4ActionPerformed
        mensaje("4");
    }//GEN-LAST:event_Auto_4ActionPerformed

    private void Auto_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_3ActionPerformed
        mensaje("3");
    }//GEN-LAST:event_Auto_3ActionPerformed

    private void Auto_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_16ActionPerformed
        mensaje("16");
    }//GEN-LAST:event_Auto_16ActionPerformed

    private void Auto_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_25ActionPerformed
        mensaje("25");
    }//GEN-LAST:event_Auto_25ActionPerformed

    private void Auto_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_13ActionPerformed
        mensaje("13");
    }//GEN-LAST:event_Auto_13ActionPerformed

    private void Auto_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_15ActionPerformed
        mensaje("15");
    }//GEN-LAST:event_Auto_15ActionPerformed

    private void Auto_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_19ActionPerformed
        mensaje("19");
    }//GEN-LAST:event_Auto_19ActionPerformed

    private void Auto_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_21ActionPerformed
        mensaje("21");
    }//GEN-LAST:event_Auto_21ActionPerformed

    private void Auto_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_10ActionPerformed
        mensaje("10");
    }//GEN-LAST:event_Auto_10ActionPerformed

    private void Auto_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_11ActionPerformed
        mensaje("11");
    }//GEN-LAST:event_Auto_11ActionPerformed

    private void Auto_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_17ActionPerformed
        mensaje("17");
    }//GEN-LAST:event_Auto_17ActionPerformed

    private void Auto_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_20ActionPerformed
        mensaje("20");
    }//GEN-LAST:event_Auto_20ActionPerformed

    private void Auto_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_14ActionPerformed
        mensaje("14");
    }//GEN-LAST:event_Auto_14ActionPerformed

    private void Auto_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_18ActionPerformed
        mensaje("18");
    }//GEN-LAST:event_Auto_18ActionPerformed

    private void Auto_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_22ActionPerformed
        mensaje("22");
    }//GEN-LAST:event_Auto_22ActionPerformed

    private void Auto_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_7ActionPerformed
        mensaje("7");
    }//GEN-LAST:event_Auto_7ActionPerformed

    private void Auto_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_1ActionPerformed
        mensaje("1");
    }//GEN-LAST:event_Auto_1ActionPerformed

    private void Auto_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_24ActionPerformed
        mensaje("24");
    }//GEN-LAST:event_Auto_24ActionPerformed

    private void Auto_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_12ActionPerformed
        mensaje("12");
    }//GEN-LAST:event_Auto_12ActionPerformed

    private void Auto_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_26ActionPerformed
        mensaje("26");
    }//GEN-LAST:event_Auto_26ActionPerformed

    private void Auto_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_27ActionPerformed
        mensaje("27");
    }//GEN-LAST:event_Auto_27ActionPerformed

    private void Auto_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_28ActionPerformed
        mensaje("28");
    }//GEN-LAST:event_Auto_28ActionPerformed

    private void Auto_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_29ActionPerformed
        mensaje("29");
    }//GEN-LAST:event_Auto_29ActionPerformed

    private void Auto_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_30ActionPerformed
        mensaje("30");
    }//GEN-LAST:event_Auto_30ActionPerformed

    private void Auto_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_31ActionPerformed
        mensaje("31");
    }//GEN-LAST:event_Auto_31ActionPerformed

    private void Auto_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_32ActionPerformed
        mensaje("32");
    }//GEN-LAST:event_Auto_32ActionPerformed

    private void Auto_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_6ActionPerformed
        mensaje("6");
    }//GEN-LAST:event_Auto_6ActionPerformed

    private void Auto_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_9ActionPerformed
        mensaje("9");
    }//GEN-LAST:event_Auto_9ActionPerformed

    private void Auto_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auto_8ActionPerformed
        mensaje("8");
    }//GEN-LAST:event_Auto_8ActionPerformed

    private void btmConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmConsultar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btmConsultar1ActionPerformed

    private void btmConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmConsultar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btmConsultar2ActionPerformed

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaActionPerformed
        invisible();
        int piso = Integer.parseInt(pisoN.getText());
        if (piso<5){
            piso++;
            izquierda.setVisible(true);
        }
        else{
            derecha.setVisible(false);
        }
        
        pisoN.setText(String.valueOf(piso));
        cambiar();
    }//GEN-LAST:event_derechaActionPerformed

    private void izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaActionPerformed
        invisible();
        int piso = Integer.parseInt(pisoN.getText());
        if (piso>1){
            piso--;
            derecha.setVisible(true);
        }
        else{
            izquierda.setVisible(false);
        }
        pisoN.setText(String.valueOf(piso));
        cambiar();
    }//GEN-LAST:event_izquierdaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Auto_1;
    private javax.swing.JButton Auto_10;
    private javax.swing.JButton Auto_11;
    private javax.swing.JButton Auto_12;
    private javax.swing.JButton Auto_13;
    private javax.swing.JButton Auto_14;
    private javax.swing.JButton Auto_15;
    private javax.swing.JButton Auto_16;
    private javax.swing.JButton Auto_17;
    private javax.swing.JButton Auto_18;
    private javax.swing.JButton Auto_19;
    private javax.swing.JButton Auto_2;
    private javax.swing.JButton Auto_20;
    private javax.swing.JButton Auto_21;
    private javax.swing.JButton Auto_22;
    private javax.swing.JButton Auto_23;
    private javax.swing.JButton Auto_24;
    private javax.swing.JButton Auto_25;
    private javax.swing.JButton Auto_26;
    private javax.swing.JButton Auto_27;
    private javax.swing.JButton Auto_28;
    private javax.swing.JButton Auto_29;
    private javax.swing.JButton Auto_3;
    private javax.swing.JButton Auto_30;
    private javax.swing.JButton Auto_31;
    private javax.swing.JButton Auto_32;
    private javax.swing.JButton Auto_4;
    private javax.swing.JButton Auto_5;
    private javax.swing.JButton Auto_6;
    private javax.swing.JButton Auto_7;
    private javax.swing.JButton Auto_8;
    private javax.swing.JButton Auto_9;
    private javax.swing.JButton btmConsultar;
    private javax.swing.JButton btmConsultar1;
    private javax.swing.JButton btmConsultar2;
    private javax.swing.JButton btnVOLVER;
    private javax.swing.JButton derecha;
    private javax.swing.JButton izquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel pisoM;
    private javax.swing.JLabel pisoN;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}
