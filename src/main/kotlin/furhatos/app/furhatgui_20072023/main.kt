package furhatos.app.furhatgui_20072023

import furhatos.app.furhatgui_20072023.flow.Init
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class Furhatgui_20072023Skill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
