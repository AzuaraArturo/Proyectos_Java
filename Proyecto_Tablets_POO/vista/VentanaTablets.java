package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaTablets extends JFrame {
    private JLabel lblId;
    private JLabel lblUrl;
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblPulgadas;
    private JLabel lblCapacidad;
    private JLabel lblUrlmod;
    private JLabel lblMarcamod;
    private JLabel lblModelomod;
    private JLabel lblPulgadasmod;
    private JLabel lblCapacidadmod;
    private JLabel imagenCompu;



    private JTextField txtId;
    private JTextField txtUrl;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtPulgadas;
    private JTextField txtCapacidad;
    private JTextField txtUrlmod;
    private JTextField txtMarcamod;
    private JTextField txtModelomod;
    private JTextField txtPulgadasmod;
    private JTextField txtCapacidadmod;
    private JTextField txtIdmod;


    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnEliminar;


    private JTable tblTablets;

    private JScrollPane scrollPane;
    private GridLayout layout;


    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public VentanaTablets(String title) throws HeadlessException {
        super(title);
        this.setSize(1100,700);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);




        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(172, 216, 255, 252));
        lblId = new JLabel("Id: ");
        lblUrl = new JLabel("Url: ");
        lblMarca = new JLabel("Marca: ");
        lblModelo = new JLabel("Modelo: ");
        lblPulgadas = new JLabel("Pulgadas: ");
        lblCapacidad = new JLabel("Capacidad: ");
        txtId = new JTextField(5);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtUrl = new JTextField(25);
        txtMarca = new JTextField(10);
        txtModelo = new JTextField(10);
        txtPulgadas = new JTextField(10);
        txtCapacidad = new JTextField(10);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblModelo);
        panel1.add(txtModelo);
        panel1.add(lblPulgadas);
        panel1.add(txtPulgadas);
        panel1.add(lblCapacidad);
        panel1.add(txtCapacidad);
        panel1.add(btnAgregar);






        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(155, 232, 180, 252));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblTablets = new JTable();
        scrollPane = new JScrollPane(tblTablets);
        panel2.add(scrollPane);





        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(203, 171, 255, 252));
        imagenCompu = new JLabel("...");
        panel3.add(imagenCompu);




        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(227, 234, 185, 252));
        lblUrlmod = new JLabel("Url: ");
        lblMarcamod = new JLabel("Marca: ");
        lblModelomod = new JLabel("Modelo: ");
        lblPulgadasmod = new JLabel("Pulgadas: ");
        lblCapacidadmod = new JLabel("Capacidad: ");
        txtUrlmod = new JTextField(25);
        txtMarcamod = new JTextField(10);
        txtModelomod = new JTextField(10);
        txtPulgadasmod = new JTextField(10);
        txtCapacidadmod = new JTextField(10);
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        panel4.add(lblUrlmod);
        panel4.add(txtUrlmod);
        panel4.add(lblMarcamod);
        panel4.add(txtMarcamod);
        panel4.add(lblModelomod);
        panel4.add(txtModelomod);
        panel4.add(lblPulgadasmod);
        panel4.add(txtPulgadasmod);
        panel4.add(lblCapacidadmod);
        panel4.add(txtCapacidadmod);
        panel4.add(btnActualizar);
        panel4.add(btnEliminar);







        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JTextField getTxtIdmod() {
        return txtIdmod;
    }

    public void setTxtIdmod(JTextField txtIdmod) {
        this.txtIdmod = txtIdmod;
    }

    public JLabel getLblCapacidadmod() {
        return lblCapacidadmod;
    }

    public void setLblCapacidadmod(JLabel lblCapacidadmod) {
        this.lblCapacidadmod = lblCapacidadmod;
    }

    public JLabel getImagenCompu() {
        return imagenCompu;
    }

    public void setImagenCompu(JLabel imagenCompu) {
        this.imagenCompu = imagenCompu;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public void setLblModelo(JLabel lblModelo) {
        this.lblModelo = lblModelo;
    }

    public JLabel getLblPulgadas() {
        return lblPulgadas;
    }

    public void setLblPulgadas(JLabel lblPulgadas) {
        this.lblPulgadas = lblPulgadas;
    }

    public JLabel getLblCapacidad() {
        return lblCapacidad;
    }

    public void setLblCapacidad(JLabel lblCapacidad) {
        this.lblCapacidad = lblCapacidad;
    }

    public JLabel getLblUrlmod() {
        return lblUrlmod;
    }

    public void setLblUrlmod(JLabel lblUrlmod) {
        this.lblUrlmod = lblUrlmod;
    }

    public JLabel getLblMarcamod() {
        return lblMarcamod;
    }

    public void setLblMarcamod(JLabel lblMarcamod) {
        this.lblMarcamod = lblMarcamod;
    }

    public JLabel getLblModelomod() {
        return lblModelomod;
    }

    public void setLblModelomod(JLabel lblModelomod) {
        this.lblModelomod = lblModelomod;
    }

    public JLabel getLblPulgadasmod() {
        return lblPulgadasmod;
    }

    public void setLblPulgadasmod(JLabel lblPulgadasmod) {
        this.lblPulgadasmod = lblPulgadasmod;
    }

    public JLabel getLblIdCapacidadmod() {
        return lblCapacidadmod;
    }

    public void setLblIdCapacidadmod(JLabel lblIdCapacidadmod) {
        this.lblCapacidadmod = lblIdCapacidadmod;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JTextField getTxtPulgadas() {
        return txtPulgadas;
    }

    public void setTxtPulgadas(JTextField txtPulgadas) {
        this.txtPulgadas = txtPulgadas;
    }

    public JTextField getTxtCapacidad() {
        return txtCapacidad;
    }

    public void setTxtCapacidad(JTextField txtCapacidad) {
        this.txtCapacidad = txtCapacidad;
    }

    public JTextField getTxtUrlmod() {
        return txtUrlmod;
    }

    public void setTxtUrlmod(JTextField txtUrlmod) {
        this.txtUrlmod = txtUrlmod;
    }

    public JTextField getTxtMarcamod() {
        return txtMarcamod;
    }

    public void setTxtMarcamod(JTextField txtMarcamod) {
        this.txtMarcamod = txtMarcamod;
    }

    public JTextField getTxtModelomod() {
        return txtModelomod;
    }

    public void setTxtModelomod(JTextField txtModelomod) {
        this.txtModelomod = txtModelomod;
    }

    public JTextField getTxtPulgadasmod() {
        return txtPulgadasmod;
    }

    public void setTxtPulgadasmod(JTextField txtPulgadasmod) {
        this.txtPulgadasmod = txtPulgadasmod;
    }

    public JTextField getTxtCapacidadmod() {
        return txtCapacidadmod;
    }

    public void setTxtCapacidadmod(JTextField txtCapacidadmod) {
        this.txtCapacidadmod = txtCapacidadmod;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JTable getTblTablets() {
        return tblTablets;
    }

    public void setTblTablets(JTable tblTablets) {
        this.tblTablets = tblTablets;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
    public void limpiar(){
        txtUrl.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtPulgadas.setText("");
        txtCapacidad.setText("");

    }
}
