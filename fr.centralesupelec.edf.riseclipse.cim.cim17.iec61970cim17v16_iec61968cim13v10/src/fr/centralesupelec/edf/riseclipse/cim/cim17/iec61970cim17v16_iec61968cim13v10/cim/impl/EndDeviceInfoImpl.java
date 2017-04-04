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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceInfoImpl#getIsSolidState <em>Is Solid State</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceInfoImpl#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceInfoImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceInfoImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceInfoImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceInfoImpl#getEndDevices <em>End Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceInfoImpl extends AssetInfoImpl implements EndDeviceInfo {
    /**
     * The default value of the '{@link #getIsSolidState() <em>Is Solid State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSolidState()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_SOLID_STATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsSolidState() <em>Is Solid State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSolidState()
     * @generated
     * @ordered
     */
    protected Boolean isSolidState = IS_SOLID_STATE_EDEFAULT;

    /**
     * This is true if the Is Solid State attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSolidStateESet;

    /**
     * The default value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseCount()
     * @generated
     * @ordered
     */
    protected static final Integer PHASE_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseCount()
     * @generated
     * @ordered
     */
    protected Integer phaseCount = PHASE_COUNT_EDEFAULT;

    /**
     * This is true if the Phase Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseCountESet;

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
     * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapability()
     * @generated
     * @ordered
     */
    protected EndDeviceCapability capability;

    /**
     * This is true if the Capability containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capabilityESet;

    /**
     * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDevices()
     * @generated
     * @ordered
     */
    protected EList< EndDevice > endDevices;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsSolidState() {
        return isSolidState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsSolidState( Boolean newIsSolidState ) {
        Boolean oldIsSolidState = isSolidState;
        isSolidState = newIsSolidState;
        boolean oldIsSolidStateESet = isSolidStateESet;
        isSolidStateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_INFO__IS_SOLID_STATE, oldIsSolidState, isSolidState, !oldIsSolidStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsSolidState() {
        Boolean oldIsSolidState = isSolidState;
        boolean oldIsSolidStateESet = isSolidStateESet;
        isSolidState = IS_SOLID_STATE_EDEFAULT;
        isSolidStateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_INFO__IS_SOLID_STATE,
                    oldIsSolidState, IS_SOLID_STATE_EDEFAULT, oldIsSolidStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsSolidState() {
        return isSolidStateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPhaseCount() {
        return phaseCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseCount( Integer newPhaseCount ) {
        Integer oldPhaseCount = phaseCount;
        phaseCount = newPhaseCount;
        boolean oldPhaseCountESet = phaseCountESet;
        phaseCountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_INFO__PHASE_COUNT, oldPhaseCount, phaseCount, !oldPhaseCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseCount() {
        Integer oldPhaseCount = phaseCount;
        boolean oldPhaseCountESet = phaseCountESet;
        phaseCount = PHASE_COUNT_EDEFAULT;
        phaseCountESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_INFO__PHASE_COUNT, oldPhaseCount, PHASE_COUNT_EDEFAULT, oldPhaseCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseCount() {
        return phaseCountESet;
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
                CimPackage.END_DEVICE_INFO__RATED_CURRENT, oldRatedCurrent, ratedCurrent, !oldRatedCurrentESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_INFO__RATED_CURRENT,
                    oldRatedCurrent, RATED_CURRENT_EDEFAULT, oldRatedCurrentESet ) );
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
                CimPackage.END_DEVICE_INFO__RATED_VOLTAGE, oldRatedVoltage, ratedVoltage, !oldRatedVoltageESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_INFO__RATED_VOLTAGE,
                    oldRatedVoltage, RATED_VOLTAGE_EDEFAULT, oldRatedVoltageESet ) );
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
    public EndDeviceCapability getCapability() {
        return capability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCapability( EndDeviceCapability newCapability, NotificationChain msgs ) {
        EndDeviceCapability oldCapability = capability;
        capability = newCapability;
        boolean oldCapabilityESet = capabilityESet;
        capabilityESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_INFO__CAPABILITY, oldCapability, newCapability, !oldCapabilityESet );
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
    public void setCapability( EndDeviceCapability newCapability ) {
        if( newCapability != capability ) {
            NotificationChain msgs = null;
            if( capability != null ) msgs = ( ( InternalEObject ) capability ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_INFO__CAPABILITY, null, msgs );
            if( newCapability != null ) msgs = ( ( InternalEObject ) newCapability ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_INFO__CAPABILITY, null, msgs );
            msgs = basicSetCapability( newCapability, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCapabilityESet = capabilityESet;
            capabilityESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_INFO__CAPABILITY, newCapability, newCapability, !oldCapabilityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCapability( NotificationChain msgs ) {
        EndDeviceCapability oldCapability = capability;
        capability = null;
        boolean oldCapabilityESet = capabilityESet;
        capabilityESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_INFO__CAPABILITY, oldCapability, null, oldCapabilityESet );
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
    public void unsetCapability() {
        if( capability != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) capability ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_INFO__CAPABILITY, null, msgs );
            msgs = basicUnsetCapability( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCapabilityESet = capabilityESet;
            capabilityESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_INFO__CAPABILITY, null, null, oldCapabilityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapability() {
        return capabilityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDevice > getEndDevices() {
        if( endDevices == null ) {
            endDevices = new EObjectWithInverseResolvingEList.Unsettable< EndDevice >( EndDevice.class, this,
                    CimPackage.END_DEVICE_INFO__END_DEVICES, CimPackage.END_DEVICE__END_DEVICE_INFO );
        }
        return endDevices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDevices() {
        if( endDevices != null ) ( ( InternalEList.Unsettable< ? > ) endDevices ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDevices() {
        return endDevices != null && ( ( InternalEList.Unsettable< ? > ) endDevices ).isSet();
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
        case CimPackage.END_DEVICE_INFO__END_DEVICES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDevices() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.END_DEVICE_INFO__CAPABILITY:
            return basicUnsetCapability( msgs );
        case CimPackage.END_DEVICE_INFO__END_DEVICES:
            return ( ( InternalEList< ? > ) getEndDevices() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.END_DEVICE_INFO__IS_SOLID_STATE:
            return getIsSolidState();
        case CimPackage.END_DEVICE_INFO__PHASE_COUNT:
            return getPhaseCount();
        case CimPackage.END_DEVICE_INFO__RATED_CURRENT:
            return getRatedCurrent();
        case CimPackage.END_DEVICE_INFO__RATED_VOLTAGE:
            return getRatedVoltage();
        case CimPackage.END_DEVICE_INFO__CAPABILITY:
            return getCapability();
        case CimPackage.END_DEVICE_INFO__END_DEVICES:
            return getEndDevices();
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
        case CimPackage.END_DEVICE_INFO__IS_SOLID_STATE:
            setIsSolidState( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_INFO__PHASE_COUNT:
            setPhaseCount( ( Integer ) newValue );
            return;
        case CimPackage.END_DEVICE_INFO__RATED_CURRENT:
            setRatedCurrent( ( Float ) newValue );
            return;
        case CimPackage.END_DEVICE_INFO__RATED_VOLTAGE:
            setRatedVoltage( ( Float ) newValue );
            return;
        case CimPackage.END_DEVICE_INFO__CAPABILITY:
            setCapability( ( EndDeviceCapability ) newValue );
            return;
        case CimPackage.END_DEVICE_INFO__END_DEVICES:
            getEndDevices().clear();
            getEndDevices().addAll( ( Collection< ? extends EndDevice > ) newValue );
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
        case CimPackage.END_DEVICE_INFO__IS_SOLID_STATE:
            unsetIsSolidState();
            return;
        case CimPackage.END_DEVICE_INFO__PHASE_COUNT:
            unsetPhaseCount();
            return;
        case CimPackage.END_DEVICE_INFO__RATED_CURRENT:
            unsetRatedCurrent();
            return;
        case CimPackage.END_DEVICE_INFO__RATED_VOLTAGE:
            unsetRatedVoltage();
            return;
        case CimPackage.END_DEVICE_INFO__CAPABILITY:
            unsetCapability();
            return;
        case CimPackage.END_DEVICE_INFO__END_DEVICES:
            unsetEndDevices();
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
        case CimPackage.END_DEVICE_INFO__IS_SOLID_STATE:
            return isSetIsSolidState();
        case CimPackage.END_DEVICE_INFO__PHASE_COUNT:
            return isSetPhaseCount();
        case CimPackage.END_DEVICE_INFO__RATED_CURRENT:
            return isSetRatedCurrent();
        case CimPackage.END_DEVICE_INFO__RATED_VOLTAGE:
            return isSetRatedVoltage();
        case CimPackage.END_DEVICE_INFO__CAPABILITY:
            return isSetCapability();
        case CimPackage.END_DEVICE_INFO__END_DEVICES:
            return isSetEndDevices();
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
        result.append( " (isSolidState: " );
        if( isSolidStateESet )
            result.append( isSolidState );
        else
            result.append( "<unset>" );
        result.append( ", phaseCount: " );
        if( phaseCountESet )
            result.append( phaseCount );
        else
            result.append( "<unset>" );
        result.append( ", ratedCurrent: " );
        if( ratedCurrentESet )
            result.append( ratedCurrent );
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

} //EndDeviceInfoImpl
