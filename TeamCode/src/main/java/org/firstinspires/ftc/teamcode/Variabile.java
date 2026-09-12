package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Variabile  extends OpMode {
    @Override
    public void init()  {
        int teamNumber=23014;
        double motorSpeed=0.75;
        boolean clawClosed=true;
        String teamname = "TehnoZ";
        int motorAngle=90;
        telemetry.addData("Team Number",teamNumber);
        telemetry.addData("motor speed",motorSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("motor angle", motorAngle);
    }

    @Override
    public void loop() {


    }
    //    int robotHight double motorSpedd boolean clawClosed
    // robotHeight= 10; motorspeed=0.5; clawClosed=true


}
