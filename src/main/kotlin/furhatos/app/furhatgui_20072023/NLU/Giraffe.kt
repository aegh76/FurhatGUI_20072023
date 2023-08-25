package furhatos.app.furhatgui_20072023.NLU
import furhatos.nlu.Intent


class Giraffe : Intent() {
    override fun getExamples(lang: furhatos.util.Language): List<String> {
        return listOf(
            "Giraffe",
            "Affe",
            "Gir",
            "Giraffe",
            "Fee"
        )
    }
}



