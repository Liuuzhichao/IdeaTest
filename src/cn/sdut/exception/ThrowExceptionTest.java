package cn.sdut.exception;

/**
 * Created by liuzhichao on 2018/8/17.
 */
public class ThrowExceptionTest {

    public static void main(String[] args) throws AgeIndexOfBoundsException {
        // TODO Auto-generated method stub
        Person  per=new Person();

        per.setAge(256);

        System.out.println(per.getAge());
    }

}

class  Person
{
    private	int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeIndexOfBoundsException {

        if(age<0 ||age>250)
        {
            /**
             * 抛出异常的实例,只能抛出异常的实例
             * 抛出异常之后一定要用try..catch或者throws来进行处理
             */
            throw  new AgeIndexOfBoundsException("年龄越界了");
        }

        this.age = age;
    }

}