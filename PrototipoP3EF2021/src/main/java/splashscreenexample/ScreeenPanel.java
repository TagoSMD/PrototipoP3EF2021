
package splashscreenexample;

import javax.swing.JOptionPane;
import vista.LoginForm;

public class ScreeenPanel extends javax.swing.JFrame {

    public ScreeenPanel() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bar = new javax.swing.JProgressBar();
        Loadingvalue = new javax.swing.JLabel();
        chargevalue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 740, 20));

        Loadingvalue.setFont(new java.awt.Font("Berlin Sans FB", 2, 14)); // NOI18N
        Loadingvalue.setText("Cargando:");
        getContentPane().add(Loadingvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 290, 30));

        chargevalue.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 14)); // NOI18N
        chargevalue.setText("0%");
        getContentPane().add(chargevalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 450, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TagoKG\\Desktop\\Prototipo-rama\\PrototipoMVC\\src\\Images\\gradient (7).png")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 480));

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
            java.util.logging.Logger.getLogger(ScreeenPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreeenPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreeenPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreeenPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 ScreeenPanel sp = new ScreeenPanel();
        sp.setVisible(true);
            LoginForm login;
        login = new LoginForm();
        try{
            for(int i=0;i<=100;i++){
            Thread.sleep(100);
            sp.chargevalue.setText(i+"%");
            
            if(i==10){
                sp.Loadingvalue.setText("Cargando");
                
            }
            
              if(i==20){
                sp.Loadingvalue.setText("Cargando Seguridad");
                
            }
                if(i==50){
                sp.Loadingvalue.setText("Cargando Mantenimientos");
                
            }
                  if(i==80){
                sp.Loadingvalue.setText("Cargando ");
                
            }
                  sp.bar.setValue(i);
            
        }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         sp.setVisible(false);
         login.setVisible(true);
         sp.dispose();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreeenPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loadingvalue;
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel chargevalue;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
