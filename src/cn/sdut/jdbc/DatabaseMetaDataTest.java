package cn.sdut.jdbc;

import java.sql.*;

/**
 * Created by liuzhichao on 2018/8/31.
 */

/**
 * 元数据:数据库元数据
 */
public class DatabaseMetaDataTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //1.创建驱动类对象
            //new  oracle.jdbc.driver.OracleDriver();
            //DriverManager.registerDriver(new  oracle.jdbc.driver.OracleDriver());
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.定义连接URL
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String user = "scott";
            String password = "tiger";
            //3.建立连接
            conn = DriverManager.getConnection(url, user, password);
            DatabaseMetaData dmd = conn.getMetaData();
            System.out.println("MajorVersion:" + dmd.getDatabaseMajorVersion());
            System.out.println("DriverName:" + dmd.getDriverName());
            System.out.println("DriverVersion:" + dmd.getDriverVersion());
            System.out.println("URL:" + dmd.getURL());
            System.out.println("USERNAME:" + dmd.getUserName());
            System.out.println("DatabaseProductName:" + dmd.getDatabaseProductName());
            System.out.println("DatabaseProductVersion:" + dmd.getDatabaseProductVersion());
            System.out.println("SchemaTerm:" + dmd.getSchemaTerm());
            System.out.println("================================");

            rs = dmd.getTableTypes();
            while (rs.next()) {
                System.out.println(rs.getString("TABLE_TYPE"));
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            //7.关闭连接
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
