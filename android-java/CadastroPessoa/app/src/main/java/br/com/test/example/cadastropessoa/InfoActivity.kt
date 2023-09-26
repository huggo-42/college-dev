package br.com.test.example.cadastropessoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("InfoActivity", "onCreate: InfoActivity created")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        findViewById<ImageView>(R.id.fecharBtn).setOnClickListener {
            goBackToMainActivity()
        }
    }

    override fun onDestroy() {
        Log.i("InfoActivity", "onDestroy: InfoActivity destroyed")
        super.onDestroy()
    }

    private fun goBackToMainActivity() {
        finish()
    }
}