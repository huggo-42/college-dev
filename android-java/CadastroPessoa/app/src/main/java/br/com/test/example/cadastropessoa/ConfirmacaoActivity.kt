package br.com.test.example.cadastropessoa

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ConfirmacaoActivity", "onCreate: ConfirmacaoActivity created")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar_cadastro)
        populateInputs()
        findViewById<Button>(R.id.btnYes).setOnClickListener {
            goBackToMainActivity(RESULT_OK)
        }
        findViewById<Button>(R.id.btnNo).setOnClickListener {
            goBackToMainActivity(RESULT_CANCELED)
        }
    }

    override fun onDestroy() {
        Log.i("ConfirmacaoActivity", "onDestroy: ConfirmacaoActivity destroyed")
        super.onDestroy()
    }

    private fun populateInputs() {
        findViewById<TextView>(R.id.name).text =
            intent.getStringExtra(IntentFields.NOME.field).toString()
        findViewById<TextView>(R.id.age).text =
            intent.getStringExtra(IntentFields.AGE.field).toString()
        findViewById<TextView>(R.id.cpf).text =
            intent.getStringExtra(IntentFields.CPF.field).toString()
        findViewById<TextView>(R.id.rg)
            .text = intent.getStringExtra(IntentFields.RG.field).toString()
        findViewById<TextView>(R.id.sexo)
            .text = intent.getStringExtra(IntentFields.SEXO.field).toString()
    }

    private fun goBackToMainActivity(result: Int) {
        setResult(result)
        finish()
    }
}