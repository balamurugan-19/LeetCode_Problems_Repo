class Solution {
    public String defangIPaddr(String address) {
    String mj ="";
      for(int i=0;i<address.length();i++){
        if(address.charAt(i)=='.'){
            mj=mj+"[.]";
        }
        else{
            mj=mj+address.charAt(i);
        }
      }
return mj;
        }
    }
