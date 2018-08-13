package io.konduct.megan.ui.profile

import android.location.Location
import androidx.lifecycle.ViewModel
import java.net.URL
import java.time.LocalDateTime

class ProfileViewModel : ViewModel() {
    var name: String = ""
    var photo:URL? = null
    var isStroker: Boolean = false
    var isStrokee: Boolean = false
    var visible: Boolean = true

    var isRootReferral: Boolean = false
    var isReady: Boolean = false

    var lastActive:LocalDateTime? = null
    var lastLocation:Location? = null

    var fbProfileUrl: URL? = null

}
