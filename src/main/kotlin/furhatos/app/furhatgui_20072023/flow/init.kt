package furhatos.app.furhatgui_20072023.flow

import furhatos.app.furhatgui_20072023.flow.main.Idle
import furhatos.app.furhatgui_20072023.setting.DISTANCE_TO_ENGAGE
import furhatos.app.furhatgui_20072023.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.users
import furhatos.util.Language


val Init: State = state {

    onEntry {

        /** Set our default interaction parameters */
        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)
        furhat.setInputLanguage(Language.GERMAN)

        /** start interaction */
        when {
            furhat.isVirtual() -> goto(Idle) // Convenient to bypass the need for user when running Virtual Furhat
            users.hasAny() -> {
                furhat.attend(users.random)
                goto(Idle)
            }
            else -> goto(Idle)
        }
    }

}
