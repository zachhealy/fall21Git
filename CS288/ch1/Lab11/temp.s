li $t1, 0 #sum
    li $t2, 10 #length
    li $t3, 0 #i

    Loop:
        lw $t4, $t3($t0)
        add $t1, $t1, $t4
        add $t3, $t3, 4

        addi $t2, $t2, -10
        bne $t1, $zero, Loop