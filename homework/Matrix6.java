package com.alexCazares;

/**
 *
 * @author Alejandro Cazares
 */
public class Matrix6 {
    int n=3,m=3;
    int [][]matrix={{1,2,3},{4,0,5},{6,7,8}};
    
    public static void main(String[] args) {
        Matrix6 obj = new Matrix6();
        obj.eval();
        obj.print();
    }
    
    public void eval() {
        for(int i=0; i<n; i++){
            for(int ii=0; ii<m; ii++){
                if(matrix[i][ii]==0){
                    for(int mm=0;mm<m;mm++){
                        matrix[i][mm]=0;
                    }
                    for(int nn=0;nn<n;nn++){
                        matrix[nn][ii]=0;
                    }
                    return;
                }//System.out.print(matrix[i][ii]+" ");
            }//System.out.println("");
        }
    }
    
    public void print() {
        for(int i=0; i<n; i++){
            for(int ii=0; ii<m; ii++){
                System.out.print(matrix[i][ii]+" ");
            }System.out.println("");
        }
    }

}
