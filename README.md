# Skill
Skill der zeigt, wie man die Furhat GUI hosten kann und Bilder oder Text auf dieser anzeigen lassen kann.

## Description
Der Skill zeigt zwei verschiedene Möglichkeiten Bilder auf der Furhat-GUI anzeigen zu lassen. Dabei wird abhängig 
von dem was der User sagt entweder ein Affe oder eine Giraffe auf dem Bildschirm angezeigt. 

Für die Unterscheidung was angezeigt wird sind zwei Möglichkeiten vorhanden. Einmal auf Basis von Intents. 
Das heißt, dass entweder ein Affe oder eine Giraffe angezeigt wird auf der Grundlage welches Intent Furhat erkennt. 

Die zweite Möglichkeit ist es Benutzerdaten in sogenannten Fields zu speichern und auf Basis des Wertes der in dem 
Field steht, welches der Variable Benutzer zugeordnet ist dann das jeweilige Bild anzeigen zu lassen. 

Es scheint zwar, als wären die beiden Methoden sehr ähnlich, sind sie aber nicht. Nicht immer kann oder möchte man 
Bilder auf Basis von Gesagtem anzeigen. Fields sind eine Hilfe, wenn man Gesagtes auf Basis von Werten, die nichts mit 
dem Dialog zu tun haben anzeigen möchte. Beispielsweise aufgrund einer Patientennummer, die in einer Excel hinterlegt 
ist oder auf Basis eines Datums oder Ähnlichem. Um zu verstehen wie das funktioniert muss sich der Entwickler die 
ShowIMGsonBasisofUserData1.kt und die ShowIMGsonBasisofUserData2.kt anschauen. 

## ACHTUNG
Folgende Limitation: Pro laufenden Skill kann immer nur eine GUI gehosted werden, das heißt, sobald ein user sich für 
eine der beiden GUIs entschieden hat, kann die GUI nicht mehr geändert werden. Das Bild auch nicht. 

Um zu verstehen wie man die GUI von Furhat definieren, programmieren und regeln kann empfiehlt sich die GITHub 
Dokumentation von FurhatRobotics. Die relevanten Skills sind hier: FurGUI (Kommunikation von Furhat an die GUI), FurhatJSGUI (ermöglicht die Kommunikation von der GUI an Furhat):

https://github.com/FurhatRobotics/tutorials/tree/main/FurGUI
https://github.com/FurhatRobotics/FurhatJSGUI

