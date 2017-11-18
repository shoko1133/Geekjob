/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shochan
 */class Human {
    // フィールドの宣言
    public String name = "";
    public int age = 0;

    // メソッドの宣言
    public void setHuman(String n, int a) {
        // 引数をフィールドへ設定
        this.name = n;
        this.age = a;
    }
    }
 
 
 
    public class Test {
     public static void main(String[] args) {
        // Humanクラスのインスタンス生成
        Human hito = new Human();

        // 人インスタンスのageフィールドへ年齢設定
        hito.age = 40;

        // 人インスタンスのsetHumanメソッドを利用
        hito.setHuman("添田亮司", 34);
    }
    }
    
