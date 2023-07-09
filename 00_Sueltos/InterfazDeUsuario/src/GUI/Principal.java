/*
https://www.youtube.com/watch?v=SpggwwzO-M8&t=9s
 */
package GUI;

public class Principal extends javax.swing.JFrame {

    Operaciones operar = new Operaciones();
    
    private boolean p;
    private boolean q;

    public boolean isP() {
        return p;
    }

    public void setP(boolean p) {
        this.p = p;
    }

    public boolean isQ() {
        return q;
    }

    public void setQ(boolean q) {
        this.q = q;
    }
    
    
    
    public Principal() {
        initComponents();
    }

    public void entrada(){
        
        if(campoPe.getSelectedItem().equals("Verdadero")){
            this.p = true;
        }else{
            this.p = false;
        }
        if(campoQu.getSelectedItem().equals("Verdadero")){
            this.q = true;
        }else{
            this.q = false;
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelResult = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        campoPe = new javax.swing.JComboBox<>();
        campoQu = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        tablaVerdad = new javax.swing.JButton();
        conjuncion = new javax.swing.JButton();
        conjuncion1 = new javax.swing.JButton();
        condicional = new javax.swing.JButton();
        bico = new javax.swing.JButton();
        disyExcl = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor de p");

        jLabel2.setText("Valor de q");

        jScrollPane2.setViewportView(labelResult);

        jLabel4.setText("Resultado:");

        jButton1.setText("noP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("noQ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        campoPe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verdadero", "Falso" }));
        campoPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPeActionPerformed(evt);
            }
        });

        campoQu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verdadero", "Falso" }));
        campoQu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane3.setViewportView(textArea);

