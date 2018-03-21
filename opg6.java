package ch11;

/* Write a method countUnique that accepts a list of integers as a parameter and returns the number of unique integer
values in the list. Use a set as auxiliary storage to help you solve this problem. For example, if a list contains the values
[3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique values. */

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class opg6
{
    public static void main(String[] args)
    {
        LinkedList<Integer> liste1 = new LinkedList<>();
        liste1.add(-3);
        liste1.add(4);
        liste1.add(1);
        liste1.add(4);
        liste1.add(9);
        liste1.add(3);
        liste1.add(5);
        liste1.add(4);

        System.out.println(countUnique(liste1));
    }

    public static int countUnique (LinkedList<Integer> list)
    {
        Set<Integer> removeDuplicatesPls = new TreeSet<>();
        removeDuplicatesPls.addAll(list);

        return removeDuplicatesPls.size();
    }
}
