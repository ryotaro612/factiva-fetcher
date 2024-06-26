(ns factiva-fetcher.news
  (:require [factiva-fetcher.news :as news]
            [clojure.string :as string]))

(def xf (map (fn [{{:keys [id title release-date medium]} :meta {:keys [paragraphs]} :news}]
               [id release-date medium (str "https://www.ub-speeda.com/article/" id) title (string/join " " (map :value paragraphs))])))
