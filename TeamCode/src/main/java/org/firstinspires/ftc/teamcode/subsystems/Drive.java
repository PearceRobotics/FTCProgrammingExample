package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Drive {

    private DcMotor driveMotorLeft;
    private DcMotor driveMotorRight;

    public Drive(DcMotor driveMotorLeft, DcMotor driveMotorRight){

        this.driveMotorLeft = driveMotorLeft;
        this.driveMotorRight = driveMotorRight;

        this.driveMotorLeft.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void tankDrive(double leftThrottle, double rightThrottle){

        this.driveMotorLeft.setPower(leftThrottle);
        this.driveMotorRight.setPower(rightThrottle);
    }

    public void arcadeDrive(double throttle, double turn){

        this.driveMotorLeft.setPower(throttle + turn);
        this.driveMotorRight.setPower(throttle - turn);
    }
}
