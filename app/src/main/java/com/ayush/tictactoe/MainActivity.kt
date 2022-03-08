package com.ayush.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    var player=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val boardstatus = Array(3){IntArray(3) {-1} }

    val msgtext=findViewById<TextView>(R.id.msgtext)

        val btn1=findViewById<ImageButton>(R.id.btn1)
        val btn2=findViewById<ImageButton>(R.id.btn2)
        val btn3=findViewById<ImageButton>(R.id.btn3)
        val btn4=findViewById<ImageButton>(R.id.btn4)
        val btn5=findViewById<ImageButton>(R.id.btn5)
        val btn6=findViewById<ImageButton>(R.id.btn6)
        val btn7=findViewById<ImageButton>(R.id.btn7)
        val btn8=findViewById<ImageButton>(R.id.btn8)
        val btn9=findViewById<ImageButton>(R.id.btn9)

        val board = arrayOf(
                arrayOf(btn1,btn2,btn3),
                arrayOf(btn4,btn5,btn6),
                arrayOf(btn7,btn8,btn9)
        )



        btn1.setOnClickListener {
            btn1.isEnabled=false
            if(player==1){btn1.setImageResource(R.drawable.tilex)
            player=1-player
                boardstatus[0][0]=1}
            else{
                btn1.setImageResource(R.drawable.tileo)
                player=1-player
                boardstatus[0][0]=0
            }
            checkWinner(boardstatus,board,player,msgtext)
        }
        btn2.setOnClickListener {
            btn2.isEnabled=false
            if(player==1){btn2.setImageResource(R.drawable.tilex)
                player=1-player
                boardstatus[0][1]=1}
            else{
                btn2.setImageResource(R.drawable.tileo)
                player=1-player
                boardstatus[0][1]=0
            }
            checkWinner(boardstatus,board,player,msgtext)
        }
        btn3.setOnClickListener {
            btn3.isEnabled=false
            if(player==1){btn3.setImageResource(R.drawable.tilex)
                player=1-player
                boardstatus[0][2]=1}
            else{
                btn3.setImageResource(R.drawable.tileo)
                player=1-player
                boardstatus[0][2]=0
            }
            checkWinner(boardstatus,board,player,msgtext)
        }
        btn4.setOnClickListener {
            btn4.isEnabled=false
            if(player==1){btn4.setImageResource(R.drawable.tilex)
                player=1-player
                boardstatus[1][0]=1}
            else{
                btn4.setImageResource(R.drawable.tileo)
                player=1-player
                boardstatus[1][0]=0
            }
            checkWinner(boardstatus,board,player,msgtext)
        }
        btn5.setOnClickListener {
            btn5.isEnabled=false
            if(player==1){btn5.setImageResource(R.drawable.tilex)
                player=1-player
                boardstatus[1][1]=1}
            else{
                btn5.setImageResource(R.drawable.tileo)
                player=1-player
                boardstatus[1][1]=0
            }
            checkWinner(boardstatus,board,player,msgtext)
        }
        btn6.setOnClickListener {
            btn6.isEnabled=false
            if(player==1){btn6.setImageResource(R.drawable.tilex)
                player=1-player
                boardstatus[1][2]=1}
            else{
                btn6.setImageResource(R.drawable.tileo)
                player=1-player
                boardstatus[1][2]=0
            }
            checkWinner(boardstatus,board,player,msgtext)
        }
        btn7.setOnClickListener {
            btn7.isEnabled=false
            if(player==1){btn7.setImageResource(R.drawable.tilex)
                player=1-player
                boardstatus[2][0]=1}
            else{
                btn7.setImageResource(R.drawable.tileo)
                player=1-player
                boardstatus[2][0]=0
            }
            checkWinner(boardstatus,board,player,msgtext)
        }
        btn8.setOnClickListener {
            btn8.isEnabled=false
            if(player==1){btn8.setImageResource(R.drawable.tilex)
                player=1-player
                boardstatus[2][1]=1}
            else{
                btn8.setImageResource(R.drawable.tileo)
                player=1-player
                boardstatus[2][1]=0
            }
            checkWinner(boardstatus,board,player,msgtext)
        }
        btn9.setOnClickListener {
            btn9.isEnabled=false
            if(player==1){btn9.setImageResource(R.drawable.tilex)
                player=1-player
            boardstatus[2][2]=1}
            else{
                btn9.setImageResource(R.drawable.tileo)
                player=1-player
                boardstatus[2][2]=0
            }
            checkWinner(boardstatus,board,player,msgtext)
        }



        val resetbtn=findViewById<Button>(R.id.resetbtn)
        resetbtn.setOnClickListener {
            resetFun(board,boardstatus)
        }


    }
    fun checkWinner(boardstatus: Array<IntArray>,board: Array<Array<ImageButton>>,Player: Int,msgtext: TextView){
        //top row
        if(boardstatus[0][0]==boardstatus[0][1] && boardstatus[0][1]==boardstatus[0][2] && boardstatus[0][0]!=-1){
            disableAll(board)
            if(player==0){
                msgtext.setText("Player X is the Winner!")
            }
            else{
                msgtext.setText("Player O is the Winner!")
            }

        }
        //middle row
        else if(boardstatus[1][0]==boardstatus[1][1] && boardstatus[1][1]==boardstatus[1][2] && boardstatus[1][0]!=-1){
            disableAll(board)
            if(player==0){
                msgtext.setText("Player X is the Winner!")
            }
            else{
                msgtext.setText("Player O is the Winner!")
            }
        }
        //last row
        else if(boardstatus[2][0]==boardstatus[2][1] && boardstatus[2][1]==boardstatus[2][2] && boardstatus[2][0]!=-1){
            disableAll(board)
            if(player==0){
                msgtext.setText("Player X is the Winner!")
            }
            else{
                msgtext.setText("Player O is the Winner!")
            }
        }
        //first col
        else if(boardstatus[0][0]==boardstatus[1][0] && boardstatus[1][0]==boardstatus[2][0] && boardstatus[0][0]!=-1){
            disableAll(board)
            if(player==0){
                msgtext.setText("Player X is the Winner!")
            }
            else{
                msgtext.setText("Player O is the Winner!")
            }
        }
        //second col
        else if(boardstatus[0][1]==boardstatus[1][1] && boardstatus[1][1]==boardstatus[2][1] && boardstatus[0][1]!=-1){
            disableAll(board)
            if(player==0){
                msgtext.setText("Player X is the Winner!")
            }
            else{
                msgtext.setText("Player O is the Winner!")
            }
        }
        //third col
        else if(boardstatus[0][2]==boardstatus[1][2] && boardstatus[1][2]==boardstatus[2][2] && boardstatus[0][2]!=-1){
            disableAll(board)
            if(player==0){
                msgtext.setText("Player X is the Winner!")
            }
            else{
                msgtext.setText("Player O is the Winner!")
            }
        }
        //primary diagonal
        else if(boardstatus[0][0]==boardstatus[1][1] && boardstatus[1][1]==boardstatus[2][2] && boardstatus[0][0]!=-1){
            disableAll(board)
            if(player==0){
                msgtext.setText("Player X is the Winner!")
            }
            else{
                msgtext.setText("Player O is the Winner!")
            }
        }
        //secondary diagonal
        else if(boardstatus[2][0]==boardstatus[1][1] && boardstatus[1][1]==boardstatus[0][2] && boardstatus[2][0]!=-1){
            disableAll(board)
            if(player==0){
                msgtext.setText("Player X is the Winner!")
            }
            else{
                msgtext.setText("Player O is the Winner!")
            }
        }
        else{
            if(player==1){
                msgtext.setText("Player X's turn")
            }
            else{
                msgtext.setText("Player O's turn")
            }
        }
    }
    fun disableAll(board: Array<Array<ImageButton>>){
        var i=0
        while(i<3){
            var j=0
            while(j<3){
                board[i][j].isEnabled=false
                j+=1
            }
            i+=1
        }
    }
    fun resetFun(board: Array<Array<ImageButton>>, boardstatus: Array<IntArray>) {
        var i=0
        while(i<3){
            var j=0
            while(j<3){
                board[i][j].setImageResource(R.drawable.tileempty)
                boardstatus[i][j]=-1
                board[i][j].isEnabled=true
                j+=1
            }
            i+=1
        }
    }
}
