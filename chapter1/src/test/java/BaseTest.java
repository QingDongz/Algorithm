import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseTest {
    @Test
    public void randomTest() throws Exception {

        for (int i = 0; i < 20; i++) {
            System.out.println(StdRandom.uniform(11));
        }
        Integer i = 1;
        i.toString();

    }

    @Test
    public void arraysSortTest() throws Exception {
        int[] arraysSortTest = {5, 6, 3, 2, 4, 7, 8};
        for (int number : arraysSortTest) {
            System.out.println("origin:" + number);
        }
/*        List<Integer> arraysSortTest = new ArrayList<Integer>();
        arraysSortTest.add(1);
        arraysSortTest.add(3);
        arraysSortTest.add(4);*/
        Arrays.sort(arraysSortTest);
        for (int number : arraysSortTest) {
            System.out.println(number);
        }

    }

    @Test
    public void draw1() {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++) {

            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
        Object lock = new Object();
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void sortTest() {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(5);
        integerList.add(4);
        integerList.add(9);
        integerList.add(11);
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }

    @Test
    public void ifTest() {

        String zhanghao = "zhangqingdong";
        String mima = "zhangqingdong";


        if (zhanghao.equals("zhangqingdong")&&mima.equals("zhangqingdong")) {
            System.out.println("登录");
        } else {
            System.out.println("登录错误");
        }
    }
}