        tablaVerdad.setText("Tabla de Verdad");
        tablaVerdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaVerdadActionPerformed(evt);
            }
        });

        conjuncion.setText("Conjunción");
        conjuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuncionActionPerformed(evt);
            }
        });

        conjuncion1.setText("Disyunción");
        conjuncion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuncion1ActionPerformed(evt);
            }
        });

        condicional.setText("Condicional");
        condicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condicionalActionPerformed(evt);
            }
        });

        bico.setText("Bicondicional");
        bico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bicoActionPerformed(evt);
            }
        });

        disyExcl.setText("Disyunción Exclusiva");
        disyExcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disyExclActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablaVerdad)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoQu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(condicional, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conjuncion1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conjuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(bico, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(disyExcl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(campoQu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(campoPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)))
                        .addGap(38, 38, 38)
                        .addComponent(tablaVerdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conjuncion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conjuncion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(condicional)
                        .addGap(7, 7, 7)
                        .addComponent(disyExcl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bico)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        labelResult.setText("");
        entrada();
        labelResult.setText(operar.noP(p));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        labelResult.setText("");
        entrada();
        labelResult.setText(String.valueOf(operar.noQ(q)));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void campoQuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQuActionPerformed
        
    }//GEN-LAST:event_campoQuActionPerformed

    private void campoPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPeActionPerformed

    private void tablaVerdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaVerdadActionPerformed
    boolean[] filas = new boolean[5];
                boolean[] columnas = new boolean[9];
        
                String[][] tablaDeVerdad = new String[filas.length][columnas.length];
                    for (int i = 0; i < tablaDeVerdad.length; i++) {
                        for (int j = 0; j < tablaDeVerdad[0].length; j++) {
                            if(i==0){
                                tablaDeVerdad[i][0] = "   p  ";
                                tablaDeVerdad[i][1] = "    q  ";
                                tablaDeVerdad[i][2] = "    ¬p ";
                                tablaDeVerdad[i][3] = "    ¬q ";
                                tablaDeVerdad[i][4] = "    ^ ";
                                tablaDeVerdad[i][5] = "     v ";
                                tablaDeVerdad[i][6] = "     → ";
                                tablaDeVerdad[i][7] = "    ↔ ";
                                tablaDeVerdad[i][8] = "    ▲ ";
                            }else if(i==1){
                                setP(true);
                                setQ(true);
                                                                
                                if(isP()){
                                    tablaDeVerdad[i][0] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][0] = "   F   ";
                                }    
                                
                                if(isQ()){
                                    tablaDeVerdad[i][1] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][1] = "   F   ";
                                } 
                                if(operar.noP(p).equals("Verdadero")){
                                    tablaDeVerdad[i][2] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if(operar.noQ(q).equals("Verdadero")){
                                    tablaDeVerdad[i][3] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if(operar.conjuncion(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][4] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if(operar.disyuncion(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][5] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if(operar.condicional(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][6] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if(operar.bicondicional(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][7] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if(operar.disyExcl(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][8] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][8] = "   F   ";
                                }
                                
                            }else if(i==2){
                                setP(true);
                                setQ(false);
                                if(isP()){
                                    tablaDeVerdad[i][0] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][0] = "   F   ";
                                }    
                                if(isQ()){
                                    tablaDeVerdad[i][1] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][1] = "   F   ";
                                } 
                                if(operar.noP(p).equals("Verdadero")){
                                    tablaDeVerdad[i][2] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if(operar.noQ(q).equals("Verdadero")){
                                    tablaDeVerdad[i][3] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if(operar.conjuncion(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][4] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if(operar.disyuncion(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][5] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if(operar.condicional(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][6] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if(operar.bicondicional(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][7] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if(operar.disyExcl(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][8] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][8] = "   F   ";
                                }
                            }else if(i==3){
                                setP(false);
                                setQ(true);
                               
                                if(isP()){
                                    tablaDeVerdad[i][0] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][0] = "   F   ";
                                }    
                                
                                if(isQ()){
                                    tablaDeVerdad[i][1] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][1] = "   F   ";
                                } 
                                if(operar.noP(p).equals("Verdadero")){
                                    tablaDeVerdad[i][2] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if(operar.noQ(q).equals("Verdadero")){
                                    tablaDeVerdad[i][3] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if(operar.conjuncion(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][4] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if(operar.disyuncion(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][5] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if(operar.condicional(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][6] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if(operar.bicondicional(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][7] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if(operar.disyExcl(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][8] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][8] = "   F   ";
                                }
                            }else if(i==4){
                                setP(false);
                                setQ(false);
                                if(isP()){
                                    tablaDeVerdad[i][0] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][0] = "   F   ";
                                }
                                if(isQ()){
                                    tablaDeVerdad[i][1] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][1] = "   F   ";
                                } 
                                if(operar.noP(p).equals("Verdadero")){
                                    tablaDeVerdad[i][2] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if(operar.noQ(q).equals("Verdadero")){
                                    tablaDeVerdad[i][3] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if(operar.conjuncion(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][4] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if(operar.disyuncion(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][5] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if(operar.condicional(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][6] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if(operar.bicondicional(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][7] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if(operar.disyExcl(p,q).equals("Verdadero")){
                                    tablaDeVerdad[i][8] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][8] = "   F   ";
                                }
                        }
//                            textArea.setText(tablaDeVerdad[i][j]);
                            System.out.print(tablaDeVerdad[i][j]);   
                    }
//                        System.out.println("");
                            textArea.setText("");
                    }
//                    System.out.println("");
                            textArea.setText("");
        
    }//GEN-LAST:event_tablaVerdadActionPerformed

    private void conjuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuncionActionPerformed
        labelResult.setText("");
        entrada();
        labelResult.setText(String.valueOf(operar.conjuncion(p, q)));
    }//GEN-LAST:event_conjuncionActionPerformed

    private void conjuncion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuncion1ActionPerformed
        labelResult.setText("");
        entrada();
        labelResult.setText(String.valueOf(operar.disyuncion(p, q)));
    }//GEN-LAST:event_conjuncion1ActionPerformed

    private void condicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condicionalActionPerformed
        labelResult.setText("");
        entrada();
        labelResult.setText(String.valueOf(operar.condicional(p, q)));
    }//GEN-LAST:event_condicionalActionPerformed

    private void bicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bicoActionPerformed
        labelResult.setText("");
        entrada();
        labelResult.setText(String.valueOf(operar.bicondicional(p, q)));
    }//GEN-LAST:event_bicoActionPerformed

    private void disyExclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disyExclActionPerformed
        labelResult.setText("");
        entrada();
        labelResult.setText(String.valueOf(operar.disyExcl(p, q)));
    }//GEN-LAST:event_disyExclActionPerformed


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bico;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> campoPe;
    private javax.swing.JComboBox<String> campoQu;
    private javax.swing.JButton condicional;
    private javax.swing.JButton conjuncion;
    private javax.swing.JButton conjuncion1;
    private javax.swing.JButton disyExcl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane labelResult;
    private javax.swing.JButton tablaVerdad;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
