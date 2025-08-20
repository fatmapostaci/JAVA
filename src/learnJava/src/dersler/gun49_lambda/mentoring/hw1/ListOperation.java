package learnJava.src.dersler.gun49_lambda.mentoring.hw1;

import java.util.List;

public interface ListOperation {
     /*
A R A Y Ü Z --> ListOperation
*List<String> parametreli
*Return olmasın
*Tek metodlu fonksiyonel arayüz (perform())
      */
    void perform(String s,List<String> list);

    default void print(List<String> list){
        for (String s : list)
            System.out.print(s +"  " );
    }
}
