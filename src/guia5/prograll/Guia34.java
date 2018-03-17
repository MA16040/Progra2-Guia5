package guia5.prograll;

import javax.swing.JOptionPane;

public class Guia34 extends javax.swing.JFrame {

    public Guia34() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtprincipal.setEnabled(false);
        txtsecundaria.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblencabezado = new javax.swing.JLabel();
        lblcpu = new javax.swing.JLabel();
        txtCpu = new javax.swing.JTextField();
        lbltamaño = new javax.swing.JLabel();
        txttamaño = new javax.swing.JTextField();
        lblram = new javax.swing.JLabel();
        txtram = new javax.swing.JTextField();
        lbltiempo = new javax.swing.JLabel();
        txttiempo = new javax.swing.JTextField();
        lblprecio = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        lblmarca = new javax.swing.JLabel();
        cmbmarca = new javax.swing.JComboBox();
        lblcamaras = new javax.swing.JLabel();
        cbxprincipal = new javax.swing.JCheckBox();
        cbxsecundaria = new javax.swing.JCheckBox();
        cbxflash = new javax.swing.JCheckBox();
        txtprincipal = new javax.swing.JTextField();
        txtsecundaria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        btnejecutar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBateriaMa = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblencabezado.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblencabezado.setText("Puntaje de moviles");
        getContentPane().add(lblencabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 11, -1, 32));

        lblcpu.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblcpu.setText("Cpu numero de nucleos:");
        getContentPane().add(lblcpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 63, -1, -1));

        txtCpu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpuFocusLost(evt);
            }
        });
        txtCpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpuKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpuKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpuKeyTyped(evt);
            }
        });
        getContentPane().add(txtCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 61, 143, -1));

        lbltamaño.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbltamaño.setText("Tamaño de pantalla:");
        getContentPane().add(lbltamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 101, -1, -1));

        txttamaño.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttamañoFocusLost(evt);
            }
        });
        txttamaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttamañoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttamañoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttamañoKeyTyped(evt);
            }
        });
        getContentPane().add(txttamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 99, 143, -1));

        lblram.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblram.setText("Cantidad de RAM:");
        getContentPane().add(lblram, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 137, -1, -1));

        txtram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtramActionPerformed(evt);
            }
        });
        txtram.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtramKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtramKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtramKeyTyped(evt);
            }
        });
        getContentPane().add(txtram, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 137, 143, -1));

        lbltiempo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbltiempo.setText("Tiempo de garantia:");
        getContentPane().add(lbltiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 175, -1, -1));

        txttiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttiempoActionPerformed(evt);
            }
        });
        txttiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttiempoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttiempoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttiempoKeyTyped(evt);
            }
        });
        getContentPane().add(txttiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 175, 143, -1));

        lblprecio.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblprecio.setText("Precio:");
        getContentPane().add(lblprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 213, -1, -1));

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprecioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 213, 143, -1));

        lblmarca.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblmarca.setText("Marca:");
        getContentPane().add(lblmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 310, -1, -1));

        cmbmarca.setBackground(new java.awt.Color(204, 255, 255));
        cmbmarca.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmbmarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LENOVO", "NEXUS", "GOOGLE", "PIXIE", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG" }));
        getContentPane().add(cmbmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 307, -1, -1));

        lblcamaras.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblcamaras.setText("Camaras:");
        getContentPane().add(lblcamaras, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 356, -1, -1));

        cbxprincipal.setBackground(new java.awt.Color(204, 204, 255));
        cbxprincipal.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cbxprincipal.setText("Principal");
        cbxprincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxprincipalMouseClicked(evt);
            }
        });
        getContentPane().add(cbxprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 352, -1, -1));

        cbxsecundaria.setBackground(new java.awt.Color(204, 204, 255));
        cbxsecundaria.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cbxsecundaria.setText("Secundaria");
        cbxsecundaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxsecundariaMouseClicked(evt);
            }
        });
        getContentPane().add(cbxsecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 352, -1, -1));

        cbxflash.setBackground(new java.awt.Color(204, 204, 255));
        cbxflash.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cbxflash.setText("Flash");
        getContentPane().add(cbxflash, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 352, -1, -1));

        txtprincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprincipalKeyTyped(evt);
            }
        });
        getContentPane().add(txtprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 382, 74, -1));

        txtsecundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsecundariaKeyTyped(evt);
            }
        });
        getContentPane().add(txtsecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 382, 74, -1));

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 485, 363, 118));

        btnejecutar.setBackground(new java.awt.Color(204, 255, 153));
        btnejecutar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnejecutar.setText("Ejecutar");
        btnejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnejecutarActionPerformed(evt);
            }
        });
        getContentPane().add(btnejecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 413, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(51, 0, 51));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 609, -1, -1));

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 609, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Capacidad de Bateria en ma");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 251, -1, -1));

        txtBateriaMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBateriaMaKeyPressed(evt);
            }
        });
        getContentPane().add(txtBateriaMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 251, 143, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public double BateriaPantalla() {
        double puntajeBP = 0;
        double comp = Double.parseDouble(txttamaño.getText());
        double ma = Double.parseDouble(txtBateriaMa.getText());
        if (comp <= 4) {
            if (ma == 1200) {
                puntajeBP = 3;
            } else if (ma > 1200 && ma < 2400) {
                puntajeBP = 4;
            } else if (ma > 2400 && ma < 3100) {
                puntajeBP = 5;
            } else if (ma > 3100) {
                puntajeBP = 6;
            }
        } else if (comp == 5) {
            if (ma <= 1200) {
                puntajeBP = 1;
            } else if (ma > 1200 && ma < 2400) {
                puntajeBP = 2;
            } else if (ma > 2400 && ma < 3100) {
                puntajeBP = 3;
            } else if (ma > 3100) {
                puntajeBP = 4;
            }
        }
        return puntajeBP;
    }

    public int refDeMarca() {
        int ref = 0;
        if (cmbmarca.getSelectedItem() == "NEXUS" || cmbmarca.getSelectedItem() == "GOOGLE" || cmbmarca.getSelectedItem() == "LENOVO" || cmbmarca.getSelectedItem() == "HUAWEI" || cmbmarca.getSelectedItem() == "SONY" || cmbmarca.getSelectedItem() == "APPLE") {
            ref = 4;
        } else if (cmbmarca.getSelectedItem() == "SAMSUNG" || cmbmarca.getSelectedItem() == "ALCATEL" || cmbmarca.getSelectedItem() == "LG") {
            ref = 3;
        } else {
            ref = 2;
        }

        return ref;
    }

    public double rangoPrecio() {
        double rango = 0;
        double precio = Double.parseDouble(txtprecio.getText());
        if (precio < 100) {
            rango = 2;
        } else if (precio >= 100 && precio <= 350) {
            rango = 3;
        } else if (precio > 350) {
            rango = 4;
        }
        return rango;
    }

    public double pixelaje() {
        double pixel = 0;
        int camarap = Integer.parseInt(txtprincipal.getText());
        int camaras = Integer.parseInt(txtsecundaria.getText());
        if (camarap <= 5) {
            if (camaras <= 2) {
                pixel = 1;
            } else if (camaras > 2) {
                pixel = 2;
            }

        } else if (camarap > 5 && camarap <= 8) {
            if (camaras < 2) {
                pixel = 1;
            } else if (camaras >= 2 && camaras <= 3) {
                pixel = 2;
            } else if (camaras > 3) {
                pixel = 3;
            }
        } else if (camarap > 8) {
            if (camaras < 2) {
                pixel = 1;
            } else if (camaras >= 2 && camaras < 5) {
                pixel = 2;
            } else if (camaras > 5) {
                pixel = 3;
            }

        } else {
            pixel = pixel - 1;
        }

        return pixel;
    }

    public double garantia() {
        double garan = 0;
        int gara = Integer.parseInt(txttiempo.getText());
        if (gara <= 3) {
            garan = 1;
        } else if (gara > 3 && gara < 6) {
            garan = 2;
        } else if (gara > 6) {
            garan = 4;
        }

        return garan;
    }

    public double CPU() {
        double cpu = 0;
        int valor = Integer.parseInt(txtCpu.getText());
        if (valor == 2) {
            cpu = 0;
        } else if (valor == 4) {
            cpu = 1;
        } else if (valor == 6) {
            cpu = 2;
        } else if (valor == 8) {
            cpu = 3;
        }
        return cpu;
    }

    public double Ram() {
        double ram = 0.0;
        int Ram1 = Integer.parseInt(txtram.getText());
        if (Ram1 <= 1) {
            ram = 0;
        } else if (Ram1 > 1 && Ram1 < 2) {
            ram = 2;
        } else if (Ram1 > 2 && Ram1 < 4) {
            ram = 4;
        } else if (Ram1 > 4) {
            ram = 6;
        }
        return ram;
    }

    public void Impresion() {
        double impre = 0;
        impre = BateriaPantalla() + refDeMarca() + rangoPrecio() + pixelaje() + garantia() + CPU() + Ram();
        if (impre <= 7) {
            JOptionPane.showMessageDialog(this, "No es buena inversion");
        } else if (impre > 7 && impre <= 14) {
            JOptionPane.showMessageDialog(null, "Inversion de Riesgo");
        } else if (impre >= 15 && impre < 21) {
            JOptionPane.showMessageDialog(this, "Inversion viable");
        } else if (impre > 22) {
            JOptionPane.showMessageDialog(this, "Buena Inversion");
        }

    }
    private void txtramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtramActionPerformed

    }//GEN-LAST:event_txtramActionPerformed

    private void btnejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnejecutarActionPerformed
        if (txtCpu.getText().isEmpty() || txtBateriaMa.getText().isEmpty() || txttiempo.getText().isEmpty() || txtprecio.getText().isEmpty() || txtprincipal.getText().isEmpty() || txtram.getText().isEmpty() || txtsecundaria.getText().isEmpty() || txttamaño.getText().isEmpty() || txttiempo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos antes de Ejecutar el programa");
        } else {
            String cpu;
            cpu = txtCpu.getText();

            if (cbxprincipal.isSelected() && cbxsecundaria.isSelected() && cbxflash.isSelected()) {
                texto.setText("Su numero de cpu es: " + cpu + "\nEl tamaño de la pantalla es: " + txttamaño.getText() + "\nLa memoria RAM es de: " + txtram.getText() + "\nLa garantia es de: " + txttiempo.getText() + "\nEl precio es de: " + txtprecio.getText() + "\nLa marca es: " + cmbmarca.getSelectedItem() + "\nPosee camara principal de " + txtprincipal.getText() + ", secundaria de " + txtsecundaria.getText() + " y flash");
            } else if (cbxprincipal.isSelected() && cbxsecundaria.isSelected()) {
                texto.setText("Su numero de cpu es: " + cpu + "\nEl tamaño de la pantalla es: " + txttamaño.getText() + "\nLa memoria RAM es de: " + txtram.getText() + "\nLa garantia es de: " + txttiempo.getText() + "\nEl precio es de: " + txtprecio.getText() + "\nLa marca es: " + cmbmarca.getSelectedItem() + "\nPosee camara principal de " + txtprincipal.getText() + " y secundaria de " + txtsecundaria.getText());
            } else if (cbxprincipal.isSelected() && cbxflash.isSelected()) {
                texto.setText("Su numero de cpu es: " + cpu + "\nEl tamaño de la pantalla es: " + txttamaño.getText() + "\nLa memoria RAM es de: " + txtram.getText() + "\nLa garantia es de: " + txttiempo.getText() + "\nEl precio es de: " + txtprecio.getText() + "\nLa marca es: " + cmbmarca.getSelectedItem() + "\nPosee camara principal de " + txtprincipal.getText() + " y flash");
            } else if (cbxsecundaria.isSelected() && cbxflash.isSelected()) {
                texto.setText("Su numero de cpu es: " + cpu + "\nEl tamaño de la pantalla es: " + txttamaño.getText() + "\nLa memoria RAM es de: " + txtram.getText() + "\nLa garantia es de: " + txttiempo.getText() + "\nEl precio es de: " + txtprecio.getText() + "\nLa marca es: " + cmbmarca.getSelectedItem() + "\nPosee camara secundaria de " + txtsecundaria.getText() + " y flash");
            } else if (cbxprincipal.isSelected()) {
                texto.setText("Su numero de cpu es: " + cpu + "\nEl tamaño de la pantalla es: " + txttamaño.getText() + "\nLa memoria RAM es de: " + txtram.getText() + "\nLa garantia es de: " + txttiempo.getText() + "\nEl precio es de: " + txtprecio.getText() + "\nLa marca es: " + cmbmarca.getSelectedItem() + "\nPosee camara principal de " + txtprincipal.getText());
            } else if (cbxsecundaria.isSelected()) {
                texto.setText("Su numero de cpu es: " + cpu + "\nEl tamaño de la pantalla es: " + txttamaño.getText() + "\nLa memoria RAM es de: " + txtram.getText() + "\nLa garantia es de: " + txttiempo.getText() + "\nEl precio es de: " + txtprecio.getText() + "\nLa marca es: " + cmbmarca.getSelectedItem() + "\nPosee camara secundaria de " + txtsecundaria.getText());
            } else if (cbxflash.isSelected()) {
                texto.setText("Su numero de cpu es: " + cpu + "\nEl tamaño de la pantalla es: " + txttamaño.getText() + "\nLa memoria RAM es de: " + txtram.getText() + "\nLa garantia es de: " + txttiempo.getText() + "\nEl precio es de: " + txtprecio.getText() + "\nLa marca es: " + cmbmarca.getSelectedItem() + "\nPosee camara con flash");
            } else {
                texto.setText("Su numero de cpu es: " + cpu + "\nEl tamaño de la pantalla es: " + txttamaño.getText() + "\nLa memoria RAM es de: " + txtram.getText() + "\nLa garantia es de: " + txttiempo.getText() + "\nEl precio es de: " + txtprecio.getText() + "\nLa marca es: " + cmbmarca.getSelectedItem() + "\nPosee camara principal de " + txtprincipal.getText() + ", secundaria de " + txtsecundaria.getText() + "y flash");
            }
            Impresion();
        }
    }//GEN-LAST:event_btnejecutarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Opciones op = new Opciones();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCpuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpuKeyPressed

        if (evt.getKeyCode() == 10) {
            txttamaño.requestFocus();
        }
    }//GEN-LAST:event_txtCpuKeyPressed
    String textoCpu = "";
    private void txtCpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpuKeyTyped
        char caracter = evt.getKeyChar();
        textoCpu = txtCpu.getText();
        if (textoCpu.length() >= 2) {
            evt.consume();
        } else if (caracter < '0' || caracter > '9') {
            evt.consume();

        }


    }//GEN-LAST:event_txtCpuKeyTyped

    private void txtCpuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpuKeyReleased
        textoCpu = txtCpu.getText();
        if (!txtCpu.getText().isEmpty()) {

            if (Integer.parseInt(textoCpu) <= 1 || Integer.parseInt(textoCpu) > 8) {

                txtCpu.setText("");
            }
        }
    }//GEN-LAST:event_txtCpuKeyReleased

    String txt;
    private void txttamañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttamañoKeyTyped
        txt = txttamaño.getText();
        char caracter = evt.getKeyChar();
        if (txt.length() >= 3) {
            evt.consume();
        } else if (txt.length() == 1) {
            if (caracter != '.') {
                evt.consume();
            }
        } else if (caracter < '0' || caracter > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txttamañoKeyTyped

    private void txttamañoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttamañoKeyReleased

    }//GEN-LAST:event_txttamañoKeyReleased

    private void txttamañoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttamañoKeyPressed

        if (evt.getKeyCode() == 10) {
            txtram.requestFocus();
        }
    }//GEN-LAST:event_txttamañoKeyPressed

    private void txtramKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtramKeyPressed

        if (evt.getKeyCode() == 10) {
            txttiempo.requestFocus();
        }
    }//GEN-LAST:event_txtramKeyPressed

    private void txtramKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtramKeyTyped
        char ram = evt.getKeyChar();
        if (Character.isDigit(ram) || ram == 46) {
            if (txtram.getText().length() > 2) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtramKeyTyped

    private void txtramKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtramKeyReleased
        if (!txtram.getText().isEmpty()) {
            if (Double.parseDouble(txtram.getText()) < 0.5 || Double.parseDouble(txtram.getText()) > 6.0) {
                txtram.setText("");
            }
        }
    }//GEN-LAST:event_txtramKeyReleased

    private void txttiempoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttiempoKeyPressed
        if (evt.getKeyCode() == 10) {
            txtprecio.requestFocus();
        }
    }//GEN-LAST:event_txttiempoKeyPressed

    private void txttiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttiempoKeyTyped
        char tiempo = evt.getKeyChar();
        if (Character.isDigit(tiempo) || tiempo == 46) {
            if (txttiempo.getText().length() > 1) {
                evt.consume();

            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txttiempoKeyTyped

    private void txttiempoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttiempoKeyReleased
        if (!txttiempo.getText().isEmpty()) {
            if (Double.parseDouble(txttiempo.getText()) < 1 || Double.parseDouble(txttiempo.getText()) > 24) {
                txttiempo.setText("");
            }
        }
    }//GEN-LAST:event_txttiempoKeyReleased

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        char precio = evt.getKeyChar();
        if (Character.isDigit(precio) || precio == 46) {
            if (txtprecio.getText().length() > 5) {
                evt.consume();
            }
        } else {
            evt.consume();
        }

    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtprecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyReleased
        if (!txtprecio.getText().isEmpty()) {
            if (Double.parseDouble(txtprecio.getText()) < 0.01 || Double.parseDouble(txtprecio.getText()) > 999.99) {
                txtprecio.setText("");
            }
        }
    }//GEN-LAST:event_txtprecioKeyReleased

    private void txtprecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyPressed
        if (evt.getKeyCode() == 10) {
            txtBateriaMa.requestFocus();
        }
    }//GEN-LAST:event_txtprecioKeyPressed

    private void cbxprincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxprincipalMouseClicked
        txtprincipal.setEnabled(true);

    }//GEN-LAST:event_cbxprincipalMouseClicked

    private void cbxsecundariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxsecundariaMouseClicked
        txtsecundaria.setEnabled(true);
    }//GEN-LAST:event_cbxsecundariaMouseClicked

    private void txttiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttiempoActionPerformed

    }//GEN-LAST:event_txttiempoActionPerformed

    private void txtCpuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpuFocusLost
        if (txtCpu.getText().isEmpty()) {

        } else if (Integer.parseInt(txtCpu.getText()) % 2 == 1) {
            JOptionPane.showMessageDialog(null, "Deben ser numero pares");
            txtCpu.setText("");
        }
    }//GEN-LAST:event_txtCpuFocusLost

    private void txttamañoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttamañoFocusLost

        if (!txttamaño.getText().isEmpty()) {
            if (txttamaño.getText().length() <= 2) {
                double num = Math.round(Double.parseDouble(txttamaño.getText()) * 10) / 10.0;
                txttamaño.setText("" + num);
            }
            txt = txttamaño.getText();
            if (txt.length() == 3) {
                if (Double.parseDouble(txt) < 3.0 || Double.parseDouble(txt) > 6.7) {
                    txttamaño.setText("");
                    JOptionPane.showMessageDialog(null, "Campo incorrecto");
                }
            }
        }
    }//GEN-LAST:event_txttamañoFocusLost

    private void txtprincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprincipalKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {

        } else {
            evt.consume();
        }

    }//GEN-LAST:event_txtprincipalKeyTyped

    private void txtsecundariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecundariaKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtsecundariaKeyTyped

    private void txtBateriaMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBateriaMaKeyPressed
       if (evt.getKeyCode() == 10) {
            cmbmarca.requestFocus();
        }
    }//GEN-LAST:event_txtBateriaMaKeyPressed

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
            java.util.logging.Logger.getLogger(Guia34.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guia34.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guia34.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guia34.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia34().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnejecutar;
    private javax.swing.JCheckBox cbxflash;
    private javax.swing.JCheckBox cbxprincipal;
    private javax.swing.JCheckBox cbxsecundaria;
    private javax.swing.JComboBox cmbmarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcamaras;
    private javax.swing.JLabel lblcpu;
    private javax.swing.JLabel lblencabezado;
    private javax.swing.JLabel lblmarca;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLabel lblram;
    private javax.swing.JLabel lbltamaño;
    private javax.swing.JLabel lbltiempo;
    private javax.swing.JTextArea texto;
    private javax.swing.JTextField txtBateriaMa;
    private javax.swing.JTextField txtCpu;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprincipal;
    private javax.swing.JTextField txtram;
    private javax.swing.JTextField txtsecundaria;
    private javax.swing.JTextField txttamaño;
    private javax.swing.JTextField txttiempo;
    // End of variables declaration//GEN-END:variables
}
