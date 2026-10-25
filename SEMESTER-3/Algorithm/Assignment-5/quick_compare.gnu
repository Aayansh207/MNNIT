set terminal pngcairo size 1200,800 enhanced font "Arial,12"
set output "quick_vs_randomized_worst.png"

set datafile commentschars "#"

set title "Worst-Case Input: Quick Sort vs Randomised Quick Sort"
set xlabel "Input Size (n)"
set ylabel "Execution Time (seconds)"

set grid
set key top left

set style line 1 linewidth 2 pointtype 7 pointsize 1
set style line 2 linewidth 2 pointtype 5 pointsize 1

plot "quick_compare.dat" using 1:2 with linespoints linestyle 1 title "Quick Sort O(n^2)", \
     "quick_compare.dat" using 1:3 with linespoints linestyle 2 title "Randomised Quick Sort Expected O(n log n)"