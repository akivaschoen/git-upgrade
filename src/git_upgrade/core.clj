(ns git-upgrade.core
  (:require [clojure.java.io :as io] 
            [clojure.java.shell :refer :all]
            [clojure.string :as str :refer [join split-lines]]
            [clj-time.local :as l])
  (:gen-class))

(def target-dir "/Users/akiva/Code/public/")
(def logfile "git-upgrade.log")

(defn create-timestamp
  []
  (let [timestamp (l/format-local-time (l/local-now) :rfc822)
        ts-string (str "Upgrade on " timestamp)
        underline (str/join (repeat (count ts-string) "-"))]
    (str ts-string "\n" underline "\n")))

(defn update-log
  [text]
  (spit logfile text :append true))

(defn get-directories
  [target-dir]
  (let [result (sh "ls" target-dir)]
    (str/split-lines (:out result))))

(defn -main
  [& args]
  (io/delete-file logfile)
  (update-log (create-timestamp))
  (doseq [dir (get-directories target-dir)]
    (let [result (sh "git" "pull" :dir (str target-dir dir))
          log-entry (str "Checking " dir "... " 
                 (if-not (empty? (:err result))
                   (str "\n" (:err result) "\n")
                   (:out result)))]
      (print log-entry)
      (update-log log-entry)))
  (shutdown-agents))
