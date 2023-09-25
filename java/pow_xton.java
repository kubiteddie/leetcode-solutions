package java;

class Solution {
    public double myPow(double x, int n) {
        double product = 1.0;
        long nn = n;
        if(n < 0){
            nn = -nn;

        }
        while(nn != 0){
            if(nn % 2 == 0){
                x = x * x;
                nn /= 2;
            }
            else{
                nn--;
                product *= x;
            }
        }
        if(n < 0){
            product = 1/product;
        }
        return product;
    }
}
