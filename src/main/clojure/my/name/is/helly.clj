(ns
  ^{:author "helly"}
  my.name.is.helly
  (:gen-class
    :name my.name.is.Helly
    :methods [[hello [String] String]]))

(defn i-am-helly []
  "i am helly")

(defn -hello [this name]
      (str "Hello " name ))

(defn -toString [this]
  (str "My Name is " "Helly"))

