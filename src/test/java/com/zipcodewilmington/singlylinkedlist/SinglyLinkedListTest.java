package com.zipcodewilmington.singlylinkedlist;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

        @Test
        public void constructorTest(){

                SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
                Assert.assertTrue(test instanceof SinglyLinkedList<Integer>);

        }

        @Test
        public void addTest(){
                SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
                Integer[] input = {0, 3, 5, 7, 9, 7, 5, 3, 0};
                for (Integer a: input) {
                        test.add(a);
                }
                Assert.assertEquals(input.length, test.size());
        }

        @Test
        public void getTest(){
                SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
                Integer[] input = {0, 3, 5, 7, 9, 7, 5, 3, 0};
                for (Integer a: input) {
                        test.add(a);
                }

                //Assert.assertEquals(input[2], test.get(2));
        }


}
