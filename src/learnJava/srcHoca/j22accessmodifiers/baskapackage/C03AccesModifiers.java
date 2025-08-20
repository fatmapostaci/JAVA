package learnJava.srcHoca.j22accessmodifiers.baskapackage;

import j22accessmodifiers.C01AccesModifiers;

public class C03AccesModifiers {

    public static void main(String[] args) {
        C01AccesModifiers obj = new C01AccesModifiers(10,25);
        System.out.println("obj.publicYas = " + obj.publicYas);
        //System.out.println("obj.publicYas = " + obj.protectedYas); // Aynı package da değil  parent-child ilişkisi de yok
        //System.out.println("obj.publicYas = " + obj.defaultYas); // Aynı package da değil

    }
}
