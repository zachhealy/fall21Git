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
    la $t0, arr
    lw $t1, length
    li $t2, 0 #Sum
    li $t3, 0 #i
    Loop:
        lw $t4,  ($t0)
        add $t2, $t2, $t4

        add $t3, $t3, 1
        add $t0, $t0, 4
        blt $t3, $t1, Loop
        sw $t2, sum

    div $t5, $t2, $t1
    sw $t5, average
    mfhi $s1

    li $v0, 1
    move $a0, $t5
    syscall

    li $v0, 10
    syscall
    
    
