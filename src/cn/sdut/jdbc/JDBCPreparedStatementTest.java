package cn.sdut.jdbc;

import java.sql.*;

/**
 * Created by liuzhichao on 2018/8/30.
 */
public class JDBCPreparedStatementTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;

        //1.创建驱动类对象
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.定义连接URL
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String user = "scott";
            String password = "tiger";
            //3.建立连接
            conn = DriverManager.getConnection(url, user, password);

            //4.创建PreparedStatement对象
            String sql = "insert into  dept(deptno,dname,loc)  values(?,?,?)";
            //String sql="update dept dname=?,loc=? where deptno=?"
            //String sql="delete  from  dept where deptno=?"
            //String  sql="insert into  emp(empno,ename,hiredate)  values(?,?,to_date(?,'yyyy-mm-dd'))"
            //String sql="insert into  dept values(dept_seq.nextval,?,?)"
            /**
             * 插入操作
             * 索引值是语句中?的位置,与SQL语句的执行顺序无关
             */
            pstmt = conn.prepareStatement(sql);
            int deptno = 34;
            pstmt.setInt(1, deptno);
            pstmt.setString(2, "SVVD事业部");
            pstmt.setString(3, "青岛");
            pstmt.executeUpdate();//执行

            /**
             * 查询操作
             */
            //4.创建PreparedStatement对象
            String username="aaa";
            String pass="aaa";
            String sqll="select *  from  users  where username=? and  password=?";
            pstmt=conn.prepareStatement(sqll);

            //5.执行查询或更新
            pstmt.setString(1, username);
            pstmt.setString(2, pass);

            rs = pstmt.executeQuery();
            //6.结果处理
            if (rs.next()) {
                System.out.println("登陆成功");
            } else {
                System.out.println("登录失败");
            }
            /**
             * 查询操作
             */
            /*//4.创建PreparedStatement对象
            int dno = 30;
            String sql = "select * from dept where deptno>=?";
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, dno);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int deptno = rs.getInt("DEPTNO");
                String dname = rs.getString("DNAME");
                String loc = rs.getString("LOC");
                System.out.println(deptno + "\t" + dname + "\t" + loc);
            }*/
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
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
