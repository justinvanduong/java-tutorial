package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        for (String value : args) {
            System.out.println(value);
        }
        System.out.println(args[1]);


        //immutable is read only
        //mutable is read/write

        ArrayList newArray = new ArrayList<String>();
        newArray.add(0, "Hey");
        newArray.add(1, "world");

        // Array List
        System.out.println(newArray.toString());
        System.out.println(newArray.get(0));

        //All primitive datatypes have Capitalized counterparts
        int myNumber = 1;
        //(2^32)-1
        short myShort = 22;
        long myLong = 333;

        double myDouble = 7.33;
        // floats must have an 'f' appended to the end of the number, otherwise it will
        // be considered a double
        float myFloat = 33.22f;
        //Float.MAX_VALUE;Float.MIN_VALUE;
        char myChar = 'y';
        Character myCharacater = 'j';
        boolean myBool = true;

        byte myByte = 127;

        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBool);
        System.out.println(myByte);

        /**
         * The code below throws an exception. Look into exceptions
         */

        try {
            Integer.parseInt("abc", 10);
            Integer.parseInt("abc");
            // dont do this irl
        } catch (Exception ex) {
            System.out.println("Exception Caught");
        }
        // Calling Method"
//        System.out.println(anotherMethod(10, "peas in a pod"));
//
//        Person.latinName(); // human bean
//        //Person.age(); // Error no instance
//        Person bob = new Person("Bobby", 15);
//        bob.age(); // 15
//        bob.setAge(16); // works because same file but won't otherwise
//        System.out.println(bob.givenName); // "Bobby"
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("What's ya name ");
//        String name = input.next();
//        System.out.println(name);
//
//        System.out.print("How old are you?");
//        Integer age = input.nextInt();
//
//        Person me = new Person(name,age);
//        System.out.println(me);

        try {
            FileStuff fs = new FileStuff("diamond.txt");
            fs.writeTree();
        } catch (IOException ex) {
            System.out.println("o no");
        }

    }

    /**
     * This does this and that
     */

    // Method:
    //  Class visibility or Scope (Public/Private)
    //  Runnable with or without main(Static)
    //
    public static String anotherMethod(Integer firstParam, String secondParam) {
        // toString means turn integer to a string
        return firstParam.toString() + ' ' + secondParam;
    }
}

class Person {
    Integer age;
    String givenName;

    public Person(String givenName, Integer age) {
        this.age = age;
        this.givenName = givenName;
    }

    public static String latinName() {
        return "human bean";
    }

    public Integer age() {
        return this.age;
    }

    protected void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        //return "age: " + this.age + " name: " + this.givenName;
        // tokenizing / token replacement
        //   % - looking for:
        //   d - digit
        //   s - string
        return String.format("age: %d name: %s", this.age, this.givenName);
    }

}
