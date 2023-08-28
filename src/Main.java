import java.util.*;
import java.util.stream.Collectors;


// by normal method

//class MyComparator implements Comparator<Integer>{
//    public int compare(Integer t1, Integer t2){
//
//        if(t1<t2){
//            return -1;
//        }
//        else if(t1>t2){
//            return +1;
//        }
//        else{
//            return 0;
//        }
//    }
//     or  return (t1<t2)?-1 : (t1>t2)? 1: 0; //  using ternaroy operator
////
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> i=new ArrayList<>();
//        i.add(10);
//        i.add(5);
//        i.add(20);
//        i.add(15);
//
//        System.out.println(i);
//        Collections.sort(i,new MyComparator());
//        System.out.println(i);
//    }
//}



// using lambda expression


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(10);
        i.add(5);
        i.add(20);
        i.add(15);

      //  System.out.println(i);
        Comparator<Integer> c = (t1, t2) -> (t1 < t2) ? -1 : (t1 > t2) ? 1 : 0;
        Collections.sort(i, c);
        System.out.println(i);


        i.stream().forEach(System.out::println); // stream gives output one by one

        List<Integer> l2 = i.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("even no.="+l2);

    }
}



//[5, 10, 15, 20]
//        5
//        10
//        15
//        20
//        even no. =[10, 20]
