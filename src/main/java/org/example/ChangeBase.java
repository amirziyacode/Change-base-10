package org.example;

public class ChangeBase {

    public void TenToTwo(int number){
         StringBuilder stringBuilder = new StringBuilder();
        int result ;
        while(number >=  1){
            result = number % 2;
            number = number / 2;
            stringBuilder.append(result);

        }
    }
}
