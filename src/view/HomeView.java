/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author herma
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public HomeView() {
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

        containerPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        dokterPanel = new javax.swing.JPanel();
        dokterLabel = new javax.swing.JLabel();
        dokterMenu = new javax.swing.JLabel();
        obatPanel = new javax.swing.JPanel();
        obatLabel = new javax.swing.JLabel();
        obatMenu = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        pasienPanel = new javax.swing.JPanel();
        pasienLabel = new javax.swing.JLabel();
        pasienMenu = new javax.swing.JLabel();
        pasienPanel1 = new javax.swing.JPanel();
        pasienLabel1 = new javax.swing.JLabel();
        rmMenu = new javax.swing.JLabel();
        pasienPanel2 = new javax.swing.JPanel();
        pasienLabel2 = new javax.swing.JLabel();
        perawatanMenu = new javax.swing.JLabel();
        pasienPanel3 = new javax.swing.JPanel();
        pasienLabel3 = new javax.swing.JLabel();
        resepMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        containerPanel.setBackground(new java.awt.Color(239, 255, 251));

        headerPanel.setBackground(new java.awt.Color(80, 216, 144));

        titleLabel.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setText("ATMA CARE");

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Hospital.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoLabel)
                .addGap(67, 67, 67))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(logoLabel)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        dokterPanel.setBackground(new java.awt.Color(255, 255, 255));
        dokterPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        dokterLabel.setBackground(new java.awt.Color(0, 0, 0));
        dokterLabel.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        dokterLabel.setForeground(new java.awt.Color(0, 0, 0));
        dokterLabel.setText("Dokter");

        dokterMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/doctor.png"))); // NOI18N
        dokterMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dokterMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dokterPanelLayout = new javax.swing.GroupLayout(dokterPanel);
        dokterPanel.setLayout(dokterPanelLayout);
        dokterPanelLayout.setHorizontalGroup(
            dokterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dokterPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(dokterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dokterMenu)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dokterPanelLayout.createSequentialGroup()
                        .addComponent(dokterLabel)
                        .addGap(25, 25, 25)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        dokterPanelLayout.setVerticalGroup(
            dokterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dokterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dokterMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dokterLabel)
                .addContainerGap())
        );

        obatPanel.setBackground(new java.awt.Color(255, 255, 255));
        obatPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        obatPanel.setPreferredSize(new java.awt.Dimension(215, 178));

        obatLabel.setBackground(new java.awt.Color(0, 0, 0));
        obatLabel.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        obatLabel.setForeground(new java.awt.Color(0, 0, 0));
        obatLabel.setText("Obat");

        obatMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/medicine (2).png"))); // NOI18N
        obatMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obatMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout obatPanelLayout = new javax.swing.GroupLayout(obatPanel);
        obatPanel.setLayout(obatPanelLayout);
        obatPanelLayout.setHorizontalGroup(
            obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obatPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(obatLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obatPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(obatMenu)
                .addGap(41, 41, 41))
        );
        obatPanelLayout.setVerticalGroup(
            obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obatPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(obatMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(obatLabel)
                .addContainerGap())
        );

        logoutBtn.setBackground(new java.awt.Color(153, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        pasienPanel.setBackground(new java.awt.Color(255, 255, 255));
        pasienPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        pasienPanel.setPreferredSize(new java.awt.Dimension(215, 178));

        pasienLabel.setBackground(new java.awt.Color(0, 0, 0));
        pasienLabel.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        pasienLabel.setForeground(new java.awt.Color(0, 0, 0));
        pasienLabel.setText("Pasien");

        pasienMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/examination (1).png"))); // NOI18N
        pasienMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasienMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pasienPanelLayout = new javax.swing.GroupLayout(pasienPanel);
        pasienPanel.setLayout(pasienPanelLayout);
        pasienPanelLayout.setHorizontalGroup(
            pasienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pasienPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(pasienMenu)
                .addGap(32, 32, 32))
            .addGroup(pasienPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(pasienLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pasienPanelLayout.setVerticalGroup(
            pasienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pasienPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pasienMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pasienLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pasienPanel1.setBackground(new java.awt.Color(255, 255, 255));
        pasienPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        pasienPanel1.setPreferredSize(new java.awt.Dimension(215, 178));

        pasienLabel1.setBackground(new java.awt.Color(0, 0, 0));
        pasienLabel1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        pasienLabel1.setForeground(new java.awt.Color(0, 0, 0));
        pasienLabel1.setText("Rekam Medis");

        rmMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/medical-record.png"))); // NOI18N
        rmMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rmMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pasienPanel1Layout = new javax.swing.GroupLayout(pasienPanel1);
        pasienPanel1.setLayout(pasienPanel1Layout);
        pasienPanel1Layout.setHorizontalGroup(
            pasienPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pasienPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pasienPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rmMenu)
                    .addComponent(pasienLabel1))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pasienPanel1Layout.setVerticalGroup(
            pasienPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pasienPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rmMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasienLabel1)
                .addContainerGap())
        );

        pasienPanel2.setBackground(new java.awt.Color(255, 255, 255));
        pasienPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        pasienLabel2.setBackground(new java.awt.Color(0, 0, 0));
        pasienLabel2.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        pasienLabel2.setForeground(new java.awt.Color(0, 0, 0));
        pasienLabel2.setText("Perawatan");

        perawatanMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/medical.png"))); // NOI18N
        perawatanMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perawatanMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pasienPanel2Layout = new javax.swing.GroupLayout(pasienPanel2);
        pasienPanel2.setLayout(pasienPanel2Layout);
        pasienPanel2Layout.setHorizontalGroup(
            pasienPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pasienPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pasienPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perawatanMenu)
                    .addGroup(pasienPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pasienLabel2)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pasienPanel2Layout.setVerticalGroup(
            pasienPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pasienPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perawatanMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasienLabel2)
                .addContainerGap())
        );

        pasienPanel3.setBackground(new java.awt.Color(255, 255, 255));
        pasienPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        pasienPanel3.setPreferredSize(new java.awt.Dimension(215, 178));

        pasienLabel3.setBackground(new java.awt.Color(0, 0, 0));
        pasienLabel3.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        pasienLabel3.setForeground(new java.awt.Color(0, 0, 0));
        pasienLabel3.setText("Resep");

        resepMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/prescription (1).png"))); // NOI18N
        resepMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resepMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pasienPanel3Layout = new javax.swing.GroupLayout(pasienPanel3);
        pasienPanel3.setLayout(pasienPanel3Layout);
        pasienPanel3Layout.setHorizontalGroup(
            pasienPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pasienPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pasienLabel3)
                .addGap(71, 71, 71))
            .addGroup(pasienPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(resepMenu)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pasienPanel3Layout.setVerticalGroup(
            pasienPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pasienPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resepMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasienLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn))
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pasienPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pasienPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pasienPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dokterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(obatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pasienPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dokterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasienPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(obatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pasienPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasienPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasienPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(logoutBtn)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dokterMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dokterMenuMouseClicked
        // TODO add your handling code here:
      // TODO add your handling code here:
        DokterView dv = new DokterView();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_dokterMenuMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        switch(getAnswer){
            case 0:
                try{
                     LoginView lv = new LoginView();
                     this.dispose();
                     lv.setVisible(true);
                }catch(Exception e){
                    System.out.println("Error : " + e.getMessage());
                }
                break;
            case 1:
                break;
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void obatMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obatMenuMouseClicked
        // TODO add your handling code here:
        ObatView ov = new ObatView();
        this.dispose();
        ov.setVisible(true);
    }//GEN-LAST:event_obatMenuMouseClicked

    private void pasienMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasienMenuMouseClicked
        // TODO add your handling code here:
        PasienView pv = new PasienView();
        this.dispose();
        pv.setVisible(true);
    }//GEN-LAST:event_pasienMenuMouseClicked

    private void rmMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmMenuMouseClicked
        // TODO add your handling code here:
        RekamMedisView rmv = new RekamMedisView();
        this.dispose();
        rmv.setVisible(true);
    }//GEN-LAST:event_rmMenuMouseClicked

    private void perawatanMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perawatanMenuMouseClicked
        // TODO add your handling code here:
        PerawatanView pwv = new PerawatanView();
        this.dispose();
        pwv.setVisible(true);
    }//GEN-LAST:event_perawatanMenuMouseClicked

    private void resepMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resepMenuMouseClicked
        // TODO add your handling code here:
        ResepView rv = new ResepView();
        this.dispose();
        rv.setVisible(true);
    }//GEN-LAST:event_resepMenuMouseClicked

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel dokterLabel;
    private javax.swing.JLabel dokterMenu;
    private javax.swing.JPanel dokterPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel obatLabel;
    private javax.swing.JLabel obatMenu;
    private javax.swing.JPanel obatPanel;
    private javax.swing.JLabel pasienLabel;
    private javax.swing.JLabel pasienLabel1;
    private javax.swing.JLabel pasienLabel2;
    private javax.swing.JLabel pasienLabel3;
    private javax.swing.JLabel pasienMenu;
    private javax.swing.JPanel pasienPanel;
    private javax.swing.JPanel pasienPanel1;
    private javax.swing.JPanel pasienPanel2;
    private javax.swing.JPanel pasienPanel3;
    private javax.swing.JLabel perawatanMenu;
    private javax.swing.JLabel resepMenu;
    private javax.swing.JLabel rmMenu;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
