(ns poopup.lol)

(defn poopup
  "Display an image in a separate JVM. image-path is always stringified (handy if you want to pass something like a java.net.URL)"
  [image-path]
  (let [process-builder (ProcessBuilder.
                         ["clojure" "-M" "-m" "poopup.main" (str image-path)])]
    (.inheritIO process-builder)
    (.start process-builder)))
