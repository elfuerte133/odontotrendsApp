package com.example.odontotrends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.odontotrends.model.Appointment
import kotlinx.android.synthetic.main.activity_appointments.*

class AppointmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointments)

        val appointments = ArrayList<Appointment>()
        appointments.add(
            Appointment(1, "Médico test", "01/04/2022", "3:00 PM")
        )

        appointments.add(
            Appointment(2, "Médico BB", "02/04/2022", "4:00 PM")
        )

        appointments.add(
            Appointment(3, "Médico CC", "03/04/2022", "5:00 PM")
        )

        rvAppointments.layoutManager = LinearLayoutManager(this)
        rvAppointments.adapter = AppointmentAdapter(appointments)
    }
}