(ns cljs-http.util
  (:require [goog.userAgent :as agent]))

(defn user-agent
  "Returns the user agent."
  [] (agent/getUserAgentString))

(defn android?
  "Returns true if the user agent is an Android client."
  [] (re-matches #"(?i).*android.*" (user-agent)))

(defn url-encode
  "Returns an UTF-8 URL encoded version of the given string."
  [unencoded] (js/escape unencoded))