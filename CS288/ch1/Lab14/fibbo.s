# Program header
# fibbo.s

.data
    nLine:   .asciiz "\n"

# code section
.text
.globl main

main:
    #Set up registers for the base numbers as well as the amount we are going to need
    li $s0, 1
    li $s1, 1
    li $s2, 19
    la $s4, nLine

    #call function
    jal func

    #end program
    li $v0, 10
    syscall

func:
    #counter until we reach 20 prints
    li $t0, 0

    #Print first number
    la $a0, 1
    li $v0, 1
    syscall
    add $t0, $t0, 1

    #print out new line
    move $a0, $s4
    li $v0, 4
    syscall

    #print second number
    la $a0, 1
    li $v0, 1
    syscall
    add $t0, $t0, 1

    #print out new line
    move $a0, $s4
    li $v0, 4
    syscall

    #loop to run through all numbers
    loop:
        #add the numbers to get next number
        add $s3, $s0, $s1

        #print out new number
        move $a0, $s3
        li $v0, 1
        syscall

        #move the past numbers to the new numbers
        move $s0, $s1
        move $s1, $a0

        #print out new line
        move $a0, $s4
        li $v0, 4
        syscall

        #add to iterator and check if it is still in range
        add $t0, $t0, 1
        blt $t0, $s2, loop

    jr $ra

