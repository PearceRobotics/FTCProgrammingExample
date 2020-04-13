package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.subsystems.Drive;

@TeleOp(name = "Teleop", group = "b")
public class TeleopMode extends LinearOpMode {

    private DcMotor driveMotorLeft;
    private DcMotor driveMotorRight;

    @Override
    public void runOpMode(){

        driveMotorLeft = hardwareMap.dcMotor.get("driveMotorLeft");
        driveMotorRight = hardwareMap.dcMotor.get("driveMotorRight");

        Drive drive = new Drive(driveMotorLeft, driveMotorRight);

        waitForStart();
        while (opModeIsActive()) {
            drive.arcadeDrive(-gamepad1.left_stick_y, gamepad1.right_stick_x);
        }
    }
}
