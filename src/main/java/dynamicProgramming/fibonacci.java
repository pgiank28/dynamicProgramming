package dynamicProgramming;

import java.util.List;
import java.util.ArrayList;


public class fibonacci{
  int[] fiboMemo;

  public fibonacci(int n){
    this.fiboMemo = new int[n];
    this.fiboMemo[0]=1;
    this.fiboMemo[1]=1;
  }

  public int fibo(int n){
    if(n<2){
      return this.fiboMemo[n];
    }
    for(int j=2;j<n;j++){
      this.fiboMemo[j]=this.fiboMemo[j-1]+this.fiboMemo[j-2];
    }
    return(this.fiboMemo[n-1]);
  }
}
