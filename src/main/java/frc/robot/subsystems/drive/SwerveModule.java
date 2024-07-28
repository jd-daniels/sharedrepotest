package frc.robot.subsystems.drive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class SwerveModule {
    private final int m_drivingID;
    private final int m_turningID;
    private final CANSparkMax m_driveMotor;
    private final CANSparkMax m_turnMotor;


    public SwerveModule(int drivingID, int turningID) {
        m_drivingID = drivingID;
        m_turningID = turningID;
        m_driveMotor = new CANSparkMax(m_drivingID, MotorType.kBrushless);
        m_driveMotor.set(0.15);
        m_turnMotor = new CANSparkMax(m_turningID, MotorType.kBrushless);
        m_turnMotor.set(0.15);
    }
}
