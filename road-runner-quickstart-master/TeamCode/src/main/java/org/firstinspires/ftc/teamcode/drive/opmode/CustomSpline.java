package org.firstinspires.ftc.teamcode.drive.opmode;


import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.mecanum.SampleMecanumDriveBase;
import org.firstinspires.ftc.teamcode.drive.mecanum.SampleMecanumDriveREV;

@Autonomous(group = "drive")
public class CustomSpline extends LinearOpMode {



    @Override
    public void runOpMode() throws InterruptedException {
        SampleMecanumDriveBase drive = new SampleMecanumDriveREV(hardwareMap);

        waitForStart();

        if (isStopRequested()) return;
        drive.setPoseEstimate(new Pose2d(-36,-70,(float)Math.PI));
        drive.followTrajectorySync(

                drive.trajectoryBuilder()
                        .strafeTo(new Vector2d(-47,-35))
                        .setReversed(true)
                        .splineTo(new Pose2d(-20,-42,(float)Math.PI))
                        .lineTo(new Vector2d(40,-40))
                        .setReversed(false)
                        .build()

        );
        sleep(1000);
        drive.followTrajectorySync(

                drive.trajectoryBuilder()
                        .lineTo(new Vector2d(-50,-40))
                        .build()

        );



    }
}
