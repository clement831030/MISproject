package clement.project_main;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Post_MainActivity extends Fragment {

        private int hour;
        private int minute;
        public Post_MainActivity() {
        }

       // @Override
       // public void onCreate(Bundle savedInstanceState) {
       //     super.onCreate(savedInstanceState);
       // }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.activity_post__main, container, false);
        }
    class innerPost_MainActivity extends AppCompatActivity {
        private void findViews() {
            ImageView pframe_iv = (ImageView) findViewById(R.id.pframe_iv);  //框架

            ImageButton pdate_ib = (ImageButton) findViewById(R.id.pdate_ib);
            ImageButton ptime_ib = (ImageButton) findViewById(R.id.ptime_ib);


            TextView from_tv = (TextView) findViewById(R.id.from_tv);   //出發地
            TextView to_tv = (TextView) findViewById(R.id.to_tv);       //目的地
            TextView pdate_tv = (TextView) findViewById(R.id.pdate_tv);    //日期
            TextView pnum_tv = (TextView) findViewById(R.id.pnum_tv);   //需求人數
            TextView pprice_tv = (TextView) findViewById(R.id.pprice_tv); //價錢
            TextView pneed_tv = (TextView) findViewById(R.id.pneed_tv);  //需求
            //TextView pnote_tv = (TextView) findViewById(R.id.pnote_tv);  //備註

            EditText from_et = (EditText) findViewById(R.id.from_et);  //輸入出發地
            EditText to_et = (EditText) findViewById(R.id.to_et);      //輸入目的地
            EditText pnote_et = (EditText) findViewById(R.id.pnote_et);  //輸入備註


        }
    }
}