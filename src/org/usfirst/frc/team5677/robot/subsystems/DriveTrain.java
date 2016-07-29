
package org.usfirst.frc.team5677.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import ed.wpi.first.wpilibj.Spark;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    public Spark leftMotor1, leftMotor2, rightMotor1, rightMotor2;

    public DriveTrain(int leftMotor1, int leftMotor2, int rightMotor1, int rightMotor2){
        this.leftMotor1 = new Spark(leftMotor1); 
        this.leftMotor2 = new Spark(leftMotor2);
        this.rightMotor1 = new Spark(rightMotor1);
        this.rightMotor2 = new Spark(rightMotor2);
    }

    public void setLeftMotorSpeed(double speed){
        leftMotor1.set(speed);
        leftMotor2.set(speed);
    }
    
    public void setRightMotorSpeed(double speed){
        rightMotor1.set(speed);
        rightMotor2.set(speed);
    }
}

