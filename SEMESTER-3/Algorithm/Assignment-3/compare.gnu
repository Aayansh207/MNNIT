set terminal png
set output "compare_graph.png"

set title "Standard vs Optimized Bubble Sort"
set xlabel "Input Size (n)"
set ylabel "Time (seconds)"

set grid
set key left top

plot "compare.dat" using 1:2 with linespoints title "Standard Bubble Sort", \
     "compare.dat" using 1:3 with linespoints title "Optimized Bubble Sort"
