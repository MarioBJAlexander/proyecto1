package app;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class aplication extends javax.swing.JFrame {

    String dato;

    public aplication() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        ejecutarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        primosText = new javax.swing.JTextField();
        fiboText = new javax.swing.JTextField();
        factText = new javax.swing.JTextField();
        borrarButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        serieText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        serie2Text = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        senoText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cosenoText = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Ingrese el número máximo:");
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        ejecutarButton.setText("Ejecutar");
        ejecutarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Serie Primos");

        jLabel3.setBackground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Serie Fibonacci");

        jLabel4.setText("Serie Factorial");

        primosText.setEditable(false);
        primosText.setSelectionColor(new java.awt.Color(255, 153, 51));
        primosText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primosTextActionPerformed(evt);
            }
        });

        fiboText.setEditable(false);
        fiboText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiboTextActionPerformed(evt);
            }
        });

        factText.setEditable(false);
        factText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factTextActionPerformed(evt);
            }
        });

        borrarButton.setText("Borrar");
        borrarButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarButtonFocusGained(evt);
            }
        });
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        serieText.setEditable(false);
        serieText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serieTextActionPerformed(evt);
            }
        });

        jLabel7.setText("Serie Adicional");

        jLabel6.setText("Serie Adicional 2");

        serie2Text.setEditable(false);

        jLabel8.setText("Seno");

        senoText.setEditable(false);

        jLabel9.setText("Coseno");

        cosenoText.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 153, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(ejecutarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(primosText)
                    .addComponent(fiboText)
                    .addComponent(factText)
                    .addComponent(serieText)
                    .addComponent(serie2Text)
                    .addComponent(senoText)
                    .addComponent(cosenoText, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primosText, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiboText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serieText, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(serie2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senoText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cosenoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ejecutarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fiboTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiboTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiboTextActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed

    }//GEN-LAST:event_numeroActionPerformed

    public String primos(int n) {
        Series s = new Series();
        String result = s.iniciar(n);
        return result;
    }

    public String fibonacci(int o) {
        Series f = new Series();
        String resu = f.fibonacci2(o);
        return resu;
    }

    public String factorial(int p) {
        Series fa = new Series();
        String res = fa.fact(p);
        return res;
    }

    public String serie(int q) {
        Series se = new Series();
        String re = se.serie(q);
        return re;
    }
    
    public String serie2(int r) {
        Series ser = new Series();
        String ro = ser.ser(r);
        return ro;
    }
    
    public String seno(int r) {
        Series sen = new Series();
        String se = sen.seno(r);
        return se;
    }

    private void ejecutarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarButtonActionPerformed
        try {
            dato = numero.getText();
            int dat = Integer.parseInt(dato);

            String seriePrimos = primos(dat);
            primosText.setText(seriePrimos);

            String serieFibonacci = fibonacci(dat); 
            fiboText.setText(serieFibonacci);

            String serieFactorial = factorial(dat);
            factText.setText(serieFactorial);

            String serieAdcional = serie(dat);
            serieText.setText(serieAdcional);
            
            String serieAdcional2 = serie2(dat);
            serie2Text.setText(serieAdcional2);
            
            String serieSeno = seno(dat);
            senoText.setText(serieSeno);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN NÚMEROS");
        }


    }//GEN-LAST:event_ejecutarButtonActionPerformed

    private void primosTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primosTextActionPerformed
        //series.Primos p = new series.Primos();

    }//GEN-LAST:event_primosTextActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        int cerrar = JOptionPane.showConfirmDialog(this, "Desea salir de la aplicacion", "advertencia", JOptionPane.YES_NO_OPTION);
        if (cerrar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_salirButtonActionPerformed

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
        numero.setText("");
        primosText.setText("");
        factText.setText("");
        fiboText.setText("");
        serieText.setText("");
        serie2Text.setText("");
        senoText.setText("");
        cosenoText.setText("");
        numero.requestFocus();
    }//GEN-LAST:event_borrarButtonActionPerformed

    private void factTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factTextActionPerformed

    private void borrarButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarButtonFocusGained

    }//GEN-LAST:event_borrarButtonFocusGained

    private void serieTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serieTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serieTextActionPerformed

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarButton;
    private javax.swing.JTextField cosenoText;
    private javax.swing.JButton ejecutarButton;
    private javax.swing.JTextField factText;
    private javax.swing.JTextField fiboText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField primosText;
    private javax.swing.JButton salirButton;
    private javax.swing.JTextField senoText;
    private javax.swing.JTextField serie2Text;
    private javax.swing.JTextField serieText;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the fact
     */
    public javax.swing.JTextField getFact() {
        return factText;
    }

    /**
     * @param fact the fact to set
     */
    public void setFact(javax.swing.JTextField fact) {
        this.factText = fact;
    }

    /**
     * @return the fibo
     */
    public javax.swing.JTextField getFibo() {
        return fiboText;
    }

    /**
     * @param fibo the fibo to set
     */
    public void setFibo(javax.swing.JTextField fibo) {
        this.fiboText = fibo;
    }

    /**
     * @return the jButton1
     */
    public javax.swing.JButton getjButton1() {
        return ejecutarButton;
    }

    /**
     * @param jButton1 the jButton1 to set
     */
    public void setjButton1(javax.swing.JButton jButton1) {
        this.ejecutarButton = jButton1;
    }

    /**
     * @return the jButton2
     */
    public javax.swing.JButton getjButton2() {
        return borrarButton;
    }

    /**
     * @param jButton2 the jButton2 to set
     */
    public void setjButton2(javax.swing.JButton jButton2) {
        this.borrarButton = jButton2;
    }

    /**
     * @return the jButton3
     */
    public javax.swing.JButton getjButton3() {
        return salirButton;
    }

    /**
     * @param jButton3 the jButton3 to set
     */
    public void setjButton3(javax.swing.JButton jButton3) {
        this.salirButton = jButton3;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the n
     */
    public javax.swing.JTextField getN() {
        return getNumero();
    }

    /**
     * @param n the n to set
     */
    public void setN(javax.swing.JTextField n) {
        this.setNumero(n);
    }

    /**
     * @return the primos
     */
    public javax.swing.JTextField getPrimos() {
        return primosText;
    }

    /**
     * @param primos the primos to set
     */
    public void setPrimos(javax.swing.JTextField primos) {
        this.primosText = primos;
    }

    /**
     * @return the numero
     */
    public javax.swing.JTextField getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(javax.swing.JTextField numero) {
        this.numero = numero;
    }
}
