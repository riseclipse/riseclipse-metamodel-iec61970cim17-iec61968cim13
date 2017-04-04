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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating Mechanism Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingMechanismInfoImpl#getCloseAmps <em>Close Amps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingMechanismInfoImpl#getCloseVoltage <em>Close Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingMechanismInfoImpl#getMechanismKind <em>Mechanism Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingMechanismInfoImpl#getMotorRunCurrent <em>Motor Run Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingMechanismInfoImpl#getMotorStartCurrent <em>Motor Start Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingMechanismInfoImpl#getMotorVoltage <em>Motor Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingMechanismInfoImpl#getTripAmps <em>Trip Amps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingMechanismInfoImpl#getTripVoltage <em>Trip Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingMechanismInfoImpl extends AssetInfoImpl implements OperatingMechanismInfo {
    /**
     * The default value of the '{@link #getCloseAmps() <em>Close Amps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCloseAmps()
     * @generated
     * @ordered
     */
    protected static final Float CLOSE_AMPS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCloseAmps() <em>Close Amps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCloseAmps()
     * @generated
     * @ordered
     */
    protected Float closeAmps = CLOSE_AMPS_EDEFAULT;

    /**
     * This is true if the Close Amps attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean closeAmpsESet;

    /**
     * The default value of the '{@link #getCloseVoltage() <em>Close Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCloseVoltage()
     * @generated
     * @ordered
     */
    protected static final Float CLOSE_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCloseVoltage() <em>Close Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCloseVoltage()
     * @generated
     * @ordered
     */
    protected Float closeVoltage = CLOSE_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Close Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean closeVoltageESet;

    /**
     * The default value of the '{@link #getMechanismKind() <em>Mechanism Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMechanismKind()
     * @generated
     * @ordered
     */
    protected static final OperatingMechanismKind MECHANISM_KIND_EDEFAULT = OperatingMechanismKind.CAPACITOR_TRIP;

    /**
     * The cached value of the '{@link #getMechanismKind() <em>Mechanism Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMechanismKind()
     * @generated
     * @ordered
     */
    protected OperatingMechanismKind mechanismKind = MECHANISM_KIND_EDEFAULT;

    /**
     * This is true if the Mechanism Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mechanismKindESet;

    /**
     * The default value of the '{@link #getMotorRunCurrent() <em>Motor Run Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMotorRunCurrent()
     * @generated
     * @ordered
     */
    protected static final Float MOTOR_RUN_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMotorRunCurrent() <em>Motor Run Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMotorRunCurrent()
     * @generated
     * @ordered
     */
    protected Float motorRunCurrent = MOTOR_RUN_CURRENT_EDEFAULT;

    /**
     * This is true if the Motor Run Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean motorRunCurrentESet;

    /**
     * The default value of the '{@link #getMotorStartCurrent() <em>Motor Start Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMotorStartCurrent()
     * @generated
     * @ordered
     */
    protected static final Float MOTOR_START_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMotorStartCurrent() <em>Motor Start Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMotorStartCurrent()
     * @generated
     * @ordered
     */
    protected Float motorStartCurrent = MOTOR_START_CURRENT_EDEFAULT;

    /**
     * This is true if the Motor Start Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean motorStartCurrentESet;

    /**
     * The default value of the '{@link #getMotorVoltage() <em>Motor Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMotorVoltage()
     * @generated
     * @ordered
     */
    protected static final Float MOTOR_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMotorVoltage() <em>Motor Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMotorVoltage()
     * @generated
     * @ordered
     */
    protected Float motorVoltage = MOTOR_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Motor Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean motorVoltageESet;

    /**
     * The default value of the '{@link #getTripAmps() <em>Trip Amps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTripAmps()
     * @generated
     * @ordered
     */
    protected static final Float TRIP_AMPS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTripAmps() <em>Trip Amps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTripAmps()
     * @generated
     * @ordered
     */
    protected Float tripAmps = TRIP_AMPS_EDEFAULT;

    /**
     * This is true if the Trip Amps attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tripAmpsESet;

    /**
     * The default value of the '{@link #getTripVoltage() <em>Trip Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTripVoltage()
     * @generated
     * @ordered
     */
    protected static final Float TRIP_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTripVoltage() <em>Trip Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTripVoltage()
     * @generated
     * @ordered
     */
    protected Float tripVoltage = TRIP_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Trip Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tripVoltageESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperatingMechanismInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOperatingMechanismInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCloseAmps() {
        return closeAmps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCloseAmps( Float newCloseAmps ) {
        Float oldCloseAmps = closeAmps;
        closeAmps = newCloseAmps;
        boolean oldCloseAmpsESet = closeAmpsESet;
        closeAmpsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OPERATING_MECHANISM_INFO__CLOSE_AMPS, oldCloseAmps, closeAmps, !oldCloseAmpsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCloseAmps() {
        Float oldCloseAmps = closeAmps;
        boolean oldCloseAmpsESet = closeAmpsESet;
        closeAmps = CLOSE_AMPS_EDEFAULT;
        closeAmpsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OPERATING_MECHANISM_INFO__CLOSE_AMPS,
                    oldCloseAmps, CLOSE_AMPS_EDEFAULT, oldCloseAmpsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCloseAmps() {
        return closeAmpsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCloseVoltage() {
        return closeVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCloseVoltage( Float newCloseVoltage ) {
        Float oldCloseVoltage = closeVoltage;
        closeVoltage = newCloseVoltage;
        boolean oldCloseVoltageESet = closeVoltageESet;
        closeVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OPERATING_MECHANISM_INFO__CLOSE_VOLTAGE,
                    oldCloseVoltage, closeVoltage, !oldCloseVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCloseVoltage() {
        Float oldCloseVoltage = closeVoltage;
        boolean oldCloseVoltageESet = closeVoltageESet;
        closeVoltage = CLOSE_VOLTAGE_EDEFAULT;
        closeVoltageESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.OPERATING_MECHANISM_INFO__CLOSE_VOLTAGE,
                        oldCloseVoltage, CLOSE_VOLTAGE_EDEFAULT, oldCloseVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCloseVoltage() {
        return closeVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperatingMechanismKind getMechanismKind() {
        return mechanismKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMechanismKind( OperatingMechanismKind newMechanismKind ) {
        OperatingMechanismKind oldMechanismKind = mechanismKind;
        mechanismKind = newMechanismKind == null ? MECHANISM_KIND_EDEFAULT : newMechanismKind;
        boolean oldMechanismKindESet = mechanismKindESet;
        mechanismKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OPERATING_MECHANISM_INFO__MECHANISM_KIND,
                    oldMechanismKind, mechanismKind, !oldMechanismKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMechanismKind() {
        OperatingMechanismKind oldMechanismKind = mechanismKind;
        boolean oldMechanismKindESet = mechanismKindESet;
        mechanismKind = MECHANISM_KIND_EDEFAULT;
        mechanismKindESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.OPERATING_MECHANISM_INFO__MECHANISM_KIND,
                        oldMechanismKind, MECHANISM_KIND_EDEFAULT, oldMechanismKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMechanismKind() {
        return mechanismKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMotorRunCurrent() {
        return motorRunCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMotorRunCurrent( Float newMotorRunCurrent ) {
        Float oldMotorRunCurrent = motorRunCurrent;
        motorRunCurrent = newMotorRunCurrent;
        boolean oldMotorRunCurrentESet = motorRunCurrentESet;
        motorRunCurrentESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.OPERATING_MECHANISM_INFO__MOTOR_RUN_CURRENT,
                        oldMotorRunCurrent, motorRunCurrent, !oldMotorRunCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMotorRunCurrent() {
        Float oldMotorRunCurrent = motorRunCurrent;
        boolean oldMotorRunCurrentESet = motorRunCurrentESet;
        motorRunCurrent = MOTOR_RUN_CURRENT_EDEFAULT;
        motorRunCurrentESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.OPERATING_MECHANISM_INFO__MOTOR_RUN_CURRENT,
                        oldMotorRunCurrent, MOTOR_RUN_CURRENT_EDEFAULT, oldMotorRunCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMotorRunCurrent() {
        return motorRunCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMotorStartCurrent() {
        return motorStartCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMotorStartCurrent( Float newMotorStartCurrent ) {
        Float oldMotorStartCurrent = motorStartCurrent;
        motorStartCurrent = newMotorStartCurrent;
        boolean oldMotorStartCurrentESet = motorStartCurrentESet;
        motorStartCurrentESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.OPERATING_MECHANISM_INFO__MOTOR_START_CURRENT,
                        oldMotorStartCurrent, motorStartCurrent, !oldMotorStartCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMotorStartCurrent() {
        Float oldMotorStartCurrent = motorStartCurrent;
        boolean oldMotorStartCurrentESet = motorStartCurrentESet;
        motorStartCurrent = MOTOR_START_CURRENT_EDEFAULT;
        motorStartCurrentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OPERATING_MECHANISM_INFO__MOTOR_START_CURRENT, oldMotorStartCurrent,
                MOTOR_START_CURRENT_EDEFAULT, oldMotorStartCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMotorStartCurrent() {
        return motorStartCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMotorVoltage() {
        return motorVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMotorVoltage( Float newMotorVoltage ) {
        Float oldMotorVoltage = motorVoltage;
        motorVoltage = newMotorVoltage;
        boolean oldMotorVoltageESet = motorVoltageESet;
        motorVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OPERATING_MECHANISM_INFO__MOTOR_VOLTAGE,
                    oldMotorVoltage, motorVoltage, !oldMotorVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMotorVoltage() {
        Float oldMotorVoltage = motorVoltage;
        boolean oldMotorVoltageESet = motorVoltageESet;
        motorVoltage = MOTOR_VOLTAGE_EDEFAULT;
        motorVoltageESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.OPERATING_MECHANISM_INFO__MOTOR_VOLTAGE,
                        oldMotorVoltage, MOTOR_VOLTAGE_EDEFAULT, oldMotorVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMotorVoltage() {
        return motorVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTripAmps() {
        return tripAmps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTripAmps( Float newTripAmps ) {
        Float oldTripAmps = tripAmps;
        tripAmps = newTripAmps;
        boolean oldTripAmpsESet = tripAmpsESet;
        tripAmpsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OPERATING_MECHANISM_INFO__TRIP_AMPS, oldTripAmps, tripAmps, !oldTripAmpsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTripAmps() {
        Float oldTripAmps = tripAmps;
        boolean oldTripAmpsESet = tripAmpsESet;
        tripAmps = TRIP_AMPS_EDEFAULT;
        tripAmpsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OPERATING_MECHANISM_INFO__TRIP_AMPS, oldTripAmps, TRIP_AMPS_EDEFAULT, oldTripAmpsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTripAmps() {
        return tripAmpsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTripVoltage() {
        return tripVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTripVoltage( Float newTripVoltage ) {
        Float oldTripVoltage = tripVoltage;
        tripVoltage = newTripVoltage;
        boolean oldTripVoltageESet = tripVoltageESet;
        tripVoltageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OPERATING_MECHANISM_INFO__TRIP_VOLTAGE, oldTripVoltage, tripVoltage, !oldTripVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTripVoltage() {
        Float oldTripVoltage = tripVoltage;
        boolean oldTripVoltageESet = tripVoltageESet;
        tripVoltage = TRIP_VOLTAGE_EDEFAULT;
        tripVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OPERATING_MECHANISM_INFO__TRIP_VOLTAGE,
                    oldTripVoltage, TRIP_VOLTAGE_EDEFAULT, oldTripVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTripVoltage() {
        return tripVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.OPERATING_MECHANISM_INFO__CLOSE_AMPS:
            return getCloseAmps();
        case CimPackage.OPERATING_MECHANISM_INFO__CLOSE_VOLTAGE:
            return getCloseVoltage();
        case CimPackage.OPERATING_MECHANISM_INFO__MECHANISM_KIND:
            return getMechanismKind();
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_RUN_CURRENT:
            return getMotorRunCurrent();
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_START_CURRENT:
            return getMotorStartCurrent();
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_VOLTAGE:
            return getMotorVoltage();
        case CimPackage.OPERATING_MECHANISM_INFO__TRIP_AMPS:
            return getTripAmps();
        case CimPackage.OPERATING_MECHANISM_INFO__TRIP_VOLTAGE:
            return getTripVoltage();
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
        case CimPackage.OPERATING_MECHANISM_INFO__CLOSE_AMPS:
            setCloseAmps( ( Float ) newValue );
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__CLOSE_VOLTAGE:
            setCloseVoltage( ( Float ) newValue );
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__MECHANISM_KIND:
            setMechanismKind( ( OperatingMechanismKind ) newValue );
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_RUN_CURRENT:
            setMotorRunCurrent( ( Float ) newValue );
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_START_CURRENT:
            setMotorStartCurrent( ( Float ) newValue );
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_VOLTAGE:
            setMotorVoltage( ( Float ) newValue );
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__TRIP_AMPS:
            setTripAmps( ( Float ) newValue );
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__TRIP_VOLTAGE:
            setTripVoltage( ( Float ) newValue );
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
        case CimPackage.OPERATING_MECHANISM_INFO__CLOSE_AMPS:
            unsetCloseAmps();
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__CLOSE_VOLTAGE:
            unsetCloseVoltage();
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__MECHANISM_KIND:
            unsetMechanismKind();
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_RUN_CURRENT:
            unsetMotorRunCurrent();
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_START_CURRENT:
            unsetMotorStartCurrent();
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_VOLTAGE:
            unsetMotorVoltage();
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__TRIP_AMPS:
            unsetTripAmps();
            return;
        case CimPackage.OPERATING_MECHANISM_INFO__TRIP_VOLTAGE:
            unsetTripVoltage();
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
        case CimPackage.OPERATING_MECHANISM_INFO__CLOSE_AMPS:
            return isSetCloseAmps();
        case CimPackage.OPERATING_MECHANISM_INFO__CLOSE_VOLTAGE:
            return isSetCloseVoltage();
        case CimPackage.OPERATING_MECHANISM_INFO__MECHANISM_KIND:
            return isSetMechanismKind();
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_RUN_CURRENT:
            return isSetMotorRunCurrent();
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_START_CURRENT:
            return isSetMotorStartCurrent();
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_VOLTAGE:
            return isSetMotorVoltage();
        case CimPackage.OPERATING_MECHANISM_INFO__TRIP_AMPS:
            return isSetTripAmps();
        case CimPackage.OPERATING_MECHANISM_INFO__TRIP_VOLTAGE:
            return isSetTripVoltage();
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
        result.append( " (closeAmps: " );
        if( closeAmpsESet )
            result.append( closeAmps );
        else
            result.append( "<unset>" );
        result.append( ", closeVoltage: " );
        if( closeVoltageESet )
            result.append( closeVoltage );
        else
            result.append( "<unset>" );
        result.append( ", mechanismKind: " );
        if( mechanismKindESet )
            result.append( mechanismKind );
        else
            result.append( "<unset>" );
        result.append( ", motorRunCurrent: " );
        if( motorRunCurrentESet )
            result.append( motorRunCurrent );
        else
            result.append( "<unset>" );
        result.append( ", motorStartCurrent: " );
        if( motorStartCurrentESet )
            result.append( motorStartCurrent );
        else
            result.append( "<unset>" );
        result.append( ", motorVoltage: " );
        if( motorVoltageESet )
            result.append( motorVoltage );
        else
            result.append( "<unset>" );
        result.append( ", tripAmps: " );
        if( tripAmpsESet )
            result.append( tripAmps );
        else
            result.append( "<unset>" );
        result.append( ", tripVoltage: " );
        if( tripVoltageESet )
            result.append( tripVoltage );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OperatingMechanismInfoImpl
