package OCA.src.Q181;

public class B {
    private int doStuff(){
        // soruda x private
         int x = 100; //Illegal modifier for parameter x; only final is permitted
        return x++;
   }
}
