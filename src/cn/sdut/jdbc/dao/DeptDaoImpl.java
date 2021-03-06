package cn.sdut.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhichao on 2018/8/31.
 */
public class DeptDaoImpl implements DeptDao {
    /**
     * 添加一个部门
     * @param dept
     */
    @Override
    public void addDept(Dept dept) {
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "insert into mydept(deptno,dname,loc) values(?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setInt(1,dept.getDeptno());
            pst.setString(2,dept.getDname());
            pst.setString(3,dept.getLoc());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(null,pst,conn);
        }
    }

    /**
     * 根据部门编号删除部门
     * @param deptno
     */
    @Override
    public void delDept(int deptno) {
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "delete from mydept where deptno="+deptno;
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(null,pst,conn);
        }
    }

    /**
     * 根据部门编号修改部门所在地
     * @param dept
     */
    @Override
    public void updateDept(Dept dept) {
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "update mydept set loc=? where deptno=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,dept.getLoc());
            pst.setInt(2,dept.getDeptno());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(null,pst,conn);
        }
    }

    /**
     * 根据部门编号查找部门
     * @param deptno
     * @return
     */
    @Override
    public Dept getDeptById(int deptno) {
        Dept dept = null;
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "select * from mydept where deptno="+deptno;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while( rs.next() ) {
                dept = new Dept(rs.getInt("DEPTNO"),
                        rs.getString("DNAME"),
                        rs.getString("LOC"));
            }
            return dept;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询所有部门
     * @return
     */
    @Override
    public List<Dept> getDeptAll() {
        List<Dept> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "select * from mydept";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while( rs.next() ) {
                Dept dept = new Dept();
                dept.setDeptno(rs.getInt("DEPTNO"));//columnLable:表中的字段名
                dept.setDname(rs.getString(2));//columnIndex:字段的索引值
                dept.setLoc(rs.getString("LOC"));
                list.add(dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs,pst,conn);
        }
        return list;
    }

}
