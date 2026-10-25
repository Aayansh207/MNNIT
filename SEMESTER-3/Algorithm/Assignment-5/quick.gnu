set terminal pngcairo size 1200,800 enhanced font "Arial,12"
set output "quick_sort_worst_average.png"

set datafile commentschars "#"

set title "Quick Sort: Worst Case vs Average Case"
set xlabel "Input Size (n)"
set ylabel "Execution Time (seconds)"

set grid
set key top left

set style line 1 linewidth 2 pointtype 7 pointsize 1
set style line 2 linewidth 2 pointtype 5 pointsize 1

plot "quick.dat" using 1:2 with linespoints linestyle 1 title "Worst Case O(n^2)", \
     "quick.dat" using 1:3 with linespoints linestyle 2 title "Average Case O(n log n)"