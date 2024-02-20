package com.example.alertdialogproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    // Step 1 -> Create Your UI activity_main.xml
    // Step 2 -> Implement Alert Dialog Box in MainAvtivity.kt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {

            val dialog = AlertDialog.Builder(this)

            dialog.setTitle("Delete Files")
            dialog.setMessage(R.string.description)
            dialog.setIcon(R.drawable.baseline_delete_forever_24)

            dialog.setPositiveButton("YES"){ dialogInterface,which ->
                Toast.makeText(this,"Clicked Yes",Toast.LENGTH_LONG).show()
            }
            dialog.setNegativeButton("NO"){ dialogInterface,which ->
                Toast.makeText(this,"Clicked No",Toast.LENGTH_LONG).show()
            }
            dialog.setNeutralButton("CANCEL"){ dialogInterface,which ->
                Toast.makeText(this,"Clicked Cancel",Toast.LENGTH_LONG).show()
            }

            val alertDialog: AlertDialog = dialog.create()
            alertDialog.setCancelable(false)     // Agar user kai or click karta to usa phir b
            alertDialog.show()                   // dialog box show raha ga, usa kisi na kisi button
                                                 // pa click zaroor karna
        }
    }
}