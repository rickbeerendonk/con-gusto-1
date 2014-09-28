(ns con-gusto-1.core
  (:gen-class)
  (:use [con-gusto-1.words :only (chapter)])
  (:use [clansi.core :only (style)]))

(defn ask-command-line [word]
  (do
    (println)
    (println (:nl word))
    (let [translation (read-line)]
      (if (= translation (:es word))
        true
        (println (style (:es word) :red)))
    )))

(defn ask-words [words ask]
  (if (not-empty words)
      (if
        (ask (first words))
        (ask-words (next words) ask)
        (ask-words (shuffle words) ask)))
  )

(defn -main [& args]
  (println (str "Kies een hoofdstuk " (keys chapter) ":"))
  (def chapter-no (Integer. (read-line)))
  (def words (shuffle (get chapter chapter-no)))
  (ask-words words ask-command-line)
  )
