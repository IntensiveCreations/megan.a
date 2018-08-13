package io.konduct.megan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.konduct.megan.dummy.DummyContent
import io.konduct.megan.ui.profile.ProfileFragment

class ProfileActivity : AppCompatActivity(), UserSearchResultFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, UserSearchResultFragment.newInstance(1))
                    .commitNow()
        }
    }

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {

    }
}
