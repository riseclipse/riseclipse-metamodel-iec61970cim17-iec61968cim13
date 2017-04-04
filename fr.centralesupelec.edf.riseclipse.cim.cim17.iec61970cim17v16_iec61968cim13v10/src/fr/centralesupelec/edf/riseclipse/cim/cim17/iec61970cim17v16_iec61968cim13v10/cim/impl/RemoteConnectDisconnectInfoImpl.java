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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Connect Disconnect Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getArmedTimeout <em>Armed Timeout</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getEnergyLimit <em>Energy Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getEnergyUsageWarning <em>Energy Usage Warning</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getIsArmConnect <em>Is Arm Connect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getIsArmDisconnect <em>Is Arm Disconnect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getIsEnergyLimiting <em>Is Energy Limiting</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getPowerLimit <em>Power Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteConnectDisconnectInfoImpl#getUsePushbutton <em>Use Pushbutton</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteConnectDisconnectInfoImpl extends MinimalEObjectImpl.Container
        implements RemoteConnectDisconnectInfo {
    /**
     * The default value of the '{@link #getArmedTimeout() <em>Armed Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArmedTimeout()
     * @generated
     * @ordered
     */
    protected static final Float ARMED_TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getArmedTimeout() <em>Armed Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArmedTimeout()
     * @generated
     * @ordered
     */
    protected Float armedTimeout = ARMED_TIMEOUT_EDEFAULT;

    /**
     * This is true if the Armed Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean armedTimeoutESet;

    /**
     * The default value of the '{@link #getCustomerVoltageLimit() <em>Customer Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerVoltageLimit()
     * @generated
     * @ordered
     */
    protected static final Float CUSTOMER_VOLTAGE_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomerVoltageLimit() <em>Customer Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerVoltageLimit()
     * @generated
     * @ordered
     */
    protected Float customerVoltageLimit = CUSTOMER_VOLTAGE_LIMIT_EDEFAULT;

    /**
     * This is true if the Customer Voltage Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerVoltageLimitESet;

    /**
     * The default value of the '{@link #getEnergyLimit() <em>Energy Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyLimit()
     * @generated
     * @ordered
     */
    protected static final Float ENERGY_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergyLimit() <em>Energy Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyLimit()
     * @generated
     * @ordered
     */
    protected Float energyLimit = ENERGY_LIMIT_EDEFAULT;

    /**
     * This is true if the Energy Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyLimitESet;

    /**
     * The default value of the '{@link #getEnergyUsageStartDateTime() <em>Energy Usage Start Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyUsageStartDateTime()
     * @generated
     * @ordered
     */
    protected static final Date ENERGY_USAGE_START_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergyUsageStartDateTime() <em>Energy Usage Start Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyUsageStartDateTime()
     * @generated
     * @ordered
     */
    protected Date energyUsageStartDateTime = ENERGY_USAGE_START_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Energy Usage Start Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyUsageStartDateTimeESet;

    /**
     * The default value of the '{@link #getEnergyUsageWarning() <em>Energy Usage Warning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyUsageWarning()
     * @generated
     * @ordered
     */
    protected static final Float ENERGY_USAGE_WARNING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergyUsageWarning() <em>Energy Usage Warning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyUsageWarning()
     * @generated
     * @ordered
     */
    protected Float energyUsageWarning = ENERGY_USAGE_WARNING_EDEFAULT;

    /**
     * This is true if the Energy Usage Warning attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyUsageWarningESet;

    /**
     * The default value of the '{@link #getIsArmConnect() <em>Is Arm Connect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsArmConnect()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_ARM_CONNECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsArmConnect() <em>Is Arm Connect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsArmConnect()
     * @generated
     * @ordered
     */
    protected Boolean isArmConnect = IS_ARM_CONNECT_EDEFAULT;

    /**
     * This is true if the Is Arm Connect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isArmConnectESet;

    /**
     * The default value of the '{@link #getIsArmDisconnect() <em>Is Arm Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsArmDisconnect()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_ARM_DISCONNECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsArmDisconnect() <em>Is Arm Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsArmDisconnect()
     * @generated
     * @ordered
     */
    protected Boolean isArmDisconnect = IS_ARM_DISCONNECT_EDEFAULT;

    /**
     * This is true if the Is Arm Disconnect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isArmDisconnectESet;

    /**
     * The default value of the '{@link #getIsEnergyLimiting() <em>Is Energy Limiting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsEnergyLimiting()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_ENERGY_LIMITING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsEnergyLimiting() <em>Is Energy Limiting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsEnergyLimiting()
     * @generated
     * @ordered
     */
    protected Boolean isEnergyLimiting = IS_ENERGY_LIMITING_EDEFAULT;

    /**
     * This is true if the Is Energy Limiting attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isEnergyLimitingESet;

    /**
     * The default value of the '{@link #getNeedsPowerLimitCheck() <em>Needs Power Limit Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeedsPowerLimitCheck()
     * @generated
     * @ordered
     */
    protected static final Boolean NEEDS_POWER_LIMIT_CHECK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeedsPowerLimitCheck() <em>Needs Power Limit Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeedsPowerLimitCheck()
     * @generated
     * @ordered
     */
    protected Boolean needsPowerLimitCheck = NEEDS_POWER_LIMIT_CHECK_EDEFAULT;

    /**
     * This is true if the Needs Power Limit Check attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean needsPowerLimitCheckESet;

    /**
     * The default value of the '{@link #getNeedsVoltageLimitCheck() <em>Needs Voltage Limit Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeedsVoltageLimitCheck()
     * @generated
     * @ordered
     */
    protected static final Boolean NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeedsVoltageLimitCheck() <em>Needs Voltage Limit Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeedsVoltageLimitCheck()
     * @generated
     * @ordered
     */
    protected Boolean needsVoltageLimitCheck = NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT;

    /**
     * This is true if the Needs Voltage Limit Check attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean needsVoltageLimitCheckESet;

    /**
     * The default value of the '{@link #getPowerLimit() <em>Power Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerLimit()
     * @generated
     * @ordered
     */
    protected static final Float POWER_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPowerLimit() <em>Power Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerLimit()
     * @generated
     * @ordered
     */
    protected Float powerLimit = POWER_LIMIT_EDEFAULT;

    /**
     * This is true if the Power Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerLimitESet;

    /**
     * The default value of the '{@link #getUsePushbutton() <em>Use Pushbutton</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsePushbutton()
     * @generated
     * @ordered
     */
    protected static final Boolean USE_PUSHBUTTON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUsePushbutton() <em>Use Pushbutton</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsePushbutton()
     * @generated
     * @ordered
     */
    protected Boolean usePushbutton = USE_PUSHBUTTON_EDEFAULT;

    /**
     * This is true if the Use Pushbutton attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usePushbuttonESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoteConnectDisconnectInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getArmedTimeout() {
        return armedTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setArmedTimeout( Float newArmedTimeout ) {
        Float oldArmedTimeout = armedTimeout;
        armedTimeout = newArmedTimeout;
        boolean oldArmedTimeoutESet = armedTimeoutESet;
        armedTimeoutESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT,
                        oldArmedTimeout, armedTimeout, !oldArmedTimeoutESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetArmedTimeout() {
        Float oldArmedTimeout = armedTimeout;
        boolean oldArmedTimeoutESet = armedTimeoutESet;
        armedTimeout = ARMED_TIMEOUT_EDEFAULT;
        armedTimeoutESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT, oldArmedTimeout, ARMED_TIMEOUT_EDEFAULT,
                oldArmedTimeoutESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetArmedTimeout() {
        return armedTimeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCustomerVoltageLimit() {
        return customerVoltageLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCustomerVoltageLimit( Float newCustomerVoltageLimit ) {
        Float oldCustomerVoltageLimit = customerVoltageLimit;
        customerVoltageLimit = newCustomerVoltageLimit;
        boolean oldCustomerVoltageLimitESet = customerVoltageLimitESet;
        customerVoltageLimitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT, oldCustomerVoltageLimit,
                customerVoltageLimit, !oldCustomerVoltageLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerVoltageLimit() {
        Float oldCustomerVoltageLimit = customerVoltageLimit;
        boolean oldCustomerVoltageLimitESet = customerVoltageLimitESet;
        customerVoltageLimit = CUSTOMER_VOLTAGE_LIMIT_EDEFAULT;
        customerVoltageLimitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT, oldCustomerVoltageLimit,
                CUSTOMER_VOLTAGE_LIMIT_EDEFAULT, oldCustomerVoltageLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerVoltageLimit() {
        return customerVoltageLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEnergyLimit() {
        return energyLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyLimit( Float newEnergyLimit ) {
        Float oldEnergyLimit = energyLimit;
        energyLimit = newEnergyLimit;
        boolean oldEnergyLimitESet = energyLimitESet;
        energyLimitESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT,
                        oldEnergyLimit, energyLimit, !oldEnergyLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyLimit() {
        Float oldEnergyLimit = energyLimit;
        boolean oldEnergyLimitESet = energyLimitESet;
        energyLimit = ENERGY_LIMIT_EDEFAULT;
        energyLimitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT, oldEnergyLimit, ENERGY_LIMIT_EDEFAULT,
                oldEnergyLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyLimit() {
        return energyLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getEnergyUsageStartDateTime() {
        return energyUsageStartDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyUsageStartDateTime( Date newEnergyUsageStartDateTime ) {
        Date oldEnergyUsageStartDateTime = energyUsageStartDateTime;
        energyUsageStartDateTime = newEnergyUsageStartDateTime;
        boolean oldEnergyUsageStartDateTimeESet = energyUsageStartDateTimeESet;
        energyUsageStartDateTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME, oldEnergyUsageStartDateTime,
                energyUsageStartDateTime, !oldEnergyUsageStartDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyUsageStartDateTime() {
        Date oldEnergyUsageStartDateTime = energyUsageStartDateTime;
        boolean oldEnergyUsageStartDateTimeESet = energyUsageStartDateTimeESet;
        energyUsageStartDateTime = ENERGY_USAGE_START_DATE_TIME_EDEFAULT;
        energyUsageStartDateTimeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME, oldEnergyUsageStartDateTime,
                ENERGY_USAGE_START_DATE_TIME_EDEFAULT, oldEnergyUsageStartDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyUsageStartDateTime() {
        return energyUsageStartDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEnergyUsageWarning() {
        return energyUsageWarning;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyUsageWarning( Float newEnergyUsageWarning ) {
        Float oldEnergyUsageWarning = energyUsageWarning;
        energyUsageWarning = newEnergyUsageWarning;
        boolean oldEnergyUsageWarningESet = energyUsageWarningESet;
        energyUsageWarningESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING, oldEnergyUsageWarning,
                energyUsageWarning, !oldEnergyUsageWarningESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyUsageWarning() {
        Float oldEnergyUsageWarning = energyUsageWarning;
        boolean oldEnergyUsageWarningESet = energyUsageWarningESet;
        energyUsageWarning = ENERGY_USAGE_WARNING_EDEFAULT;
        energyUsageWarningESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING, oldEnergyUsageWarning,
                ENERGY_USAGE_WARNING_EDEFAULT, oldEnergyUsageWarningESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyUsageWarning() {
        return energyUsageWarningESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsArmConnect() {
        return isArmConnect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsArmConnect( Boolean newIsArmConnect ) {
        Boolean oldIsArmConnect = isArmConnect;
        isArmConnect = newIsArmConnect;
        boolean oldIsArmConnectESet = isArmConnectESet;
        isArmConnectESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT, oldIsArmConnect, isArmConnect,
                !oldIsArmConnectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsArmConnect() {
        Boolean oldIsArmConnect = isArmConnect;
        boolean oldIsArmConnectESet = isArmConnectESet;
        isArmConnect = IS_ARM_CONNECT_EDEFAULT;
        isArmConnectESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT, oldIsArmConnect, IS_ARM_CONNECT_EDEFAULT,
                oldIsArmConnectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsArmConnect() {
        return isArmConnectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsArmDisconnect() {
        return isArmDisconnect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsArmDisconnect( Boolean newIsArmDisconnect ) {
        Boolean oldIsArmDisconnect = isArmDisconnect;
        isArmDisconnect = newIsArmDisconnect;
        boolean oldIsArmDisconnectESet = isArmDisconnectESet;
        isArmDisconnectESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT, oldIsArmDisconnect, isArmDisconnect,
                !oldIsArmDisconnectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsArmDisconnect() {
        Boolean oldIsArmDisconnect = isArmDisconnect;
        boolean oldIsArmDisconnectESet = isArmDisconnectESet;
        isArmDisconnect = IS_ARM_DISCONNECT_EDEFAULT;
        isArmDisconnectESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT, oldIsArmDisconnect,
                IS_ARM_DISCONNECT_EDEFAULT, oldIsArmDisconnectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsArmDisconnect() {
        return isArmDisconnectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsEnergyLimiting() {
        return isEnergyLimiting;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsEnergyLimiting( Boolean newIsEnergyLimiting ) {
        Boolean oldIsEnergyLimiting = isEnergyLimiting;
        isEnergyLimiting = newIsEnergyLimiting;
        boolean oldIsEnergyLimitingESet = isEnergyLimitingESet;
        isEnergyLimitingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING, oldIsEnergyLimiting, isEnergyLimiting,
                !oldIsEnergyLimitingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsEnergyLimiting() {
        Boolean oldIsEnergyLimiting = isEnergyLimiting;
        boolean oldIsEnergyLimitingESet = isEnergyLimitingESet;
        isEnergyLimiting = IS_ENERGY_LIMITING_EDEFAULT;
        isEnergyLimitingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING, oldIsEnergyLimiting,
                IS_ENERGY_LIMITING_EDEFAULT, oldIsEnergyLimitingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsEnergyLimiting() {
        return isEnergyLimitingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getNeedsPowerLimitCheck() {
        return needsPowerLimitCheck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeedsPowerLimitCheck( Boolean newNeedsPowerLimitCheck ) {
        Boolean oldNeedsPowerLimitCheck = needsPowerLimitCheck;
        needsPowerLimitCheck = newNeedsPowerLimitCheck;
        boolean oldNeedsPowerLimitCheckESet = needsPowerLimitCheckESet;
        needsPowerLimitCheckESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK, oldNeedsPowerLimitCheck,
                needsPowerLimitCheck, !oldNeedsPowerLimitCheckESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeedsPowerLimitCheck() {
        Boolean oldNeedsPowerLimitCheck = needsPowerLimitCheck;
        boolean oldNeedsPowerLimitCheckESet = needsPowerLimitCheckESet;
        needsPowerLimitCheck = NEEDS_POWER_LIMIT_CHECK_EDEFAULT;
        needsPowerLimitCheckESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK, oldNeedsPowerLimitCheck,
                NEEDS_POWER_LIMIT_CHECK_EDEFAULT, oldNeedsPowerLimitCheckESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeedsPowerLimitCheck() {
        return needsPowerLimitCheckESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getNeedsVoltageLimitCheck() {
        return needsVoltageLimitCheck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeedsVoltageLimitCheck( Boolean newNeedsVoltageLimitCheck ) {
        Boolean oldNeedsVoltageLimitCheck = needsVoltageLimitCheck;
        needsVoltageLimitCheck = newNeedsVoltageLimitCheck;
        boolean oldNeedsVoltageLimitCheckESet = needsVoltageLimitCheckESet;
        needsVoltageLimitCheckESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK, oldNeedsVoltageLimitCheck,
                needsVoltageLimitCheck, !oldNeedsVoltageLimitCheckESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeedsVoltageLimitCheck() {
        Boolean oldNeedsVoltageLimitCheck = needsVoltageLimitCheck;
        boolean oldNeedsVoltageLimitCheckESet = needsVoltageLimitCheckESet;
        needsVoltageLimitCheck = NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT;
        needsVoltageLimitCheckESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK, oldNeedsVoltageLimitCheck,
                NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT, oldNeedsVoltageLimitCheckESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeedsVoltageLimitCheck() {
        return needsVoltageLimitCheckESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPowerLimit() {
        return powerLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPowerLimit( Float newPowerLimit ) {
        Float oldPowerLimit = powerLimit;
        powerLimit = newPowerLimit;
        boolean oldPowerLimitESet = powerLimitESet;
        powerLimitESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT,
                        oldPowerLimit, powerLimit, !oldPowerLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerLimit() {
        Float oldPowerLimit = powerLimit;
        boolean oldPowerLimitESet = powerLimitESet;
        powerLimit = POWER_LIMIT_EDEFAULT;
        powerLimitESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT,
                        oldPowerLimit, POWER_LIMIT_EDEFAULT, oldPowerLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerLimit() {
        return powerLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getUsePushbutton() {
        return usePushbutton;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsePushbutton( Boolean newUsePushbutton ) {
        Boolean oldUsePushbutton = usePushbutton;
        usePushbutton = newUsePushbutton;
        boolean oldUsePushbuttonESet = usePushbuttonESet;
        usePushbuttonESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON, oldUsePushbutton, usePushbutton,
                !oldUsePushbuttonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsePushbutton() {
        Boolean oldUsePushbutton = usePushbutton;
        boolean oldUsePushbuttonESet = usePushbuttonESet;
        usePushbutton = USE_PUSHBUTTON_EDEFAULT;
        usePushbuttonESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON, oldUsePushbutton, USE_PUSHBUTTON_EDEFAULT,
                oldUsePushbuttonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsePushbutton() {
        return usePushbuttonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
            return getArmedTimeout();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
            return getCustomerVoltageLimit();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
            return getEnergyLimit();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
            return getEnergyUsageStartDateTime();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
            return getEnergyUsageWarning();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
            return getIsArmConnect();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
            return getIsArmDisconnect();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
            return getIsEnergyLimiting();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
            return getNeedsPowerLimitCheck();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
            return getNeedsVoltageLimitCheck();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
            return getPowerLimit();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
            return getUsePushbutton();
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
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
            setArmedTimeout( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
            setCustomerVoltageLimit( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
            setEnergyLimit( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
            setEnergyUsageStartDateTime( ( Date ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
            setEnergyUsageWarning( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
            setIsArmConnect( ( Boolean ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
            setIsArmDisconnect( ( Boolean ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
            setIsEnergyLimiting( ( Boolean ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
            setNeedsPowerLimitCheck( ( Boolean ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
            setNeedsVoltageLimitCheck( ( Boolean ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
            setPowerLimit( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
            setUsePushbutton( ( Boolean ) newValue );
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
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
            unsetArmedTimeout();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
            unsetCustomerVoltageLimit();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
            unsetEnergyLimit();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
            unsetEnergyUsageStartDateTime();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
            unsetEnergyUsageWarning();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
            unsetIsArmConnect();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
            unsetIsArmDisconnect();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
            unsetIsEnergyLimiting();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
            unsetNeedsPowerLimitCheck();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
            unsetNeedsVoltageLimitCheck();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
            unsetPowerLimit();
            return;
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
            unsetUsePushbutton();
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
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
            return isSetArmedTimeout();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
            return isSetCustomerVoltageLimit();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
            return isSetEnergyLimit();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
            return isSetEnergyUsageStartDateTime();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
            return isSetEnergyUsageWarning();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
            return isSetIsArmConnect();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
            return isSetIsArmDisconnect();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
            return isSetIsEnergyLimiting();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
            return isSetNeedsPowerLimitCheck();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
            return isSetNeedsVoltageLimitCheck();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
            return isSetPowerLimit();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
            return isSetUsePushbutton();
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
        result.append( " (armedTimeout: " );
        if( armedTimeoutESet )
            result.append( armedTimeout );
        else
            result.append( "<unset>" );
        result.append( ", customerVoltageLimit: " );
        if( customerVoltageLimitESet )
            result.append( customerVoltageLimit );
        else
            result.append( "<unset>" );
        result.append( ", energyLimit: " );
        if( energyLimitESet )
            result.append( energyLimit );
        else
            result.append( "<unset>" );
        result.append( ", energyUsageStartDateTime: " );
        if( energyUsageStartDateTimeESet )
            result.append( energyUsageStartDateTime );
        else
            result.append( "<unset>" );
        result.append( ", energyUsageWarning: " );
        if( energyUsageWarningESet )
            result.append( energyUsageWarning );
        else
            result.append( "<unset>" );
        result.append( ", isArmConnect: " );
        if( isArmConnectESet )
            result.append( isArmConnect );
        else
            result.append( "<unset>" );
        result.append( ", isArmDisconnect: " );
        if( isArmDisconnectESet )
            result.append( isArmDisconnect );
        else
            result.append( "<unset>" );
        result.append( ", isEnergyLimiting: " );
        if( isEnergyLimitingESet )
            result.append( isEnergyLimiting );
        else
            result.append( "<unset>" );
        result.append( ", needsPowerLimitCheck: " );
        if( needsPowerLimitCheckESet )
            result.append( needsPowerLimitCheck );
        else
            result.append( "<unset>" );
        result.append( ", needsVoltageLimitCheck: " );
        if( needsVoltageLimitCheckESet )
            result.append( needsVoltageLimitCheck );
        else
            result.append( "<unset>" );
        result.append( ", powerLimit: " );
        if( powerLimitESet )
            result.append( powerLimit );
        else
            result.append( "<unset>" );
        result.append( ", usePushbutton: " );
        if( usePushbuttonESet )
            result.append( usePushbutton );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RemoteConnectDisconnectInfoImpl
