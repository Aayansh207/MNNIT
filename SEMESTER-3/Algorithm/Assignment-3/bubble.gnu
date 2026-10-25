set terminal png
set output "bubble_graph.png"

set title "Bubble Sort Analysis"
set xlabel "Input Size (n)"
set ylabel "Time (seconds)"

set grid
set key left top

plot "bubble.dat" using 1:2 with linespoints title "Best Case", \
     "bubble.dat" using 1:3 with linespoints title "Worst Case", \
     "bubble.dat" using 1:4 with linespoints title "Average Case"
