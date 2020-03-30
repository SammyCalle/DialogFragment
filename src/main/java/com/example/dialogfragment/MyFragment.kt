package com.example.dialogfragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment


class MyFragment : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView : View = inflater.inflate(R.layout.fragment_dialog,container,false)
        var cancelButton = rootView.findViewById<Button>(R.id.btnCancel)
        var submintButton = rootView.findViewById<Button>(R.id.btnsubmit)
        var surveyRadioGroup = rootView.findViewById<RadioGroup>(R.id.myradiogroup)
        cancelButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                dismiss()
            }
        })

        submintButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                val selectedId = surveyRadioGroup.checkedRadioButtonId
                val selectedRadioButton = rootView.findViewById<RadioButton>(selectedId)
                Log.d("Test", selectedRadioButton.text.toString())
            }
        })
        return rootView
    }
}
