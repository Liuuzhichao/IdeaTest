package cn.sdut.jdbc;

import java.sql.*;

/**
 * Created by liuzhichao on 2018/8/30.
 */

/**
 * 滚动的结果集
 */
public class ResultSetInsensitiveTest {

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
            String sql = "select * from dept";
            //创建了一个可滚动的并且只读的结果集
            pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            rs = pstmt.executeQuery();
            /**
             * 获取到第一行数据
             * rs.first();获取第一行数据
             */
            rs.next();
            System.out.println(rs.getInt("DEPTNO") + "\t"
                    + rs.getString("DNAME") + "\t"
                    + rs.getString("LOC"));

            /**
             * 获取最后一行数据
             */
            rs.last();
            System.out.println(rs.getInt("DEPTNO") + "\t"
                    + rs.getString("DNAME") + "\t"
                    + rs.getString("LOC"));

            /**
             * 获取上一行的数据
             */
            rs.previous();//倒数第二行
            System.out.println(rs.getInt("DEPTNO") + "\t"
                    + rs.getString("DNAME") + "\t"
                    + rs.getString("LOC"));

            /**
             * 将指针移动到此 ResultSet 对象的给定行编号。
             */
            rs.absolute(4);//第四行的
            System.out.println(rs.getInt("DEPTNO") + "\t"
                    + rs.getString("DNAME") + "\t"
                    + rs.getString("LOC"));

            /**
             * 按相对行数（或正或负）移动指针。(正:向下移动;负:向上移动)
             */
            rs.relative(-2);//相对移动2行（2：向下移动；-2：向上移动）
            System.out.println(rs.getInt("DEPTNO") + "\t"
                    + rs.getString("DNAME") + "\t"
                    + rs.getString("LOC"));
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
