package Roye_InclassActivity01;

public class RegexDemo {
    public static final String  STRING_FORMATDEMO = "Discover Opportunities" +
    " No matter what you study at Aurora University," +
    " you'll learn more about yourself." +
    " That is because AU professors do not just teach in classrooms, "+
    "they talk to you about establishing and realizing goals, and "+
    "they help make sure you are on the right academic path. " +
    "You will think of them as your partners.";
        
    public static void main(String[] args) {
        System.out.println(STRING_FORMATDEMO.matches("\\w.*"));
        
        String [] splitString = (STRING_FORMATDEMO.split("\\s+"));
        System.out.println(splitString.length);

        for(String str001 : splitString){
            System.out.println("\n" + str001);
        }
        //Repalce all whitespace with tabs
        System.out.println(STRING_FORMATDEMO.replaceAll("\\st", "\t"));

        System.out.println(STRING_FORMATDEMO.replaceAll("\\s+", "__\\#\\$"));

        //(630)-844-6798
        //(630-844-6798)
        //Format telephone numbers using regulat expressions
        String phoneNumber = "6306567902";
        StringBuilder strbuff = new StringBuilder(phoneNumber);

        //Inset parantheses around the area code
        strbuff.insert(0, '(' );
        strbuff.insert(4, ')' );

        //Insert hyphen after the prefix (630-656-7902) //(630)6567902
        strbuff.insert(8, '-');

        System.out.println(strbuff.toString());

    }

}
