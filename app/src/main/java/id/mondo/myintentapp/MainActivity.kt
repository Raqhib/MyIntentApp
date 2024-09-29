package id.mondo.myintentapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivityData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivityData.setOnClickListener(this)

    }

    override fun onClick(v: View){
        when(v?.id){
            R.id.btn_move_activity ->{
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data -> {
                val moveWithDataInten = Intent(this@MainActivity, MoveWithdataActivity::class.java)
                moveWithDataInten.putExtra(MoveWithdataActivity.EXTRA_NAME, "Rahib")
                moveWithDataInten.putExtra(MoveWithdataActivity.EXTRA_AGE, 21)
                startActivity(moveWithDataInten)
            }

        }
    }
}