package com.demo.syj.HelloMenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, Menu.FIRST, 0, "add").setIcon(android.R.drawable.ic_menu_add);
        menu.add(Menu.NONE, Menu.FIRST+1, 1, "save").setIcon(android.R.drawable.ic_menu_save);
        menu.add(Menu.NONE, Menu.FIRST+2, 2, "send").setIcon(android.R.drawable.ic_menu_send);
        menu.add(Menu.NONE, Menu.FIRST+3, 3, "detail").setIcon(android.R.drawable.ic_menu_info_details);
        menu.add(Menu.NONE, Menu.FIRST+4, 4, "delete").setIcon(android.R.drawable.ic_menu_delete);
        menu.add(Menu.NONE, Menu.FIRST+5, 5, "help").setIcon(android.R.drawable.ic_menu_help);
        menu.add(Menu.NONE, Menu.FIRST+6, 6, "search").setIcon(android.R.drawable.ic_menu_search);
        Toast.makeText(this, menu.size()+"", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, menu.toString(), Toast.LENGTH_SHORT).show();
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 0:
                Toast.makeText(this, "添加", Toast.LENGTH_SHORT).show();
            case 1:
                Toast.makeText(this, "保存", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "发送", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "详情", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "删除", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "帮助", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this, "搜索", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "方法还没有定义", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Toast.makeText(this, "menu没出来时，处理方法自己定义即可", Toast.LENGTH_SHORT).show();
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        Toast.makeText(this, "menu退出后，处理方法自己定义即可", Toast.LENGTH_SHORT).show();
        super.onOptionsMenuClosed(menu);
    }
}
