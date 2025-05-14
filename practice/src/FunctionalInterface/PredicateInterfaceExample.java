//Problem 1: Given a list of integers, use Predicate<Integer> to filter out all even numbers and return a new list of only odd numbers.
//
//        Challenge: Implement this by chaining multiple predicates (e.g., one to check for even numbers and another to check for positive numbers).
//
//Problem 2: Create a Predicate that checks if a given String is a palindrome. Use this predicate to filter a list of strings, and return only the palindromes.
//
//        Problem 3: Write a Predicate<Employee> that checks whether the employee’s salary is greater than a certain threshold. Use this predicate to filter a list of employees.
//
//        Bonus: Combine it with another Predicate that checks if the employee's years of experience is more than 5 years.

package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("prarp","ace","3223","abbbccbbba","asdfghjklkjhgfdsa"));

        Predicate<String> isPalindrome= word->word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
        List<String> palindrome= list.stream().filter(isPalindrome).toList();
        System.out.println(palindrome);
        
    }}