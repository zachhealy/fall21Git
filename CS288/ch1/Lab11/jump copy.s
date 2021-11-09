# Program header
# jump.s
# Shows how to jump and create loops

# data secion
.data

    # Create .asciiz (ASCII strings) for a few messages
    strLoop: .asciiz "I'm stuck in a loop!\n"
    strIF: .asciiz "IF!\n"
    srtELSE: .asciiz "ELSE!\n"
    strFunc: .asciiz "You called a function!\n"
    arr:    .word 13, 15, 17, 19, 22, 43, 45, 87, 99, 199
# code section
.text
.globl main

main:
    la $s1, arr
    lw $a0, 8($s1)

    li $v0, 1
    syscall

################# LOOPS ###################
    li $s0, 10      # Load the value of 10 into $s0

loop:
    
    # Print the string
    li $v0, 4           # Syscall to print string
    la $a0, strLoop     # Load string
    syscall             # Print

    # Keep looping if s0 > 10
    addi $s0, $s0, -1       # Subtract 1 from s0 (using addition)
    bne $s0, $zero, loop    # Jump if s0 != 0
    # $zero is a static register that just holds the value 0
#END loop



    li $v0, 10      # Load the syscall value for exiting the program
    syscall         # Call the system to exit the program
############# END OF MAIN ###############
