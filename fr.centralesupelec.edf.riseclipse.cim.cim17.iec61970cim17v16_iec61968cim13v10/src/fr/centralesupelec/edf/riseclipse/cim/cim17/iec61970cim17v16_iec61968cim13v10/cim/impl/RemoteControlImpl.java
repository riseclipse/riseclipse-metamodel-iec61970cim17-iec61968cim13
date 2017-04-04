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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteControlImpl#getActuatorMaximum <em>Actuator Maximum</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteControlImpl#getActuatorMinimum <em>Actuator Minimum</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteControlImpl#getRemoteControlled <em>Remote Controlled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteControlImpl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteControlImpl extends RemotePointImpl implements RemoteControl {
    /**
     * The default value of the '{@link #getActuatorMaximum() <em>Actuator Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActuatorMaximum()
     * @generated
     * @ordered
     */
    protected static final Float ACTUATOR_MAXIMUM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActuatorMaximum() <em>Actuator Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActuatorMaximum()
     * @generated
     * @ordered
     */
    protected Float actuatorMaximum = ACTUATOR_MAXIMUM_EDEFAULT;

    /**
     * This is true if the Actuator Maximum attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean actuatorMaximumESet;

    /**
     * The default value of the '{@link #getActuatorMinimum() <em>Actuator Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActuatorMinimum()
     * @generated
     * @ordered
     */
    protected static final Float ACTUATOR_MINIMUM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActuatorMinimum() <em>Actuator Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActuatorMinimum()
     * @generated
     * @ordered
     */
    protected Float actuatorMinimum = ACTUATOR_MINIMUM_EDEFAULT;

    /**
     * This is true if the Actuator Minimum attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean actuatorMinimumESet;

    /**
     * The default value of the '{@link #getRemoteControlled() <em>Remote Controlled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteControlled()
     * @generated
     * @ordered
     */
    protected static final Boolean REMOTE_CONTROLLED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemoteControlled() <em>Remote Controlled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteControlled()
     * @generated
     * @ordered
     */
    protected Boolean remoteControlled = REMOTE_CONTROLLED_EDEFAULT;

    /**
     * This is true if the Remote Controlled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remoteControlledESet;

    /**
     * The cached value of the '{@link #getControl() <em>Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControl()
     * @generated
     * @ordered
     */
    protected Control control;

    /**
     * This is true if the Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoteControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRemoteControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getActuatorMaximum() {
        return actuatorMaximum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActuatorMaximum( Float newActuatorMaximum ) {
        Float oldActuatorMaximum = actuatorMaximum;
        actuatorMaximum = newActuatorMaximum;
        boolean oldActuatorMaximumESet = actuatorMaximumESet;
        actuatorMaximumESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM,
                    oldActuatorMaximum, actuatorMaximum, !oldActuatorMaximumESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActuatorMaximum() {
        Float oldActuatorMaximum = actuatorMaximum;
        boolean oldActuatorMaximumESet = actuatorMaximumESet;
        actuatorMaximum = ACTUATOR_MAXIMUM_EDEFAULT;
        actuatorMaximumESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM,
                    oldActuatorMaximum, ACTUATOR_MAXIMUM_EDEFAULT, oldActuatorMaximumESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActuatorMaximum() {
        return actuatorMaximumESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getActuatorMinimum() {
        return actuatorMinimum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActuatorMinimum( Float newActuatorMinimum ) {
        Float oldActuatorMinimum = actuatorMinimum;
        actuatorMinimum = newActuatorMinimum;
        boolean oldActuatorMinimumESet = actuatorMinimumESet;
        actuatorMinimumESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM,
                    oldActuatorMinimum, actuatorMinimum, !oldActuatorMinimumESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActuatorMinimum() {
        Float oldActuatorMinimum = actuatorMinimum;
        boolean oldActuatorMinimumESet = actuatorMinimumESet;
        actuatorMinimum = ACTUATOR_MINIMUM_EDEFAULT;
        actuatorMinimumESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM,
                    oldActuatorMinimum, ACTUATOR_MINIMUM_EDEFAULT, oldActuatorMinimumESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActuatorMinimum() {
        return actuatorMinimumESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRemoteControlled() {
        return remoteControlled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemoteControlled( Boolean newRemoteControlled ) {
        Boolean oldRemoteControlled = remoteControlled;
        remoteControlled = newRemoteControlled;
        boolean oldRemoteControlledESet = remoteControlledESet;
        remoteControlledESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REMOTE_CONTROL__REMOTE_CONTROLLED,
                    oldRemoteControlled, remoteControlled, !oldRemoteControlledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemoteControlled() {
        Boolean oldRemoteControlled = remoteControlled;
        boolean oldRemoteControlledESet = remoteControlledESet;
        remoteControlled = REMOTE_CONTROLLED_EDEFAULT;
        remoteControlledESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REMOTE_CONTROL__REMOTE_CONTROLLED,
                    oldRemoteControlled, REMOTE_CONTROLLED_EDEFAULT, oldRemoteControlledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteControlled() {
        return remoteControlledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Control getControl() {
        return control;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetControl( Control newControl, NotificationChain msgs ) {
        Control oldControl = control;
        control = newControl;
        boolean oldControlESet = controlESet;
        controlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_CONTROL__CONTROL, oldControl, newControl, !oldControlESet );
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
    public void setControl( Control newControl ) {
        if( newControl != control ) {
            NotificationChain msgs = null;
            if( control != null ) msgs = ( ( InternalEObject ) control ).eInverseRemove( this,
                    CimPackage.CONTROL__REMOTE_CONTROL, Control.class, msgs );
            if( newControl != null ) msgs = ( ( InternalEObject ) newControl ).eInverseAdd( this,
                    CimPackage.CONTROL__REMOTE_CONTROL, Control.class, msgs );
            msgs = basicSetControl( newControl, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldControlESet = controlESet;
            controlESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_CONTROL__CONTROL, newControl, newControl, !oldControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetControl( NotificationChain msgs ) {
        Control oldControl = control;
        control = null;
        boolean oldControlESet = controlESet;
        controlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_CONTROL__CONTROL, oldControl, null, oldControlESet );
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
    public void unsetControl() {
        if( control != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) control ).eInverseRemove( this, CimPackage.CONTROL__REMOTE_CONTROL,
                    Control.class, msgs );
            msgs = basicUnsetControl( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldControlESet = controlESet;
            controlESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_CONTROL__CONTROL, null, null, oldControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControl() {
        return controlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.REMOTE_CONTROL__CONTROL:
            if( control != null ) msgs = ( ( InternalEObject ) control ).eInverseRemove( this,
                    CimPackage.CONTROL__REMOTE_CONTROL, Control.class, msgs );
            return basicSetControl( ( Control ) otherEnd, msgs );
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
        case CimPackage.REMOTE_CONTROL__CONTROL:
            return basicUnsetControl( msgs );
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
        case CimPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
            return getActuatorMaximum();
        case CimPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
            return getActuatorMinimum();
        case CimPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
            return getRemoteControlled();
        case CimPackage.REMOTE_CONTROL__CONTROL:
            return getControl();
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
        case CimPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
            setActuatorMaximum( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
            setActuatorMinimum( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
            setRemoteControlled( ( Boolean ) newValue );
            return;
        case CimPackage.REMOTE_CONTROL__CONTROL:
            setControl( ( Control ) newValue );
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
        case CimPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
            unsetActuatorMaximum();
            return;
        case CimPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
            unsetActuatorMinimum();
            return;
        case CimPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
            unsetRemoteControlled();
            return;
        case CimPackage.REMOTE_CONTROL__CONTROL:
            unsetControl();
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
        case CimPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
            return isSetActuatorMaximum();
        case CimPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
            return isSetActuatorMinimum();
        case CimPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
            return isSetRemoteControlled();
        case CimPackage.REMOTE_CONTROL__CONTROL:
            return isSetControl();
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
        result.append( " (actuatorMaximum: " );
        if( actuatorMaximumESet )
            result.append( actuatorMaximum );
        else
            result.append( "<unset>" );
        result.append( ", actuatorMinimum: " );
        if( actuatorMinimumESet )
            result.append( actuatorMinimum );
        else
            result.append( "<unset>" );
        result.append( ", remoteControlled: " );
        if( remoteControlledESet )
            result.append( remoteControlled );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RemoteControlImpl
