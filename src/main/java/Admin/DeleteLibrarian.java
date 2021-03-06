/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Logic.Library;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Amr
 */
public class DeleteLibrarian extends javax.swing.JFrame {

    /**
     * Creates new form DeleteLibrarian1
     */
    Library library;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a");
    
    public DeleteLibrarian() {
        initComponents();
    }
    
    public DeleteLibrarian(Library library) {
        this.library = library;
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
        Header = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin - Delete librarian");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Header.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Header.setForeground(new java.awt.Color(153, 153, 153));
        Header.setText("Delete Librarian");

        NameLabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(153, 153, 153));
        NameLabel.setText("Librarian Name:");

        nameField.setBackground(new java.awt.Color(51, 51, 51));
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setCaretColor(new java.awt.Color(255, 255, 255));
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        error.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Header)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(Header)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed
    public void saveInFile(String s) {
        BufferedWriter bw = null;
        int i = 0;
        try {
            File file = new File(s);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (i = 0; i < library.getAdminsCount(); i++) {
                String data = "a," + library.getAdmins()[i].getName() + "," + library.getAdmins()[i].getPassword() + "\n";
                bw.write(data);
            }

            for (i = 0; i < library.getLibraiansCount(); i++) {
                String data = "l," + library.getLibraians()[i].getName() + "," + library.getLibraians()[i].getPassword() + "," + library.getLibraians()[i].getEmail() + "," + library.getLibraians()[i].getCity() + "," + library.getLibraians()[i].getAddress() + "," + library.getLibraians()[i].getContactNo() + "\n";
                bw.write(data);
            }

            for (i = 0; i < library.getBooksCount(); i++) {
                String data = "b," + library.getBooks()[i].getCallNo() + "," + library.getBooks()[i].getBookName() + "," + library.getBooks()[i].getAuthorName() + "," + library.getBooks()[i].getPublisherName() + "," + library.getBooks()[i].getQuantity() + "," + library.getBooks()[i].getIssued() + "," + formatter.format(library.getBooks()[i].getAddDate()) + "\n";
                bw.write(data);
            }
            for (i = 0; i < library.getStudentsCount(); i++) {
                int k;
                String data = "s," + library.getStudents()[i].getName() + "," + library.getStudents()[i].getPassword() + "," + library.getStudents()[i].getEmail() + "," + library.getStudents()[i].getCity() + "," + Integer.toString(library.getStudents()[i].getId()) + "," + library.getStudents()[i].getAddress() + "," + library.getStudents()[i].getContactNo() + "," + Integer.toString(library.getStudents()[i].getIssued()) + "," + Double.toString(library.getStudents()[i].getPenalty());
                if (library.getStudents()[i].getIssued() > 0) {
                    k = 0;
                    while (true) {
                        if (k == library.getStudents()[i].getIssued()) {
                            break;
                        }
                        data = data + "," + library.getStudents()[i].getIssuedBooks()[k] + "," + formatter.format(library.getStudents()[i].getIssueDates()[k]) + "," + formatter.format(library.getStudents()[i].getReturnDates()[k]);

                        k++;
                    }
                    data = data + ",null" + "\n";
                } else {
                    data = data + "\n";
                }
                bw.write(data);
            }

        } catch (IOException ioe) {
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
            }
        }
    }
    
    public boolean stringContainsNumber(String s) {
        return Pattern.compile("[0-9]").matcher(s).find();
    }
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        error.setText(null);
        if (nameField.getText().equals("")) {
            error.setText("No data entered");
            return;
        } else if (stringContainsNumber(nameField.getText())) {
            error.setText("Name contains invalid characters");
            return;
        }
        
        int[] indices = new int[library.getLibraiansCount()];
        int counter = 0;
        
        for (int i = 0; i < library.getLibraiansCount(); i++) {
            if (nameField.getText().equals(library.getLibraians()[i].getName())) {
                indices[counter] = i;
                counter++;
            }
        }
        
        if (counter == 1) {
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this libraian") == 0) {
                for (int j = indices[counter - 1]; j < library.getLibraiansCount(); j++) {
                    library.getLibraians()[j] = library.getLibraians()[j + 1];
                }
                library.setLibraiansCount(library.getLibraiansCount() - 1);
                saveInFile(library.getPath());
                JOptionPane.showMessageDialog(null, "Record deleted successfully!");
                AdminSection as = new AdminSection(library);
                dispose();
                as.setVisible(true);
                return;
            }
        } else if(counter > 1) {
            String input;
            String data = "";
            
            for (int i = 0; i < counter; i++) {
                data = data + (i + 1) + ":\nName: " + library.getLibraians()[indices[i]].getName() + "\nPassword: " + library.getLibraians()[indices[i]].getPassword() + "\nContact no: " + library.getLibraians()[indices[i]].getContactNo() + "\n";
            }
            input = JOptionPane.showInputDialog("Multiple librarians found\n" + data);
            try {
                Integer.parseInt(input);
                
            } catch (NumberFormatException e) {
                error.setText("Wrong number entered");
                return;
            }
            for (int j = indices[Integer.parseInt(input) - 1]; j < library.getLibraiansCount(); j++) {
                library.getLibraians()[j] = library.getLibraians()[j + 1];
            }
            library.setLibraiansCount(library.getLibraiansCount() - 1);
            saveInFile(library.getPath());
            JOptionPane.showMessageDialog(null, "Record deleted successfully!");
            AdminSection as = new AdminSection(library);
            dispose();
            as.setVisible(true);
            return;
        }
        error.setText("No libraians found");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        AdminSection as = new AdminSection(library);
        dispose();
        as.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteLibrarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel error;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
