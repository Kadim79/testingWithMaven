package com.company;

import org.junit.Assert;
import org.junit.Test;

public class ArraysUtilTest {
    @Test

    public void binarySearchTestExistingElement() {

        int[] array ={1,3,5,7,9,10};
        int n =7;
        int result = new ArraysUtil().binarySearch(array,n);
        Assert.assertEquals(3,result);
    }

    @Test

    public void binarySearchTestNotExistingElement(){

        int[] array ={1,3,4,5,6,9};
        int n = 4;
        int result = new ArraysUtil().binarySearch(array,n);
        Assert.assertEquals(2,result);

    }

    @Test

    public void bubbleSortTest(){

        int[] array ={4,3,7,2,9,5};
        new ArraysUtil().bubbleSort(array);

        Assert.assertArrayEquals(new int[]{2,3,4,5,7,9},array);

    }


}
