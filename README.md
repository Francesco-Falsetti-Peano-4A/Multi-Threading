# Multi-Threading
Con l'uso di due classi che estendevano un thread ognuno, abbiamo riscontrato che mandandoli in output tramite dei for,i messaggi non erano ordinati a seconda della loro classe di appartenenza ma erano mischiati tra di loro senza logica.
Questo perchè è stato utilizzato solo lo start(), senza l'utilizzo di interrupt() o join().
