package OCA.src.Q162;

public class Test {

    public void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1 = s3;
        s3 = s2;
        s2 = null;
    }
}
/*
Which statement is true?
A.	After line 11, three objects are eligible for garbage collection.
B.	After line 11, two objects are eligible for garbage collection.
C.	After line 11, one object is eligible for garbage collection.
D.	After line 11, none of the objects are eligible for garbage collection.

Answer: C

 */