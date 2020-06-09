package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import android.graphics.Color;
import android.view.View;
import android.app.Activity;

@Autonomous(name = "DomenicOpMode", group = "Linear Opmode")

public class DomenicOpMode extends LinearOpMode {

    ColorSensor colorSensor;    // Hardware Device Object
    private DcMotor motor1, motor2, motor3, motor4, motor5 = null;
    private ElapsedTime runtime = new ElapsedTime();
    private double gearRatio = 1;
    private double TPR = 1120;
    private double WheelWidth = 4;
    private double Circumfrence = Math.PI * WheelWidth;

    @Override
    public void runOpMode() {

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class, "motor2");
        motor3 = hardwareMap.get(DcMotor.class, "motor3");
        motor4 = hardwareMap.get(DcMotor.class, "motor4");
        motor5 = hardwareMap.get(DcMotor.class, "motor5");

        motor1.setDirection(DcMotor.Direction.FORWARD);
        motor2.setDirection(DcMotor.Direction.FORWARD);
        motor3.setDirection(DcMotor.Direction.REVERSE);
        motor4.setDirection(DcMotor.Direction.REVERSE);
        motor5.setDirection(DcMotor.Direction.REVERSE);

        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor5.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        waitForStart();
        runtime.reset();

// Lower
        motor5.setTargetPosition(13900);

        telemetry.addData("Status","Run Time: " + runtime.toString());

        motor5.setPower(1);

        while(motor5.isBusy() && opModeIsActive()){
            telemetry.update();
        }
        motor5.setPower(0);

        motor5.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor3.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor4.setMode(DcMotor.RunMode.RUN_TO_POSITION);

// Go forward to remove hook
        motor1.setTargetPosition(310);
        motor2.setTargetPosition(310);
        motor3.setTargetPosition(310);
        motor4.setTargetPosition(310);

        telemetry.addData("Status","Run Time: " + runtime.toString());
        telemetry.update();

        motor1.setPower(0.85);
        motor2.setPower(0.85);
        motor3.setPower(0.85);
        motor4.setPower(0.85);

        while(motor1.isBusy()&& motor2.isBusy()&& motor3.isBusy()&& motor4.isBusy() && opModeIsActive()){
            telemetry.update();
        }
        motor1.setPower(0);
        motor2.setPower(0);
        motor3.setPower(0);
        motor4.setPower(0);

        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor3.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor4.setMode(DcMotor.RunMode.RUN_TO_POSITION);

// Turn right
        motor1.setTargetPosition(777);
        motor2.setTargetPosition(777);
        motor3.setTargetPosition(-777);
        motor4.setTargetPosition(-777);

        telemetry.addData("Status","Run Time: " + runtime.toString());
        telemetry.update();

        motor1.setPower(0.5);
        motor2.setPower(0.5);
        motor3.setPower(0.5);
        motor4.setPower(0.5);

        while(motor1.isBusy()&& motor2.isBusy()&& motor3.isBusy()&& motor4.isBusy()&& opModeIsActive()){
            telemetry.update();
        }
        motor1.setPower(0);
        motor2.setPower(0);
        motor3.setPower(0);
        motor4.setPower(0);

        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor3.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor4.setMode(DcMotor.RunMode.RUN_TO_POSITION);

// Go forward towards wall
        motor1.setTargetPosition(3550);
        motor2.setTargetPosition(3550);
        motor3.setTargetPosition(3550);
        motor4.setTargetPosition(3550);

        telemetry.addData("Status","Run Time: " + runtime.toString());
        telemetry.update();

        motor1.setPower(0.85);
        motor2.setPower(0.85);
        motor3.setPower(0.85);
        motor4.setPower(0.85);

        while(motor1.isBusy()&& motor2.isBusy()&& motor3.isBusy()&& motor4.isBusy()&& opModeIsActive()){
            telemetry.update();
        }
        motor1.setPower(0);
        motor2.setPower(0);
        motor3.setPower(0);
        motor4.setPower(0);

        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor3.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor4.setMode(DcMotor.RunMode.RUN_TO_POSITION);

// Turn right

        Turn(90);

// Back up towards depot

        Straight(-60);

        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor3.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor4.setMode(DcMotor.RunMode.RUN_TO_POSITION);

// Drop marker

        servo1.setPosition(0.1);

        sleep(1400);

        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor3.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor4.setMode(DcMotor.RunMode.RUN_TO_POSITION);

// Raise sorter
        servo1.setPosition(1);
// Drive towards crater
        Straight(49);
// Turn right
        Turn(90);
// Square up against wall
        Straight(-7);
// Drive forward from wall
        Straight(8);
// Turn left towards minerals
        Turn(-42);
// Drive forward towards 1st mineral
        Straight(15.5);
// Lower color sensor arm
        servo2.setPosition(0.73);
// Check minerals
        Straight(14);
// Turn towards gold mineral
        Turn(-60);
// Knock off the gold mineral and drive into the crater
        Straight(12);

        runtime.reset();
    }
    private void motorConfig() {
        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class, "motor2");
        motor3 = hardwareMap.get(DcMotor.class, "motor3");
        motor4 = hardwareMap.get(DcMotor.class, "motor4");
        motor5 = hardwareMap.get(DcMotor.class, "motor5");
        motor1.setDirection(DcMotor.Direction.REVERSE);
        motor2.setDirection(DcMotor.Direction.REVERSE);
        motor5.setDirection(DcMotor.Direction.REVERSE);

    }
    private void Straight(double inches){

        double ticks = (inches / Circumfrence);
        int dist = (int)(ticks * TPR * gearRatio);

        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor3.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor4.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motor1.setTargetPosition(dist);
        motor2.setTargetPosition(dist);
        motor3.setTargetPosition(dist);
        motor4.setTargetPosition(dist);

        motor1.setPower(0.85);
        motor2.setPower(0.85);
        motor3.setPower(0.85);
        motor4.setPower(0.85);

        while(motor1.isBusy() && motor2.isBusy() && motor3.isBusy() && motor4.isBusy() && opModeIsActive()){
            telemetry.update();
        }
        motor1.setPower(0);
        motor2.setPower(0);
        motor3.setPower(0);
        motor4.setPower(0);
    }

    private void Turn(int angle){
        double ticks = (angle / Circumfrence);
        int dist = (int)(ticks * TPR * gearRatio);
        double turn = 5.1;
        int distance = (int)(dist / turn);

        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor3.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor4.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motor1.setTargetPosition(distance);
        motor2.setTargetPosition(distance);
        motor3.setTargetPosition(-distance);
        motor4.setTargetPosition(-distance);

        motor1.setPower(1);
        motor2.setPower(1);
        motor3.setPower(-1);
        motor4.setPower(-1);

        while(motor1.isBusy() && motor2.isBusy() && motor3.isBusy() && motor4.isBusy() && opModeIsActive()){
            telemetry.update();
        }
        motor1.setPower(0);
        motor2.setPower(0);
        motor3.setPower(0);
        motor4.setPower(0);
    }
}