package com.arit.demo.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.arit.demo.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements  ClickHandler {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);


        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User("Jonh","Doe");
       binding.setUser(user);

    }
    @Override
    public void onButtonClick(User   user){
        Toast.makeText(MainActivity.this,"Welcome"+user.getFirstname()+" click ",Toast.LENGTH_LONG).show();
    }
}
