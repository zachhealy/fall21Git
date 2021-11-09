# Program header
# arrAvg.s
# Performs the average of an array

# data secion
.data
    arr:    .word 13, 15, 17, 19, 22, 43, 45, 87, 99, 199

# code section
.text
.globl main

main:
    la $s1, arr
    la $s2, 0 #sum
    la $s3, 24
    Loop:
        lw $a0, 0($s1) #loads the array
        add $s2, $s2, $a0 #add the current array to sum
        add $s1, $s1, 4 #add to i

        li $v0, 1 #says to print int
        move $a0, $s2 #moves s2 to a0 for printing
        syscall #print

        blt $s1, 8, Loop


#ends code
    li $v0, 10
    syscall



    

    


