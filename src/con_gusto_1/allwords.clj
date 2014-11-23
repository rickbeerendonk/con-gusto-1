(ns con-gusto.words)

; verbs
; http://www.123teachme.com/spanish_verb_conjugation/abrir
; http://de.wiktionary.org/wiki/abrir_(Konjugation)

(def vocabulary
  [
   {:level "A1" :chapter "1" :es "a" :nl "naar, aan"}
   {:level "A2" :chapter "10" :es "a favor (de)" :nl "voor"}
   {:level "A2" :chapter "5" :es "a finales de" :nl "eind ..."}
   {:level "A1" :chapter "6" :es "a la derecha (de)" :nl "rechts (van)"}
   {:level "A1" :chapter "6" :es "a la izquierda (de)" :nl "links (van)"}
   {:level "A1" :chapter "5" :es "a la plancha" :nl "gegrild"}
   {:level "A1" :chapter "10" :es "a la vez" :nl "tegelijkertijd"}
   {:level "A1" :chapter "5" :es "a las ..." :nl "om ... uur"}
   {:level "A2" :chapter "1" :es "a los ... años" :nl "op ... jarige leeftijd"}
   {:level "A2" :chapter "2" :es "a menudo" :nl "vaak"}
   {:level "A1" :chapter "7" :es "A mí sí." :nl "Mij wel. / Ik wel."}
   {:level "A1" :chapter "11" :es "a partir de ..." :nl "vanaf ..."}
   {:level "A2" :chapter "9" :es "a pesar de todo" :nl "ondanks alles"}
   {:level "A1" :chapter "6" :es "a pie" :nl "te voet"}
   {:level "A1" :chapter "5" :es "¿A qué hora?" :nl "Hoe laat?"}
   {:level "A1" :chapter "7" :es "a ti" :nl "jou"}
   {:level "A2" :chapter "9" :es "a tiempo" :nl "op tijd"}
   {:level "A1" :chapter "7" :es "a través de" :nl "(dwars) door"}
   {:level "A1" :chapter "7" :es "a veces" :nl "soms"}
   {:level "A1" :chapter "5" :es "a ver" :nl "even kijken"}
   {:level "A1" :chapter "7" :es "abajo" :nl ["beneden" "hieronder"]}
   {:level "A2" :chapter "11" :sex "m" :es "abogado" :nl "advocaat"}
   {:level "A2" :chapter "11" :sex "f" :es "abogada" :nl "advocate"}
   {:level "A1" :chapter "7" :sex "m" :es "abrazo" :nl ["omhelzing" "omarming"]}
   {:level "A1" :chapter "3" :sex "m" :es "abril" :nl "april"}
   {:level "A1" :chapter "5" :es "abrir" :nl "openen"
    :ww
    {
     :indicativo
     {
      :presente ["abro" "abres" "abre" "abrimos" "abrís" "abren"]
      :imperfecto ["abría" "abrías" "abría" "abríamos" "abríais" "abrían"]
      :indefinido ["abrí" "abriste" "abrió" "abrimos" "abristeis" "abrieron"]
      :futuro ["abriré" "abrirás" "abrirá" "abriremos" "abriréis" "abrirán"]
      :conditional ["abriría" "abrirías" "abriría" "abriríamos" "abriríais" "abrirían"]
     }
     :imperativo
     {
      :afirmativo ["abre" "abra" "abramos" "abrid" "abran"]
      :negativo ["no abras" "no abra" "no abramos" "no abráis" "no abran"]
     }
     :gerundio "abriendo"
     :participio "abierto"
    }}
   {:level "A2" :chapter "8" :es "absoluto/-a" :nl "absoluut"}
   {:level "A1" :chapter "3" :sex "m" :es "abuelo" :nl "opa"}
   {:level "A1" :chapter "3" :sex "f" :es "abuela" :nl "oma"}
   {:level "A2" :chapter "10" :es "aburrido/-a" :nl "saai"}
   {:level "A1" :chapter "9" :es "aburrirse" :nl "zich vervelen" :ww {}}
   {:level "A1" :chapter "9" :sex "f" :es "acción" :nl ["handeling" "actie"]}
   {:level "A1" :chapter "1" :sex "m" :es "aceite" :nl "olie"}
   {:level "A1" :chapter "7" :es "aceptar" :nl ["aanvaarden" "aannemen" "accepteren"] :ww {}}
   {:level "A2" :chapter "5" :es "acompañar" :nl ["begeleiden" "volgen"] :ww {}}
   {:level "A1" :chapter "3" :sex "m" :es "acontecimiento" :nl "gebeurtenis"}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
   {:level "A1" :chapter "" :sex "" :es "" :nl ""}
  ])
