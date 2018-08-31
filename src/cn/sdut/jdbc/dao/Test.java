package cn.sdut.jdbc.dao;

import java.util.List;

/**
 * Created by liuzhichao on 2018/8/31.
 */
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DeptDao  deptDao=new DeptDaoImpl();
        /**
         * 查询所有
         */
        //List<Dept> depts=deptDao.getDeptAll();
        //depts.forEach(System.out::println);

        /**
         * 添加
         */
        //deptDao.addDept(new Dept(88,"88","88"));

        /**
         * 根据部门编号查询
         */
        //Dept dept = deptDao.getDeptById(88);
        //System.out.println(dept.toString());

        /**
         * 根据部门编号删除
         */
        //deptDao.delDept(60);

        /**
         * 根据部门编号修改所在地
         */
        deptDao.updateDept(new Dept(88,null,"BDQ"));

    }

}
