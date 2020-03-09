package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List <Lab> labs;

    public Student() {
        this(null);
        labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) { this.labs = labs; }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if(getLab(labName)== null) {
            throw new UnsupportedOperationException();
        }
        else if (getLab(labName).getName().equals(labName))
            getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                return lab.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(labs.get(1).getName() + " > " + labs.get(1).getStatus() + "\n");
        sb.append(labs.get(0).getName() + " > " + labs.get(0).getStatus());

        return sb.toString();
    }
}
