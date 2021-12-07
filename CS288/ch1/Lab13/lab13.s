# Program header
# lab13.s

.data
    called:   .asciiz "You called a function."

# code section
.text
.globl main

main:

    # Set the values for $a0 and $s1
    li $s0, 4
    li $s1, 5

    jal func

    li $v0, 10
    syscall

func:
    li $t0, 0
    lw $a2, called
    loop:
        li $v0, 4
        la $a0, called
        syscall

        add $t0, $t0, 1
        blt $t0, $s0, loop

    add $s1, $s1, $s1
    li $v0, 1
    move $a0, $s1
    syscall
    
    jr $ra

