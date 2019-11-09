# Multi-Threading
Con l'uso di due classi che estendevano un thread ognuno, abbiamo riscontrato che mandandoli in output tramite dei for,i messaggi non erano ordinati a seconda della loro classe di appartenenza ma erano mischiati tra di loro senza logica.
Questo perchè è stato utilizzato solo lo start(), senza l'utilizzo di interrupt() o join().
Questo avviene per colpa dei due Thread, ovvero che hanno tempi di compilazione output differenti.

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
