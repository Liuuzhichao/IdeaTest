package cn.sdut.jdbc.daoimproved;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created by liuzhichao on 2018/8/31.
 */

/**
 *Dao层增强版,将数据库连接写成属性文件,属性文件中 通过键值对存储
 * 然后加载属性文件,通过属性文件获取相应值
 */
public class DbUtils {

    //创建属性的对象
    private static Properties props = new Properties();

    private DbUtils() {
    }

    /**
     * 加载驱动
     */
    static {
        try {
            //加载属性文件
            props.load(new FileReader("src/cn/sdut/jdbc/daoimproved/db.properties"));
            //通过键去获取到所对应的值
            Class.forName(props.getProperty("driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 建立连接
     * @return
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(props.getProperty("url"),
                    props.getProperty("user"), props.getProperty("password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭连接
     * @param rs
     * @param st
     * @param conn
     */
    public static void closeAll(ResultSet rs, Statement st, Connection conn) {
        try {
            if( rs != null ) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if( st != null ) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if( conn != null ) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
