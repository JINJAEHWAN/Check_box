package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //뷰의 주소값을 담을 참조변수
    TextView text1;
    CheckBox check1, check2, check3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //뷰의 주소 값을 가지고 온다.
        text1 =(TextView)findViewById(R.id.textView);
        check1=(CheckBox)findViewById(R.id.checkBox);
        check2=(CheckBox)findViewById(R.id.checkBox2);
        check3=(CheckBox)findViewById(R.id.checkBox3);
    }
    //첫 번째 버튼을 누르면 호출되는 메서드
    //체크 상태 값을 파악한다.
    public void btn1Method(View view){
        text1.setText("");

        //체크 상태에 따라 필요한 처리를 해준다.
        boolean a1 = check1.isChecked();
        boolean a2 = check2.isChecked();
        boolean a3 = check3.isChecked();

        if(a1 == true){
            text1.append("첫 번째 체크 박스가 체크되어 있습니다\n");
        }
        if(a2 == true){
            text1.append("두 번째 체크 박스가 체크되어 있습니다\n");
        }
        if(a3 == true){
            text1.append("세 번째 체크 박스가 체크되어 있습니다\n");
        }
    }

    //두 번째 버튼과 연결된 메서드
    //모든 체크박스의 상태를 체크상태로 설정한다.
    public void btn2Method(View view){
        check1.setChecked(true);
        check2.setChecked(true);
        check3.setChecked(true);
    }

    //세 번째 버튼과 연결된 메서드
    //모든 체크박스의 상태를 체크해제상태로 설정한다.
    public void btn3Method(View view){
        check1.setChecked(false);
        check2.setChecked(false);
        check3.setChecked(false);
    }
    public void btn4Method(View view){
        check1.toggle();
        check2.toggle();
        check3.toggle();
    }
}