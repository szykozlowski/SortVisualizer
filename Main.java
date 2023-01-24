 
public class Main
{
    // instance variables - replace the example below with your own
    private static boolean sort = true;
    static double[] mySort = new double[100];
    private static int listSwap;
    static double hold;
    static double max = 0;
    public static void main(String args[])
    {
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setCanvasSize(1000,1000);
        for(int i = 0;i<mySort.length;i++){
            mySort[i] = (Math.random() * 100);
        }
        for(int i = 0; i <mySort.length;i++){
            if(mySort[i] > max){
                max = mySort[i];                
            }
        }
        StdDraw.setScale(0,max);
        while(sort){
            sort = false;
            for(int i = 0;i<mySort.length - 1;i++){
                if(mySort[i] > mySort[i+1]){
                    StdDraw.clear();
                    sort = true;
                    hold = mySort[i];
                    mySort[i] = mySort[i+1];
                    mySort[i + 1] = hold;
                    listSwap = i;
                    for(int k = 0;k< mySort.length;k++){
                        if(k  == listSwap + 1){
                            StdDraw.setPenColor(StdDraw.RED);
                        }
                        else{
                            StdDraw.setPenColor((int)(255/(mySort[k] + 1) + mySort[k]),(int)(255/(mySort[k] + 1) + mySort[k]),(int)(255/(mySort[k]+ 1) + mySort[k]));
                            //StdDraw.setPenColor((int)mySort[k],(int)(mySort[k] * 1.5),(int)mySort[k] * 2);
                            //StdDraw.setPenColor((int)(255 - 0.8*k),(int)(255 - 0.4 * k),(int)(255 - 0.1*k));
                        }
                        StdDraw.filledRectangle(((k*(max/mySort.length)) + (max/mySort.length)/2),(((mySort[k]/max)/2) * max),(max/mySort.length)/2,((mySort[k]/max)/2) * max);
                        System.out.println(mySort[k]);

                    }                   
                    StdDraw.show();
                    StdDraw.pause(1);
                }

            }           
        }
        for(int k = 0;k< mySort.length;k++){
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledRectangle(((k*(max/mySort.length)) + (max/mySort.length)/2),(((mySort[k]/max)/2) * max),(max/mySort.length)/2,((mySort[k]/max)/2) * max);  
            System.out.print(mySort[k] + ", ");
            StdDraw.show();
            StdDraw.pause(15);
        }
    }
}
