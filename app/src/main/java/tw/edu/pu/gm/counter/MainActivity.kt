package tw.edu.pu.gm.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv = findViewById(R.id.txv)
        txv.setOnClickListener({

            if (txv.text == "洪友錦你好") {
                txv.text = "海青班很棒"
            }
            else
                txv.text = "洪友錦你好！"
            })
    }
}