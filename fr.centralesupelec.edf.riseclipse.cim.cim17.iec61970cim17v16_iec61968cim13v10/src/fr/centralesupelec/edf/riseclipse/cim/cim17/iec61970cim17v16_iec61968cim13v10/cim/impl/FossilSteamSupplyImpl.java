/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BoilerControlMode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilSteamSupply;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fossil Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getBoilerControlMode <em>Boiler Control Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getControlErrorBiasP <em>Control Error Bias P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getControlIC <em>Control IC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getControlPC <em>Control PC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getControlPEB <em>Control PEB</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getControlPED <em>Control PED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getControlTC <em>Control TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getFeedWaterIG <em>Feed Water IG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getFeedWaterPG <em>Feed Water PG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getFeedWaterTC <em>Feed Water TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getFuelDemandLimit <em>Fuel Demand Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getFuelSupplyDelay <em>Fuel Supply Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getFuelSupplyTC <em>Fuel Supply TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getMaxErrorRateP <em>Max Error Rate P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getMechPowerSensorLag <em>Mech Power Sensor Lag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getMinErrorRateP <em>Min Error Rate P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getPressureCtrlDG <em>Pressure Ctrl DG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getPressureCtrlIG <em>Pressure Ctrl IG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getPressureCtrlPG <em>Pressure Ctrl PG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getPressureFeedback <em>Pressure Feedback</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getSuperHeater1Capacity <em>Super Heater1 Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getSuperHeater2Capacity <em>Super Heater2 Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getSuperHeaterPipePD <em>Super Heater Pipe PD</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilSteamSupplyImpl#getThrottlePressureSP <em>Throttle Pressure SP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FossilSteamSupplyImpl extends SteamSupplyImpl implements FossilSteamSupply {
    /**
     * The default value of the '{@link #getAuxPowerVersusFrequency() <em>Aux Power Versus Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxPowerVersusFrequency()
     * @generated
     * @ordered
     */
    protected static final Float AUX_POWER_VERSUS_FREQUENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuxPowerVersusFrequency() <em>Aux Power Versus Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxPowerVersusFrequency()
     * @generated
     * @ordered
     */
    protected Float auxPowerVersusFrequency = AUX_POWER_VERSUS_FREQUENCY_EDEFAULT;

    /**
     * This is true if the Aux Power Versus Frequency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean auxPowerVersusFrequencyESet;

    /**
     * The default value of the '{@link #getAuxPowerVersusVoltage() <em>Aux Power Versus Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxPowerVersusVoltage()
     * @generated
     * @ordered
     */
    protected static final Float AUX_POWER_VERSUS_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuxPowerVersusVoltage() <em>Aux Power Versus Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxPowerVersusVoltage()
     * @generated
     * @ordered
     */
    protected Float auxPowerVersusVoltage = AUX_POWER_VERSUS_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Aux Power Versus Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean auxPowerVersusVoltageESet;

    /**
     * The default value of the '{@link #getBoilerControlMode() <em>Boiler Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBoilerControlMode()
     * @generated
     * @ordered
     */
    protected static final BoilerControlMode BOILER_CONTROL_MODE_EDEFAULT = BoilerControlMode.FOLLOWING;

    /**
     * The cached value of the '{@link #getBoilerControlMode() <em>Boiler Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBoilerControlMode()
     * @generated
     * @ordered
     */
    protected BoilerControlMode boilerControlMode = BOILER_CONTROL_MODE_EDEFAULT;

    /**
     * This is true if the Boiler Control Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean boilerControlModeESet;

    /**
     * The default value of the '{@link #getControlErrorBiasP() <em>Control Error Bias P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlErrorBiasP()
     * @generated
     * @ordered
     */
    protected static final Float CONTROL_ERROR_BIAS_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlErrorBiasP() <em>Control Error Bias P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlErrorBiasP()
     * @generated
     * @ordered
     */
    protected Float controlErrorBiasP = CONTROL_ERROR_BIAS_P_EDEFAULT;

    /**
     * This is true if the Control Error Bias P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlErrorBiasPESet;

    /**
     * The default value of the '{@link #getControlIC() <em>Control IC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlIC()
     * @generated
     * @ordered
     */
    protected static final Float CONTROL_IC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlIC() <em>Control IC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlIC()
     * @generated
     * @ordered
     */
    protected Float controlIC = CONTROL_IC_EDEFAULT;

    /**
     * This is true if the Control IC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlICESet;

    /**
     * The default value of the '{@link #getControlPC() <em>Control PC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlPC()
     * @generated
     * @ordered
     */
    protected static final Float CONTROL_PC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlPC() <em>Control PC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlPC()
     * @generated
     * @ordered
     */
    protected Float controlPC = CONTROL_PC_EDEFAULT;

    /**
     * This is true if the Control PC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlPCESet;

    /**
     * The default value of the '{@link #getControlPEB() <em>Control PEB</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlPEB()
     * @generated
     * @ordered
     */
    protected static final Float CONTROL_PEB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlPEB() <em>Control PEB</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlPEB()
     * @generated
     * @ordered
     */
    protected Float controlPEB = CONTROL_PEB_EDEFAULT;

    /**
     * This is true if the Control PEB attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlPEBESet;

    /**
     * The default value of the '{@link #getControlPED() <em>Control PED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlPED()
     * @generated
     * @ordered
     */
    protected static final Float CONTROL_PED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlPED() <em>Control PED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlPED()
     * @generated
     * @ordered
     */
    protected Float controlPED = CONTROL_PED_EDEFAULT;

    /**
     * This is true if the Control PED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlPEDESet;

    /**
     * The default value of the '{@link #getControlTC() <em>Control TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlTC()
     * @generated
     * @ordered
     */
    protected static final Float CONTROL_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlTC() <em>Control TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlTC()
     * @generated
     * @ordered
     */
    protected Float controlTC = CONTROL_TC_EDEFAULT;

    /**
     * This is true if the Control TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlTCESet;

    /**
     * The default value of the '{@link #getFeedWaterIG() <em>Feed Water IG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedWaterIG()
     * @generated
     * @ordered
     */
    protected static final Float FEED_WATER_IG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeedWaterIG() <em>Feed Water IG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedWaterIG()
     * @generated
     * @ordered
     */
    protected Float feedWaterIG = FEED_WATER_IG_EDEFAULT;

    /**
     * This is true if the Feed Water IG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean feedWaterIGESet;

    /**
     * The default value of the '{@link #getFeedWaterPG() <em>Feed Water PG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedWaterPG()
     * @generated
     * @ordered
     */
    protected static final Float FEED_WATER_PG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeedWaterPG() <em>Feed Water PG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedWaterPG()
     * @generated
     * @ordered
     */
    protected Float feedWaterPG = FEED_WATER_PG_EDEFAULT;

    /**
     * This is true if the Feed Water PG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean feedWaterPGESet;

    /**
     * The default value of the '{@link #getFeedWaterTC() <em>Feed Water TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedWaterTC()
     * @generated
     * @ordered
     */
    protected static final Float FEED_WATER_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeedWaterTC() <em>Feed Water TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedWaterTC()
     * @generated
     * @ordered
     */
    protected Float feedWaterTC = FEED_WATER_TC_EDEFAULT;

    /**
     * This is true if the Feed Water TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean feedWaterTCESet;

    /**
     * The default value of the '{@link #getFuelDemandLimit() <em>Fuel Demand Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelDemandLimit()
     * @generated
     * @ordered
     */
    protected static final Float FUEL_DEMAND_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelDemandLimit() <em>Fuel Demand Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelDemandLimit()
     * @generated
     * @ordered
     */
    protected Float fuelDemandLimit = FUEL_DEMAND_LIMIT_EDEFAULT;

    /**
     * This is true if the Fuel Demand Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelDemandLimitESet;

    /**
     * The default value of the '{@link #getFuelSupplyDelay() <em>Fuel Supply Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelSupplyDelay()
     * @generated
     * @ordered
     */
    protected static final Float FUEL_SUPPLY_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelSupplyDelay() <em>Fuel Supply Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelSupplyDelay()
     * @generated
     * @ordered
     */
    protected Float fuelSupplyDelay = FUEL_SUPPLY_DELAY_EDEFAULT;

    /**
     * This is true if the Fuel Supply Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelSupplyDelayESet;

    /**
     * The default value of the '{@link #getFuelSupplyTC() <em>Fuel Supply TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelSupplyTC()
     * @generated
     * @ordered
     */
    protected static final Float FUEL_SUPPLY_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelSupplyTC() <em>Fuel Supply TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelSupplyTC()
     * @generated
     * @ordered
     */
    protected Float fuelSupplyTC = FUEL_SUPPLY_TC_EDEFAULT;

    /**
     * This is true if the Fuel Supply TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelSupplyTCESet;

    /**
     * The default value of the '{@link #getMaxErrorRateP() <em>Max Error Rate P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxErrorRateP()
     * @generated
     * @ordered
     */
    protected static final Float MAX_ERROR_RATE_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxErrorRateP() <em>Max Error Rate P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxErrorRateP()
     * @generated
     * @ordered
     */
    protected Float maxErrorRateP = MAX_ERROR_RATE_P_EDEFAULT;

    /**
     * This is true if the Max Error Rate P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxErrorRatePESet;

    /**
     * The default value of the '{@link #getMechPowerSensorLag() <em>Mech Power Sensor Lag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMechPowerSensorLag()
     * @generated
     * @ordered
     */
    protected static final Float MECH_POWER_SENSOR_LAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMechPowerSensorLag() <em>Mech Power Sensor Lag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMechPowerSensorLag()
     * @generated
     * @ordered
     */
    protected Float mechPowerSensorLag = MECH_POWER_SENSOR_LAG_EDEFAULT;

    /**
     * This is true if the Mech Power Sensor Lag attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mechPowerSensorLagESet;

    /**
     * The default value of the '{@link #getMinErrorRateP() <em>Min Error Rate P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinErrorRateP()
     * @generated
     * @ordered
     */
    protected static final Float MIN_ERROR_RATE_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinErrorRateP() <em>Min Error Rate P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinErrorRateP()
     * @generated
     * @ordered
     */
    protected Float minErrorRateP = MIN_ERROR_RATE_P_EDEFAULT;

    /**
     * This is true if the Min Error Rate P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minErrorRatePESet;

    /**
     * The default value of the '{@link #getPressureCtrlDG() <em>Pressure Ctrl DG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureCtrlDG()
     * @generated
     * @ordered
     */
    protected static final Float PRESSURE_CTRL_DG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPressureCtrlDG() <em>Pressure Ctrl DG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureCtrlDG()
     * @generated
     * @ordered
     */
    protected Float pressureCtrlDG = PRESSURE_CTRL_DG_EDEFAULT;

    /**
     * This is true if the Pressure Ctrl DG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pressureCtrlDGESet;

    /**
     * The default value of the '{@link #getPressureCtrlIG() <em>Pressure Ctrl IG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureCtrlIG()
     * @generated
     * @ordered
     */
    protected static final Float PRESSURE_CTRL_IG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPressureCtrlIG() <em>Pressure Ctrl IG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureCtrlIG()
     * @generated
     * @ordered
     */
    protected Float pressureCtrlIG = PRESSURE_CTRL_IG_EDEFAULT;

    /**
     * This is true if the Pressure Ctrl IG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pressureCtrlIGESet;

    /**
     * The default value of the '{@link #getPressureCtrlPG() <em>Pressure Ctrl PG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureCtrlPG()
     * @generated
     * @ordered
     */
    protected static final Float PRESSURE_CTRL_PG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPressureCtrlPG() <em>Pressure Ctrl PG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureCtrlPG()
     * @generated
     * @ordered
     */
    protected Float pressureCtrlPG = PRESSURE_CTRL_PG_EDEFAULT;

    /**
     * This is true if the Pressure Ctrl PG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pressureCtrlPGESet;

    /**
     * The default value of the '{@link #getPressureFeedback() <em>Pressure Feedback</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureFeedback()
     * @generated
     * @ordered
     */
    protected static final Integer PRESSURE_FEEDBACK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPressureFeedback() <em>Pressure Feedback</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureFeedback()
     * @generated
     * @ordered
     */
    protected Integer pressureFeedback = PRESSURE_FEEDBACK_EDEFAULT;

    /**
     * This is true if the Pressure Feedback attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pressureFeedbackESet;

    /**
     * The default value of the '{@link #getSuperHeater1Capacity() <em>Super Heater1 Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperHeater1Capacity()
     * @generated
     * @ordered
     */
    protected static final Float SUPER_HEATER1_CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuperHeater1Capacity() <em>Super Heater1 Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperHeater1Capacity()
     * @generated
     * @ordered
     */
    protected Float superHeater1Capacity = SUPER_HEATER1_CAPACITY_EDEFAULT;

    /**
     * This is true if the Super Heater1 Capacity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean superHeater1CapacityESet;

    /**
     * The default value of the '{@link #getSuperHeater2Capacity() <em>Super Heater2 Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperHeater2Capacity()
     * @generated
     * @ordered
     */
    protected static final Float SUPER_HEATER2_CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuperHeater2Capacity() <em>Super Heater2 Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperHeater2Capacity()
     * @generated
     * @ordered
     */
    protected Float superHeater2Capacity = SUPER_HEATER2_CAPACITY_EDEFAULT;

    /**
     * This is true if the Super Heater2 Capacity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean superHeater2CapacityESet;

    /**
     * The default value of the '{@link #getSuperHeaterPipePD() <em>Super Heater Pipe PD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperHeaterPipePD()
     * @generated
     * @ordered
     */
    protected static final Float SUPER_HEATER_PIPE_PD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuperHeaterPipePD() <em>Super Heater Pipe PD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperHeaterPipePD()
     * @generated
     * @ordered
     */
    protected Float superHeaterPipePD = SUPER_HEATER_PIPE_PD_EDEFAULT;

    /**
     * This is true if the Super Heater Pipe PD attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean superHeaterPipePDESet;

    /**
     * The default value of the '{@link #getThrottlePressureSP() <em>Throttle Pressure SP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrottlePressureSP()
     * @generated
     * @ordered
     */
    protected static final Float THROTTLE_PRESSURE_SP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThrottlePressureSP() <em>Throttle Pressure SP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrottlePressureSP()
     * @generated
     * @ordered
     */
    protected Float throttlePressureSP = THROTTLE_PRESSURE_SP_EDEFAULT;

    /**
     * This is true if the Throttle Pressure SP attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean throttlePressureSPESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FossilSteamSupplyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getFossilSteamSupply();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAuxPowerVersusFrequency() {
        return auxPowerVersusFrequency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAuxPowerVersusFrequency( Float newAuxPowerVersusFrequency ) {
        Float oldAuxPowerVersusFrequency = auxPowerVersusFrequency;
        auxPowerVersusFrequency = newAuxPowerVersusFrequency;
        boolean oldAuxPowerVersusFrequencyESet = auxPowerVersusFrequencyESet;
        auxPowerVersusFrequencyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY, oldAuxPowerVersusFrequency,
                auxPowerVersusFrequency, !oldAuxPowerVersusFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxPowerVersusFrequency() {
        Float oldAuxPowerVersusFrequency = auxPowerVersusFrequency;
        boolean oldAuxPowerVersusFrequencyESet = auxPowerVersusFrequencyESet;
        auxPowerVersusFrequency = AUX_POWER_VERSUS_FREQUENCY_EDEFAULT;
        auxPowerVersusFrequencyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY, oldAuxPowerVersusFrequency,
                AUX_POWER_VERSUS_FREQUENCY_EDEFAULT, oldAuxPowerVersusFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxPowerVersusFrequency() {
        return auxPowerVersusFrequencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAuxPowerVersusVoltage() {
        return auxPowerVersusVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAuxPowerVersusVoltage( Float newAuxPowerVersusVoltage ) {
        Float oldAuxPowerVersusVoltage = auxPowerVersusVoltage;
        auxPowerVersusVoltage = newAuxPowerVersusVoltage;
        boolean oldAuxPowerVersusVoltageESet = auxPowerVersusVoltageESet;
        auxPowerVersusVoltageESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE,
                        oldAuxPowerVersusVoltage, auxPowerVersusVoltage, !oldAuxPowerVersusVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxPowerVersusVoltage() {
        Float oldAuxPowerVersusVoltage = auxPowerVersusVoltage;
        boolean oldAuxPowerVersusVoltageESet = auxPowerVersusVoltageESet;
        auxPowerVersusVoltage = AUX_POWER_VERSUS_VOLTAGE_EDEFAULT;
        auxPowerVersusVoltageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE, oldAuxPowerVersusVoltage,
                AUX_POWER_VERSUS_VOLTAGE_EDEFAULT, oldAuxPowerVersusVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxPowerVersusVoltage() {
        return auxPowerVersusVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BoilerControlMode getBoilerControlMode() {
        return boilerControlMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoilerControlMode( BoilerControlMode newBoilerControlMode ) {
        BoilerControlMode oldBoilerControlMode = boilerControlMode;
        boilerControlMode = newBoilerControlMode == null ? BOILER_CONTROL_MODE_EDEFAULT : newBoilerControlMode;
        boolean oldBoilerControlModeESet = boilerControlModeESet;
        boilerControlModeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE,
                    oldBoilerControlMode, boilerControlMode, !oldBoilerControlModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBoilerControlMode() {
        BoilerControlMode oldBoilerControlMode = boilerControlMode;
        boolean oldBoilerControlModeESet = boilerControlModeESet;
        boilerControlMode = BOILER_CONTROL_MODE_EDEFAULT;
        boilerControlModeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE,
                        oldBoilerControlMode, BOILER_CONTROL_MODE_EDEFAULT, oldBoilerControlModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoilerControlMode() {
        return boilerControlModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getControlErrorBiasP() {
        return controlErrorBiasP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlErrorBiasP( Float newControlErrorBiasP ) {
        Float oldControlErrorBiasP = controlErrorBiasP;
        controlErrorBiasP = newControlErrorBiasP;
        boolean oldControlErrorBiasPESet = controlErrorBiasPESet;
        controlErrorBiasPESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P,
                        oldControlErrorBiasP, controlErrorBiasP, !oldControlErrorBiasPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlErrorBiasP() {
        Float oldControlErrorBiasP = controlErrorBiasP;
        boolean oldControlErrorBiasPESet = controlErrorBiasPESet;
        controlErrorBiasP = CONTROL_ERROR_BIAS_P_EDEFAULT;
        controlErrorBiasPESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P,
                        oldControlErrorBiasP, CONTROL_ERROR_BIAS_P_EDEFAULT, oldControlErrorBiasPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlErrorBiasP() {
        return controlErrorBiasPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getControlIC() {
        return controlIC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlIC( Float newControlIC ) {
        Float oldControlIC = controlIC;
        controlIC = newControlIC;
        boolean oldControlICESet = controlICESet;
        controlICESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC, oldControlIC, controlIC, !oldControlICESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlIC() {
        Float oldControlIC = controlIC;
        boolean oldControlICESet = controlICESet;
        controlIC = CONTROL_IC_EDEFAULT;
        controlICESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC, oldControlIC, CONTROL_IC_EDEFAULT, oldControlICESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlIC() {
        return controlICESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getControlPC() {
        return controlPC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlPC( Float newControlPC ) {
        Float oldControlPC = controlPC;
        controlPC = newControlPC;
        boolean oldControlPCESet = controlPCESet;
        controlPCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC, oldControlPC, controlPC, !oldControlPCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlPC() {
        Float oldControlPC = controlPC;
        boolean oldControlPCESet = controlPCESet;
        controlPC = CONTROL_PC_EDEFAULT;
        controlPCESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC, oldControlPC, CONTROL_PC_EDEFAULT, oldControlPCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlPC() {
        return controlPCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getControlPEB() {
        return controlPEB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlPEB( Float newControlPEB ) {
        Float oldControlPEB = controlPEB;
        controlPEB = newControlPEB;
        boolean oldControlPEBESet = controlPEBESet;
        controlPEBESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB, oldControlPEB, controlPEB, !oldControlPEBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlPEB() {
        Float oldControlPEB = controlPEB;
        boolean oldControlPEBESet = controlPEBESet;
        controlPEB = CONTROL_PEB_EDEFAULT;
        controlPEBESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB, oldControlPEB, CONTROL_PEB_EDEFAULT, oldControlPEBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlPEB() {
        return controlPEBESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getControlPED() {
        return controlPED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlPED( Float newControlPED ) {
        Float oldControlPED = controlPED;
        controlPED = newControlPED;
        boolean oldControlPEDESet = controlPEDESet;
        controlPEDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED, oldControlPED, controlPED, !oldControlPEDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlPED() {
        Float oldControlPED = controlPED;
        boolean oldControlPEDESet = controlPEDESet;
        controlPED = CONTROL_PED_EDEFAULT;
        controlPEDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED, oldControlPED, CONTROL_PED_EDEFAULT, oldControlPEDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlPED() {
        return controlPEDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getControlTC() {
        return controlTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlTC( Float newControlTC ) {
        Float oldControlTC = controlTC;
        controlTC = newControlTC;
        boolean oldControlTCESet = controlTCESet;
        controlTCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC, oldControlTC, controlTC, !oldControlTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlTC() {
        Float oldControlTC = controlTC;
        boolean oldControlTCESet = controlTCESet;
        controlTC = CONTROL_TC_EDEFAULT;
        controlTCESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC, oldControlTC, CONTROL_TC_EDEFAULT, oldControlTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlTC() {
        return controlTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFeedWaterIG() {
        return feedWaterIG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFeedWaterIG( Float newFeedWaterIG ) {
        Float oldFeedWaterIG = feedWaterIG;
        feedWaterIG = newFeedWaterIG;
        boolean oldFeedWaterIGESet = feedWaterIGESet;
        feedWaterIGESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG, oldFeedWaterIG, feedWaterIG, !oldFeedWaterIGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFeedWaterIG() {
        Float oldFeedWaterIG = feedWaterIG;
        boolean oldFeedWaterIGESet = feedWaterIGESet;
        feedWaterIG = FEED_WATER_IG_EDEFAULT;
        feedWaterIGESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG,
                    oldFeedWaterIG, FEED_WATER_IG_EDEFAULT, oldFeedWaterIGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFeedWaterIG() {
        return feedWaterIGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFeedWaterPG() {
        return feedWaterPG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFeedWaterPG( Float newFeedWaterPG ) {
        Float oldFeedWaterPG = feedWaterPG;
        feedWaterPG = newFeedWaterPG;
        boolean oldFeedWaterPGESet = feedWaterPGESet;
        feedWaterPGESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG, oldFeedWaterPG, feedWaterPG, !oldFeedWaterPGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFeedWaterPG() {
        Float oldFeedWaterPG = feedWaterPG;
        boolean oldFeedWaterPGESet = feedWaterPGESet;
        feedWaterPG = FEED_WATER_PG_EDEFAULT;
        feedWaterPGESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG,
                    oldFeedWaterPG, FEED_WATER_PG_EDEFAULT, oldFeedWaterPGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFeedWaterPG() {
        return feedWaterPGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFeedWaterTC() {
        return feedWaterTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFeedWaterTC( Float newFeedWaterTC ) {
        Float oldFeedWaterTC = feedWaterTC;
        feedWaterTC = newFeedWaterTC;
        boolean oldFeedWaterTCESet = feedWaterTCESet;
        feedWaterTCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC, oldFeedWaterTC, feedWaterTC, !oldFeedWaterTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFeedWaterTC() {
        Float oldFeedWaterTC = feedWaterTC;
        boolean oldFeedWaterTCESet = feedWaterTCESet;
        feedWaterTC = FEED_WATER_TC_EDEFAULT;
        feedWaterTCESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC,
                    oldFeedWaterTC, FEED_WATER_TC_EDEFAULT, oldFeedWaterTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFeedWaterTC() {
        return feedWaterTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFuelDemandLimit() {
        return fuelDemandLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelDemandLimit( Float newFuelDemandLimit ) {
        Float oldFuelDemandLimit = fuelDemandLimit;
        fuelDemandLimit = newFuelDemandLimit;
        boolean oldFuelDemandLimitESet = fuelDemandLimitESet;
        fuelDemandLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT,
                    oldFuelDemandLimit, fuelDemandLimit, !oldFuelDemandLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelDemandLimit() {
        Float oldFuelDemandLimit = fuelDemandLimit;
        boolean oldFuelDemandLimitESet = fuelDemandLimitESet;
        fuelDemandLimit = FUEL_DEMAND_LIMIT_EDEFAULT;
        fuelDemandLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT,
                    oldFuelDemandLimit, FUEL_DEMAND_LIMIT_EDEFAULT, oldFuelDemandLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelDemandLimit() {
        return fuelDemandLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFuelSupplyDelay() {
        return fuelSupplyDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelSupplyDelay( Float newFuelSupplyDelay ) {
        Float oldFuelSupplyDelay = fuelSupplyDelay;
        fuelSupplyDelay = newFuelSupplyDelay;
        boolean oldFuelSupplyDelayESet = fuelSupplyDelayESet;
        fuelSupplyDelayESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY,
                    oldFuelSupplyDelay, fuelSupplyDelay, !oldFuelSupplyDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelSupplyDelay() {
        Float oldFuelSupplyDelay = fuelSupplyDelay;
        boolean oldFuelSupplyDelayESet = fuelSupplyDelayESet;
        fuelSupplyDelay = FUEL_SUPPLY_DELAY_EDEFAULT;
        fuelSupplyDelayESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY,
                    oldFuelSupplyDelay, FUEL_SUPPLY_DELAY_EDEFAULT, oldFuelSupplyDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelSupplyDelay() {
        return fuelSupplyDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFuelSupplyTC() {
        return fuelSupplyTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelSupplyTC( Float newFuelSupplyTC ) {
        Float oldFuelSupplyTC = fuelSupplyTC;
        fuelSupplyTC = newFuelSupplyTC;
        boolean oldFuelSupplyTCESet = fuelSupplyTCESet;
        fuelSupplyTCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC, oldFuelSupplyTC, fuelSupplyTC, !oldFuelSupplyTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelSupplyTC() {
        Float oldFuelSupplyTC = fuelSupplyTC;
        boolean oldFuelSupplyTCESet = fuelSupplyTCESet;
        fuelSupplyTC = FUEL_SUPPLY_TC_EDEFAULT;
        fuelSupplyTCESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC,
                    oldFuelSupplyTC, FUEL_SUPPLY_TC_EDEFAULT, oldFuelSupplyTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelSupplyTC() {
        return fuelSupplyTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxErrorRateP() {
        return maxErrorRateP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxErrorRateP( Float newMaxErrorRateP ) {
        Float oldMaxErrorRateP = maxErrorRateP;
        maxErrorRateP = newMaxErrorRateP;
        boolean oldMaxErrorRatePESet = maxErrorRatePESet;
        maxErrorRatePESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P,
                    oldMaxErrorRateP, maxErrorRateP, !oldMaxErrorRatePESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxErrorRateP() {
        Float oldMaxErrorRateP = maxErrorRateP;
        boolean oldMaxErrorRatePESet = maxErrorRatePESet;
        maxErrorRateP = MAX_ERROR_RATE_P_EDEFAULT;
        maxErrorRatePESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P,
                    oldMaxErrorRateP, MAX_ERROR_RATE_P_EDEFAULT, oldMaxErrorRatePESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxErrorRateP() {
        return maxErrorRatePESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMechPowerSensorLag() {
        return mechPowerSensorLag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMechPowerSensorLag( Float newMechPowerSensorLag ) {
        Float oldMechPowerSensorLag = mechPowerSensorLag;
        mechPowerSensorLag = newMechPowerSensorLag;
        boolean oldMechPowerSensorLagESet = mechPowerSensorLagESet;
        mechPowerSensorLagESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG,
                        oldMechPowerSensorLag, mechPowerSensorLag, !oldMechPowerSensorLagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMechPowerSensorLag() {
        Float oldMechPowerSensorLag = mechPowerSensorLag;
        boolean oldMechPowerSensorLagESet = mechPowerSensorLagESet;
        mechPowerSensorLag = MECH_POWER_SENSOR_LAG_EDEFAULT;
        mechPowerSensorLagESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG,
                        oldMechPowerSensorLag, MECH_POWER_SENSOR_LAG_EDEFAULT, oldMechPowerSensorLagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMechPowerSensorLag() {
        return mechPowerSensorLagESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinErrorRateP() {
        return minErrorRateP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinErrorRateP( Float newMinErrorRateP ) {
        Float oldMinErrorRateP = minErrorRateP;
        minErrorRateP = newMinErrorRateP;
        boolean oldMinErrorRatePESet = minErrorRatePESet;
        minErrorRatePESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P,
                    oldMinErrorRateP, minErrorRateP, !oldMinErrorRatePESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinErrorRateP() {
        Float oldMinErrorRateP = minErrorRateP;
        boolean oldMinErrorRatePESet = minErrorRatePESet;
        minErrorRateP = MIN_ERROR_RATE_P_EDEFAULT;
        minErrorRatePESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P,
                    oldMinErrorRateP, MIN_ERROR_RATE_P_EDEFAULT, oldMinErrorRatePESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinErrorRateP() {
        return minErrorRatePESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPressureCtrlDG() {
        return pressureCtrlDG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPressureCtrlDG( Float newPressureCtrlDG ) {
        Float oldPressureCtrlDG = pressureCtrlDG;
        pressureCtrlDG = newPressureCtrlDG;
        boolean oldPressureCtrlDGESet = pressureCtrlDGESet;
        pressureCtrlDGESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG,
                    oldPressureCtrlDG, pressureCtrlDG, !oldPressureCtrlDGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPressureCtrlDG() {
        Float oldPressureCtrlDG = pressureCtrlDG;
        boolean oldPressureCtrlDGESet = pressureCtrlDGESet;
        pressureCtrlDG = PRESSURE_CTRL_DG_EDEFAULT;
        pressureCtrlDGESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG,
                    oldPressureCtrlDG, PRESSURE_CTRL_DG_EDEFAULT, oldPressureCtrlDGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPressureCtrlDG() {
        return pressureCtrlDGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPressureCtrlIG() {
        return pressureCtrlIG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPressureCtrlIG( Float newPressureCtrlIG ) {
        Float oldPressureCtrlIG = pressureCtrlIG;
        pressureCtrlIG = newPressureCtrlIG;
        boolean oldPressureCtrlIGESet = pressureCtrlIGESet;
        pressureCtrlIGESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG,
                    oldPressureCtrlIG, pressureCtrlIG, !oldPressureCtrlIGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPressureCtrlIG() {
        Float oldPressureCtrlIG = pressureCtrlIG;
        boolean oldPressureCtrlIGESet = pressureCtrlIGESet;
        pressureCtrlIG = PRESSURE_CTRL_IG_EDEFAULT;
        pressureCtrlIGESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG,
                    oldPressureCtrlIG, PRESSURE_CTRL_IG_EDEFAULT, oldPressureCtrlIGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPressureCtrlIG() {
        return pressureCtrlIGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPressureCtrlPG() {
        return pressureCtrlPG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPressureCtrlPG( Float newPressureCtrlPG ) {
        Float oldPressureCtrlPG = pressureCtrlPG;
        pressureCtrlPG = newPressureCtrlPG;
        boolean oldPressureCtrlPGESet = pressureCtrlPGESet;
        pressureCtrlPGESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG,
                    oldPressureCtrlPG, pressureCtrlPG, !oldPressureCtrlPGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPressureCtrlPG() {
        Float oldPressureCtrlPG = pressureCtrlPG;
        boolean oldPressureCtrlPGESet = pressureCtrlPGESet;
        pressureCtrlPG = PRESSURE_CTRL_PG_EDEFAULT;
        pressureCtrlPGESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG,
                    oldPressureCtrlPG, PRESSURE_CTRL_PG_EDEFAULT, oldPressureCtrlPGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPressureCtrlPG() {
        return pressureCtrlPGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPressureFeedback() {
        return pressureFeedback;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPressureFeedback( Integer newPressureFeedback ) {
        Integer oldPressureFeedback = pressureFeedback;
        pressureFeedback = newPressureFeedback;
        boolean oldPressureFeedbackESet = pressureFeedbackESet;
        pressureFeedbackESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK,
                    oldPressureFeedback, pressureFeedback, !oldPressureFeedbackESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPressureFeedback() {
        Integer oldPressureFeedback = pressureFeedback;
        boolean oldPressureFeedbackESet = pressureFeedbackESet;
        pressureFeedback = PRESSURE_FEEDBACK_EDEFAULT;
        pressureFeedbackESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK,
                    oldPressureFeedback, PRESSURE_FEEDBACK_EDEFAULT, oldPressureFeedbackESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPressureFeedback() {
        return pressureFeedbackESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSuperHeater1Capacity() {
        return superHeater1Capacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuperHeater1Capacity( Float newSuperHeater1Capacity ) {
        Float oldSuperHeater1Capacity = superHeater1Capacity;
        superHeater1Capacity = newSuperHeater1Capacity;
        boolean oldSuperHeater1CapacityESet = superHeater1CapacityESet;
        superHeater1CapacityESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY,
                        oldSuperHeater1Capacity, superHeater1Capacity, !oldSuperHeater1CapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSuperHeater1Capacity() {
        Float oldSuperHeater1Capacity = superHeater1Capacity;
        boolean oldSuperHeater1CapacityESet = superHeater1CapacityESet;
        superHeater1Capacity = SUPER_HEATER1_CAPACITY_EDEFAULT;
        superHeater1CapacityESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY,
                        oldSuperHeater1Capacity, SUPER_HEATER1_CAPACITY_EDEFAULT, oldSuperHeater1CapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSuperHeater1Capacity() {
        return superHeater1CapacityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSuperHeater2Capacity() {
        return superHeater2Capacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuperHeater2Capacity( Float newSuperHeater2Capacity ) {
        Float oldSuperHeater2Capacity = superHeater2Capacity;
        superHeater2Capacity = newSuperHeater2Capacity;
        boolean oldSuperHeater2CapacityESet = superHeater2CapacityESet;
        superHeater2CapacityESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY,
                        oldSuperHeater2Capacity, superHeater2Capacity, !oldSuperHeater2CapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSuperHeater2Capacity() {
        Float oldSuperHeater2Capacity = superHeater2Capacity;
        boolean oldSuperHeater2CapacityESet = superHeater2CapacityESet;
        superHeater2Capacity = SUPER_HEATER2_CAPACITY_EDEFAULT;
        superHeater2CapacityESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY,
                        oldSuperHeater2Capacity, SUPER_HEATER2_CAPACITY_EDEFAULT, oldSuperHeater2CapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSuperHeater2Capacity() {
        return superHeater2CapacityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSuperHeaterPipePD() {
        return superHeaterPipePD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuperHeaterPipePD( Float newSuperHeaterPipePD ) {
        Float oldSuperHeaterPipePD = superHeaterPipePD;
        superHeaterPipePD = newSuperHeaterPipePD;
        boolean oldSuperHeaterPipePDESet = superHeaterPipePDESet;
        superHeaterPipePDESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD,
                        oldSuperHeaterPipePD, superHeaterPipePD, !oldSuperHeaterPipePDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSuperHeaterPipePD() {
        Float oldSuperHeaterPipePD = superHeaterPipePD;
        boolean oldSuperHeaterPipePDESet = superHeaterPipePDESet;
        superHeaterPipePD = SUPER_HEATER_PIPE_PD_EDEFAULT;
        superHeaterPipePDESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD,
                        oldSuperHeaterPipePD, SUPER_HEATER_PIPE_PD_EDEFAULT, oldSuperHeaterPipePDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSuperHeaterPipePD() {
        return superHeaterPipePDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThrottlePressureSP() {
        return throttlePressureSP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThrottlePressureSP( Float newThrottlePressureSP ) {
        Float oldThrottlePressureSP = throttlePressureSP;
        throttlePressureSP = newThrottlePressureSP;
        boolean oldThrottlePressureSPESet = throttlePressureSPESet;
        throttlePressureSPESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP,
                        oldThrottlePressureSP, throttlePressureSP, !oldThrottlePressureSPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThrottlePressureSP() {
        Float oldThrottlePressureSP = throttlePressureSP;
        boolean oldThrottlePressureSPESet = throttlePressureSPESet;
        throttlePressureSP = THROTTLE_PRESSURE_SP_EDEFAULT;
        throttlePressureSPESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP,
                        oldThrottlePressureSP, THROTTLE_PRESSURE_SP_EDEFAULT, oldThrottlePressureSPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThrottlePressureSP() {
        return throttlePressureSPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
            return getAuxPowerVersusFrequency();
        case CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
            return getAuxPowerVersusVoltage();
        case CimPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
            return getBoilerControlMode();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
            return getControlErrorBiasP();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
            return getControlIC();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
            return getControlPC();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
            return getControlPEB();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
            return getControlPED();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
            return getControlTC();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
            return getFeedWaterIG();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
            return getFeedWaterPG();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
            return getFeedWaterTC();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
            return getFuelDemandLimit();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
            return getFuelSupplyDelay();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
            return getFuelSupplyTC();
        case CimPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
            return getMaxErrorRateP();
        case CimPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
            return getMechPowerSensorLag();
        case CimPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
            return getMinErrorRateP();
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
            return getPressureCtrlDG();
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
            return getPressureCtrlIG();
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
            return getPressureCtrlPG();
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
            return getPressureFeedback();
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
            return getSuperHeater1Capacity();
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
            return getSuperHeater2Capacity();
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
            return getSuperHeaterPipePD();
        case CimPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
            return getThrottlePressureSP();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
            setAuxPowerVersusFrequency( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
            setAuxPowerVersusVoltage( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
            setBoilerControlMode( ( BoilerControlMode ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
            setControlErrorBiasP( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
            setControlIC( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
            setControlPC( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
            setControlPEB( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
            setControlPED( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
            setControlTC( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
            setFeedWaterIG( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
            setFeedWaterPG( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
            setFeedWaterTC( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
            setFuelDemandLimit( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
            setFuelSupplyDelay( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
            setFuelSupplyTC( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
            setMaxErrorRateP( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
            setMechPowerSensorLag( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
            setMinErrorRateP( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
            setPressureCtrlDG( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
            setPressureCtrlIG( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
            setPressureCtrlPG( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
            setPressureFeedback( ( Integer ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
            setSuperHeater1Capacity( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
            setSuperHeater2Capacity( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
            setSuperHeaterPipePD( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
            setThrottlePressureSP( ( Float ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
            unsetAuxPowerVersusFrequency();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
            unsetAuxPowerVersusVoltage();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
            unsetBoilerControlMode();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
            unsetControlErrorBiasP();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
            unsetControlIC();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
            unsetControlPC();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
            unsetControlPEB();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
            unsetControlPED();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
            unsetControlTC();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
            unsetFeedWaterIG();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
            unsetFeedWaterPG();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
            unsetFeedWaterTC();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
            unsetFuelDemandLimit();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
            unsetFuelSupplyDelay();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
            unsetFuelSupplyTC();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
            unsetMaxErrorRateP();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
            unsetMechPowerSensorLag();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
            unsetMinErrorRateP();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
            unsetPressureCtrlDG();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
            unsetPressureCtrlIG();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
            unsetPressureCtrlPG();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
            unsetPressureFeedback();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
            unsetSuperHeater1Capacity();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
            unsetSuperHeater2Capacity();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
            unsetSuperHeaterPipePD();
            return;
        case CimPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
            unsetThrottlePressureSP();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
            return isSetAuxPowerVersusFrequency();
        case CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
            return isSetAuxPowerVersusVoltage();
        case CimPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
            return isSetBoilerControlMode();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
            return isSetControlErrorBiasP();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
            return isSetControlIC();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
            return isSetControlPC();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
            return isSetControlPEB();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
            return isSetControlPED();
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
            return isSetControlTC();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
            return isSetFeedWaterIG();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
            return isSetFeedWaterPG();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
            return isSetFeedWaterTC();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
            return isSetFuelDemandLimit();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
            return isSetFuelSupplyDelay();
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
            return isSetFuelSupplyTC();
        case CimPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
            return isSetMaxErrorRateP();
        case CimPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
            return isSetMechPowerSensorLag();
        case CimPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
            return isSetMinErrorRateP();
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
            return isSetPressureCtrlDG();
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
            return isSetPressureCtrlIG();
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
            return isSetPressureCtrlPG();
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
            return isSetPressureFeedback();
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
            return isSetSuperHeater1Capacity();
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
            return isSetSuperHeater2Capacity();
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
            return isSetSuperHeaterPipePD();
        case CimPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
            return isSetThrottlePressureSP();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (auxPowerVersusFrequency: " );
        if( auxPowerVersusFrequencyESet )
            result.append( auxPowerVersusFrequency );
        else
            result.append( "<unset>" );
        result.append( ", auxPowerVersusVoltage: " );
        if( auxPowerVersusVoltageESet )
            result.append( auxPowerVersusVoltage );
        else
            result.append( "<unset>" );
        result.append( ", boilerControlMode: " );
        if( boilerControlModeESet )
            result.append( boilerControlMode );
        else
            result.append( "<unset>" );
        result.append( ", controlErrorBiasP: " );
        if( controlErrorBiasPESet )
            result.append( controlErrorBiasP );
        else
            result.append( "<unset>" );
        result.append( ", controlIC: " );
        if( controlICESet )
            result.append( controlIC );
        else
            result.append( "<unset>" );
        result.append( ", controlPC: " );
        if( controlPCESet )
            result.append( controlPC );
        else
            result.append( "<unset>" );
        result.append( ", controlPEB: " );
        if( controlPEBESet )
            result.append( controlPEB );
        else
            result.append( "<unset>" );
        result.append( ", controlPED: " );
        if( controlPEDESet )
            result.append( controlPED );
        else
            result.append( "<unset>" );
        result.append( ", controlTC: " );
        if( controlTCESet )
            result.append( controlTC );
        else
            result.append( "<unset>" );
        result.append( ", feedWaterIG: " );
        if( feedWaterIGESet )
            result.append( feedWaterIG );
        else
            result.append( "<unset>" );
        result.append( ", feedWaterPG: " );
        if( feedWaterPGESet )
            result.append( feedWaterPG );
        else
            result.append( "<unset>" );
        result.append( ", feedWaterTC: " );
        if( feedWaterTCESet )
            result.append( feedWaterTC );
        else
            result.append( "<unset>" );
        result.append( ", fuelDemandLimit: " );
        if( fuelDemandLimitESet )
            result.append( fuelDemandLimit );
        else
            result.append( "<unset>" );
        result.append( ", fuelSupplyDelay: " );
        if( fuelSupplyDelayESet )
            result.append( fuelSupplyDelay );
        else
            result.append( "<unset>" );
        result.append( ", fuelSupplyTC: " );
        if( fuelSupplyTCESet )
            result.append( fuelSupplyTC );
        else
            result.append( "<unset>" );
        result.append( ", maxErrorRateP: " );
        if( maxErrorRatePESet )
            result.append( maxErrorRateP );
        else
            result.append( "<unset>" );
        result.append( ", mechPowerSensorLag: " );
        if( mechPowerSensorLagESet )
            result.append( mechPowerSensorLag );
        else
            result.append( "<unset>" );
        result.append( ", minErrorRateP: " );
        if( minErrorRatePESet )
            result.append( minErrorRateP );
        else
            result.append( "<unset>" );
        result.append( ", pressureCtrlDG: " );
        if( pressureCtrlDGESet )
            result.append( pressureCtrlDG );
        else
            result.append( "<unset>" );
        result.append( ", pressureCtrlIG: " );
        if( pressureCtrlIGESet )
            result.append( pressureCtrlIG );
        else
            result.append( "<unset>" );
        result.append( ", pressureCtrlPG: " );
        if( pressureCtrlPGESet )
            result.append( pressureCtrlPG );
        else
            result.append( "<unset>" );
        result.append( ", pressureFeedback: " );
        if( pressureFeedbackESet )
            result.append( pressureFeedback );
        else
            result.append( "<unset>" );
        result.append( ", superHeater1Capacity: " );
        if( superHeater1CapacityESet )
            result.append( superHeater1Capacity );
        else
            result.append( "<unset>" );
        result.append( ", superHeater2Capacity: " );
        if( superHeater2CapacityESet )
            result.append( superHeater2Capacity );
        else
            result.append( "<unset>" );
        result.append( ", superHeaterPipePD: " );
        if( superHeaterPipePDESet )
            result.append( superHeaterPipePD );
        else
            result.append( "<unset>" );
        result.append( ", throttlePressureSP: " );
        if( throttlePressureSPESet )
            result.append( throttlePressureSP );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //FossilSteamSupplyImpl
