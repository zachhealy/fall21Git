# Program header
# lab13pt2.s
# Shows how to create a funtion call

.data
    arr: .word 4, 5, 7, 1, 19, 2, 6

# code section
.text
.globl main

main:

    # Set the values for $t2 and $t3
    la $t2, arr
    li $t3, 7

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
        lw $t4, 0($t2)
        slt  $t5, $t1, $t4
        bne  $t5, $zero, loop2 
        #blt $t1, $t4, loop2

        add $t0, $t0, 1 #counter
        add $t2, $t2, 4
        blt $t0, $t3, loop

    loop2:
        move $t1, $t4

        add $t0, $t0, 1 #counter
        add $t2, $t2, 4
        blt $t0, $t3, loop
    

    jr $ra