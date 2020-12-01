public class Demo{
  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i < s.size(); i++){
      String test = s.get(i);
      for(int j = i+1; j < s.size(); j++){
        if(test.equals(s.get(j))){
          s.remove(j);
          j--;
        }}}}

  public static SuperArray findOverLap(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray();
    removeDuplicates(a);
    removeDuplicates(b);
    for(int i = 0; i < a.size(); i++){
      for(int j = 0; j < b.size(); j++){
        if(a.get(i).equals(b.get(j))){
          result.add(b.get(j));
        }}}
    return result;
  }
}
