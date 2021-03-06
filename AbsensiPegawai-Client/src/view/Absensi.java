package view;


import controller.Submit_hadir;
import controller.konek;
import view.jamdigital;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.Hadir;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Absensi extends javax.swing.JFrame {

    /**
     * Creates new form Absensi
     */
    
private List<Hadir> ambil   = new ArrayList<Hadir>();    

    
    public Absensi() {
        initComponents();  
        
        //+++++++++Agar memulai aplikasi berada di tengah layar
    
        Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
        Dimension frameSize = new Dimension ( 800, 600 );
        this.setBounds ( ss.width / 2 - frameSize.width / 2, 
                  ss.height / 2 - frameSize.height / 2,
                  frameSize.width, frameSize.height );
                  
        
        //Informasi hari, tanggal
        Date now = new Date();
        DateFormat tanggal = DateFormat.getDateInstance(DateFormat.FULL,new Locale("in","ID"));
        jLabel3.setText(tanggal.format(now));               
        
        txtNip.requestFocus();
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH : mm : ss");
        tampil_jam.setText(sdf.format(now));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        label_error_message = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_jamkerja = new javax.swing.JLabel();
        tampil_jam = new javax.swing.JLabel();
        txtNip = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        foto_pegawai = new javax.swing.JLabel();
        label_NamaPegawai = new javax.swing.JLabel();
        label_JabatanPegawai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Absensi Pegawai");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(250, 80, 0, 0));
        setIconImages(null);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_error_message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_error_message.setText("silahkan");
        mainPanel.add(label_error_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 310, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel5.setText("Kelompok 9");
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 190, -1));

        label_jamkerja.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        label_jamkerja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_jamkerja.setText("jam masuk");
        mainPanel.add(label_jamkerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 180, -1));

        tampil_jam.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        tampil_jam.setText("03 : 00 :00");
        mainPanel.add(tampil_jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, -1));

        txtNip.setBackground(new java.awt.Color(249, 249, 249));
        txtNip.setFont(new java.awt.Font("Lucida Gr", 0, 24)); // NOI18N
        txtNip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNip.setToolTipText("isi nip anda");
        txtNip.setInheritsPopupMenu(true);
        txtNip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNipActionPerformed(evt);
            }
        });
        txtNip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNipKeyReleased(evt);
            }
        });
        mainPanel.add(txtNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 290, 50));

        jLabel1.setFont(new java.awt.Font("Lucida G", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Masukan NIP"));
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 310, 80));

        foto_pegawai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foto_pegawai.setText("foto");
        foto_pegawai.setToolTipText("");
        mainPanel.add(foto_pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 220, 210));

        label_NamaPegawai.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        label_NamaPegawai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NamaPegawai.setText("Nama Pegawai");
        mainPanel.add(label_NamaPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 220, 20));

        label_JabatanPegawai.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        label_JabatanPegawai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_JabatanPegawai.setText("Jabatan Pegawai");
        mainPanel.add(label_JabatanPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 220, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Selasa 14 Juni 2022");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 170, 30));

        jLabel4.setBackground(new java.awt.Color(249, 249, 249));
        jLabel4.setOpaque(true);
        mainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 300, 370));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 40, 40));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Pastikan waktu keluar dan masuk anda\nsesuai jadwal yang ditentukan\n2. Dekatkan barcode Kartu Tanda Pegawai anda\nke scanner\n3. Tunggu sampai NIP terbaca dan tertulis\ninformasi tentang anda di layar");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tata Cara Presensi Pegawai"));
        jScrollPane1.setViewportView(jTextArea1);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 360, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Presensi_Layout.png"))); // NOI18N
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
                
    private void txtNipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNipActionPerformed

    private void txtNipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNipKeyReleased
        // TODO add your handling code here:
    if(evt.getKeyCode() == KeyEvent.VK_ENTER)
    {
                String nip;
                boolean status_pegawai, status_hadir;
                nip = txtNip.getText();
                
                Hadir pegawai = new Hadir(); 
                        
                pegawai.setNIP(nip);
                if(!"".equals(nip)){        
                Submit_hadir kehadiran = new Submit_hadir();
                try{
                    //cek apakah pegawai ada di tabel pegawai
                    status_pegawai = kehadiran.cek_pegawai(pegawai);
                    if(status_pegawai == true){
                        //cek dia harusnya masuk jam berapa
                        Date jam = new Date();
                        
                        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                        String jam_sekarang = format.format(jam.getTime());
                        
                        ambil = kehadiran.ambil(pegawai);
                        
                        String data[] = new String[4];
                        for(Hadir h : ambil){
                        data[0] = h.getNama();
                        data[1] = h.getJabatan();
                        data[2] = h.getId_Jam();
                        data[3] = h.getFoto();                       
                        }
                        Time waktu[] = new Time[4];
                        for(Hadir h : ambil){
                        waktu[0] = h.getMasukStart();
                        waktu[1] = h.getKerjaStart();
                        waktu[2] = h.getKerjaEnd();
                        waktu[3] = h.getKeluarEnd();
                        }        
                        
                        Time longjam = Time.valueOf(jam_sekarang);
                                       
                        long lj = longjam.getTime();
                        long mm = waktu[0].getTime();
                        long tg = waktu[1].getTime();
                        long mk = waktu[2].getTime();
                        long ks = waktu[3].getTime();
                                    
                        //cek apakah pegawai tsb sudah absen masuk atau belum
                        status_hadir = kehadiran.cek_kehadiran(pegawai);
                                if(status_hadir == true){
                                    if(mm < lj && lj < tg ){
                                    kehadiran.masuk(pegawai.getNIP());
                                    
                                    label_NamaPegawai.setText(data[0]);
                                    label_JabatanPegawai.setText(data[1]);
                                    foto_pegawai.setIcon(new javax.swing.ImageIcon("../foto/"+data[3]));
                                    foto_pegawai.setText("");
                                    label_jamkerja.setText(waktu[1].toString()+" - "+waktu[2].toString());
                                    
                                    label_error_message.setText("Masuk Berhasil");
                                    
                                    txtNip.setText("");
                                    txtNip.requestFocus();
                                    
                                }else{
                        
                            label_error_message.setText("Anda tidak diperkenankan");                                        
                        }
                                }
                                else if(status_hadir == false) {

                                    if(mk < lj && lj < ks == true){
                                    kehadiran.keluar(pegawai.getNIP());    
                                    
                                    label_NamaPegawai.setText(data[0]);
                                    label_JabatanPegawai.setText(data[1]);
                                    foto_pegawai.setIcon(new javax.swing.ImageIcon("../foto/"+data[3]));
                                    foto_pegawai.setText("");
                                    label_jamkerja.setText(waktu[1].toString()+" - "+waktu[2].toString());
                                    
                                    label_error_message.setText("Keluar berhasil");
                                    
                                    txtNip.setText("");
                                    txtNip.requestFocus();
                                    }else{
                                       label_error_message.setText("Anda tidak diperkenankan");
                                    }
                                    
                                } 
                        
                    }
                    else {
                       label_error_message.setText("Pastikan NIP yang anda masukan benar");
                    }
                    
                }catch(SQLException ex){
                    label_error_message.setText("Kesalahan Database"); 
                }
             }
                else
                {
                    label_error_message.setText("Masukan NIP");  
                }
        txtNip.requestFocus();
        txtNip.setText("");
    }
    
    
    }//GEN-LAST:event_txtNipKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Absensi().setVisible(true);
            }
            
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel foto_pegawai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label_JabatanPegawai;
    private javax.swing.JLabel label_NamaPegawai;
    private javax.swing.JLabel label_error_message;
    private javax.swing.JLabel label_jamkerja;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel tampil_jam;
    private javax.swing.JTextField txtNip;
    // End of variables declaration//GEN-END:variables
}
