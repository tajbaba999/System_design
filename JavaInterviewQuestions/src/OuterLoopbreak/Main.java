package OuterLoopbreak;

public class Main {
    public static void main(String[] args) {
        //Nomal approach
        boolean breakouterLoop = false;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                //for some condition i trying to getout of both the looops
                if(i == 2 && j == 9){
                    breakouterLoop = true;
                    break;
                }
            }
            if(breakouterLoop == true){
                break;
            }
        }


        // Label approach
        outerLoop:
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(i ==2 && j ==8){
                  break outerLoop; // labeled break statement
                }
            }
        }
    }
}
