package com.example.buisnesscard

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var img: Uri? = null
    private var pickImg = 100
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        AppCompatDelegate.MODE_NIGHT_NO
        setViews()
    }
    private fun setViews(){
//        logoBtn.setOnClickListener{pickImage()}
        genBtn.setOnClickListener{setTextViews()}
    }
    private fun setTextViews(){
        val cName=cName.getText()
        val pName=pName.getText()
        val pJob=pJob.getText()
        val pEmail=pEmail.getText()



        cNameView.text=cName
        pNameView.text=pName
        pJobView.text=pJob
        pEmailView.text=pEmail


//        lineView.setBackgroundColor(Color.BLACK)
//        cLogoView.setImageURI(img)
    }
//    private fun pickImage(){
//        val pic= Intent(Intent.ACTION_PICK,MediaStore.Images.Media.INTERNAL_CONTENT_URI)
//        startActivityForResult(pic,pickImg)
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if(resultCode==RESULT_OK && requestCode==pickImg){
//            img = data?.data
//        }
//    }
}