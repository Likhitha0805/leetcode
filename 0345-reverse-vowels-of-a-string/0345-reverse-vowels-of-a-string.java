/*class Solution {
    public String reverseVowels(String s) {
        Set<Character>vowels=new HashSet<>(Arrays.asList('a','e','i','o','u',
                           'A','E','I','O','U'));
          char[]ch=s.toCharArray();
        int l=0,r=s.length()-1;
      while(l<r){
        while(l<r&&!vowels.contains(ch[l])){
            l++;
        }
        while(l<r&&!vowels.contains(ch[r])){
            r--;
        }
        char temp=ch[l];
        ch[l]=ch[r];
        ch[r]=temp;
        l++;
        r--;

        }

      
        
        return new String(ch);
}
}*/
class Solution {
    public String reverseVowels(String s) {
     Set<Character>vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U')) ;
     char[]ch=s.toCharArray();
     int l=0,r=s.length()-1;
     while(l<r){
        while(l<r&&!vowels.contains(ch[l])){
            l++;
        }
        while(l<r&&!vowels.contains(ch[r])){
            r--;
        }
        char temp=ch[l];
        ch[l]=ch[r];
        ch[r]=temp;
        l++;
        r--;
     }
     return new String(ch);
    }
}
     
