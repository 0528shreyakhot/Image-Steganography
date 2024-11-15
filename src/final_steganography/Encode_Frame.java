package final_steganography;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Pushpak
 */
public class Encode_Frame extends javax.swing.JFrame {

    BufferedImage sourceImage = null, EmbeddedImage = null;
    /**
     * Creates new form main
     */
    public Encode_Frame() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButtonEmbed = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonOpen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabelSourceImage = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabelEmbedded = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Message", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Modern No. 20", 2, 18)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("NSimSun", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextMessage.setColumns(20);
        jTextMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextMessage.setRows(5);
        jScrollPane1.setViewportView(jTextMessage);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 910, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 216));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "SourceImage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Modern No. 20", 2, 18)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 222, -1, -1));

        jButtonEmbed.setBackground(new java.awt.Color(204, 255, 255));
        jButtonEmbed.setText("Embed");
        jButtonEmbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmbedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEmbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 116, 33));

        jButtonSave.setBackground(new java.awt.Color(204, 255, 255));
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 116, 33));

        jButtonReset.setBackground(new java.awt.Color(204, 255, 255));
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 116, 33));

        jButtonOpen.setBackground(new java.awt.Color(204, 255, 255));
        jButtonOpen.setText("Open");
        jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 116, 33));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "SourceImage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Modern No. 20", 2, 18)))); // NOI18N
        jScrollPane2.setViewportView(jLabelSourceImage);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 450, 230));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Embedded Image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Modern No. 20", 2, 18)))); // NOI18N
        jScrollPane3.setViewportView(jLabelEmbedded);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 450, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jTextMessage.setText("");
        sourceImage = null;
        EmbeddedImage = null;
        jLabelSourceImage.setIcon(null);
        jLabelEmbedded.setIcon(null);
    }//GEN-LAST:event_jButtonResetActionPerformed

    private File showFileDialog(final boolean open)
    {
        JFileChooser fc = new JFileChooser("open an image");
        FileFilter filefilter = new FileFilter(){
            @Override
            public boolean accept(File file) {
                   String name = file.getName().toLowerCase();
                if(open)
                    return file.isDirectory()|| name.endsWith(".jpg") || name.endsWith(".jpeg")|| name.endsWith(".png") || name.endsWith(".bmg");
                return file.isDirectory() || name.endsWith(".png") || name.endsWith(".bmg");
            }

            @Override
            public String getDescription() {
                if(open)
                    return "Image(*.jpg , *.jpeg, *.png, *.bmp)";
                return "Image(*.png , *.bmp)";            
            }
            
             
            
        };
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter((javax.swing.filechooser.FileFilter) filefilter);
            
            File file = null;
            if(open && fc.showOpenDialog(this) == fc.APPROVE_OPTION)
                file = fc.getSelectedFile();
            else if(!open && fc.showSaveDialog(this) == fc.APPROVE_OPTION)
                 file = fc.getSelectedFile();
            return file;   
    }
    private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenActionPerformed
        File file = showFileDialog(true);
        
        if(file == null)
        {
            return;
        }
        
        try {
            sourceImage = ImageIO.read(file);
            jLabelSourceImage.setIcon(new ImageIcon(sourceImage));
            this.validate();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jButtonOpenActionPerformed

    private void jButtonEmbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmbedActionPerformed
        if(jTextMessage.equals("")||sourceImage == null){
            JOptionPane.showMessageDialog(this,"No message has been embedded","No picture or message found",JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        String Message = jTextMessage.getText();
        EmbeddedImage = sourceImage.getSubimage(0, 0, sourceImage.getWidth(), sourceImage.getHeight());
        embeddedMessage(EmbeddedImage, Message);
        
        jLabelEmbedded.setIcon(new ImageIcon(EmbeddedImage));
        this.validate();
    }//GEN-LAST:event_jButtonEmbedActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if(EmbeddedImage == null){
            JOptionPane.showMessageDialog(this, "No message has been embedded","Nothing to save", JOptionPane.ERROR_MESSAGE);
        }
        else{
            File file = showFileDialog(false);
            if(file == null)
                return;
            
            String name = file.getName();
            String Extention = name.substring(name.lastIndexOf(".")+1).toLowerCase();
            if(!Extention.equals("png") && !Extention.equals("bmp")){
                Extention = "png";
                file = new File(file.getAbsolutePath()+".png");
            }
            
            if(file.exists()) file.delete();
            try {
                ImageIO.write(EmbeddedImage, Extention.toUpperCase(), file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
                    
        }
        
    }//GEN-LAST:event_jButtonSaveActionPerformed

    
    private void embeddedMessage(BufferedImage img, String mess){
            int messageLength = mess.length();
            int imageWidth = img.getWidth(), imageHeight = img.getHeight(),imageSize = imageWidth * imageHeight;
            
            if(messageLength *8 + 32 > imageSize){
                JOptionPane.showMessageDialog(this, "Message is too long for this image", "Message too lonG!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            else{
                embedInteger(img,messageLength,0,0);
                byte b[] = mess.getBytes();
                for(int i=0; i<b.length; i++)
                    embedByte(img, b[i], i*8+32,0);
            }
    }
    
    private void embedInteger(BufferedImage img, int n, int start, int storageBit){
        int maxX = img.getWidth(), maxY = img.getHeight(),
                startX = start/maxY , startY = start -startX*maxY, count=0;
        
        for(int i = startX; i<maxX && count < 32 ; i++)
        {
            for(int j= startY; j<maxY && count < 32; j++)
            {
                int rgb = img.getRGB(i, j), bit = getBitValue(n,count);
                rgb = setBitValue(rgb,storageBit,bit);
                img.setRGB(i,j,rgb);
                count++;            
            }
        }
    }
    
    private void embedByte(BufferedImage img, byte b, int start, int storageBit){
        int maxX = img.getWidth(), maxY = img.getHeight(),
                startX = start/maxY, startY = start - startX*maxY,count = 0;
        for(int i = startX; i<maxX && count <8 ; i++){
            for(int j=startY; j<maxY && count<8; j++){
                int rgb = img.getRGB(i,j), bit = getBitValue(b,count);
                rgb = setBitValue(rgb, storageBit,bit);
                img.setRGB(i, j, rgb);
                count++;
            }
        }
    }
    
    
    
    private int getBitValue(int n,int location){
        int v = (int)(n&Math.round(Math.pow(2, location)));
        return v == 0?0:1;
    }
    
    private int setBitValue(int n, int  location , int bit){
        int toggle =(int) Math.pow(2, location), bv = getBitValue(n,location);
        if(bv == bit)
            return n;
        if(bv == 0 && bit ==1)
            n |= toggle;
        else if(bv == 1 && bit == 0)
            n ^= toggle;
        return n;
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
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Encode_Frame().setVisible(true);
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmbed;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelEmbedded;
    private javax.swing.JLabel jLabelSourceImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextMessage;
    // End of variables declaration//GEN-END:variables

}
