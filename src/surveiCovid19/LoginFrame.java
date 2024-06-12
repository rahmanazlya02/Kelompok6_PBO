/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package surveiCovid19;

import java.awt.Color;
import static java.awt.SystemColor.text;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import surveiCovid19.component.Register;

/**
 */
public class LoginFrame extends javax.swing.JFrame {
    
    public LoginFrame() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentScrollPane = new javax.swing.JScrollPane();
        sideLogin = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        contentLogin = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        titleLabel1 = new javax.swing.JLabel();
        resetButton1 = new javax.swing.JButton();
        register = new javax.swing.JButton();
        titleLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel1 = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideLogin.setBackground(new java.awt.Color(81, 137, 198));
        sideLogin.setPreferredSize(new java.awt.Dimension(250, 400));

        label1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        label1.setForeground(new java.awt.Color(244, 242, 242));
        label1.setText("Survei Dampak Covid-19 Terhadap Pelaku Usaha");
        label1.setVisible(true);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/13561786_5285960-01.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(339, 322));

        label2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(244, 242, 242));
        label2.setText("untuk mengetahui pengaruh Covid-19 terhadap sektor ekonomi.");

        label3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(244, 242, 242));
        label3.setText("pengumpulan data mengenai perusahaan dan kondisi finansialnya");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/13561786_5285960-01.png"))); // NOI18N

        javax.swing.GroupLayout sideLoginLayout = new javax.swing.GroupLayout(sideLogin);
        sideLogin.setLayout(sideLoginLayout);
        sideLoginLayout.setHorizontalGroup(
            sideLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLoginLayout.createSequentialGroup()
                .addGroup(sideLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideLoginLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(sideLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(sideLoginLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        sideLoginLayout.setVerticalGroup(
            sideLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLoginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        getContentPane().add(sideLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 650));

        contentLogin.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.hoverBackground"));
        contentLogin.setToolTipText("");
        contentLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(4, 84, 151));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("Welcome Back");

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 51, 51));
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("Password");

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(81, 137, 198));
        loginButton.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(244, 242, 242));
        loginButton.setText("Log In");
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setPreferredSize(new java.awt.Dimension(82, 25));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(153, 153, 153));
        resetButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resetButton.setForeground(new java.awt.Color(153, 153, 153));
        resetButton.setText("Reset");
        resetButton.setBorder(null);
        resetButton.setContentAreaFilled(false);
        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resetButton.setMargin(new java.awt.Insets(1, 0, 1, 1));
        resetButton.setPreferredSize(new java.awt.Dimension(82, 25));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        titleLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLabel1.setForeground(java.awt.Color.darkGray);
        titleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel1.setText("Log in your account");

        resetButton1.setBackground(new java.awt.Color(153, 153, 153));
        resetButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resetButton1.setForeground(new java.awt.Color(153, 153, 153));
        resetButton1.setText("Forgot password?");
        resetButton1.setBorder(null);
        resetButton1.setContentAreaFilled(false);
        resetButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resetButton1.setMargin(new java.awt.Insets(1, 0, 1, 1));
        resetButton1.setPreferredSize(new java.awt.Dimension(82, 25));
        resetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButton1ActionPerformed(evt);
            }
        });

        register.setBackground(new java.awt.Color(153, 153, 153));
        register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(81, 137, 198));
        register.setText("Register");
        register.setBorder(null);
        register.setContentAreaFilled(false);
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        register.setMargin(new java.awt.Insets(1, 0, 1, 1));
        register.setPreferredSize(new java.awt.Dimension(82, 25));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        titleLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLabel2.setForeground(java.awt.Color.darkGray);
        titleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel2.setText("Dont' have an account?");

        javax.swing.GroupLayout contentLoginLayout = new javax.swing.GroupLayout(contentLogin);
        contentLogin.setLayout(contentLoginLayout);
        contentLoginLayout.setHorizontalGroup(
            contentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(contentLoginLayout.createSequentialGroup()
                .addGroup(contentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLoginLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(contentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentLoginLayout.createSequentialGroup()
                                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                                    .addComponent(resetButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(loginButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(contentLoginLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(titleLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        contentLoginLayout.setVerticalGroup(
            contentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLoginLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLabel1)
                .addGap(46, 46, 46)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel2))
                .addGap(97, 97, 97)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        getContentPane().add(contentLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 620, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 620, 620));

        panel1.setVisible(false);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 620, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        clearForm();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        String username = usernameTextField.getText();
        String password = passwordField.getText();
        
        try{
            System.out.println(Database.getInstance().getUser(username).getUsername());
            if (username.equals(Database.getInstance().getUser(username).getUsername())){
                if (password.equals(Database.getInstance().getUser(username).getPassword())) {
                    new MainFrame().setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Username / Password Tidak Sesuai");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Username / Password Tidak Sesuai");
            }
                
        } catch (SQLException ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void resetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetButton1ActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        contentLogin.setVisible(false); 
        jScrollPane1.setViewportView(new Register());
    }//GEN-LAST:event_registerActionPerformed

    private void clearForm(){
        usernameTextField.setText("");
        passwordField.setText("");
    } 
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LoginFrame().setUndercorated(false);
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentLogin;
    private javax.swing.JScrollPane contentScrollPane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JButton loginButton;
    private java.awt.Panel panel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton register;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton resetButton1;
    private javax.swing.JPanel sideLogin;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

}
