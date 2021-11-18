# palindrome.s
# Checks if input is palindrome
# Zach Healy

#1 prompt 'enter string'
#2 read input
#3 figure out length by moving one pointer all the way until new nLine
#4 leftptr ++, rightptr --, match?
    #yes, continue until left==right
    #no, display not Palindrome and exit
#5 if left==right then display is palindrome and exit

# data secion
.data
    theStr:   .space 30
    in:       .asciiz "Enter a string: "
    notLab:   .asciiz "Not a Palindrome: "
    aLab:   .asciiz "Palindrome: "

# code section
.text
.globl main

main:
    la $a0, in
    li $v0, 4
    syscall

    #input from user
    li      $v0, 8 
    la      $a0, theStr 
    li      $a1, 32 
    syscall 

    la $t0, 10
    la $s0, in
    la $s1, in

    newLine:
        addi $s1, $s1, 1
        lb $t1, 0($s1)
        beq $t1, $t0, last
        j newLine

    last:
        addi $s1, $s1, -1

    loopB: # loop to compare the characters
		lb $t4, ($s1) #load s1 into t4
		lb $t5, ($s0) #load s0 into t5
		beq $t5, $0, output1 #if front index is equal to '\n' output1
		bne $t4, $t5, output2 #if front pointer is not equal to back pointer, output2
		addi $s0, $s0, 1 #move indexes
		addi $s1, $s1, -1
		j loopB #loopB

    pali:
        li $v0, 4
		la $a0, aLab
		syscall
		li $v0, 10
		syscall

    notPali:
        li $v0, 4
		la $a0, notLab
		syscall
		li $v0, 10
		syscall
