class Solution {

    public static Integer iVal = 1;
    public static Integer vVal = 5;
    public static Integer xVal = 10;
    public static Integer lVal = 50;
    public static Integer cVal = 100;
    public static Integer dVal = 500;
    public static Integer mVal = 1000;

    
    
    public int romanToInt(String s) {
        Integer total = 0;
        Integer curVal = 0;
        Integer lastVal = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);

            switch(c){
                case 'I': 
                    curVal = iVal;
                    break;
                case 'V': 
                    curVal = vVal;
                    break;
                case 'X': 
                    curVal = xVal;
                    break;
                case 'L': 
                    curVal = lVal;
                    break;
                case 'C': 
                    curVal = cVal;
                    break;
                case 'D': 
                    curVal = dVal;
                    break;
                case 'M': 
                    curVal = mVal;
                    break;
            }

            if(curVal < lastVal) {
                total = total - curVal;
            } else {
                total = total + curVal;
            }

            lastVal = curVal;
            
        }

        return total;
    }
}