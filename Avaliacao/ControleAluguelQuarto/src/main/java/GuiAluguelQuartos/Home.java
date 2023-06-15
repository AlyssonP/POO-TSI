/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GuiAluguelQuartos;

import AluguelQuartos.Hospede;
import AluguelQuartos.HospedeRepository;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alysson Pereira
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setTitle("Aluguel Quartos");
        btnHomeMouseClicked(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnHospedes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnResidencias = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAlugueis = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        HomePage = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        HospedesPage = new javax.swing.JPanel();
        TitleHospedes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBuscarHospede = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaHospedes = new javax.swing.JTable();
        AlugueisPage = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ResidenciasPage = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        sidebar.setBackground(new java.awt.Color(0, 102, 204));
        sidebar.setPreferredSize(new java.awt.Dimension(220, 500));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AluguaQuarto");
        sidebar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        sidebar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 120, -1));

        btnHome.setBackground(new java.awt.Color(161, 193, 224));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        sidebar.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, -1));

        btnHospedes.setBackground(new java.awt.Color(82, 142, 201));
        btnHospedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHospedesMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hospedes");

        javax.swing.GroupLayout btnHospedesLayout = new javax.swing.GroupLayout(btnHospedes);
        btnHospedes.setLayout(btnHospedesLayout);
        btnHospedesLayout.setHorizontalGroup(
            btnHospedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHospedesLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(83, 83, 83))
        );
        btnHospedesLayout.setVerticalGroup(
            btnHospedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHospedesLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        sidebar.add(btnHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        btnResidencias.setBackground(new java.awt.Color(82, 142, 201));
        btnResidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResidenciasMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Residencias");

        javax.swing.GroupLayout btnResidenciasLayout = new javax.swing.GroupLayout(btnResidencias);
        btnResidencias.setLayout(btnResidenciasLayout);
        btnResidenciasLayout.setHorizontalGroup(
            btnResidenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnResidenciasLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91))
        );
        btnResidenciasLayout.setVerticalGroup(
            btnResidenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnResidenciasLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        sidebar.add(btnResidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, -1));

        btnAlugueis.setBackground(new java.awt.Color(82, 142, 201));
        btnAlugueis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlugueisMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alugueis");

        javax.swing.GroupLayout btnAlugueisLayout = new javax.swing.GroupLayout(btnAlugueis);
        btnAlugueis.setLayout(btnAlugueisLayout);
        btnAlugueisLayout.setHorizontalGroup(
            btnAlugueisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAlugueisLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel7)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        btnAlugueisLayout.setVerticalGroup(
            btnAlugueisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAlugueisLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        sidebar.add(btnAlugueis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, -1));

        Main.setLayout(new java.awt.CardLayout());

        HomePage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Home");

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(540, Short.MAX_VALUE))
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(491, Short.MAX_VALUE))
        );

        Main.add(HomePage, "cardHome");

        HospedesPage.setBackground(new java.awt.Color(255, 255, 255));
        HospedesPage.setForeground(new java.awt.Color(102, 102, 102));

        TitleHospedes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TitleHospedes.setText("Hospedes");

        jButton1.setText("Cadastrar Hospede");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atualizar dados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBuscarHospede.setText("Buscar Hospede");
        btnBuscarHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHospedeActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("CPF do Hospede");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        TabelaHospedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Endereco", "Telefone", "Email"
            }
        ));
        jScrollPane1.setViewportView(TabelaHospedes);

        javax.swing.GroupLayout HospedesPageLayout = new javax.swing.GroupLayout(HospedesPage);
        HospedesPage.setLayout(HospedesPageLayout);
        HospedesPageLayout.setHorizontalGroup(
            HospedesPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospedesPageLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(HospedesPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HospedesPageLayout.createSequentialGroup()
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarHospede))
                    .addGroup(HospedesPageLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel1)
                    .addComponent(TitleHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        HospedesPageLayout.setVerticalGroup(
            HospedesPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospedesPageLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(TitleHospedes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(HospedesPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarHospede)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(HospedesPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        Main.add(HospedesPage, "cardHospedes");

        AlugueisPage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Alugueis");

        javax.swing.GroupLayout AlugueisPageLayout = new javax.swing.GroupLayout(AlugueisPage);
        AlugueisPage.setLayout(AlugueisPageLayout);
        AlugueisPageLayout.setHorizontalGroup(
            AlugueisPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlugueisPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(515, Short.MAX_VALUE))
        );
        AlugueisPageLayout.setVerticalGroup(
            AlugueisPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlugueisPageLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(491, Short.MAX_VALUE))
        );

        Main.add(AlugueisPage, "card5");

        ResidenciasPage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Residencias");

        javax.swing.GroupLayout ResidenciasPageLayout = new javax.swing.GroupLayout(ResidenciasPage);
        ResidenciasPage.setLayout(ResidenciasPageLayout);
        ResidenciasPageLayout.setHorizontalGroup(
            ResidenciasPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResidenciasPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(485, Short.MAX_VALUE))
        );
        ResidenciasPageLayout.setVerticalGroup(
            ResidenciasPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResidenciasPageLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addContainerGap(491, Short.MAX_VALUE))
        );

        Main.add(ResidenciasPage, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        Color colorEnable = new Color(161,193,224);
        Color colordisabled = new Color(82,142,201);
//        HomePage.setVisible(true);
//        HospedesPage.setVisible(false);
        
        CardLayout cl = (CardLayout) Main.getLayout();
        cl.show(Main, "cardHome");
        
        btnHome.setBackground( colorEnable);
        btnHospedes.setBackground( colordisabled);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnHospedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHospedesMouseClicked
        // TODO add your handling code here:
        Color colorEnable = new Color(161,193,224);
        Color colorDisabled = new Color(82,142,201);
//        HomePage.setVisible(false);
//        HospedesPage.setVisible(true);
        
        CardLayout cl = (CardLayout) Main.getLayout();
        cl.show(Main, "cardHospedes");
        
        btnHome.setBackground( colorDisabled);
        btnHospedes.setBackground( colorEnable);
        
        ListarHospedes();
    }//GEN-LAST:event_btnHospedesMouseClicked

    private void btnResidenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResidenciasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResidenciasMouseClicked

    private void btnAlugueisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlugueisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlugueisMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarHospedeActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed
    
    private void ListarHospedes() {
        DefaultTableModel modelo = (DefaultTableModel) TabelaHospedes.getModel();
        modelo.setNumRows(0);
        HospedeRepository hospedeRepository = new HospedeRepository();
        for (Hospede hospede : hospedeRepository.consultarHospede()) {
            modelo.addRow(new Object[]{hospede.getCpf(), hospede.getNome(), hospede.getEndereco(), hospede.getCelular(), hospede.getEmail()});
        }
        
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlugueisPage;
    private javax.swing.JPanel HomePage;
    private javax.swing.JPanel HospedesPage;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel ResidenciasPage;
    private javax.swing.JTable TabelaHospedes;
    private javax.swing.JLabel TitleHospedes;
    private javax.swing.JPanel btnAlugueis;
    private javax.swing.JButton btnBuscarHospede;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnHospedes;
    private javax.swing.JPanel btnResidencias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
