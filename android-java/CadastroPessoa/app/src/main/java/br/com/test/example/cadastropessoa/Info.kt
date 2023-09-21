package br.com.test.example.cadastropessoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        findViewById<ImageView>(R.id.fecharBtn).setOnClickListener {
            goBackToMainActivity()
        }
    }

    private fun goBackToMainActivity() {
        finish()
    }
}