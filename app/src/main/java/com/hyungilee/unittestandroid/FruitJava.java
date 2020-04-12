package com.hyungilee.unittestandroid;

import java.util.Objects;

public class FruitJava {

    //Fruit name
    String fruitName;

    //Fruit description
    String description;

    @Override
    public String toString(){
        return "FruitJava("+ fruitName + ", " + description +")";
    }

    @Override
    public boolean equals(Object obj) {
        // 우선 같은 class인지 확인한다.
        if (obj instanceof FruitJava) {
            //FruitJava클래스로 캐스팅한다.
            FruitJava another = (FruitJava) obj;

            //모든 필드가 같다면 같은 객체로 취급한다.
            return fruitName.equals(another.fruitName) &&
                    description.equals(another.description);
        }
        return false;
    }

    @Override
    public int hashCode(){
        //객체가 같으면 해시코드도 같아야한다.
        //즉 fruitName, description 이 같으면 같은 해시코드를 반환해야한다.
        int hash = 7;
        hash = 31 * hash + (fruitName == null ? 0 : fruitName.hashCode());
        hash = 31 * hash + (description == null ? 0 : description.hashCode());

        return hash;
    }
}
