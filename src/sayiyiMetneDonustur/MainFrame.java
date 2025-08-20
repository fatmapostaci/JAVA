package sayiyiMetneDonustur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame {


    private JPanel panel;
    private JButton btnDonustur;
    private JTextField txtDigitalValue;
    private JLabel label;
    private JTextField txtWrittenValue;

    public MainFrame() {
        setTitle("Sayıyı Metne Dönüştürme");  //pencerenin başlık metni
       setSize(600, 200);
      //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Pencereyi ekranın ortasına yerleştir



        // Panel Oluşturma  //Panel, bir düzen yöneticisi (FlowLayout) kullanarak bileşenleri sırayla yerleştiriyor.
        panel = new JPanel(); // Ana panel
        panel.setLayout(new FlowLayout()); // Basit düzen: bileşenleri sırayla ekler

        // Label Ekleme
        label = new JLabel("Sayıyı rakamlar ile yazınız"); // Etiket (Label)  //bir metin etiketi tanımladık.
        panel.add(label); // Label'i panele ekle

        // TextField (Rakam Alanı)
        txtDigitalValue = new JTextField(15); // 15 sütun genişlik
        panel.add(txtDigitalValue);

        // Buton Ekleme
        btnDonustur = new JButton("Sayıyı Metne Dönüştür"); // Buton
        panel.add(btnDonustur); // Buton'u panele ekle

        // TextField (Metin Alanı)
        txtWrittenValue = new JTextField(30); // 30 sütun genişlik
        panel.add(txtWrittenValue);


        // Başka bir Label (Sonuç gösterme)
        JLabel resultLabel = new JLabel("");
        panel.add(resultLabel);

        // Buton Tıklama Olayı
        btnDonustur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TextField'deki metni al ve sonuç label'ına yazdır
                String inputText = txtDigitalValue.getText();

                txtWrittenValue.setText( MetneDonustur.metneDonustur(inputText) );
            }
        });

        // JFrame'e panel ekle
        add(panel);
        setVisible(true);
    }


    public static void main(String[] args) {
        // JFrame örneğini oluştur ve göster
        try {
            SwingUtilities.invokeLater(MainFrame::new);  // Swing işlemlerini güvenli bir şekilde başlatıyoruz.
        } catch (Exception e) {
            // Ana frame oluştur
            JFrame frame = new JFrame("Exception Popup Örneği");
            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Bir buton ekle
            JButton button = new JButton("Hata Göster");
            button.addActionListener(e -> {
                try {
                    // Hata fırlatan kod
                    int result = 10 / 0; // Bu bir ArithmeticException oluşturur
                } catch (Exception ex) {
                    // Exception durumunda popup pencere göster
                    showErrorPopup(frame, "Bir hata oluştu: " + ex.getMessage());
                }
            });
        }
    }

    // Hata mesajını göstermek için bir method
    private static void showErrorPopup(JFrame parent, String message) {
        JOptionPane.showMessageDialog(
                parent,                  // Ana pencere referansı
                message,                 // Gösterilecek mesaj
                "Hata!",                 // Pencere başlığı
                JOptionPane.ERROR_MESSAGE // Hata simgesi
        );
    }
}
