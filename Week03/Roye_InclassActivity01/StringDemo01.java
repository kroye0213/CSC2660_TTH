package Roye_InclassActivity01;

import java.util.Random;

public class StringDemo01 {
    
    public static void main(String[] args) {
        String str01 = "CSC2650_2660, Good morning class!";
        String str02 = "The year 2021 is the first year of the New Normal.";
        String str03 = "Aurora University is a private institution.";

        System.out.println(str01);
        System.out.println("\nYes: " + str02);
        System.out.println("\n" + str03);
        

        //Test immutability
        str02 = str01;
        System.out.println(str02);

        str01 = str01.concat(" AURORA_02");
        System.out.println(str01);

        //Find pisiton of charactersusing the chartAt() method

        System.out.println(str01.charAt(15));

        //EqualIgnoreCase() method

        String str04 = "chicago";
        String str05 = "CHICAGO";
        System.out.println(str04.equalsIgnoreCase(str05));

        //Find or state the number of characters in a string using the lenght() method

        System.out.println(str01.length());
        
        //Change character case to lowe case or upper case
        System.out.println(str03.toUpperCase());
        System.out.println(str03.toLowerCase());

        //Using a StringBuffer class to append, insert, reverse

        StringBuffer strbuff = new StringBuffer(str02);
        System.out.println(str02);
        strbuff.append("Montreal is the city for all seasons!");
        System.out.println(strbuff);

        strbuff.reverse();
        System.out.println(strbuff);

        //Random class Demo
        Random generate02 = new Random();
        int number01 = generate02.nextInt(20) + 10;
        System.out.println("\nRandom Integer: " + number01);

        //Math class Demo
        System.out.println("\nSquare Root of number01: " + Math.sqrt(number01));
        System.out.println("\nnumber01 raised to power 2: " + Math.pow(number01, 2));

        //Create email addresses to tokenize(break them up)
        String emails = "kroye01@aurora.edu, pjameson@gmail.con, atomphson@aurora.edu";
        String[] breakup = emails.split("[@,]");

        //Display th email addresses brokenup using the @ symbol

        for(String br05 : breakup){
            System.out.println("\n" + br05);
        }

        //Breakup a string based off of special characters
        String str06 = "Los Angeles$Chicago%Dallas*Nabbangi&Florida";
        String [] seperateStrings = str06.split("[$%*&]");
        //Display the brokenup string using the special characters
        for(String james01 : seperateStrings){
            System.out.println("\n" + james01);
        }
    }
}





