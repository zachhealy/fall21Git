# Program header
# arrAvg.s
# Performs the average of an array

# data secion
.data
    arr:    .word 13, 15, 17, 19, 22, 43, 45, 87, 99, 199
    sum:    .word 0
    average:    .word 0
    length: .word 10

    strCR:  .asciiz "\n"

# code section
.text
.globl main

main:
    la $a0, arr
    lw $a1, length
    li $a2, 0
    
    
