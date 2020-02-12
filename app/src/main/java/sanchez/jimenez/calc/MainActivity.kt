package sanchez.jimenez.calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSumar.setOnClickListener {
            val uno = etUno.text.toString()
            val dos = etDos.text.toString()

            if (uno.equals("") or dos.equals("")) {
                mensajito("Datos vacíos", Toast.LENGTH_LONG)
            } else {
                val Res = uno + dos
                val i = Intent(this, Activity2::class.java)
                i.putExtra("nombre", "Ricky")
                startActivity(i)
            }
            }
        }


    fun mensajito(mensaje: String, dur:Int= Toast.LENGTH_LONG) {
        Toast.makeText(this, mensaje, dur).show()
    }

}
