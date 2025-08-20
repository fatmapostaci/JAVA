package InterviewQuestion;

import java.sql.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Interview {
    public static void main(String[] args) {



        String variable = "Fatma Postacı";

        variable = variable.toUpperCase();
        System.out.println(variable);

        String name = variable.substring(0,5);
        System.out.println(name);

        String surname = variable.substring(6);
        System.out.println(surname);

        StringBuilder reversedVariable = new StringBuilder(variable);
        reversedVariable.reverse();
        System.out.println(reversedVariable);


        String[] arrVariable = variable.replace(" ","").split("");
        Set<String> setVariable = new HashSet<>(List.of(arrVariable));
        System.out.println(setVariable);



    }
}