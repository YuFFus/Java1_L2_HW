import java.util.Arrays;

public class Num {
    char buffer;
    char[] num;
    boolean isNegative, dotPresence;
    int index;
    float realNum;
    public String midNum;
    
    public Num(){
        num = new char[16];
        isNegative = false;
        index = 0;
        realNum = 0.0f; 
        midNum = "0";
        dotPresence = false;
    }
    
    public void add(char simbolIn){
        if (index < 15){
            num[index] = simbolIn;
            index ++;
        }
    }

    public void addMinus(){
        for (int i = 14; i >= 0; i--){
            num[i+1] = num[i];
            if (i == 0) num[i] = '-';
        }
        index ++;
        isNegative = true;
    }
    
    public void removeMinus(){
        for (int i = 0; i < 15; i++){
            num[i] = num[i+1];
            if (i == 14) num[i+1] = '\u0000';
        }
        isNegative = false;
    }
    
    public void delLast(){
        if (index > 1){
            num[index-1] = '\u0000';
            index--;
        }
        else if (index == 1){
            num[index-1] = '0';
            index--;
        }
    }
    
    public void clear(){
        num = new char[16];
        isNegative = false;
        dotPresence = false;
        index = 0;
        midNum = "0";
    }
    
    public float arrToFloat (char[] num){
        midNum = String.valueOf(num);
        return (Float.valueOf(midNum)); 
    }
}
