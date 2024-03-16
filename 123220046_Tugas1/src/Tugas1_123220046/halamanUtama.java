package Tugas1_123220046;

import BangunDatar.Persegi;
import BangunRuang.Balok;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class halamanUtama extends JFrame implements ActionListener{
    JLabel welcome = new JLabel();
    JLabel keterangan = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
    JLabel labelPanjang = new JLabel("Panjang");
    JLabel labelLebar = new JLabel("Lebar");
    JLabel labelTinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    JLabel luas = new JLabel("Luas Persegi");
    JLabel keliling = new JLabel("Keliling Persegi");
    JLabel volume = new JLabel("Volume Balok");
    JLabel luasPermukaan = new JLabel("Luas Permukaan Balok");
    JLabel hasilLuas  = new JLabel("[Hasil berupa angka]");
    JLabel hasilKeliling  = new JLabel("[Hasil berupa angka]");
    JLabel hasilVolume  = new JLabel("[Hasil berupa angka]");
    JLabel hasilLuasPermukaan  = new JLabel("[Hasil berupa angka]");
    
    JTextField inputPanjang = new JTextField();
    JTextField inputLebar = new JTextField();
    JTextField inputTinggi = new JTextField();
    
    JButton tombolHitung = new JButton("Hitung");
    JButton tombolReset = new JButton("Reset");
    
    halamanUtama(String username, String jenisKelamin) {
        String panggilan = (jenisKelamin == "L") ? "Mr. " : "Mrs. ";
        
        this.setTitle("Halaman Utama");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        this.add(welcome);
        welcome.setBounds(20, 10, 400, 25);
        welcome.setFont(welcome.getFont().deriveFont(20f));
        welcome.setText("Welcome, " + panggilan + username);
        
        this.add(keterangan);
        keterangan.setBounds(20, 30, 400, 25);
        
        this.add(labelPanjang);
        labelPanjang.setBounds(20, 60, 100, 25);
        
        this.add(inputPanjang);
        inputPanjang.setBounds(150, 60, 300, 25);
        
        this.add(labelLebar);
        labelLebar.setBounds(20, 90, 100, 25);
        
        this.add(inputLebar);
        inputLebar.setBounds(150, 90, 300, 25);
        
        this.add(labelTinggi);
        labelTinggi.setBounds(20, 120, 100, 25);
        
        this.add(inputTinggi);
        inputTinggi.setBounds(150, 120, 300, 25);
        
        this.add(tombolHitung);
        tombolHitung.addActionListener(this);
        tombolHitung.setBounds(20, 160, 430, 25);
        
        this.add(tombolReset);
        tombolReset.addActionListener(this);
        tombolReset.setBounds(20, 190, 430, 25);
        
        this.add(hasil);
        hasil.setBounds(20, 220, 430, 25);
        hasil.setHorizontalAlignment(hasil.CENTER);
        
        this.add(luas);
        luas.setBounds(20, 250, 100, 25);
        
        this.add(hasilLuas);
        hasilLuas.setBounds(200, 250, 350, 25);
        
        this.add(keliling);
        keliling.setBounds(20, 270, 100, 25);
        
        this.add(hasilKeliling);
        hasilKeliling.setBounds(200, 270, 350, 25);
        
        this.add(volume);
        volume.setBounds(20, 290, 100, 25);
        
        this.add(hasilVolume);
        hasilVolume.setBounds(200, 290, 350, 25);
        
        this.add(luasPermukaan);
        luasPermukaan.setBounds(20, 310, 150, 25);
        
        this.add(hasilLuasPermukaan);
        hasilLuasPermukaan.setBounds(200, 310, 350, 25);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == tombolHitung) {
                double panjang = Double.parseDouble(inputPanjang.getText());
                double lebar = Double.parseDouble(inputLebar.getText());
                double tinggi = Double.parseDouble(inputTinggi.getText());

                Persegi bangun1 = new Persegi(panjang, lebar);
                Balok bangun2 = new Balok(panjang, lebar, tinggi);

                String hitungLuas = String.valueOf(bangun1.luas());
                String hitungKeliling = String.valueOf(bangun1.keliling());
                String hitungLuasPermukaan = String.valueOf(bangun2.luasPermukaan());
                String hitungVolume = String.valueOf(bangun2.volume());

                hasilLuas.setText(hitungLuas);
                hasilKeliling.setText(hitungKeliling);
                hasilLuasPermukaan.setText(hitungLuasPermukaan);
                hasilVolume.setText(hitungVolume);
            } else if (e.getSource() == tombolReset) {
                inputPanjang.setText(null);
                inputLebar.setText(null);
                inputTinggi.setText(null);
                hasilLuas.setText("[Hasil berupa angka]");
                hasilKeliling.setText("[Hasil berupa angka]");
                hasilLuasPermukaan.setText("[Hasil berupa angka]");
                hasilVolume.setText("[Hasil berupa angka]");

            }

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Input harus angka!", "Error", JOptionPane.ERROR_MESSAGE);
                    
        }

    }
    
    
    
}
