package cn.sdut.jdbc.daoimproved;

import java.util.List;

/**
 * Created by liuzhichao on 2018/8/31.
 */
public interface DeptDao {

    void addDept(Dept dept);
    void delDept(int deptno);
    void updateDept(Dept dept);
    Dept getDeptById(int deptno);
    List<Dept> getDeptAll();

}
