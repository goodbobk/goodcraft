for r in 0 5 a f ; do for g in 0 5 a f ; do for b in 0 5 a f ; do x=$r$g$b ; cat ColorBlock_.java.template  | sed -e "s/TMPL/$x/g" > ColorBlock_$x.java ; done;done;done
