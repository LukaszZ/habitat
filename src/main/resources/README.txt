System nawigacyjny Borsuk co prawda zosta³ poprawiony, ale wdro¿enie zajê³oby tyle czasu, ¿e piloci porzucili ten pomys³. Stwierdzili, ¿e bêd¹ siê kierowaæ na to du¿e czerwone i tym cudownym sposobem Badger 2 znalaz³ siê prawie u celu.
Z ma³ych okien statku ju¿ widaæ habitaty. W ka¿dym z nich znajduje siê kilkadziesi¹t minimiast z lokacj¹ dla ka¿dego Ziemianina. W samym œrodku tej wielkiej struktury osadzone jest centrum dowodzenia, a w nim kilka têgich umys³ów zastanawia siê nad rozwi¹zaniem kolejnego problemu.
Ludzie staj¹ siê bardzo depresyjni przy niskim nas³onecznieniu, a o to na Marsie nietrudno. In¿ynierowie zastanawiaj¹ siê nad rozmieszczeniem w czêœci miast luster modyfikuj¹cych (zwiêkszaj¹cych lub zmniejszaj¹cych) stopieñ nas³onecznienia w pojedynczym habitacie. 
Mechanizmy te wspó³graj¹ ze sob¹, wiêc wysoki stopieñ nas³onecznienia uzyskany przez postawienie lustra w jednym miasteczku mo¿e zostaæ obni¿ony przez ustawienie lustra w inny miasteczku.
Stopieñ nas³onecznienia wyra¿any jest liczb¹ ca³kowit¹. Jego ujemna wartoœæ oznacza niedostateczne nas³onecznienie, zaœ dodatnia wartoœæ - zbyt du¿e nas³onecznienie i mo¿liwe oparzenia s³oneczne. Wartoœæ 0 oznacza idealne nas³onecznienie.
Koszt zamontowania mechanizmu te¿ nie jest bez znaczenia.
Wejœcie:

Na wejœciu program otrzyma liczbê ca³kowita n, która oznacza w ilu habitatach nale¿y rozmieœciæ lustra.
Dalej znajduje siê n zestawów danych, z których ka¿dy sk³ada siê z liczby naturalnej m, odnosz¹cej siê do liczby minimiast w pojedynczym habitacie oraz m linii, stanowi¹cych opis kolejnych miast. Opis miasta sk³ada siê z dwóch liczb s i c, gdzie s jest liczb¹ ca³kowit¹ informuj¹c¹ o tym, jak zmieni siê stopieñ nas³onecznienia w habitacie po postawieniu lustra w danym mieœcie, a c jest kosztem ustawienia takiego lustra.
1<=n<=10
1<=m<=100
-10000<=s<=10000
1<=c<=10000
Wyjœcie:

Na wyjœciu dla ka¿dego habitatu program ma wypisaæ minimalny koszt postawienia luster, przy za³o¿eniu, ¿e ustawienie ich zmienia stopieñ nas³onecznienia na idealny. Jeœli nie istnieje takie ustawienie program ma wypisaæ s³owo "DEPRESJA".
Przyk³ad:

Wejœcie: 
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
Wyjœcie:
8
DEPRESJA
