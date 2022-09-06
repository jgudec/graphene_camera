package com.google.android.GoogleCamera.ui.activities

import android.content.SharedPreferences
import com.google.android.GoogleCamera.CapturedItem
import com.google.android.GoogleCamera.util.EphemeralSharedPrefsNamespace
import com.google.android.GoogleCamera.util.getPrefs

class SecureMainActivity : MainActivity(), SecureActivity {
    val capturedItems = ArrayList<CapturedItem>()
    val ephemeralPrefsNamespace = EphemeralSharedPrefsNamespace()

    override fun getSharedPreferences(name: String, mode: Int): SharedPreferences {
        return ephemeralPrefsNamespace.getPrefs(this, name, mode, cloneOriginal = true)
    }
}
