package frc.robot;

import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkFlexConfig;
import com.revrobotics.spark.config.SparkMaxConfig;



public class Configs {
  public static final class ShooterConfigs {

    public static final SparkBaseConfig shooterLConfig = new SparkFlexConfig().idleMode(IdleMode.kCoast)
    .smartCurrentLimit(40)
    .inverted(true);
    public static final SparkBaseConfig shooterRConfig = new SparkFlexConfig().idleMode(IdleMode.kCoast)
    .smartCurrentLimit(40)
    .inverted(false);
    public static final SparkBaseConfig intakeConfig = new SparkMaxConfig().idleMode(IdleMode.kCoast)
    .smartCurrentLimit(40)
    .inverted(false);
    public static final SparkBaseConfig augerConfig = new SparkMaxConfig().idleMode(IdleMode.kCoast)
    .smartCurrentLimit(40)
    .inverted(false);
    

    // static {

    //   // Configure basic settings of the elevator motor
    //   shooterLConfig
    //     .idleMode(IdleMode.kCoast)
    //     .smartCurrentLimit(40)
    //     .inverted(true);
    

    //   shooterRConfig
    //     .idleMode(IdleMode.kCoast)
    //     .smartCurrentLimit(40)
    //     .inverted(false)
    //     .follow(5);
        

    // }       
  }
}