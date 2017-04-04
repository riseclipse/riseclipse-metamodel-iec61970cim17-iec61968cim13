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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerConfiguration;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarConfiguration;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Substation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BayImpl#getBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BayImpl#getBayPowerMeasFlag <em>Bay Power Meas Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BayImpl#getBreakerConfiguration <em>Breaker Configuration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BayImpl#getBusBarConfiguration <em>Bus Bar Configuration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BayImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BayImpl#getSubstation <em>Substation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BayImpl extends EquipmentContainerImpl implements Bay {
    /**
     * The default value of the '{@link #getBayEnergyMeasFlag() <em>Bay Energy Meas Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBayEnergyMeasFlag()
     * @generated
     * @ordered
     */
    protected static final Boolean BAY_ENERGY_MEAS_FLAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBayEnergyMeasFlag() <em>Bay Energy Meas Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBayEnergyMeasFlag()
     * @generated
     * @ordered
     */
    protected Boolean bayEnergyMeasFlag = BAY_ENERGY_MEAS_FLAG_EDEFAULT;

    /**
     * This is true if the Bay Energy Meas Flag attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bayEnergyMeasFlagESet;

    /**
     * The default value of the '{@link #getBayPowerMeasFlag() <em>Bay Power Meas Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBayPowerMeasFlag()
     * @generated
     * @ordered
     */
    protected static final Boolean BAY_POWER_MEAS_FLAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBayPowerMeasFlag() <em>Bay Power Meas Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBayPowerMeasFlag()
     * @generated
     * @ordered
     */
    protected Boolean bayPowerMeasFlag = BAY_POWER_MEAS_FLAG_EDEFAULT;

    /**
     * This is true if the Bay Power Meas Flag attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bayPowerMeasFlagESet;

    /**
     * The default value of the '{@link #getBreakerConfiguration() <em>Breaker Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerConfiguration()
     * @generated
     * @ordered
     */
    protected static final BreakerConfiguration BREAKER_CONFIGURATION_EDEFAULT = BreakerConfiguration.SINGLE_BREAKER;

    /**
     * The cached value of the '{@link #getBreakerConfiguration() <em>Breaker Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerConfiguration()
     * @generated
     * @ordered
     */
    protected BreakerConfiguration breakerConfiguration = BREAKER_CONFIGURATION_EDEFAULT;

    /**
     * This is true if the Breaker Configuration attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean breakerConfigurationESet;

    /**
     * The default value of the '{@link #getBusBarConfiguration() <em>Bus Bar Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusBarConfiguration()
     * @generated
     * @ordered
     */
    protected static final BusbarConfiguration BUS_BAR_CONFIGURATION_EDEFAULT = BusbarConfiguration.SINGLE_BUS;

    /**
     * The cached value of the '{@link #getBusBarConfiguration() <em>Bus Bar Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusBarConfiguration()
     * @generated
     * @ordered
     */
    protected BusbarConfiguration busBarConfiguration = BUS_BAR_CONFIGURATION_EDEFAULT;

    /**
     * This is true if the Bus Bar Configuration attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean busBarConfigurationESet;

    /**
     * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageLevel()
     * @generated
     * @ordered
     */
    protected VoltageLevel voltageLevel;

    /**
     * This is true if the Voltage Level reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageLevelESet;

    /**
     * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubstation()
     * @generated
     * @ordered
     */
    protected Substation substation;

    /**
     * This is true if the Substation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean substationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBay();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getBayEnergyMeasFlag() {
        return bayEnergyMeasFlag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBayEnergyMeasFlag( Boolean newBayEnergyMeasFlag ) {
        Boolean oldBayEnergyMeasFlag = bayEnergyMeasFlag;
        bayEnergyMeasFlag = newBayEnergyMeasFlag;
        boolean oldBayEnergyMeasFlagESet = bayEnergyMeasFlagESet;
        bayEnergyMeasFlagESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BAY__BAY_ENERGY_MEAS_FLAG,
                    oldBayEnergyMeasFlag, bayEnergyMeasFlag, !oldBayEnergyMeasFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBayEnergyMeasFlag() {
        Boolean oldBayEnergyMeasFlag = bayEnergyMeasFlag;
        boolean oldBayEnergyMeasFlagESet = bayEnergyMeasFlagESet;
        bayEnergyMeasFlag = BAY_ENERGY_MEAS_FLAG_EDEFAULT;
        bayEnergyMeasFlagESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BAY__BAY_ENERGY_MEAS_FLAG,
                    oldBayEnergyMeasFlag, BAY_ENERGY_MEAS_FLAG_EDEFAULT, oldBayEnergyMeasFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBayEnergyMeasFlag() {
        return bayEnergyMeasFlagESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getBayPowerMeasFlag() {
        return bayPowerMeasFlag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBayPowerMeasFlag( Boolean newBayPowerMeasFlag ) {
        Boolean oldBayPowerMeasFlag = bayPowerMeasFlag;
        bayPowerMeasFlag = newBayPowerMeasFlag;
        boolean oldBayPowerMeasFlagESet = bayPowerMeasFlagESet;
        bayPowerMeasFlagESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BAY__BAY_POWER_MEAS_FLAG,
                    oldBayPowerMeasFlag, bayPowerMeasFlag, !oldBayPowerMeasFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBayPowerMeasFlag() {
        Boolean oldBayPowerMeasFlag = bayPowerMeasFlag;
        boolean oldBayPowerMeasFlagESet = bayPowerMeasFlagESet;
        bayPowerMeasFlag = BAY_POWER_MEAS_FLAG_EDEFAULT;
        bayPowerMeasFlagESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BAY__BAY_POWER_MEAS_FLAG,
                    oldBayPowerMeasFlag, BAY_POWER_MEAS_FLAG_EDEFAULT, oldBayPowerMeasFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBayPowerMeasFlag() {
        return bayPowerMeasFlagESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BreakerConfiguration getBreakerConfiguration() {
        return breakerConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBreakerConfiguration( BreakerConfiguration newBreakerConfiguration ) {
        BreakerConfiguration oldBreakerConfiguration = breakerConfiguration;
        breakerConfiguration = newBreakerConfiguration == null ? BREAKER_CONFIGURATION_EDEFAULT
                : newBreakerConfiguration;
        boolean oldBreakerConfigurationESet = breakerConfigurationESet;
        breakerConfigurationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BAY__BREAKER_CONFIGURATION,
                    oldBreakerConfiguration, breakerConfiguration, !oldBreakerConfigurationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBreakerConfiguration() {
        BreakerConfiguration oldBreakerConfiguration = breakerConfiguration;
        boolean oldBreakerConfigurationESet = breakerConfigurationESet;
        breakerConfiguration = BREAKER_CONFIGURATION_EDEFAULT;
        breakerConfigurationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BAY__BREAKER_CONFIGURATION,
                    oldBreakerConfiguration, BREAKER_CONFIGURATION_EDEFAULT, oldBreakerConfigurationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreakerConfiguration() {
        return breakerConfigurationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BusbarConfiguration getBusBarConfiguration() {
        return busBarConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBusBarConfiguration( BusbarConfiguration newBusBarConfiguration ) {
        BusbarConfiguration oldBusBarConfiguration = busBarConfiguration;
        busBarConfiguration = newBusBarConfiguration == null ? BUS_BAR_CONFIGURATION_EDEFAULT : newBusBarConfiguration;
        boolean oldBusBarConfigurationESet = busBarConfigurationESet;
        busBarConfigurationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BAY__BUS_BAR_CONFIGURATION,
                    oldBusBarConfiguration, busBarConfiguration, !oldBusBarConfigurationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBusBarConfiguration() {
        BusbarConfiguration oldBusBarConfiguration = busBarConfiguration;
        boolean oldBusBarConfigurationESet = busBarConfigurationESet;
        busBarConfiguration = BUS_BAR_CONFIGURATION_EDEFAULT;
        busBarConfigurationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BAY__BUS_BAR_CONFIGURATION,
                    oldBusBarConfiguration, BUS_BAR_CONFIGURATION_EDEFAULT, oldBusBarConfigurationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBusBarConfiguration() {
        return busBarConfigurationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageLevel getVoltageLevel() {
        return voltageLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVoltageLevel( VoltageLevel newVoltageLevel, NotificationChain msgs ) {
        VoltageLevel oldVoltageLevel = voltageLevel;
        voltageLevel = newVoltageLevel;
        boolean oldVoltageLevelESet = voltageLevelESet;
        voltageLevelESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.BAY__VOLTAGE_LEVEL, oldVoltageLevel, newVoltageLevel, !oldVoltageLevelESet );
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
    public void setVoltageLevel( VoltageLevel newVoltageLevel ) {
        if( newVoltageLevel != voltageLevel ) {
            NotificationChain msgs = null;
            if( voltageLevel != null ) msgs = ( ( InternalEObject ) voltageLevel ).eInverseRemove( this,
                    CimPackage.VOLTAGE_LEVEL__BAYS, VoltageLevel.class, msgs );
            if( newVoltageLevel != null ) msgs = ( ( InternalEObject ) newVoltageLevel ).eInverseAdd( this,
                    CimPackage.VOLTAGE_LEVEL__BAYS, VoltageLevel.class, msgs );
            msgs = basicSetVoltageLevel( newVoltageLevel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageLevelESet = voltageLevelESet;
            voltageLevelESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.BAY__VOLTAGE_LEVEL, newVoltageLevel, newVoltageLevel, !oldVoltageLevelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVoltageLevel( NotificationChain msgs ) {
        VoltageLevel oldVoltageLevel = voltageLevel;
        voltageLevel = null;
        boolean oldVoltageLevelESet = voltageLevelESet;
        voltageLevelESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BAY__VOLTAGE_LEVEL, oldVoltageLevel, null, oldVoltageLevelESet );
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
    public void unsetVoltageLevel() {
        if( voltageLevel != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) voltageLevel ).eInverseRemove( this, CimPackage.VOLTAGE_LEVEL__BAYS,
                    VoltageLevel.class, msgs );
            msgs = basicUnsetVoltageLevel( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageLevelESet = voltageLevelESet;
            voltageLevelESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BAY__VOLTAGE_LEVEL, null, null, oldVoltageLevelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageLevel() {
        return voltageLevelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Substation getSubstation() {
        return substation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubstation( Substation newSubstation, NotificationChain msgs ) {
        Substation oldSubstation = substation;
        substation = newSubstation;
        boolean oldSubstationESet = substationESet;
        substationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.BAY__SUBSTATION,
                    oldSubstation, newSubstation, !oldSubstationESet );
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
    public void setSubstation( Substation newSubstation ) {
        if( newSubstation != substation ) {
            NotificationChain msgs = null;
            if( substation != null ) msgs = ( ( InternalEObject ) substation ).eInverseRemove( this,
                    CimPackage.SUBSTATION__BAYS, Substation.class, msgs );
            if( newSubstation != null ) msgs = ( ( InternalEObject ) newSubstation ).eInverseAdd( this,
                    CimPackage.SUBSTATION__BAYS, Substation.class, msgs );
            msgs = basicSetSubstation( newSubstation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubstationESet = substationESet;
            substationESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.BAY__SUBSTATION, newSubstation, newSubstation, !oldSubstationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSubstation( NotificationChain msgs ) {
        Substation oldSubstation = substation;
        substation = null;
        boolean oldSubstationESet = substationESet;
        substationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BAY__SUBSTATION, oldSubstation, null, oldSubstationESet );
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
    public void unsetSubstation() {
        if( substation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) substation ).eInverseRemove( this, CimPackage.SUBSTATION__BAYS,
                    Substation.class, msgs );
            msgs = basicUnsetSubstation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubstationESet = substationESet;
            substationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BAY__SUBSTATION, null, null, oldSubstationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubstation() {
        return substationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.BAY__VOLTAGE_LEVEL:
            if( voltageLevel != null ) msgs = ( ( InternalEObject ) voltageLevel ).eInverseRemove( this,
                    CimPackage.VOLTAGE_LEVEL__BAYS, VoltageLevel.class, msgs );
            return basicSetVoltageLevel( ( VoltageLevel ) otherEnd, msgs );
        case CimPackage.BAY__SUBSTATION:
            if( substation != null ) msgs = ( ( InternalEObject ) substation ).eInverseRemove( this,
                    CimPackage.SUBSTATION__BAYS, Substation.class, msgs );
            return basicSetSubstation( ( Substation ) otherEnd, msgs );
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
        case CimPackage.BAY__VOLTAGE_LEVEL:
            return basicUnsetVoltageLevel( msgs );
        case CimPackage.BAY__SUBSTATION:
            return basicUnsetSubstation( msgs );
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
        case CimPackage.BAY__BAY_ENERGY_MEAS_FLAG:
            return getBayEnergyMeasFlag();
        case CimPackage.BAY__BAY_POWER_MEAS_FLAG:
            return getBayPowerMeasFlag();
        case CimPackage.BAY__BREAKER_CONFIGURATION:
            return getBreakerConfiguration();
        case CimPackage.BAY__BUS_BAR_CONFIGURATION:
            return getBusBarConfiguration();
        case CimPackage.BAY__VOLTAGE_LEVEL:
            return getVoltageLevel();
        case CimPackage.BAY__SUBSTATION:
            return getSubstation();
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
        case CimPackage.BAY__BAY_ENERGY_MEAS_FLAG:
            setBayEnergyMeasFlag( ( Boolean ) newValue );
            return;
        case CimPackage.BAY__BAY_POWER_MEAS_FLAG:
            setBayPowerMeasFlag( ( Boolean ) newValue );
            return;
        case CimPackage.BAY__BREAKER_CONFIGURATION:
            setBreakerConfiguration( ( BreakerConfiguration ) newValue );
            return;
        case CimPackage.BAY__BUS_BAR_CONFIGURATION:
            setBusBarConfiguration( ( BusbarConfiguration ) newValue );
            return;
        case CimPackage.BAY__VOLTAGE_LEVEL:
            setVoltageLevel( ( VoltageLevel ) newValue );
            return;
        case CimPackage.BAY__SUBSTATION:
            setSubstation( ( Substation ) newValue );
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
        case CimPackage.BAY__BAY_ENERGY_MEAS_FLAG:
            unsetBayEnergyMeasFlag();
            return;
        case CimPackage.BAY__BAY_POWER_MEAS_FLAG:
            unsetBayPowerMeasFlag();
            return;
        case CimPackage.BAY__BREAKER_CONFIGURATION:
            unsetBreakerConfiguration();
            return;
        case CimPackage.BAY__BUS_BAR_CONFIGURATION:
            unsetBusBarConfiguration();
            return;
        case CimPackage.BAY__VOLTAGE_LEVEL:
            unsetVoltageLevel();
            return;
        case CimPackage.BAY__SUBSTATION:
            unsetSubstation();
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
        case CimPackage.BAY__BAY_ENERGY_MEAS_FLAG:
            return isSetBayEnergyMeasFlag();
        case CimPackage.BAY__BAY_POWER_MEAS_FLAG:
            return isSetBayPowerMeasFlag();
        case CimPackage.BAY__BREAKER_CONFIGURATION:
            return isSetBreakerConfiguration();
        case CimPackage.BAY__BUS_BAR_CONFIGURATION:
            return isSetBusBarConfiguration();
        case CimPackage.BAY__VOLTAGE_LEVEL:
            return isSetVoltageLevel();
        case CimPackage.BAY__SUBSTATION:
            return isSetSubstation();
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
        result.append( " (bayEnergyMeasFlag: " );
        if( bayEnergyMeasFlagESet )
            result.append( bayEnergyMeasFlag );
        else
            result.append( "<unset>" );
        result.append( ", bayPowerMeasFlag: " );
        if( bayPowerMeasFlagESet )
            result.append( bayPowerMeasFlag );
        else
            result.append( "<unset>" );
        result.append( ", breakerConfiguration: " );
        if( breakerConfigurationESet )
            result.append( breakerConfiguration );
        else
            result.append( "<unset>" );
        result.append( ", busBarConfiguration: " );
        if( busBarConfigurationESet )
            result.append( busBarConfiguration );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BayImpl
