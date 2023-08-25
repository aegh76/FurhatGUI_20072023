package furhatos.app.furhatgui_20072023.flow.main

import furhatos.app.furhatgui_20072023.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.state
import furhatos.skills.HostedGUI

//Auf Basis des Fields ElefantoderGiraffe wird mit den if Bedingungen überprüft, welches Bild der Nutzer
//angezeigt bekommen möchte. Hat das field den Wert "Elefant" so wird das Webtemplate aufgerufen welches den
// Elefanten anzeigt. Dasselbe gilt für den Wert "Giraffe". Mit Benutzer!!.get("ElefantoderGiraffe") wird der
// Wert des Fields ElefantoderGiraffe abgefragt



val InputUserData2: State = state(Parent) {

    onEntry {
        //Wenn der Nutzer Elefant geantowrtet hat, dann wurde das field ElefantoderGiraffe mit Elefant beschrieben
        // und der State ElefantGUI wird aufgerufen, der dann eine GUI hosted auf der ein Elefant zu sehen ist.
    if (Benutzer!!.get("ElefantoderGiraffe") == "Elefant") {
    goto(ElefantGUI)
        }
        //Wenn der Nutzer Giraffe geantwortet hat, dann wurde das field ElefantoderGiraffe mit Giraffe beschrieben
        // und der State GiraffeGUI wird aufgerufen, der dann eine GUI hosted auf der eine Giraffe zu sehen ist.
    if(Benutzer!!.get("ElefantoderGiraffe") == "Giraffe") {
        goto(GiraffeGUI)
        }
    else {
        val default_gui = HostedGUI("My Default GUI")
        default_gui.write("Hallo du hast dich also für keines der beiden Tiere entscheiden, wie schade.")
        }
    }
}

var ElefantGUI: State = state(Parent) {
    onEntry {
        //Zunächst wird eine Variable gesetzt, die dann mit der Methode HostedGUI definiert wird. HostedGUI besteht aus
        //drei Variabeln. name --> beliebig setzen, path--> Der relative Pfad zu dem Package in dem die GUI definiert ist.
        //port --> beliebig definierbar mit Zahlen, wichtig um die GUI später manuell im Browser aufrufen zu können.
        val GUIElefant: HostedGUI = HostedGUI("GUIElefant", "assets/webTemplates/Elefant", 54231)
        GUIElefant.write("Hallo hier siehst du einen Elefanten")
        delay(5000)
        goto(Idle)
    }
    }


var GiraffeGUI: State = state(Parent) {
    onEntry {
        val GUIGiraffe: HostedGUI = HostedGUI("GUIGiraffe", "assets/webTemplates/Giraffe", 54231)
        GUIGiraffe.write("Hallo hier siehst du eine Giraffe")
        delay(10000)
        goto(Idle)
    }
}







