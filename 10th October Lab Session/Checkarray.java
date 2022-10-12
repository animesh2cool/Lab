//1.write a java program to test if an array contains a specific value

import java.util.Arrays;

class Checkarray {
    public static void main(String[] args) {
        int[]arr={21,33,4,57,60,75,82};
        int find=50;
      boolean check=false;
      for(int element:arr){
          if(element==find){
              check=true;
              break;
          }
      }
      if(check){
          System.out.println(find+ " is true");
      }
      else {
          System.out.println(find + " is false");
      }
    }
}
