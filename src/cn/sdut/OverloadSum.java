package cn.sdut;

/**
 * 编写两个方法getSum（int  end）[1+2+3..+end]，
 * getSum（int  start，int  end）[start+。。。+end]
 */

public class OverloadSum {

    public int getSum( int end ) {
        int sum = 0;
        for ( int i = 1; i <= end; i++ ) {
            sum += i;
        }
        return sum;
    }

    public int getSum( int start, int end ) {
        int sum = 0;
        if ( start > end ) {
            int t = start;
            start = end;
            end = t;
        }
        for ( int i = start; i <= end; i++ ) {
            sum += i;
        }
        return sum;
    }

    /**
     * 重载的测试,会自动进行数据类型的转换
     * @param t
     */
    public void test ( double t ) {
        System.out.println("double");
    }
    public void test ( float t) {
        System.out.println("float");
    }
    public void test ( long t ) {
        System.out.println("long");
    }

}
