package com.ngoprek.sosmed.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.ngoprek.sosmed.R

class NotificationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_notification, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        textView.text = "Notification"
        return root
    }
}