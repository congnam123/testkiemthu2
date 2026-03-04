package entity;

public class demso {
    public int demso(int [] a){
        int count = 0;
        for (int x : a){
            if(x % 2 == 0 ){
                count ++;
            }
        }
        return count;
    }

}
