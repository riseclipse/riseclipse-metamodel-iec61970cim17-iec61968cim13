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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit;

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
 * An implementation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CommunicationLinkImpl#getRemoteUnits <em>Remote Units</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CommunicationLinkImpl#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationLinkImpl extends PowerSystemResourceImpl implements CommunicationLink {
    /**
     * The cached value of the '{@link #getRemoteUnits() <em>Remote Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteUnits()
     * @generated
     * @ordered
     */
    protected EList< RemoteUnit > remoteUnits;

    /**
     * The cached value of the '{@link #getBilateralExchangeActor() <em>Bilateral Exchange Actor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBilateralExchangeActor()
     * @generated
     * @ordered
     */
    protected BilateralExchangeActor bilateralExchangeActor;

    /**
     * This is true if the Bilateral Exchange Actor reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bilateralExchangeActorESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommunicationLinkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCommunicationLink();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RemoteUnit > getRemoteUnits() {
        if( remoteUnits == null ) {
            remoteUnits = new EObjectWithInverseEList.Unsettable.ManyInverse< RemoteUnit >( RemoteUnit.class, this,
                    CimPackage.COMMUNICATION_LINK__REMOTE_UNITS, CimPackage.REMOTE_UNIT__COMMUNICATION_LINKS );
        }
        return remoteUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemoteUnits() {
        if( remoteUnits != null ) ( ( InternalEList.Unsettable< ? > ) remoteUnits ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteUnits() {
        return remoteUnits != null && ( ( InternalEList.Unsettable< ? > ) remoteUnits ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BilateralExchangeActor getBilateralExchangeActor() {
        return bilateralExchangeActor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBilateralExchangeActor( BilateralExchangeActor newBilateralExchangeActor,
            NotificationChain msgs ) {
        BilateralExchangeActor oldBilateralExchangeActor = bilateralExchangeActor;
        bilateralExchangeActor = newBilateralExchangeActor;
        boolean oldBilateralExchangeActorESet = bilateralExchangeActorESet;
        bilateralExchangeActorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR, oldBilateralExchangeActor,
                    newBilateralExchangeActor, !oldBilateralExchangeActorESet );
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
    public void setBilateralExchangeActor( BilateralExchangeActor newBilateralExchangeActor ) {
        if( newBilateralExchangeActor != bilateralExchangeActor ) {
            NotificationChain msgs = null;
            if( bilateralExchangeActor != null )
                msgs = ( ( InternalEObject ) bilateralExchangeActor ).eInverseRemove( this,
                        CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK, BilateralExchangeActor.class, msgs );
            if( newBilateralExchangeActor != null )
                msgs = ( ( InternalEObject ) newBilateralExchangeActor ).eInverseAdd( this,
                        CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK, BilateralExchangeActor.class, msgs );
            msgs = basicSetBilateralExchangeActor( newBilateralExchangeActor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBilateralExchangeActorESet = bilateralExchangeActorESet;
            bilateralExchangeActorESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR, newBilateralExchangeActor,
                    newBilateralExchangeActor, !oldBilateralExchangeActorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBilateralExchangeActor( NotificationChain msgs ) {
        BilateralExchangeActor oldBilateralExchangeActor = bilateralExchangeActor;
        bilateralExchangeActor = null;
        boolean oldBilateralExchangeActorESet = bilateralExchangeActorESet;
        bilateralExchangeActorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR, oldBilateralExchangeActor, null,
                    oldBilateralExchangeActorESet );
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
    public void unsetBilateralExchangeActor() {
        if( bilateralExchangeActor != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) bilateralExchangeActor ).eInverseRemove( this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK, BilateralExchangeActor.class, msgs );
            msgs = basicUnsetBilateralExchangeActor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBilateralExchangeActorESet = bilateralExchangeActorESet;
            bilateralExchangeActorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR, null, null,
                    oldBilateralExchangeActorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBilateralExchangeActor() {
        return bilateralExchangeActorESet;
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
        case CimPackage.COMMUNICATION_LINK__REMOTE_UNITS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRemoteUnits() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR:
            if( bilateralExchangeActor != null )
                msgs = ( ( InternalEObject ) bilateralExchangeActor ).eInverseRemove( this,
                        CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK, BilateralExchangeActor.class, msgs );
            return basicSetBilateralExchangeActor( ( BilateralExchangeActor ) otherEnd, msgs );
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
        case CimPackage.COMMUNICATION_LINK__REMOTE_UNITS:
            return ( ( InternalEList< ? > ) getRemoteUnits() ).basicRemove( otherEnd, msgs );
        case CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR:
            return basicUnsetBilateralExchangeActor( msgs );
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
        case CimPackage.COMMUNICATION_LINK__REMOTE_UNITS:
            return getRemoteUnits();
        case CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR:
            return getBilateralExchangeActor();
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
        case CimPackage.COMMUNICATION_LINK__REMOTE_UNITS:
            getRemoteUnits().clear();
            getRemoteUnits().addAll( ( Collection< ? extends RemoteUnit > ) newValue );
            return;
        case CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR:
            setBilateralExchangeActor( ( BilateralExchangeActor ) newValue );
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
        case CimPackage.COMMUNICATION_LINK__REMOTE_UNITS:
            unsetRemoteUnits();
            return;
        case CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR:
            unsetBilateralExchangeActor();
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
        case CimPackage.COMMUNICATION_LINK__REMOTE_UNITS:
            return isSetRemoteUnits();
        case CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR:
            return isSetBilateralExchangeActor();
        }
        return super.eIsSet( featureID );
    }

} //CommunicationLinkImpl
