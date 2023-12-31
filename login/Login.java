/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import java.awt.Color;

/**
 *
 * @author Pimienta
 */
public class Login extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        cabeza = new javax.swing.JPanel();
        cerrar = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        diseñoL = new javax.swing.JPanel();
        logoMini = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        passUsuario = new javax.swing.JPasswordField();
        entrarPanel = new javax.swing.JPanel();
        entrar = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cabeza.setBackground(new Color(0, 0, 0, 0));
        cabeza.setForeground(new java.awt.Color(51, 51, 51));
        cabeza.setToolTipText("");
        cabeza.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabezaMouseDragged(evt);
            }
        });
        cabeza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabezaMousePressed(evt);
            }
        });

        cerrar.setBackground(new java.awt.Color(214, 217, 223));
        cerrar.setForeground(new java.awt.Color(0, 0, 0));
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });

        x.setBackground(new java.awt.Color(255, 255, 255));
        x.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        x.setForeground(new java.awt.Color(0, 0, 0));
        x.setText("X");

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cerrarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(x)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cerrarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(x)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cabezaLayout = new javax.swing.GroupLayout(cabeza);
        cabeza.setLayout(cabezaLayout);
        cabezaLayout.setHorizontalGroup(
            cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabezaLayout.createSequentialGroup()
                    .addGap(0, 847, Short.MAX_VALUE)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        cabezaLayout.setVerticalGroup(
            cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cabezaLayout.createSequentialGroup()
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        back.add(cabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        diseñoL.setBackground(new java.awt.Color(51, 51, 51));

        logoMini.setFont(new java.awt.Font("Roboto Black", 1, 26)); // NOI18N
        logoMini.setForeground(new java.awt.Color(255, 255, 255));
        logoMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/mini-logo.png"))); // NOI18N
        logoMini.setText("  Lorem Ipsum");

        inicio.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        inicio.setForeground(new java.awt.Color(255, 255, 255));
        inicio.setText("INICIAR SESION");

        usuario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("USUARIO");

        textoUsuario.setBackground(new java.awt.Color(51, 51, 51));
        textoUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        textoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        textoUsuario.setText("Ingrese su nombre de usuario");
        textoUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textoUsuarioMousePressed(evt);
            }
        });
        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });

        contraseña.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("CONTRASEÑA");

        passUsuario.setBackground(new java.awt.Color(51, 51, 51));
        passUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        passUsuario.setForeground(new java.awt.Color(204, 204, 204));
        passUsuario.setText("jPasswordF");
        passUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        passUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passUsuarioMousePressed(evt);
            }
        });
        passUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passUsuarioActionPerformed(evt);
            }
        });

        entrarPanel.setBackground(new java.awt.Color(255, 255, 255));
        entrarPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarPanelMouseExited(evt);
            }
        });

        entrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        entrar.setForeground(new java.awt.Color(51, 51, 51));
        entrar.setText("ENTRAR");

        javax.swing.GroupLayout entrarPanelLayout = new javax.swing.GroupLayout(entrarPanel);
        entrarPanel.setLayout(entrarPanelLayout);
        entrarPanelLayout.setHorizontalGroup(
            entrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        entrarPanelLayout.setVerticalGroup(
            entrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entrar)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout diseñoLLayout = new javax.swing.GroupLayout(diseñoL);
        diseñoL.setLayout(diseñoLLayout);
        diseñoLLayout.setHorizontalGroup(
            diseñoLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diseñoLLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(diseñoLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuario)
                    .addComponent(inicio)
                    .addComponent(logoMini)
                    .addComponent(textoUsuario)
                    .addComponent(contraseña)
                    .addComponent(entrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        diseñoLLayout.setVerticalGroup(
            diseñoLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diseñoLLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(logoMini)
                .addGap(36, 36, 36)
                .addComponent(inicio)
                .addGap(18, 18, 18)
                .addComponent(usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(contraseña)
                .addGap(2, 2, 2)
                .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(entrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        back.add(diseñoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 510));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/image.png"))); // NOI18N
        back.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 280, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cabezaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabezaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_cabezaMousePressed

    private void cabezaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabezaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_cabezaMouseDragged

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        cerrar.setBackground(Color.red);
        cerrar.setForeground(Color.white);
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        cerrar.setBackground(new Color(214, 217, 223));
        
    }//GEN-LAST:event_cerrarMouseExited

    private void entrarPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarPanelMouseEntered
        entrarPanel.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_entrarPanelMouseEntered

    private void entrarPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarPanelMouseExited
        entrarPanel.setBackground(Color.WHITE);
    }//GEN-LAST:event_entrarPanelMouseExited

    private void textoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoUsuarioMousePressed
        if (textoUsuario.getText().equals("Ingrese su nombre de usuario")){
            textoUsuario.setText("");
        }
        if (String.valueOf(passUsuario.getPassword()).isEmpty()){
            passUsuario.setText("**********");
        }
    }//GEN-LAST:event_textoUsuarioMousePressed

    private void passUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passUsuarioMousePressed
        if (String.valueOf(passUsuario.getPassword()).equals("**********")){
            passUsuario.setText("");
        }
        if (textoUsuario.getText().isEmpty()){
            textoUsuario.setText("Ingrese su nombre de usuario");
        }
    }//GEN-LAST:event_passUsuarioMousePressed

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed

    }//GEN-LAST:event_textoUsuarioActionPerformed

    private void passUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back;
    private javax.swing.JPanel cabeza;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel contraseña;
    private javax.swing.JPanel diseñoL;
    private javax.swing.JLabel entrar;
    private javax.swing.JPanel entrarPanel;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoMini;
    private javax.swing.JPasswordField passUsuario;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
