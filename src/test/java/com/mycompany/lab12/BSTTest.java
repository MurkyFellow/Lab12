/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab12;

import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 000728303
 */
public class BSTTest {

    @Test
    public void testAdd1() {
        BST tree = new BST();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(11);

        String result = "";

        Iterator<Integer> it = tree.iterator();
        while (it.hasNext()) {
            result += (it.next().toString() + ",");
        }

        assertEquals("3,5,7,10,11,15,", result);
    }

    @Test
    public void testAdd2() {
        BST tree = new BST();
        tree.add(4);
        tree.add(5);
        tree.add(100);
        tree.add(7);
        tree.add(8);
        tree.add(9);

        String result = "";

        Iterator<Integer> it = tree.iterator();
        while (it.hasNext()) {
            result += (it.next().toString() + ",");
        }

        assertEquals("4,5,7,8,9,100,", result);
    }

    @Test
    public void testAdd3() {
        BST tree = new BST();
        tree.add(4);
        tree.add(4);
        tree.add(4);
        tree.add(4);
        tree.add(4);
        tree.add(4);

        String result = "";

        Iterator<Integer> it = tree.iterator();
        while (it.hasNext()) {
            result += (it.next().toString() + ",");
        }

        assertEquals("4,", result);
    }

    @Test
    public void testAdd4() {
        BST tree = new BST();
        tree.add(4);

        String result = "";

        Iterator<Integer> it = tree.iterator();
        while (it.hasNext()) {
            result += (it.next().toString() + ",");
        }

        assertEquals("4,", result);
    }
}
