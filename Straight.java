package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Disabled
public class Straight extends LinearOpMode{
    private DcMotor motor1;
    private DcMotor motor2;
    private DcMotor motor3;
    private DcMotor motor4;
    private DcMotor motor5;

    private double gearRatio = 1;
    //^ a variable used in both functions and can be changed from robot to robot
    private double TPR = 1120;
    //^ a variable used in both functions Ticks per revolution
    private double WheelWidth = 4;
    //^ a variable used in both functions this is the diameter of the wheel
    private double Circumfrence = Math.PI * WheelWidth;
    //^ a variable used in both functions this is the circumfrence of the wheel

    @Override
    public void runOpMode() {
        motorConfig();
        waitForStart();
    }

    private void motorConfig() {
        // this is a function used to intialize the motors
        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class, "motor2");
        motor3 = hardwareMap.get(DcMotor.class, "motor3");
        motor4 = hardwareMap.get(DcMotor.class, "motor4");
        motor5 = hardwareMap.get(DcMotor.class, "motor5");
        motor3.setDirection(DcMotor.Direction.REVERSE);
        motor4.setDirection(DcMotor.Direction.REVERSE);
    }

    public void Straight(int inches){

        double revolutions = (inches / Circumfrence); //revolutions needed to go
        int dist = (int)(revolutions * TPR * gearRatio); //  the ticks needed to go

        //to go that number of ticks as specified in the variable above

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

        motor1.setPower(0.5);
        motor2.setPower(0.5);
        motor3.setPower(0.5);
        motor4.setPower(0.5);


        while(motor1.isBusy() && motor2.isBusy() && motor3.isBusy() && motor4.isBusy() && opModeIsActive()){
            telemetry.update();
        }
        motor1.setPower(0);
        motor2.setPower(0);
        motor3.setPower(0);
        motor4.setPower(0);
    }
    // todo: write your code here
}