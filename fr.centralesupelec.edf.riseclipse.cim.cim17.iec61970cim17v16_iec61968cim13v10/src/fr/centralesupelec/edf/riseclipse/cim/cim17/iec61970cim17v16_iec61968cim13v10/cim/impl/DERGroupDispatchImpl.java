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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERCapabilities;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup;

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
 * An implementation of the model object '<em><b>DER Group Dispatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupDispatchImpl#getDERCapabilities <em>DER Capabilities</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERGroupDispatchImpl#getEndDeviceGroup <em>End Device Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DERGroupDispatchImpl extends IdentifiedObjectImpl implements DERGroupDispatch {
    /**
     * The cached value of the '{@link #getDERCapabilities() <em>DER Capabilities</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDERCapabilities()
     * @generated
     * @ordered
     */
    protected DERCapabilities derCapabilities;

    /**
     * This is true if the DER Capabilities reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean derCapabilitiesESet;

    /**
     * The cached value of the '{@link #getEndDeviceGroup() <em>End Device Group</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceGroup()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceGroup > endDeviceGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DERGroupDispatchImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDERGroupDispatch();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DERCapabilities getDERCapabilities() {
        return derCapabilities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDERCapabilities( DERCapabilities newDERCapabilities, NotificationChain msgs ) {
        DERCapabilities oldDERCapabilities = derCapabilities;
        derCapabilities = newDERCapabilities;
        boolean oldDERCapabilitiesESet = derCapabilitiesESet;
        derCapabilitiesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES, oldDERCapabilities, newDERCapabilities,
                    !oldDERCapabilitiesESet );
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
    public void setDERCapabilities( DERCapabilities newDERCapabilities ) {
        if( newDERCapabilities != derCapabilities ) {
            NotificationChain msgs = null;
            if( derCapabilities != null ) msgs = ( ( InternalEObject ) derCapabilities ).eInverseRemove( this,
                    CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH, DERCapabilities.class, msgs );
            if( newDERCapabilities != null ) msgs = ( ( InternalEObject ) newDERCapabilities ).eInverseAdd( this,
                    CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH, DERCapabilities.class, msgs );
            msgs = basicSetDERCapabilities( newDERCapabilities, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDERCapabilitiesESet = derCapabilitiesESet;
            derCapabilitiesESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES,
                        newDERCapabilities, newDERCapabilities, !oldDERCapabilitiesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDERCapabilities( NotificationChain msgs ) {
        DERCapabilities oldDERCapabilities = derCapabilities;
        derCapabilities = null;
        boolean oldDERCapabilitiesESet = derCapabilitiesESet;
        derCapabilitiesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES, oldDERCapabilities, null, oldDERCapabilitiesESet );
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
    public void unsetDERCapabilities() {
        if( derCapabilities != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) derCapabilities ).eInverseRemove( this,
                    CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH, DERCapabilities.class, msgs );
            msgs = basicUnsetDERCapabilities( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDERCapabilitiesESet = derCapabilitiesESet;
            derCapabilitiesESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES, null, null, oldDERCapabilitiesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDERCapabilities() {
        return derCapabilitiesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceGroup > getEndDeviceGroup() {
        if( endDeviceGroup == null ) {
            endDeviceGroup = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< EndDeviceGroup >(
                    EndDeviceGroup.class, this, CimPackage.DER_GROUP_DISPATCH__END_DEVICE_GROUP,
                    CimPackage.END_DEVICE_GROUP__DER_GROUP_DISPATCH );
        }
        return endDeviceGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceGroup() {
        if( endDeviceGroup != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceGroup ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceGroup() {
        return endDeviceGroup != null && ( ( InternalEList.Unsettable< ? > ) endDeviceGroup ).isSet();
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
        case CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES:
            if( derCapabilities != null ) msgs = ( ( InternalEObject ) derCapabilities ).eInverseRemove( this,
                    CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH, DERCapabilities.class, msgs );
            return basicSetDERCapabilities( ( DERCapabilities ) otherEnd, msgs );
        case CimPackage.DER_GROUP_DISPATCH__END_DEVICE_GROUP:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceGroup() )
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
        case CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES:
            return basicUnsetDERCapabilities( msgs );
        case CimPackage.DER_GROUP_DISPATCH__END_DEVICE_GROUP:
            return ( ( InternalEList< ? > ) getEndDeviceGroup() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES:
            return getDERCapabilities();
        case CimPackage.DER_GROUP_DISPATCH__END_DEVICE_GROUP:
            return getEndDeviceGroup();
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
        case CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES:
            setDERCapabilities( ( DERCapabilities ) newValue );
            return;
        case CimPackage.DER_GROUP_DISPATCH__END_DEVICE_GROUP:
            getEndDeviceGroup().clear();
            getEndDeviceGroup().addAll( ( Collection< ? extends EndDeviceGroup > ) newValue );
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
        case CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES:
            unsetDERCapabilities();
            return;
        case CimPackage.DER_GROUP_DISPATCH__END_DEVICE_GROUP:
            unsetEndDeviceGroup();
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
        case CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES:
            return isSetDERCapabilities();
        case CimPackage.DER_GROUP_DISPATCH__END_DEVICE_GROUP:
            return isSetEndDeviceGroup();
        }
        return super.eIsSet( featureID );
    }

} //DERGroupDispatchImpl
