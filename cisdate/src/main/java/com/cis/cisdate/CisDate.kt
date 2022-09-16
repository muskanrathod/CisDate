package com.cis.cisdate

import android.content.Context
import android.util.Log
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

public open class CisDate {
    public val TAG = "CisDateKotlin"

    public open fun myToast(ctx: Context, msg: String) {
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show()
    }

    public  open fun getCurrentDateTime(): String? {
        val smsTime = Calendar.getInstance()
        val simpleDateFormat = SimpleDateFormat("dd MMM yyyy'&'HH:mm:ss")
        return simpleDateFormat.format(smsTime.time)
    }

    public open fun printLog(MSG: String, VALUE: Any?) {
        Log.d(TAG, "$MSG\t-->\t$VALUE")
    }
}