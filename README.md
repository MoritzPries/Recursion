# Recursion
program to calculate cross sum iterativ and recursiv as well as the weighted cross sum

based on the task:

Recursion
a) Develop in a class Quer an iterative and a recursive class method for the
calculation of the cross sum of a long number.
public static int itQuer( long n){...}
public static int reQuer( long n){...}
b) A generalization are weighted cross sums, where the digits are first calculated with the
values of a periodic number sequence (an) and the results are then added.
are added. The process starts with the unit.
Let the periodically continued sequence be
1; 3; 2; -1; -3; -2; 1; 3; 2; -1; -3; -2; :::
and the number to be tested is 422 625. Then the weighted cross sum is
5x1 + 2x3 + 6x2 - 2x1-2x3-4x2 = 5 + 6 + 12-2 -6 -8 = 7:
Extend your class Quer with the class method
public static int wQuer( long n){...},
which determines the weighted cross sum with the given sequence (an).
Write as main method main a test program, which uses itQuer, reQuer
and wQuer to determine the cross sum of the numbers
77 131 834; 8 876 826; 99 506 204
is calculated. Redirect the results to Quer.out.
Note: To get the nth element at the sequence (an), you can, for example, create a
field of length 6, which you access using n modulo 6.
c) The class method wQuer returns a divisibility rule for the number 7. Formulate and
prove it.
Note: For the proof, use the sum representation for numbers in the position system
to the base 10.
2. error propagation
The implementation of the series expansion for the exponential function is to demonstrate the error propagation,
due to the number representation in the computer.
Note on programming a series expansion:
In order to minimize the number of operations, one calculates a new summand from
the old one and then add it to the sum calculated up to that point. This is repeated
repeated until a new summand is so small that it does not contribute to the sum,
i.e. the sum does not change any more (computer accuracy):
double oldSum, newSum = 1.0, summand = 1.0; int i = 1; // start values
do // series expansion
{
summand *= x / i++; // calculate the new summand
oldSum = newSum; // remember the old sum
newSum += summand; // calculate the new sum
} while( newSum != oldSum); // Termination condition
Provide two class methods for the exponential function in a class Exp:
a) Implement the series expansion of the exponential function in a class method.
public static double myExp(double x){...}
In a test program Exp.java, tabulate the function values f(x) for x 2 [20; 0]
with the step size 0:5 and compare the results of your method with those of the
method double Math.exp(double) of the class java.lang.Math.
b) Error handling: for some x < 0, the result becomes negative. You calculate for the case
x < 0 therefore ejxj and set ex = 1
ejxj . Specify an improved class method
public static double myExpBetter(double x){...}
that handles this case separately using the class method myExp.
Repeat the test.
Create a file Exp.out with the test results by output redirection.
Exp.java (rough structure)
public class Exp
{
public static double myExp(double x){ }
public static double myExpBetter(double x){ }
public static void main(String[] args)
{
for(double x = 0.0; x > -20.0; x-=.5)
{
// Calculate and output the results
// myExp(x), myExpBetter(x), Math.exp(x)
}
}
}

based on the task in german language:

Rekursion
a) Entwickeln Sie in einer Klasse Quer eine iterative und eine rekursive Klassenmethode zur
Berechnung der Quersumme einer long-Zahl.
public static int itQuer( long n){...}
public static int reQuer( long n){...}
b) Eine Verallgemeinerung sind gewichtete Quersummen, bei denen die Ziern erst mit den
Werten einer periodischen Zahlenfolge (an) multipliziert und die Ergebnisse dann addiert
werden. Dabei wird mit dem Einer begonnen.
Sei die periodisch fortgesetzte Folge
1; 3; 2; -1; -3; -2; 1; 3; 2; -1; -3; -2; :::
und die zu prüfende Zahl 422 625. Dann ist die gewichtete Quersumme
5  1 + 2  3 + 6  2 - 2  1 - 2  3 - 4  2 = 5 + 6 + 12 - 2 - 6 - 8 = 7:
Erweitern Sie Ihre Klasse Quer um die Klassenmethode
public static int wQuer( long n){...},
welche die gewichtete Quersumme mit der angegebenen Folge (an) bestimmt.
Schreiben Sie als Hauptmethode main ein Testprogramm, welches mit itQuer, reQuer
und wQuer die Quersumme der Zahlen
77 131 834; 8 876 826; 99 506 204
berechnet. Leiten Sie die Ergebnisse in Quer.out um.
Hinweis: Um das n-te Element an der Folge (an) zu erhalten, können Sie zum Beispiel ein
Feld der Länge 6 anlegen, auf welches Sie mittels n modulo 6 zugreifen.
c) Die Klassenmethode wQuer liefert eine Teilbarkeitsregel für die Zahl 7. Formulieren und
beweisen Sie diese.
Hinweis: Verwenden Sie für den Beweis die Summendarstellung für Zahlen im Positionssystem
zur Basis 10.
2. Fehlerfortpanzung
Das Implementieren der Reihenentwicklung für die Exponentialfunktion soll die Fehlerfortpanzung,
bedingt durch die Zahlendarstellung im Rechner, demonstrieren.
Hinweis zum Programmieren einer Reihenentwicklung:
Um die Anzahl der Operationen zu minimieren, berechnet man einen neuen Summanden aus
dem alten und addiert ihn anschlieÿend zu der bis dahin berechneten Summe. Das wird solange
wiederholt, bis ein neuer Summand so klein ist, dass er keinen Beitrag zur Summenbildung liefert,
d.h. die Summe sich nicht mehr verändert (Rechnergenauigkeit):
double alteSumme, neueSumme = 1.0, summand = 1.0; int i = 1; // Startwerte
do // Reihenentwicklung
{
summand *= x / i++; // Berechnen des neuen Summanden
alteSumme = neueSumme; // Merken der alten Summe
neueSumme += summand; // Berechnen der neuen Summe
} while( neueSumme != alteSumme); // Abbruchbedingung
Stellen Sie in einer Klasse Exp zwei Klassenmethoden für die Exponentialfunktion bereit:
a) Implementieren Sie die Reihenentwicklung der Exponentialfunktion in einer Klassenmethode
public static double myExp(double x){...}
Tabellieren Sie in einem Testprogramm Exp.java die Funktionswerte f(x) für x 2 [􀀀20; 0]
mit der Schrittweite 0:5 und vergleichen Sie die Ergebnisse Ihrer Methode mit denen der
Methode double Math.exp(double) der Klasse java.lang.Math.
b) Fehlerbehandlung: Für einige x < 0 wird das Ergebnis negativ. Man berechnet für den Fall
x < 0 deshalb ejxj und setzt ex = 1
ejxj . Geben Sie eine verbesserte Klassenmethode
public static double myExpBesser(double x){...}
an, die diesen Fall unter Verwendung der Klassenmethode myExp gesondert behandelt.
Wiederholen Sie den Test.
Erzeugen Sie durch Ausgabeumleitung eine Datei Exp.out mit den Testergebnissen.
Exp.java (Grobstruktur)
public class Exp
{
public static double myExp(double x){ }
public static double myExpBesser(double x){ }
public static void main(String[] args)
{
for(double x = 0.0; x > -20.0; x-=.5)
{
// Berechnung und Ausgabe der Ergebnisse
// myExp(x), myExpBesser(x), Math.exp(x)
}
}
}
