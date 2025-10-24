package frc.robot.subsystems;

import frc.robot.Constants.PopcornShooterConstants;
import frc.robot.Configs.ShooterConfigs;

// import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkFlexConfig;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;

import edu.wpi.first.math.filter.Debouncer;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.filter.LinearFilter;


public class PopcornShooter extends SubsystemBase{

    SparkFlex m_PopShooterL;
    SparkFlex m_PopShooterR;

    SparkFlexConfig config;

    public PopcornShooter() {
        m_PopShooterL = new SparkFlex(PopcornShooterConstants.k_PopcornShooterLeft, MotorType.kBrushless);
        m_PopShooterR = new SparkFlex(PopcornShooterConstants.k_PopcornShooterRight, MotorType.kBrushless);


        m_PopShooterL.configure(
            ShooterConfigs.shooterLConfig,
            ResetMode.kResetSafeParameters, 
            PersistMode.kPersistParameters);
        m_PopShooterR.configure(
            ShooterConfigs.shooterRConfig.follow(m_PopShooterL),
            ResetMode.kResetSafeParameters, 
            PersistMode.kPersistParameters);
        
            
        
    }
    public Command c_getPopcornShooterCommand() {
        return this.startEnd(() -> {
            m_PopShooterL.set(.5);

        }, 
        
        () -> {
        m_PopShooterL.set(0);
            
        });
    }
}