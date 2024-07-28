// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static class DriveConstants {
        // SPARK MAX CAN IDs
        public static final int kFrontLeftDrivingCanId = 11;
        public static final int kRearLeftDrivingCanId = 15;
        public static final int kFrontRightDrivingCanId = 13;
        public static final int kRearRightDrivingCanId = 17;
    
        public static final int kFrontLeftTurningCanId = 12;
        public static final int kRearLeftTurningCanId = 16;
        public static final int kFrontRightTurningCanId = 14;
        public static final int kRearRightTurningCanId = 18;
    
        // CANCoder CAN IDs
        public static final int kFrontLeftTurningCanCoderId = 4;
        public static final int kRearLeftTurningCanCoderId = 6;
        public static final int kFrontRightTurningCanCoderId = 5;
        public static final int kRearRightTurningCanCoderId = 7;
    
        // Pigeon 2 CAN ID
        public static final int kGryoCanId = 3;
    
        // CAN BUS
        public static final String kCanBusId = "rio";
  }
}
