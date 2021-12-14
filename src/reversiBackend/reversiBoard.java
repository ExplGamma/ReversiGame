package reversiBackend;

import java.security.InvalidParameterException;

public class reversiBoard {
    public static final int EMPTY = 0;
    public static final int BLACK = 1;
    public static final int WHITE = 2;

    private int dimensions;
    private int[][] board;

    /**
     * 
     */
    public reversiBoard(){
        this(8);
    }

    /**
     * 
     * @param dimensions
     */
    public reversiBoard(int dimensions){
        if (dimensions <= 3){
            throw new InvalidParameterException();
        }
        this.dimensions = dimensions;
        this.board = new int[dimensions][dimensions];
        if (dimensions%2 == 0){
            int alternate = 0;
            for(int i = (dimensions/2 - 1); i <= ( dimensions/2); i++){
                for (int j = (dimensions/2 - 1); j <= ( dimensions/2); j++){
                    board[i][j] = alternate+1;
                    alternate = (alternate+1)%2;
                }
                alternate = (alternate+1)%2;
            }
        } else {
            int alternate = 0;
            for(int i = (dimensions/2 - 1); i <= ( dimensions/2 + 1); i++){
                for (int j = (dimensions/2 - 1); j <= ( dimensions/2 + 1); j++){
                    board[i][j] = alternate+1;
                    alternate = (alternate+1)%2;
                }
            }
        }
    }

    /**
     * 
     * @return
     */
    public int [][] getBoard(){
        return board.clone();
    }

    /**
     * 
     * @return
     */
    public String getBoardAsString(){
        String toReturn = "";
        for (int i = 0; i < dimensions; i++){
            for (int j = 0; j < dimensions; j++){
                switch(board[i][j]) {
                    case WHITE:
                        toReturn += "W ";
                        break;
                    case BLACK:
                        toReturn += "B ";
                        break;
                    default:
                        toReturn += "x ";
                }
            }
            toReturn += "\n";
        }
        return toReturn;
    }

    /**
     * 
     * @param colour
     * @return
     */
    public int[][] getLegalMoves(int colour){
        if ( (colour != BLACK) || (colour != WHITE)){
            throw new InvalidParameterException();
        }

        int notColour = (colour == WHITE) ? (BLACK) : (WHITE);

        int [][] toReturn = new int [dimensions][dimensions];


        // First check across
        for (int i = 0; i< dimensions; i++){
            int counter = 0;
            for (int j = 0; j< dimensions; j++){
                if (board[i][j] == notColour){

                } else if (board[i][j] == colour) {

                } else if (board[i][j] == EMPTY) {
                    
                }
            }
        }

        // Then check down

        // Then check first diagonal, ie, top left -> bottom right

        // Then check second diagonal, ie, bottom left -> top right
        
        return toReturn;
    }
}
