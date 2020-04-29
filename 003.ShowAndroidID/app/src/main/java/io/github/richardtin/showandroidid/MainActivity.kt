package io.github.richardtin.showandroidid

import android.os.Bundle
import android.provider.Settings
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val deviceId: TextView = findViewById(R.id.device_id)
        deviceId.text = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
    }
}
