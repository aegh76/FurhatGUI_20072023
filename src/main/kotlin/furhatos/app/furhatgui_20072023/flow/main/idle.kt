package furhatos.app.furhatgui_20072023.flow.main

import furhatos.flow.kotlin.*



val Idle: State = state {
    onEntry {
        if (users.count > 0)
        {
            furhat.attend(users.current)
            goto(InputUserData1)
        }
        else {
            furhat.attendNobody()
        }
    }
    onUserEnter {
        furhat.say("onUserEnter")
        furhat.attend(it)
        goto(InputUserData1)
    }
}
