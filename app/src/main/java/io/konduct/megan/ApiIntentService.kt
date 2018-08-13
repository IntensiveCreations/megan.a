package io.konduct.megan

import android.app.IntentService
import android.content.Intent
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.jackson2.JacksonFactory
import io.konduct.megan.client.Megan

class ApiIntentService: IntentService("api") {
    override fun onHandleIntent(p0: Intent?) {

        val builder = Megan.Builder(NetHttpTransport(), JacksonFactory() , null)
        builder.rootUrl = "http://localhost:8080/_ah/api"
        val service = builder.build()

        val me = service.User().get().execute()
        me


    }


}
