	.data
msg:	.asciiz "Hello, Zach Healy!"

	.text
	.globl main
main:	li $v0, 4
	la $a0, msg
	syscall
	li $v0, 10
	syscall