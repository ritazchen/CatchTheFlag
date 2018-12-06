package AA;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class DICA2 extends javax.swing.JFrame {
    private Game telaAnterior; //Atributo da tela game
    
    private DICA2() {
        initComponents();
        CenteredFrame(this); //Coloca a janela do jogo no centro do monitor
    }
    
    public DICA2(Game telaAnt) {
        this();
        telaAnterior = telaAnt;
    }
    
    public void CenteredFrame(javax.swing.JFrame objFrame){
        //Centraliza a janela
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY); 
    } 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DispDica = new javax.swing.JPanel();
        C3 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        Fundo1 = new javax.swing.JLabel();
        ErroDica = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Existe = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NExiste = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(750, 450));
        setPreferredSize(new java.awt.Dimension(342, 177));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        DispDica.setBackground(new java.awt.Color(0, 153, 153));
        DispDica.setForeground(new java.awt.Color(255, 255, 255));
        DispDica.setAlignmentX(0.0F);
        DispDica.setAlignmentY(0.0F);
        DispDica.setPreferredSize(new java.awt.Dimension(342, 177));
        DispDica.setLayout(null);

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/B3.png"))); // NOI18N
        C3.setText("jLabel3");
        C3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                C3MouseMoved(evt);
            }
        });
        DispDica.add(C3);
        C3.setBounds(140, 59, 50, 70);

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/B2.png"))); // NOI18N
        C2.setText("jLabel3");
        C2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                C2MouseMoved(evt);
            }
        });
        DispDica.add(C2);
        C2.setBounds(80, 60, 50, 70);

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/B4.png"))); // NOI18N
        C4.setText("jLabel3");
        C4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                C4MouseMoved(evt);
            }
        });
        DispDica.add(C4);
        C4.setBounds(200, 60, 50, 70);

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/B5.png"))); // NOI18N
        C5.setText("jLabel3");
        C5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                C5MouseMoved(evt);
            }
        });
        DispDica.add(C5);
        C5.setBounds(260, 59, 50, 70);

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/B1.png"))); // NOI18N
        C1.setText("jLabel3");
        C1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                C1MouseMoved(evt);
            }
        });
        DispDica.add(C1);
        C1.setBounds(20, 60, 50, 70);

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/B1_2.png"))); // NOI18N
        C6.setText("jLabel3");
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C6MouseClicked(evt);
            }
        });
        DispDica.add(C6);
        C6.setBounds(20, 60, 50, 70);

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/B3_2.png"))); // NOI18N
        C8.setText("jLabel3");
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C8MouseClicked(evt);
            }
        });
        DispDica.add(C8);
        C8.setBounds(140, 60, 50, 70);

        C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/B4_2.png"))); // NOI18N
        C9.setText("jLabel3");
        C9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C9MouseClicked(evt);
            }
        });
        DispDica.add(C9);
        C9.setBounds(200, 60, 50, 70);

        C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/B5_2.png"))); // NOI18N
        C10.setText("jLabel3");
        C10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C10MouseClicked(evt);
            }
        });
        DispDica.add(C10);
        C10.setBounds(260, 59, 50, 70);

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/B2_2.png"))); // NOI18N
        C7.setText("jLabel3");
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C7MouseClicked(evt);
            }
        });
        DispDica.add(C7);
        C7.setBounds(81, 60, 50, 70);

        Fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/DicaFundo.png"))); // NOI18N
        Fundo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Fundo1.setAlignmentY(0.0F);
        Fundo1.setPreferredSize(new java.awt.Dimension(344, 148));
        Fundo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Fundo1MouseMoved(evt);
            }
        });
        DispDica.add(Fundo1);
        Fundo1.setBounds(0, 0, 344, 148);

        ErroDica.setBackground(new java.awt.Color(0, 153, 153));
        ErroDica.setPreferredSize(new java.awt.Dimension(335, 148));
        ErroDica.setRequestFocusEnabled(false);
        ErroDica.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Dica2Fundo.png"))); // NOI18N
        ErroDica.add(jLabel1);
        jLabel1.setBounds(0, 0, 335, 148);

        Existe.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/ExisteBomba.png"))); // NOI18N
        Existe.add(jLabel2);
        jLabel2.setBounds(0, 0, 335, 148);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/NãoExisteBomba.png"))); // NOI18N

        javax.swing.GroupLayout NExisteLayout = new javax.swing.GroupLayout(NExiste);
        NExiste.setLayout(NExisteLayout);
        NExisteLayout.setHorizontalGroup(
            NExisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NExisteLayout.setVerticalGroup(
            NExisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DispDica, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ErroDica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Existe, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(NExiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DispDica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ErroDica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Existe, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(NExiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Retorna à tela do jogo ao apertar o X
        telaAnterior.setEnabled(true);
        revalidate();
        repaint();
        telaAnterior.setVisible(true);
        System.gc();
    }//GEN-LAST:event_formWindowClosed

    private void C1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseMoved
        //Efeito de botão
        C1.setVisible(false);
        C2.setVisible(true);
        C3.setVisible(true);
        C4.setVisible(true);
        C5.setVisible(true);   
        C6.setVisible(true);
        C7.setVisible(false);
        C8.setVisible(false);
        C9.setVisible(false);
        C10.setVisible(false);
    }//GEN-LAST:event_C1MouseMoved

    private void C2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseMoved
        //Efeito de botão
        C2.setVisible(false);
        C1.setVisible(true);
        C3.setVisible(true);
        C4.setVisible(true);
        C5.setVisible(true);
        C7.setVisible(true);
        C6.setVisible(false);
        C8.setVisible(false);
        C9.setVisible(false);
        C10.setVisible(false);
    }//GEN-LAST:event_C2MouseMoved

    private void C3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseMoved
        //Efeito de botão
        C3.setVisible(false);
        C2.setVisible(true);
        C1.setVisible(true);
        C4.setVisible(true);
        C5.setVisible(true);
        C8.setVisible(true);
        C7.setVisible(false);
        C6.setVisible(false);
        C9.setVisible(false);
        C10.setVisible(false);
    }//GEN-LAST:event_C3MouseMoved

    private void C4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseMoved
        //Efeito de botão
        C4.setVisible(false);
        C2.setVisible(true);
        C3.setVisible(true);
        C1.setVisible(true);
        C5.setVisible(true);
        C9.setVisible(true);
        C7.setVisible(false);
        C8.setVisible(false);
        C6.setVisible(false);
        C10.setVisible(false);
    }//GEN-LAST:event_C4MouseMoved

    private void C5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseMoved
        //Efeito de botão
        C5.setVisible(false);
        C2.setVisible(true);
        C3.setVisible(true);
        C4.setVisible(true);
        C1.setVisible(true);
        C10.setVisible(true);
        C7.setVisible(false);
        C8.setVisible(false);
        C9.setVisible(false);
        C6.setVisible(false);
    }//GEN-LAST:event_C5MouseMoved

    private void C6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseClicked
        //Ações relacionadas quanto se aperta o botão da coluna 1:
        telaAnterior.setCont();
        telaAnterior.setEnabled(true);
        revalidate();
        repaint();
        setVisible(false);
        System.gc();
        //Se tiver bomba
        if (telaAnterior.getCont() <= 2 && telaAnterior.getSquares()[0][0] instanceof Bomba || telaAnterior.getCont() <= 2 && telaAnterior.getSquares()[1][0] instanceof Bomba) {
            setContentPane(Existe);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        //Se não tiver bomba
        else if (telaAnterior.getCont() <= 2 && !(telaAnterior.getSquares()[0][0] instanceof Bomba) || telaAnterior.getCont() <= 2 && !(telaAnterior.getSquares()[1][0] instanceof Bomba)){
            setContentPane(NExiste);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        if (telaAnterior.getCont() == 2) {
            telaAnterior.getDica().setVisible(false);
            telaAnterior.getDica2().setVisible(true);
        }
    }//GEN-LAST:event_C6MouseClicked

    private void C7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseClicked
        //Ações relacionadas quanto se aperta o botão da coluna 2:
        telaAnterior.setCont();
        telaAnterior.setEnabled(true);
        revalidate();
        repaint();
        setVisible(false);
        System.gc();
        if (telaAnterior.getCont() <= 2 && telaAnterior.getSquares()[0][1] instanceof Bomba || telaAnterior.getCont() <= 2 && telaAnterior.getSquares()[1][1] instanceof Bomba) {
            setContentPane(Existe);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        else if (telaAnterior.getCont() <= 2 && !(telaAnterior.getSquares()[0][1] instanceof Bomba) || telaAnterior.getCont() <= 2 && !(telaAnterior.getSquares()[1][1] instanceof Bomba)){
            setContentPane(NExiste);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        if (telaAnterior.getCont() == 2) {
            telaAnterior.getDica().setVisible(false);
            telaAnterior.getDica2().setVisible(true);
        }
    }//GEN-LAST:event_C7MouseClicked

    private void C8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseClicked
        //Ações relacionadas quanto se aperta o botão da coluna 3:
        telaAnterior.setCont();
        telaAnterior.setEnabled(true);
        revalidate();
        repaint();
        setVisible(false);
        System.gc();
        if (telaAnterior.getCont() <= 2 && telaAnterior.getSquares()[0][2] instanceof Bomba || telaAnterior.getCont() <= 2 && telaAnterior.getSquares()[1][2] instanceof Bomba) {
            setContentPane(Existe);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        else if (telaAnterior.getCont() <= 2 && !(telaAnterior.getSquares()[0][2] instanceof Bomba) || telaAnterior.getCont() <= 2 && !(telaAnterior.getSquares()[1][2] instanceof Bomba)){
            setContentPane(NExiste);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        if (telaAnterior.getCont() == 2) {
            telaAnterior.getDica().setVisible(false);
            telaAnterior.getDica2().setVisible(true);
        }
    }//GEN-LAST:event_C8MouseClicked

    private void C9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C9MouseClicked
        //Ações relacionadas quanto se aperta o botão da coluna 4:
        telaAnterior.setCont();
        telaAnterior.setEnabled(true);
        revalidate();
        repaint();
        setVisible(false);
        System.gc();
        if (telaAnterior.getCont() <= 2 && telaAnterior.getSquares()[0][3] instanceof Bomba || telaAnterior.getCont() <= 2 && telaAnterior.getSquares()[1][3] instanceof Bomba) {
            setContentPane(Existe);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        else if (telaAnterior.getCont() <= 2 && !(telaAnterior.getSquares()[0][3] instanceof Bomba) || telaAnterior.getCont() <= 2 && !(telaAnterior.getSquares()[1][3] instanceof Bomba)){
            setContentPane(NExiste);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        if (telaAnterior.getCont() == 2) {
            telaAnterior.getDica().setVisible(false);
            telaAnterior.getDica2().setVisible(true);
        }
    }//GEN-LAST:event_C9MouseClicked

    private void C10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseClicked
        //Ações relacionadas quanto se aperta o botão da coluna 5:
        telaAnterior.setCont();
        telaAnterior.setEnabled(true);
        revalidate();
        repaint();
        setVisible(false);
        System.gc();
        if (telaAnterior.getCont() <= 2 && telaAnterior.getSquares()[0][4] instanceof Bomba || telaAnterior.getCont() <= 2 && telaAnterior.getSquares()[1][4] instanceof Bomba) {
            setContentPane(Existe);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        else if (telaAnterior.getCont() <= 2 && !(telaAnterior.getSquares()[0][4] instanceof Bomba) || telaAnterior.getCont() <= 2 && !(telaAnterior.getSquares()[1][4] instanceof Bomba)){
            setContentPane(NExiste);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        if (telaAnterior.getCont() == 2) {
            telaAnterior.getDica().setVisible(false);
            telaAnterior.getDica2().setVisible(true);
        }
    }//GEN-LAST:event_C10MouseClicked

    private void Fundo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo1MouseMoved
        //Reseta todos os efeitos de botão
        C1.setVisible(true);
        C6.setVisible(false);
        C2.setVisible(true);
        C7.setVisible(false);
        C3.setVisible(true);
        C8.setVisible(false);
        C4.setVisible(true);
        C9.setVisible(false);
        C5.setVisible(true);
        C10.setVisible(false);
        
    }//GEN-LAST:event_Fundo1MouseMoved
    
    public JPanel getErro() {
        DispDica.setVisible(false);
        return ErroDica;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DICA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DICA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DICA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DICA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DICA2 dica = new DICA2();
                dica.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C10;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel C9;
    private javax.swing.JPanel DispDica;
    private javax.swing.JPanel ErroDica;
    private javax.swing.JPanel Existe;
    private javax.swing.JLabel Fundo1;
    private javax.swing.JPanel NExiste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
