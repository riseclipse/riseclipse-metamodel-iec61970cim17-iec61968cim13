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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEventDetail;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringQuantity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Event Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventDetailImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventDetailImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventDetailImpl#getEndDeviceEvent <em>End Device Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceEventDetailImpl extends CimObjectWithIDImpl implements EndDeviceEventDetail {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected StringQuantity value;

    /**
     * This is true if the Value containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * The cached value of the '{@link #getEndDeviceEvent() <em>End Device Event</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceEvent()
     * @generated
     * @ordered
     */
    protected EndDeviceEvent endDeviceEvent;

    /**
     * This is true if the End Device Event reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceEventESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceEventDetailImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceEventDetail();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_EVENT_DETAIL__NAME, oldName, name, !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_EVENT_DETAIL__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringQuantity getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue( StringQuantity newValue, NotificationChain msgs ) {
        StringQuantity oldValue = value;
        value = newValue;
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_EVENT_DETAIL__VALUE, oldValue, newValue, !oldValueESet );
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
    public void setValue( StringQuantity newValue ) {
        if( newValue != value ) {
            NotificationChain msgs = null;
            if( value != null ) msgs = ( ( InternalEObject ) value ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_EVENT_DETAIL__VALUE, null, msgs );
            if( newValue != null ) msgs = ( ( InternalEObject ) newValue ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_EVENT_DETAIL__VALUE, null, msgs );
            msgs = basicSetValue( newValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueESet = valueESet;
            valueESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_EVENT_DETAIL__VALUE, newValue, newValue, !oldValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetValue( NotificationChain msgs ) {
        StringQuantity oldValue = value;
        value = null;
        boolean oldValueESet = valueESet;
        valueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT_DETAIL__VALUE, oldValue, null, oldValueESet );
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
    public void unsetValue() {
        if( value != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) value ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_EVENT_DETAIL__VALUE, null, msgs );
            msgs = basicUnsetValue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueESet = valueESet;
            valueESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT_DETAIL__VALUE, null, null, oldValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue() {
        return valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceEvent getEndDeviceEvent() {
        return endDeviceEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDeviceEvent( EndDeviceEvent newEndDeviceEvent, NotificationChain msgs ) {
        EndDeviceEvent oldEndDeviceEvent = endDeviceEvent;
        endDeviceEvent = newEndDeviceEvent;
        boolean oldEndDeviceEventESet = endDeviceEventESet;
        endDeviceEventESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT, oldEndDeviceEvent, newEndDeviceEvent,
                    !oldEndDeviceEventESet );
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
    public void setEndDeviceEvent( EndDeviceEvent newEndDeviceEvent ) {
        if( newEndDeviceEvent != endDeviceEvent ) {
            NotificationChain msgs = null;
            if( endDeviceEvent != null ) msgs = ( ( InternalEObject ) endDeviceEvent ).eInverseRemove( this,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS, EndDeviceEvent.class, msgs );
            if( newEndDeviceEvent != null ) msgs = ( ( InternalEObject ) newEndDeviceEvent ).eInverseAdd( this,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS, EndDeviceEvent.class, msgs );
            msgs = basicSetEndDeviceEvent( newEndDeviceEvent, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceEventESet = endDeviceEventESet;
            endDeviceEventESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT,
                            newEndDeviceEvent, newEndDeviceEvent, !oldEndDeviceEventESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDeviceEvent( NotificationChain msgs ) {
        EndDeviceEvent oldEndDeviceEvent = endDeviceEvent;
        endDeviceEvent = null;
        boolean oldEndDeviceEventESet = endDeviceEventESet;
        endDeviceEventESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT, oldEndDeviceEvent, null,
                    oldEndDeviceEventESet );
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
    public void unsetEndDeviceEvent() {
        if( endDeviceEvent != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDeviceEvent ).eInverseRemove( this,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS, EndDeviceEvent.class, msgs );
            msgs = basicUnsetEndDeviceEvent( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceEventESet = endDeviceEventESet;
            endDeviceEventESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT, null, null, oldEndDeviceEventESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceEvent() {
        return endDeviceEventESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT:
            if( endDeviceEvent != null ) msgs = ( ( InternalEObject ) endDeviceEvent ).eInverseRemove( this,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS, EndDeviceEvent.class, msgs );
            return basicSetEndDeviceEvent( ( EndDeviceEvent ) otherEnd, msgs );
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
        case CimPackage.END_DEVICE_EVENT_DETAIL__VALUE:
            return basicUnsetValue( msgs );
        case CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT:
            return basicUnsetEndDeviceEvent( msgs );
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
        case CimPackage.END_DEVICE_EVENT_DETAIL__NAME:
            return getName();
        case CimPackage.END_DEVICE_EVENT_DETAIL__VALUE:
            return getValue();
        case CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT:
            return getEndDeviceEvent();
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
        case CimPackage.END_DEVICE_EVENT_DETAIL__NAME:
            setName( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT_DETAIL__VALUE:
            setValue( ( StringQuantity ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT:
            setEndDeviceEvent( ( EndDeviceEvent ) newValue );
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
        case CimPackage.END_DEVICE_EVENT_DETAIL__NAME:
            unsetName();
            return;
        case CimPackage.END_DEVICE_EVENT_DETAIL__VALUE:
            unsetValue();
            return;
        case CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT:
            unsetEndDeviceEvent();
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
        case CimPackage.END_DEVICE_EVENT_DETAIL__NAME:
            return isSetName();
        case CimPackage.END_DEVICE_EVENT_DETAIL__VALUE:
            return isSetValue();
        case CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT:
            return isSetEndDeviceEvent();
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
        result.append( " (name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceEventDetailImpl
