package org.example.controlador;

import org.example.modelo.ModeloTablaTablets;
import org.example.modelo.Tablets;
import org.example.vista.VentanaTablets;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorTablets extends MouseAdapter {
    private VentanaTablets view;
    private ModeloTablaTablets modelo;

    public ControladorTablets(VentanaTablets view) {
        this.view = view;
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblTablets().addMouseListener(this);
        modelo = new ModeloTablaTablets();
        this.view.getTblTablets().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {

            modelo.cargarDatos();
            this.view.getTblTablets().setModel(modelo);
            this.view.getTblTablets().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()) {
            System.out.println("Evento sobre boton agregar");
            Tablets tablets = new Tablets();
            tablets.setId(0);
            tablets.setUrl(this.view.getTxtUrl().getText());
            tablets.setMarca(this.view.getTxtMarca().getText());
            tablets.setModelo(this.view.getTxtModelo().getText());
            tablets.setPulgadas(Float.parseFloat(this.view.getTxtPulgadas().getText()));
            tablets.setCapacidad(Integer.parseInt(this.view.getTxtCapacidad().getText()));
            if (modelo.agregarTablets(tablets)) {
                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblTablets().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Por favor revise su conexion", "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }
        if (e.getSource() == this.view.getTblTablets()) {
            System.out.println("Evento sobre tabla");
            int index = this.view.getTblTablets().getSelectedRow();
            Tablets tmp = modelo.getTabletsIndex(index);
            try {
                this.view.getImagenCompu().setIcon(tmp.getImagen());
            } catch (MalformedURLException mfue) {
                System.out.println(mfue.getMessage());
            }
            this.view.getTxtUrlmod().setText(tmp.getUrl());
            this.view.getTxtMarcamod().setText(tmp.getMarca());
            this.view.getTxtModelomod().setText(tmp.getModelo());
            this.view.getTxtPulgadasmod().setText(Float.toString(tmp.getPulgadas()));
            this.view.getTxtCapacidadmod().setText(Integer.toString(tmp.getCapacidad()));

        }
        if (e.getSource() == view.getBtnActualizar()) {
            System.out.println("Evento sobre boton modificar");
            Tablets tablets = new Tablets();
            int renglon = this.view.getTblTablets().getSelectedRow();
            int id =(int) this.view.getTblTablets().getValueAt(renglon,0);
            tablets.setId(id);
                tablets.setUrl(this.view.getTxtUrlmod().getText());
                tablets.setMarca(this.view.getTxtMarcamod().getText());
                tablets.setModelo(this.view.getTxtModelomod().getText());
                tablets.setPulgadas(Float.parseFloat(this.view.getTxtPulgadasmod().getText()));
                tablets.setCapacidad(Integer.parseInt(this.view.getTxtCapacidadmod().getText()));
                int respuesta = JOptionPane.showConfirmDialog(view, "Actualizar", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_NO_OPTION) {
                    if (modelo.updateTablets(tablets)) {
                        JOptionPane.showMessageDialog(view, "Se actualizo correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                        modelo.cargarDatos();
                        this.view.getTblTablets().setModel(modelo);
                        this.view.getTblTablets().updateUI();
                    } else {
                        JOptionPane.showMessageDialog(view, "Error al actualizar", "", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    System.out.println("No se pudo actualizar");
                }

            }

        if (e.getSource() == view.getBtnEliminar()) {
            System.out.println("Evento sobre boton eliminar");
            int index = this.view.getTblTablets().getSelectedRow();
            Tablets tabletsdel = modelo.getTabletsIndex(index);
            int respuesta = JOptionPane.showConfirmDialog(view, "Borrar", "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (respuesta == JOptionPane.YES_NO_OPTION) {
                if (modelo.deleteTablets(tabletsdel)) {
                    JOptionPane.showMessageDialog(null, "Eliminado");
                    modelo.cargarDatos();
                    this.view.getTblTablets().setModel(modelo);
                    this.view.getTblTablets().updateUI();
                } else {
                    JOptionPane.showMessageDialog(view, "Error al intentar borrar, favor de revisar su conexion con la base de datos", "", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                System.out.println("No se pudo eliminar");
            }

            }
        }
    }







