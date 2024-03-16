package Tugas1_123220046;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class loginPage extends JFrame implements ActionListener {
    JLabel welcome = new JLabel("Selamat Datang!");
    JLabel keterangan = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel labelUsername = new JLabel("Username");
    JLabel labelPassword = new JLabel("Password");
    JLabel labelJenisKelamin = new JLabel("Jenis Kelamin");
    
    JTextField inputUsername = new JTextField();
    
    JPasswordField inputPassword = new JPasswordField();
    
    JRadioButton pilihLaki = new JRadioButton("Laki-laki", true);
    JRadioButton pilihPerempuan = new JRadioButton("Perempuan");
    
    JButton login = new JButton("Login");
    
    loginPage() {
        this.setTitle("Login Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        this.add(welcome);
        welcome.setBounds(20, 10, 200, 25);
        welcome.setFont(welcome.getFont().deriveFont(20f));
        
        this.add(keterangan);
        keterangan.setBounds(20, 30, 250, 25);
        
        this.add(labelUsername);
        labelUsername.setBounds(20, 70, 250, 25);
        
        this.add(inputUsername);
        inputUsername.setBounds(20, 90, 400, 25);
        
        this.add(labelPassword);
        labelPassword.setBounds(20, 120, 250, 25);
        
        this.add(inputPassword);
        inputPassword.setBounds(20, 140, 400, 25);
        
        this.add(labelJenisKelamin);
        labelJenisKelamin.setBounds(20, 170, 250, 25);
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihLaki);
        pilihJenisKelamin.add(pilihPerempuan);
        
        this.add(pilihLaki);
        pilihLaki.setBounds(20, 190, 150, 25);
        
        this.add(pilihPerempuan);
        pilihPerempuan.setBounds(170, 190, 250, 25);
        
        this.add(login);
        login.setBounds(20, 240, 400, 25);
        login.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String username = inputUsername.getText();
            String password = String.valueOf(inputPassword.getPassword());
            String jenisKelamin = pilihLaki.isSelected() ? "L" : "P";
            
            if (username.isEmpty()) {
                throw new Exception("username tidak boleh kosong !");
            }
            else if (password.isEmpty()) {
                throw new Exception("password tidak boleh koaong !");
            }
            
            new halamanUtama(username, jenisKelamin);
            this.dispose();
            
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
        
    }
    
}
