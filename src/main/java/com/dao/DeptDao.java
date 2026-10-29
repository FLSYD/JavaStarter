package com.dao;

import java.util.List;
import com.entity.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptDao {
    public Dept selectById(int id);
    public List<Dept> getAll();
    public int insert(String name);
    public int update(@Param("name") String name, @Param("id") int id);
    public int delete(int id);
    

    // public int insert(String name) {
    //     Connection connection = null;
    //     PreparedStatement preparedStatement = null;
    //     try {
    //         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis", "root", "FLSYDAB998");
    //         preparedStatement = connection.prepareStatement("INSERT INTO dept (name) VALUES (?)");
    //         preparedStatement.setString(1, name);
    //         return preparedStatement.executeUpdate();
    //     } catch (SQLException e) {
    //         throw new RuntimeException(e);
    //     } finally {
    //         try {
    //             if(preparedStatement!=null){
    //                 preparedStatement.close();
    //             }
    //         } catch (SQLException e) {
    //             throw new RuntimeException(e);
    //         }
    //         try {
    //             if(connection!=null){
    //                 connection.close();
    //             }
    //         } catch (SQLException e) {
    //             throw new RuntimeException(e);
    //         }
    //     }
    // }
    // public int delete(int id) {
    //     Connection connection = null;
    //     PreparedStatement preparedStatement = null;
    //     try {
    //         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis", "root", "FLSYDAB998");
    //         preparedStatement = connection.prepareStatement("DELETE FROM dept WHERE id = ?");
    //         preparedStatement.setInt(1, id);
    //         return preparedStatement.executeUpdate();
    //     } catch (SQLException e) {
    //         throw new RuntimeException(e);
    //     } finally {
    //         try {
    //             if(preparedStatement!=null){
    //                 preparedStatement.close();
    //             }
    //         } catch (SQLException e) {
    //             throw new RuntimeException(e);
    //         }
    //         try {
    //             if(connection!=null){
    //                 connection.close();
    //             }
    //         } catch (SQLException e) {
    //             throw new RuntimeException(e);
    //         }
    //     }
    // }
    // public int update(String name, int id) {
    //     Connection connection = null;
    //     PreparedStatement preparedStatement = null;
    //     try {
    //         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis", "root", "FLSYDAB998");  
    //         preparedStatement = connection.prepareStatement("UPDATE dept SET name = ? WHERE id = ?");
    //         preparedStatement.setString(1, name);
    //         preparedStatement.setInt(2, id);
    //         return preparedStatement.executeUpdate();
    //     } catch (SQLException e) {
    //         throw new RuntimeException(e);
    //     } finally {
    //         try {
    //             if(preparedStatement!=null){
    //                 preparedStatement.close();
    //             }
    //         } catch (SQLException e) {
    //             throw new RuntimeException(e);
    //         }
    //         try {
    //             if(connection!=null){
    //                 connection.close();
    //             }
    //         } catch (SQLException e) {
    //             throw new RuntimeException(e);
    //         }
    //     }
    // }
    // public List<Dept> selectAll() {
    //     Connection connection = null;
    //     PreparedStatement preparedStatement = null;
    //     ResultSet resultSet = null;
    //     List<Dept> deptList = new ArrayList<>();
    //     try {
    //         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis", "root", "FLSYDAB998");
    //         preparedStatement = connection.prepareStatement("SELECT * FROM dept");
    //         resultSet = preparedStatement.executeQuery();
    //         while (resultSet.next()) {
    //             Dept dept = new Dept();
    //             dept.setId(resultSet.getInt("id"));
    //             dept.setName(resultSet.getString("name"));
    //             deptList.add(dept);
    //         }
    //         return deptList;
    //     } catch (SQLException e) {
    //         throw new RuntimeException(e);
    //     } finally {
    //         try {
    //             if(preparedStatement!=null){
    //                 preparedStatement.close();
    //             }
    //         } catch (SQLException e) {
    //             throw new RuntimeException(e);
    //         }
    //         try {
    //             if(connection!=null){
    //                 connection.close();
    //             }
    //         } catch (SQLException e) {
    //             throw new RuntimeException(e);
    //         }
    //     }
    // }  
    // public Dept selectById(int id) {
    //     Connection connection = null;
    //     PreparedStatement preparedStatement = null;
    //     ResultSet resultSet = null;
    //     Dept dept = new Dept();
    //     try {
    //         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis", "root", "FLSYDAB998");
    //         preparedStatement = connection.prepareStatement("SELECT * FROM dept WHERE id = ?");
    //         preparedStatement.setInt(1, id);
    //         resultSet = preparedStatement.executeQuery();
    //         while (resultSet.next()) {
    //             dept.setId(resultSet.getInt("id"));
    //             dept.setName(resultSet.getString("name"));
    //         }
    //         return dept;
    //     } catch (SQLException e) {
    //         throw new RuntimeException(e);
    //     } finally {
    //         try {
    //             if(preparedStatement!=null){
    //                 preparedStatement.close();
    //             }
    //         } catch (SQLException e) {
    //             throw new RuntimeException(e);
    //         }
    //         try {
    //             if(connection!=null){
    //                 connection.close();
    //             }
    //         } catch (SQLException e) {
    //             throw new RuntimeException(e);
    //         }
    //     }
    // }
}