package com.enesayberk.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("on create called");
        testMethod();
        System.out.println(math(3 , 5));
        System.out.println(newMethod("Atil"));
        makeMusicians();
    }
    public void makeSimpson(){


Simpsons homer = new Simpsons("Homer","nuclear",50);
homer.age = 51;
        System.out.println(homer.age);
        System.out.println(homer.getName());
        homer.setName("Honer Simpson");
        System.out.println(homer.getName());

    }
    public void makeMusicians(){

        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.instrument);

    }
public void testMethod(){
        int x = 4 + 4 ;
    System.out.println("value of x : " + x);
}

public int math(int a , int b ){

        return a+b ;
}
public String newMethod(String string){
        return string + "new Method";
}
    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }
}