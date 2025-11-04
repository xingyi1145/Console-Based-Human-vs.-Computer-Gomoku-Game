package assignment;

import java.util.*;
import java.io.*;

/**
 * Name: Yi Xing
 * Date: 2023/11/28
 * Desc: final assignment version 1 ( haven't done )
 * 12.1 start doing main method choose first or second
 * 12.4 finish black check win condition
 * 12.5 finish white check win condition
 * 12.6 finish print chess to screen, still have bug for check diagonally left and right
 * 12.7 finish the bugs which found on 12.6
 * 12.8 start writing computer play method for white
 * 12.11 start writing computer play method for black
 * 12.12 almost done
 * 12.13 fixed the bugs of computer play black pass in error
 * 12.14 fixed the bugs of computer play chess out of board
 * 12.19 add weight for the position computer plays, make it more harder
 * 12.20 give user normal or hard mode to play
 * 12.21 fixed some bugs and add quit functions
 */

public class FinalAssignment {
	
	public static int[]blackX = new int [125];
	public static int[]whiteX = new int [125];
	public static int[]blackY = new int [125];
	public static int[]whiteY = new int [125];
	
	public static void computerPlayBlackHard ( File InFile, File back, int turn ) throws IOException {
		String position;
		int x,y;
		if ( !blackLiveHard( InFile, 4 ).equals("") ) {
			
			position = blackLiveHard( InFile, 4 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !whiteLiveHard( InFile, 4 ).equals("") ) {
			
			position = whiteLiveHard( InFile, 4 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !whiteLiveHard( InFile, 3 ).equals("") ) {
			
			position = whiteLiveHard( InFile, 3 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLiveHard( InFile, 3 ).equals("") ) {
			
			position = blackLiveHard( InFile, 3 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !whiteLiveHard( InFile, 2 ).equals("") ) {
			
			position = whiteLiveHard( InFile, 2 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLiveHard( InFile, 2 ).equals("") ) {
			
			position = blackLiveHard( InFile, 2 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLiveHard( InFile, 1 ).equals("") ) {
			
			position = blackLiveHard( InFile, 1 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
		    blackY[turn] = y;
		 // save the chess position in array
		    
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else {
			
			x = 16;
			y = 21;
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
		    blackY[turn] = y;
		 // save the chess position in array
		    
		    x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			// black plays first
			
		}
		
	}
	public static void computerPlayWhiteHard ( File InFile, File back, int turn ) throws IOException {
		
		String position;
		int x,y;
		if ( !whiteLiveHard( InFile, 4 ).equals("") ) {
			
			position = whiteLiveHard( InFile, 4 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLiveHard( InFile, 4 ).equals("") ) {
			
			position = blackLiveHard( InFile, 4 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLiveHard( InFile, 3 ).equals("") ) {
			
			position = blackLiveHard( InFile, 3 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !whiteLiveHard( InFile, 3 ).equals("") ) {
			
			position = whiteLiveHard( InFile, 3 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLiveHard( InFile, 2 ).equals("") ) {
			
			position = blackLiveHard( InFile, 2 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !whiteLiveHard( InFile, 2 ).equals("") ) {
			
			position = whiteLiveHard( InFile, 2 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else {
			
			position = blackLiveHard( InFile, 1 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		}
		
	}
	
	public static String whiteLiveHard ( File InFile, int need ) throws IOException {
		
		String position;
		String[] values = new String[3];
		int max = -1;
		int[] weight = {-1,-1,-1,-1};
		
		if ( !whiteLiveHorizontallyHard( InFile, need ).equals("") ) {
			position = whiteLiveHorizontallyHard( InFile, need );
			values = position.split(",");
			weight[0] = Integer.valueOf(values[2]);
			
		}
		if ( !whiteLiveVerticallyHard( InFile, need ).equals("") ) {
			position = whiteLiveVerticallyHard( InFile, need );
			values = position.split(",");
			weight[1] = Integer.valueOf(values[2]);
			
		}
		if ( !whiteLiveDiagonallyLeftHard( InFile, need ).equals("") ) {
			position = whiteLiveDiagonallyLeftHard( InFile, need );
			values = position.split(",");
			weight[2] = Integer.valueOf(values[2]);
			
		}
		if ( !whiteLiveDiagonallyRightHard( InFile, need ).equals("") ) {
			position = whiteLiveDiagonallyRightHard( InFile, need );
			values = position.split(",");
			weight[3] = Integer.valueOf(values[2]);
			
		}
		
		for ( int i = 0; i < 4; i ++ ) {
			if ( max <= weight[i] ) {
				max = weight[i];
			}
		}
		
		if ( max == weight[0] ) {
			return whiteLiveHorizontallyHard( InFile, need );
		} else if ( max == weight[1] ) {
			return whiteLiveVerticallyHard( InFile, need );
		} else if ( max == weight[2] ) {
			return whiteLiveDiagonallyLeftHard( InFile, need );
		} else if ( max == weight[3] ) {
			return whiteLiveDiagonallyRightHard( InFile, need );
		} else {
			return "";
		}
		
	}
	public static String blackLiveHard ( File InFile, int need ) throws IOException {
		
		String position;
		String[] values = new String[3];
		int max = -1;
		int[] weight = {-1,-1,-1,-1};
		
		if ( !blackLiveHorizontallyHard( InFile, need ).equals("") ) {
			position = blackLiveHorizontallyHard( InFile, need );
			values = position.split(",");
			weight[0] = Integer.valueOf(values[2]);
			
		}
		if ( !blackLiveVerticallyHard( InFile, need ).equals("") ) {
			position = blackLiveVerticallyHard( InFile, need );
			values = position.split(",");
			weight[1] = Integer.valueOf(values[2]);
			
		 }
		if ( !blackLiveDiagonallyLeftHard( InFile, need ).equals("") ) {
			position = blackLiveDiagonallyLeftHard( InFile, need );
			values = position.split(",");
			weight[2] = Integer.valueOf(values[2]);
		}
		if ( !blackLiveDiagonallyRightHard( InFile, need ).equals("") ) {
			position = blackLiveDiagonallyRightHard( InFile, need );
			values = position.split(",");
			weight[3] = Integer.valueOf(values[2]);
			
		 }
		
		for ( int i = 0; i < 4; i ++ ) {
			if ( max <= weight[i] ) {
				max = weight[i];
			}
		}
		
		if ( max == weight[0] ) {
			return blackLiveHorizontallyHard( InFile, need );
		} else if ( max == weight[1] ) {
			return blackLiveVerticallyHard( InFile, need );
		} else if ( max == weight[2] ) {
			return blackLiveDiagonallyLeftHard( InFile, need );
		} else if ( max == weight[3] ) {
			return blackLiveDiagonallyRightHard( InFile, need );
		} else {
			return "";
		}
		
		
	}
	
	public static String whiteLiveHorizontallyHard ( File InFile, int need ) throws IOException {
		
		int i = 0;
		String position = "";
		int lastMax = 0;
		String answer = "";
		while( whiteX[i] != 0 ) { // checking for white horizontally
			
			Scanner in = new Scanner (InFile);
			
			position = "";
			int row = 1;
			int max = 0;
			String line = in.nextLine();;
			do { 
				row ++;
				line = in.nextLine();
			} while ( row != whiteX[i] ); // get the line which white chess in
			char[] thisLine = line.toCharArray();
			
			// check horizontally
			int blank = 0;
			int count = 1;
			for ( int j = whiteY[i] - 3; j >= 0; j -=3 ) {
				if ( thisLine[j] == 'O' ) {
					count ++;
				} else if ( thisLine[j] == ' ' && ( ( j - 3 >= 0 && thisLine[j-3] == 'O' ) || ( j + 3 <= 42 && thisLine[j+3] == 'O' ) ) ){
					blank ++;
					max = Math.max(max, blank);
					position = row + "," + j + "," + blank + "," + max;
				} else {
					break;
				}
				
				if ( count == need && max >= 1 && max >= lastMax ) {
					answer = position;
					lastMax = Math.max(max, lastMax);
					break;
				} // there is enough chess in a horizontal line and has blank 
				
			} // go left
			
			if ( position.equals("") || count != need ) {
				for ( int j = whiteY[i] + 3; j <= 42; j += 3 ) {
					if ( thisLine[j] == 'O' ) {
						count ++;
					} else if ( thisLine[j] == ' ' && ( ( j - 3 >= 0 && thisLine[j-3] == 'O' ) || ( j + 3 <= 42 && thisLine[j+3] == 'O' ) ) ){
						blank ++;
						max = Math.max(max, blank);
						position = row + "," + j + "," + blank + "," + max;
					} else {
						break;
					}
					
					if ( count == need && max >= 1 && max >= lastMax ) {
						answer = position;
						lastMax = Math.max(max, lastMax);
						break;
					} // there is enough chess in a horizontal line and has blank 
					
				} // go right
				
			}
			
			i++;
			in.close();
			
		} // checking horizontally
		
		return answer;
		
	}
	public static String whiteLiveVerticallyHard( File InFile, int need ) throws IOException {
		
		String position = "";
		int i=0;
		int lastMax = 0;
		String answer = "";
		while( whiteX[i] != 0 ) { // checking for white
			
			Scanner in = new Scanner (InFile);
			position = "";
					
			// check vertically	
			int blank = 0;
			int count = 0;
			int row = 2;
			int max = 0;
			String lineVertical = in.nextLine();
			char[] thisLine;
			char last = ' ';
			
			while ( row < 30 ) {
				lineVertical = in.nextLine();
				thisLine = lineVertical.toCharArray();
				if ( thisLine[whiteY[i]] == 'O' ) {
					count ++;
					if ( last == ' ' && row - 2 >= 2 ) {
						int xvalue = row - 2;
						blank ++;
						max = Math.max(max, blank);
						position = xvalue + "," + whiteY[i] + "," + max;
					}
				} else if ( thisLine[whiteY[i]] == ' ' && last == 'O' ) {
					blank ++;
					max = Math.max(max, blank);
					position = row + "," + whiteY[i] + "," + max;
				} else {
					count = 0;
					blank = 0;
					max = Math.max(max, blank);
					position = "";
				}
				row += 2;
				last = thisLine[whiteY[i]];
				if (row == 30) {
					continue;
				} else {
					in.nextLine();
				}
				if ( count == need && max >= 1 && max >= lastMax ) {
					answer = position;		
					lastMax = Math.max(max, lastMax);
				} // there is enough white chess in a vertical line and has blank
				
			} // searching for all this line
			in.close();
			i++;

			
		}
		
		return answer;
		
	}	
	public static String whiteLiveDiagonallyLeftHard ( File InFile, int need ) throws IOException {
		
		int i=0;
		int lastMax = 0;
		String answer = "";
		String position = "";
		while( whiteX[i] != 0 ) { // checking for white
			
			int count = 0; // check diagonally from left to right
			int blank = 0;
			int row = 2;
			int max = 0;
			position = "";
			Scanner in = new Scanner (InFile);
			int distanceX = whiteX[i] / 2;
			int start = whiteY[i] - ( distanceX * 3 ) + 3;
			char last =' ';
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'O' ) {
						count ++;
						if ( last == ' ' && row - 2 >= 2 && start - 3 >= 0 ) {
							int xvalue = row - 2;
							int yvalue = start - 3;
							blank ++;
							max = Math.max(max, blank);
							position = xvalue + "," + yvalue + "," + max;
						}
					} else if ( thisLine[ start ] == ' ' && last == 'O' ) {
						blank ++;
						max = Math.max(max, blank);
						position = row + "," + start + "," + max;
					} else {
						count = 0;
					}
					last = thisLine[start];
				}
				start += 3;
				in.nextLine();
				if ( count == need && max >= 1 && max >= lastMax ) {
					answer = position;
					lastMax = Math.max(lastMax, max);
				} // satisfied the need
				
				row += 2;
				
			}
			in.close();
			i++;

			
		}
		
		return answer;
		
	} // check diagonally from left to right for white
	public static String whiteLiveDiagonallyRightHard ( File InFile, int need ) throws IOException {
		
		int i=0;
		String position = "";
		int lastMax = 0;
		String answer = "";
		while( whiteX[i] != 0 ) { // checking for white
			
			int count = 0; // check diagonally from right to left
			int blank = 0;
			int row = 2;
			int max = 0;
			position = "";
			Scanner in = new Scanner (InFile);
			int distanceX = whiteX[i] / 2 - 1;
			int start = whiteY[i] + ( distanceX * 3 );
			char last = ' '; 
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'O' && row - 2 >= 2 && start + 3 <= 42 ) {
						count ++;
						if ( last == ' ' ) {
							int xvalue = row - 2;
							int yvalue = start + 3;
							blank ++;
							max = Math.max(max, blank);
							position = xvalue + "," + yvalue + "," + max;
						}
					} else if ( thisLine[ start ] == ' ' && last == 'O' ) {
						blank ++;
						max = Math.max(max, blank);
						position = row + "," + start + "," + max;
					} else {
						count = 0;
					}
					last = thisLine[start];
				}
				
				start -= 3;
				in.nextLine();
				if ( count == need && max >= 1 && max >= lastMax ) {
					answer = position;
					lastMax = Math.max(lastMax, max);
				} // satisfied the need		
				
				row += 2;
				
			} 
			in.close();
			i++;

		}
		
		return answer;
		
	} // check diagonally from right to left for white
	
	public static String blackLiveHorizontallyHard ( File InFile, int need ) throws IOException {
		
		int i=0;
		int lastMax = 0;
		String answer = "";
		String position = "";
		while( blackX[i] != 0 ) { // checking for black horizontally
			
			Scanner in = new Scanner (InFile);
			
			position = "";
			int row = 1;
			int max = 0;
			String line = in.nextLine();;
			do { 
				row ++;
				line = in.nextLine();
			} while ( row != blackX[i] ); // get the line which black chess in
			char[] thisLine = line.toCharArray();
			
			// check horizontally
			int blank = 0;
			int count = 1;
			for ( int j = blackY[i] - 3; j >= 0; j -=3 ) {
				if ( thisLine[j] == 'X' ) {
					count ++;
				} else if ( thisLine[j] == ' ' && ( ( j - 3 >= 0 && thisLine[j-3] == 'X' ) || ( j + 3 <= 42 && thisLine[j+3] == 'X' ) ) ){
					blank ++;
					max = Math.max(max, blank);
					position = row + "," + j  + "," + blank + "," + max;
				} else {
					break;
				}
				
				if ( count == need && max >= 1 && max >= lastMax) {
					answer = position;
					lastMax = Math.max(max, lastMax);
					break;
				} // there is enough chess in a horizontal line and has blank 
				
			} // go left
			
			if ( position.equals("") || count != need ) {
				for ( int j = blackY[i] + 3; j <= 42; j += 3 ) {
					if ( thisLine[j] == 'X' ) {
						count ++;
					} else if ( thisLine[j] == ' ' && ( ( j - 3 >= 0 && thisLine[j-3] == 'X' ) || ( j + 3 <= 42 && thisLine[j+3] == 'X' ) ) ){
						blank ++;
						max = Math.max(max, blank);
						position = row + "," + j  + "," + blank + "," + max;
					} else {
						break;
					}
					
					if ( count == need && max >= 1 && max >= lastMax ) {
						answer = position;
						lastMax = Math.max(max, lastMax);
						break;
					} // there is enough chess in a horizontal line and has blank 
					
				} // go right
			}
			
			i++;
			in.close();
			
		} // checking horizontally
		
		return answer;
		
	}
	public static String blackLiveVerticallyHard( File InFile, int need ) throws IOException {
		
		String position = "";
		int i=0;
		int lastMax = 0;
		String answer = "";
		while( blackX[i] != 0 ) { // checking for black
			
			Scanner in = new Scanner (InFile);
			position = "";
					
			// check vertically	
			int blank = 0;
			int count = 0;
			int row = 2;
			int max = 0;
			String lineVertical = in.nextLine();
			char[] thisLine;
			char last = 'X';
			
			while ( row < 30 ) {
				lineVertical = in.nextLine();
				thisLine = lineVertical.toCharArray();
				if ( thisLine[blackY[i]] == 'X' ) {
					count ++;
					if ( last == ' ' && row - 2 >= 2 ) {
						int xvalue = row - 2;
						blank ++;
						max = Math.max(max, blank);
						position = xvalue + "," + blackY[i] + "," + max;
					}
				} else if ( thisLine[blackY[i]] == ' ' && last == 'X' ) {
					blank ++;
					max = Math.max(max, blank);
					position = row + "," + blackY[i] + "," + max;
				} else {
					count = 0;
					count = 0;
					blank = 0;
					position = "";
				}
				
				last = thisLine[blackY[i]];
				row += 2;
				
				if (row == 30) {
					continue;
				} else {
					in.nextLine();
				}
				if ( count == need && max >= 1 && max >= lastMax ) {
					answer = position;	
					lastMax = Math.max(max, lastMax);
				} // there is enough white chess in a vertical line and has blank
				
			} // searching for all this line
			in.close();
			i++;

		}
		
		return answer;
		
	}
	public static String blackLiveDiagonallyLeftHard ( File InFile, int need ) throws IOException {
		
		int i=0;
		int lastMax = 0;
		String answer = "";

		while( blackX[i] != 0 ) { // checking for black
			
			int count = 0; // check diagonally from left to right
			int blank = 0;
			int row = 2;
			int max = 0;
			String position = "";
			Scanner in = new Scanner (InFile);
			int distanceX = blackX[i] / 2;
			int start = blackY[i] - ( distanceX * 3 ) + 3;
			char last =' ';
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'X' ) {
						count ++;
						if ( last == ' ' && row - 2 >= 2 && start - 3 >= 0 ) {
							int xvalue = row - 2;
							int yvalue = start - 3;
							blank ++;
							max = Math.max(max, blank);
							position = xvalue + "," + yvalue + "," + max;
						}
					} else if ( thisLine[ start ] == ' ' && last == 'X' ) {
						blank ++;
						max = Math.max(max, blank);
						position = row + "," + start + "," + max;
					} else {
						count = 0;
					}
					last = thisLine[start];
				}
				start += 3;
				in.nextLine();
				
				if ( count == need && max >= 1 && max >= lastMax ) {
					answer = position;
					lastMax = Math.max(max, lastMax);
				} // satisfied the need
				
				row += 2;
				
			}
			in.close();
			i++;

		}
		
		return answer;
		
	} // check diagonally from left to right for black
	public static String blackLiveDiagonallyRightHard ( File InFile, int need ) throws IOException {
		
		int i=0;
		int lastMax = 0;
		String answer = "";
		String position = "";
		while( blackX[i] != 0 ) { // checking for black
			
			int count = 0; // check diagonally from right to left
			int blank = 0;
			int row = 2;
			int max = 0;
			position = "";
			Scanner in = new Scanner (InFile);
			int distanceX = blackX[i] / 2 - 1;
			int start = blackY[i] + ( distanceX * 3 );
			char last = ' '; 
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'X' ) {
						count ++;
						if ( last == ' ' && row - 2 >= 2 && start + 3 <= 42 ) {
							int xvalue = row - 2;
							int yvalue = start + 3;
							blank ++;
							max = Math.max(max, blank);
							position = xvalue + "," + yvalue + "," + max;
						}
					} else if ( thisLine[ start ] == ' ' && last == 'X' ) {
						blank ++;
						max = Math.max(max, blank);
						position = row + "," + start + "," + max;
					} else {
						count = 0;
					}
					last = thisLine[start];
				}
				
				start -= 3;
				in.nextLine();
				if ( count == need && max >= 1 && max >= lastMax ) {
					answer = position;
					lastMax = Math.max(max, lastMax);
				} // satisfied the need		
				
				row += 2;
				
			} 
			in.close();
			i++;

		}
		
		return answer;
		
	} // check diagonally from right to left for black
	
	public static void computerPlayBlack ( File InFile, File back, int turn ) throws IOException {
		String position;
		int x,y;
		if ( !blackLive( InFile, 4 ).equals("") ) {
			
			position = blackLive( InFile, 4 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !whiteLive( InFile, 4 ).equals("") ) {
			
			position = whiteLive( InFile, 4 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLive( InFile, 3 ).equals("") ) {
			
			position = blackLive( InFile, 3 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !whiteLive( InFile, 3 ).equals("") ) {
			
			position = whiteLive( InFile, 3 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !whiteLive( InFile, 2 ).equals("") ) {
			
			position = whiteLive( InFile, 2 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLive( InFile, 2 ).equals("") ) {
			
			position = blackLive( InFile, 2 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
			blackY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLive( InFile, 1 ).equals("") ) {
			
			position = blackLive( InFile, 1 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
		    blackY[turn] = y;
		 // save the chess position in array
		    
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else {
			
			x = 16;
			y = 21;
			printChessBlack( InFile, back, x, y );
			blackX[turn] = x;
		    blackY[turn] = y;
		 // save the chess position in array
		    
		    x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			// black plays first
			
		}
		
	}
	public static void computerPlayWhite ( File InFile, File back, int turn ) throws IOException {
		
		String position;
		int x,y;
		if ( !whiteLive( InFile, 4 ).equals("") ) {
			
			position = whiteLive( InFile, 4 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLive( InFile, 4 ).equals("") ) {
			
			position = blackLive( InFile, 4 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !whiteLive( InFile, 3 ).equals("") ) {
			
			position = whiteLive( InFile, 3 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLive( InFile, 3 ).equals("") ) {
			
			position = blackLive( InFile, 3 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !blackLive( InFile, 2 ).equals("") ) {
			
			position = blackLive( InFile, 2 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else if ( !whiteLive( InFile, 2 ).equals("") ) {
			
			position = whiteLive( InFile, 2 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		} else {
			
			position = blackLive( InFile, 1 );
			String[] xy = position.split(",");
			x = Integer.valueOf(xy[0]);
			y = Integer.valueOf(xy[1]);
			// get the x, y value
			printChessWhite( InFile, back, x, y );
			whiteX[turn] = x;
			whiteY[turn] = y;
			// save the chess position in array
			
			x /= 2;
			y = ( y / 3 ) + 1;
			System.out.println( "Computer placed a chess at " + x + ", " + y );
			
		}
		
	}
	
	public static String whiteLive ( File InFile, int need ) throws IOException {
		
		if ( !whiteLiveHorizontally( InFile, need ).equals("") ) {
			return whiteLiveHorizontally( InFile, need );
		} else if ( !whiteLiveVertically( InFile, need ).equals("") ) {
			return whiteLiveVertically( InFile, need );
		} else if ( !whiteLiveDiagonallyLeft( InFile, need ).equals("") ) {
			return whiteLiveDiagonallyLeft( InFile, need );
		} else if ( !whiteLiveDiagonallyRight( InFile, need ).equals("") ) {
			return whiteLiveDiagonallyRight( InFile, need );
		} else {
			return "";
		}
		
	}
	public static String blackLive ( File InFile, int need ) throws IOException {
		
		if ( !blackLiveHorizontally( InFile, need ).equals("") ) {
			return blackLiveHorizontally( InFile, need );
		} else if ( !blackLiveVertically( InFile, need ).equals("") ) {
			return blackLiveVertically( InFile, need );
		} else if ( !blackLiveDiagonallyLeft( InFile, need ).equals("") ) {
			return blackLiveDiagonallyLeft( InFile, need );
		} else if ( !blackLiveDiagonallyRight( InFile, need ).equals("") ) {
			return blackLiveDiagonallyRight( InFile, need );
		} else {
			return "";
		}
		
	}
	
	public static String whiteLiveHorizontally ( File InFile, int need ) throws IOException {
		
		int i=0;
		String position = "";
		while( whiteX[i] != 0 ) { // checking for white horizontally
			
			Scanner in = new Scanner (InFile);
			
			position = "";
			int row = 1;
			String line = in.nextLine();;
			do { 
				row ++;
				line = in.nextLine();
			} while ( row != whiteX[i] ); // get the line which white chess in
			char[] thisLine = line.toCharArray();
			
			// check horizontally
			int blank = 0;
			int count = 1;
			for ( int j = whiteY[i] - 3; j >= 0; j -=3 ) {
				if ( thisLine[j] == 'O' ) {
					count ++;
				} else if ( thisLine[j] == ' ' && ( ( j - 3 >= 0 && thisLine[j-3] == 'O' ) || ( j + 3 <= 42 && thisLine[j+3] == 'O' ) ) ){
					blank ++;
					position = row + "," + j;
				} else {
					break;
				}
				
				if ( count == need && blank >= 1 ) {
					in.close();
					return position;
				} // there is enough chess in a horizontal line and has blank 
				
			} // go left
			
			if ( position.equals("") || count != need ) {
				for ( int j = whiteY[i] + 3; j <= 42; j += 3 ) {
					if ( thisLine[j] == 'O' ) {
						count ++;
					} else if ( thisLine[j] == ' ' && ( ( j - 3 >= 0 && thisLine[j-3] == 'O' ) || ( j + 3 <= 42 && thisLine[j+3] == 'O' ) ) ){
						blank ++;
						position = row + "," + j;
					} else {
						break;
					}
					
					if ( count == need && blank >= 1 ) {
						in.close();
						return position;
					} // there is enough chess in a horizontal line and has blank 
					
				} // go right
			}
			
			i++;
			in.close();
			
		} // checking horizontally
		
		position = "";
		return position;
		
	}
	public static String whiteLiveVertically( File InFile, int need ) throws IOException {
		
		String position = "";
		int i=0;
		while( whiteX[i] != 0 ) { // checking for white
			
			Scanner in = new Scanner (InFile);
			position = "";
					
			// check vertically	
			int blank = 0;
			int count = 0;
			int row = 2;
			String lineVertical = in.nextLine();
			char[] thisLine;
			char last = ' ';
			
			while ( row < 30 ) {
				lineVertical = in.nextLine();
				thisLine = lineVertical.toCharArray();
				if ( thisLine[whiteY[i]] == 'O' ) {
					count ++;
					if ( last == ' ' && row - 2 >= 2 ) {
						int xvalue = row - 2;
						position = xvalue + "," + whiteY[i];
						blank ++;
					}
				} else if ( thisLine[whiteY[i]] == ' ' && last == 'O' ) {
					blank ++;
					position = row + "," + whiteY[i];
				} else {
					count = 0;
					blank = 0;
					position = "";
				}
				row += 2;
				last = thisLine[whiteY[i]];
				if (row == 30) {
					continue;
				} else {
					in.nextLine();
				}
				if ( count == need && blank >= 1 ) {
					in.close();
					return position;						
				} // there is enough white chess in a vertical line and has blank
				
			} // searching for all this line
			in.close();
			i++;
		}
		
		position = "";
		return position;
		
	}	
	public static String whiteLiveDiagonallyLeft ( File InFile, int need ) throws IOException {
		
		int i=0;
		String position = "";
		while( whiteX[i] != 0 ) { // checking for white
			
			int count = 0; // check diagonally from left to right
			int blank = 0;
			int row = 2;
			position = "";
			Scanner in = new Scanner (InFile);
			int distanceX = whiteX[i] / 2;
			int start = whiteY[i] - ( distanceX * 3 ) + 3;
			char last =' ';
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'O' ) {
						count ++;
						if ( last == ' ' && row - 2 >= 2 && start - 3 >= 0 ) {
							int xvalue = row - 2;
							int yvalue = start - 3;
							position = xvalue + "," + yvalue;
							blank ++;
						}
					} else if ( thisLine[ start ] == ' ' && last == 'O' ) {
						blank ++;
						position = row + "," + start;
					} else {
						count = 0;
					}
					last = thisLine[start];
				}
				start += 3;
				in.nextLine();
				if ( count == need && blank >= 1) {
					in.close();
					return position;
				} // satisfied the need
				
				row += 2;
				
			}
			in.close();
			i++;
		}
		
		position = "";
		return position;
	} // check diagonally from left to right for white
	public static String whiteLiveDiagonallyRight ( File InFile, int need ) throws IOException {
		
		int i=0;
		String position = "";
		while( whiteX[i] != 0 ) { // checking for white
			
			int count = 0; // check diagonally from right to left
			int blank = 0;
			int row = 2;
			position = "";
			Scanner in = new Scanner (InFile);
			int distanceX = whiteX[i] / 2 - 1;
			int start = whiteY[i] + ( distanceX * 3 );
			char last = ' '; 
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'O' && row - 2 >= 2 && start + 3 <= 42 ) {
						count ++;
						if ( last == ' ' ) {
							int xvalue = row - 2;
							int yvalue = start + 3;
							position = xvalue + "," + yvalue;
							blank ++;
						}
					} else if ( thisLine[ start ] == ' ' && last == 'O' ) {
						blank ++;
						position = row + "," + start;
					} else {
						count = 0;
					}
					last = thisLine[start];
				}
				
				start -= 3;
				in.nextLine();
				if ( count == need && blank >= 1 ) {
					in.close();
					return position;
				} // satisfied the need		
				
				row += 2;
				
			} 
			in.close();
			i++;
		}
		
		position = "";
		return position;
	} // check diagonally from right to left for white
	
	public static String blackLiveHorizontally ( File InFile, int need ) throws IOException {
		
		int i=0;
		String position = "";
		while( blackX[i] != 0 ) { // checking for black horizontally
			
			Scanner in = new Scanner (InFile);
			
			position = "";
			int row = 1;
			String line = in.nextLine();;
			do { 
				row ++;
				line = in.nextLine();
			} while ( row != blackX[i] ); // get the line which black chess in
			char[] thisLine = line.toCharArray();
			
			// check horizontally
			int blank = 0;
			int count = 1;
			for ( int j = blackY[i] - 3; j >= 0; j -=3 ) {
				if ( thisLine[j] == 'X' ) {
					count ++;
				} else if ( thisLine[j] == ' ' && ( ( j - 3 >= 0 && thisLine[j-3] == 'X' ) || ( j + 3 <= 42 && thisLine[j+3] == 'X' ) ) ){
					blank ++;
					position = row + "," + j;
				} else {
					break;
				}
				
				if ( count == need && blank >= 1 ) {
					in.close();
					return position;
				} // there is enough chess in a horizontal line and has blank 
				
			} // go left
			
			if ( position.equals("") || count != need ) {
				for ( int j = blackY[i] + 3; j <= 42; j += 3 ) {
					if ( thisLine[j] == 'X' ) {
						count ++;
					} else if ( thisLine[j] == ' ' && ( ( j - 3 >= 0 && thisLine[j-3] == 'X' ) || ( j + 3 <= 42 && thisLine[j+3] == 'X' ) ) ){
						blank ++;
						position = row + "," + j;
					} else {
						break;
					}
					
					if ( count == need && blank >= 1 ) {
						in.close();
						return position;
					} // there is enough chess in a horizontal line and has blank 
					
				} // go right
			}
			
			i++;
			in.close();
			
		} // checking horizontally
		
		position = "";
		return position;
		
	}
	public static String blackLiveVertically( File InFile, int need ) throws IOException {
		
		String position = "";
		int i=0;
		while( blackX[i] != 0 ) { // checking for black
			
			Scanner in = new Scanner (InFile);
			position = "";
					
			// check vertically	
			int blank = 0;
			int count = 0;
			int row = 2;
			String lineVertical = in.nextLine();
			char[] thisLine;
			char last = 'X';
			
			while ( row < 30 ) {
				lineVertical = in.nextLine();
				thisLine = lineVertical.toCharArray();
				if ( thisLine[blackY[i]] == 'X' ) {
					count ++;
					if ( last == ' ' && row - 2 >= 2 ) {
						int xvalue = row - 2;
						position = xvalue + "," + blackY[i];
						blank ++;
					}
				} else if ( thisLine[blackY[i]] == ' ' && last == 'X' ) {
					blank ++;
					position = row + "," + blackY[i];
				} else {
					count = 0;
					count = 0;
					blank = 0;
					position = "";
				}
				last = thisLine[blackY[i]];
				row += 2;
				if (row == 30) {
					continue;
				} else {
					in.nextLine();
				}
				if ( count == need && blank >= 1 ) {
					in.close();
					return position;						
				} // there is enough white chess in a vertical line and has blank
				
			} // searching for all this line
			in.close();
			i++;
		}
		
		position = "";
		return position;
		
	}
	public static String blackLiveDiagonallyLeft ( File InFile, int need ) throws IOException {
		
		int i=0;
		String position = "";
		while( blackX[i] != 0 ) { // checking for black
			
			int count = 0; // check diagonally from left to right
			int blank = 0;
			int row = 2;
			position = "";
			Scanner in = new Scanner (InFile);
			int distanceX = blackX[i] / 2;
			int start = blackY[i] - ( distanceX * 3 ) + 3;
			char last =' ';
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'X' ) {
						count ++;
						if ( last == ' ' && row - 2 >= 2 && start - 3 >= 0 ) {
							int xvalue = row - 2;
							int yvalue = start - 3;
							position = xvalue + "," + yvalue;
							blank ++;
						}
					} else if ( thisLine[ start ] == ' ' && last == 'X' ) {
						blank ++;
						position = row + "," + start;
					} else {
						count = 0;
					}
					last = thisLine[start];
				}
				start += 3;
				in.nextLine();
				if ( count == need && blank >= 1) {
					in.close();
					return position;
				} // satisfied the need
				
				row += 2;
				
			}
			in.close();
			i++;
		}
		
		position = "";
		return position;
	} // check diagonally from left to right for black
	public static String blackLiveDiagonallyRight ( File InFile, int need ) throws IOException {
		
		int i=0;
		String position = "";
		while( blackX[i] != 0 ) { // checking for black
			
			int count = 0; // check diagonally from right to left
			int blank = 0;
			int row = 2;
			position = "";
			Scanner in = new Scanner (InFile);
			int distanceX = blackX[i] / 2 - 1;
			int start = blackY[i] + ( distanceX * 3 );
			char last = ' '; 
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'X' ) {
						count ++;
						if ( last == ' ' && row - 2 >= 2 && start + 3 <= 42 ) {
							int xvalue = row - 2;
							int yvalue = start + 3;
							position = xvalue + "," + yvalue;
							blank ++;
						}
					} else if ( thisLine[ start ] == ' ' && last == 'X' ) {
						blank ++;
						position = row + "," + start;
					} else {
						count = 0;
					}
					last = thisLine[start];
				}
				
				start -= 3;
				in.nextLine();
				if ( count == need && blank >= 1 ) {
					in.close();
					return position;
				} // satisfied the need		
				
				row += 2;
				
			} 
			in.close();
			i++;
		}
		
		position = "";
		return position;
	} // check diagonally from right to left for black
	
	public static void printChessBlack ( File InFile, File OutFile, int x, int y ) throws IOException {
		
		PrintWriter file1 = new PrintWriter ( OutFile );
		Scanner in1 = new Scanner ( InFile );
		int row = 1;
		
		while ( in1.hasNextLine() ) {
			if ( row != x ) {
				String line = in1.nextLine();
				file1.println(line);
			} else {
				String line = in1.nextLine();
				char[] thisLine = line.toCharArray();
				thisLine[y] = 'X';
				for ( int i = 0; i < thisLine.length; i ++ ) {
					file1.print( thisLine[i] );
				}
				file1.println();
			}
			row++;
		}
		in1.close();
		file1.close();
		// change the position in "back.txt"
		
		Scanner in2 = new Scanner ( OutFile );
		PrintWriter file2 = new PrintWriter ( InFile );
		while ( in2.hasNextLine() ) {
			String line = in2.nextLine();
			file2.println(line);
		}
		in2.close();
		file2.close();
		// change "chess.txt" same as back.txt
		
	}
	public static void printChessWhite ( File InFile, File OutFile, int x, int y ) throws IOException {
	
	PrintWriter file1 = new PrintWriter ( OutFile );
	Scanner in1 = new Scanner ( InFile );
	int row = 1;
	
	while ( in1.hasNextLine() ) {
		if ( row != x ) {
			String line = in1.nextLine();
			file1.println(line);
		} else {
			String line = in1.nextLine();
			char[] thisLine = line.toCharArray();
			thisLine[y] = 'O';
			for ( int i = 0; i < thisLine.length; i ++ ) {
				file1.print( thisLine[i] );
			}
			file1.println();
		}
		row++;
	}
	in1.close();
	file1.close();
	// change the position in "back.txt"
	
	Scanner in2 = new Scanner ( OutFile );
	PrintWriter file2 = new PrintWriter ( InFile );
	while ( in2.hasNextLine() ) {
		String line = in2.nextLine();
		file2.println(line);
	}
	in2.close();
	file2.close();
	// change "chess.txt" same as back.txt
	
}

 	public static boolean blackCheckWin ( File InFile ) throws IOException {
		if ( blackCheckHorizontally( InFile, 5 ) ) {
			return true;
		} else if ( blackCheckVertically ( InFile, 5 ) ) {
			return true;
		} else if ( blackCheckDiagonallyLeft ( InFile, 5 ) ) {
			return true;
		} else if ( blackCheckDiagonallyRight ( InFile, 5 ) ) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean blackCheckHorizontally ( File InFile, int need ) throws IOException {
		
		int i=0;
		while( blackX[i] != 0 ) { // checking for black
			
			Scanner in = new Scanner (InFile);
			int row = 1;
			String line = in.nextLine();;
			do { 
				row ++;
				line = in.nextLine();
			} while ( row != blackX[i] );// get the line which black chess in
			char[] thisLine = line.toCharArray();
			
			// check horizontally
			int count = 1;
			for ( int j = blackY[i] - 3; j >= 0; j -=3 ) {
				if ( thisLine[j] == 'X' ) {
					count ++;
				} else {
					break;
				}
				if ( count == need ) {
					in.close();
					return true;
				} // satisfied the need
			} // go left
			for ( int j = blackY[i] + 3; j <= 42; j += 3 ) {
				if ( thisLine[j] == 'X' ) {
					count ++;
				} else {
					break;
				}
				if ( count == need ) {
					in.close();
					return true;
				} // satisfied the need
			} // go right
			
			i++;
			in.close();
		}
		return false;
		
	} // check horizontally for black	
	public static boolean blackCheckVertically ( File InFile, int need ) throws IOException {
		
		int i=0;
		while( blackX[i] != 0 ) { // checking for black
			Scanner in = new Scanner (InFile);
			
			// check vertically	
			int count = 0;
			int row = 2;
			String lineVertical = in.nextLine();
			char[] thisLine;
			
			while ( row < 30 ) {
				lineVertical = in.nextLine();
				thisLine = lineVertical.toCharArray();
				if ( thisLine[blackY[i]] == 'X' ) {
					count ++;
				} else {
					count = 0 ;
				} // get that line in vertical line
				row += 2;
				if (row == 30) {
					continue;
				} else {
					in.nextLine();
				}
				if ( count == need ) {
					in.close();
					return true;						
				} // satisfied the need
			} // searching for all this line
			in.close();
			i++;
		}
		return false;
		
	} // check vertically for black
	public static boolean blackCheckDiagonallyLeft ( File InFile, int need ) throws IOException {
		
		int i=0;
		while( blackX[i] != 0 ) { // checking for black
			
			int count = 0; // check diagonally from left to right
			Scanner in = new Scanner (InFile);
			count = 0;
			int distanceX = blackX[i] / 2;
			int start = blackY[i] - ( distanceX * 3 ) + 3;
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'X' ) {
						count ++;
					} else {
						count = 0;
					}
				} // get the line, make sure it is in the chess board, check for black
				start += 3;
				in.nextLine();
				if ( count == need ) {
					in.close();
					return true;
				} // satisfied the need
				
			}
			in.close();
			i++;
		}
		return false;
	} // check diagonally from left to right for black
	public static boolean blackCheckDiagonallyRight ( File InFile, int need ) throws IOException {
		
		int i=0;
		while( blackX[i] != 0 ) { // checking for black
			
			int count = 0; // check diagonally from left to right
			Scanner in = new Scanner (InFile);
			count = 0;
			int distanceX = blackX[i] / 2 - 1;
			int start = blackY[i] + ( distanceX * 3 ) ;
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'X' ) {
						count ++;
					} else {
						count = 0;
					}
				} // get the line, make sure it is in the chess board, check for black
				start -= 3;
				in.nextLine();
				if ( count == need ) {
					in.close();
					return true;
				} // satisfied the need		
				
			} 
			in.close();
			i++;
		}
		return false;
	} // check diagonally from right to left for black
	
	public static boolean whiteCheckWin ( File InFile ) throws IOException {
		if ( whiteCheckHorizontally( InFile, 5 ) ) {
			return true;
		} else if ( whiteCheckVertically ( InFile, 5 ) ) {
			return true;
		} else if ( whiteCheckDiagonallyLeft ( InFile, 5 ) ) {
			return true;
		} else if ( whiteCheckDiagonallyRight ( InFile, 5 ) ) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean whiteCheckHorizontally ( File InFile, int need ) throws IOException {
		
		int i=0;
		while( whiteX[i] != 0 ) { // checking for white
			
			Scanner in = new Scanner (InFile);
			int row = 0;
			String line = in.nextLine();;
			do { 
				line = in.nextLine();
				in.nextLine();
				row += 2;
			} while ( row != whiteX[i] );// get the line which white chess in
			char[] thisLine = line.toCharArray();
			
			// check horizontally
			int count = 1;
			for ( int j = whiteY[i] - 3; j >= 0; j -=3 ) {
				if ( thisLine[j] == 'O' ) {
					count ++;
				} else {
					break;
				}
				if ( count >= need ) {
					in.close();
					return true;
				} // satisfied the need
			} // go left

			
			for ( int j = whiteY[i] + 3; j <= 42; j += 3 ) {
				if ( thisLine[j] == 'O' ) {
					count ++;
				} else {
					break;
				}
				if ( count == need ) {
					in.close();
					return true;
				} // satisfied the need
			} // go right
			
			i++;
			in.close();
		}
		return false;
		
	} // check horizontally for white
	public static boolean whiteCheckVertically ( File InFile, int need ) throws IOException {
		
		int i=0;
		while( whiteX[i] != 0 ) { // checking for white
			Scanner in = new Scanner (InFile);
			
			// check vertically	
			int count = 0;
			int row = 2;
			String lineVertical = in.nextLine();
			char[] thisLine;
			
			while ( row < 30 ) {
				lineVertical = in.nextLine();
				thisLine = lineVertical.toCharArray();
				if ( thisLine[whiteY[i]] == 'O' ) {
					count ++;
				} else {
					count = 0;
				} // get that vertical line, check for white
				row += 2;
				if (row == 30) {
					continue;
				} else {
					in.nextLine();
				}
				if ( count == need ) {
					in.close();
					return true;						
				} // satisfied the need
			} // searching for all this line
			in.close();
			i++;
		}
		return false;
		
	} // check vertically for white
	public static boolean whiteCheckDiagonallyLeft ( File InFile, int need ) throws IOException {
		
		int i=0;
		while( whiteX[i] != 0 ) { // checking for white
			
			int count = 0; // check diagonally from left to right
			Scanner in = new Scanner (InFile);
			count = 0;
			int distanceX = whiteX[i] / 2;
			int start = whiteY[i] - ( distanceX * 3 ) + 3;
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'O' ) {
						count ++;
					} else {
						count = 0;
					}
				} // get the line, make sure it is in the chess board, check for white
				start += 3;
				in.nextLine();
				if ( count == need ) {
					in.close();
					return true;
				} // satisfied the need
				
			}
			in.close();
			i++;
		}
		return false;
	} // check diagonally from left to right for white
	public static boolean whiteCheckDiagonallyRight ( File InFile, int need ) throws IOException {
		
		int i=0;
		while( whiteX[i] != 0 ) { // checking for white
			
			int count = 0; // check diagonally from left to right
			Scanner in = new Scanner (InFile);
			count = 0;
			int distanceX = whiteX[i] / 2 - 1;
			int start = whiteY[i] + ( distanceX * 3 ) ;
			
			in.nextLine();
			while ( in.hasNextLine() ) {
				
				String Linediagonal = in.nextLine();
				char[] thisLine = Linediagonal.toCharArray();
				if ( start >= 0 && start <= 42 ) {
					if ( thisLine[ start ] == 'O' ) {
						count ++;
					} else {
						count = 0;
					}
				} // get the line, make sure it is in the chess board, check for white
				start -= 3;
				in.nextLine();
				if ( count == need ) {
					in.close();
					return true;
				} // satisfied the need		
				
			} 
			in.close();
			i++;
		}
		
		return false;
	} // check diagonally from right to left for white
	
