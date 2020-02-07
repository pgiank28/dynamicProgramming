package dynamicProgramming;

public class editDistance{

  public static int editDistance(String s1,String s2){
    int[][] editDistance = new int[s1.length()+1][s2.length()+1];

    for(int i=0;i<s1.length();i++){
      editDistance[i][0]=i;
    }
    for(int j=0;j<s2.length();j++){
      editDistance[0][j]=j;
    }

    for(int i=1;i<s1.length();i++){
      for(int j=1;j<s2.length();j++){
        editDistance[i][j] = min(editDistance[i][j-1]+1,editDistance[i-1][j]+1,editDistance[i-1][j-1]+diff(s1.charAt(i),s2.charAt(j)));
      }
    }
    return editDistance[s1.length()-1][s2.length()-1];
  }

  public static int diff(char s1,char s2){

    if((int)s1==(int)s2){
      return 0;
    }
    return 1;
  }

  public static int min(int a,int b,int c){
    if(a<=b){
      if(a<=c){
        return a;
      }else{
        return c;
      }
    }
    if(a>b){
      if(b<=c){
        return b;
      }else{
        return c;
      }
    }

    return 0;
  }
}
