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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getBreakingCapacity <em>Breaking Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getGasWeightPerTank <em>Gas Weight Per Tank</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getIsSinglePhase <em>Is Single Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getIsUnganged <em>Is Unganged</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getLowPressureAlarm <em>Low Pressure Alarm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getLowPressureLockOut <em>Low Pressure Lock Out</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getOilVolumePerTank <em>Oil Volume Per Tank</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getRatedFrequency <em>Rated Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getRatedImpulseWithstandVoltage <em>Rated Impulse Withstand Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getRatedInterruptingTime <em>Rated Interrupting Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchInfoImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchInfoImpl extends AssetInfoImpl implements SwitchInfo {
    /**
     * The default value of the '{@link #getBreakingCapacity() <em>Breaking Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakingCapacity()
     * @generated
     * @ordered
     */
    protected static final Float BREAKING_CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBreakingCapacity() <em>Breaking Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakingCapacity()
     * @generated
     * @ordered
     */
    protected Float breakingCapacity = BREAKING_CAPACITY_EDEFAULT;

    /**
     * This is true if the Breaking Capacity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean breakingCapacityESet;

    /**
     * The default value of the '{@link #getGasWeightPerTank() <em>Gas Weight Per Tank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGasWeightPerTank()
     * @generated
     * @ordered
     */
    protected static final Float GAS_WEIGHT_PER_TANK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGasWeightPerTank() <em>Gas Weight Per Tank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGasWeightPerTank()
     * @generated
     * @ordered
     */
    protected Float gasWeightPerTank = GAS_WEIGHT_PER_TANK_EDEFAULT;

    /**
     * This is true if the Gas Weight Per Tank attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gasWeightPerTankESet;

    /**
     * The default value of the '{@link #getIsSinglePhase() <em>Is Single Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSinglePhase()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_SINGLE_PHASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsSinglePhase() <em>Is Single Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSinglePhase()
     * @generated
     * @ordered
     */
    protected Boolean isSinglePhase = IS_SINGLE_PHASE_EDEFAULT;

    /**
     * This is true if the Is Single Phase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSinglePhaseESet;

    /**
     * The default value of the '{@link #getIsUnganged() <em>Is Unganged</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsUnganged()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_UNGANGED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsUnganged() <em>Is Unganged</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsUnganged()
     * @generated
     * @ordered
     */
    protected Boolean isUnganged = IS_UNGANGED_EDEFAULT;

    /**
     * This is true if the Is Unganged attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isUngangedESet;

    /**
     * The default value of the '{@link #getLowPressureAlarm() <em>Low Pressure Alarm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowPressureAlarm()
     * @generated
     * @ordered
     */
    protected static final Float LOW_PRESSURE_ALARM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowPressureAlarm() <em>Low Pressure Alarm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowPressureAlarm()
     * @generated
     * @ordered
     */
    protected Float lowPressureAlarm = LOW_PRESSURE_ALARM_EDEFAULT;

    /**
     * This is true if the Low Pressure Alarm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowPressureAlarmESet;

    /**
     * The default value of the '{@link #getLowPressureLockOut() <em>Low Pressure Lock Out</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowPressureLockOut()
     * @generated
     * @ordered
     */
    protected static final Float LOW_PRESSURE_LOCK_OUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowPressureLockOut() <em>Low Pressure Lock Out</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowPressureLockOut()
     * @generated
     * @ordered
     */
    protected Float lowPressureLockOut = LOW_PRESSURE_LOCK_OUT_EDEFAULT;

    /**
     * This is true if the Low Pressure Lock Out attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowPressureLockOutESet;

    /**
     * The default value of the '{@link #getOilVolumePerTank() <em>Oil Volume Per Tank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOilVolumePerTank()
     * @generated
     * @ordered
     */
    protected static final Float OIL_VOLUME_PER_TANK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOilVolumePerTank() <em>Oil Volume Per Tank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOilVolumePerTank()
     * @generated
     * @ordered
     */
    protected Float oilVolumePerTank = OIL_VOLUME_PER_TANK_EDEFAULT;

    /**
     * This is true if the Oil Volume Per Tank attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oilVolumePerTankESet;

    /**
     * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected static final Float RATED_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected Float ratedCurrent = RATED_CURRENT_EDEFAULT;

    /**
     * This is true if the Rated Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedCurrentESet;

    /**
     * The default value of the '{@link #getRatedFrequency() <em>Rated Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedFrequency()
     * @generated
     * @ordered
     */
    protected static final Float RATED_FREQUENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedFrequency() <em>Rated Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedFrequency()
     * @generated
     * @ordered
     */
    protected Float ratedFrequency = RATED_FREQUENCY_EDEFAULT;

    /**
     * This is true if the Rated Frequency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedFrequencyESet;

    /**
     * The default value of the '{@link #getRatedImpulseWithstandVoltage() <em>Rated Impulse Withstand Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedImpulseWithstandVoltage()
     * @generated
     * @ordered
     */
    protected static final Float RATED_IMPULSE_WITHSTAND_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedImpulseWithstandVoltage() <em>Rated Impulse Withstand Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedImpulseWithstandVoltage()
     * @generated
     * @ordered
     */
    protected Float ratedImpulseWithstandVoltage = RATED_IMPULSE_WITHSTAND_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Rated Impulse Withstand Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedImpulseWithstandVoltageESet;

    /**
     * The default value of the '{@link #getRatedInterruptingTime() <em>Rated Interrupting Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedInterruptingTime()
     * @generated
     * @ordered
     */
    protected static final Float RATED_INTERRUPTING_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedInterruptingTime() <em>Rated Interrupting Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedInterruptingTime()
     * @generated
     * @ordered
     */
    protected Float ratedInterruptingTime = RATED_INTERRUPTING_TIME_EDEFAULT;

    /**
     * This is true if the Rated Interrupting Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedInterruptingTimeESet;

    /**
     * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedVoltage()
     * @generated
     * @ordered
     */
    protected static final Float RATED_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedVoltage()
     * @generated
     * @ordered
     */
    protected Float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Rated Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedVoltageESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitchInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBreakingCapacity() {
        return breakingCapacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBreakingCapacity( Float newBreakingCapacity ) {
        Float oldBreakingCapacity = breakingCapacity;
        breakingCapacity = newBreakingCapacity;
        boolean oldBreakingCapacityESet = breakingCapacityESet;
        breakingCapacityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH_INFO__BREAKING_CAPACITY,
                    oldBreakingCapacity, breakingCapacity, !oldBreakingCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBreakingCapacity() {
        Float oldBreakingCapacity = breakingCapacity;
        boolean oldBreakingCapacityESet = breakingCapacityESet;
        breakingCapacity = BREAKING_CAPACITY_EDEFAULT;
        breakingCapacityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH_INFO__BREAKING_CAPACITY,
                    oldBreakingCapacity, BREAKING_CAPACITY_EDEFAULT, oldBreakingCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreakingCapacity() {
        return breakingCapacityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGasWeightPerTank() {
        return gasWeightPerTank;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGasWeightPerTank( Float newGasWeightPerTank ) {
        Float oldGasWeightPerTank = gasWeightPerTank;
        gasWeightPerTank = newGasWeightPerTank;
        boolean oldGasWeightPerTankESet = gasWeightPerTankESet;
        gasWeightPerTankESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH_INFO__GAS_WEIGHT_PER_TANK,
                    oldGasWeightPerTank, gasWeightPerTank, !oldGasWeightPerTankESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGasWeightPerTank() {
        Float oldGasWeightPerTank = gasWeightPerTank;
        boolean oldGasWeightPerTankESet = gasWeightPerTankESet;
        gasWeightPerTank = GAS_WEIGHT_PER_TANK_EDEFAULT;
        gasWeightPerTankESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH_INFO__GAS_WEIGHT_PER_TANK,
                    oldGasWeightPerTank, GAS_WEIGHT_PER_TANK_EDEFAULT, oldGasWeightPerTankESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGasWeightPerTank() {
        return gasWeightPerTankESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsSinglePhase() {
        return isSinglePhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsSinglePhase( Boolean newIsSinglePhase ) {
        Boolean oldIsSinglePhase = isSinglePhase;
        isSinglePhase = newIsSinglePhase;
        boolean oldIsSinglePhaseESet = isSinglePhaseESet;
        isSinglePhaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_INFO__IS_SINGLE_PHASE, oldIsSinglePhase, isSinglePhase, !oldIsSinglePhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsSinglePhase() {
        Boolean oldIsSinglePhase = isSinglePhase;
        boolean oldIsSinglePhaseESet = isSinglePhaseESet;
        isSinglePhase = IS_SINGLE_PHASE_EDEFAULT;
        isSinglePhaseESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH_INFO__IS_SINGLE_PHASE,
                    oldIsSinglePhase, IS_SINGLE_PHASE_EDEFAULT, oldIsSinglePhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsSinglePhase() {
        return isSinglePhaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsUnganged() {
        return isUnganged;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsUnganged( Boolean newIsUnganged ) {
        Boolean oldIsUnganged = isUnganged;
        isUnganged = newIsUnganged;
        boolean oldIsUngangedESet = isUngangedESet;
        isUngangedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_INFO__IS_UNGANGED, oldIsUnganged, isUnganged, !oldIsUngangedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsUnganged() {
        Boolean oldIsUnganged = isUnganged;
        boolean oldIsUngangedESet = isUngangedESet;
        isUnganged = IS_UNGANGED_EDEFAULT;
        isUngangedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_INFO__IS_UNGANGED, oldIsUnganged, IS_UNGANGED_EDEFAULT, oldIsUngangedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsUnganged() {
        return isUngangedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLowPressureAlarm() {
        return lowPressureAlarm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowPressureAlarm( Float newLowPressureAlarm ) {
        Float oldLowPressureAlarm = lowPressureAlarm;
        lowPressureAlarm = newLowPressureAlarm;
        boolean oldLowPressureAlarmESet = lowPressureAlarmESet;
        lowPressureAlarmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH_INFO__LOW_PRESSURE_ALARM,
                    oldLowPressureAlarm, lowPressureAlarm, !oldLowPressureAlarmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowPressureAlarm() {
        Float oldLowPressureAlarm = lowPressureAlarm;
        boolean oldLowPressureAlarmESet = lowPressureAlarmESet;
        lowPressureAlarm = LOW_PRESSURE_ALARM_EDEFAULT;
        lowPressureAlarmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH_INFO__LOW_PRESSURE_ALARM,
                    oldLowPressureAlarm, LOW_PRESSURE_ALARM_EDEFAULT, oldLowPressureAlarmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowPressureAlarm() {
        return lowPressureAlarmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLowPressureLockOut() {
        return lowPressureLockOut;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowPressureLockOut( Float newLowPressureLockOut ) {
        Float oldLowPressureLockOut = lowPressureLockOut;
        lowPressureLockOut = newLowPressureLockOut;
        boolean oldLowPressureLockOutESet = lowPressureLockOutESet;
        lowPressureLockOutESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH_INFO__LOW_PRESSURE_LOCK_OUT,
                    oldLowPressureLockOut, lowPressureLockOut, !oldLowPressureLockOutESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowPressureLockOut() {
        Float oldLowPressureLockOut = lowPressureLockOut;
        boolean oldLowPressureLockOutESet = lowPressureLockOutESet;
        lowPressureLockOut = LOW_PRESSURE_LOCK_OUT_EDEFAULT;
        lowPressureLockOutESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH_INFO__LOW_PRESSURE_LOCK_OUT,
                    oldLowPressureLockOut, LOW_PRESSURE_LOCK_OUT_EDEFAULT, oldLowPressureLockOutESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowPressureLockOut() {
        return lowPressureLockOutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOilVolumePerTank() {
        return oilVolumePerTank;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOilVolumePerTank( Float newOilVolumePerTank ) {
        Float oldOilVolumePerTank = oilVolumePerTank;
        oilVolumePerTank = newOilVolumePerTank;
        boolean oldOilVolumePerTankESet = oilVolumePerTankESet;
        oilVolumePerTankESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH_INFO__OIL_VOLUME_PER_TANK,
                    oldOilVolumePerTank, oilVolumePerTank, !oldOilVolumePerTankESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOilVolumePerTank() {
        Float oldOilVolumePerTank = oilVolumePerTank;
        boolean oldOilVolumePerTankESet = oilVolumePerTankESet;
        oilVolumePerTank = OIL_VOLUME_PER_TANK_EDEFAULT;
        oilVolumePerTankESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH_INFO__OIL_VOLUME_PER_TANK,
                    oldOilVolumePerTank, OIL_VOLUME_PER_TANK_EDEFAULT, oldOilVolumePerTankESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOilVolumePerTank() {
        return oilVolumePerTankESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedCurrent( Float newRatedCurrent ) {
        Float oldRatedCurrent = ratedCurrent;
        ratedCurrent = newRatedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_INFO__RATED_CURRENT, oldRatedCurrent, ratedCurrent, !oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedCurrent() {
        Float oldRatedCurrent = ratedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrent = RATED_CURRENT_EDEFAULT;
        ratedCurrentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_INFO__RATED_CURRENT, oldRatedCurrent, RATED_CURRENT_EDEFAULT, oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedCurrent() {
        return ratedCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedFrequency() {
        return ratedFrequency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedFrequency( Float newRatedFrequency ) {
        Float oldRatedFrequency = ratedFrequency;
        ratedFrequency = newRatedFrequency;
        boolean oldRatedFrequencyESet = ratedFrequencyESet;
        ratedFrequencyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_INFO__RATED_FREQUENCY, oldRatedFrequency, ratedFrequency, !oldRatedFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedFrequency() {
        Float oldRatedFrequency = ratedFrequency;
        boolean oldRatedFrequencyESet = ratedFrequencyESet;
        ratedFrequency = RATED_FREQUENCY_EDEFAULT;
        ratedFrequencyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH_INFO__RATED_FREQUENCY,
                    oldRatedFrequency, RATED_FREQUENCY_EDEFAULT, oldRatedFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedFrequency() {
        return ratedFrequencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedImpulseWithstandVoltage() {
        return ratedImpulseWithstandVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedImpulseWithstandVoltage( Float newRatedImpulseWithstandVoltage ) {
        Float oldRatedImpulseWithstandVoltage = ratedImpulseWithstandVoltage;
        ratedImpulseWithstandVoltage = newRatedImpulseWithstandVoltage;
        boolean oldRatedImpulseWithstandVoltageESet = ratedImpulseWithstandVoltageESet;
        ratedImpulseWithstandVoltageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE, oldRatedImpulseWithstandVoltage,
                ratedImpulseWithstandVoltage, !oldRatedImpulseWithstandVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedImpulseWithstandVoltage() {
        Float oldRatedImpulseWithstandVoltage = ratedImpulseWithstandVoltage;
        boolean oldRatedImpulseWithstandVoltageESet = ratedImpulseWithstandVoltageESet;
        ratedImpulseWithstandVoltage = RATED_IMPULSE_WITHSTAND_VOLTAGE_EDEFAULT;
        ratedImpulseWithstandVoltageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE, oldRatedImpulseWithstandVoltage,
                RATED_IMPULSE_WITHSTAND_VOLTAGE_EDEFAULT, oldRatedImpulseWithstandVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedImpulseWithstandVoltage() {
        return ratedImpulseWithstandVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedInterruptingTime() {
        return ratedInterruptingTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedInterruptingTime( Float newRatedInterruptingTime ) {
        Float oldRatedInterruptingTime = ratedInterruptingTime;
        ratedInterruptingTime = newRatedInterruptingTime;
        boolean oldRatedInterruptingTimeESet = ratedInterruptingTimeESet;
        ratedInterruptingTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH_INFO__RATED_INTERRUPTING_TIME,
                    oldRatedInterruptingTime, ratedInterruptingTime, !oldRatedInterruptingTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedInterruptingTime() {
        Float oldRatedInterruptingTime = ratedInterruptingTime;
        boolean oldRatedInterruptingTimeESet = ratedInterruptingTimeESet;
        ratedInterruptingTime = RATED_INTERRUPTING_TIME_EDEFAULT;
        ratedInterruptingTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH_INFO__RATED_INTERRUPTING_TIME,
                    oldRatedInterruptingTime, RATED_INTERRUPTING_TIME_EDEFAULT, oldRatedInterruptingTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedInterruptingTime() {
        return ratedInterruptingTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedVoltage( Float newRatedVoltage ) {
        Float oldRatedVoltage = ratedVoltage;
        ratedVoltage = newRatedVoltage;
        boolean oldRatedVoltageESet = ratedVoltageESet;
        ratedVoltageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_INFO__RATED_VOLTAGE, oldRatedVoltage, ratedVoltage, !oldRatedVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedVoltage() {
        Float oldRatedVoltage = ratedVoltage;
        boolean oldRatedVoltageESet = ratedVoltageESet;
        ratedVoltage = RATED_VOLTAGE_EDEFAULT;
        ratedVoltageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_INFO__RATED_VOLTAGE, oldRatedVoltage, RATED_VOLTAGE_EDEFAULT, oldRatedVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedVoltage() {
        return ratedVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SWITCH_INFO__BREAKING_CAPACITY:
            return getBreakingCapacity();
        case CimPackage.SWITCH_INFO__GAS_WEIGHT_PER_TANK:
            return getGasWeightPerTank();
        case CimPackage.SWITCH_INFO__IS_SINGLE_PHASE:
            return getIsSinglePhase();
        case CimPackage.SWITCH_INFO__IS_UNGANGED:
            return getIsUnganged();
        case CimPackage.SWITCH_INFO__LOW_PRESSURE_ALARM:
            return getLowPressureAlarm();
        case CimPackage.SWITCH_INFO__LOW_PRESSURE_LOCK_OUT:
            return getLowPressureLockOut();
        case CimPackage.SWITCH_INFO__OIL_VOLUME_PER_TANK:
            return getOilVolumePerTank();
        case CimPackage.SWITCH_INFO__RATED_CURRENT:
            return getRatedCurrent();
        case CimPackage.SWITCH_INFO__RATED_FREQUENCY:
            return getRatedFrequency();
        case CimPackage.SWITCH_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE:
            return getRatedImpulseWithstandVoltage();
        case CimPackage.SWITCH_INFO__RATED_INTERRUPTING_TIME:
            return getRatedInterruptingTime();
        case CimPackage.SWITCH_INFO__RATED_VOLTAGE:
            return getRatedVoltage();
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
        case CimPackage.SWITCH_INFO__BREAKING_CAPACITY:
            setBreakingCapacity( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__GAS_WEIGHT_PER_TANK:
            setGasWeightPerTank( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__IS_SINGLE_PHASE:
            setIsSinglePhase( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH_INFO__IS_UNGANGED:
            setIsUnganged( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH_INFO__LOW_PRESSURE_ALARM:
            setLowPressureAlarm( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__LOW_PRESSURE_LOCK_OUT:
            setLowPressureLockOut( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__OIL_VOLUME_PER_TANK:
            setOilVolumePerTank( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__RATED_CURRENT:
            setRatedCurrent( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__RATED_FREQUENCY:
            setRatedFrequency( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE:
            setRatedImpulseWithstandVoltage( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__RATED_INTERRUPTING_TIME:
            setRatedInterruptingTime( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__RATED_VOLTAGE:
            setRatedVoltage( ( Float ) newValue );
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
        case CimPackage.SWITCH_INFO__BREAKING_CAPACITY:
            unsetBreakingCapacity();
            return;
        case CimPackage.SWITCH_INFO__GAS_WEIGHT_PER_TANK:
            unsetGasWeightPerTank();
            return;
        case CimPackage.SWITCH_INFO__IS_SINGLE_PHASE:
            unsetIsSinglePhase();
            return;
        case CimPackage.SWITCH_INFO__IS_UNGANGED:
            unsetIsUnganged();
            return;
        case CimPackage.SWITCH_INFO__LOW_PRESSURE_ALARM:
            unsetLowPressureAlarm();
            return;
        case CimPackage.SWITCH_INFO__LOW_PRESSURE_LOCK_OUT:
            unsetLowPressureLockOut();
            return;
        case CimPackage.SWITCH_INFO__OIL_VOLUME_PER_TANK:
            unsetOilVolumePerTank();
            return;
        case CimPackage.SWITCH_INFO__RATED_CURRENT:
            unsetRatedCurrent();
            return;
        case CimPackage.SWITCH_INFO__RATED_FREQUENCY:
            unsetRatedFrequency();
            return;
        case CimPackage.SWITCH_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE:
            unsetRatedImpulseWithstandVoltage();
            return;
        case CimPackage.SWITCH_INFO__RATED_INTERRUPTING_TIME:
            unsetRatedInterruptingTime();
            return;
        case CimPackage.SWITCH_INFO__RATED_VOLTAGE:
            unsetRatedVoltage();
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
        case CimPackage.SWITCH_INFO__BREAKING_CAPACITY:
            return isSetBreakingCapacity();
        case CimPackage.SWITCH_INFO__GAS_WEIGHT_PER_TANK:
            return isSetGasWeightPerTank();
        case CimPackage.SWITCH_INFO__IS_SINGLE_PHASE:
            return isSetIsSinglePhase();
        case CimPackage.SWITCH_INFO__IS_UNGANGED:
            return isSetIsUnganged();
        case CimPackage.SWITCH_INFO__LOW_PRESSURE_ALARM:
            return isSetLowPressureAlarm();
        case CimPackage.SWITCH_INFO__LOW_PRESSURE_LOCK_OUT:
            return isSetLowPressureLockOut();
        case CimPackage.SWITCH_INFO__OIL_VOLUME_PER_TANK:
            return isSetOilVolumePerTank();
        case CimPackage.SWITCH_INFO__RATED_CURRENT:
            return isSetRatedCurrent();
        case CimPackage.SWITCH_INFO__RATED_FREQUENCY:
            return isSetRatedFrequency();
        case CimPackage.SWITCH_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE:
            return isSetRatedImpulseWithstandVoltage();
        case CimPackage.SWITCH_INFO__RATED_INTERRUPTING_TIME:
            return isSetRatedInterruptingTime();
        case CimPackage.SWITCH_INFO__RATED_VOLTAGE:
            return isSetRatedVoltage();
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
        result.append( " (breakingCapacity: " );
        if( breakingCapacityESet )
            result.append( breakingCapacity );
        else
            result.append( "<unset>" );
        result.append( ", gasWeightPerTank: " );
        if( gasWeightPerTankESet )
            result.append( gasWeightPerTank );
        else
            result.append( "<unset>" );
        result.append( ", isSinglePhase: " );
        if( isSinglePhaseESet )
            result.append( isSinglePhase );
        else
            result.append( "<unset>" );
        result.append( ", isUnganged: " );
        if( isUngangedESet )
            result.append( isUnganged );
        else
            result.append( "<unset>" );
        result.append( ", lowPressureAlarm: " );
        if( lowPressureAlarmESet )
            result.append( lowPressureAlarm );
        else
            result.append( "<unset>" );
        result.append( ", lowPressureLockOut: " );
        if( lowPressureLockOutESet )
            result.append( lowPressureLockOut );
        else
            result.append( "<unset>" );
        result.append( ", oilVolumePerTank: " );
        if( oilVolumePerTankESet )
            result.append( oilVolumePerTank );
        else
            result.append( "<unset>" );
        result.append( ", ratedCurrent: " );
        if( ratedCurrentESet )
            result.append( ratedCurrent );
        else
            result.append( "<unset>" );
        result.append( ", ratedFrequency: " );
        if( ratedFrequencyESet )
            result.append( ratedFrequency );
        else
            result.append( "<unset>" );
        result.append( ", ratedImpulseWithstandVoltage: " );
        if( ratedImpulseWithstandVoltageESet )
            result.append( ratedImpulseWithstandVoltage );
        else
            result.append( "<unset>" );
        result.append( ", ratedInterruptingTime: " );
        if( ratedInterruptingTimeESet )
            result.append( ratedInterruptingTime );
        else
            result.append( "<unset>" );
        result.append( ", ratedVoltage: " );
        if( ratedVoltageESet )
            result.append( ratedVoltage );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SwitchInfoImpl
