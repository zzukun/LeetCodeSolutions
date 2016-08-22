package N36ValidSoduku;

import java.util.ArrayList;

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        
    	//check row
    	for(int i=0;i<9;i++){
    		ArrayList<Character> rowList = new ArrayList<>();
    		for(int j=0;j<9;j++){
    			if(rowList.contains(board[i][j]))
    				return false;
    			else {
					if(board[i][j] >= '0' && board[i][j] <= '9'){
						rowList.add(board[i][j]);
					}
				}
    		}
    	}
    	//check col
    	for(int i=0;i<9;i++){
    		ArrayList<Character> colList = new ArrayList<>();
    		for(int j=0;j<9;j++){
    			if(colList.contains(board[j][i]))
    				return false;
    			else {
					if(board[j][i] >= '0' && board[j][i] <= '9'){
						colList.add(board[j][i]);
					}
				}
    		}
    	}
    	//check sub-square
    	for(int i=0;i<9;i=i+3){
    		for(int j=0;j<9;j=j+3){
    			ArrayList<Character> sqList = new ArrayList<>();
    			for(int m=0;m<3;m++){
    				for(int n=0;n<3;n++){
    					if(sqList.contains(board[i+m][j+n])){
    						return false;
    					}
    					else{
    						if(board[i+m][j+n] >= '0' && board[i+m][j+n] <= '9'){
    							sqList.add(board[i+m][j+n]);
    						}
    					}
    				}
    			}
    		}
    	}
    	
    	return true;
    }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
