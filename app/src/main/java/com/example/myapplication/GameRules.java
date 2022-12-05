package com.example.myapplication;

import android.media.Image;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameRules {
    private int[][] gameBoard;
    private int shape = 1;
    private int[] winOption = {-1,-1,-1};

    private Button playAgainBtn;
    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    public ImageView image4;
    public ImageView image5;
    public ImageView image6;
    public ImageView image7;
    public ImageView image8;
    public ImageView image9;
    public ImageView image10;
    public ImageView imageWin1;
    public ImageView imageWin2;
    public ImageView imageWin3;
    public ImageView imageWin4;
    public ImageView imageWin5;
    public ImageView imageWin6;
    public ImageView imageWin7;



    public ImageView imageWin8;
    GameRules() {
        gameBoard = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = 0;
            }
        }
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public boolean updateGameBoard(int row, int col) {
        if (gameBoard[row - 1][col - 1] == 0) {
            gameBoard[row - 1][col - 1] = shape;
            if(gameBoard[0][0] == 1)
                image1.setImageResource(R.drawable.x);
            else if(gameBoard[0][0] == 2)
                image1.setImageResource(R.drawable.o);
            if(gameBoard[0][1] == 1)
                image2.setImageResource(R.drawable.x);
            else if(gameBoard[0][1] == 2)
                image2.setImageResource(R.drawable.o);
            if(gameBoard[0][2] == 1)
                image3.setImageResource(R.drawable.x);
            else if(gameBoard[0][2] == 2)
                image3.setImageResource(R.drawable.o);
            if(gameBoard[1][0] == 1)
                image4.setImageResource(R.drawable.x);
            else if(gameBoard[1][0] == 2)
                image4.setImageResource(R.drawable.o);
            if(gameBoard[1][1] == 1)
                image5.setImageResource(R.drawable.x);
            else if(gameBoard[1][1] == 2)
                image5.setImageResource(R.drawable.o);
            if(gameBoard[1][2] == 1)
                image6.setImageResource(R.drawable.x);
            else if(gameBoard[1][2] == 2)
                image6.setImageResource(R.drawable.o);
            if(gameBoard[2][0] == 1)
                image7.setImageResource(R.drawable.x);
            else if(gameBoard[2][0] == 2)
                image7.setImageResource(R.drawable.o);
            if(gameBoard[2][1] == 1)
                image8.setImageResource(R.drawable.x);
            else if(gameBoard[2][1] == 2)
                image8.setImageResource(R.drawable.o);
            if(gameBoard[2][2] == 1)
                image9.setImageResource(R.drawable.x);
            else if(gameBoard[2][2] == 2)
                image9.setImageResource(R.drawable.o);
            if(shape == 1)
            {
                image10.setImageResource(R.drawable.oplay);
            }
            else
            {
                image10.setImageResource(R.drawable.xplay);

            }
            return true;
        } else {
            return false;
        }
    }
    public boolean GameWinner()
    {
        boolean winner = false;
        for(int i = 0; i < 3; i++)//check if there is a winner in the rows
        {
            if(gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][0] == gameBoard[i][2] && gameBoard[i][0] != 0) {
                winner = true;
               if(i == 0)
                   imageWin3.setImageResource(R.drawable.mark4);
               else if(i==1)
                   imageWin4.setImageResource(R.drawable.mark4);
               else if(i==2)
                   imageWin5.setImageResource(R.drawable.mark4);
            }

        }
        for(int j = 0; j < 3; j++)//check if there is a winner in the column
        {
            if(gameBoard[0][j] == gameBoard[1][j] && gameBoard[0][j] == gameBoard[2][j] && gameBoard[0][j] != 0) {
                winner = true;
                if(j == 0)
                    imageWin6.setImageResource(R.drawable.mark3);
                else if(j==1)
                    imageWin7.setImageResource(R.drawable.mark5);
                else if(j==2)
                    imageWin8.setImageResource(R.drawable.mark5);
            }

        }
        if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2] && gameBoard[0][0] != 0) {
            winner = true;
            imageWin1.setImageResource(R.drawable.mark1);

        }

        if(gameBoard[2][0] == gameBoard[1][1] && gameBoard[2][0] == gameBoard[0][2] && gameBoard[2][0] != 0) {
            winner = true;
            imageWin2.setImageResource(R.drawable.mark2);
        }

        int fullBoard = 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(gameBoard[i][j] != 0)
                    fullBoard++;
            }
        }
        if(winner == true)
        {
            playAgainBtn.setEnabled(true);
            if(shape == 1)
                image10.setImageResource(R.drawable.xwin);
            else
                image10.setImageResource(R.drawable.owin);
            return true;

        }
        else if(fullBoard == 9)
        {
            playAgainBtn.setEnabled(true);
            image10.setImageResource(R.drawable.nowin);
            return false;
        }
        else
            return false;

    }
    public void ClearGame()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = 0;
            }
        }
        image1.setImageResource(0);
        image2.setImageResource(0);
        image3.setImageResource(0);
        image4.setImageResource(0);
        image5.setImageResource(0);
        image6.setImageResource(0);
        image7.setImageResource(0);
        image8.setImageResource(0);
        image9.setImageResource(0);
        image10.setImageResource(R.drawable.xplay);
        imageWin1.setImageResource(0);
        imageWin2.setImageResource(0);
        imageWin3.setImageResource(0);
        imageWin4.setImageResource(0);
        imageWin5.setImageResource(0);
        imageWin6.setImageResource(0);
        imageWin7.setImageResource(0);
        imageWin8.setImageResource(0);
        shape = 1;
        playAgainBtn.setEnabled(false);
    }
    public int getShape() {
        return shape;
    }
    public void setShape(int shape) {
        this.shape = shape;
    }
    public void setPlayAgainBtn(Button playAgainBtn) {
        this.playAgainBtn = playAgainBtn;
    }

    public int[] getWinOption() {
        return winOption;
    }
    public void setImage1(ImageView image1) {
        this.image1 = image1;
    }
    public void setImage2(ImageView image2) {
        this.image2 = image2;
    }


    public void setImage3(ImageView image3) {
        this.image3 = image3;
    }

    public void setImage4(ImageView image4) {
        this.image4 = image4;
    }
    public void setImage5(ImageView image5) {
        this.image5 = image5;
    }
    public void setImage6(ImageView image6) {
        this.image6 = image6;
    }

    public void setImage7(ImageView image7) {
        this.image7 = image7;
    }

    public void setImage8(ImageView image8) {
        this.image8 = image8;
    }

    public void setImage9(ImageView image9) {
        this.image9 = image9;
    }

    public void setImage10(ImageView image10) {
        this.image10 = image10;
    }

    public void setImageWin1(ImageView imageWin1) {
        this.imageWin1 = imageWin1;
    }
    public void setImageWin2(ImageView imageWin2) {
        this.imageWin2 = imageWin2;
    }

    public void setImageWin3(ImageView imageWin3) {
        this.imageWin3 = imageWin3;
    }

    public void setImageWin4(ImageView imageWin4) {
        this.imageWin4 = imageWin4;
    }

    public void setImageWin5(ImageView imageWin5) {
        this.imageWin5 = imageWin5;
    }

    public void setImageWin6(ImageView imageWin6) {
        this.imageWin6 = imageWin6;
    }

    public void setImageWin7(ImageView imageWin7) {
        this.imageWin7 = imageWin7;
    }
    public void setImageWin8(ImageView imageWin8) {
        this.imageWin8 = imageWin8;
    }
}
