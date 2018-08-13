package io.konduct.megan

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.IdpResponse
import com.google.firebase.auth.FirebaseAuth
import io.konduct.megan.databinding.ActivityMainBinding
import io.konduct.megan.ui.listing.ListingViewModel


class MainActivity : AppCompatActivity() {

    // Initialize Firebase Auth
    private val mAuth = FirebaseAuth.getInstance();
    private val RC_SIGN_IN = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main)

        binding.viewModel = ListingViewModel()

        val currentUser = mAuth.currentUser

        if (currentUser == null) {


            // Choose authentication providers
            val providers = arrayOf(
//                    AuthUI.IdpConfig.EmailBuilder().build(),
//                    AuthUI.IdpConfig.PhoneBuilder().build(),
//                    AuthUI.IdpConfig.GoogleBuilder().build(),
                    AuthUI.IdpConfig.FacebookBuilder().build()
//                    AuthUI.IdpConfig.TwitterBuilder().build()
            ).toList()

            // Create and launch sign-in intent
            startActivityForResult(
                    AuthUI.getInstance()
                            .createSignInIntentBuilder()
                            .setAvailableProviders(providers)
                            .build(),
                    RC_SIGN_IN)
        }
        else {
            afterLogin()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == RC_SIGN_IN) {
            val response = IdpResponse.fromResultIntent(data)

            if (resultCode == Activity.RESULT_OK) {
                // Successfully signed in
                val user = FirebaseAuth.getInstance().currentUser
                Log.d(this.javaClass.name, "login user %s".format(user.toString()))

                //mAuth.signOut()
                afterLogin()
            } else {
                finish()
                // Sign in failed. If response is null the user canceled the
                // sign-in flow using the back button. Otherwise check
                // response.getError().getErrorCode() and handle the error.
                // ...
            }
        }
    }

    fun afterLogin() {
    }


}
