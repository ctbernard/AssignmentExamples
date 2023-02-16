public class TypeInitExamples {
    //always start by adding main
    //we can do this with "hotkey" psvm
    //press tab to unfoil
    public static void main(String[] args) {
        //now we can write code
        //Our basic types in java are:
        //Byte, Short, Long, Integer, Double, Float, Character, String and Boolean
        //From most used to least:
        //Integer, Double, Float, Boolean, String, Character, Not used much(Short, Long, Byte)

        int myInteger = 1; //Simplest variable expression, no need for decimal

        //short myShort = 1; //Short is exactly the same as integer, simple and no decimal

        double myDouble = 1.0; //Pretty simple just make sure there is a decimal point

        float myFloat = 1.0f; //A stange f goes to the end of floats and a decimal point is still expected

        //long myLong = 1l //Less strange L goes to the end of long values, but they are an extention of shorts and don't need decimal

        boolean myBoolean = true; //only two options are possible (true or false) and no quotes needed

        String myString = "1 and other numbers can also go in strings."; //Yes it's still a 1 in a String, but with double quotes the computer sees it as String

        char myChar = '1'; // 1 is also a character like letters are, but it's still seen as written word to the computer, Requires single quotes

        //byte myByte; //don't bother using this one, bytes are the unseen building blocks that are necessary to build the other 8 basic types

    }
}
