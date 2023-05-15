package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Test1 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        Button backLoginButton = (Button) this.findViewById(R.id.BackLoginButton);
        Button enterButton = (Button) this.findViewById(R.id.EnterButton);
        Button aboutusButton = (Button) this.findViewById(R.id.AboutButton);
        backLoginButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 跳转到登录界面
                        Intent intent = new Intent(Test1.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
        );

        enterButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 跳转到主页面
                        Intent intent = new Intent(Test1.this, MainMeunActivity.class);
                        startActivity(intent);
                    }
                }
        );
        aboutusButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 跳转到主页面
                        Intent intent = new Intent(Test1.this, AboutUsActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
