package com.october;

import org.junit.Assert;
import org.junit.Test;

public class SplitBalanceTreeTest {

    private SplitBalanceTree splitBalanceTree;

    @Test
    public void balancedStringSplit() {
        int number1 = splitBalanceTree.balancedStringSplit("RLRRLLRLRL");
        Assert.assertEquals(4, number1);

        int number2 = splitBalanceTree.balancedStringSplit("RLRRLLRLRL");
        Assert.assertEquals(3, number2);

        int number3 = splitBalanceTree.balancedStringSplit("LLLLRRRR");
        Assert.assertEquals(1, number3);

        int number4 = splitBalanceTree.balancedStringSplit("RRRRRRRR");
        Assert.assertEquals(8, number4);

    }
}
