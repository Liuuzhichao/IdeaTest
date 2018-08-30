package cn.sdut.jdbc;

import java.sql.*;

/**
 * Created by liuzhichao on 2018/8/29.
 */

/**
 * Statement创建数据库对象会引起SQL注入问题,所以不推荐使用
 */
public class JDBCStatementTest {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //1.创建驱动类对象
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.定义URL连接
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String user = "scott";
            String password = "tiger";
            //3.建立连接
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("ok");
            //4.创建Statement对象
            stmt = conn.createStatement();
            /**
             * 插入操作
             */
            int deptno = 33;
            String dname = "电信实业部";
            String loc = "上海";
            //insert  into  dept(deptno,dname,loc)  values(33,'',to_date('','yyyy-mm-dd'));
            String sql = "insert  into  mydept(deptno,dname,loc)  values(" + deptno +
                    ",'" + dname + "','" + loc + "')";
            //5.执行查询或更新
            int i = stmt.executeUpdate(sql);
            //6.结果处理
            if (i > 0) {
                System.out.println("插入成功");
            }
            /**
             * 查询操作
             */
            //5.执行查询或更新
            int dno = 20;
            rs = stmt.executeQuery("select  deptno,dname,loc  from dept where  deptno<=" + dno);
            //6.结果处理
            /*while (rs.next()) {
                int deptno = rs.getInt(1);//第一列
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                System.out.println(deptno + "\t" + dname + "\t" + loc);
            }*/
            /**
             * Statement引起的SQL注入问题
             */
            /*String username="aaa' or 1='1";
            String pass="1233434";
            String sql="select *  from  users  where username='"
                    +username+"' and password='"+pass+"'";
            rs=stmt.executeQuery(sql);
            System.out.println("sql:"+sql);*/

        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
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
                if (stmt != null) {
                    stmt.close();
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
