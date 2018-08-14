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
}
