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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protection Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectionEquipmentImpl#getHighLimit <em>High Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectionEquipmentImpl#getLowLimit <em>Low Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectionEquipmentImpl#getPowerDirectionFlag <em>Power Direction Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectionEquipmentImpl#getRelayDelayTime <em>Relay Delay Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectionEquipmentImpl#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectionEquipmentImpl#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectionEquipmentImpl#getProtectedSwitches <em>Protected Switches</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectionEquipmentImpl#getConductingEquipments <em>Conducting Equipments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectionEquipmentImpl extends EquipmentImpl implements ProtectionEquipment {
    /**
     * The default value of the '{@link #getHighLimit() <em>High Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighLimit()
     * @generated
     * @ordered
     */
    protected static final Float HIGH_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHighLimit() <em>High Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighLimit()
     * @generated
     * @ordered
     */
    protected Float highLimit = HIGH_LIMIT_EDEFAULT;

    /**
     * This is true if the High Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highLimitESet;

    /**
     * The default value of the '{@link #getLowLimit() <em>Low Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowLimit()
     * @generated
     * @ordered
     */
    protected static final Float LOW_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowLimit() <em>Low Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowLimit()
     * @generated
     * @ordered
     */
    protected Float lowLimit = LOW_LIMIT_EDEFAULT;

    /**
     * This is true if the Low Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowLimitESet;

    /**
     * The default value of the '{@link #getPowerDirectionFlag() <em>Power Direction Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerDirectionFlag()
     * @generated
     * @ordered
     */
    protected static final Boolean POWER_DIRECTION_FLAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPowerDirectionFlag() <em>Power Direction Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerDirectionFlag()
     * @generated
     * @ordered
     */
    protected Boolean powerDirectionFlag = POWER_DIRECTION_FLAG_EDEFAULT;

    /**
     * This is true if the Power Direction Flag attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerDirectionFlagESet;

    /**
     * The default value of the '{@link #getRelayDelayTime() <em>Relay Delay Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelayDelayTime()
     * @generated
     * @ordered
     */
    protected static final Float RELAY_DELAY_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRelayDelayTime() <em>Relay Delay Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelayDelayTime()
     * @generated
     * @ordered
     */
    protected Float relayDelayTime = RELAY_DELAY_TIME_EDEFAULT;

    /**
     * This is true if the Relay Delay Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean relayDelayTimeESet;

    /**
     * The default value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitMultiplier()
     * @generated
     * @ordered
     */
    protected static final UnitMultiplier UNIT_MULTIPLIER_EDEFAULT = UnitMultiplier.YOCTO;

    /**
     * The cached value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitMultiplier()
     * @generated
     * @ordered
     */
    protected UnitMultiplier unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;

    /**
     * This is true if the Unit Multiplier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitMultiplierESet;

    /**
     * The default value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitSymbol()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol UNIT_SYMBOL_EDEFAULT = UnitSymbol.NONE;

    /**
     * The cached value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitSymbol()
     * @generated
     * @ordered
     */
    protected UnitSymbol unitSymbol = UNIT_SYMBOL_EDEFAULT;

    /**
     * This is true if the Unit Symbol attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitSymbolESet;

    /**
     * The cached value of the '{@link #getProtectedSwitches() <em>Protected Switches</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtectedSwitches()
     * @generated
     * @ordered
     */
    protected EList< ProtectedSwitch > protectedSwitches;

    /**
     * The cached value of the '{@link #getConductingEquipments() <em>Conducting Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConductingEquipments()
     * @generated
     * @ordered
     */
    protected EList< ConductingEquipment > conductingEquipments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProtectionEquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getProtectionEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHighLimit() {
        return highLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHighLimit( Float newHighLimit ) {
        Float oldHighLimit = highLimit;
        highLimit = newHighLimit;
        boolean oldHighLimitESet = highLimitESet;
        highLimitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT, oldHighLimit, highLimit, !oldHighLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHighLimit() {
        Float oldHighLimit = highLimit;
        boolean oldHighLimitESet = highLimitESet;
        highLimit = HIGH_LIMIT_EDEFAULT;
        highLimitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT, oldHighLimit, HIGH_LIMIT_EDEFAULT, oldHighLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighLimit() {
        return highLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLowLimit() {
        return lowLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowLimit( Float newLowLimit ) {
        Float oldLowLimit = lowLimit;
        lowLimit = newLowLimit;
        boolean oldLowLimitESet = lowLimitESet;
        lowLimitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PROTECTION_EQUIPMENT__LOW_LIMIT, oldLowLimit, lowLimit, !oldLowLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowLimit() {
        Float oldLowLimit = lowLimit;
        boolean oldLowLimitESet = lowLimitESet;
        lowLimit = LOW_LIMIT_EDEFAULT;
        lowLimitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PROTECTION_EQUIPMENT__LOW_LIMIT, oldLowLimit, LOW_LIMIT_EDEFAULT, oldLowLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowLimit() {
        return lowLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPowerDirectionFlag() {
        return powerDirectionFlag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPowerDirectionFlag( Boolean newPowerDirectionFlag ) {
        Boolean oldPowerDirectionFlag = powerDirectionFlag;
        powerDirectionFlag = newPowerDirectionFlag;
        boolean oldPowerDirectionFlagESet = powerDirectionFlagESet;
        powerDirectionFlagESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG,
                        oldPowerDirectionFlag, powerDirectionFlag, !oldPowerDirectionFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerDirectionFlag() {
        Boolean oldPowerDirectionFlag = powerDirectionFlag;
        boolean oldPowerDirectionFlagESet = powerDirectionFlagESet;
        powerDirectionFlag = POWER_DIRECTION_FLAG_EDEFAULT;
        powerDirectionFlagESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG,
                        oldPowerDirectionFlag, POWER_DIRECTION_FLAG_EDEFAULT, oldPowerDirectionFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerDirectionFlag() {
        return powerDirectionFlagESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRelayDelayTime() {
        return relayDelayTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelayDelayTime( Float newRelayDelayTime ) {
        Float oldRelayDelayTime = relayDelayTime;
        relayDelayTime = newRelayDelayTime;
        boolean oldRelayDelayTimeESet = relayDelayTimeESet;
        relayDelayTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME,
                    oldRelayDelayTime, relayDelayTime, !oldRelayDelayTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelayDelayTime() {
        Float oldRelayDelayTime = relayDelayTime;
        boolean oldRelayDelayTimeESet = relayDelayTimeESet;
        relayDelayTime = RELAY_DELAY_TIME_EDEFAULT;
        relayDelayTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME,
                    oldRelayDelayTime, RELAY_DELAY_TIME_EDEFAULT, oldRelayDelayTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRelayDelayTime() {
        return relayDelayTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitMultiplier getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnitMultiplier( UnitMultiplier newUnitMultiplier ) {
        UnitMultiplier oldUnitMultiplier = unitMultiplier;
        unitMultiplier = newUnitMultiplier == null ? UNIT_MULTIPLIER_EDEFAULT : newUnitMultiplier;
        boolean oldUnitMultiplierESet = unitMultiplierESet;
        unitMultiplierESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER,
                    oldUnitMultiplier, unitMultiplier, !oldUnitMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnitMultiplier() {
        UnitMultiplier oldUnitMultiplier = unitMultiplier;
        boolean oldUnitMultiplierESet = unitMultiplierESet;
        unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;
        unitMultiplierESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER,
                    oldUnitMultiplier, UNIT_MULTIPLIER_EDEFAULT, oldUnitMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnitMultiplier() {
        return unitMultiplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitSymbol getUnitSymbol() {
        return unitSymbol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnitSymbol( UnitSymbol newUnitSymbol ) {
        UnitSymbol oldUnitSymbol = unitSymbol;
        unitSymbol = newUnitSymbol == null ? UNIT_SYMBOL_EDEFAULT : newUnitSymbol;
        boolean oldUnitSymbolESet = unitSymbolESet;
        unitSymbolESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL, oldUnitSymbol, unitSymbol, !oldUnitSymbolESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnitSymbol() {
        UnitSymbol oldUnitSymbol = unitSymbol;
        boolean oldUnitSymbolESet = unitSymbolESet;
        unitSymbol = UNIT_SYMBOL_EDEFAULT;
        unitSymbolESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL,
                    oldUnitSymbol, UNIT_SYMBOL_EDEFAULT, oldUnitSymbolESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnitSymbol() {
        return unitSymbolESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProtectedSwitch > getProtectedSwitches() {
        if( protectedSwitches == null ) {
            protectedSwitches = new EObjectWithInverseEList.Unsettable.ManyInverse< ProtectedSwitch >(
                    ProtectedSwitch.class, this, CimPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES,
                    CimPackage.PROTECTED_SWITCH__OPERATED_BY_PROTECTION_EQUIPMENT );
        }
        return protectedSwitches;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProtectedSwitches() {
        if( protectedSwitches != null ) ( ( InternalEList.Unsettable< ? > ) protectedSwitches ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProtectedSwitches() {
        return protectedSwitches != null && ( ( InternalEList.Unsettable< ? > ) protectedSwitches ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConductingEquipment > getConductingEquipments() {
        if( conductingEquipments == null ) {
            conductingEquipments = new EObjectWithInverseEList.Unsettable.ManyInverse< ConductingEquipment >(
                    ConductingEquipment.class, this, CimPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS,
                    CimPackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS );
        }
        return conductingEquipments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConductingEquipments() {
        if( conductingEquipments != null ) ( ( InternalEList.Unsettable< ? > ) conductingEquipments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConductingEquipments() {
        return conductingEquipments != null && ( ( InternalEList.Unsettable< ? > ) conductingEquipments ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProtectedSwitches() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConductingEquipments() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
            return ( ( InternalEList< ? > ) getProtectedSwitches() ).basicRemove( otherEnd, msgs );
        case CimPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
            return ( ( InternalEList< ? > ) getConductingEquipments() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
            return getHighLimit();
        case CimPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
            return getLowLimit();
        case CimPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
            return getPowerDirectionFlag();
        case CimPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
            return getRelayDelayTime();
        case CimPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER:
            return getUnitMultiplier();
        case CimPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL:
            return getUnitSymbol();
        case CimPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
            return getProtectedSwitches();
        case CimPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
            return getConductingEquipments();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
            setHighLimit( ( Float ) newValue );
            return;
        case CimPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
            setLowLimit( ( Float ) newValue );
            return;
        case CimPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
            setPowerDirectionFlag( ( Boolean ) newValue );
            return;
        case CimPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
            setRelayDelayTime( ( Float ) newValue );
            return;
        case CimPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER:
            setUnitMultiplier( ( UnitMultiplier ) newValue );
            return;
        case CimPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL:
            setUnitSymbol( ( UnitSymbol ) newValue );
            return;
        case CimPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
            getProtectedSwitches().clear();
            getProtectedSwitches().addAll( ( Collection< ? extends ProtectedSwitch > ) newValue );
            return;
        case CimPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
            getConductingEquipments().clear();
            getConductingEquipments().addAll( ( Collection< ? extends ConductingEquipment > ) newValue );
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
        case CimPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
            unsetHighLimit();
            return;
        case CimPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
            unsetLowLimit();
            return;
        case CimPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
            unsetPowerDirectionFlag();
            return;
        case CimPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
            unsetRelayDelayTime();
            return;
        case CimPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER:
            unsetUnitMultiplier();
            return;
        case CimPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL:
            unsetUnitSymbol();
            return;
        case CimPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
            unsetProtectedSwitches();
            return;
        case CimPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
            unsetConductingEquipments();
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
        case CimPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
            return isSetHighLimit();
        case CimPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
            return isSetLowLimit();
        case CimPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
            return isSetPowerDirectionFlag();
        case CimPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
            return isSetRelayDelayTime();
        case CimPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER:
            return isSetUnitMultiplier();
        case CimPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL:
            return isSetUnitSymbol();
        case CimPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
            return isSetProtectedSwitches();
        case CimPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
            return isSetConductingEquipments();
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
        result.append( " (highLimit: " );
        if( highLimitESet )
            result.append( highLimit );
        else
            result.append( "<unset>" );
        result.append( ", lowLimit: " );
        if( lowLimitESet )
            result.append( lowLimit );
        else
            result.append( "<unset>" );
        result.append( ", powerDirectionFlag: " );
        if( powerDirectionFlagESet )
            result.append( powerDirectionFlag );
        else
            result.append( "<unset>" );
        result.append( ", relayDelayTime: " );
        if( relayDelayTimeESet )
            result.append( relayDelayTime );
        else
            result.append( "<unset>" );
        result.append( ", unitMultiplier: " );
        if( unitMultiplierESet )
            result.append( unitMultiplier );
        else
            result.append( "<unset>" );
        result.append( ", unitSymbol: " );
        if( unitSymbolESet )
            result.append( unitSymbol );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ProtectionEquipmentImpl
