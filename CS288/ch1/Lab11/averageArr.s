# Program header
# arrAvg.s
# Performs the average of an array
# Zach Healy

# data secion
.data
    arr:    .word 13, 15, 17, 19, 22, 43, 45, 87, 99, 199
    len:    .word 10
    sum:    .word 0
    avg:    .word 0
    sLab:   .asciiz "Sum: "
    aLab:   .asciiz "Average: "
    nLine:  .asciiz "\n"


# code section
.text
.globl main

main:
    la $s1, arr #arr
    li $s2, 0 #sum
    lw $s3, len #length
    li $s4, 0   #i = 0
    Loop:
        lw $s5, 0($s1) #loads the array[i]
        add $s2, $s2, $s5 #Calculate sum

        add $s4, $s4, 1 #Iterate I
        add $s1, $s1, 4
        blt $s4, $s3, Loop
    
    sw $s2, sum

    #print out sum label
    li $v0, 4
    la $a0, sLab
    syscall

    #print out sum
    li $v0, 1
    move $a0, $s2 #moves s2 to a0 for printing
    syscall

    #print out new line
    li $v0, 4
    la $a0, nLine
    syscall

    #print out average label
    li $v0, 4
    la $a0, aLab
    syscall

    #print out average
    li $v0, 1
    div $a0, $s2, $s3
    mflo $a0
    syscall

#ends code
    li $v0, 10
    syscall



    

    


