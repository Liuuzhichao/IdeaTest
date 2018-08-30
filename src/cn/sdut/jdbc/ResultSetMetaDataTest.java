package cn.sdut.jdbc;

import java.sql.*;

/**
 * Created by liuzhichao on 2018/8/30.
 */

/**
 * 元数据:对于集合操作
 * 可用于获取关于 ResultSet 对象中列的类型和属性信息的对象。
 */
public class ResultSetMetaDataTest {

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
            //System.out.println("ok");

            //4.创建PreparedStatement对象
            int dno = 30;
            String sql = "select * from dept where deptno>=?";
            pstmt = conn.prepareStatement(sql);

            ResultSetMetaData rmd = pstmt.getMetaData();
            int count = rmd.getColumnCount();    //获取列数
            for (int i = 1; i <= count; i++) {
                System.out.println(rmd.getColumnLabel(i) + "\t"
                        + rmd.getColumnName(i) + "\t"
                        + rmd.getColumnTypeName(i) + "\t"
                        + rmd.getPrecision(i) + "\t"
                        + rmd.isNullable(i));
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
