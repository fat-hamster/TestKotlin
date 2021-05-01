package com.dmgpersonal.testkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    @SuppressLint("SetTextI18n")
    private fun initView() {
        val helloButton: Button = findViewById(R.id.helloButton)
        val dataButton: Button = findViewById(R.id.dataButton)
        val dataCopyButton: Button = findViewById(R.id.dataCopyButton)
        val objectButton: Button = findViewById(R.id.objectButton)
        val helloTextView: TextView = findViewById(R.id.helloTextView)
        val testDataClass: TestDataClass = (TestDataClass(name = "Ivan", age = 30))
        val testCopy = testDataClass.copy(name = "Petr")

        helloButton.setOnClickListener { helloTextView.text = getString(R.string.greetings) }
        dataButton.setOnClickListener { helloTextView.text = testDataClass.name + ": " + testDataClass.age }
        dataCopyButton.setOnClickListener { helloTextView.text = testCopy.name + ": " + testCopy.age }
        objectButton.setOnClickListener { helloTextView.text = TestObjectClass.getGreetings() }
    }
}