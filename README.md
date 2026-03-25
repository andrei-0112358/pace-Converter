# Geschwindigkeitsrechner fürs Tempo (Java)

## Beschreibung
Dieses Projekt ist ein einfaches Programm zur Umrechnung von Lauftempo (Pace) zwischen Minuten pro Kilometern und Minuten pro Meilen. Der Benutzer kann seinen Pace im Format mm:ss eingeben und in die jeweils andere Einheit umrechnen lassen.

## Regeln
Der Benutzer muss wählen, ob er von Kilometern zu Meilen oder von Meilen zu Kilometern umrechnen möchte. Die Eingabe des Pace erfolgt im Format mm:ss. Sekunden müssen zwischen 0 und 59 liegen.

## Funktionsweise
Das Programm fragt zunächst nach der gewünschten Umrechnung. Danach wird der Pace eingelesen und in Sekunden umgerechnet. Anschließend erfolgt die Umrechnung zwischen Kilometern und Meilen mithilfe des Faktors 1.60934. Das Ergebnis wird wieder im Format mm:ss ausgegeben.

## Ablauf
Benutzer wählt M oder K. Benutzer gibt Pace im Format mm:ss ein. Programm berechnet den neuen Pace. Ergebnis wird im Format mm:ss ausgegeben.

## Ausführen
javac PaceConverter.java java PaceConverter

## Voraussetzungen
Java JDK 8 oder höher


