# Multi-Threading
Concetti base:
Multithreading: È l'azione che compie il processore nell'eseguire più thread comtemporaneamente.
Il tempo di esecuzione e la complessità temporale del programma si riduce.
In pratica, il programma termina l'elaborazione dati in minore tempo.
Prima parte:
(Classe Hi e Hello).
Abbiamo creato due classi che estendevano due thread ciascuno e dopo aver creato il metodo run, uno per ogni classe, abbiamo istanziato due oggetti, uno di tipo Hi e l'altro di tipo Hello.
Fatto ciò abbiamo utilizzato lo start() per ognuno dei due oggetti in modo tale da avviare i due thread.
Infine abbiamo riscontrato che i due thread mandavano in output dei messaggi in modo "non logico", questo perchè entrambi gli oggetti avviavano il metodo run() in contemporanea e quindi si visualizzava un insieme di messaggi non in ordine.
Questo perchè è stato utilizzato solo lo start(), senza l'utilizzo di interrupt() o join() e perchè i tempi di compilazione dei thread sono diversi tra di loro.

Esempio 1:
Hello
Hello
Hello
Hi
Hello
Hi
Hello
Hello
Hello
Hello
Hi
Hi
Hi
Hi
Hi
Hi

Esempio 2:
Hello
Hello
Hello
Hello
Hello
Hi
Hello
Hello
Hi
Hi
Hi
Hi
Hello
Hi
Hi
Hi

Esempio 3:
Hello
Hello
Hello
Hi
Hello
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hello
Hello
Hello
Hello

Seconda parte:
(Classe Say).
Abbiamo utilizzato una classe di tipo Say che aveva come attributo la Stringa che doveva poi essere visualizzata in output.
Successivamente abbiamo creato il costruttore per far in modo di poter usare l'attributo all'interno della classe.
Infine abbiamo creato il metodo run che con un for faceva stampare l'attributo della classe.
Nel main abbiamo istanziato due oggetti, entrambi di tipo Say, per poi chiamare per ambedue lo start.
Il risultato era un alternarsi di messaggi dei due oggetti dello stesso tipo.
Questo perchè è stato utilizzato solo lo start(), senza l'utilizzo di interrupt() o join() e perchè i tempi di compilazione dei thread sono diversi tra di loro, pur essendo dello stesso tipo.

Esempio 1:
ciao
ciao
ciao
ciao
ciao
ciao2
ciao2
ciao2
ciao2
ciao2
ciao2
ciao2
ciao2
ciao1
ciao1
ciao1
ciao1
ciao1
ciao1
ciao1
ciao1
ciao
ciao
ciao

Esempio 2:
ciao2
ciao
ciao
ciao
ciao
ciao
ciao
ciao
ciao
ciao1
ciao1
ciao1
ciao1
ciao1
ciao1
ciao1
ciao1
ciao2
ciao2
ciao2
ciao2
ciao2
ciao2
ciao2
