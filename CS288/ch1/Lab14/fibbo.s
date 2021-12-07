# Program header
# fibbo.s

.data
    called:   .asciiz "You called a function."

# code section
.text
.globl main

main:
    # Set the values for $a0 and $s1
    li $s0, 1
    li $s1, 1
    li $s2, 20

    jal func

    li $v0, 10
    syscall

func:
    li $t0, 0

    la $a0, $s0
    li $v0, 2
    syscall

    la $a0, $s1
    li $v0, 2
    syscall

    loop:
        add $s3, $s0, $s1

        la $a0, $s3
        li $v0, 2
        syscall

        move $s0, $s1
        move $s1, $s3

        add $t0, $t0, 1
        blt $t0, $s2, loop

    jr $ra

