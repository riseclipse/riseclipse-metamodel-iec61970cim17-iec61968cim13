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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatchable Power Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getCurrentActivePower <em>Current Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getCurrentApparentPower <em>Current Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getCurrentReactivePower <em>Current Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getMaxActivePower <em>Max Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getMaxApparentPower <em>Max Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getMaxReactivePower <em>Max Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getMinActivePower <em>Min Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getMinApparentPower <em>Min Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getMinReactivePower <em>Min Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getEndDeviceGroup <em>End Device Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DispatchablePowerCapabilityImpl#getEndDevice <em>End Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DispatchablePowerCapabilityImpl extends CimObjectWithIDImpl implements DispatchablePowerCapability {
    /**
     * The default value of the '{@link #getCurrentActivePower() <em>Current Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentActivePower()
     * @generated
     * @ordered
     */
    protected static final Float CURRENT_ACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrentActivePower() <em>Current Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentActivePower()
     * @generated
     * @ordered
     */
    protected Float currentActivePower = CURRENT_ACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Current Active Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currentActivePowerESet;

    /**
     * The default value of the '{@link #getCurrentApparentPower() <em>Current Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentApparentPower()
     * @generated
     * @ordered
     */
    protected static final Float CURRENT_APPARENT_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrentApparentPower() <em>Current Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentApparentPower()
     * @generated
     * @ordered
     */
    protected Float currentApparentPower = CURRENT_APPARENT_POWER_EDEFAULT;

    /**
     * This is true if the Current Apparent Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currentApparentPowerESet;

    /**
     * The default value of the '{@link #getCurrentReactivePower() <em>Current Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentReactivePower()
     * @generated
     * @ordered
     */
    protected static final Float CURRENT_REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrentReactivePower() <em>Current Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentReactivePower()
     * @generated
     * @ordered
     */
    protected Float currentReactivePower = CURRENT_REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Current Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currentReactivePowerESet;

    /**
     * The default value of the '{@link #getMaxActivePower() <em>Max Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxActivePower()
     * @generated
     * @ordered
     */
    protected static final Float MAX_ACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxActivePower() <em>Max Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxActivePower()
     * @generated
     * @ordered
     */
    protected Float maxActivePower = MAX_ACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Max Active Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxActivePowerESet;

    /**
     * The default value of the '{@link #getMaxApparentPower() <em>Max Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxApparentPower()
     * @generated
     * @ordered
     */
    protected static final Float MAX_APPARENT_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxApparentPower() <em>Max Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxApparentPower()
     * @generated
     * @ordered
     */
    protected Float maxApparentPower = MAX_APPARENT_POWER_EDEFAULT;

    /**
     * This is true if the Max Apparent Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxApparentPowerESet;

    /**
     * The default value of the '{@link #getMaxReactivePower() <em>Max Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxReactivePower()
     * @generated
     * @ordered
     */
    protected static final Float MAX_REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxReactivePower() <em>Max Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxReactivePower()
     * @generated
     * @ordered
     */
    protected Float maxReactivePower = MAX_REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Max Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxReactivePowerESet;

    /**
     * The default value of the '{@link #getMinActivePower() <em>Min Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinActivePower()
     * @generated
     * @ordered
     */
    protected static final Float MIN_ACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinActivePower() <em>Min Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinActivePower()
     * @generated
     * @ordered
     */
    protected Float minActivePower = MIN_ACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Min Active Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minActivePowerESet;

    /**
     * The default value of the '{@link #getMinApparentPower() <em>Min Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinApparentPower()
     * @generated
     * @ordered
     */
    protected static final Float MIN_APPARENT_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinApparentPower() <em>Min Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinApparentPower()
     * @generated
     * @ordered
     */
    protected Float minApparentPower = MIN_APPARENT_POWER_EDEFAULT;

    /**
     * This is true if the Min Apparent Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minApparentPowerESet;

    /**
     * The default value of the '{@link #getMinReactivePower() <em>Min Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinReactivePower()
     * @generated
     * @ordered
     */
    protected static final Float MIN_REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinReactivePower() <em>Min Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinReactivePower()
     * @generated
     * @ordered
     */
    protected Float minReactivePower = MIN_REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Min Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minReactivePowerESet;

    /**
     * The cached value of the '{@link #getEndDeviceGroup() <em>End Device Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceGroup()
     * @generated
     * @ordered
     */
    protected EndDeviceGroup endDeviceGroup;

    /**
     * This is true if the End Device Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceGroupESet;

    /**
     * The cached value of the '{@link #getEndDevice() <em>End Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDevice()
     * @generated
     * @ordered
     */
    protected EndDevice endDevice;

    /**
     * This is true if the End Device reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DispatchablePowerCapabilityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDispatchablePowerCapability();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCurrentActivePower() {
        return currentActivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentActivePower( Float newCurrentActivePower ) {
        Float oldCurrentActivePower = currentActivePower;
        currentActivePower = newCurrentActivePower;
        boolean oldCurrentActivePowerESet = currentActivePowerESet;
        currentActivePowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_ACTIVE_POWER, oldCurrentActivePower,
                currentActivePower, !oldCurrentActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrentActivePower() {
        Float oldCurrentActivePower = currentActivePower;
        boolean oldCurrentActivePowerESet = currentActivePowerESet;
        currentActivePower = CURRENT_ACTIVE_POWER_EDEFAULT;
        currentActivePowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_ACTIVE_POWER, oldCurrentActivePower,
                CURRENT_ACTIVE_POWER_EDEFAULT, oldCurrentActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrentActivePower() {
        return currentActivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCurrentApparentPower() {
        return currentApparentPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentApparentPower( Float newCurrentApparentPower ) {
        Float oldCurrentApparentPower = currentApparentPower;
        currentApparentPower = newCurrentApparentPower;
        boolean oldCurrentApparentPowerESet = currentApparentPowerESet;
        currentApparentPowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_APPARENT_POWER, oldCurrentApparentPower,
                currentApparentPower, !oldCurrentApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrentApparentPower() {
        Float oldCurrentApparentPower = currentApparentPower;
        boolean oldCurrentApparentPowerESet = currentApparentPowerESet;
        currentApparentPower = CURRENT_APPARENT_POWER_EDEFAULT;
        currentApparentPowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_APPARENT_POWER, oldCurrentApparentPower,
                CURRENT_APPARENT_POWER_EDEFAULT, oldCurrentApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrentApparentPower() {
        return currentApparentPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCurrentReactivePower() {
        return currentReactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentReactivePower( Float newCurrentReactivePower ) {
        Float oldCurrentReactivePower = currentReactivePower;
        currentReactivePower = newCurrentReactivePower;
        boolean oldCurrentReactivePowerESet = currentReactivePowerESet;
        currentReactivePowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_REACTIVE_POWER, oldCurrentReactivePower,
                currentReactivePower, !oldCurrentReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrentReactivePower() {
        Float oldCurrentReactivePower = currentReactivePower;
        boolean oldCurrentReactivePowerESet = currentReactivePowerESet;
        currentReactivePower = CURRENT_REACTIVE_POWER_EDEFAULT;
        currentReactivePowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_REACTIVE_POWER, oldCurrentReactivePower,
                CURRENT_REACTIVE_POWER_EDEFAULT, oldCurrentReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrentReactivePower() {
        return currentReactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxActivePower() {
        return maxActivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxActivePower( Float newMaxActivePower ) {
        Float oldMaxActivePower = maxActivePower;
        maxActivePower = newMaxActivePower;
        boolean oldMaxActivePowerESet = maxActivePowerESet;
        maxActivePowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_ACTIVE_POWER, oldMaxActivePower, maxActivePower,
                !oldMaxActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxActivePower() {
        Float oldMaxActivePower = maxActivePower;
        boolean oldMaxActivePowerESet = maxActivePowerESet;
        maxActivePower = MAX_ACTIVE_POWER_EDEFAULT;
        maxActivePowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_ACTIVE_POWER, oldMaxActivePower,
                MAX_ACTIVE_POWER_EDEFAULT, oldMaxActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxActivePower() {
        return maxActivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxApparentPower() {
        return maxApparentPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxApparentPower( Float newMaxApparentPower ) {
        Float oldMaxApparentPower = maxApparentPower;
        maxApparentPower = newMaxApparentPower;
        boolean oldMaxApparentPowerESet = maxApparentPowerESet;
        maxApparentPowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_APPARENT_POWER, oldMaxApparentPower, maxApparentPower,
                !oldMaxApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxApparentPower() {
        Float oldMaxApparentPower = maxApparentPower;
        boolean oldMaxApparentPowerESet = maxApparentPowerESet;
        maxApparentPower = MAX_APPARENT_POWER_EDEFAULT;
        maxApparentPowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_APPARENT_POWER, oldMaxApparentPower,
                MAX_APPARENT_POWER_EDEFAULT, oldMaxApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxApparentPower() {
        return maxApparentPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxReactivePower() {
        return maxReactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxReactivePower( Float newMaxReactivePower ) {
        Float oldMaxReactivePower = maxReactivePower;
        maxReactivePower = newMaxReactivePower;
        boolean oldMaxReactivePowerESet = maxReactivePowerESet;
        maxReactivePowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_REACTIVE_POWER, oldMaxReactivePower, maxReactivePower,
                !oldMaxReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxReactivePower() {
        Float oldMaxReactivePower = maxReactivePower;
        boolean oldMaxReactivePowerESet = maxReactivePowerESet;
        maxReactivePower = MAX_REACTIVE_POWER_EDEFAULT;
        maxReactivePowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_REACTIVE_POWER, oldMaxReactivePower,
                MAX_REACTIVE_POWER_EDEFAULT, oldMaxReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxReactivePower() {
        return maxReactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinActivePower() {
        return minActivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinActivePower( Float newMinActivePower ) {
        Float oldMinActivePower = minActivePower;
        minActivePower = newMinActivePower;
        boolean oldMinActivePowerESet = minActivePowerESet;
        minActivePowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_ACTIVE_POWER, oldMinActivePower, minActivePower,
                !oldMinActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinActivePower() {
        Float oldMinActivePower = minActivePower;
        boolean oldMinActivePowerESet = minActivePowerESet;
        minActivePower = MIN_ACTIVE_POWER_EDEFAULT;
        minActivePowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_ACTIVE_POWER, oldMinActivePower,
                MIN_ACTIVE_POWER_EDEFAULT, oldMinActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinActivePower() {
        return minActivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinApparentPower() {
        return minApparentPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinApparentPower( Float newMinApparentPower ) {
        Float oldMinApparentPower = minApparentPower;
        minApparentPower = newMinApparentPower;
        boolean oldMinApparentPowerESet = minApparentPowerESet;
        minApparentPowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_APPARENT_POWER, oldMinApparentPower, minApparentPower,
                !oldMinApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinApparentPower() {
        Float oldMinApparentPower = minApparentPower;
        boolean oldMinApparentPowerESet = minApparentPowerESet;
        minApparentPower = MIN_APPARENT_POWER_EDEFAULT;
        minApparentPowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_APPARENT_POWER, oldMinApparentPower,
                MIN_APPARENT_POWER_EDEFAULT, oldMinApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinApparentPower() {
        return minApparentPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinReactivePower() {
        return minReactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinReactivePower( Float newMinReactivePower ) {
        Float oldMinReactivePower = minReactivePower;
        minReactivePower = newMinReactivePower;
        boolean oldMinReactivePowerESet = minReactivePowerESet;
        minReactivePowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_REACTIVE_POWER, oldMinReactivePower, minReactivePower,
                !oldMinReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinReactivePower() {
        Float oldMinReactivePower = minReactivePower;
        boolean oldMinReactivePowerESet = minReactivePowerESet;
        minReactivePower = MIN_REACTIVE_POWER_EDEFAULT;
        minReactivePowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_REACTIVE_POWER, oldMinReactivePower,
                MIN_REACTIVE_POWER_EDEFAULT, oldMinReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinReactivePower() {
        return minReactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceGroup getEndDeviceGroup() {
        if( endDeviceGroup != null && endDeviceGroup.eIsProxy() ) {
            InternalEObject oldEndDeviceGroup = ( InternalEObject ) endDeviceGroup;
            endDeviceGroup = ( EndDeviceGroup ) eResolveProxy( oldEndDeviceGroup );
            if( endDeviceGroup != oldEndDeviceGroup ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP, oldEndDeviceGroup,
                        endDeviceGroup ) );
            }
        }
        return endDeviceGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndDeviceGroup basicGetEndDeviceGroup() {
        return endDeviceGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDeviceGroup( EndDeviceGroup newEndDeviceGroup, NotificationChain msgs ) {
        EndDeviceGroup oldEndDeviceGroup = endDeviceGroup;
        endDeviceGroup = newEndDeviceGroup;
        boolean oldEndDeviceGroupESet = endDeviceGroupESet;
        endDeviceGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP, oldEndDeviceGroup, newEndDeviceGroup,
                    !oldEndDeviceGroupESet );
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
    public void setEndDeviceGroup( EndDeviceGroup newEndDeviceGroup ) {
        if( newEndDeviceGroup != endDeviceGroup ) {
            NotificationChain msgs = null;
            if( endDeviceGroup != null ) msgs = ( ( InternalEObject ) endDeviceGroup ).eInverseRemove( this,
                    CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY, EndDeviceGroup.class, msgs );
            if( newEndDeviceGroup != null ) msgs = ( ( InternalEObject ) newEndDeviceGroup ).eInverseAdd( this,
                    CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY, EndDeviceGroup.class, msgs );
            msgs = basicSetEndDeviceGroup( newEndDeviceGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceGroupESet = endDeviceGroupESet;
            endDeviceGroupESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP, newEndDeviceGroup, newEndDeviceGroup,
                    !oldEndDeviceGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDeviceGroup( NotificationChain msgs ) {
        EndDeviceGroup oldEndDeviceGroup = endDeviceGroup;
        endDeviceGroup = null;
        boolean oldEndDeviceGroupESet = endDeviceGroupESet;
        endDeviceGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP, oldEndDeviceGroup, null,
                    oldEndDeviceGroupESet );
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
    public void unsetEndDeviceGroup() {
        if( endDeviceGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDeviceGroup ).eInverseRemove( this,
                    CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY, EndDeviceGroup.class, msgs );
            msgs = basicUnsetEndDeviceGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceGroupESet = endDeviceGroupESet;
            endDeviceGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP, null, null, oldEndDeviceGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceGroup() {
        return endDeviceGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDevice getEndDevice() {
        return endDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDevice( EndDevice newEndDevice, NotificationChain msgs ) {
        EndDevice oldEndDevice = endDevice;
        endDevice = newEndDevice;
        boolean oldEndDeviceESet = endDeviceESet;
        endDeviceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE, oldEndDevice, newEndDevice,
                    !oldEndDeviceESet );
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
    public void setEndDevice( EndDevice newEndDevice ) {
        if( newEndDevice != endDevice ) {
            NotificationChain msgs = null;
            if( endDevice != null ) msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this,
                    CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY, EndDevice.class, msgs );
            if( newEndDevice != null ) msgs = ( ( InternalEObject ) newEndDevice ).eInverseAdd( this,
                    CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY, EndDevice.class, msgs );
            msgs = basicSetEndDevice( newEndDevice, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceESet = endDeviceESet;
            endDeviceESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE,
                            newEndDevice, newEndDevice, !oldEndDeviceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDevice( NotificationChain msgs ) {
        EndDevice oldEndDevice = endDevice;
        endDevice = null;
        boolean oldEndDeviceESet = endDeviceESet;
        endDeviceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE, oldEndDevice, null, oldEndDeviceESet );
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
    public void unsetEndDevice() {
        if( endDevice != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this,
                    CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY, EndDevice.class, msgs );
            msgs = basicUnsetEndDevice( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceESet = endDeviceESet;
            endDeviceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE, null, null, oldEndDeviceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDevice() {
        return endDeviceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP:
            if( endDeviceGroup != null ) msgs = ( ( InternalEObject ) endDeviceGroup ).eInverseRemove( this,
                    CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY, EndDeviceGroup.class, msgs );
            return basicSetEndDeviceGroup( ( EndDeviceGroup ) otherEnd, msgs );
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE:
            if( endDevice != null ) msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this,
                    CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY, EndDevice.class, msgs );
            return basicSetEndDevice( ( EndDevice ) otherEnd, msgs );
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
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP:
            return basicUnsetEndDeviceGroup( msgs );
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE:
            return basicUnsetEndDevice( msgs );
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
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_ACTIVE_POWER:
            return getCurrentActivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_APPARENT_POWER:
            return getCurrentApparentPower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_REACTIVE_POWER:
            return getCurrentReactivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_ACTIVE_POWER:
            return getMaxActivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_APPARENT_POWER:
            return getMaxApparentPower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_REACTIVE_POWER:
            return getMaxReactivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_ACTIVE_POWER:
            return getMinActivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_APPARENT_POWER:
            return getMinApparentPower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_REACTIVE_POWER:
            return getMinReactivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP:
            if( resolve ) return getEndDeviceGroup();
            return basicGetEndDeviceGroup();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE:
            return getEndDevice();
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
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_ACTIVE_POWER:
            setCurrentActivePower( ( Float ) newValue );
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_APPARENT_POWER:
            setCurrentApparentPower( ( Float ) newValue );
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_REACTIVE_POWER:
            setCurrentReactivePower( ( Float ) newValue );
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_ACTIVE_POWER:
            setMaxActivePower( ( Float ) newValue );
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_APPARENT_POWER:
            setMaxApparentPower( ( Float ) newValue );
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_REACTIVE_POWER:
            setMaxReactivePower( ( Float ) newValue );
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_ACTIVE_POWER:
            setMinActivePower( ( Float ) newValue );
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_APPARENT_POWER:
            setMinApparentPower( ( Float ) newValue );
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_REACTIVE_POWER:
            setMinReactivePower( ( Float ) newValue );
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP:
            setEndDeviceGroup( ( EndDeviceGroup ) newValue );
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE:
            setEndDevice( ( EndDevice ) newValue );
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
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_ACTIVE_POWER:
            unsetCurrentActivePower();
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_APPARENT_POWER:
            unsetCurrentApparentPower();
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_REACTIVE_POWER:
            unsetCurrentReactivePower();
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_ACTIVE_POWER:
            unsetMaxActivePower();
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_APPARENT_POWER:
            unsetMaxApparentPower();
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_REACTIVE_POWER:
            unsetMaxReactivePower();
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_ACTIVE_POWER:
            unsetMinActivePower();
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_APPARENT_POWER:
            unsetMinApparentPower();
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_REACTIVE_POWER:
            unsetMinReactivePower();
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP:
            unsetEndDeviceGroup();
            return;
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE:
            unsetEndDevice();
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
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_ACTIVE_POWER:
            return isSetCurrentActivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_APPARENT_POWER:
            return isSetCurrentApparentPower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_REACTIVE_POWER:
            return isSetCurrentReactivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_ACTIVE_POWER:
            return isSetMaxActivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_APPARENT_POWER:
            return isSetMaxApparentPower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_REACTIVE_POWER:
            return isSetMaxReactivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_ACTIVE_POWER:
            return isSetMinActivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_APPARENT_POWER:
            return isSetMinApparentPower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_REACTIVE_POWER:
            return isSetMinReactivePower();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP:
            return isSetEndDeviceGroup();
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE:
            return isSetEndDevice();
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
        result.append( " (currentActivePower: " );
        if( currentActivePowerESet )
            result.append( currentActivePower );
        else
            result.append( "<unset>" );
        result.append( ", currentApparentPower: " );
        if( currentApparentPowerESet )
            result.append( currentApparentPower );
        else
            result.append( "<unset>" );
        result.append( ", currentReactivePower: " );
        if( currentReactivePowerESet )
            result.append( currentReactivePower );
        else
            result.append( "<unset>" );
        result.append( ", maxActivePower: " );
        if( maxActivePowerESet )
            result.append( maxActivePower );
        else
            result.append( "<unset>" );
        result.append( ", maxApparentPower: " );
        if( maxApparentPowerESet )
            result.append( maxApparentPower );
        else
            result.append( "<unset>" );
        result.append( ", maxReactivePower: " );
        if( maxReactivePowerESet )
            result.append( maxReactivePower );
        else
            result.append( "<unset>" );
        result.append( ", minActivePower: " );
        if( minActivePowerESet )
            result.append( minActivePower );
        else
            result.append( "<unset>" );
        result.append( ", minApparentPower: " );
        if( minApparentPowerESet )
            result.append( minApparentPower );
        else
            result.append( "<unset>" );
        result.append( ", minReactivePower: " );
        if( minReactivePowerESet )
            result.append( minReactivePower );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DispatchablePowerCapabilityImpl
