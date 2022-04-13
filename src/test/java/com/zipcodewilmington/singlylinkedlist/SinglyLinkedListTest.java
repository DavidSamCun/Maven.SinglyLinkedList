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
                Integer[] input = {0, 3, 5};
                for (Integer a: input) {
                        test.add(a);
                }

                Assert.assertEquals(input[0], test.get(0));
        }

        @Test
        public void getTest2(){
                SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
                Integer[] input = {0, 3, 5, 4};
                for (Integer a: input) {
                        test.add(a);
                }
                Assert.assertEquals(test.get(1), input[1]);
        }

        @Test
        public void getTestGeneric1(){
                SinglyLinkedList<String> test = new SinglyLinkedList<>();
                String[] input = {"Apple", "Pie", "Sugar", "Honey", "Bunch"};
                for (String a: input) {
                        test.add(a);
                }
                Assert.assertEquals(test.get(1), input[1]);
        }

        @Test
        public void findTest(){
                SinglyLinkedList<String> test = new SinglyLinkedList<>();
                String[] input = {"Apple", "Pie", "Sugar", "Honey", "Bunch"};
                for (String a: input) {
                        test.add(a);
                }
                Assert.assertEquals(test.find(input[1]), 1);
        }

        @Test
        public void findTes(){
                SinglyLinkedList<String> test = new SinglyLinkedList<>();
                String[] input = {"Apple", "Pie", "Sugar", "Honey", "Bunch"};
                for (String a: input) {
                        test.add(a);
                }
                Assert.assertEquals(test.find(input[2]), 2);
        }

        @Test
        public void findTest2(){
                SinglyLinkedList<String> test = new SinglyLinkedList<>();
                String[] input = {"Apple", "Pie", "Sugar", "Honey", "Bunch"};
                for (String a: input) {
                        test.add(a);
                }
                Assert.assertEquals(test.find(input[4]), 4);
        }

        @Test
        public void findTest3(){
                SinglyLinkedList<String> test = new SinglyLinkedList<>();
                String[] input = {"Apple", "Pie", "Sugar", "Honey", "Bunch"};
                for (String a: input) {
                        test.add(a);
                }
                Assert.assertEquals(test.find("input[1]"), -1);
        }

        @Test
        public void containsTest1(){
                SinglyLinkedList<String> test = new SinglyLinkedList<>();
                String[] input = {"Apple", "Pie", "Sugar", "Honey", "Bunch"};
                for (String a: input) {
                        test.add(a);
                }
                Assert.assertTrue(test.contains(input[4]));
        }

        @Test
        public void containsTest2() {
                SinglyLinkedList<String> test = new SinglyLinkedList<>();
                String[] input = {"Apple", "Pie", "Sugar", "Honey", "Bunch"};
                for (String a : input) {
                        test.add(a);
                }
                Assert.assertTrue(test.contains(input[0]));
        }

        @Test
        public void containsTest3() {
                SinglyLinkedList<String> test = new SinglyLinkedList<>();
                String[] input = {"Apple", "Pie", "Sugar", "Honey", "Bunch"};
                for (String a : input) {
                        test.add(a);
                }
                Assert.assertTrue(test.contains(input[2]));
        }
}
