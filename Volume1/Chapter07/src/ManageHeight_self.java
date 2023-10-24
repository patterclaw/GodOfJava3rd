public class ManageHeight_self {
    public static void main(String[] args) {
        ManageHeight_self manageHeight=new ManageHeight_self();
        manageHeight.setDate();
        for(int i=1;i<=5;i++)
            manageHeight.printAverage(i);
        //manageHeight.printHeight(i);
    }
    int[][]gradeHeights=new int[5][];
    public void setDate() {

        gradeHeights[0]=new int[] {170,180,173,175,177};
        gradeHeights[1]=new int[] {160,165,167,186};
        gradeHeights[2]=new int[] {158,177,187,176};
        gradeHeights[3]=new int[] {173,182,181};
        gradeHeights[4]=new int[] {170,180,165,177,172};

    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:"+classNo);
            for(int height : gradeHeights[classNo-1]){
                System.out.println(height);
            }
    }

    public void printAverage(int classNo) {
        System.out.println("Class No.:" + classNo);
        double sum=0;
        double avg=0;
        for(double height: gradeHeights[classNo-1])
            sum+=height;
        avg = sum / gradeHeights[classNo-1].length;
        System.out.println("Height average:"+avg);
    }

}
