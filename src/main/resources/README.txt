System nawigacyjny Borsuk co prawda zosta� poprawiony, ale wdro�enie zaj�oby tyle czasu, �e piloci porzucili ten pomys�. Stwierdzili, �e b�d� si� kierowa� na to du�e czerwone i tym cudownym sposobem Badger 2 znalaz� si� prawie u celu.
Z ma�ych okien statku ju� wida� habitaty. W ka�dym z nich znajduje si� kilkadziesi�t minimiast z lokacj� dla ka�dego Ziemianina. W samym �rodku tej wielkiej struktury osadzone jest centrum dowodzenia, a w nim kilka t�gich umys��w zastanawia si� nad rozwi�zaniem kolejnego problemu.
Ludzie staj� si� bardzo depresyjni przy niskim nas�onecznieniu, a o to na Marsie nietrudno. In�ynierowie zastanawiaj� si� nad rozmieszczeniem w cz�ci miast luster modyfikuj�cych (zwi�kszaj�cych lub zmniejszaj�cych) stopie� nas�onecznienia w pojedynczym habitacie. 
Mechanizmy te wsp�graj� ze sob�, wi�c wysoki stopie� nas�onecznienia uzyskany przez postawienie lustra w jednym miasteczku mo�e zosta� obni�ony przez ustawienie lustra w inny miasteczku.
Stopie� nas�onecznienia wyra�any jest liczb� ca�kowit�. Jego ujemna warto�� oznacza niedostateczne nas�onecznienie, za� dodatnia warto�� - zbyt du�e nas�onecznienie i mo�liwe oparzenia s�oneczne. Warto�� 0 oznacza idealne nas�onecznienie.
Koszt zamontowania mechanizmu te� nie jest bez znaczenia.
Wej�cie:

Na wej�ciu program otrzyma liczb� ca�kowita n, kt�ra oznacza w ilu habitatach nale�y rozmie�ci� lustra.
Dalej znajduje si� n zestaw�w danych, z kt�rych ka�dy sk�ada si� z liczby naturalnej m, odnosz�cej si� do liczby minimiast w pojedynczym habitacie oraz m linii, stanowi�cych opis kolejnych miast. Opis miasta sk�ada si� z dw�ch liczb s i c, gdzie s jest liczb� ca�kowit� informuj�c� o tym, jak zmieni si� stopie� nas�onecznienia w habitacie po postawieniu lustra w danym mie�cie, a c jest kosztem ustawienia takiego lustra.
1<=n<=10
1<=m<=100
-10000<=s<=10000
1<=c<=10000
Wyj�cie:

Na wyj�ciu dla ka�dego habitatu program ma wypisa� minimalny koszt postawienia luster, przy za�o�eniu, �e ustawienie ich zmienia stopie� nas�onecznienia na idealny. Je�li nie istnieje takie ustawienie program ma wypisa� s�owo "DEPRESJA".
Przyk�ad:

Wej�cie: 
2
4
-10 2
3 3
10 9
7 3
4
1 7
3 3
-2 6
-5 2
Wyj�cie:
8
DEPRESJA
