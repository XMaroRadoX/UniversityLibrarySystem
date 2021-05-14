/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Admin.*;
import Librarian.LibrarianSection;
import Logic.Library;
import Logic.Student;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Marwan
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddLibrarian
     */
    Library library;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a");

    public AddStudent() {
        initComponents();
    }

    public AddStudent(Library library) {
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

        containerPanel = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        addLibrarianButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        error = new javax.swing.JLabel();
        namerError = new javax.swing.JLabel();
        PasswordError = new javax.swing.JLabel();
        mailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailError = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressError = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        cityError = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        contactNoError = new javax.swing.JLabel();
        contactNoLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idError = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Librarian - Add Student");
        setBackground(new java.awt.Color(0, 0, 0));

        containerPanel.setBackground(new java.awt.Color(0, 0, 0));

        Header.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Header.setForeground(new java.awt.Color(153, 153, 153));
        Header.setText("Add Student");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(153, 153, 153));
        nameLabel.setText("Name:");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(153, 153, 153));
        passwordLabel.setText("Password:");

        addLibrarianButton.setBackground(new java.awt.Color(0, 0, 0));
        addLibrarianButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addLibrarianButton.setForeground(new java.awt.Color(255, 255, 255));
        addLibrarianButton.setText("Add student");
        addLibrarianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLibrarianButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nameField.setBackground(new java.awt.Color(51, 51, 51));
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setCaretColor(new java.awt.Color(255, 255, 255));
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(51, 51, 51));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        error.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));

        namerError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        namerError.setForeground(new java.awt.Color(255, 0, 0));

        PasswordError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        PasswordError.setForeground(new java.awt.Color(255, 0, 0));

        mailField.setBackground(new java.awt.Color(51, 51, 51));
        mailField.setForeground(new java.awt.Color(255, 255, 255));
        mailField.setCaretColor(new java.awt.Color(255, 255, 255));
        mailField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mailField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        mailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailFieldActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(153, 153, 153));
        emailLabel.setText("E-mail:");

        emailError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        emailError.setForeground(new java.awt.Color(255, 0, 0));

        addressField.setBackground(new java.awt.Color(51, 51, 51));
        addressField.setForeground(new java.awt.Color(255, 255, 255));
        addressField.setCaretColor(new java.awt.Color(255, 255, 255));
        addressField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addressField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(153, 153, 153));
        addressLabel.setText("Address:");

        addressError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        addressError.setForeground(new java.awt.Color(255, 0, 0));

        cityField.setBackground(new java.awt.Color(51, 51, 51));
        cityField.setForeground(new java.awt.Color(255, 255, 255));
        cityField.setCaretColor(new java.awt.Color(255, 255, 255));
        cityField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cityField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });

        cityError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        cityError.setForeground(new java.awt.Color(255, 0, 0));

        cityLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(153, 153, 153));
        cityLabel.setText("City:");

        contactField.setBackground(new java.awt.Color(51, 51, 51));
        contactField.setForeground(new java.awt.Color(255, 255, 255));
        contactField.setCaretColor(new java.awt.Color(255, 255, 255));
        contactField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contactField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        contactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactFieldActionPerformed(evt);
            }
        });

        contactNoError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        contactNoError.setForeground(new java.awt.Color(255, 0, 0));

        contactNoLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        contactNoLabel.setForeground(new java.awt.Color(153, 153, 153));
        contactNoLabel.setText("Contact No:");

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        idLabel.setForeground(new java.awt.Color(153, 153, 153));
        idLabel.setText("ID:");

        idError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        idError.setForeground(new java.awt.Color(255, 0, 0));

        idField.setBackground(new java.awt.Color(51, 51, 51));
        idField.setForeground(new java.awt.Color(255, 255, 255));
        idField.setCaretColor(new java.awt.Color(255, 255, 255));
        idField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        idField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Header)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(contactNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namerError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactNoError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addComponent(addLibrarianButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namerError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(idError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactNoError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLibrarianButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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

    public static boolean isValidEmail(String email) {
        if (email != null) {
            Pattern p = Pattern.compile("^[A-Za-z].*?@gmail\\.com$");
            Matcher m = p.matcher(email);
            return m.find();
        }
        return false;
    }

    private void addLibrarianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLibrarianButtonActionPerformed
        boolean errors = false;

        String name = nameField.getText();
        String password = passwordField.getText();
        String mail = mailField.getText();
        String city = cityField.getText();
        String address = addressField.getText();
        String contact = contactField.getText();
        String id = idField.getText();

        error.setText(null);
        namerError.setText(null);
        PasswordError.setText(null);
        emailError.setText(null);
        addressError.setText(null);
        cityError.setText(null);
        contactNoError.setText(null);
        idError.setText(null);

        if (nameField.getText().equals("") && passwordField.getText().equals("") && mailField.getText().equals("") && addressField.getText().equals("") && cityField.getText().equals("") && contactField.getText().equals("") && idField.getText().equals("")) {
            error.setText("No data entered");
            return;
        } else {
            if (name.equals("")) {
                namerError.setText("No data entered");
                errors = true;
            }
            if (stringContainsNumber(name)) {
                namerError.setText("Name contains invalid characters");
                errors = true;
            }
            if (password.equals("")) {
                PasswordError.setText("No data entered");
                errors = true;
            }
            if (mail.equals("")) {
                emailError.setText("No data entered");
                errors = true;
            } else if (isValidEmail(mail) == false) {
                emailError.setText("Email must follow example@gmail.com");
                errors = true;
            }
            if (address.equals("")) {
                addressError.setText("No data entered");
                errors = true;
            }
            if (city.equals("")) {
                cityError.setText("No data entered");
                errors = true;
            }
            if ((id.equals(""))) {
                idError.setText("No data entered");
                errors = true;
            } else {
                try {
                    Integer.parseInt(id);

                } catch (NumberFormatException e) {
                    idError.setText("Enter valid ID");
                    errors = true;
                }

            }
            if ((contact.equals(""))) {
                contactNoError.setText("No data entered");
                errors = true;
            } else {
                try {
                    Integer.parseInt(contact);

                } catch (NumberFormatException e) {
                    contactNoError.setText("Enter valid contact no.");
                    errors = true;
                }

            }
        }
        if (!errors) {
            int i = library.getStudentsCount();
            library.getStudents()[i++] = new Student(name, password, mail, city, Integer.parseInt(id), address, contact, 0, 0);
            library.setStudentsCount(i);
            saveInFile(library.getPath());
            JOptionPane.showMessageDialog(null, "Student added successfully");
            AdminSection as = new AdminSection(library);
            dispose();
            as.setVisible(true);
        }
    }//GEN-LAST:event_addLibrarianButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        AdminSection as = new AdminSection(library);
        dispose();
        as.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void mailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void contactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JLabel PasswordError;
    private javax.swing.JButton addLibrarianButton;
    private javax.swing.JLabel addressError;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cityError;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField contactField;
    private javax.swing.JLabel contactNoError;
    private javax.swing.JLabel contactNoLabel;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel emailError;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel error;
    private javax.swing.JLabel idError;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField mailField;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel namerError;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
