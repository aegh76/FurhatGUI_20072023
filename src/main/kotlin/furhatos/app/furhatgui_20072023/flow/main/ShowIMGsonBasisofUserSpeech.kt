package furhatos.app.furhatgui_20072023.flow.main

import furhatos.app.furhatgui_20072023.NLU.Elefant
import furhatos.app.furhatgui_20072023.NLU.Giraffe
import furhatos.app.furhatgui_20072023.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.skills.HostedGUI

val InputUserSpeech: State = state(Parent) {
    onEntry {
        furhat.ask("Möchtest du eine Giraffe oder einen Elefanten auf dem Furhat-Bildschirm angezeigt bekommen?")
    }

    onResponse<Elefant> {
        furhat.say("Okay, hier ein Bild")
        val GUIElefant = HostedGUI("MyCustomGUI", "assets/webTemplates/Elefant", port = 51234)
    }

    onResponse<Giraffe> {
        furhat.say("Okay, hier ist eine Giraffe")
        val GUIGiraffe = HostedGUI("MyCustomGUI", "assets/webTemplates/Giraffe", port = 51234)
    }

}

