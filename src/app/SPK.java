/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.awt.Frame;
import java.awt.HeadlessException;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oop.Alternatif;

/**
 *
 * @author idham
 */
public class SPK extends javax.swing.JFrame {
//    long IDAlternatif;
//    Alternatif alternatif;
    
    /**
     * Creates new form SPK
     */
    public SPK() {

        initComponents();

        setLocationRelativeTo(null);
        setExtendedState(Frame.MAXIMIZED_BOTH);

        loadAlternatif("");
        loadKriteria("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnTambahAlternatif = new app.ButtonTrans();
        btnHapusAlternatif = new app.ButtonTrans();
        btnEditAlternatif = new app.ButtonTrans();
        txtCariAlternatif = new javax.swing.JTextField();
        btnCariAlternatif = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAlternatif = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnTambahKriteria = new app.ButtonTrans();
        btnEditKriteria = new app.ButtonTrans();
        btnHapusKriteria = new app.ButtonTrans();
        txtCariKriteria = new javax.swing.JTextField();
        btnCariKriteria = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelKriteria = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        buttonTrans3 = new app.ButtonTrans();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelSPK = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(748, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel6.setPreferredSize(new java.awt.Dimension(748, 50));

        btnTambahAlternatif.setText("+ Alternatif");
        btnTambahAlternatif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahAlternatifActionPerformed(evt);
            }
        });

        btnHapusAlternatif.setText("Hapus");
        btnHapusAlternatif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusAlternatifActionPerformed(evt);
            }
        });

        btnEditAlternatif.setText("Edit");
        btnEditAlternatif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAlternatifActionPerformed(evt);
            }
        });

        txtCariAlternatif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariAlternatifActionPerformed(evt);
            }
        });

        btnCariAlternatif.setText("Cari");
        btnCariAlternatif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariAlternatifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTambahAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapusAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(txtCariAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCariAlternatif)
                .addGap(96, 96, 96))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCariAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCariAlternatif))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambahAlternatif, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(btnHapusAlternatif, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(btnEditAlternatif, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        tabelAlternatif.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelAlternatif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAlternatifMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelAlternatif);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Alternatif", jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel7.setPreferredSize(new java.awt.Dimension(748, 50));

        btnTambahKriteria.setText("+ Kriteria");
        btnTambahKriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKriteriaActionPerformed(evt);
            }
        });

        btnEditKriteria.setText("Edit");

        btnHapusKriteria.setText("Hapus");

        txtCariKriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariKriteriaActionPerformed(evt);
            }
        });

        btnCariKriteria.setText("Cari");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTambahKriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditKriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHapusKriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(txtCariKriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCariKriteria)
                .addGap(97, 97, 97))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahKriteria, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnEditKriteria, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnHapusKriteria, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(txtCariKriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariKriteria))
                .addContainerGap())
        );

        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        tabelKriteria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelKriteria);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Kriteria", jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(748, 50));

        buttonTrans3.setText("Lakukan Proses SAW");
        buttonTrans3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrans3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonTrans3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(524, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonTrans3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        tabelSPK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabelSPK);

        jPanel5.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("SPK (SAW)", jPanel5);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTrans3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrans3ActionPerformed
        // TODO add your handling code here:
        SPK();
    }//GEN-LAST:event_buttonTrans3ActionPerformed

    private void btnEditAlternatifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAlternatifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditAlternatifActionPerformed

    private void btnTambahKriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKriteriaActionPerformed
        // TODO add your handling code here:
        TambahKriteria TK = new TambahKriteria(this, true);
        TK.setVisible(true); 
    }//GEN-LAST:event_btnTambahKriteriaActionPerformed

    private void btnTambahAlternatifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahAlternatifActionPerformed
        // TODO add your handling code here:
        TambahAlternatif TA = new TambahAlternatif(this, true);
        TA.setVisible(true); 
    }//GEN-LAST:event_btnTambahAlternatifActionPerformed

    private void tabelAlternatifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAlternatifMouseClicked
        // TODO add your handling code here:
//        int index = tabelAlternatif.getSelectedRow();
//        if(index != -1){
//            String id = tabelAlternatif.getValueAt(index, 0).toString();
//            long TheID = Long.parseLong(id);
//            IDAlternatif = TheID;
//            
//            String Alternatifs = tabelAlternatif.getValueAt(index, 1).toString();
//            String harga = tabelAlternatif.getValueAt(index, 2).toString();
//            String jml_ulasan_p = tabelAlternatif.getValueAt(index, 3).toString();
//            String prestasi_mentor = tabelAlternatif.getValueAt(index, 4).toString();
//            String kecepatan_server = tabelAlternatif.getValueAt(index, 5).toString();
//            String tk_pemakaian = tabelAlternatif.getValueAt(index, 4).toString();
//            
//            alternatif = new Alternatif();
//            alternatif.setId(id);
////            alternatif.setAlternatif(alternatifes);
//            alternatif.setAlternatifs(Alternatifs);
//            alternatif.setHarga(harga); 
//            alternatif.setJml_ulasan_p(jml_ulasan_p); 
//            alternatif.setPrestasi_mentor(prestasi_mentor); 
//            alternatif.setKecepatan_server(kecepatan_server); 
//            alternatif.setTk_pemakaian(tk_pemakaian); 
    }//GEN-LAST:event_tabelAlternatifMouseClicked

    private void btnHapusAlternatifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusAlternatifActionPerformed
        // TODO add your handling code here:
