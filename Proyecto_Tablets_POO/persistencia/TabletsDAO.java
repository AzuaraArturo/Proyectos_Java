package org.example.persistencia;

import org.example.modelo.Tablets;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TabletsDAO implements InferfazDAO {
    public TabletsDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Tablets(Url, Marca, Modelo, Pulgadas, Capacidad) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("TabletsDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Tablets)obj).getUrl());
        pstm.setString(2,((Tablets)obj).getMarca());
        pstm.setString(3,((Tablets)obj).getModelo());
        pstm.setDouble(4,((Tablets)obj).getPulgadas());
        pstm.setInt(5,((Tablets)obj).getCapacidad());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Tablets SET Url = ?, Marca = ?, Modelo = ?, Pulgadas = ?, Capacidad = ? WHERE id = ?; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("TabletsDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Tablets)obj).getUrl());
        pstm.setString(2,((Tablets)obj).getMarca());
        pstm.setString(3,((Tablets)obj).getModelo());
        pstm.setDouble(4,((Tablets)obj).getPulgadas());
        pstm.setInt(5,((Tablets)obj).getCapacidad());
        pstm.setInt(6,((Tablets)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Tablets WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("TabletsDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Tablets";
        ArrayList<Tablets> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("TabletsDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Tablets(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getFloat(5),rst.getInt(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM Tablets WHERE id =?;";
        Tablets tablets = null;
        PreparedStatement pstm = ConexionSingleton.getInstance("TabletsDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            tablets = new Tablets(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getFloat(5),rst.getInt(6));
            return tablets;
        }
        return null;
    }
}
