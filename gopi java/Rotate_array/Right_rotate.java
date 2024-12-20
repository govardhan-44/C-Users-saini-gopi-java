package Rotate_array;

import java.util.Scanner;

public class Right_rotate {
    

    static void swap(int[] arr, int s, int s1){
        int temp = arr[s];
        arr[s] = arr[s1];
        arr[s1] = temp;
    }

    static void Reverse(int[] arr, int start, int end){

        while(start<=end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void right_Rotate(int[] arr, int n, int times){
        Reverse(arr, 0, n-times-1);
        Reverse(arr, n-times, n-1);
        Reverse(arr, 0, n-1);
    }

    static void print(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int times = sc.nextInt();
        sc.close();
        print(arr, n);
        right_Rotate(arr, n, times);
        print(arr, n);
    }
}


int cnt =0;

int n = strlen(W);

for(int i=0; i<n; i++){
    char c = W[i][strlen(W[i])-1];
    if(c=='A' || c=='E' || c=='I'|| c=='O'|| c=='U'|| c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
        cnt++;
    }
}

return cnt;



int n = array_length;

BEGIN
    DECLARE variables n, a[50], b[50], k, flag
    PRINT "Enter the value of n"
    READ n
    PRINT "Numbers said by Pinky"
    FOR i IN 0 to n-1 DO
        READ a[i]
    END FOR
    PRINT "Numbers said by Mary"    
    FOR i IN 0 to n-1 DO
        READ b[i]
    END FOR

    SET k=n-1, flag=0                 
    FOR j IN 0 to n-1 DO              
        IF a[j]==b[k] THEN        
            k=k-1
        ELSE
            flag=1
            BREAK
        END IF   
    END FOR
    IF flag==0 THEN
        PRINT "Yes, it is in reverse order"
    ELSE
        PRINT "No, it is not in reverse order"
    END IF
END