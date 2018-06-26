package com.example.kkiuchi.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavOptions
import androidx.navigation.ui.NavigationUI
import com.example.kkiuchi.myapplication.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        //ActionBarの処理をいい感じに登録してくれる
//        NavigationUI.setupActionBarWithNavController(this, navHost.navController)
        //BottomNavigationの処理をいい感じにしてくれる
//        NavigationUI.setupWithNavController(bottomNavigation, navHost.navController)


        // MenuのIdがNavIdとして捜査対象になる。一方でNavigationControllerはNavGraphで設定されたIdを捜査する。
        // なので、MenuのIdをNavGraphで設定したIdにしておけば、Menuの項目をタップしたら、指定の画面に飛ぶ、ってことができる

        setTitle(R.string.act1)
        /* MEMO supportFragmentManagerを使うと、NavHostの管理下から外れてしまい？、画面を表示したり、ボタンを押したタイミングでエラーになる */
        // MEMO ボタン押下でエラー
//        var fragment = supportFragmentManager.findFragmentById(R.id.container) as MainFragment?
//        if (fragment == null) {
//            fragment = MainFragment.newInstance()
//            supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
//        }
        // MEMO 画面表示でエラー
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow()
//        }
    }

}
