package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "JacksonSkystoneAuto", group = "Linear OpMode")
public class JacksonSkystoneAuto extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();

    DriveTrain robot = new DriveTrain();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap, this);

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();
        runtime.reset();

        /*
        If Skystone is on right
        Turn(6);
        Straight(33);
        If Skystone is in center
        */

        robot.Straight(30);
        //If Skystone is on left
        //Turn(-6);
        //Straight(32);
        //backs up after picking up Skystone
                robot.Straight(-10);
        //right Skystone right Turn(84);
        //center Skystone right
                robot.Turn(90, 0.5);
        //left Skystone right Turn(96);
        //Drives under allinance bridge towards foundation
                robot.Straight(70);
        //turns left toward foundation
                robot.Turn(-90, 0.5);

    }
}