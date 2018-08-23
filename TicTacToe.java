import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'O';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new TicTacToe();
    }

    Ti() {
        initMap();
        while(true) {
            humanTurn();
            if (checkWin(DOT_X)){
                System.out.println("You won!");
                break;
            }
            if(isMapFull()){
                System.out.println("Sorry, DRAW!");
                break;
            }
            // corrected method;
            aiTurn(checkChanceOfHumanWin());
            printMap();
            if (checkWin(DOT_O)){
                System.out.println("Ai won!");
                break;
            }
            if(isMapFull()){
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("Game over");
        printMap();
    }

    void initMap() {
        for (int i=0; i<SIZE; i++)
            for (int j=0; j<SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap(){
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++)
                System.out.print(map[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn(){
        int x, y;
        do{
            System.out.println("Enter X and Y(1...3)");
            x=sc.nextInt()-1;
            y=sc.nextInt()-1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    // corrected method for HW.
    void aiTurn(int[] turn){
        int x, y;
        if (turn[0]==1){
            x=turn[1];
            y=turn[2];
        }
        else
            do{
                x=rand.nextInt(SIZE);
                y=rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
        map[x][y] = DOT_O;
    }

    boolean checkWin(char dot){
        // new code for checkWin method;
        for (int i=0; i<SIZE; i++){
            int equalCountH=0;
            int equalCountV=0;
            int equalCountD1=0;
            int equalCountD2=0;
            for (int j=0, k=SIZE-1; j<SIZE; j++, k--){
                if (map[i][j]==dot) equalCountH+=1;
                if (map[j][i]==dot) equalCountV+=1;
                if (map[j][j]==dot) equalCountD1+=1;
                if (map[k][j]==dot) equalCountD2+=1;
            }
            if (equalCountD1==3||equalCountD2==3||equalCountH==3||equalCountV==3) return true;
        }
        return false;
    }
    // new method for increase computer Ai;
    int[] checkChanceOfHumanWin(){;
        int[] resultH = {0, 0, 0};
        int[] resultV = {0, 0, 0};
        int[] resultD1 = {0, 0, 0};
        int[] resultD2 = {0, 0, 0};
        for (int i=0; i<SIZE; i++){
            int equalCountH=0;
            int equalCountV=0;
            int equalCountD1=0;
            int equalCountD2=0;
            for (int j=0, k=SIZE-1; j<SIZE; j++, k--){
                if (map[i][j]==DOT_X) equalCountH+=1;
                else if (map[i][j]==DOT_EMPTY){
                    resultH[1]=i;
                    resultH[2]=j;
                }
                else equalCountH-=1;

                if (map[j][i]==DOT_X) equalCountV+=1;
                else if (map[j][i]==DOT_EMPTY){
                    resultV[1]=j;
                    resultV[2]=i;
                }
                else equalCountV-=1;

                if (map[j][j]==DOT_X) equalCountD1+=1;
                else if (map[j][j]==DOT_EMPTY){
                    resultD1[1]=j;
                    resultD1[2]=j;
                }
                else equalCountD1-=1;

                if (map[k][j]==DOT_X) equalCountD2+=1;
                else if (map[k][j]==DOT_EMPTY){
                    resultD2[1]=k;
                    resultD2[2]=j;
                }
                else equalCountD2-=1;
            }
            if (equalCountH==2) {
                resultH[0]=1;
                return resultH;
            }
            else if (equalCountV==2){
                resultV[0]=1;
                return resultV;
            }
            else if (equalCountD1==2){
                resultD1[0]=1;
                return resultD1;
            }
            else if (equalCountD2==2){
                resultD2[0]=1;
                return resultD2;
            }
        }
        return resultH;
    }

    boolean isMapFull(){
        for (int i=0; i<SIZE; i++)
            for (int j=0; j<SIZE; j++)
                if(map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }
    boolean isCellValid(int x, int y){
        if (x<0||y<0||x>=SIZE||y>=SIZE)
            return false;
        return map[y][x] == DOT_EMPTY;
    }
}