package com.hyungilee.unittestandroid;

public class MagicSwordDelegate implements ISword {

    ISword iSword;

    // 생성자에서 ISword 타입의 객체를 생성자에서 받는다.
    public MagicSwordDelegate(ISword iSword){
        this.iSword = iSword;
    }

    // 장착시 불리는 메소드
    @Override
    public void equip() {

        playWonderfulSound();

        iSword.equip();

    }

    // 확장기능 - 멋진 사운드를 플레이하는 메소드
    public void playWonderfulSound(){
        // 멋진 사운드를 플레이 한다.
        System.out.println("짜잔");
    }

}
