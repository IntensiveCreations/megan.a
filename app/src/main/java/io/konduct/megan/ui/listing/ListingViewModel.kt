package io.konduct.megan.ui.listing

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.util.Log
import androidx.lifecycle.ViewModel
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.firebase.auth.FirebaseAuth
import io.konduct.megan.client.Megan
import io.konduct.megan.client.model.UserResponseFields

class ListingViewModel : ViewModel() {
    fun me() {

        val builder = Megan.Builder(NetHttpTransport(), JacksonFactory() , null)
        builder.rootUrl = "http://192.168.1.101:8080/_ah/api/"
        val service = builder.build()

        val mAuth = FirebaseAuth.getInstance()

        mAuth.app.getToken(false).addOnSuccessListener { result ->

            val t = @SuppressLint("StaticFieldLeak")
            object: AsyncTask<Unit, Unit, UserResponseFields>() {
                override fun doInBackground(vararg p0: Unit?): UserResponseFields {
                    return try {

                        var t = service.User().get()
                        t.requestHeaders.authorization = result.token
                        t.execute()

                    } catch (e:Exception) {
                        Log.e(this.javaClass.name, e.toString())
                        UserResponseFields()
                    }

                }
            }
            val res = t.execute()
            val res2 = res.get()
            res2



        }



    }
}