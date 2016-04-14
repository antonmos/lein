;see tools.namespace is to use improved refresh. see http://stackoverflow.com/a/25979645/2748570
{:user {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                       [potemkin "0.4.3"]
        :plugins [[cider/cider-nrepl "0.8.2"]
                  [venantius/ultra "0.3.3"]]
        :ultra {:color-scheme :solarized_dark}
        :source-paths [#=(eval (str (System/getProperty "user.home") "/.lein/src"))]
        :repl-options
          {:init-ns user
           :init
           (do
           (set! *print-length* 100))}}}
