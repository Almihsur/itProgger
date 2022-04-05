public class Arrays {
    public static void main(String[] args){
/*
int i = 9;
int j = 4;
int a,b,c = 0;

int[][] myArr = new int[i][j];
for (a=0;a < i;a++){
    for (b=0;b<j;b++){
        myArr[a][b] = c++;
        System.out.print(c+9+" ");
    }
    System.out.println();
} */


        int a = 3;
        int b = 5;


        int[][] arr = new int[a][b];
        int max = arr[0][0];
        int min = arr[0][0];
        int midle = 0;

        for (int i=0;i<arr.length;i++){
            for (int j = 0;j<b;j++){
                int k = (int)(Math.random()*10);
            arr[i][j] = k++;
                if (max < arr[i][j])
                    max = arr[i][j];
                if (min > arr[i][j])
                    min = arr[i][j];
            System.out.print(k+" * ");
        }
            System.out.print("I min = "+min+" ;");
            System.out.println("I max = "+max);
    }

/*
        for (int i = 0;i<arr.length;i++){
            if (max < arr[i][j])
                max = arr[i][j];
            if (min > arr[i])
                min = arr[i];
            midle += arr[i]/arr.length;
        }
        System.out.println();
        System.out.println("I max = "+max);
        System.out.println("I min = "+min);
        System.out.println("I midle = "+midle); */
    }
}
