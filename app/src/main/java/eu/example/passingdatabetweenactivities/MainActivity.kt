package eu.example.passingdatabetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // execute when we click btnApply
        btnApply.setOnClickListener {
            // put the entered editable text from android into kotlin variables ( val's)
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()
            val person = Person(name, age, country) // creating a person object from the dataclass Person


            // The context is this class so we refer to it as this
            // start the SecondActivity when we click btnApply
            // also put the 3 val's name, age, country into strings in CAPITAL so we can refer to them in the second activity
            // the it refers to the intent object we just created here.
            // and finally start the activity.
            Intent(this, SecondActivity::class.java).also {
                // makes a key - value pair where the name strings in CAPITAL refers to the 3 kotlin vals. name, age, country.
                // So we can extract them in the SecondActivity
                it.putExtra("EXTRA_NAME", name) // key = "EXTRA_NAME" String, value = the val name.
                it.putExtra("EXTRA_AGE", age)
                it.putExtra("EXTRA_COUNTRY", country)
                it.putExtra("EXTRA_PERSON", person) // put all from the person dataclass object
                startActivity(it)
            }
        }
    }
}