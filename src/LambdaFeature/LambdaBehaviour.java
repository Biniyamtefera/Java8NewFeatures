package LambdaFeature;

import java.util.ArrayList;

public class LambdaBehaviour {
    public static void main(String[] args) {
        /**
         * Lambda expression consist of three parts
         * 1. inpute parameter
         * 2.arrow operator
         * function body
         */
        //<input-parameter> -> <function -body>

        /**
         * No parameter
         * If we are using single line then we don't need paranthesis
         *
         */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );
    }
 }


