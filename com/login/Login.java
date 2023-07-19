/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

/**
 *
 * @author Pimienta
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        diseñoL = new javax.swing.JPanel();
        logoMini = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        passUsuario = new javax.swing.JPasswordField();
        entrarPanel = new javax.swing.JPanel();
        entrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        contraseña.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("CONTRASEÑA");

        passUsuario.setBackground(new java.awt.Color(51, 51, 51));
        passUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        passUsuario.setForeground(new java.awt.Color(204, 204, 204));
        passUsuario.setText("jPasswordField1");
        passUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        entrarPanel.setBackground(new java.awt.Color(255, 255, 255));
        entrarPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                .addGap(57, 57, 57)
                .addGroup(diseñoLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuario)
                    .addComponent(inicio)
                    .addComponent(logoMini)
                    .addComponent(textoUsuario)
                    .addComponent(contraseña)
                    .addComponent(entrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        diseñoLLayout.setVerticalGroup(
            diseñoLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diseñoLLayout.createSequentialGroup()
                .addGap(106, 106, 106)
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
                .addContainerGap(23, Short.MAX_VALUE))
        );

        back.add(diseñoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 510));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(44, 44));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 844, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        back.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

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
    private javax.swing.JLabel contraseña;
    private javax.swing.JPanel diseñoL;
    private javax.swing.JLabel entrar;
    private javax.swing.JPanel entrarPanel;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoMini;
    private javax.swing.JPasswordField passUsuario;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}