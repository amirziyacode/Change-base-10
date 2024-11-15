package org.example;

import java.util.concurrent.atomic.AtomicReference;

public class ChangeBase {

    public void TenToTwo(int number){
        AtomicReference<StringBuilder> stringBuilder = new AtomicReference<>();
        int result ;
        while(number >=  1){
            result = number % 2;
            number = number / 2;
            stringBuilder.get().append(result);

        }
    }
}
