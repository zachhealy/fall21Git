# Program header
# lab13pt2.s
# Shows how to create a funtion call

.data
    arr: .word 1, 2, 3, 4, 5, 6, 7, 10

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
        lw $s3, 0($s0)
        blt $t1, $s3, loop2

        add $t0, $t0, 1 #counter
        add $s0, $s0, 4
        blt $t0, $s1, loop

    loop2:
        move $t1, $s3

        add $t0, $t0, 1 #counter
        add $s0, $s0, 4
        blt $t0, $s1, loop
    

    jr $ra