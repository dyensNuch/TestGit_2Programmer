package com.example.nuch_nb.testgit6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String pnuchData ="60";
       // อ้าว เขียน code อยู่ดี ๆ ได้ error มาซะงั้น แก้ให้ถูกละกัน
        int kengData=35;
        //แล้วผมก็ add data ของผม และ commit  แต่ยังไม่ push นะ

        int mydata2=77;
        //พี่นุช ก็ทำการแก้ไข commit แต่ จะ pushขึ้นทันที
        //push ผ่าน ปกติ
        int mydata3=89;

        String mydata4="88898";
    }
    public void kengMethod()
    {
        int mykengdata =8;
        //ผมก็ up งานของผมบ้าง
        //แน่นอน โดน push reject เพราะ ว่า coding ไม่ update ก็เข้าขั้นตอนเดิมคับ pull
    }
public void pnuchMethod()
{
    int mymethoddata =1;
    //พี่นุช commit และ push
    int mykeng =2;
}
