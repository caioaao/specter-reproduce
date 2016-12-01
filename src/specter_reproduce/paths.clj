(ns specter-reproduce.paths
  (:require [com.rpl.specter :as sp]))

(sp/declarepath map-walker)
(sp/providepath map-walker
                 [(sp/walker map?)
                  (sp/continue-then-stay sp/MAP-VALS map-walker)])
