package ar.com.sa;

import java.util.ArrayList;

/**
 * @author samuelarag
 */
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /*VARIABLES*/
    double numero1, total = 0.0;
    String operador = "";
    ArrayList<Double> numeros = new ArrayList<Double>();

    /*FUNCIONES*/
    public void Sumar() {
        for (int i = 0; i < numeros.size(); i++) {
            if (i == 0) {
                total += numeros.get(i);
            }
            if (i != 0) {
                total += numeros.get(i);
            }
        }
        String valorSuma = Double.toString(total);
        textoVisor.setText(valorSuma);
    }

    public void Restar() {
        for (int i = 0; i < numeros.size(); i++) {
            if (i == 0) {
                total += numeros.get(i);
            }
            if (i != 0) {
                total -= numeros.get(i);
            }
        }
        String valorResta = Double.toString(total);
        textoVisor.setText(valorResta);
    }

    public void Multiplicar() {
        for (int i = 0; i < numeros.size(); i++) {
            if (i == 0) {
                total += numeros.get(i);
            }
            if (i != 0) {
                total *= numeros.get(i);
            }
        }
        String valorMult = Double.toString(total);
        textoVisor.setText(valorMult);
    }

    public void Dividir() {
        for (int i = 0; i < numeros.size(); i++) {
            if (i == 0) {
                total += numeros.get(i);
            }
            if (i != 0) {
                total /= numeros.get(i);
            }
        }
        String valorDiv = Double.toString(total);
        textoVisor.setText(valorDiv);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JPanel();
        visor = new javax.swing.JPanel();
        textoVisor = new javax.swing.JLabel();
        e2 = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        mmbtn = new javax.swing.JButton();
        porbtn = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        npoint = new javax.swing.JButton();
        pi = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(0, 0, 0));

        visor.setBackground(new java.awt.Color(0, 0, 0));

        textoVisor.setBackground(new java.awt.Color(255, 255, 255));
        textoVisor.setFont(new java.awt.Font("Heiti SC", 1, 36)); // NOI18N
        textoVisor.setForeground(new java.awt.Color(204, 204, 204));
        textoVisor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoVisor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout visorLayout = new javax.swing.GroupLayout(visor);
        visor.setLayout(visorLayout);
        visorLayout.setHorizontalGroup(
            visorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoVisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        visorLayout.setVerticalGroup(
            visorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(textoVisor, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        e2.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        e2.setText("^2");
        e2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });

        sqrt.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        sqrt.setText("√");
        sqrt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        mmbtn.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        mmbtn.setText("+/-");
        mmbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmbtnActionPerformed(evt);
            }
        });

        porbtn.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        porbtn.setText("%");
        porbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        porbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porbtnActionPerformed(evt);
            }
        });

        btnAC.setBackground(new java.awt.Color(102, 0, 0));
        btnAC.setForeground(new java.awt.Color(255, 255, 255));
        btnAC.setText("AC");
        btnAC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        n7.setText("7");
        n7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n8.setText("8");
        n8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        n9.setText("9");
        n9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        n6.setText("6");
        n6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        n4.setText("4");
        n4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n5.setText("5");
        n5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n1.setText("1");
        n1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n1.setSize(new java.awt.Dimension(60, 60));
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n3.setText("3");
        n3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n2.setText("2");
        n2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        btnSum.setBackground(new java.awt.Color(204, 204, 204));
        btnSum.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnSum.setText("+");
        btnSum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(204, 204, 204));
        btnDiv.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnDiv.setText("÷");
        btnDiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMult.setBackground(new java.awt.Color(204, 204, 204));
        btnMult.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnMult.setText("X");
        btnMult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(204, 204, 204));
        btnResta.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnResta.setText("-");
        btnResta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        n0.setText("0");
        n0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(204, 204, 204));
        equal.setText("=");
        equal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        npoint.setText(".");
        npoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        npoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npointActionPerformed(evt);
            }
        });

        pi.setText("π");
        pi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(visor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(porbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoLayout.createSequentialGroup()
                                        .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoLayout.createSequentialGroup()
                                        .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoLayout.createSequentialGroup()
                                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(npoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAC, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(btnSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(porbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSum, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(npoint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + "7");
    }//GEN-LAST:event_n7ActionPerformed

    private void mmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmbtnActionPerformed
        String text = textoVisor.getText();
        int num = Integer.parseInt(text);
        if (num > 0 || num < 0) {
            num *= -1;
            String numCadena = Integer.toString(num);
            textoVisor.setText(numCadena);
        }
    }//GEN-LAST:event_mmbtnActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + "6");
    }//GEN-LAST:event_n6ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + '5');
    }//GEN-LAST:event_n5ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + "4");
    }//GEN-LAST:event_n4ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + "8");
    }//GEN-LAST:event_n8ActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        if (numeros.size() > 1) {
            numeros.clear();
            textoVisor.setText("");
            if (numeros.isEmpty()) {
                total = 0.0;
            }
        } else {
            textoVisor.setText("");
        }

    }//GEN-LAST:event_btnACActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + "9");
    }//GEN-LAST:event_n9ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + "1");
    }//GEN-LAST:event_n1ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + "3");
    }//GEN-LAST:event_n3ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + "2");
    }//GEN-LAST:event_n2ActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + "0");
    }//GEN-LAST:event_n0ActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        String text = textoVisor.getText();
        Double numero1 = Double.parseDouble(text);

        numeros.add(numero1);
        textoVisor.setText("");
        operador = "Sumar";
    }//GEN-LAST:event_btnSumActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        String text = textoVisor.getText();
        numero1 = Double.parseDouble(text);
        textoVisor.setText("");
        numeros.add(numero1);
        switch (operador) {
           case "Sumar":
                Sumar();
                numeros.clear();
                operador = "";
                total = 0.0;
                break;
           case "Multiplicar":
                Multiplicar();
                numeros.clear();
                operador = "";
                total = 0.0;
                break;
           case "Restar":
                Restar();
                numeros.clear();
                operador = "";
                total = 0.0;
                break;
           case "Division":
                Dividir();
                numeros.clear();
                operador = "";
                total = 0.0;
                break;
        }


    }//GEN-LAST:event_equalActionPerformed

    private void npointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npointActionPerformed
        String text = textoVisor.getText();
        textoVisor.setText(text + ".");
    }//GEN-LAST:event_npointActionPerformed

    private void porbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porbtnActionPerformed
        String text = textoVisor.getText();
        Float num1 = Float.parseFloat(text);
        num1 /= 100;
        String numCadena = Float.toString(num1);
        textoVisor.setText(numCadena);
    }//GEN-LAST:event_porbtnActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        String text = textoVisor.getText();
        numero1 = Double.parseDouble(text);

        numeros.add(numero1);
        textoVisor.setText("");
        operador = "Multiplicar";
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        String text = textoVisor.getText();
        numero1 = Double.parseDouble(text);

        numeros.add(numero1);
        textoVisor.setText("");
        operador = "Restar";
    }//GEN-LAST:event_btnRestaActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        String text = textoVisor.getText();
        
        numero1 = Double.parseDouble(text);
        numero1 *= numero1;
       String text2 = Double.toString(numero1);
        textoVisor.setText(text2);
    }//GEN-LAST:event_e2ActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        String text = textoVisor.getText();
        numero1 = Double.parseDouble(text);

        numeros.add(numero1);
        textoVisor.setText("");
        operador = "Division";
    }//GEN-LAST:event_btnDivActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        String text = textoVisor.getText();
        numero1 = Double.parseDouble(text);
        
        Double raiz = Math.sqrt(numero1);
        String valorRaiz = Double.toString(raiz);
        
        textoVisor.setText(valorRaiz);
    }//GEN-LAST:event_sqrtActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSum;
    private javax.swing.JButton e2;
    private javax.swing.JButton equal;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mmbtn;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton npoint;
    private javax.swing.JButton pi;
    private javax.swing.JButton porbtn;
    private javax.swing.JButton sqrt;
    private javax.swing.JLabel textoVisor;
    private javax.swing.JPanel visor;
    // End of variables declaration//GEN-END:variables
}
