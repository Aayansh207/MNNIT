set title "Insertion Sort Time Analysis"
set xlabel "Input Size (n)"
set ylabel "Time (seconds)"

set grid
set key left top

set terminal png
set output "insertion_sort_analysis.png"

plot "insertion.dat" using 1:2 with linespoints lw 2 pt 7 title "Best Case", \
     "insertion.dat" using 1:3 with linespoints lw 2 pt 7 title "Worst Case", \
     "insertion.dat" using 1:4 with linespoints lw 2 pt 7 title "Average Case"
