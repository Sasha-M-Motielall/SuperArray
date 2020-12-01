public class Demo{
  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i < s.size(); i++){
      String test = s.get(i);
      for(int j = i+1; j < s.size(); j++){
        if(test.equals(s.get(j))){
          s.remove(j);
          j--;
        }}}}
}
