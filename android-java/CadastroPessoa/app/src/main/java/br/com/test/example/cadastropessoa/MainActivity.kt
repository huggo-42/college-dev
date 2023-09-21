package br.com.test.example.cadastropessoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

enum class IntentFields(val field: String) {
    NOME("Nome"),
    AGE("Idade"),
    CPF("CPF"),
    RG("RG"),
    SEXO("Sexo"),
}

class MainActivity : AppCompatActivity() {

    private val activityResultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult())
        { result ->
            if (result.resultCode == RESULT_OK) {
                Toast.makeText(this, "Cadastro confirmado!", Toast.LENGTH_LONG).show()
                clearForm()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<Button>(R.id.saveBtn).setOnClickListener {
            goToConfirmarCadastro()
        }
        findViewById<ImageView>(R.id.infoBtn).setOnClickListener {
            goToInfo()
        }
    }

    private fun clearForm() {
        this.findViewById<TextView>(R.id.name).text = ""
        this.findViewById<TextView>(R.id.age).text = ""
        this.findViewById<TextView>(R.id.cpf).text = ""
        this.findViewById<TextView>(R.id.rg).text = ""
        this.findViewById<TextView>(R.id.sexo).text = ""
        this.findViewById<TextView>(R.id.name).requestFocus()
    }

    private fun goToConfirmarCadastro() {
        val intent = Intent(this, ConfirmarCadastro::class.java)
        val bundle = Bundle()
        bundle.putString(
            IntentFields.NOME.field,
            this.findViewById<TextView>(R.id.name).text.toString()
        )
        bundle.putString(
            IntentFields.AGE.field,
            this.findViewById<TextView>(R.id.age).text.toString()
        )
        bundle.putString(
            IntentFields.CPF.field,
            this.findViewById<TextView>(R.id.cpf).text.toString()
        )
        bundle.putString(
            IntentFields.RG.field,
            this.findViewById<TextView>(R.id.rg).text.toString()
        )
        bundle.putString(
            IntentFields.SEXO.field,
            this.findViewById<TextView>(R.id.sexo).text.toString()
        )
        intent.putExtras(bundle)
        activityResultLauncher.launch(intent)
    }

    private fun goToInfo() {
        val intent = Intent(this, Info::class.java)
        startActivity(intent)
    }
}