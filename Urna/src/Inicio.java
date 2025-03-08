import java.awt.Color;
import javax.swing.ImageIcon;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Inicio extends javax.swing.JFrame 
{
    public Inicio()
    {
        initComponents();
        
        //frame
        setTitle("Simulador - Justiça Eleitoral"); //titulo do frame
        setSize(480,400); //tamanho largura e altura
        setDefaultCloseOperation(EXIT_ON_CLOSE); //fecha o cod
        setResizable(false); //não permite mudança no tamanho 
        setLocationRelativeTo(null); //abre no centro da tela
        getContentPane().setBackground(Color.lightGray); //muda cor do frame
        
        //simbolo do frame
        ImageIcon icone = new ImageIcon("src\\img\\simbolo.jpg");
        setIconImage(icone.getImage());   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        geral = new javax.swing.JButton();
        geral1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/votee.png"))); // NOI18N

        geral.setBackground(new java.awt.Color(0, 153, 153));
        geral.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        geral.setForeground(new java.awt.Color(255, 255, 255));
        geral.setText("GERAL");
        geral.setToolTipText("");
        geral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        geral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geralActionPerformed(evt);
            }
        });

        geral1.setBackground(new java.awt.Color(0, 153, 153));
        geral1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        geral1.setForeground(new java.awt.Color(255, 255, 255));
        geral1.setText("MUNICIPAL");
        geral1.setToolTipText("");
        geral1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        geral1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geral1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(geral, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(geral1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geral1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geral, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geralActionPerformed
        new Login().setVisible(true); //abre a Urna Geral
        this.dispose(); //fecha o frame 
    }//GEN-LAST:event_geralActionPerformed

    private void geral1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geral1ActionPerformed
        new LoginM().setVisible(true);
        this.dispose(); // fecha o frame
    }//GEN-LAST:event_geral1ActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geral;
    private javax.swing.JButton geral1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
