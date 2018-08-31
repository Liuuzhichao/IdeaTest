package cn.sdut.jdbc;

import java.sql.*;

/**
 * Created by liuzhichao on 2018/8/31.
 */

/**
 * 元数据:参数的元数据
 */
public class ParameterMetaDataTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            //1.创建驱动类对象
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.定义连接URL
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String user = "scott";
            String password = "tiger";
            //3.建立连接
            conn = DriverManager.getConnection(url, user, password);

            //4.创建PreparedStatement对象
            String username = "aaa";
            String pass = "aaa";
            String sql = "select *  from  users  where username=? and  password=?";
            pstmt = conn.prepareStatement(sql);

            ParameterMetaData pmd = pstmt.getParameterMetaData();
            int count = pmd.getParameterCount();//参数的个数
            System.out.println(count);
			/* for(int i=1;i<=count;i++)
			  {
				  System.out.println(pmd.getParameterTypeName(i)+"\t"
						  +pmd.getPrecision(i)+"\t"
						 + pmd.getParameterClassName(i));
			  }*/

            //5.执行查询或更新
            pstmt.setString(1, username);
            pstmt.setString(2, pass);
            rs = pstmt.executeQuery();

        } catch (ClassNotFoundException | SQLException e) {
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
