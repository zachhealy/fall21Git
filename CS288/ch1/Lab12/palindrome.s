#palindrome.s
#Lab 12
#checks if an input is palindrome


#1 prompt 'enter string'
#2 read input
#3 figure out length by moving one pointer all the way until new nLine
#4 leftptr ++, rightptr --, match?
    #yes, continue until left==right
    #no, display not Palindrome and exit
#5 if left==right then display is palindrome and exit

 .data 
 	myStr: 		.space 32
	in: 		.asciiz "Enter your string: "
	pali: 	    .asciiz "The line is a palindrome."
	notPali: 	.asciiz "The line is not a palindrome."

.text
.globl main

main: 
	la $a0, in
	li $v0, 4
	syscall

	li      $v0, 8 
	la      $a0, myStr
	li      $a1, 64 
	syscall 
	   
	la $t0, 10
	la $s0, myStr
	la $s1, myStr

	newLine: 
		addi $s1, $s1, 1
		lb   $t1, 0($s1)
		beq $t1, $t0, last 
		j newLine
		
	last:
		addi $s1, $s1, -1
		
	compare:
		lb $s2, ($s1)
		lb $s3, ($s0) 
		beq $s3, $t0, paliPrint 
		bne $s2, $s3, notPlaiPrint 
		addi $s0, $s0, 1 
		addi $s1, $s1, -1
		j compare 
	
	paliPrint: 
		li $v0, 4
		la $a0, pali
		syscall
		li $v0, 10      
		syscall         
		
	notPlaiPrint:
		li $v0, 4
		la $a0, notPali
		syscall
		li $v0, 10
		syscall