	public static boolean checkPosition ( File InFile, String position ) throws IOException {
		
		PrintWriter file = new PrintWriter( new FileWriter( "chess.txt", true ) );
		// create writer and reader
		int xvalue, yvalue;
		
		if ( position.equalsIgnoreCase("quit") ) {
			file.close();
			System.out.println("You give up");
			return true;
		}
		
		String[] xy = position.split(",");
		try {
			xvalue = Integer.valueOf(xy[0]);
			yvalue = Integer.valueOf(xy[1]);
		} catch ( Exception e ) {
			System.out.println( "Invalid input. PLease try again" );
			System.out.println();
			file.close();
			return false;
		} // make sure the position is valid
		
		
		xvalue = xvalue * 2;
		yvalue = ( yvalue - 1 ) * 3;
		// find the value in the chess board
		
		if(  xvalue >= 1 && xvalue <= 30 && yvalue >= 0 && yvalue <= 42 ) { // chess not out of bound
			
			int i = 0;
			while ( blackX[i] != 0 || whiteX[i] != 0 ) { // black or white chess exist
				
				if ( ( xvalue == blackX[i] && yvalue == blackY[i] ) || ( xvalue == whiteX[i] && yvalue == whiteY[i] ) ) {
					System.out.println( "There is already a chess there. Please try again." );
					System.out.println();
					file.close();
					return false;
				} // check if there is already a chess
				i++;
				
			} // if for all chess x y value are not equal, position is good
			
			System.out.println("You placed a chess at " + position + ".");
			System.out.println(); 
			file.close();
			return true;
			// good position to play
				
		} else {
			
			System.out.println("The chess should be place inside 15 * 15 chess board. Please try again.");
			System.out.println();
			file.close();
			return false;
			// chess out of bound
			
		}

	} // check position for user's input
	public static void printOutInFile ( File InFile1, File InFile2 ) throws IOException{
		
		PrintWriter file1 = new PrintWriter(InFile1);
		
		for(int i=1;i<=15;i++) {
			if ( i < 10 ) {
				file1.print(i + "  ");
			} else {
				file1.print(i + " ");
			}
		} // create the lines from 1 - 15
		
		file1.println();
		
		for (int i=1;i<=15;i++) {
			for(int j=1;j<=15;j++) {
					file1.print("  " + "|");
			}
			file1.println();
			file1.println("---------------------------------------------");
		} // make the board more organized and easy to play
		
		file1.close();
		
		PrintWriter file2 = new PrintWriter(InFile2);
		
		for(int i=1;i<=15;i++) {
			if ( i < 10 ) {
				file2.print(i + "  ");
			} else {
				file2.print(i + " ");
			}
		} // create the lines from 1 - 15
		
		file2.println();
		
		for (int i=1;i<=15;i++) {
			for(int j=1;j<=15;j++) {
					file2.print("  " + "|");
			}
			file2.println();
			file2.println("---------------------------------------------");
		} // make the board more organized and easy to play
		
		file2.close();
		
	}		
	public static void printOut (File InFile) throws IOException{
		
		Scanner read = new Scanner (InFile);
		int dataCount = 0;
		
		while (read.hasNextLine()) {
			
			String lines = read.nextLine();
			if( dataCount > 0 && ( dataCount%2 != 0 ) ) {
				
				int line = ( dataCount + 1 ) / 2;
				if( dataCount < 19 ) {
					System.out.println( line + " " + lines);
				} else {
					System.out.println( line + lines);
				}
				
			} else {
				
				System.out.println( "  " + lines);
					
			}
			dataCount ++;
		} // print the chess board to the screen
		
		read.close();
		
	}
		
