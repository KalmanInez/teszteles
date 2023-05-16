package com.google.gson.internal;


import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.ArrayList;

public final class NonNullElementWrapperListTest {
    @Test
    public void TestAdd(){
        ArrayList<String> array= new ArrayList<>();
        array.add("first");
        array.add("second");
        array.add("third");
        NonNullElementWrapperList<String> list =new NonNullElementWrapperList<>(array);
        list.add(1, "apple");
        assertThat(list.size()).isEqualTo(4);
    }
    @Test
    public void TestClear(){
        ArrayList<String> array= new ArrayList<>();
        array.add("first");
        array.add("second");
        array.add("third");
        NonNullElementWrapperList<String> list =new NonNullElementWrapperList<>(array);
        list.clear();
        assertThat(list.size()).isEqualTo(0);
    }

}
