package hivelocity.co.jp.fastlanetest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClickMe.setOnClickListener {
            Toast.makeText(this@MainActivity, getString(R.string.this_is_fastlane_test), Toast.LENGTH_LONG).show()
        }
    }
}
