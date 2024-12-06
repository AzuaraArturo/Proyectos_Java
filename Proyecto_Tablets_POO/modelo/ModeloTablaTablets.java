package org.example.modelo;

import org.example.persistencia.TabletsDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaTablets implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Tablets> datos;
    private TabletsDAO tdao;

    public ModeloTablaTablets() {
        tdao = new TabletsDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaTablets(ArrayList<Tablets> datos) {
        this.datos = datos;
        tdao = new TabletsDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Id";
            case 1:
                return "Url";
            case 2:
                return "Marca";
            case 3:
                return "Modelo";
            case 4:
                return "Pulgadas";
            case 5:
                return "Capacidad";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return Float.class;
            case 5:
                return Integer.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tablets tmp = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getUrl();
            case 2:
                return tmp.getMarca();
            case 3:
                return tmp.getModelo();
            case 4:
                return tmp.getPulgadas();
            case 5:
                return tmp.getCapacidad();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                //datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setMarca((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setModelo((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setPulgadas((Float) aValue);
                break;
            case 5:
                datos.get(rowIndex).setCapacidad((Integer) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos() {
        try {
            ArrayList<Tablets> tirar = tdao.obtenerTodo();
            System.out.println(tirar);
            datos = tdao.obtenerTodo();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }

    }

    public boolean agregarTablets(Tablets tablets) {
        boolean resultado = false;
        try {
            if (tdao.insertar(tablets)) {
                datos.add(tablets);
                resultado = true;

            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());


        }
        return resultado;
    }

    public Tablets getTabletsIndex(int idx) {
        return datos.get(idx);

    }

    public boolean updateTablets(Tablets tablets) {
        boolean resultado = false;
        try {
            if (tdao.update(tablets)) {
                System.out.println("Se ha actualizado un registro");
                resultado = true;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
        public boolean deleteTablets (Tablets tablets){
            boolean resultado = false;
            try {
                if (tdao.delete(Integer.toString(tablets.getId()))) {
                    resultado = true;
                    System.out.println("Se ha eliminado un registro");
                }
            } catch (SQLException sqle) {
                System.out.println(sqle.getMessage());
            }
            return resultado;
        }

    }



