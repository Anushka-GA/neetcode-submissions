class Solution {
    public boolean isAnagram(String s, String t) {
       int n= s.length();
       int n2= t.length();
       if(n!=n2){
        return false;
       }
       HashMap<Character, Integer> map= new HashMap<>();

       for(int i=0; i<n;i++){
        char letter=s.charAt(i);
        map.put(letter,map.getOrDefault(letter,0)+1);
       }
       for(int i=0; i<n;i++){
         char letter=t.charAt(i);
         if(map.containsKey(letter)){
             map.computeIfPresent(letter, (key, val) -> val > 1 ? val - 1 : null);
         }
         else{
            return false;
         }
       }
       return true;
    }
}
