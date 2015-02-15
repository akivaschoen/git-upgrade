(defproject git-upgrade "0.5.0a"
  :description "Searches through a set of directories and updates git repos."
  :url "http://github.com/akivaschoen/git-upgrade"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha5"]
                 [clj-time "0.9.0"]]
  :main ^:skip-aot git-upgrade.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all} 
             :dev {:source-paths ["dev"]}})
