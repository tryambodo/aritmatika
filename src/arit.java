/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS TP 450 LDV
 */
public class arit extends javax.swing.JFrame {
    String jns = "";
    int jml;
    public arit() {
        initComponents();
        getJumlah();
        setJenis();
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
        jLabel2 = new javax.swing.JLabel();
        jenis = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jmlBil = new javax.swing.JComboBox<>();
        bil2 = new javax.swing.JLabel();
        bil1 = new javax.swing.JLabel();
        bil3 = new javax.swing.JLabel();
        bil4 = new javax.swing.JLabel();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        b4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        thasil = new javax.swing.JTextField();
        ket = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Aritmatika Sederhana");

        jLabel2.setText("Jenis Aritmatika");

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- pilih salah satu ---", "penjumlahan", "pengurangan", "perkalian", "pembagian", "sisa hasil bagi" }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 204));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Operasi"));

        jLabel3.setText("Jumlah Bilangan");

        jmlBil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        jmlBil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlBilActionPerformed(evt);
            }
        });

        bil2.setText("Bilangan 2");

        bil1.setText("Bilangan 1");

        bil3.setText("Bilangan 3");

        bil4.setText("Bilangan 4");

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(thasil, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bil2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(53, 53, 53)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jmlBil, 0, 173, Short.MAX_VALUE)
                                        .addComponent(b2)))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(120, 120, 120)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(bil1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bil4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bil3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b3)
                                    .addComponent(b4))))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmlBil, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bil1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bil2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bil3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bil4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(7, 7, 7)
                .addComponent(thasil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 488, 571);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Double hsl = 0.0;
        Double a1, a2, a3, a4;
        a1 = Double.parseDouble(b1.getText().toString());
        a2 = Double.parseDouble(b2.getText().toString());

        if(jns.equals("penjumlahan")) {
            if(jml == 2) {
                hsl = a1 + a2;
                thasil.setText(""+a1 + " + " + a2 + " = " + hsl);
            }
            if(jml == 3) {
                a3 = Double.parseDouble(b3.getText().toString());
                hsl = a1 + a2 + a3;
                thasil.setText(""+a1 + " + " + a2 + " + " + a3 + " = " + hsl);
            }
            if(jml == 4) {
                a3 = Double.parseDouble(b3.getText().toString());
                a4 = Double.parseDouble(b4.getText().toString());
                hsl = a1 + a2 + a3 + a4;
                thasil.setText(""+a1 + " + " + a2 + " + " + a3 + " + " + a4 + " = " + hsl);
            }
        }
        else if(jns.equals("pengurangan")) {
            if(jml == 2) {
                hsl = a1 - a2;
                thasil.setText(""+a1 + " - " + a2 + " = " + hsl);
            }
            if(jml == 3) {
                a3 = Double.parseDouble(b3.getText().toString());
                hsl = a1 - a2 - a3;
                thasil.setText(""+a1 + " - " + a2 + " - " + a3 + " = " + hsl);
            }
            if(jml == 4) {
                a3 = Double.parseDouble(b3.getText().toString());
                a4 = Double.parseDouble(b4.getText().toString());
                hsl = a1 - a2 - a3 - a4;
                thasil.setText(""+a1 + " - " + a2 + " - " + a3 + " - " + a4 + " = " + hsl);
            }
        }
        else if(jns.equals("perkalian"))  {
            if(jml == 2) {
                hsl = a1 * a2;
                thasil.setText(""+a1 + " x " + a2 + " = " + hsl);
            }
            if(jml == 3) {
                a3 = Double.parseDouble(b3.getText().toString());
                hsl = a1 * a2 * a3;
                thasil.setText(""+a1 + " x " + a2 + " x " + a3 + " = " + hsl);
            }
            if(jml == 4) {
                a3 = Double.parseDouble(b3.getText().toString());
                a4 = Double.parseDouble(b4.getText().toString());
                hsl = a1 * a2 * a3 * a4;
                thasil.setText(""+a1 + " x " + a2 + " x " + a3 + " x " + a4 + " = " + hsl);
            }
        }
        else if(jns.equals("pembagian"))  {
            if(jml == 2) {
                hsl = a1 / a2;
                thasil.setText(""+a1 + " : " + a2 + " = " + hsl);
            }
            if(jml == 3) {
                a3 = Double.parseDouble(b3.getText().toString());
                hsl = a1 / a2 / a3;
                thasil.setText(""+a1 + " : " + a2 + " : " + a3 + " = " + hsl);
            }
            if(jml == 4) {
                a3 = Double.parseDouble(b3.getText().toString());
                a4 = Double.parseDouble(b4.getText().toString());
                hsl = a1 / a2 / a3 / a4;
                thasil.setText(""+a1 + " : " + a2 + " : " + a3 + " : " + a4 + " = " + hsl);
            }
        }
        else if(jns.equals("sisa hasil bagi"))  {
            hsl = a1 % a2;
            thasil.setText(""+a1 + " : " + a2 + " = " + (a1 - hsl)/a2 + " sisa " + hsl);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jmlBilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlBilActionPerformed
        getJumlah();
    }//GEN-LAST:event_jmlBilActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        setJenis();
    }//GEN-LAST:event_jenisActionPerformed

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
            java.util.logging.Logger.getLogger(arit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JLabel bil1;
    private javax.swing.JLabel bil2;
    private javax.swing.JLabel bil3;
    private javax.swing.JLabel bil4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JComboBox<String> jmlBil;
    private javax.swing.JLabel ket;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField thasil;
    // End of variables declaration//GEN-END:variables

     public void setJenis(){
        if(jenis.getSelectedItem().equals("penjumlahan")){
            jns = "penjumlahan";
            ket.setText("penjumlahan");
            panel.setVisible(true);
            jmlBil.setEnabled(true);
        } 
        else if(jenis.getSelectedItem().equals("pengurangan")) {
            jns = "pengurangan";
            ket.setText("pengurangan");
            panel.setVisible(true);
            jmlBil.setEnabled(true);
        }
        else if(jenis.getSelectedItem().equals("perkalian")){ 
            jns = "perkalian"; 
            ket.setText("perkalian");
            panel.setVisible(true);
            jmlBil.setEnabled(true);
        }
        else if(jenis.getSelectedItem().equals("pembagian")){
            jns = "pembagian";
            ket.setText("pembagian");
            panel.setVisible(true);
            jmlBil.setEnabled(true);
        } 
        else if(jenis.getSelectedItem().equals("sisa hasil bagi")){
            jns = "sisa hasil bagi";
            ket.setText("sisa hasil bagi");
            panel.setVisible(true);
            bil3.setVisible(false);
            bil4.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            jml = 2;
            jmlBil.setEnabled(false);
        } 
        else {
            jns = null;
            panel.setVisible(false);
        }
    }
    
    public void getJumlah(){
        if(jmlBil.getSelectedItem().equals("2")){
            bil3.setVisible(false);
            bil4.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            jml = 2;
        } else if(jmlBil.getSelectedItem().equals("3")){
            bil3.setVisible(true);
            bil4.setVisible(false);
            b3.setVisible(true);
            b4.setVisible(false);
            jml = 3;
        } else if(jmlBil.getSelectedItem().equals("4")){
            bil3.setVisible(true);
            bil4.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            jml = 4;
        }
    }
}