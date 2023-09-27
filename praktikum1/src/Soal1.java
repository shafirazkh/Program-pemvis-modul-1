/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Soal1 extends javax.swing.JFrame {
    public Soal1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        in_jnskelamin = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        in_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        in_nim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        in_prodi = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        in_lk = new javax.swing.JRadioButton();
        in_pr = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        in_agama = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        in_alamat = new javax.swing.JTextField();
        btn_keluar = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("NAMA");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 150, 130, 30);
        getContentPane().add(in_nama);
        in_nama.setBounds(170, 150, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("NIM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 190, 130, 30);
        getContentPane().add(in_nim);
        in_nim.setBounds(170, 190, 160, 30);

        jLabel4.setText("PRODI");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 230, 130, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KEMENTRIAN PENDIDIKAN, KEBUDAYAAN, RESET DAN TEKNOLOGI ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 410, 20);
        jLabel1.getAccessibleContext().setAccessibleName("KEMENTRIAN PENDIDIKAN, KEBUDAYAAN, RESET DAN TEKNOLOGI");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("UNIVERSITAS TRUNOJOYO MADURA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 30, 360, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FAKULTAS TEKNIK");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 50, 200, 15);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("UKM-FT INOVASI");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 70, 200, 15);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sekretariat: Jl. Raya Telang PO.BOX 02 Kampus UTM telp. 085806987111");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(7, 90, 590, 19);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FORMULIR PENDAFTARAN AMUNISI XIV");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(110, 116, 360, 20);

        in_prodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistem Informasi", "Teknik Informatika", "Teknik Industri", "Teknik Mesin", "Teknik Elektro", "Teknik Mekatronika" }));
        getContentPane().add(in_prodi);
        in_prodi.setBounds(170, 230, 160, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("JENIS KELAMIN");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 270, 130, 30);

        in_jnskelamin.add(in_lk);
        in_lk.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        in_lk.setText("Laki-Laki");
        getContentPane().add(in_lk);
        in_lk.setBounds(170, 270, 80, 30);

        in_jnskelamin.add(in_pr);
        in_pr.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        in_pr.setText("Perempuan");
        getContentPane().add(in_pr);
        in_pr.setBounds(260, 270, 90, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("AGAMA");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 310, 130, 30);
        getContentPane().add(in_agama);
        in_agama.setBounds(170, 310, 160, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("ALAMAT DOMISILI");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 350, 130, 30);
        getContentPane().add(in_alamat);
        in_alamat.setBounds(170, 350, 160, 30);

        btn_keluar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_keluar);
        btn_keluar.setBounds(480, 430, 90, 30);

        btn_hapus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus);
        btn_hapus.setBounds(372, 430, 90, 30);

        btn_simpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan);
        btn_simpan.setBounds(40, 430, 90, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul2.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(500, 10, 90, 70);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul3.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 10, 90, 70);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul1.jpeg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(-7, 0, 610, 500);

        Output.setColumns(20);
        Output.setRows(5);
        jScrollPane1.setViewportView(Output);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 510, 530, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   
    }//GEN-LAST:event_formWindowActivated

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        in_nama.setText(""); 
        in_nim.setText("");
        in_prodi.setSelectedIndex(0);
        in_lk.setSelected(false);
        in_pr.setSelected(false);
        in_agama.setText("");
        in_alamat.setText("");
        Output.setText("");
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String jenis, prodi;
        
        if (in_lk.isSelected()==true){
        jenis = "Laki-Laki";}
        else{
        jenis = "Perempuan";}
        
        prodi = in_prodi.getSelectedItem().toString();
        
        Output.setText("Nama \t = "+in_nama.getText()
        +"\n NIM \t = "+in_nim.getText()
        +"\n Prodi \t = "+prodi
        +"\n Jenis Kelamin = "+jenis
        +"\n Agama \t = "+in_agama.getText()
        +"\n Alamat \t = "+in_alamat.getText());
    }//GEN-LAST:event_btn_simpanActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Output;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JTextField in_agama;
    private javax.swing.JTextField in_alamat;
    private javax.swing.ButtonGroup in_jnskelamin;
    private javax.swing.JRadioButton in_lk;
    private javax.swing.JTextField in_nama;
    private javax.swing.JTextField in_nim;
    private javax.swing.JRadioButton in_pr;
    private javax.swing.JComboBox<String> in_prodi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
