package eu.example.passingdatabetweenactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // get the data from the MainActivity and put them into a val personString
        // and show it on the screen with tvPerson.text
        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")
        val personString = "$name is $age years old and lives in $country"
        tvPerson.text = personString

        // using the Person dataclass object person
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        val personDataString = ""
        tvPersonData.text = "From dataClass ${person.name} is ${person.age} years old, and lives in ${person.country}"
    }
}