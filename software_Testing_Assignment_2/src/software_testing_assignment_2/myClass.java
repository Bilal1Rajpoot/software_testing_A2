
package software_testing_assignment_2;

public class myClass {
    public int calculateAggeagate(int matricMarks, int fscMarks, int admissionTestMarks) {
        int result;
        if(matricMarks>=50 && matricMarks<=100 && fscMarks>=50 && fscMarks<=100 && admissionTestMarks>=50 && admissionTestMarks<=100 ){
            result=(20/100*matricMarks)+(30/100*fscMarks)+(50/100*admissionTestMarks);
 
        }
        else{
            return -1;
        }
        return 0;
    }
    
    public int calculateFinalResult(int mid, int finalMarks ,int others){
        int result;
        if(mid>=0 && mid<=20 && finalMarks>=0 && finalMarks<=40 && others>=0 && others<=40 ){
            result=mid+finalMarks+others;
 
        }
        else{
            return -1;
        }
        return 0;
    }
    
    public int fineCalculate(int leave){
    if(leave>=0 && leave<=8){
        if(leave<4)
            return 0;
        else
            return (leave-4)*200;
    }
    else
        return -1;    
    }
}
