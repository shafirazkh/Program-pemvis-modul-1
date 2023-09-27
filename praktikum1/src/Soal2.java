
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Soal2 extends javax.swing.JFrame{
    private Timer timer;
    private int remainingSeconds;

    
    public Soal2() {
        initComponents();
        timer = new Timer();
        remainingSeconds = 5; // 5 menit

        //inner class
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (remainingSeconds > 0) {
                    remainingSeconds--;
                    updateTimerDisplay(); //memperbarui tampilan
                } else {
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); // Jalankan task setiap 1 detik
    }
    private void updateTimerDisplay() {
        int hours = remainingSeconds / 3600;
        int minutes = (remainingSeconds % 3600) / 60;
        int seconds = remainingSeconds % 60;

        String timeRemaining = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        Timer.setText(timeRemaining);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Timer = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LAFIYE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 116, 30);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cultivate Beauty in Versatility");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 180, 14);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gia scraft");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 150, 90, 23);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SALE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 270, 190);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Available at Shopee, Tokopedia, and our Website");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 440, 270, 16);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Jakarta, Indonesia");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 460, 120, 16);

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Heartily made as your perfect rebound, premium basic Gia scarf");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 420, 370, 16);

        Timer.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        Timer.setForeground(new java.awt.Color(255, 255, 255));
        Timer.setText("00 : 00 : 00");
        getContentPane().add(Timer);
        Timer.setBounds(370, 130, 180, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lafiye1.jpeg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 350, 400);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lafiye2.jpeg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(350, 0, 350, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Timer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public void run() {
    }
}
