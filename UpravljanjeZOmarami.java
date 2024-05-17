/**
* UpravljanjeZOmarami.java
*
* Opis:
*Vmesnik GUI
* @author Tomaž Mikolaj
* @version Vaja 35
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
* Javni razred za prikaz dela z razredi in objekti
* @author Tomaž Mikolaj
* @version Vaja 35
*/

// Glavni razred programa
public class UpravljanjeZOmarami {
    public static void main(String[] args) {
        // Ustvari nov okvir
        JFrame frame = new JFrame("Upravljanje z omarami");
        frame.setSize(400, 300); // velikost okna
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Nastavi izhod ob zapiranju okna X
        frame.setLayout(new BorderLayout()); // Nastavi postavitev komponent (layout)

        // vnos podatkov o omari
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JLabel lblStOmara = new JLabel("Številka omare:");
        JTextField txtStOmara = new JTextField();
        JLabel lblPolja = new JLabel("Število polic:");
        JTextField txtPolja = new JTextField();
        JLabel lblMaterial = new JLabel("Material (les/kovina):");
        JTextField txtMaterial = new JTextField();
        JButton btnDodaj = new JButton("Dodaj");
        panel.add(lblStOmara);
        panel.add(txtStOmara);
        panel.add(lblPolja);
        panel.add(txtPolja);
        panel.add(lblMaterial);
        panel.add(txtMaterial);
        panel.add(btnDodaj);

        // Seznam omar
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> omareList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(omareList);

        // klik na gumb "Dodaj"
        btnDodaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pridobi vnesene podatke
                String stOmara = txtStOmara.getText();
                String steviloPolj = txtPolja.getText();
                String material = txtMaterial.getText();
                // Sestavi informacije o omari
                String omaraInfo = "Številka omare: " + stOmara + ", Število polic: " + steviloPolj + ", Material: " + material;
                // Dodaj informacije o omari v seznam
                listModel.addElement(omaraInfo);
            }
        });

        // Dodaj komponente v okno
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true); // Naredi okno vidno
    }
}
