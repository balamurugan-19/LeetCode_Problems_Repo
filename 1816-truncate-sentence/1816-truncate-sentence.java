class Solution {
    public String truncateSentence(String s, int k) {
        int b= s.length();
        int p=0;
        String[] bh= s.split(" ");
        String [] v= new String[k];
        for(int i=0;i<k;i++){
            v[i]=bh[i];
         }
        String hl=String.join(" ",v);
 return hl;       
    }
}