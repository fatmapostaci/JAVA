package learnJava.src.dersler.gun49_lambda.mentoring;

import java.util.List;

@FunctionalInterface
public interface ListArayuz {

    //List parametre alsın Integer döndürsün
    Integer getLengthAbstractMethod(List<String>  list);


    default void concreteSoutMethod(Integer size){

        System.out.println( "size: "+ size);;
    }
}
