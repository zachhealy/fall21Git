# Program header
# lab13pt2.s
# Shows how to create a funtion call

.data
    arr: .word 1, 2, 3, 9, 5, 6, 7, 8

# code section
.text
.globl main

main:

    # Set the values for $s0 and $s1
    la $s0, arr
    li $s1, 8

    jal func

    #print out sum
    li $v0, 1
    move $a0, $t1
    syscall

    li $v0, 10
    syscall

func:
    li $t0, 0 #counter
    li $t1, 0 #max value
    loop:
        blt $t1, $s0, loop2

        add $t0, $t0, 1 #counter
        blt $t0, $s1, loop

    loop2:
        move $t1, $s0

        add $t0, $t0, 1 #counter
        blt $t0, $s1, loop
    

    jr $ra