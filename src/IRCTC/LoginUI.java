package IRCTC;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class LoginUI extends javax.swing.JFrame {
    
    public LoginUI() {
		//Initialize UI and its components
        initComponents();
        
        //Setting icon for the program from the imported project resource
        setIconImage(Toolkit.getDefaultToolkit()
		.getImage(getClass().getResource("train.png")));
        
        //Setting background color of the form pane
         getContentPane().setBackground(new Color(20, 20, 20));
         
		 //Drawing a rounded corner rectangle for form
         this.setShape(new RoundRectangle2D.Double(0, 0,
		 this.size().width, this.size().height, 20, 20));
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _formMover = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailTb = new javax.swing.JTextField();
        loginBtn = new javax.swing.JLabel();
        passwordTb = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IRCTC Connect - Login");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(20, 20, 201));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        _formMover.setBackground(new java.awt.Color(51, 102, 255));
        _formMover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                _formMoverMouseDragged(evt);
            }
        });
        _formMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _formMoverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout _formMoverLayout = new javax.swing.GroupLayout(_formMover);
        _formMover.setLayout(_formMoverLayout);
        _formMoverLayout.setHorizontalGroup(
            _formMoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        _formMoverLayout.setVerticalGroup(
            _formMoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IRCTC/crossBtn2.png"))); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Visby Round CF", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("IRCTC");
        jLabel1.setAlignmentY(0.0F);

        jLabel2.setFont(new java.awt.Font("Visby Round CF", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 40, 40));
        jLabel2.setText("LOGIN TO");
        jLabel2.setAlignmentY(0.0F);

        jLabel3.setFont(new java.awt.Font("Visby Round CF", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(70, 70, 70));
        jLabel3.setText("Email :");
        jLabel3.setAlignmentY(0.0F);

        jLabel4.setFont(new java.awt.Font("Visby Round CF", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 70, 70));
        jLabel4.setText("Password :");
        jLabel4.setAlignmentY(0.0F);

        emailTb.setBackground(new java.awt.Color(20, 20, 20));
        emailTb.setFont(new java.awt.Font("Visby Round CF", 0, 14)); // NOI18N
        emailTb.setForeground(new java.awt.Color(0, 153, 255));
        emailTb.setToolTipText("Enter your email address");

        loginBtn.setBackground(new java.awt.Color(20, 20, 20));
        loginBtn.setFont(new java.awt.Font("Visby Round CF", 0, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(0, 153, 255));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("Login");
        loginBtn.setAlignmentY(0.0F);
        loginBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        passwordTb.setBackground(new java.awt.Color(20, 20, 20));
        passwordTb.setFont(new java.awt.Font("Visby Round CF", 0, 14)); // NOI18N
        passwordTb.setForeground(new java.awt.Color(0, 153, 255));

        jLabel5.setFont(new java.awt.Font("Visby Round CF", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 70, 70));
        jLabel5.setText("Don't have an account ? Sign up");
        jLabel5.setAlignmentY(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(289, 289, 289)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(_formMover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(237, 237, 237))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(emailTb, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(passwordTb)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)))
                        .addGap(12, 12, 12)))
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(closeBtn)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(231, 231, 231))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(_formMover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	//event when the window is opened
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
		
        
    }//GEN-LAST:event_formWindowOpened

    int posX=0,posY=0;
    private void _formMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__formMoverMousePressed
        // TODO add your handling code here:
        posX=evt.getX();
      posY=evt.getY();
    }//GEN-LAST:event__formMoverMousePressed

    private void _formMoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__formMoverMouseDragged
        // TODO add your handling code here:
        setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event__formMoverMouseDragged

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
        
         if (emailTb.getText().isBlank() || emailTb.getText().isEmpty() || passwordTb.getText().isBlank() || passwordTb.getText().isEmpty())
        {
            MessageBox("None of the fields can be empty", "Error");
            return;
        }
        
        if (!emailTb.getText().contains("@") || !emailTb.getText().contains("."))
        {
            MessageBox("Invalid email address !", "Error");
            return;
        }
        
        this.hide();
        MainUI main = new MainUI();
        main.setVisible(true);
        
    }//GEN-LAST:event_loginBtnMouseClicked

	//Custom form to show simple message box
    public void MessageBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage,
		titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
   
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginUI login = new LoginUI();
                login.setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel _formMover;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JTextField emailTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JPasswordField passwordTb;
    // End of variables declaration//GEN-END:variables
    
}