package com.example.nuch_nb.testgit6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int pnuchData =60;
        //พี่นุชบอกว่า เฮ้ย มันเป็น int นิ เขียนผิด ๆ เลยแก้ซะเลย
        int kengData=35;
        //แล้วผมก็ add data ของผม และ commit  แต่ยังไม่ push นะ

        int mydata2=77;
        //พี่นุช ก็ทำการแก้ไข commit แต่ จะ pushขึ้นทันที
        //push ผ่าน ปกติ
        int mydata3=89;

        String mydata4="88898";
    }
}
