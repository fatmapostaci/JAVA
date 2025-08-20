package learnJava.src.codeChallenge.gun2;

public class If {
    public static void main(String[] args) {
            /* Task->
    Girilen jobTitle data için : Eger jobTitle
    qa ise print "is unvaniniz Quality Analyst."
    dev ise print "is unvaniniz Developer."
    ba ise print "is unvaniniz Business Analyst."
    pm ise print "is unvaniniz Project Manager."
    code create ediniz...
   */ String jobTitle="dev";
        System.out.println( (jobTitle.equals("qa") ? "is unvaniniz Quality Analyst." :
                            ( jobTitle.equals("dev") ? "is unvaniniz Developer." :
                            ( jobTitle.equals("ba") ? "is unvaniniz Business Analyst." :
                            (jobTitle.equals("pm")? "is unvaniniz Project Manager." : "hatalı" ) ) ) ) );

    }
}
