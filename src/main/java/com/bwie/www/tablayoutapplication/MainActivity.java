package com.bwie.www.tablayoutapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private String[] strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.mytablayout);
        strings = new String[]{"笑话","军事发明","视屏","今日头条","小说","回忆","折磨","认错","有没有用","快乐的时空","如今的生活"};
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Myfragment myfragment = new Myfragment();
                Bundle bundle = new Bundle();
                bundle.putString("test", strings[position]);
                myfragment.setArguments(bundle);
                return myfragment;
            }

            @Override
            public int getCount() {
                return strings==null?0:strings.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return strings[position];
            }

        });
        tabLayout.setupWithViewPager(viewPager);
    }
}