	public static void main ( String[] args ) throws IOException{
		
		File back = new File ( "back.txt" );
		File file = new File ( "chess.txt" );
		Scanner in = new Scanner ( System.in );
		// create the file
		
		printOutInFile( file, back ); // create and clear the board
		
		System.out.println("Game: Gomoku");
		System.out.println();
		
		System.out.println( "Rules: Each player takes turn to place their own piece. \n"
				+"       Whoever gets 5 straight pieces in a row in either vertical, horizontal or diagonal direction wins. \n"
				+"       Pieces are never taken off the board, and once the whole board is filled, the game draws.\n" );
		
		System.out.println( "You are going to play with the computer" ); // state the basic rules
		
		printOut( file ); // print the board to screen
		System.out.println();
		
		System.out.println( "We use 'X' replace balck chess and 'O' replace white chess." );
		System.out.println();
		
		System.out.println( "Please choose a game mode (normal / hard)" );
		String mode;
		boolean modeCheck = false;
		do {
			
			mode = in.nextLine();
			if( mode.equalsIgnoreCase( "normal" ) || mode.equalsIgnoreCase( "hard" ) ) {
				modeCheck = true;
			} else {
				System.out.println( "Invalid input, Please try again" );
				System.out.println();
			}
			
		} while ( !modeCheck );
		System.out.println();
		// choose game mode normal or hard
		
		if ( mode.equalsIgnoreCase( "normal" ) ) {
			
			System.out.println( "Do you want to play first or second (first black, second white) ( First / Second )" );
			// choose first or second
			
			String first;
			boolean input = false;
			do {
				
				first = in.nextLine();
				if( first.equalsIgnoreCase( "first" ) || first.equalsIgnoreCase( "second" ) ) {
					input = true;
				} else {
				System.out.println( "Invalid input, Please try again" );
				}
				
			} while ( !input );
			// choose first or second - checking the input
			
			int turn = 0;
			
			if ( first.equalsIgnoreCase( "first" ) ) { // user goes first
				
				System.out.println( "You're the first one. Go ahead" );
				System.out.println();
				
				boolean win = false;
				
				do {
					
					// user play
					System.out.println( "Please enter the position like this 'a,b' or you can enter 'quit' to stop." );
					System.out.println( "'a' represent vertical position and 'b' represent horizontal position" );
					System.out.println( "e.g. position 10,8 means row 10 column 8" );
					String position = in.nextLine();
					
					while (! checkPosition( file, position )) {
						System.out.println( "Please enter the position like this 'a,b'." );
						position = in.nextLine();
					} // check position is valid or not
					
					if ( position.equalsIgnoreCase("quit") ) {
						break;
					} // give up
					
					String[] xy = position.split(",");
					int xvalue = Integer.valueOf(xy[0]);
					int yvalue = Integer.valueOf(xy[1]);
					xvalue = xvalue * 2;
					yvalue = ( yvalue - 1 ) * 3;
					
					blackX[turn] = xvalue;
					blackY[turn] = yvalue;
					// save the chess position in array
					
					printChessBlack( file, back, xvalue, yvalue );
					// print the chess to the file
					
					printOut( file );
					// print the chess board to screen
					
					if ( blackCheckWin( file )) {
						win = true;
						System.out.println( "Black wins." );
						break;
					} else if ( turn == 224 ) {
						win = true;
						System.out.println( "Dead heat. No one wins" );
						break;
					}
					// check win for black
					
					computerPlayWhite( file, back, turn );
					// computer play
					
					printOut( file );
					// print the chess board to screen
					
					if ( whiteCheckWin( file )) {
						win = true;
						System.out.println( "White wins." );
						break;
					} else if ( turn == 224 ) {
						win = true;
						System.out.println( "Dead heat. No one wins" );
						break;
					}
					// check win for white
					
					turn ++;
					
				}while(!win);
				
				
				
		} else { // computer goes first
			
				boolean win = false;
				
				System.out.println( "You're the second one. Please wait for the computer to play" );
				
				do {
					
					// computer play
					computerPlayBlack( file, back, turn );
					
					printOut( file );
					// print the chess board to screen
					
					if ( blackCheckWin( file )) {
						win = true;
						System.out.println( "Black wins." );
						break;
					} else if ( turn == 224 ) {
						win = true;
						System.out.println( "Dead heat. No one wins" );
						break;
					}
					// check win for black
					
					// user play
					System.out.println( "Please enter the position like this 'a,b' or you can enter 'quit' to stop." );
					System.out.println( "'a' represent vertical position and 'b' represent horizontal position" );
					System.out.println( "e.g. position 10,8 means row 10 column 8" );
					String position = in.nextLine();
					
					while (! checkPosition( file, position )) {
						System.out.println( "Please enter the position like this 'a,b'." );
						position = in.nextLine();
					} // check position is valid or not
					
					if ( position.equalsIgnoreCase("quit") ) {
						break;
					} // give up
					
					String[] xy = position.split(",");
					int xvalue = Integer.valueOf(xy[0]);
					int yvalue = Integer.valueOf(xy[1]);
					xvalue = xvalue * 2;
					yvalue = ( yvalue - 1 ) * 3;
					
					whiteX[turn] = xvalue;
					whiteY[turn] = yvalue;
					// save the chess position in array
					
					printChessWhite( file, back, xvalue, yvalue );
					// print the chess to the file
					
					printOut( file );
					// print the chess board to screen
				
					if ( whiteCheckWin( file )) {
						win = true;
						System.out.println( "White wins." );
						break;
					} else if ( turn == 224 ) {
						win = true;
						System.out.println( "Dead heat. No one wins" );
						break;
					} // check win for white
					
					
					turn ++;
				
				}while(!win);
			
			} 
			// normal
			
		} else if ( mode.equalsIgnoreCase( "hard" ) ) {
			
			
			System.out.println( "Do you want to play first or second (first black, second white) ( First / Second )" );
			// choose first or second
			
			String first;
			boolean input = false;
			do {
				
				first = in.nextLine();
				if( first.equalsIgnoreCase( "first" ) || first.equalsIgnoreCase( "second" ) ) {
					input = true;
				} else {
				System.out.println( "Invalid input, Please try again" );
				}
				
			} while ( !input );
			// choose first or second - checking the input
			
			int turn = 0;
			
			if ( first.equalsIgnoreCase( "first" ) ) { // user goes first
				
				System.out.println( "You're the first one. Go ahead" );
				System.out.println();
				
				boolean win = false;
				
				do {
					
					// user play
					System.out.println( "Please enter the position like this 'a,b' or you can enter 'quit' to stop." );
					System.out.println( "'a' represent vertical position and 'b' represent horizontal position" );
					System.out.println( "e.g. position 10,8 means row 10 column 8" );
					String position = in.nextLine();
					
					while (! checkPosition( file, position )) {
						System.out.println( "Please enter the position like this 'a,b'." );
						position = in.nextLine();
					} // check position is valid or not
					
					if ( position.equalsIgnoreCase("quit") ) {
						break;
					} // give up
					
					String[] xy = position.split(",");
					int xvalue = Integer.valueOf(xy[0]);
					int yvalue = Integer.valueOf(xy[1]);
					xvalue = xvalue * 2;
					yvalue = ( yvalue - 1 ) * 3;
					
					blackX[turn] = xvalue;
					blackY[turn] = yvalue;
					// save the chess position in array
					
					printChessBlack( file, back, xvalue, yvalue );
					// print the chess to the file
					
					printOut( file );
					// print the chess board to screen
					
					if ( blackCheckWin( file )) {
						win = true;
						System.out.println( "Black wins." );
						break;
					} else if ( turn == 224 ) {
						win = true;
						System.out.println( "Dead heat. No one wins" );
						break;
					}
					// check win for black
					
					computerPlayWhiteHard( file, back, turn );
					// computer play
					
					printOut( file );
					// print the chess board to screen
					
					if ( whiteCheckWin( file )) {
						win = true;
						System.out.println( "White wins." );
						break;
					} else if ( turn == 224 ) {
						win = true;
						System.out.println( "Dead heat. No one wins" );
						break;
					}
					// check win for white
					
					turn ++;
					
				}while(!win);
				
				
				
		} else { // computer goes first
			
				boolean win = false;
				
				System.out.println( "You're the second one. Please wait for the computer to play" );
				
				do {
					
					// computer play
					computerPlayBlackHard( file, back, turn );
					
					printOut( file );
					// print the chess board to screen
					
					if ( blackCheckWin( file )) {
						win = true;
						System.out.println( "Black wins." );
						break;
					} else if ( turn == 224 ) {
						win = true;
						System.out.println( "Dead heat. No one wins" );
						break;
					}
					// check win for black
					
					// user play
					System.out.println( "Please enter the position like this 'a,b' or you can enter 'quit' to stop." );
					System.out.println( "'a' represent vertical position and 'b' represent horizontal position" );
					System.out.println( "e.g. position 10,8 means row 10 column 8" );
					String position = in.nextLine();
					
					while ( !checkPosition( file, position ) ) {
						System.out.println( "Please enter the position like this 'a,b'." );
						position = in.nextLine();
					} // check position is valid or not
					
					if ( position.equalsIgnoreCase("quit") ) {
						break;
					} // give up
					
					String[] xy = position.split(",");
					int xvalue = Integer.valueOf(xy[0]);
					int yvalue = Integer.valueOf(xy[1]);
					xvalue = xvalue * 2;
					yvalue = ( yvalue - 1 ) * 3;
					
					whiteX[turn] = xvalue;
					whiteY[turn] = yvalue;
					// save the chess position in array
					
					printChessWhite( file, back, xvalue, yvalue );
					// print the chess to the file
					
					printOut( file );
					// print the chess board to screen
				
					if ( whiteCheckWin( file )) {
						win = true;
						System.out.println( "White wins." );
						break;
					} else if ( turn == 224 ) {
						win = true;
						System.out.println( "Dead heat. No one wins" );
						break;
					} // check win for white
					
					
					turn ++;
				
				}while(!win);
			
			}
			// Hard
			
		}
		
		System.out.println( "Game ends." );
		
		in.close();
		
		
	}// main code
	
}
