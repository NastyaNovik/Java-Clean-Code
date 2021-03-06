package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes experimentalType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes experimentalType, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object plane) {
        return this == plane || plane instanceof ExperimentalPlane || super.equals(plane) || classificationLevel == ((ExperimentalPlane)plane).classificationLevel || experimentalType == ((ExperimentalPlane)plane).experimentalType;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
        ", experimentalType=" + experimentalType +
        ", classificationLevel=" + classificationLevel +
        '}');
    }
}
