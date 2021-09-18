package eu.example.passingdatabetweenactivities

import java.io.Serializable

// data class is to tell kotlin that the only reason of this class is to hold data !
data class Person(
        val name: String,
        val age: Int,
        val country: String
) : Serializable // be able to parse this class between activityes
