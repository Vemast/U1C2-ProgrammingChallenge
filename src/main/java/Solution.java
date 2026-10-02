public class Solution {
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return ((t1+t2+t3+t4)/4);
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        int avg = (int) (average + 0.5);
        return avg;
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        if (roundedAverage >= 65) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares*price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        int rounded = 0;
        if (totalStock < 0) {
            rounded = (int) (totalStock - 0.5);
        } else {
            rounded = (int) (totalStock + 0.5);
        }
        return rounded;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        int scaled = (int) (userDouble * 100 + 0.5);

        int hundreds = (scaled / 10000) % 10;
        int tens = (scaled / 1000) % 10;
        int ones = (scaled / 100) % 10;
        int tenths = (scaled / 10) % 10;
        int hundredths = scaled % 10;
        
        hundreds = (hundreds + 1) % 10;
        tens = (tens + 1) % 10;
        ones = (ones + 1) % 10;
        tenths = (tenths + 1) % 10;
        hundredths = (hundredths + 1) % 10;

        return (double) (hundreds * 100) + (tens * 10) + ones + (tenths / 10.0) + (hundredths / 100.0);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
