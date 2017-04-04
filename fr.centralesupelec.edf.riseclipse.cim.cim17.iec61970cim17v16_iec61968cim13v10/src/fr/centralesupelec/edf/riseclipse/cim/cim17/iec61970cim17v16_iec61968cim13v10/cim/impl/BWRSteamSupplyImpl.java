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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BWRSteamSupply;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BWR Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getHighPowerLimit <em>High Power Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getInCoreThermalTC <em>In Core Thermal TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getIntegralGain <em>Integral Gain</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getLowPowerLimit <em>Low Power Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getPressureLimit <em>Pressure Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getPressureSetpointGA <em>Pressure Setpoint GA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getPressureSetpointTC1 <em>Pressure Setpoint TC1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getPressureSetpointTC2 <em>Pressure Setpoint TC2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getProportionalGain <em>Proportional Gain</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getRfAux1 <em>Rf Aux1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getRfAux2 <em>Rf Aux2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getRfAux3 <em>Rf Aux3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getRfAux4 <em>Rf Aux4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getRfAux5 <em>Rf Aux5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getRfAux6 <em>Rf Aux6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getRfAux7 <em>Rf Aux7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getRfAux8 <em>Rf Aux8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getRodPattern <em>Rod Pattern</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getRodPatternConstant <em>Rod Pattern Constant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BWRSteamSupplyImpl#getUpperLimit <em>Upper Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BWRSteamSupplyImpl extends SteamSupplyImpl implements BWRSteamSupply {
    /**
     * The default value of the '{@link #getHighPowerLimit() <em>High Power Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighPowerLimit()
     * @generated
     * @ordered
     */
    protected static final Float HIGH_POWER_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHighPowerLimit() <em>High Power Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighPowerLimit()
     * @generated
     * @ordered
     */
    protected Float highPowerLimit = HIGH_POWER_LIMIT_EDEFAULT;

    /**
     * This is true if the High Power Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highPowerLimitESet;

    /**
     * The default value of the '{@link #getInCoreThermalTC() <em>In Core Thermal TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInCoreThermalTC()
     * @generated
     * @ordered
     */
    protected static final Float IN_CORE_THERMAL_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInCoreThermalTC() <em>In Core Thermal TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInCoreThermalTC()
     * @generated
     * @ordered
     */
    protected Float inCoreThermalTC = IN_CORE_THERMAL_TC_EDEFAULT;

    /**
     * This is true if the In Core Thermal TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inCoreThermalTCESet;

    /**
     * The default value of the '{@link #getIntegralGain() <em>Integral Gain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntegralGain()
     * @generated
     * @ordered
     */
    protected static final Float INTEGRAL_GAIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIntegralGain() <em>Integral Gain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntegralGain()
     * @generated
     * @ordered
     */
    protected Float integralGain = INTEGRAL_GAIN_EDEFAULT;

    /**
     * This is true if the Integral Gain attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean integralGainESet;

    /**
     * The default value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerLimit()
     * @generated
     * @ordered
     */
    protected static final Float LOWER_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerLimit()
     * @generated
     * @ordered
     */
    protected Float lowerLimit = LOWER_LIMIT_EDEFAULT;

    /**
     * This is true if the Lower Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowerLimitESet;

    /**
     * The default value of the '{@link #getLowPowerLimit() <em>Low Power Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowPowerLimit()
     * @generated
     * @ordered
     */
    protected static final Float LOW_POWER_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowPowerLimit() <em>Low Power Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowPowerLimit()
     * @generated
     * @ordered
     */
    protected Float lowPowerLimit = LOW_POWER_LIMIT_EDEFAULT;

    /**
     * This is true if the Low Power Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowPowerLimitESet;

    /**
     * The default value of the '{@link #getPressureLimit() <em>Pressure Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureLimit()
     * @generated
     * @ordered
     */
    protected static final Float PRESSURE_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPressureLimit() <em>Pressure Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureLimit()
     * @generated
     * @ordered
     */
    protected Float pressureLimit = PRESSURE_LIMIT_EDEFAULT;

    /**
     * This is true if the Pressure Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pressureLimitESet;

    /**
     * The default value of the '{@link #getPressureSetpointGA() <em>Pressure Setpoint GA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureSetpointGA()
     * @generated
     * @ordered
     */
    protected static final Float PRESSURE_SETPOINT_GA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPressureSetpointGA() <em>Pressure Setpoint GA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureSetpointGA()
     * @generated
     * @ordered
     */
    protected Float pressureSetpointGA = PRESSURE_SETPOINT_GA_EDEFAULT;

    /**
     * This is true if the Pressure Setpoint GA attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pressureSetpointGAESet;

    /**
     * The default value of the '{@link #getPressureSetpointTC1() <em>Pressure Setpoint TC1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureSetpointTC1()
     * @generated
     * @ordered
     */
    protected static final Float PRESSURE_SETPOINT_TC1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPressureSetpointTC1() <em>Pressure Setpoint TC1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureSetpointTC1()
     * @generated
     * @ordered
     */
    protected Float pressureSetpointTC1 = PRESSURE_SETPOINT_TC1_EDEFAULT;

    /**
     * This is true if the Pressure Setpoint TC1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pressureSetpointTC1ESet;

    /**
     * The default value of the '{@link #getPressureSetpointTC2() <em>Pressure Setpoint TC2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureSetpointTC2()
     * @generated
     * @ordered
     */
    protected static final Float PRESSURE_SETPOINT_TC2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPressureSetpointTC2() <em>Pressure Setpoint TC2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureSetpointTC2()
     * @generated
     * @ordered
     */
    protected Float pressureSetpointTC2 = PRESSURE_SETPOINT_TC2_EDEFAULT;

    /**
     * This is true if the Pressure Setpoint TC2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pressureSetpointTC2ESet;

    /**
     * The default value of the '{@link #getProportionalGain() <em>Proportional Gain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProportionalGain()
     * @generated
     * @ordered
     */
    protected static final Float PROPORTIONAL_GAIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProportionalGain() <em>Proportional Gain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProportionalGain()
     * @generated
     * @ordered
     */
    protected Float proportionalGain = PROPORTIONAL_GAIN_EDEFAULT;

    /**
     * This is true if the Proportional Gain attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean proportionalGainESet;

    /**
     * The default value of the '{@link #getRfAux1() <em>Rf Aux1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux1()
     * @generated
     * @ordered
     */
    protected static final Float RF_AUX1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRfAux1() <em>Rf Aux1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux1()
     * @generated
     * @ordered
     */
    protected Float rfAux1 = RF_AUX1_EDEFAULT;

    /**
     * This is true if the Rf Aux1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rfAux1ESet;

    /**
     * The default value of the '{@link #getRfAux2() <em>Rf Aux2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux2()
     * @generated
     * @ordered
     */
    protected static final Float RF_AUX2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRfAux2() <em>Rf Aux2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux2()
     * @generated
     * @ordered
     */
    protected Float rfAux2 = RF_AUX2_EDEFAULT;

    /**
     * This is true if the Rf Aux2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rfAux2ESet;

    /**
     * The default value of the '{@link #getRfAux3() <em>Rf Aux3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux3()
     * @generated
     * @ordered
     */
    protected static final Float RF_AUX3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRfAux3() <em>Rf Aux3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux3()
     * @generated
     * @ordered
     */
    protected Float rfAux3 = RF_AUX3_EDEFAULT;

    /**
     * This is true if the Rf Aux3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rfAux3ESet;

    /**
     * The default value of the '{@link #getRfAux4() <em>Rf Aux4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux4()
     * @generated
     * @ordered
     */
    protected static final Float RF_AUX4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRfAux4() <em>Rf Aux4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux4()
     * @generated
     * @ordered
     */
    protected Float rfAux4 = RF_AUX4_EDEFAULT;

    /**
     * This is true if the Rf Aux4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rfAux4ESet;

    /**
     * The default value of the '{@link #getRfAux5() <em>Rf Aux5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux5()
     * @generated
     * @ordered
     */
    protected static final Float RF_AUX5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRfAux5() <em>Rf Aux5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux5()
     * @generated
     * @ordered
     */
    protected Float rfAux5 = RF_AUX5_EDEFAULT;

    /**
     * This is true if the Rf Aux5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rfAux5ESet;

    /**
     * The default value of the '{@link #getRfAux6() <em>Rf Aux6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux6()
     * @generated
     * @ordered
     */
    protected static final Float RF_AUX6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRfAux6() <em>Rf Aux6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux6()
     * @generated
     * @ordered
     */
    protected Float rfAux6 = RF_AUX6_EDEFAULT;

    /**
     * This is true if the Rf Aux6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rfAux6ESet;

    /**
     * The default value of the '{@link #getRfAux7() <em>Rf Aux7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux7()
     * @generated
     * @ordered
     */
    protected static final Float RF_AUX7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRfAux7() <em>Rf Aux7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux7()
     * @generated
     * @ordered
     */
    protected Float rfAux7 = RF_AUX7_EDEFAULT;

    /**
     * This is true if the Rf Aux7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rfAux7ESet;

    /**
     * The default value of the '{@link #getRfAux8() <em>Rf Aux8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux8()
     * @generated
     * @ordered
     */
    protected static final Float RF_AUX8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRfAux8() <em>Rf Aux8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfAux8()
     * @generated
     * @ordered
     */
    protected Float rfAux8 = RF_AUX8_EDEFAULT;

    /**
     * This is true if the Rf Aux8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rfAux8ESet;

    /**
     * The default value of the '{@link #getRodPattern() <em>Rod Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRodPattern()
     * @generated
     * @ordered
     */
    protected static final Float ROD_PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRodPattern() <em>Rod Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRodPattern()
     * @generated
     * @ordered
     */
    protected Float rodPattern = ROD_PATTERN_EDEFAULT;

    /**
     * This is true if the Rod Pattern attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rodPatternESet;

    /**
     * The default value of the '{@link #getRodPatternConstant() <em>Rod Pattern Constant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRodPatternConstant()
     * @generated
     * @ordered
     */
    protected static final Float ROD_PATTERN_CONSTANT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRodPatternConstant() <em>Rod Pattern Constant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRodPatternConstant()
     * @generated
     * @ordered
     */
    protected Float rodPatternConstant = ROD_PATTERN_CONSTANT_EDEFAULT;

    /**
     * This is true if the Rod Pattern Constant attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rodPatternConstantESet;

    /**
     * The default value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpperLimit()
     * @generated
     * @ordered
     */
    protected static final Float UPPER_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpperLimit()
     * @generated
     * @ordered
     */
    protected Float upperLimit = UPPER_LIMIT_EDEFAULT;

    /**
     * This is true if the Upper Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean upperLimitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BWRSteamSupplyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBWRSteamSupply();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHighPowerLimit() {
        return highPowerLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHighPowerLimit( Float newHighPowerLimit ) {
        Float oldHighPowerLimit = highPowerLimit;
        highPowerLimit = newHighPowerLimit;
        boolean oldHighPowerLimitESet = highPowerLimitESet;
        highPowerLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT,
                    oldHighPowerLimit, highPowerLimit, !oldHighPowerLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHighPowerLimit() {
        Float oldHighPowerLimit = highPowerLimit;
        boolean oldHighPowerLimitESet = highPowerLimitESet;
        highPowerLimit = HIGH_POWER_LIMIT_EDEFAULT;
        highPowerLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT,
                    oldHighPowerLimit, HIGH_POWER_LIMIT_EDEFAULT, oldHighPowerLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighPowerLimit() {
        return highPowerLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInCoreThermalTC() {
        return inCoreThermalTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInCoreThermalTC( Float newInCoreThermalTC ) {
        Float oldInCoreThermalTC = inCoreThermalTC;
        inCoreThermalTC = newInCoreThermalTC;
        boolean oldInCoreThermalTCESet = inCoreThermalTCESet;
        inCoreThermalTCESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC,
                    oldInCoreThermalTC, inCoreThermalTC, !oldInCoreThermalTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInCoreThermalTC() {
        Float oldInCoreThermalTC = inCoreThermalTC;
        boolean oldInCoreThermalTCESet = inCoreThermalTCESet;
        inCoreThermalTC = IN_CORE_THERMAL_TC_EDEFAULT;
        inCoreThermalTCESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC,
                    oldInCoreThermalTC, IN_CORE_THERMAL_TC_EDEFAULT, oldInCoreThermalTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInCoreThermalTC() {
        return inCoreThermalTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getIntegralGain() {
        return integralGain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIntegralGain( Float newIntegralGain ) {
        Float oldIntegralGain = integralGain;
        integralGain = newIntegralGain;
        boolean oldIntegralGainESet = integralGainESet;
        integralGainESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN, oldIntegralGain, integralGain, !oldIntegralGainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntegralGain() {
        Float oldIntegralGain = integralGain;
        boolean oldIntegralGainESet = integralGainESet;
        integralGain = INTEGRAL_GAIN_EDEFAULT;
        integralGainESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN,
                    oldIntegralGain, INTEGRAL_GAIN_EDEFAULT, oldIntegralGainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntegralGain() {
        return integralGainESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLowerLimit() {
        return lowerLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowerLimit( Float newLowerLimit ) {
        Float oldLowerLimit = lowerLimit;
        lowerLimit = newLowerLimit;
        boolean oldLowerLimitESet = lowerLimitESet;
        lowerLimitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT, oldLowerLimit, lowerLimit, !oldLowerLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowerLimit() {
        Float oldLowerLimit = lowerLimit;
        boolean oldLowerLimitESet = lowerLimitESet;
        lowerLimit = LOWER_LIMIT_EDEFAULT;
        lowerLimitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT, oldLowerLimit, LOWER_LIMIT_EDEFAULT, oldLowerLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowerLimit() {
        return lowerLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLowPowerLimit() {
        return lowPowerLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowPowerLimit( Float newLowPowerLimit ) {
        Float oldLowPowerLimit = lowPowerLimit;
        lowPowerLimit = newLowPowerLimit;
        boolean oldLowPowerLimitESet = lowPowerLimitESet;
        lowPowerLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT,
                    oldLowPowerLimit, lowPowerLimit, !oldLowPowerLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowPowerLimit() {
        Float oldLowPowerLimit = lowPowerLimit;
        boolean oldLowPowerLimitESet = lowPowerLimitESet;
        lowPowerLimit = LOW_POWER_LIMIT_EDEFAULT;
        lowPowerLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT,
                    oldLowPowerLimit, LOW_POWER_LIMIT_EDEFAULT, oldLowPowerLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowPowerLimit() {
        return lowPowerLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPressureLimit() {
        return pressureLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPressureLimit( Float newPressureLimit ) {
        Float oldPressureLimit = pressureLimit;
        pressureLimit = newPressureLimit;
        boolean oldPressureLimitESet = pressureLimitESet;
        pressureLimitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT, oldPressureLimit, pressureLimit, !oldPressureLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPressureLimit() {
        Float oldPressureLimit = pressureLimit;
        boolean oldPressureLimitESet = pressureLimitESet;
        pressureLimit = PRESSURE_LIMIT_EDEFAULT;
        pressureLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT,
                    oldPressureLimit, PRESSURE_LIMIT_EDEFAULT, oldPressureLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPressureLimit() {
        return pressureLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPressureSetpointGA() {
        return pressureSetpointGA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPressureSetpointGA( Float newPressureSetpointGA ) {
        Float oldPressureSetpointGA = pressureSetpointGA;
        pressureSetpointGA = newPressureSetpointGA;
        boolean oldPressureSetpointGAESet = pressureSetpointGAESet;
        pressureSetpointGAESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA,
                    oldPressureSetpointGA, pressureSetpointGA, !oldPressureSetpointGAESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPressureSetpointGA() {
        Float oldPressureSetpointGA = pressureSetpointGA;
        boolean oldPressureSetpointGAESet = pressureSetpointGAESet;
        pressureSetpointGA = PRESSURE_SETPOINT_GA_EDEFAULT;
        pressureSetpointGAESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA,
                    oldPressureSetpointGA, PRESSURE_SETPOINT_GA_EDEFAULT, oldPressureSetpointGAESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPressureSetpointGA() {
        return pressureSetpointGAESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPressureSetpointTC1() {
        return pressureSetpointTC1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPressureSetpointTC1( Float newPressureSetpointTC1 ) {
        Float oldPressureSetpointTC1 = pressureSetpointTC1;
        pressureSetpointTC1 = newPressureSetpointTC1;
        boolean oldPressureSetpointTC1ESet = pressureSetpointTC1ESet;
        pressureSetpointTC1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1,
                    oldPressureSetpointTC1, pressureSetpointTC1, !oldPressureSetpointTC1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPressureSetpointTC1() {
        Float oldPressureSetpointTC1 = pressureSetpointTC1;
        boolean oldPressureSetpointTC1ESet = pressureSetpointTC1ESet;
        pressureSetpointTC1 = PRESSURE_SETPOINT_TC1_EDEFAULT;
        pressureSetpointTC1ESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1,
                        oldPressureSetpointTC1, PRESSURE_SETPOINT_TC1_EDEFAULT, oldPressureSetpointTC1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPressureSetpointTC1() {
        return pressureSetpointTC1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPressureSetpointTC2() {
        return pressureSetpointTC2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPressureSetpointTC2( Float newPressureSetpointTC2 ) {
        Float oldPressureSetpointTC2 = pressureSetpointTC2;
        pressureSetpointTC2 = newPressureSetpointTC2;
        boolean oldPressureSetpointTC2ESet = pressureSetpointTC2ESet;
        pressureSetpointTC2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2,
                    oldPressureSetpointTC2, pressureSetpointTC2, !oldPressureSetpointTC2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPressureSetpointTC2() {
        Float oldPressureSetpointTC2 = pressureSetpointTC2;
        boolean oldPressureSetpointTC2ESet = pressureSetpointTC2ESet;
        pressureSetpointTC2 = PRESSURE_SETPOINT_TC2_EDEFAULT;
        pressureSetpointTC2ESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2,
                        oldPressureSetpointTC2, PRESSURE_SETPOINT_TC2_EDEFAULT, oldPressureSetpointTC2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPressureSetpointTC2() {
        return pressureSetpointTC2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getProportionalGain() {
        return proportionalGain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProportionalGain( Float newProportionalGain ) {
        Float oldProportionalGain = proportionalGain;
        proportionalGain = newProportionalGain;
        boolean oldProportionalGainESet = proportionalGainESet;
        proportionalGainESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN,
                    oldProportionalGain, proportionalGain, !oldProportionalGainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProportionalGain() {
        Float oldProportionalGain = proportionalGain;
        boolean oldProportionalGainESet = proportionalGainESet;
        proportionalGain = PROPORTIONAL_GAIN_EDEFAULT;
        proportionalGainESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN,
                    oldProportionalGain, PROPORTIONAL_GAIN_EDEFAULT, oldProportionalGainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProportionalGain() {
        return proportionalGainESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRfAux1() {
        return rfAux1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRfAux1( Float newRfAux1 ) {
        Float oldRfAux1 = rfAux1;
        rfAux1 = newRfAux1;
        boolean oldRfAux1ESet = rfAux1ESet;
        rfAux1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX1, oldRfAux1, rfAux1, !oldRfAux1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRfAux1() {
        Float oldRfAux1 = rfAux1;
        boolean oldRfAux1ESet = rfAux1ESet;
        rfAux1 = RF_AUX1_EDEFAULT;
        rfAux1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX1, oldRfAux1, RF_AUX1_EDEFAULT, oldRfAux1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRfAux1() {
        return rfAux1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRfAux2() {
        return rfAux2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRfAux2( Float newRfAux2 ) {
        Float oldRfAux2 = rfAux2;
        rfAux2 = newRfAux2;
        boolean oldRfAux2ESet = rfAux2ESet;
        rfAux2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX2, oldRfAux2, rfAux2, !oldRfAux2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRfAux2() {
        Float oldRfAux2 = rfAux2;
        boolean oldRfAux2ESet = rfAux2ESet;
        rfAux2 = RF_AUX2_EDEFAULT;
        rfAux2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX2, oldRfAux2, RF_AUX2_EDEFAULT, oldRfAux2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRfAux2() {
        return rfAux2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRfAux3() {
        return rfAux3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRfAux3( Float newRfAux3 ) {
        Float oldRfAux3 = rfAux3;
        rfAux3 = newRfAux3;
        boolean oldRfAux3ESet = rfAux3ESet;
        rfAux3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX3, oldRfAux3, rfAux3, !oldRfAux3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRfAux3() {
        Float oldRfAux3 = rfAux3;
        boolean oldRfAux3ESet = rfAux3ESet;
        rfAux3 = RF_AUX3_EDEFAULT;
        rfAux3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX3, oldRfAux3, RF_AUX3_EDEFAULT, oldRfAux3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRfAux3() {
        return rfAux3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRfAux4() {
        return rfAux4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRfAux4( Float newRfAux4 ) {
        Float oldRfAux4 = rfAux4;
        rfAux4 = newRfAux4;
        boolean oldRfAux4ESet = rfAux4ESet;
        rfAux4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX4, oldRfAux4, rfAux4, !oldRfAux4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRfAux4() {
        Float oldRfAux4 = rfAux4;
        boolean oldRfAux4ESet = rfAux4ESet;
        rfAux4 = RF_AUX4_EDEFAULT;
        rfAux4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX4, oldRfAux4, RF_AUX4_EDEFAULT, oldRfAux4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRfAux4() {
        return rfAux4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRfAux5() {
        return rfAux5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRfAux5( Float newRfAux5 ) {
        Float oldRfAux5 = rfAux5;
        rfAux5 = newRfAux5;
        boolean oldRfAux5ESet = rfAux5ESet;
        rfAux5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX5, oldRfAux5, rfAux5, !oldRfAux5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRfAux5() {
        Float oldRfAux5 = rfAux5;
        boolean oldRfAux5ESet = rfAux5ESet;
        rfAux5 = RF_AUX5_EDEFAULT;
        rfAux5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX5, oldRfAux5, RF_AUX5_EDEFAULT, oldRfAux5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRfAux5() {
        return rfAux5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRfAux6() {
        return rfAux6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRfAux6( Float newRfAux6 ) {
        Float oldRfAux6 = rfAux6;
        rfAux6 = newRfAux6;
        boolean oldRfAux6ESet = rfAux6ESet;
        rfAux6ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX6, oldRfAux6, rfAux6, !oldRfAux6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRfAux6() {
        Float oldRfAux6 = rfAux6;
        boolean oldRfAux6ESet = rfAux6ESet;
        rfAux6 = RF_AUX6_EDEFAULT;
        rfAux6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX6, oldRfAux6, RF_AUX6_EDEFAULT, oldRfAux6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRfAux6() {
        return rfAux6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRfAux7() {
        return rfAux7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRfAux7( Float newRfAux7 ) {
        Float oldRfAux7 = rfAux7;
        rfAux7 = newRfAux7;
        boolean oldRfAux7ESet = rfAux7ESet;
        rfAux7ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX7, oldRfAux7, rfAux7, !oldRfAux7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRfAux7() {
        Float oldRfAux7 = rfAux7;
        boolean oldRfAux7ESet = rfAux7ESet;
        rfAux7 = RF_AUX7_EDEFAULT;
        rfAux7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX7, oldRfAux7, RF_AUX7_EDEFAULT, oldRfAux7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRfAux7() {
        return rfAux7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRfAux8() {
        return rfAux8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRfAux8( Float newRfAux8 ) {
        Float oldRfAux8 = rfAux8;
        rfAux8 = newRfAux8;
        boolean oldRfAux8ESet = rfAux8ESet;
        rfAux8ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX8, oldRfAux8, rfAux8, !oldRfAux8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRfAux8() {
        Float oldRfAux8 = rfAux8;
        boolean oldRfAux8ESet = rfAux8ESet;
        rfAux8 = RF_AUX8_EDEFAULT;
        rfAux8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__RF_AUX8, oldRfAux8, RF_AUX8_EDEFAULT, oldRfAux8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRfAux8() {
        return rfAux8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRodPattern() {
        return rodPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRodPattern( Float newRodPattern ) {
        Float oldRodPattern = rodPattern;
        rodPattern = newRodPattern;
        boolean oldRodPatternESet = rodPatternESet;
        rodPatternESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN, oldRodPattern, rodPattern, !oldRodPatternESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRodPattern() {
        Float oldRodPattern = rodPattern;
        boolean oldRodPatternESet = rodPatternESet;
        rodPattern = ROD_PATTERN_EDEFAULT;
        rodPatternESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN, oldRodPattern, ROD_PATTERN_EDEFAULT, oldRodPatternESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRodPattern() {
        return rodPatternESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRodPatternConstant() {
        return rodPatternConstant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRodPatternConstant( Float newRodPatternConstant ) {
        Float oldRodPatternConstant = rodPatternConstant;
        rodPatternConstant = newRodPatternConstant;
        boolean oldRodPatternConstantESet = rodPatternConstantESet;
        rodPatternConstantESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT,
                    oldRodPatternConstant, rodPatternConstant, !oldRodPatternConstantESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRodPatternConstant() {
        Float oldRodPatternConstant = rodPatternConstant;
        boolean oldRodPatternConstantESet = rodPatternConstantESet;
        rodPatternConstant = ROD_PATTERN_CONSTANT_EDEFAULT;
        rodPatternConstantESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT,
                    oldRodPatternConstant, ROD_PATTERN_CONSTANT_EDEFAULT, oldRodPatternConstantESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRodPatternConstant() {
        return rodPatternConstantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUpperLimit() {
        return upperLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUpperLimit( Float newUpperLimit ) {
        Float oldUpperLimit = upperLimit;
        upperLimit = newUpperLimit;
        boolean oldUpperLimitESet = upperLimitESet;
        upperLimitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT, oldUpperLimit, upperLimit, !oldUpperLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpperLimit() {
        Float oldUpperLimit = upperLimit;
        boolean oldUpperLimitESet = upperLimitESet;
        upperLimit = UPPER_LIMIT_EDEFAULT;
        upperLimitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT, oldUpperLimit, UPPER_LIMIT_EDEFAULT, oldUpperLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpperLimit() {
        return upperLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT:
            return getHighPowerLimit();
        case CimPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC:
            return getInCoreThermalTC();
        case CimPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN:
            return getIntegralGain();
        case CimPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT:
            return getLowerLimit();
        case CimPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT:
            return getLowPowerLimit();
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT:
            return getPressureLimit();
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA:
            return getPressureSetpointGA();
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1:
            return getPressureSetpointTC1();
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2:
            return getPressureSetpointTC2();
        case CimPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN:
            return getProportionalGain();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX1:
            return getRfAux1();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX2:
            return getRfAux2();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX3:
            return getRfAux3();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX4:
            return getRfAux4();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX5:
            return getRfAux5();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX6:
            return getRfAux6();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX7:
            return getRfAux7();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX8:
            return getRfAux8();
        case CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN:
            return getRodPattern();
        case CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT:
            return getRodPatternConstant();
        case CimPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT:
            return getUpperLimit();
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
        case CimPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT:
            setHighPowerLimit( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC:
            setInCoreThermalTC( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN:
            setIntegralGain( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT:
            setLowerLimit( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT:
            setLowPowerLimit( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT:
            setPressureLimit( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA:
            setPressureSetpointGA( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1:
            setPressureSetpointTC1( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2:
            setPressureSetpointTC2( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN:
            setProportionalGain( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX1:
            setRfAux1( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX2:
            setRfAux2( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX3:
            setRfAux3( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX4:
            setRfAux4( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX5:
            setRfAux5( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX6:
            setRfAux6( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX7:
            setRfAux7( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX8:
            setRfAux8( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN:
            setRodPattern( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT:
            setRodPatternConstant( ( Float ) newValue );
            return;
        case CimPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT:
            setUpperLimit( ( Float ) newValue );
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
        case CimPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT:
            unsetHighPowerLimit();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC:
            unsetInCoreThermalTC();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN:
            unsetIntegralGain();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT:
            unsetLowerLimit();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT:
            unsetLowPowerLimit();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT:
            unsetPressureLimit();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA:
            unsetPressureSetpointGA();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1:
            unsetPressureSetpointTC1();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2:
            unsetPressureSetpointTC2();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN:
            unsetProportionalGain();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX1:
            unsetRfAux1();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX2:
            unsetRfAux2();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX3:
            unsetRfAux3();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX4:
            unsetRfAux4();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX5:
            unsetRfAux5();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX6:
            unsetRfAux6();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX7:
            unsetRfAux7();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX8:
            unsetRfAux8();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN:
            unsetRodPattern();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT:
            unsetRodPatternConstant();
            return;
        case CimPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT:
            unsetUpperLimit();
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
        case CimPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT:
            return isSetHighPowerLimit();
        case CimPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC:
            return isSetInCoreThermalTC();
        case CimPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN:
            return isSetIntegralGain();
        case CimPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT:
            return isSetLowerLimit();
        case CimPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT:
            return isSetLowPowerLimit();
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT:
            return isSetPressureLimit();
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA:
            return isSetPressureSetpointGA();
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1:
            return isSetPressureSetpointTC1();
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2:
            return isSetPressureSetpointTC2();
        case CimPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN:
            return isSetProportionalGain();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX1:
            return isSetRfAux1();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX2:
            return isSetRfAux2();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX3:
            return isSetRfAux3();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX4:
            return isSetRfAux4();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX5:
            return isSetRfAux5();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX6:
            return isSetRfAux6();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX7:
            return isSetRfAux7();
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX8:
            return isSetRfAux8();
        case CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN:
            return isSetRodPattern();
        case CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT:
            return isSetRodPatternConstant();
        case CimPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT:
            return isSetUpperLimit();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (highPowerLimit: " );
        if( highPowerLimitESet )
            result.append( highPowerLimit );
        else
            result.append( "<unset>" );
        result.append( ", inCoreThermalTC: " );
        if( inCoreThermalTCESet )
            result.append( inCoreThermalTC );
        else
            result.append( "<unset>" );
        result.append( ", integralGain: " );
        if( integralGainESet )
            result.append( integralGain );
        else
            result.append( "<unset>" );
        result.append( ", lowerLimit: " );
        if( lowerLimitESet )
            result.append( lowerLimit );
        else
            result.append( "<unset>" );
        result.append( ", lowPowerLimit: " );
        if( lowPowerLimitESet )
            result.append( lowPowerLimit );
        else
            result.append( "<unset>" );
        result.append( ", pressureLimit: " );
        if( pressureLimitESet )
            result.append( pressureLimit );
        else
            result.append( "<unset>" );
        result.append( ", pressureSetpointGA: " );
        if( pressureSetpointGAESet )
            result.append( pressureSetpointGA );
        else
            result.append( "<unset>" );
        result.append( ", pressureSetpointTC1: " );
        if( pressureSetpointTC1ESet )
            result.append( pressureSetpointTC1 );
        else
            result.append( "<unset>" );
        result.append( ", pressureSetpointTC2: " );
        if( pressureSetpointTC2ESet )
            result.append( pressureSetpointTC2 );
        else
            result.append( "<unset>" );
        result.append( ", proportionalGain: " );
        if( proportionalGainESet )
            result.append( proportionalGain );
        else
            result.append( "<unset>" );
        result.append( ", rfAux1: " );
        if( rfAux1ESet )
            result.append( rfAux1 );
        else
            result.append( "<unset>" );
        result.append( ", rfAux2: " );
        if( rfAux2ESet )
            result.append( rfAux2 );
        else
            result.append( "<unset>" );
        result.append( ", rfAux3: " );
        if( rfAux3ESet )
            result.append( rfAux3 );
        else
            result.append( "<unset>" );
        result.append( ", rfAux4: " );
        if( rfAux4ESet )
            result.append( rfAux4 );
        else
            result.append( "<unset>" );
        result.append( ", rfAux5: " );
        if( rfAux5ESet )
            result.append( rfAux5 );
        else
            result.append( "<unset>" );
        result.append( ", rfAux6: " );
        if( rfAux6ESet )
            result.append( rfAux6 );
        else
            result.append( "<unset>" );
        result.append( ", rfAux7: " );
        if( rfAux7ESet )
            result.append( rfAux7 );
        else
            result.append( "<unset>" );
        result.append( ", rfAux8: " );
        if( rfAux8ESet )
            result.append( rfAux8 );
        else
            result.append( "<unset>" );
        result.append( ", rodPattern: " );
        if( rodPatternESet )
            result.append( rodPattern );
        else
            result.append( "<unset>" );
        result.append( ", rodPatternConstant: " );
        if( rodPatternConstantESet )
            result.append( rodPatternConstant );
        else
            result.append( "<unset>" );
        result.append( ", upperLimit: " );
        if( upperLimitESet )
            result.append( upperLimit );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BWRSteamSupplyImpl
