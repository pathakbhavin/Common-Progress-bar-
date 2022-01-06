package com.example.loader

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.LinearLayout

class Loader(mContext: Context) : Dialog(mContext) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.progress)
        window?.setLayout(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        window?.setBackgroundDrawableResource(R.color.trans)
    }
}