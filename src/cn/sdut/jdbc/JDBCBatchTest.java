package cn.sdut.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by liuzhichao on 2018/8/30.
 */

/**
 * JDBC进行数据的批量处理
 * PreparedStatement接口中的addBatch()方法将数据添加到批处理;
 * 执行用executeBatch()方法进行批处理;返回值是int[]数组,来存放每一次指令受影响的行数
 */
public class JDBCBatchTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            //1. 载入JDBC驱动程序
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.定义连接URL
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String user = "scott";
            String password = "tiger";
            //3.建立连接	Connection
            conn = DriverManager.getConnection(url, user, password);
            //System.out.println("ok");
            //4.创建PreparedStatement对象
            String sql = "insert into  mydept(DEPTNO,DNAME,LOC)  values(?,?,?)";
            pstmt = conn.prepareStatement(sql);

            /*for (int i = 0; i < 5; i++) {
                pstmt.setInt(1, 41 + i);
                pstmt.setString(2, "开发部" + i);
                pstmt.setString(3, "青岛");
                pstmt.addBatch();//添加到批处理指令
            }
            pstmt.executeBatch()*/;

            pstmt.setInt(1,00);
            pstmt.setString(2,"cc");
            pstmt.setString(3,null);
            pstmt.addBatch();

            pstmt.setInt(1,01);
            pstmt.setString(2,"ll");
            pstmt.setString(3,"ll");
            pstmt.addBatch();

            //5.执行查询或更新
            pstmt.executeBatch();
            //int[] arr = pstmt.executeBatch();
            //6.结果处理
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //7.关闭连接
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
