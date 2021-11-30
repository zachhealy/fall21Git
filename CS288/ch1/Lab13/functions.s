# Program header
# funtions.s
# Shows how to create a funtion call

# data secion
.data
    # We don't have any data this time!

# code section
.text
.globl main

main:

    # Set the values for $a0 and $a1
    li $a0, 3
    li $a1, 6

    # Call the function
    jal func

    # Print the value in $v0
    move $a0, $v0
    li $v0, 1
    syscall

    # End the program
    li $v0, 10
    syscall

# Add two numbers together and print the first one ($a0)
# Arguments:
# $a0 - the first addened (should be an integer)
# $a1 - the second addened (should be an integer)
# Reigsters used:
# $v0 - function call to print integer
# Output
# $v0 - the sum of $a0 and $a1 (integer)
func:

    # Print $a0
    li $v0, 1       # Load syscall value to print integer
    # We don't have to move anything to $a0 because
    #   the value we want is already there
    syscall         # Print integer

    li $v0, 0           # Reset the value in $v0
    add $v0, $a0, $a1   # $v0 = $a0 + $a1
    jr $ra              # Jump back to stored return address