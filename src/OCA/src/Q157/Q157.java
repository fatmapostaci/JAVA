package OCA.src.Q157;

public class Q157 {

    public static void main(String[] args) {
        int num[][] = new int[3][1];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
  //              System.out.println(i+" "+j);
            }
        }

    }
}
/* Which option represents the state of the num array
after successful completion of the outer loop?
A)  num[0][0]=10;
    num[0][1]=10;
    num[0][2]=10;
B)  num[0][0]=10;
    num[1][0]=10;
    num[2][0]=10;
C)  num[0][0]=10;
    num[0][1]=0;
    num[0][2]=0;
D)  num[0][0]=10;
    num[0][1]=10;
    num[0][2]=10;
    num[0][3]=10;
    num[1][0]=10;
    num[1][1]=10;
    num[1][2]=10;
    num[1][3]=10;


 */
