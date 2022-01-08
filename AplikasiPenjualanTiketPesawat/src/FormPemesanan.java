
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class FormPemesanan extends javax.swing.JFrame {

    private Connection conn;

    String id_jadwal = "";

    /**
     * Creates new form pemesanan
     */
    public FormPemesanan() throws SQLException {
        this.conn = config.configDB();
        initComponents();
        cb_awal.removeAllItems();
        cb_tujuan.removeAllItems();
        load_table();
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
        jLabel1 = new javax.swing.JLabel();
        tb_nik = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tb_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tb_telepon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tb_jumlah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_awal = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cb_tujuan = new javax.swing.JComboBox<>();
        bt_cek = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_list = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tb_kodejadwal = new javax.swing.JTextField();
        tb_total = new javax.swing.JTextField();
        bt_pesan = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        bt_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pemesanan", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("NIK");

        jLabel2.setText("Nama");

        jLabel3.setText("Telepon");

        jLabel4.setText("Jumlah");

        jLabel5.setText("Kota Awal");

        cb_awal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_awalActionPerformed(evt);
            }
        });

        jLabel6.setText("Kota Tujuan");

        bt_cek.setBackground(new java.awt.Color(102, 153, 255));
        bt_cek.setText("Cek");
        bt_cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_cek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tb_nik)
                                    .addComponent(tb_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tb_telepon)
                                        .addComponent(tb_jumlah)
                                        .addComponent(cb_awal, 0, 158, Short.MAX_VALUE)))))
                        .addGap(0, 186, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tb_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tb_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tb_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tb_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_awal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cb_tujuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_cek))
        );

        tbl_list.setBackground(new java.awt.Color(204, 204, 255));
        tbl_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Jadwal", "Maskapai", "Keberangkatan", "Kedatangan", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_list);

        jLabel7.setText("Kode Jadwal");

        jLabel8.setText("Total");

        tb_kodejadwal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tb_kodejadwal.setEnabled(false);
        tb_kodejadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_kodejadwalActionPerformed(evt);
            }
        });

        tb_total.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tb_total.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tb_kodejadwal)
                    .addComponent(tb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tb_kodejadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tb_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_pesan.setBackground(new java.awt.Color(102, 153, 255));
        bt_pesan.setText("Submit");
        bt_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesanActionPerformed(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(102, 153, 255));
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        bt_refresh.setBackground(new java.awt.Color(102, 153, 255));
        bt_refresh.setText("Refresh");
        bt_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_pesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdmin)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmin)
                    .addComponent(bt_refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_pesan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cekActionPerformed
        // TODO add your handling code here:
        if (cb_awal.getSelectedIndex() != cb_tujuan.getSelectedIndex()) {
            tb_kodejadwal.setText("");
            tb_total.setText("");
            String kota_awal_cb = cb_awal.getSelectedItem().toString();
            String kota_awal = kota_awal_cb.substring(0, 4);
            String kota_tujuan_cb = cb_tujuan.getSelectedItem().toString();
            String kota_tujuan = kota_tujuan_cb.substring(0, 4);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Kode Jadwal");
            model.addColumn("Maskapai");
            model.addColumn("Keberangkatan");
            model.addColumn("Kedatangan");
            model.addColumn("Harga");
            try {
                String sql = "SELECT jadwal.ID_JADWAL, pesawat.MASKAPAI, jadwal.KEBERANGKATAN, jadwal.KEDATANGAN, jadwal.HARGA FROM\n"
                        + "jadwal, pesawat WHERE jadwal.ID_PESAWAT = pesawat.ID_PESAWAT\n"
                        + "AND jadwal.KOTA_AWAL = '" + kota_awal + "'\n"
                        + "AND jadwal.KOTA_TUJUAN = '" + kota_tujuan + "'";
                java.sql.Connection conn = (Connection) config.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                //JOptionPane.showMessageDialog(null, (res.first() == false));
                if (res.first() == true) {
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
                    while (res.next()) {
                        model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Jadwal penerbangan tidak tersedia!");
                }
                tbl_list.setModel(model);
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Kota awal dan tujuan tidak boleh sama!");
        }
    }//GEN-LAST:event_bt_cekActionPerformed

    private void tbl_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listMouseClicked
        // TODO add your handling code here:
        int baris = tbl_list.rowAtPoint(evt.getPoint());
        tb_kodejadwal.setText(tbl_list.getValueAt(baris, 0).toString());
        id_jadwal = tbl_list.getValueAt(baris, 0).toString();
        int total = Integer.parseInt(String.valueOf(tbl_list.getValueAt(baris, 4))) * Integer.parseInt(tb_jumlah.getText());
        tb_total.setText(String.valueOf(total));
    }//GEN-LAST:event_tbl_listMouseClicked

    private void tb_kodejadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_kodejadwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_kodejadwalActionPerformed

    private void bt_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesanActionPerformed
        int jumlah = Integer.parseInt(tb_jumlah.getText());
        int total = Integer.parseInt(tb_total.getText());
        String sql = "insert into pemesanan (id_jadwal, nik, nama, telpon, "
                + "jumlah_tiket, total) values (?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id_jadwal);
            stat.setString(2, tb_nik.getText());
            stat.setString(3, tb_nama.getText());
            stat.setString(4, tb_telepon.getText());
            stat.setInt(5, jumlah);
            stat.setInt(6, total);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN");
            //kosong();
            //txtKode.requestFocus();
            //load_table();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN" + e);
        }
    }//GEN-LAST:event_bt_pesanActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        FormLogin k = null;
        try {
            k = new FormLogin();
        } catch (SQLException ex) {
            Logger.getLogger(FormMenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        k.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void cb_awalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_awalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_awalActionPerformed

    private void bt_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_refreshActionPerformed
        // TODO add your handling code here:
        cb_awal.removeAllItems();
        cb_tujuan.removeAllItems();
        load_table();
    }//GEN-LAST:event_bt_refreshActionPerformed

    private void load_table() {
        // membuat tampilan model tabel

        //menampilkan data database kedalam tabel
        try {
            String sql_kota = "SELECT * FROM kota";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res;
            res = stm.executeQuery(sql_kota);
            while (res.next()) {
                cb_awal.addItem(res.getString(1) + " - " + res.getString(2));
                cb_tujuan.addItem(res.getString(1) + " - " + res.getString(2));
            }
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(FormPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new FormPemesanan().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormPemesanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cek;
    private javax.swing.JButton bt_pesan;
    private javax.swing.JButton bt_refresh;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JComboBox<String> cb_awal;
    private javax.swing.JComboBox<String> cb_tujuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tb_jumlah;
    private javax.swing.JTextField tb_kodejadwal;
    private javax.swing.JTextField tb_nama;
    private javax.swing.JTextField tb_nik;
    private javax.swing.JTextField tb_telepon;
    private javax.swing.JTextField tb_total;
    private javax.swing.JTable tbl_list;
    // End of variables declaration//GEN-END:variables
}
