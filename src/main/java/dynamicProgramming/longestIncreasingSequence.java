package dynamicProgramming;

import java.util.ArrayList;

public class longestIncreasingSequence{
  ArrayList<Integer> initialList;
  ArrayList<Integer> maxLIS;

  public longestIncreasingSequence(ArrayList<Integer> list){
    this.initialList = list;
    this.maxLIS = new ArrayList<Integer>(list.size());
    for(int i=0;i<list.size();i++){  this.maxLIS.add(0); }
  }

  public ArrayList<Integer> defSequence(){
    int maxl;
    for(int i=0;i<this.initialList.size();i++){
      maxl=0;
      for(int j=0;j<i;j++){
        if(this.initialList.get(j) > this.initialList.get(i)){
          continue;
        }
        if(maxl<this.maxLIS.get(j)){
          maxl= this.maxLIS.get(j);
        }
      }
      this.maxLIS.set(i,maxl+1);
    }
    return this.maxLIS;
  }
}
