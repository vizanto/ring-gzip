(defproject bk/ring-gzip "0.1.1"
  :description "Middleware that compresses repsonses with gzip for supported
               user-agents."
  :url "https://github.com/bertrandk/ring-gzip"
  :license {:name "MIT-style license (see LICENSE for details)."}
  :global-vars {*warn-on-reflection* true}
  :profiles {:test {:resource-paths ["test"]}}
  :pom-plugins [[com.theoryinpractise/clojure-maven-plugin "1.3.23"
                 {:extensions "true"
                  :executions ([:execution
                                [:id "clojure-compile"]
                                [:phase "compile"]
                                [:configuration
                                 [:temporaryOutputDirectory "true"]
                                 [:sourceDirectories [:sourceDirectory "src"]]]
                                [:goals [:goal "compile"]]]
                                 [:execution
                                  [:id "clojure-test"]
                                  [:phase "test"]
                                  [:goals [:goal "test"]]])}]]
  :dependencies [[org.clojure/clojure "1.5.1"]])
