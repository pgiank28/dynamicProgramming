package dynamicProgramming;

import java.util.ArrayList;

public class main{
  public static void main(String[] args){
    /*int n = Integer.parseInt(args[0]);
    fibonacci fb = new fibonacci(n);

    System.out.println(fb.fibo(n));*/

    /*ArrayList<Integer> lst = new ArrayList<Integer>(Integer.parseInt(args[0]));
    lst.add(5);
    lst.add(2);
    lst.add(8);
    lst.add(6);
    lst.add(3);
    lst.add(6);
    lst.add(9);
    lst.add(7);
    longestIncreasingSequence ls = new longestIncreasingSequence(lst);
    ArrayList<Integer>res = ls.defSequence();

    res.forEach(x->{
      System.out.println(x);
    });*/
    int ed = editDistance.editDistance(args[0],args[1]);
    System.out.println(ed);
  }
}
