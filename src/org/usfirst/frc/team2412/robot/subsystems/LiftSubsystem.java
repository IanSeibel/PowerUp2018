package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LiftSubsystem extends Subsystem{
	private WPI_TalonSRX LiftMotor1 = RobotMap.liftmoter1;
	private WPI_TalonSRX LiftMotor2 = RobotMap.liftmoter2;
	
	public void liftup() {
		liftmotor1.set(1.0);	
		liftmotor2.set(1.0);
	}
	public void liftdown() {
		liftmotor1.set(-1.0);	
		liftmotor2.set(-1.0);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	} 

}