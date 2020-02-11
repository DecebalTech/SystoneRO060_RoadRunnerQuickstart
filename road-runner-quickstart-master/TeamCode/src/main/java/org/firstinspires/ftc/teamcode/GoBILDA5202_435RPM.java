package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.motors.GoBILDA5202Series;
import com.qualcomm.robotcore.hardware.configuration.annotations.DeviceProperties;
import com.qualcomm.robotcore.hardware.configuration.annotations.ExpansionHubPIDFPositionParams;
import com.qualcomm.robotcore.hardware.configuration.annotations.ExpansionHubPIDFVelocityParams;
import com.qualcomm.robotcore.hardware.configuration.annotations.MotorType;

import org.firstinspires.ftc.robotcore.external.navigation.Rotation;

@MotorType(ticksPerRev=383.6, gearing=13.7, maxRPM=435, orientation= Rotation.CCW)
@DeviceProperties(xmlTag="goBILDA5202SeriesMotor_435RPM", name="GoBILDA 5202 series - 425RPM", builtIn = true)
@ExpansionHubPIDFVelocityParams(P=2.0, I=0.5, F=11.1)
@ExpansionHubPIDFPositionParams(P=5.0)
public interface GoBILDA5202_435RPM {
}
