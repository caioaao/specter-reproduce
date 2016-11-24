(ns specter-reproduce.other-ns
  (:require [com.rpl.specter :refer [STAY FIRST ALL] :as sp]))

(sp/declarepath nested-vector-walker)
(sp/providepath nested-vector-walker
                (sp/if-path vector? (sp/stay-then-continue (sp/view rest) ALL nested-vector-walker)))

