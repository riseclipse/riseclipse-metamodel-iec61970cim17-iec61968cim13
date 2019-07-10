/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceFunction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register;

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
 * An implementation of the model object '<em><b>End Device Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceFunctionImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceFunctionImpl#getEndDevice <em>End Device</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceFunctionImpl#getRegisters <em>Registers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceFunctionImpl extends AssetFunctionImpl implements EndDeviceFunction {
    /**
     * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnabled()
     * @generated
     * @ordered
     */
    protected static final Boolean ENABLED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnabled()
     * @generated
     * @ordered
     */
    protected Boolean enabled = ENABLED_EDEFAULT;

    /**
     * This is true if the Enabled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean enabledESet;

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
     * The cached value of the '{@link #getRegisters() <em>Registers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegisters()
     * @generated
     * @ordered
     */
    protected EList< Register > registers;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceFunction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnabled( Boolean newEnabled ) {
        Boolean oldEnabled = enabled;
        enabled = newEnabled;
        boolean oldEnabledESet = enabledESet;
        enabledESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_FUNCTION__ENABLED, oldEnabled, enabled, !oldEnabledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnabled() {
        Boolean oldEnabled = enabled;
        boolean oldEnabledESet = enabledESet;
        enabled = ENABLED_EDEFAULT;
        enabledESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_FUNCTION__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnabled() {
        return enabledESet;
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
                    CimPackage.END_DEVICE_FUNCTION__END_DEVICE, oldEndDevice, newEndDevice, !oldEndDeviceESet );
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
                    CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS, EndDevice.class, msgs );
            if( newEndDevice != null ) msgs = ( ( InternalEObject ) newEndDevice ).eInverseAdd( this,
                    CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS, EndDevice.class, msgs );
            msgs = basicSetEndDevice( newEndDevice, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceESet = endDeviceESet;
            endDeviceESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_FUNCTION__END_DEVICE, newEndDevice, newEndDevice, !oldEndDeviceESet ) );
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
                    CimPackage.END_DEVICE_FUNCTION__END_DEVICE, oldEndDevice, null, oldEndDeviceESet );
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
            msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this, CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS,
                    EndDevice.class, msgs );
            msgs = basicUnsetEndDevice( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceESet = endDeviceESet;
            endDeviceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_FUNCTION__END_DEVICE, null, null, oldEndDeviceESet ) );
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
    public EList< Register > getRegisters() {
        if( registers == null ) {
            registers = new EObjectWithInverseResolvingEList.Unsettable< Register >( Register.class, this,
                    CimPackage.END_DEVICE_FUNCTION__REGISTERS, CimPackage.REGISTER__END_DEVICE_FUNCTION );
        }
        return registers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRegisters() {
        if( registers != null ) ( ( InternalEList.Unsettable< ? > ) registers ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegisters() {
        return registers != null && ( ( InternalEList.Unsettable< ? > ) registers ).isSet();
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
        case CimPackage.END_DEVICE_FUNCTION__END_DEVICE:
            if( endDevice != null ) msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this,
                    CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS, EndDevice.class, msgs );
            return basicSetEndDevice( ( EndDevice ) otherEnd, msgs );
        case CimPackage.END_DEVICE_FUNCTION__REGISTERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRegisters() ).basicAdd( otherEnd,
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
        case CimPackage.END_DEVICE_FUNCTION__END_DEVICE:
            return basicUnsetEndDevice( msgs );
        case CimPackage.END_DEVICE_FUNCTION__REGISTERS:
            return ( ( InternalEList< ? > ) getRegisters() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.END_DEVICE_FUNCTION__ENABLED:
            return getEnabled();
        case CimPackage.END_DEVICE_FUNCTION__END_DEVICE:
            return getEndDevice();
        case CimPackage.END_DEVICE_FUNCTION__REGISTERS:
            return getRegisters();
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
        case CimPackage.END_DEVICE_FUNCTION__ENABLED:
            setEnabled( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_FUNCTION__END_DEVICE:
            setEndDevice( ( EndDevice ) newValue );
            return;
        case CimPackage.END_DEVICE_FUNCTION__REGISTERS:
            getRegisters().clear();
            getRegisters().addAll( ( Collection< ? extends Register > ) newValue );
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
        case CimPackage.END_DEVICE_FUNCTION__ENABLED:
            unsetEnabled();
            return;
        case CimPackage.END_DEVICE_FUNCTION__END_DEVICE:
            unsetEndDevice();
            return;
        case CimPackage.END_DEVICE_FUNCTION__REGISTERS:
            unsetRegisters();
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
        case CimPackage.END_DEVICE_FUNCTION__ENABLED:
            return isSetEnabled();
        case CimPackage.END_DEVICE_FUNCTION__END_DEVICE:
            return isSetEndDevice();
        case CimPackage.END_DEVICE_FUNCTION__REGISTERS:
            return isSetRegisters();
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
        result.append( " (enabled: " );
        if( enabledESet )
            result.append( enabled );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceFunctionImpl
