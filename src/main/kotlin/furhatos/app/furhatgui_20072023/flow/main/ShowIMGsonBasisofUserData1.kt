package furhatos.app.furhatgui_20072023.flow.main

import furhatos.app.furhatgui_20072023.NLU.Elefant
import furhatos.app.furhatgui_20072023.NLU.Giraffe
import furhatos.app.furhatgui_20072023.flow.Parent
import furhatos.flow.kotlin.*
import furhatos.records.User

//Die beiden benötigten Variabeln werden initial gesetzt, später werden diese dann überschrieben

var Benutzer: User? = null
var Nutzerdaten: String? = ""


val InputUserData1: State = state(Parent) {
    onEntry {
        furhat.ask("Möchtest du eine Giraffe oder einen Elefanten auf dem Furhat-Bildschirm angezeigt bekommen?")
    }

    onResponse<Elefant> {
        //Der Variable Benutzer wird dem Nutzer zugeordnet, der geantwortet hat
        Benutzer = users.current

        //Die Variable Nutzerdaten wird mit dem String Elefant beschrieben
        Nutzerdaten = "Elefant"

        //Das field mit dem Namen ElefantoderGiraffe wird mit der Variable Nutzerdaten beschrieben
        Benutzer!!.put("ElefantoderGiraffe", Nutzerdaten)

        //Der nächste State wird aufgerufen
        goto(InputUserData2)

    }

    onResponse<Giraffe> {
        //Siehe onResponse<Elefant>
        Benutzer = users.current
        Nutzerdaten = "Giraffe"
        Benutzer!!.put("ElefantoderGiraffe", Nutzerdaten)
        goto(InputUserData2)

    }
    onResponse{
        Benutzer = users.current

        Benutzer!!.put("ElefantoderGiraffe", "")

        goto(InputUserData2)
    }

}

