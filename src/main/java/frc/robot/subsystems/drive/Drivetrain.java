package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {

    SwerveModule m_fl;
    SwerveModule m_fr;
    SwerveModule m_rl;
    SwerveModule m_rr;

    // Constructor
    public Drivetrain() {
        m_fl = new SwerveModule(Constants.DriveConstants.kFrontLeftDrivingCanId,
                Constants.DriveConstants.kFrontLeftTurningCanId);
        m_fr = new SwerveModule(Constants.DriveConstants.kFrontRightDrivingCanId,
                Constants.DriveConstants.kFrontRightTurningCanId);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}