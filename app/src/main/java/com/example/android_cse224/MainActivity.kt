package com.example.android_cse224

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Cse224 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_two)

        val btn=findViewById<Button>(R.id.Btn)
        val Rgrp=findViewById<RadioGroup>(R.id.RGrp)
        val submit=findViewById<Button>(R.id.submit)
        val checkbox1=findViewById<CheckBox>(R.id.checkBox1)
        val checkbox2=findViewById<CheckBox>(R.id.checkBox2)
        val select=findViewById<Button>(R.id.select)
        var radioButton:RadioButton

        btn.setOnClickListener {
            Toast.makeText(applicationContext,"Button is clicked",Toast.LENGTH_SHORT).show()
        }

        Rgrp.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener{group,checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext, "You have selected ${radio.text}", Toast.LENGTH_SHORT).show()
            }
        )
        submit.setOnClickListener {
            val selected:Int=Rgrp.checkedRadioButtonId
            radioButton=findViewById(selected)
            val output=radioButton.text.toString()
            Toast.makeText(applicationContext,output.toString(), Toast.LENGTH_SHORT).show()
        }

        checkbox1.setOnClickListener {
            if(checkbox1.isChecked)
                Toast.makeText(applicationContext,"Indian",Toast.LENGTH_SHORT).show()
        }
        checkbox2.setOnClickListener {
            if(checkbox2.isChecked)
                Toast.makeText(applicationContext,"Chinese",Toast.LENGTH_SHORT).show()
        }

        select.setOnClickListener {
            val str=StringBuilder()
            str.append("Current items")
            if(checkbox1.isChecked)
            {
                str.append("\nIndian ")
            }
            if(checkbox2.isChecked)
            {
                str.append("\nChinese ")
            }
            if(!checkbox1.isChecked && !checkbox2.isChecked)
            {
                str.append("\nNone")
            }
            Toast.makeText(applicationContext,str.toString(), Toast.LENGTH_SHORT).show()

        }



    }
}