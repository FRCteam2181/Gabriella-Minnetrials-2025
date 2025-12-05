package frc.robot.subsystems;

import frc.robot.Constants.PopcornShooterConstants;
import frc.robot.Configs.ShooterConfigs;

// import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;

import edu.wpi.first.math.filter.Debouncer;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.filter.LinearFilter;


public class PopcornIntake extends SubsystemBase{

    SparkMax m_PopIntake; 


    public PopcornIntake() {
        m_PopIntake = new SparkMax(PopcornShooterConstants.k_PopcornIntake, MotorType.kBrushless);


        m_PopIntake.configure(
            ShooterConfigs.intakeConfig,
            ResetMode.kResetSafeParameters, 
            PersistMode.kPersistParameters);

            
        
    }
    public Command c_getPopcornIntakeCommand() {
        return this.startEnd(() -> {
            m_PopIntake.set(.65);

        }, 
        
        () -> {
        m_PopIntake.set(0);
            
        });
    }
}