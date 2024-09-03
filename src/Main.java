import java.util.*;

//Set Interface
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");


        Set L = new HashSet();
        L.add(5);
        L.add(2);
        L.add(10.4);
        L.add(10.4);   //Duplicate values will be removed
        L.add("Hello world");
        //Different ways to print ArrayList
        System.out.println(L);

        for(Object a: L)
            System.out.println(a);

        Object M[] =  L.toArray();
        for(int i=0; i<M.length; i++)
            System.out.println(M[i]);

        Iterator I =  L.iterator();
        while(I.hasNext())
            System.out.println(I.next());

        System.out.println(L.contains(10.4));//true
        System.out.println(L.contains(10));//false


        Collection A = new ArrayList();
        A.add(5);
        A.add(2);

        System.out.println(L.containsAll(A));//true


        A.add(20);
         L.addAll(A);
        System.out.println(L);// [2, 20, 5, 10.4, Hello world]   sequence may be changed


        L.remove(2);
        System.out.println(L);//removes  2 //[20, 5, 10.4, Hello world]


        A.remove(20);
        System.out.println("A = "+A); //A = [5, 2]
        L.retainAll(A);
        System.out.println("L = "+L);  //L = [5]

        L.clear();
        System.out.println("L = "+L);  // []
    }
}