package F2Binary;
public class Cube {
    private boolean solved;
    private int[] yellowFace = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    private int[] blueFace = {9, 10, 11, 12, 13, 14, 15, 16, 17};
    private int[] whiteFace = {18, 19, 20, 21, 22, 23, 24, 25, 26};
    private int[] greenFace = {27, 28, 29, 30, 31, 32, 33, 34, 35};
    private int[] orangeFace = {36, 37, 38, 39, 40, 41, 42, 43, 44};
    private int[] redFace = {45, 46, 47, 48, 49, 50, 51, 52, 53};
    public Cube() {
        solved = false;
    }
    public void setSolvedState(boolean solved){
        this.solved = solved;
    }
    public boolean getSolvedState(){
        return solved;
    }

    //Only used for debugging
    /*
    public int[] getYellowFace() {
        return yellowFace;
    }

    public int[] getBlueFace() {
        return blueFace;
    }

    public int[] getWhiteFace() {
        return whiteFace;
    }

    public int[] getGreenFace() {
        return greenFace;
    }
    public int[] getOrangeFace() {
        return orangeFace;
    }

    public int[] getRedFace() {
        return redFace;
    }
     */

    public void printMatrix() {
        for (int items : yellowFace) {
            System.out.print(items + " ");
        }
        System.out.println();
        for (int items : blueFace) {
            System.out.print(items + " ");
        }
        System.out.println();
        for (int items : whiteFace) {
            System.out.print(items + " ");
        }
        System.out.println();
        for (int items : greenFace) {
            System.out.print(items + " ");
        }
        System.out.println();
        for (int items : orangeFace) {
            System.out.print(items + " ");
        }
        System.out.println();
        for (int items : redFace) {
            System.out.print(items + " ");
        }
        System.out.println();
    }

    //rTransform = right transformation or 90 degrees clockwise
    public void rTransform(){
        int yellowOne = yellowFace[2];
        int yellowTwo = yellowFace[5];
        int yellowThree = yellowFace[8];
        yellowFace[2] = blueFace[2];
        yellowFace[5] = blueFace[5];
        yellowFace[8] = blueFace[8];
        blueFace[2] = whiteFace[2];
        blueFace[5] = whiteFace[5];
        blueFace[8] = whiteFace[8];
        whiteFace[2] = greenFace[2];
        whiteFace[5] = greenFace[5];
        whiteFace[8] = greenFace[8];
        greenFace[2] = yellowOne;
        greenFace[5] = yellowTwo;
        greenFace[8] = yellowThree;
        printMatrix();
    }
    //rPrimeTransform = right prime transformation or 90 degrees counter-clockwise
    public void rPrimeTransform(){
        int yellowOne = yellowFace[2];
        int yellowTwo = yellowFace[5];
        int yellowThree = yellowFace[8];
        yellowFace[2] = greenFace[2];
        yellowFace[5] = greenFace[5];
        yellowFace[8] = greenFace[8];
        greenFace[2] = whiteFace[2];
        greenFace[5] = whiteFace[5];
        greenFace[8] = whiteFace[8];
        whiteFace[2] = blueFace[2];
        whiteFace[5] = blueFace[5];
        whiteFace[8] = blueFace[8];
        blueFace[2] = yellowOne;
        blueFace[5] = yellowTwo;
        blueFace[8] = yellowThree;
        printMatrix();
    }
    //rTransform = right transformation or 90 degrees clockwise
    public void lTransform(){
        int yellowOne = yellowFace[0];
        int yellowTwo = yellowFace[3];
        int yellowThree = yellowFace[6];
        yellowFace[0] = greenFace[0];
        yellowFace[3] = greenFace[3];
        yellowFace[6] = greenFace[6];
        greenFace[0] = whiteFace[0];
        greenFace[3] = whiteFace[3];
        greenFace[6] = whiteFace[6];
        whiteFace[0] = blueFace[0];
        whiteFace[3] = blueFace[3];
        whiteFace[6] = blueFace[6];
        blueFace[0] = yellowOne;
        blueFace[3] = yellowTwo;
        blueFace[6] = yellowThree;
        printMatrix();
    }
    //lPrimeTransform = left prime transformation or 90 degrees counter-clockwise
    public void lPrimeTransform(){
        int yellowOne = yellowFace[0];
        int yellowTwo = yellowFace[3];
        int yellowThree = yellowFace[6];
        yellowFace[0] = blueFace[0];
        yellowFace[3] = blueFace[3];
        yellowFace[6] = blueFace[6];
        blueFace[0] = whiteFace[0];
        blueFace[3] = whiteFace[3];
        blueFace[6] = whiteFace[6];
        whiteFace[0] = greenFace[0];
        whiteFace[3] = greenFace[3];
        whiteFace[6] = greenFace[6];
        greenFace[0] = yellowOne;
        greenFace[3] = yellowTwo;
        greenFace[6] = yellowThree;
        printMatrix();
    }
    //fTransform = front transformation or a 90 degree clockwise turn of the front face
    public void fTransform(){
        int yellowOne = yellowFace[6];
        int yellowTwo = yellowFace[7];
        int yellowThree = yellowFace[8];
        yellowFace[6] = orangeFace[8];
        yellowFace[7] = orangeFace[5];
        yellowFace[8] = orangeFace[2];
        //TODO
        //find an efficient transformation for F
        int [] temp = new int[9];
        temp[0]=blueFace[6];
        temp[1]=blueFace[3];
        temp[2]=blueFace[0];
        temp[3]=blueFace[7];
        temp[4]=blueFace[4];
        temp[5]=blueFace[1];
        temp[6]=blueFace[8];
        temp[7]=blueFace[5];
        temp[8]=blueFace[2];
        orangeFace[2] = whiteFace[0];
        orangeFace[5] = whiteFace[1];
        orangeFace[8] = whiteFace[2];
        whiteFace[0] = redFace[6];
        whiteFace[1] = redFace[3];
        whiteFace[2] = redFace[0];
        redFace[0] = yellowOne;
        redFace[3] = yellowTwo;
        redFace[6] = yellowThree;
        blueFace = temp;
        printMatrix();
    }
    //fPrimeTransform = front transformation or a 90 degree counter-clockwise turn of the front face
    public void fPrimeTransform(){
        int yellowOne = yellowFace[6];
        int yellowTwo = yellowFace[7];
        int yellowThree = yellowFace[8];
        yellowFace[6] = redFace[0];
        yellowFace[7] = redFace[3];
        yellowFace[8] = redFace[6];
        //TODO
        //find an efficient transformation for F'
        int [] temp = new int[9];
        temp[0]=blueFace[2];
        temp[1]=blueFace[5];
        temp[2]=blueFace[8];
        temp[3]=blueFace[1];
        temp[4]=blueFace[4];
        temp[5]=blueFace[7];
        temp[6]=blueFace[0];
        temp[7]=blueFace[3];
        temp[8]=blueFace[6];
        redFace[0] = whiteFace[2];
        redFace[3] = whiteFace[1];
        redFace[6] = whiteFace[0];
        whiteFace[0] = orangeFace[2];
        whiteFace[1] = orangeFace[5];
        whiteFace[2] = orangeFace[8];
        orangeFace[2] = yellowThree;
        orangeFace[5] = yellowTwo;
        orangeFace[8] = yellowOne;
        blueFace = temp;
        printMatrix();
    }

}