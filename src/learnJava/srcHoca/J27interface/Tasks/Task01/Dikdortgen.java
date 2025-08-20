package learnJava.srcHoca.J27interface.Tasks.Task01;

public class Dikdortgen implements Sekil{

    @Override
    public int cevre(int... boyut) {
        if (boyut.length==1){//varargsa girilen int parametre 1 tane ise
            return (boyut[0]*4);
        }else {//varargsa girilen int parametre 1 tane ise
            return ((boyut[0]+ boyut[1])*2);
        }
    }

    @Override
    public int alan(int... boyut) {
        if (boyut.length==1){//varargsa girilen int parametre 1 tane ise
            return (boyut[0]* boyut[0]);
        }else {//varargsa girilen int parametre 1 tane ise
            return (boyut[0]* boyut[1]);
        }
    }
}
