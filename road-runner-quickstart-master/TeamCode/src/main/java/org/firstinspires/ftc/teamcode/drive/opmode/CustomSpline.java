package org.firstinspires.ftc.teamcode.drive.opmode;


import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.mecanum.SampleMecanumDriveBase;
import org.firstinspires.ftc.teamcode.drive.mecanum.SampleMecanumDriveREV;

import java.util.Vector;

@Autonomous(group = "drive")
public class CustomSpline extends LinearOpMode {



    @Override
    public void runOpMode() throws InterruptedException {
        SampleMecanumDriveBase drive = new SampleMecanumDriveREV(hardwareMap);

        waitForStart();

        if (isStopRequested()) return;
        drive.setPoseEstimate(new Pose2d(-36,-66,Math.PI));
        drive.followTrajectorySync(

                drive.trajectoryBuilder()
                        .strafeTo(new Vector2d(-47,-30))
                        .strafeTo(new Vector2d(-25,-50))
                        .setReversed(true)
                        .splineTo(new Pose2d(40,-50))
                        .setReversed(false)
                        .build()

        );
        sleep(1);
        drive.followTrajectorySync(

                drive.trajectoryBuilder()
                        .splineTo(new Pose2d(-55,-50,Math.PI))
                        .build()

        );
        sleep(1);
        drive.followTrajectorySync(

                drive.trajectoryBuilder()
                        .setReversed(true)
                        .splineTo(new Pose2d(40,-50,Math.PI))
                        .build()

        );


    }
}
