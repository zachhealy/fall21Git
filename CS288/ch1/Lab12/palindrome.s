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
    theStr:
        .space 30
        .text 
    in:       .asciiz "Enter a string: "
    notLab:   .asciiz "Not a Palindrome: "
    aLab:   .asciiz "Palindrome: "
    nLine:  .asciiz "\n"

# code section
.text
.globl main

main:

    #input from user
    li      $v0, 8 
    la      $a0, theStr 
    li      $a1, 30 
    syscall 
    jr      $ra 

    #ends code
    li $v0, 10
    syscall