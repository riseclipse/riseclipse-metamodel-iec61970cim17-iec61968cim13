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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CTTempActivePowerCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combustion Turbine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getAmbientTemp <em>Ambient Temp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getHeatRecoveryFlag <em>Heat Recovery Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getPowerVariationByTemp <em>Power Variation By Temp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getReferenceTemp <em>Reference Temp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getTimeConstant <em>Time Constant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombustionTurbineImpl#getAirCompressor <em>Air Compressor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombustionTurbineImpl extends PrimeMoverImpl implements CombustionTurbine {
    /**
     * The default value of the '{@link #getAmbientTemp() <em>Ambient Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmbientTemp()
     * @generated
     * @ordered
     */
    protected static final Float AMBIENT_TEMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAmbientTemp() <em>Ambient Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmbientTemp()
     * @generated
     * @ordered
     */
    protected Float ambientTemp = AMBIENT_TEMP_EDEFAULT;

    /**
     * This is true if the Ambient Temp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ambientTempESet;

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
     * The default value of the '{@link #getCapabilityVersusFrequency() <em>Capability Versus Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityVersusFrequency()
     * @generated
     * @ordered
     */
    protected static final Float CAPABILITY_VERSUS_FREQUENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapabilityVersusFrequency() <em>Capability Versus Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityVersusFrequency()
     * @generated
     * @ordered
     */
    protected Float capabilityVersusFrequency = CAPABILITY_VERSUS_FREQUENCY_EDEFAULT;

    /**
     * This is true if the Capability Versus Frequency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capabilityVersusFrequencyESet;

    /**
     * The default value of the '{@link #getHeatRecoveryFlag() <em>Heat Recovery Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatRecoveryFlag()
     * @generated
     * @ordered
     */
    protected static final Boolean HEAT_RECOVERY_FLAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHeatRecoveryFlag() <em>Heat Recovery Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatRecoveryFlag()
     * @generated
     * @ordered
     */
    protected Boolean heatRecoveryFlag = HEAT_RECOVERY_FLAG_EDEFAULT;

    /**
     * This is true if the Heat Recovery Flag attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean heatRecoveryFlagESet;

    /**
     * The default value of the '{@link #getPowerVariationByTemp() <em>Power Variation By Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerVariationByTemp()
     * @generated
     * @ordered
     */
    protected static final Float POWER_VARIATION_BY_TEMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPowerVariationByTemp() <em>Power Variation By Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerVariationByTemp()
     * @generated
     * @ordered
     */
    protected Float powerVariationByTemp = POWER_VARIATION_BY_TEMP_EDEFAULT;

    /**
     * This is true if the Power Variation By Temp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerVariationByTempESet;

    /**
     * The default value of the '{@link #getReferenceTemp() <em>Reference Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceTemp()
     * @generated
     * @ordered
     */
    protected static final Float REFERENCE_TEMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReferenceTemp() <em>Reference Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceTemp()
     * @generated
     * @ordered
     */
    protected Float referenceTemp = REFERENCE_TEMP_EDEFAULT;

    /**
     * This is true if the Reference Temp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean referenceTempESet;

    /**
     * The default value of the '{@link #getTimeConstant() <em>Time Constant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeConstant()
     * @generated
     * @ordered
     */
    protected static final Float TIME_CONSTANT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeConstant() <em>Time Constant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeConstant()
     * @generated
     * @ordered
     */
    protected Float timeConstant = TIME_CONSTANT_EDEFAULT;

    /**
     * This is true if the Time Constant attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeConstantESet;

    /**
     * The cached value of the '{@link #getCTTempActivePowerCurve() <em>CT Temp Active Power Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCTTempActivePowerCurve()
     * @generated
     * @ordered
     */
    protected CTTempActivePowerCurve ctTempActivePowerCurve;

    /**
     * This is true if the CT Temp Active Power Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ctTempActivePowerCurveESet;

    /**
     * The cached value of the '{@link #getHeatRecoveryBoiler() <em>Heat Recovery Boiler</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatRecoveryBoiler()
     * @generated
     * @ordered
     */
    protected HeatRecoveryBoiler heatRecoveryBoiler;

    /**
     * This is true if the Heat Recovery Boiler reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean heatRecoveryBoilerESet;

    /**
     * The cached value of the '{@link #getAirCompressor() <em>Air Compressor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAirCompressor()
     * @generated
     * @ordered
     */
    protected AirCompressor airCompressor;

    /**
     * This is true if the Air Compressor reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean airCompressorESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CombustionTurbineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCombustionTurbine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAmbientTemp() {
        return ambientTemp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAmbientTemp( Float newAmbientTemp ) {
        Float oldAmbientTemp = ambientTemp;
        ambientTemp = newAmbientTemp;
        boolean oldAmbientTempESet = ambientTempESet;
        ambientTempESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COMBUSTION_TURBINE__AMBIENT_TEMP, oldAmbientTemp, ambientTemp, !oldAmbientTempESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAmbientTemp() {
        Float oldAmbientTemp = ambientTemp;
        boolean oldAmbientTempESet = ambientTempESet;
        ambientTemp = AMBIENT_TEMP_EDEFAULT;
        ambientTempESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.COMBUSTION_TURBINE__AMBIENT_TEMP,
                    oldAmbientTemp, AMBIENT_TEMP_EDEFAULT, oldAmbientTempESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAmbientTemp() {
        return ambientTempESet;
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
                CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY, oldAuxPowerVersusFrequency,
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
                CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY, oldAuxPowerVersusFrequency,
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
                new ENotificationImpl( this, Notification.SET, CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE,
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
                CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE, oldAuxPowerVersusVoltage,
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
    public Float getCapabilityVersusFrequency() {
        return capabilityVersusFrequency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapabilityVersusFrequency( Float newCapabilityVersusFrequency ) {
        Float oldCapabilityVersusFrequency = capabilityVersusFrequency;
        capabilityVersusFrequency = newCapabilityVersusFrequency;
        boolean oldCapabilityVersusFrequencyESet = capabilityVersusFrequencyESet;
        capabilityVersusFrequencyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY, oldCapabilityVersusFrequency,
                capabilityVersusFrequency, !oldCapabilityVersusFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapabilityVersusFrequency() {
        Float oldCapabilityVersusFrequency = capabilityVersusFrequency;
        boolean oldCapabilityVersusFrequencyESet = capabilityVersusFrequencyESet;
        capabilityVersusFrequency = CAPABILITY_VERSUS_FREQUENCY_EDEFAULT;
        capabilityVersusFrequencyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY, oldCapabilityVersusFrequency,
                CAPABILITY_VERSUS_FREQUENCY_EDEFAULT, oldCapabilityVersusFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapabilityVersusFrequency() {
        return capabilityVersusFrequencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getHeatRecoveryFlag() {
        return heatRecoveryFlag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeatRecoveryFlag( Boolean newHeatRecoveryFlag ) {
        Boolean oldHeatRecoveryFlag = heatRecoveryFlag;
        heatRecoveryFlag = newHeatRecoveryFlag;
        boolean oldHeatRecoveryFlagESet = heatRecoveryFlagESet;
        heatRecoveryFlagESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG,
                    oldHeatRecoveryFlag, heatRecoveryFlag, !oldHeatRecoveryFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHeatRecoveryFlag() {
        Boolean oldHeatRecoveryFlag = heatRecoveryFlag;
        boolean oldHeatRecoveryFlagESet = heatRecoveryFlagESet;
        heatRecoveryFlag = HEAT_RECOVERY_FLAG_EDEFAULT;
        heatRecoveryFlagESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG,
                    oldHeatRecoveryFlag, HEAT_RECOVERY_FLAG_EDEFAULT, oldHeatRecoveryFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHeatRecoveryFlag() {
        return heatRecoveryFlagESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPowerVariationByTemp() {
        return powerVariationByTemp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPowerVariationByTemp( Float newPowerVariationByTemp ) {
        Float oldPowerVariationByTemp = powerVariationByTemp;
        powerVariationByTemp = newPowerVariationByTemp;
        boolean oldPowerVariationByTempESet = powerVariationByTempESet;
        powerVariationByTempESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP,
                        oldPowerVariationByTemp, powerVariationByTemp, !oldPowerVariationByTempESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerVariationByTemp() {
        Float oldPowerVariationByTemp = powerVariationByTemp;
        boolean oldPowerVariationByTempESet = powerVariationByTempESet;
        powerVariationByTemp = POWER_VARIATION_BY_TEMP_EDEFAULT;
        powerVariationByTempESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP,
                        oldPowerVariationByTemp, POWER_VARIATION_BY_TEMP_EDEFAULT, oldPowerVariationByTempESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerVariationByTemp() {
        return powerVariationByTempESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getReferenceTemp() {
        return referenceTemp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferenceTemp( Float newReferenceTemp ) {
        Float oldReferenceTemp = referenceTemp;
        referenceTemp = newReferenceTemp;
        boolean oldReferenceTempESet = referenceTempESet;
        referenceTempESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.COMBUSTION_TURBINE__REFERENCE_TEMP,
                    oldReferenceTemp, referenceTemp, !oldReferenceTempESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferenceTemp() {
        Float oldReferenceTemp = referenceTemp;
        boolean oldReferenceTempESet = referenceTempESet;
        referenceTemp = REFERENCE_TEMP_EDEFAULT;
        referenceTempESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.COMBUSTION_TURBINE__REFERENCE_TEMP,
                    oldReferenceTemp, REFERENCE_TEMP_EDEFAULT, oldReferenceTempESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferenceTemp() {
        return referenceTempESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTimeConstant() {
        return timeConstant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeConstant( Float newTimeConstant ) {
        Float oldTimeConstant = timeConstant;
        timeConstant = newTimeConstant;
        boolean oldTimeConstantESet = timeConstantESet;
        timeConstantESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COMBUSTION_TURBINE__TIME_CONSTANT, oldTimeConstant, timeConstant, !oldTimeConstantESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeConstant() {
        Float oldTimeConstant = timeConstant;
        boolean oldTimeConstantESet = timeConstantESet;
        timeConstant = TIME_CONSTANT_EDEFAULT;
        timeConstantESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.COMBUSTION_TURBINE__TIME_CONSTANT,
                    oldTimeConstant, TIME_CONSTANT_EDEFAULT, oldTimeConstantESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeConstant() {
        return timeConstantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CTTempActivePowerCurve getCTTempActivePowerCurve() {
        return ctTempActivePowerCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCTTempActivePowerCurve( CTTempActivePowerCurve newCTTempActivePowerCurve,
            NotificationChain msgs ) {
        CTTempActivePowerCurve oldCTTempActivePowerCurve = ctTempActivePowerCurve;
        ctTempActivePowerCurve = newCTTempActivePowerCurve;
        boolean oldCTTempActivePowerCurveESet = ctTempActivePowerCurveESet;
        ctTempActivePowerCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, oldCTTempActivePowerCurve,
                    newCTTempActivePowerCurve, !oldCTTempActivePowerCurveESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCTTempActivePowerCurve( CTTempActivePowerCurve newCTTempActivePowerCurve ) {
        if( newCTTempActivePowerCurve != ctTempActivePowerCurve ) {
            NotificationChain msgs = null;
            if( ctTempActivePowerCurve != null )
                msgs = ( ( InternalEObject ) ctTempActivePowerCurve ).eInverseRemove( this,
                        CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, CTTempActivePowerCurve.class, msgs );
            if( newCTTempActivePowerCurve != null )
                msgs = ( ( InternalEObject ) newCTTempActivePowerCurve ).eInverseAdd( this,
                        CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, CTTempActivePowerCurve.class, msgs );
            msgs = basicSetCTTempActivePowerCurve( newCTTempActivePowerCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCTTempActivePowerCurveESet = ctTempActivePowerCurveESet;
            ctTempActivePowerCurveESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, newCTTempActivePowerCurve,
                    newCTTempActivePowerCurve, !oldCTTempActivePowerCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCTTempActivePowerCurve( NotificationChain msgs ) {
        CTTempActivePowerCurve oldCTTempActivePowerCurve = ctTempActivePowerCurve;
        ctTempActivePowerCurve = null;
        boolean oldCTTempActivePowerCurveESet = ctTempActivePowerCurveESet;
        ctTempActivePowerCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, oldCTTempActivePowerCurve, null,
                    oldCTTempActivePowerCurveESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCTTempActivePowerCurve() {
        if( ctTempActivePowerCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) ctTempActivePowerCurve ).eInverseRemove( this,
                    CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, CTTempActivePowerCurve.class, msgs );
            msgs = basicUnsetCTTempActivePowerCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCTTempActivePowerCurveESet = ctTempActivePowerCurveESet;
            ctTempActivePowerCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, null, null,
                    oldCTTempActivePowerCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCTTempActivePowerCurve() {
        return ctTempActivePowerCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HeatRecoveryBoiler getHeatRecoveryBoiler() {
        return heatRecoveryBoiler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHeatRecoveryBoiler( HeatRecoveryBoiler newHeatRecoveryBoiler,
            NotificationChain msgs ) {
        HeatRecoveryBoiler oldHeatRecoveryBoiler = heatRecoveryBoiler;
        heatRecoveryBoiler = newHeatRecoveryBoiler;
        boolean oldHeatRecoveryBoilerESet = heatRecoveryBoilerESet;
        heatRecoveryBoilerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER, oldHeatRecoveryBoiler, newHeatRecoveryBoiler,
                    !oldHeatRecoveryBoilerESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeatRecoveryBoiler( HeatRecoveryBoiler newHeatRecoveryBoiler ) {
        if( newHeatRecoveryBoiler != heatRecoveryBoiler ) {
            NotificationChain msgs = null;
            if( heatRecoveryBoiler != null ) msgs = ( ( InternalEObject ) heatRecoveryBoiler ).eInverseRemove( this,
                    CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, HeatRecoveryBoiler.class, msgs );
            if( newHeatRecoveryBoiler != null ) msgs = ( ( InternalEObject ) newHeatRecoveryBoiler ).eInverseAdd( this,
                    CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, HeatRecoveryBoiler.class, msgs );
            msgs = basicSetHeatRecoveryBoiler( newHeatRecoveryBoiler, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHeatRecoveryBoilerESet = heatRecoveryBoilerESet;
            heatRecoveryBoilerESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER,
                            newHeatRecoveryBoiler, newHeatRecoveryBoiler, !oldHeatRecoveryBoilerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHeatRecoveryBoiler( NotificationChain msgs ) {
        HeatRecoveryBoiler oldHeatRecoveryBoiler = heatRecoveryBoiler;
        heatRecoveryBoiler = null;
        boolean oldHeatRecoveryBoilerESet = heatRecoveryBoilerESet;
        heatRecoveryBoilerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER, oldHeatRecoveryBoiler, null,
                    oldHeatRecoveryBoilerESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHeatRecoveryBoiler() {
        if( heatRecoveryBoiler != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) heatRecoveryBoiler ).eInverseRemove( this,
                    CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, HeatRecoveryBoiler.class, msgs );
            msgs = basicUnsetHeatRecoveryBoiler( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHeatRecoveryBoilerESet = heatRecoveryBoilerESet;
            heatRecoveryBoilerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER, null, null, oldHeatRecoveryBoilerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHeatRecoveryBoiler() {
        return heatRecoveryBoilerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AirCompressor getAirCompressor() {
        return airCompressor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAirCompressor( AirCompressor newAirCompressor, NotificationChain msgs ) {
        AirCompressor oldAirCompressor = airCompressor;
        airCompressor = newAirCompressor;
        boolean oldAirCompressorESet = airCompressorESet;
        airCompressorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, oldAirCompressor, newAirCompressor,
                    !oldAirCompressorESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAirCompressor( AirCompressor newAirCompressor ) {
        if( newAirCompressor != airCompressor ) {
            NotificationChain msgs = null;
            if( airCompressor != null ) msgs = ( ( InternalEObject ) airCompressor ).eInverseRemove( this,
                    CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, AirCompressor.class, msgs );
            if( newAirCompressor != null ) msgs = ( ( InternalEObject ) newAirCompressor ).eInverseAdd( this,
                    CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, AirCompressor.class, msgs );
            msgs = basicSetAirCompressor( newAirCompressor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAirCompressorESet = airCompressorESet;
            airCompressorESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR,
                        newAirCompressor, newAirCompressor, !oldAirCompressorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAirCompressor( NotificationChain msgs ) {
        AirCompressor oldAirCompressor = airCompressor;
        airCompressor = null;
        boolean oldAirCompressorESet = airCompressorESet;
        airCompressorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, oldAirCompressor, null, oldAirCompressorESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAirCompressor() {
        if( airCompressor != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) airCompressor ).eInverseRemove( this,
                    CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, AirCompressor.class, msgs );
            msgs = basicUnsetAirCompressor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAirCompressorESet = airCompressorESet;
            airCompressorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, null, null, oldAirCompressorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAirCompressor() {
        return airCompressorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
            if( ctTempActivePowerCurve != null )
                msgs = ( ( InternalEObject ) ctTempActivePowerCurve ).eInverseRemove( this,
                        CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, CTTempActivePowerCurve.class, msgs );
            return basicSetCTTempActivePowerCurve( ( CTTempActivePowerCurve ) otherEnd, msgs );
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
            if( heatRecoveryBoiler != null ) msgs = ( ( InternalEObject ) heatRecoveryBoiler ).eInverseRemove( this,
                    CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, HeatRecoveryBoiler.class, msgs );
            return basicSetHeatRecoveryBoiler( ( HeatRecoveryBoiler ) otherEnd, msgs );
        case CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
            if( airCompressor != null ) msgs = ( ( InternalEObject ) airCompressor ).eInverseRemove( this,
                    CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, AirCompressor.class, msgs );
            return basicSetAirCompressor( ( AirCompressor ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
            return basicUnsetCTTempActivePowerCurve( msgs );
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
            return basicUnsetHeatRecoveryBoiler( msgs );
        case CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
            return basicUnsetAirCompressor( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
            return getAmbientTemp();
        case CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
            return getAuxPowerVersusFrequency();
        case CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
            return getAuxPowerVersusVoltage();
        case CimPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
            return getCapabilityVersusFrequency();
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
            return getHeatRecoveryFlag();
        case CimPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
            return getPowerVariationByTemp();
        case CimPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
            return getReferenceTemp();
        case CimPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
            return getTimeConstant();
        case CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
            return getCTTempActivePowerCurve();
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
            return getHeatRecoveryBoiler();
        case CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
            return getAirCompressor();
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
        case CimPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
            setAmbientTemp( ( Float ) newValue );
            return;
        case CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
            setAuxPowerVersusFrequency( ( Float ) newValue );
            return;
        case CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
            setAuxPowerVersusVoltage( ( Float ) newValue );
            return;
        case CimPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
            setCapabilityVersusFrequency( ( Float ) newValue );
            return;
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
            setHeatRecoveryFlag( ( Boolean ) newValue );
            return;
        case CimPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
            setPowerVariationByTemp( ( Float ) newValue );
            return;
        case CimPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
            setReferenceTemp( ( Float ) newValue );
            return;
        case CimPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
            setTimeConstant( ( Float ) newValue );
            return;
        case CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
            setCTTempActivePowerCurve( ( CTTempActivePowerCurve ) newValue );
            return;
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
            setHeatRecoveryBoiler( ( HeatRecoveryBoiler ) newValue );
            return;
        case CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
            setAirCompressor( ( AirCompressor ) newValue );
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
        case CimPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
            unsetAmbientTemp();
            return;
        case CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
            unsetAuxPowerVersusFrequency();
            return;
        case CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
            unsetAuxPowerVersusVoltage();
            return;
        case CimPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
            unsetCapabilityVersusFrequency();
            return;
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
            unsetHeatRecoveryFlag();
            return;
        case CimPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
            unsetPowerVariationByTemp();
            return;
        case CimPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
            unsetReferenceTemp();
            return;
        case CimPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
            unsetTimeConstant();
            return;
        case CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
            unsetCTTempActivePowerCurve();
            return;
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
            unsetHeatRecoveryBoiler();
            return;
        case CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
            unsetAirCompressor();
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
        case CimPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
            return isSetAmbientTemp();
        case CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
            return isSetAuxPowerVersusFrequency();
        case CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
            return isSetAuxPowerVersusVoltage();
        case CimPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
            return isSetCapabilityVersusFrequency();
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
            return isSetHeatRecoveryFlag();
        case CimPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
            return isSetPowerVariationByTemp();
        case CimPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
            return isSetReferenceTemp();
        case CimPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
            return isSetTimeConstant();
        case CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
            return isSetCTTempActivePowerCurve();
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
            return isSetHeatRecoveryBoiler();
        case CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
            return isSetAirCompressor();
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
        result.append( " (ambientTemp: " );
        if( ambientTempESet )
            result.append( ambientTemp );
        else
            result.append( "<unset>" );
        result.append( ", auxPowerVersusFrequency: " );
        if( auxPowerVersusFrequencyESet )
            result.append( auxPowerVersusFrequency );
        else
            result.append( "<unset>" );
        result.append( ", auxPowerVersusVoltage: " );
        if( auxPowerVersusVoltageESet )
            result.append( auxPowerVersusVoltage );
        else
            result.append( "<unset>" );
        result.append( ", capabilityVersusFrequency: " );
        if( capabilityVersusFrequencyESet )
            result.append( capabilityVersusFrequency );
        else
            result.append( "<unset>" );
        result.append( ", heatRecoveryFlag: " );
        if( heatRecoveryFlagESet )
            result.append( heatRecoveryFlag );
        else
            result.append( "<unset>" );
        result.append( ", powerVariationByTemp: " );
        if( powerVariationByTempESet )
            result.append( powerVariationByTemp );
        else
            result.append( "<unset>" );
        result.append( ", referenceTemp: " );
        if( referenceTempESet )
            result.append( referenceTemp );
        else
            result.append( "<unset>" );
        result.append( ", timeConstant: " );
        if( timeConstantESet )
            result.append( timeConstant );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CombustionTurbineImpl
