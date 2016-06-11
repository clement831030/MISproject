package clement.project_main;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Calendar;

public class ShowPosts extends Fragment {


    private ImageButton calltaxi;
    private ImageButton finddriver;
    private ImageButton findpassenger;

    public ShowPosts() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.post, container, false);




                finddriver =(ImageButton)view.findViewById(R.id.finddriver);
                finddriver.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        calltaxi.setImageResource(R.drawable.calltaxi);
                        finddriver.setImageResource(R.drawable.finddriver2);
                        findpassenger.setImageResource(R.drawable.findpassenger);

                    }
                });

                findpassenger =(ImageButton)view.findViewById(R.id.findpassenger);
                findpassenger.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        calltaxi.setImageResource(R.drawable.calltaxi);
                        finddriver.setImageResource(R.drawable.finddriver);
                        findpassenger.setImageResource(R.drawable.findpassenger2);
                    }
                });

                calltaxi =(ImageButton)view.findViewById(R.id.calltaxi);
                calltaxi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        calltaxi.setImageResource(R.drawable.calltaxi2);
                        finddriver.setImageResource(R.drawable.finddriver);
                        findpassenger.setImageResource(R.drawable.findpassenger);
                    }
                });

             /*取得日期*/
        Calendar c=Calendar.getInstance();//建立抓日期物件
        mYear=c.get(Calendar.YEAR);//年
        mMonth=c.get(Calendar.MONTH);//月
        mDay=c.get(Calendar.DAY_OF_MONTH);//日



        showyear= (TextView) view.findViewById(R.id.showyear);
        /*指定tv到xml中的textview元件*/
                showdate= (TextView) view.findViewById(R.id.showdate);
        /*指定tv到xml中的textview元件*/
        updateDisplay();
                //呼叫自定方法，用來把日期丟到textview裡面
        return view;
            }

            /*宣告三個日期變數，用來抓年月日*/
            private int mYear;
            private int mMonth;
            private int mDay;
            /*宣告物件變數tv，在程式碼裡指定tv到textview用的*/
            TextView  showyear;
            TextView  showdate;

            private void updateDisplay()
            {//設定tv的字，用append()方法加入字串，數字用自定方法轉成二個字元
                showyear.setText(
                        new StringBuilder().append(mYear).append("")

                );
                showdate.setText(
                        new StringBuilder().append(format(mMonth + 1)).append("/")
                                .append(format(mDay)).append("")
                );
            }

            //自定方法，如果只有一位數的時候就加入一個0
            private String format(int i) {
                String s=" "+i;
                if(s.length()==1) s="0"+s;
                return s;
            }








    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}

