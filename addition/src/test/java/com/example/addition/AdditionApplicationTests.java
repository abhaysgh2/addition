package com.example.addition;

import com.example.addition.utility.Addition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdditionApplicationTests {

    @Test
    void testAddition() {
        Integer a = 1;
        Integer b = 2;
        Integer expectedResult = 3;

        Addition add = new Addition();
        Integer additionResult = add.addition(a,b);
        Assertions.assertEquals(expectedResult, additionResult);

    }

}
