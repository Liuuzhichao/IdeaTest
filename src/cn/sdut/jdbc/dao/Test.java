package cn.sdut.jdbc.dao;

import java.util.List;

/**
 * Created by liuzhichao on 2018/8/31.
 */
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DeptDao  deptDao=new DeptDaoImpl();
        //List<Dept> depts=deptDao.getDeptAll();
        //depts.forEach(System.out::println);
        //deptDao.addDept(new Dept(88,"88","88"));

        Dept dept = deptDao.getDeptById(88);
        System.out.println(dept.toString());

    }

}
