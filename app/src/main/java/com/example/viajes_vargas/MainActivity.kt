package com.example.viajes_vargas

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var myWebView: WebView? = null
    private var myWebSettings: WebSettings? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myWebView = findViewById(R.id.web1)
        myWebSettings = myWebView?.getSettings()
        myWebSettings!!.javaScriptEnabled = true
        myWebSettings!!.domStorageEnabled = true
        myWebView?.loadUrl("https://diegogpe2021.000webhostapp.com/index.html/proyecto/inicio/index.php")
        myWebView?.setWebViewClient(WebViewClient())
    }

    override fun onBackPressed() {
        if (myWebView!!.canGoBack()) {
            myWebView!!.goBack()
        } else {
            super.onBackPressed()
        }
    }
}