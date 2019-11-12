package jobsheet11.percobaan2.inputGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm1841720060Nurudin extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton btn;
    private JPanel panel;

    public MyInputForm1841720060Nurudin() {
        createTextFieldNurudin();
        createButtonNurudin();
        createPanelNurudin();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextFieldNurudin() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai C: ");
        cLabel = new JLabel("Hasil : ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButtonNurudin() {
        button = new JButton("Calculate");
        btn = new JButton("SUM");
        class AddInterestListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil = " + c);
            }
        }
       
        class Tambah implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a + b;
                cLabel.setText("Hasil = " + c);
            }
        }
        ActionListener tambah = new Tambah();
        btn.addActionListener(tambah);
        
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

    private void createPanelNurudin() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bField);
        panel.add(bField);
        panel.add(button);
        panel.add(btn);
        panel.add(cLabel);
        add(panel);
    }
}
