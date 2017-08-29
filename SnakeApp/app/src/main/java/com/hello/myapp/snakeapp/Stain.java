package com.hello.myapp.snakeapp;

public class Stain {// obstacle로 변경할 예정
    public static final int TYPE_1 = 0;
    public static final int TYPE_2 = 1;
    public static final int TYPE_3 = 2;

    public enum types {Ground, Obstacle, Enemy};
    public enum state {Ready, Created, Died};
    public int x, y;

    public types  type;

    public Stain(int x, int y, types type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

}
