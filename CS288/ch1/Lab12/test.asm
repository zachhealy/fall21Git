.data
	userInput: .space 64
	is_palin_msg: .asciiz "This is a palindrome"
	not_palin_msg: .asciiz "This is not a palindrome"
	prompt: .asciiz "Enter string: "
.text
.globl main

main:
	#Displays prompt
	li $v0, 4
	la $a0, prompt
	syscall

	
	#Getting text from the user
	li $v0, 8
	la $a0, userInput
	li $a1, 64
	syscall
	
	la $t1, userInput
	la $t2, userInput
	
loop:
		lb $t3, ($t2)
		beqz $t3, end_length_loop
		addu $t2, $t2, 1
		b length_loop
	
end_length_loop:
		subu $t2, $t2, 2
		
test_loop:
		bge $t1, $t2, is_palin
		lb $t3, ($t1)
		lb $t4, ($t2)
		bne $t3, $t4, not_palin
		
		addu $t1, $t1, 1
		subu $t2, $t2, 1
		b test_loop
		
is_palin:
		la $a0, is_palin_msg
		li $v0, 4
		syscall
		b exit
		
not_palin:
		la $a0, not_palin_msg
		li $v0, 4
		syscall
		b exit
	
exit:
		li $v0, 10
		syscall