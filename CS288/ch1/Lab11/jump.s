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

# code section
.text
.globl main

main:

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


################ IF - ELSE ##################
    li $s0, 1       # Load the value 1 into $s0

    beq $s0, $zero, if  # If $s0 == 0, jump to 'if'
    j else              # Else jump to 'else'

if:
    # Print "IF!"
    li $v0, 4           # Syscall to print string
    la $a0, strIF       # Load string
    syscall             # Print   
    
    j fi                # Jump to end of if-else (fi)

else:
    # Print "ELSE!"
    li $v0, 4           # Syscall to print string
    la $a0, srtELSE     # Load string
    syscall             # Print   
    
    j fi                # Jump to end of if-else (fi)
fi: #END if statment


############## FUNCTION #################

    la $a0, strFunc     # Load string that needs printed into $a0
    jal print           # Jump to the print function, and store current line address into $ra (the static register for return addresses)

    li $v0, 10      # Load the syscall value for exiting the program
    syscall         # Call the system to exit the program
############# END OF MAIN ###############


# Function that prints a string representation of the value stored in $a0
#!! Modifies the value of $v0
print:
    li $v0, 4       # Syscall to print string
    syscall         # Print the string
    j $ra           # Jump back to the return address