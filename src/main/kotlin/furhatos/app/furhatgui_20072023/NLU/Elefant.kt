package furhatos.app.furhatgui_20072023.NLU
import furhatos.nlu.Intent


class Elefant : Intent() {
    override fun getExamples(lang: furhatos.util.Language): List<String> {
        return listOf(
            "Elefant",
            "Ele",
            "fand",
            "Pfand",
            "Fun",
            "Elefanten",
            "Elephants"
        )
    }
}



