package com.example.boyi; /**
 * Created by hqj on 2017/7/30.
 */
import junit.framework.TestCase;

/**.sau.maximun.SubArray;
 import junit.framework.TestCase;
 /**
 * @author m
 * @单元测试
 * @time 2016/10/7
 */
public class TestMaximun extends TestCase {

    //对方法max进行测试
    public void testMax(){
        int x = 1;  //测试数据
        int y = 2;
        int z = -1;
        SubArray sub = new SubArray();
        int result1 = sub.max(x, y);
        int result2 = sub.max(y,x);
        int result3 = sub.max(z, x);
        TestCase.assertTrue(result1 == y);
        TestCase.assertTrue(result2 == y);
        TestCase.assertTrue(result3 == 1);
    }

    //对方法maxSubArr测试
    public void testMaxSubArr(){

        int arr1[] ={1,2,3,-1}; //测试用例
        int arr2[] = {1,2,-4,8,4,-4,6,-2,1};
        int  arr3[] ={-4,-2,-1,-3};
        int arr4[] = {-4,2,-4,2,-1};
        SubArray sub = new SubArray();


        TestCase.assertTrue(sub.maxSubArr(arr1) == 6);
        TestCase.assertTrue(sub.maxSubArr(arr2) == 14);
        TestCase.assertTrue(sub.maxSubArr(arr3) == -1);
        TestCase.assertTrue(sub.maxSubArr(arr4) == 2);
    }
}