//        HapusDataAlternatif();
    }//GEN-LAST:event_btnHapusAlternatifActionPerformed

    private void txtCariKriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariKriteriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariKriteriaActionPerformed

    private void txtCariAlternatifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariAlternatifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariAlternatifActionPerformed

    private void btnCariAlternatifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariAlternatifActionPerformed
        // TODO add your handling code here:
        String key = txtCariAlternatif.getText();
        String where = "select * from alternatif WHERE"
                + " id LIKE '%"+key+"%' OR "
                + "alternatif '%"+key+"%' OR "
                + "harga LIKE '%"+key+"%' OR "
                + "jml_ulasan_p LIKE '%"+key+"%' OR "
                + "pretasi_mentor LIKE '%"+key+"%' OR "
                + "kecepatan_server LIKE '%"+key+"%' OR "
                + "tk_pemakaian LIKE '%"+key+"%'";
        loadAlternatif("SELECT "+where);
    }//GEN-LAST:event_btnCariAlternatifActionPerformed

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
            java.util.logging.Logger.getLogger(SPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SPK().setVisible(true);
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariAlternatif;
    private javax.swing.JButton btnCariKriteria;
    private app.ButtonTrans btnEditAlternatif;
    private app.ButtonTrans btnEditKriteria;
    private app.ButtonTrans btnHapusAlternatif;
    private app.ButtonTrans btnHapusKriteria;
    private app.ButtonTrans btnTambahAlternatif;
    private app.ButtonTrans btnTambahKriteria;
    private app.ButtonTrans buttonTrans3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable tabelAlternatif;
    public static javax.swing.JTable tabelKriteria;
    private javax.swing.JTable tabelSPK;
    private javax.swing.JTextField txtCariAlternatif;
    private javax.swing.JTextField txtCariKriteria;
    // End of variables declaration//GEN-END:variables

    public static void loadAlternatif(String where) {
        try {
            //design tabel
            Object[][] baris = null;
            Object[] header = {"ID", "ALTERNATIF", "HARGA", "JUMLAH ULASAN POSITIF", "PRESTASI MENTOR", "KECEPATAN SERVER", "TK PEMAKAIAN"};
            DefaultTableModel model = new DefaultTableModel(baris, header);
            tabelAlternatif.setModel(model);

//              Object[] header = {"ID", "ALTERNATIF", "HARGA", "JUMLAH ULASAN POSITIF", "PRESTASI MENTOR", "KECEPATAN SERVER", "TK PEMAKAIAN"};
//              DefaultTableModel model = new DefaultTableModel(null, header);
//              tabelAlternatif.setModel(model); 
            //read data from db
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String query = "SELECT * FROM alternatif"+where;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String alternatif = rs.getString("alternatif");
                String harga = rs.getString("harga");
                String jml_ulasan_p = rs.getString("jml_ulasan_p");
                String prestasi_mentor = rs.getString("prestasi_mentor");
                String kecepatan_server = rs.getString("kecepatan_server");
                String tk_pemakaian = rs.getString("tk_pemakaian");
//                String keawetan = rs.getString("keawetan");
                Object[] data = {id, alternatif, harga, jml_ulasan_p, prestasi_mentor, kecepatan_server, tk_pemakaian};
                model.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
     private void HapusDataAlternatif() {
        if(IDAlternatif > 0){
            try {
                Object[] tombol = {"YA", "Tidak"};
                int option = JOptionPane.showOptionDialog(this, 
                        "Apakah anda ingin menghapus data?", 
                        "Konfirmasi", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.INFORMATION_MESSAGE, null, tombol, 0);
                if(option == 0){
                    //YA
                    //YES
                    Connection c = Koneksi.konekKeDB();
                    Statement st = c.createStatement();
                    String sql = "DELETE FROM konsumen WHERE id_konsumen='"+IDAlternatif+"'";
                    //eksekusi query
                    st.executeUpdate(sql);
                    //refresh view table
                    loadAlternatif(""); 
                    JOptionPane.showMessageDialog(this, "Data telah dihapus");
                }                
            } catch (HeadlessException | SQLException e) {
            }
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih Data"); 
        }
    }

    public static void loadKriteria(String where) {
        try {
            //design tabel
            Object[][] baris = null;
            Object[] header = {"ID", "KRITERIA", "BOBOT", "LABEL"};
            DefaultTableModel model = new DefaultTableModel(baris, header);
            tabelKriteria.setModel(model);

            //read data from db
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String query = "SELECT * FROM kriteria"+where;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String kriteria = rs.getString("kriteria");
                String bobot = rs.getString("bobot");
                String label = rs.getString("label");

                Object[] data = {id, kriteria, bobot, label};
                model.addRow(data);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void SPK() {
        try {
            Object[] header = {"NO","ALTERNATIF","BOBOT"};
            Object[][] data = null;
            DefaultTableModel model = new DefaultTableModel(data, header);
            tabelSPK.setModel(model); 
            int nomor = 0;
            
            //
            List<Double> L_hasil = new ArrayList();
            
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String q = "SELECT * FROM alternatif";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                int id = rs.getInt("id");
                String alternatif = rs.getString("alternatif");

                double harga = rs.getDouble("harga");
                double jml_ulasan_p = rs.getDouble("jml_ulasan_p");
                double prestasi_mentor = rs.getDouble("prestasi_mentor");
                double kecepatan_server = rs.getDouble("kecepatan_server");
                double tk_pemakaian = rs.getDouble("tk_pemakaian");
//                double keawetan = rs.getDouble("keawetan");

                double pem_harga = label("harga").equals("cost") ? MIN("harga") : MAX("harga");
                double pem_jml_ulasan_p = label("jml_ulasan_p").equals("cost") ? MIN("jml_ulasan_p") : MAX("jml_ulasan_p");
                double pem_prestasi_mentor = label("prestasi_mentor").equals("cost") ? MIN("prestasi_mentor") : MAX("prestasi_mentor");
                double pem_kecepatan_server = label("kecepatan_server").equals("cost") ? MIN("kecepatan_server") : MAX("kecepatan_server");
                double pem_tk_pemakaian = label("tk_pemakaian").equals("cost") ? MIN("tk_pemakaian") : MAX("tk_pemakaian");
//                double pem_keawetan = label("keawetan").equals("cost") ? MIN("keawetan") : MAX("keawetan");
                
                double norm_harga = label("harga").equals("cost") ? MIN("harga")/harga : harga/MAX("harga");
                double norm_jml_ulasan_p = label("jml_ulasan_p").equals("cost") ? MIN("jml_ulasan_p")/jml_ulasan_p : jml_ulasan_p/MAX("jml_ulasan_p");
                double norm_prestasi_mentor = label("prestasi_mentor").equals("cost") ? MIN("prestasi_mentor")/prestasi_mentor : prestasi_mentor/MAX("prestasi_mentor");
                double norm_kecepatan_server = label("kecepatan_server").equals("cost") ? MIN("kecepatan_server")/kecepatan_server : kecepatan_server/MAX("kecepatan_server");
                double norm_tk_pemakaian = label("tk_pemakaian").equals("cost") ? MIN("tk_pemakaian")/tk_pemakaian : tk_pemakaian/MAX("tk_pemakaian");
//                double norm_keawetan = label("keawetan").equals("cost") ? MIN("keawetan")/keawetan : keawetan/MAX("keawetan");
                
                double hasil = (bobot("harga")*norm_harga)+(bobot("jml_ulasan_p")*norm_jml_ulasan_p)+(bobot("prestasi_mentor")*norm_prestasi_mentor)+(bobot("kecepatan_server")*norm_kecepatan_server)+(bobot("tk_pemakaian")*norm_tk_pemakaian);
                L_hasil.add(hasil);
                nomor++;
                Object[] rowData = {nomor,alternatif,hasil};
                model.addRow(rowData);                 
            }
//            String hasil_alternatif = rs.getString("alternatif",[]);
            double bobotTerbaik = Collections.max(L_hasil); 
            jLabel1.setText("Bobot terbaik: "+bobotTerbaik); 
            
        } catch (Exception e) {
        }
    }

    private double MIN(String kriteria) {
        double min = 0;
        try {
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String q = "SELECT MIN(" + kriteria + ") AS min_kriteria FROM alternatif";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                min = rs.getDouble("min_kriteria");
            }
            return min;

        } catch (Exception e) {
                 System.err.println("ini error spk: "+e.getMessage());
        }
        return min;
    }

    private double MAX(String kriteria) {
        double max = 0;
        try {
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String q = "SELECT MAX(" + kriteria + ") AS max_kriteria FROM alternatif";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                max = rs.getDouble("max_kriteria");
            }
            return max;

        } catch (Exception e) {
        }
        return max;
    }

    private String label(String kriteria) {
        String label = "cost";
        try {
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String q = "SELECT label FROM kriteria WHERE kriteria='" + kriteria + "'";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                label = rs.getString("label");
            }
            return label;
        } catch (Exception e) {
        }

        return label;
    }
    
    private double bobot(String kriteria) {
        double bobot = 0;
        try {
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String q = "SELECT bobot FROM kriteria WHERE kriteria='" + kriteria + "'";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                bobot = rs.getDouble("bobot");
            }
            return bobot;
        } catch (Exception e) {
        }

        return bobot;
    }
}
