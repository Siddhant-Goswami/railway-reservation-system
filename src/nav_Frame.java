import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class nav_Frame extends javax.swing.JFrame {

    /**
     * Creates new form nav_Frame
     */
    private BufferedImage img;
    public static JDesktopPane jdpDesktop;
    
    public nav_Frame(login log)
    {
        log.setVisible(false);
        initComponents();
        this.setLocationRelativeTo(null);
        try
        {
            img = ImageIO.read(new File("C:\\Users\\sss\\Documents\\NetBeansProjects\\RailwayResevationSystem\\src\\ir.jpg"));
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        jdpDesktop = new JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                double scaleFactor = Math.min(1d, getScaleFactorToFit(new Dimension(img.getWidth(), img.getHeight()), getSize()));
                int scaleWidth = (int) Math.round(img.getWidth() * scaleFactor);
                int scaleHeight = (int) Math.round(img.getHeight() * scaleFactor);
                Image scaled = img.getScaledInstance(scaleWidth, scaleHeight, Image.SCALE_SMOOTH);
                int width = getWidth() - 1;
                int height = getHeight() - 1;
                int x = (width - scaled.getWidth(this)) / 2;
                int y = (height - scaled.getHeight(this)) / 2;
                g.drawImage(scaled, x, y, this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(img.getWidth(), img.getHeight());
            }
        };
        this.setContentPane(jdpDesktop);
        
    }
    public void op(int flag)
            {
                trainMenuItem.setEnabled(false);
                jMenuItem6.setEnabled(false);
                jMenuItem3.setEnabled(false);
                jMenuItem4.setEnabled(false);
                   System.out.println("flag");
                
            }
    public double getScaleFactor(int iMasterSize, int iTargetSize)
    {
        double dScale = 1;
        if (iMasterSize > iTargetSize)
        {
            dScale = (double) iTargetSize / (double) iMasterSize;
        } 
        else
        {
            dScale = (double) iTargetSize / (double) iMasterSize;
        }
        return dScale;
    }
    public double getScaleFactorToFit(Dimension original, Dimension toFit)
    {
        double dScale = 1d;
        if (original != null && toFit != null)
        {
            double dScaleWidth = getScaleFactor(original.width, toFit.width);
            double dScaleHeight = getScaleFactor(original.height, toFit.height);
            dScale = Math.min(dScaleHeight, dScaleWidth);
        }
        return dScale;
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        settingMenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        trainMenuItem = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        operationMenu = new javax.swing.JMenu();
        searchMenuItem = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        bookMenuItem = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Railway Reservation- Ticket Reservation System");

        settingMenu.setMnemonic('s');
        settingMenu.setText("Setting");

        jMenuItem4.setText("Ticket info");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        settingMenu.add(jMenuItem4);

        jMenuItem3.setText("User profile");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        settingMenu.add(jMenuItem3);

        trainMenuItem.setMnemonic('a');
        trainMenuItem.setText("Train management");
        trainMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainMenuItemActionPerformed(evt);
            }
        });
        settingMenu.add(trainMenuItem);

        jMenuItem6.setText("Bus management");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        settingMenu.add(jMenuItem6);

        menuBar.add(settingMenu);

        operationMenu.setMnemonic('o');
        operationMenu.setText("Operation");

        searchMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        searchMenuItem.setMnemonic('r');
        searchMenuItem.setText("Search train");
        searchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenuItemActionPerformed(evt);
            }
        });
        operationMenu.add(searchMenuItem);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Search Bus");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        operationMenu.add(jMenuItem5);

        bookMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        bookMenuItem.setMnemonic('b');
        bookMenuItem.setText("Quick Train Book");
        bookMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookMenuItemActionPerformed(evt);
            }
        });
        operationMenu.add(bookMenuItem);

        menuBar.add(operationMenu);

        exitMenu.setText("Log out");
        exitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuMouseClicked(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        exitMenu.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Log out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        exitMenu.add(jMenuItem1);

        menuBar.add(exitMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenuItemActionPerformed
        //jdpDesktop.remove(login.bookfrm);
        jdpDesktop.add(login.sf);
        login.sf.setVisible(true);
        //login.bookfrm.setVisible(false);
    }//GEN-LAST:event_searchMenuItemActionPerformed

    private void exitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseClicked
       System.exit(0);
    }//GEN-LAST:event_exitMenuMouseClicked

    private void bookMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookMenuItemActionPerformed
        jdpDesktop.add(login.bookfrm);
        login.bookfrm.setVisible(true);
    }//GEN-LAST:event_bookMenuItemActionPerformed

    private void trainMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainMenuItemActionPerformed
        // TODO add your handling code here:
        jdpDesktop.add(login.rl);
        login.rl.setVisible(true);
    }//GEN-LAST:event_trainMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
        login l=new login();
        l.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        jdpDesktop.add(login.u);
        login.u.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        jdpDesktop.add(login.tt);
        login.tt.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        jdpDesktop.add(login.bs);
        login.bs.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         jdpDesktop.add(login.b);
        login.b.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bookMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu operationMenu;
    private javax.swing.JMenuItem searchMenuItem;
    private javax.swing.JMenu settingMenu;
    private javax.swing.JMenuItem trainMenuItem;
    // End of variables declaration//GEN-END:variables
}
