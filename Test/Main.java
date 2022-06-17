import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!");
        System.out.println(3 + 3);
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line."); // testing

        String test = "Visual";
        System.out.println("");
        System.out.println(test);

        int testNumber = 30;
        System.out.println(testNumber);

        float testDecimal;
        testDecimal = 10.1f;
        System.out.println(testDecimal);

        int myNum = 15;
        myNum = 20; // myNum is now 20
        System.out.println(myNum);

        final int mynumFinal = 15;
        // mynumFinal = 20; // will generate an error: cannot assign a value to a final
        // variable
        System.out.println(mynumFinal);

        int x = 5, y = 6, z = 60;
        System.out.println(x + y + z);

        // Data Type
        /*
         * Primitive - specifies the size and type of variable values, and it has no
         * additional methods.
         * byte 1 byte Stores whole numbers from -128 to 127
         * short 2 bytes Stores whole numbers from -32,768 to 32,767
         * int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
         * long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to
         * 9,223,372,036,854,775,807
         * float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7
         * decimal digits
         * double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal
         * digits
         * boolean 1 bit Stores true or false values
         * char 2 bytes Stores a single character/letter or ASCII values
         */

        // Float
        float f1 = 30e1f;
        double d1 = 30e2d;
        System.out.println(f1);
        System.out.println(d1);

        // Boolean
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Characters
        char myGrade = 'A'; // char value need to be surrounded by single quotes
        System.out.println(myGrade);
        // Character using ASCII
        char myVar1 = 32, myVar2 = 65, myVar3 = 67; // ASCII 32 is a space
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // String
        String text = "Hello World"; // String need to be surrounded by double quotes
        System.out.println(text);

        // Non-Primitive Data Types
        // are called reference types because they refer to objects.
        // created by the programmer and is not defined by Java (except for String).
        // can be used to call methods to perform certain operations
        // non-primitive types can be null.
        // non-primitive types starts with an uppercase letter.
        // non-primitive types have all the same size.
        // Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc.

        // Type Casting - assign a value of one primitive data type to another type.
        // Widening Casting (automatically) - converting a smaller type to a larger
        // Narrowing Casting (manually) - converting a larger type to a smaller size

        // Example Widening Casting
        int myInt = 10;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing Cating
        double myDouble1 = 20.58;
        int myInt1 = (int) myDouble1; // Manual cating: placing the type in parentheses in front of the value
        System.out.println(myDouble1);
        System.out.println(myInt1);

        // Operators
        // Arithmetic operators - common mathematical operations.
        // Assignment operators - to assign values to variables.
        // Comparison operators
        // Logical operators
        // Bitwise operators

        int add = 75 + 20;
        ++add;
        add += 10;
        System.out.println(add);
        System.out.println(add + 50);
        System.out.println(add == 100);
        System.out.println(add != 100);

        // Strings - used for storing text.
        // A String in Java is actually an object
        String greeting = "Hello World";
        // String Length - the length of a string can be found with the length() method
        System.out.println(greeting.length()); // length equal 11 including space
        // Other string method
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        // Finding chracter in a string - returns the index (the position) of the first
        // occurrence of a specified text in a string (including whitespace)
        // Java counts positions from zero.
        // output will be -1 if the specified text not available
        System.out.println(greeting.indexOf("Wor"));
        System.out.println(greeting.indexOf("wor"));

        // String Concatenation
        // The + operator can be used between strings to combine them
        String firstName = "John";
        String lastName = "Roland";
        System.out.println(firstName + lastName);
        System.out.println(firstName + " " + lastName); // empty text (" ") to create a space
        // Also can used concat()
        System.out.println(firstName.concat(lastName));

        // Adding Numbers and Strings
        // If you add two numbers, the result will be a number
        // If you add two strings, the result will be a string concatenation
        // If you add a number and a string, the result will be a string concatenation
        String numberX = "10";
        int numberY = 20;
        System.out.println(numberX + numberY); // result 1020 (a String)

        // Special Characters
        // backslash escape character.
        // \' - Single Quote
        // \" - Double Quote
        // \\ - Backlash
        System.out.println("People normally call me \"Iron-Man\"");
        System.out.println("People normally call me \'Iron-Man\'");
        System.out.println("People normally call me \\Iron-Man\\");

        // Java Math class - many methods that allows you to perform mathematical tasks
        // Math.max(x,y) - find the highest value of x and y
        // Math.min(x,y) - find the lowest value of x and y
        // Math.sqrt(x) - returns the square root of x
        // Math.abs(x) - absolute (positive) value of x
        // Math.random() - random number between 0.0 (inclusive), and 1.0 (exclusive)
        // To get more control over the random number,
        // int randomNum = (int)(Math.random() * 101); // 0 to 100

        // Boolean Expression
        // Use a comparison operator
        System.out.println(10 == 9);
        System.out.println(10 > 9);

        // If ... Else
        // The if Statement - to be executed if a condition is true.
        // Note that if is in lowercase letters
        if (20 > 18) {
            System.out.println("Yes, 20 is greater than 18");
        }
        // The else Statement to be executed if the condition is false.
        else {
            System.out.println("No, It\'s wrong");
        }

        // The else if statement
        // to specify a new condition if the first condition is false.
        int time = 22;
        if (time < 10) {
            System.out.println("True, time less than 10");
        } else if (time < 25) {
            System.out.println("True, time less than 25");
        } else {
            System.out.println("False");
        }

        // Short Hand If...Else (Ternary Operator)
        System.out.println((time < 10) ? "True." : "False.");
        System.out
                .println((time < 10) ? "True, time less than 10" : (time < 25) ? "True, time less than 25" : "False.");

        // Switch - to select one of many code blocks to be executed.
        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // break will stop the execution of more code and case testing inside the block.
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // default keyword specifies some code to run if there is no case match
                System.out.println("Not Found");
        }

        // While Loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            ++i; // condition to increase the variable i value
        }

        // Do/While Loop
        // variant of while loop
        // execute the code block once, before checking if the condition is true,
        // then it will repeat the loop as long as the condition is true.
        int j = 4;
        do {
            System.out.println(10 - j);
            j++; // condition to increase the variable j value
        } while (j < 11);

        // For Loop - know how many times you want to loop through a block ofcode
        // in my opinion
        // seems same as while loop but different way to put variable and condition
        for (int k = 10; k < 15; k++) {
            System.out.println(k);
        }

        for (int l = 15; l < 20; l = l + 2) {
            System.out.println(l);
        }

        // For Each Loop
        // used exclusively to loop through elements in an array
        String[] cars = { "Saga", "Wira", "Waja", "Preve", "X50" }; // String[] to specify array
        for (String p : cars) {
            System.out.println(p);
        }

        // Break and Continue
        // Break - to "jump out" of switch or loop
        for (int itest = 0; itest < 10; itest++) {
            if (itest == 4) {
                break;
            }
            System.out.println(itest);
        }

        // Continue - to breaks one iteration (in the loop),
        // if a specified condition occurs,
        // and continues with the next iteration in the loop.
        for (int itest1 = 10; itest1 > 5; itest1--) {
            if (itest1 == 7) {
                continue; // if condition meet, will skip this loop and continue next loop
            }
            System.out.println(itest1);
        }

        // Break and Continue in While Loop
        int ia = 0;
        while (ia < 5) {
            System.out.println(ia);
            ia++;
            if (ia == 4) {
                break;
            }
        }

        System.out.println("Hello World");

        int ib = 0;
        while (ib < 10) {
            if (ib == 3) {
                ib++; // need to put condition here if not variable ib will not +1 and loop stuck in
                      // same condition again and again
                continue;
            }
            System.out.println(ib);
            ib++;
        }

        // Arrays - to store multiple values in a single variable,
        // instead of declaring separate variables for each value.
        // String[]
        // int[]

        String[] perodua = { "Axia", "Myvi", "Bezza" };
        System.out.println(perodua[0]);

        // Change an Array Element
        perodua[0] = "Alza";
        System.out.println(Arrays.toString(perodua)); // Print result in array format instead of one by one
        // Array Length
        System.out.println(perodua.length);

        // Loop Through an Array with For-Each
        for (String ic : perodua) {
            System.out.println(ic);
        }

        // Multi-Dimensional Arrays
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        System.out.println(myNumbers[0][0]);

        for (int iArray = 0; iArray < myNumbers.length; ++iArray) {
            for (int jArray = 0; jArray < myNumbers[iArray].length; ++jArray) {
                System.out.println(myNumbers[iArray][jArray]);
            }
        }

        myMethod();
        System.out.println(myMethod(30));
        System.out.println(myMethod(30f));
        System.out.println(myMethod(30d, 29d));

        myMethod1("Firdaus");
        myMethod1("Hayaty");

        myMethod2("Firdaus", 30);
        myMethod2("Hayaty", 29);

        System.out.println(myMethod3(30, 30));
        System.out.println(myMethod3(30, 30));

        myMethod5(30);
        myMethod5(10);
        System.out.println("");

        // Java Scope
        // Method Scope

        // Code here CANNOT use x

        int x1 = 100;

        // Code here can use x
        System.out.println(x1);

        // Block Scope
        // A block of code refers to all of the code between curly braces {}.
        // A block of code may exist on its own
        // or it can belong to an if, while or for statement.
        // In the case of for statements, variables declared in the statement itself are
        // also available inside the block's scope.
        // almost same concept as global and local javascipt

        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x2 = 200;

            // Code here CAN use x
            System.out.println(x2);

        } // The block ends here

        // Code here CANNOT use x

        // continue Java Recursion
        int result = sum(10);
        System.out.println(result);

        // continue Halting condition
        int result1 = sum1(5, 10);
        System.out.println(result1);

        // Java ArrayList
        // The ArrayList class is a resizable array, which can be found in the java.util
        // package.
        // The difference between a built-in array and an ArrayList in Java, is that the
        // size of an array cannot be modified
        // (if you want to add or remove elements to/from an array, you have to create a
        // new one).
        // import java.util.ArrayList; // import the ArrayList class
        // ArrayList<String> cars = new ArrayList<String>();
        // Create an ArrayList object

    }

    // Java Methods aka functions
    // declared within a class.
    // static means that the method belongs to the Main class
    // and not an object of the Main class.
    // void means that this method does not have a return value.

    // defined with the name of the method, followed by parentheses ()
    // pre-defined methods, such as System.out.println()
    static void myMethod() {
        System.out.println("Hello World!");
    }

    // Java Method Parameters
    // Parameters
    // Information can be passed to methods as parameter.
    // /Parameters act as variables inside the method.
    // Parameters are specified after the method name, inside the parentheses.
    // You can add as many parameters as you want, just separate them with a comma.
    // When a parameter is passed to the method, it is called an argument.
    // So, from the example above:
    // s is a parameter, while Firdaus and Hayaty are arguments.
    static void myMethod1(String s) {
        System.out.println("My Name is " + s);
    }

    // Multiple Parameters
    // You can have as many parameters as you like.
    // Note that when you are working with multiple parameters,
    // method call must have the same number of arguments as there are parameters,
    // and the arguments must be passed in the same order.
    static void myMethod2(String a, int b) {
        System.out.println("My Name is " + a);
        System.out.println("My Name age is " + b);
    }

    // Return Values
    // The void keyword, indicates that the method should not return a value.
    // If you want the method to return a value, you can use a primitive data type
    // and use the return keyword inside the method
    static int myMethod3(int a, int b) {
        System.out.println(a + " and " + b); // print only shown the result in the terminal
                                             // but not return or save the value inside method or etc
        return 10 * a + b; // return will return the value inside method if not method doesnt have value
    }

    // A Method with If...Else
    // It is common to use if...else statements inside methods
    static void myMethod5(int age) {
        if (age < 18) {
            System.out.print("Access Denied");
        } else {
            System.out.println("Access granted");
        }
    }

    // Method Overloading
    // multiple methods can have the same name with different parameters
    // Multiple methods can have the same name as long as the number and/or type of
    // parameters are different.
    static int myMethod(int x) {
        return x;
    }

    static float myMethod(float x) {
        return x;
    }

    static double myMethod(double x, double y) {
        return x + y;
    }

    // Java Recursion
    // the technique of making a function call itself.
    // provides a way to break complicated problems down into simple problems which
    // are easier to solve.

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // Halting Condition
    // Infinite recursion is when the function never stops calling itself.
    // Every recursive function should have a halting condition,
    // which is the condition where the function stops calling itself.
    // In the previous example, the halting condition is when the parameter k
    // becomes 0.
    // The developer should be very careful with recursion as it can be quite easy
    // to slip into writing a function which never terminates,
    // or one that uses excess amounts of memory or processor power.
    // owever, when written correctly recursion can be a very efficient and
    // mathematically-elegant approach to programming.
    public static int sum1(int start, int end) {
        if (end > start) {
            return end + sum1(start, end - 1);
        } else {
            return end;
        }
    }

}