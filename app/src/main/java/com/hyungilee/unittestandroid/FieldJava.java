package com.hyungilee.unittestandroid;

public class FieldJava {
    // 인스턴스에서 사용하는 변수이므로 Field
    public int field1;

    // 접근제어자와 상관없이 모두 Field
    private double field2;
    protected String field3;

    // Getter, Setter가 있어도 Field
    private int field4;

    public int getField4(){
        return field4;
    }

    public void setField4(int field4){
        this.field4 = field4;
    }

    //클래스 변수는 Field가 아님.
    static int notField1;

    void func1(){
        // 함수 내의 변수들은 Field가 아닌 지역변수.
        int notField2 = 0;
    }
}

