# Program header
# Average.s
# This program gets two numbers from the user, and performan addition and subtraciton between them

# Start of the code
.data
	arr:	.word 13, 15, 17, 19, 22, 43, 45, 87, 99, 199
	length:	.word 10
	sum:	.word 0
	average:	.word 0
	newline: .asciiz "\n"
.text
.globl main

main:
	la $t0, arr #Base address
	li $t1, 0	# i = 0
	lw $t2, length	#$t2 - length
	li $t3, 0	#Sum = 0
	sumLoop:
		lw $t4, ($t0)	#$t4 = array[i]
		add $t3, $t3, $t4	#sum = sum + array[i]
	
		add $t1, $t1, 1 #i = i + 1
		add $t0, $t0, 4 #Updating the array address
		blt $t1, $t2, sumLoop #If i < len, then loop again
     	sw $t3, sum

	#Calculate average
	div $t5, $t3, $t2
	sw $t5, average
	mfhi $s1

	#Display sum
	li $v0, 1
	move $a0, $t5
	syscall #Print average

	li $v0, 10				#syscall to exit program
	syscall					#end program