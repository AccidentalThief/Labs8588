package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.kinematics.ChassisSpeeds;

public class Align extends SubsystemBase {
    public static void alignBot(double yaw, SwerveSubsystem driveSubsystem) {
        if(yaw >= Math.PI) {
            driveSubsystem.run(() -> driveSubsystem.drive(new ChassisSpeeds(0,
                0, (2*Math.PI)-yaw))).withTimeout(1);
        } else {
            driveSubsystem.run(() -> driveSubsystem.drive(new ChassisSpeeds(0,
                0, -yaw))).withTimeout(1);
        }
    }
}
