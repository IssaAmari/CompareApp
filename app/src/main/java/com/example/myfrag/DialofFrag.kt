package com.example.myfrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.DialogFragment

class DialofFrag: DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.frag_dial,container, false)
        return rootView
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt : Button = view.findViewById(R.id.cancelButton);
        val submitbt : Button = view.findViewById(R.id.submitButton);
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener{
            val num1:TextView=view.findViewById(R.id.Num1)
            val num2:TextView =view.findViewById(R.id.Num2)
            if(num1.toString().toFloat()>num2.toString().toFloat()){
                Toast.makeText(context,"num1 > num2",Toast.LENGTH_LONG).show()
            }
            else if (num2.toString().toFloat()>num1.toString().toFloat()){
                Toast.makeText(context,"num2 > num1",Toast.LENGTH_LONG).show()
            }
            else
                Toast.makeText(context,"num2 = num1",Toast.LENGTH_LONG).show()
        }
    }
}