#Program Header
#Lab 12
#This program takes in a line of text from a user and determines if it is a palindrome or not.
 .data 
	isPalindrome: 	.asciiz "The line is a palindrome."
	notPalindrome: 	.asciiz "The line is not a palindrome."
	myStr: 			.space 32 
	strPrompt: 		.asciiz "Enter your string :"
    .text 
main: 
	#s0: leftmost pointer position
	#s1: rightmost pointer position
	#t0: character/element in left pointer
	#t1: character/element in right pointer
	#t2: temp variable
	la $a0, strPrompt
	li $v0, 4
	syscall
	# String input from user
	li      $v0, 8 
	la      $a0, myStr
	li      $a1, 64 
	syscall 
	   
	#Initialize variables
	la $t3, 10 #compare this for end-of-line '\n' 
	la $s0, myStr
	la $s1, myStr
	   
	#loop searching for '\n'
	loopA: 
		addi $s1, $s1, 1
		lb   $t1, 0($s1)
		beq $t1, $t3, getLastIndex #When the end of the line is found, go to last index loop
		j loopA # if not the same, move back to loopA
		
	getLastIndex : # Loop to get the last instead of the '\n'
		addi $s1, $s1, -1
		
	loopB: # loop to compare the characters
		lb $t4, ($s1) #load s1 into t4
		lb $t5, ($s0) #load s0 into t5
		beq $t5, $t3, output1 #if front index is equal to '\n' output1
		bne $t4, $t5, output2 #if front pointer is not equal to back pointer, output2
		addi $s0, $s0, 1 #move indexes
		addi $s1, $s1, -1
		j loopB #loopB
	
	output1: #prints isPalindrome
		li $v0, 4
		la $a0, isPalindrome
		syscall
		li $v0, 10      # Load the syscall value for exiting the program
		syscall         # Call the system to exit the program
		
		
		
	output2: #prints notPalindrome
		li $v0, 4
		la $a0, notPalindrome
		syscall
		li $v0, 10
		syscall
	############# END OF MAIN ###############
	