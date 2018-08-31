package cn.sdut.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by liuzhichao on 2018/8/31.
 */

/**
 * 事务的提交与回滚
 * 设置setAutoCommit()为false,然后手动进行事务的提交与回滚
 * 提交与回滚结束后再将setAutoCommit()设置为true;
 */
public class PreparedStatementTranscationTest {

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
            String sql = "insert into  dept(DEPTNO,DNAME,LOC)  values(?,?,?)";
            pstmt = conn.prepareStatement(sql);

            conn.setAutoCommit(false);//手动提交事务

            pstmt.setInt(1, 51);
            pstmt.setString(2, "开发部");
            pstmt.setString(3, "广州");
            pstmt.addBatch();

            pstmt.setInt(1, 52);
            pstmt.setString(2, "财务部");
            pstmt.setString(3, "上海");
            pstmt.addBatch();

            pstmt.setInt(1, 53);
            pstmt.setString(2, "销售部");
            pstmt.setString(3, "北京");
            pstmt.addBatch();
            //5.执行查询或更新
            pstmt.executeBatch();
            conn.commit();//提交事务
            conn.setAutoCommit(true);
            //6.结果处理
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            try {
                conn.rollback();//回滚事务
                conn.setAutoCommit(true);
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
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
