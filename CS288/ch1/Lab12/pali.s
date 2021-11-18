.data 
userInput: .space 50
userInputx: .space 50
isPali: .asciiz " is a palindrome."
notPali: .asciiz " is not a palindrome."
startPrompt: .asciiz "\nEnter a string to see if it is a palindrome: "



.text
main:
    la $a0, startPrompt #ask the user for input. 
    li $v0, 4
    syscall
    la $a0, userInput #store the user input in this location
    li $a1, 50
    li $v0, 8
    syscall #get the user input. 

sanitize: #sanitize the data that is entered so that we only check 0-9, A-Z, and a-z (rules for assignment
    la $t1, userInputx
    loop:
        lb $t7, ($a0)
        beq $t7, 10, checkPali  #begin the checking process, byte by byte until you reach the last byte in the string.
        bgt $t7, 47, test1
        j notToInputx
        test1: blt $t7, 58, addToInputx
        bgt $t7, 64, test2
        j notToInputx
        test2: blt $t7, 91, addToInputx #multi tests to elimate characters by ascii defined decimal codes. 
        bgt $t7, 96, test3
        j notToInputx
        test3: blt $t7, 123, addToInputx
        j notToInputx
    addToInputx: #input x is what we store the sanitized string in. Char by Char
        bgt $t7, 96, makeCap
        j notCap
        makeCap: addi $t7, $t7, -32 #this is to make comparison case-insensitive. 
        notCap:
        sb $t7, ($t1)
        addi $a0, $a0, 1 #increment each memory location
        addi $t1, $t1, 1
        j loop
    notToInputx: #do not add char to new sanitized string
        addi $a0, $a0, 1 #increment user input
        j loop
    setEOS:
        #set end of string

checkPali:
    la $t4, userInputx
    #use t1 as the backwards one
    #li $a3, 127
    sb $zero, ($a0)
    addi $t1, $t1, -1   #decrement from end of $t1, increment from beginning of $t4
    loop3:          #they are the same string. Just starting from both ends

        lb $t3, ($t4)
        lb $t2, ($t1)   #load bytes for testing
        beq $t3, $t2, next  #continue the check if bytes are equal
        j notPaliX  #no need to check the rest of the string if bytes are not equal
        next: jal testLocation  #test to make sure we are not at last byte. 
              addi $t4, $t4, 1 #incrememnt t4 closer to middle
              addi $t1, $t1, -1 #decrememnt t1 closer to middle (from reverse)
              j loop3   #continue to next iteration of loop
        j notPaliX

    testLocation:
        #current address variables are $t3 (forward) and $a0 (backward)
        beq $t4, $t1, isPaliX
        addi $t1, $t1, -1
        beq $t4, $t1, isPaliX   #test to see if we need to check more characters
        addi $t1, $t1, 1    #when at the middle, address's are going to be either equal 
        jr $ra          #or a == (b-1)

    isPaliX:
        la $a0, userInput
        li $v0, 4   #this is what happens when input is a pali
        syscall
        la $a0, isPali
        syscall

    notPaliX:
        la $a0, userInput #this is what happens if input is not a pali
        li $v0, 4
        syscall
        la $a0, notPali
        syscall

exit: 
    li $v0, 10
    syscall
