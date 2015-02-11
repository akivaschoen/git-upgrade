(defproject git-upgrade "0.1.0-SNAPSHOT"
  :description "Searches through a set of directories and updates git repos."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha5"]]
  :main ^:skip-aot git-upgrade.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
