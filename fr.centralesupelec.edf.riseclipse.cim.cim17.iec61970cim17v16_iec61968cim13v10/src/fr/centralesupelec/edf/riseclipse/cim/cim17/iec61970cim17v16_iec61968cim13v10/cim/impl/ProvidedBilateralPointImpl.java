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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Bilateral Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProvidedBilateralPointImpl#getIOPoint <em>IO Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProvidedBilateralPointImpl#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedBilateralPointImpl extends IdentifiedObjectImpl implements ProvidedBilateralPoint {
    /**
     * The cached value of the '{@link #getIOPoint() <em>IO Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIOPoint()
     * @generated
     * @ordered
     */
    protected IOPoint ioPoint;

    /**
     * This is true if the IO Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ioPointESet;

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
    protected ProvidedBilateralPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getProvidedBilateralPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IOPoint getIOPoint() {
        return ioPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIOPoint( IOPoint newIOPoint, NotificationChain msgs ) {
        IOPoint oldIOPoint = ioPoint;
        ioPoint = newIOPoint;
        boolean oldIOPointESet = ioPointESet;
        ioPointESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT, oldIOPoint, newIOPoint, !oldIOPointESet );
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
    public void setIOPoint( IOPoint newIOPoint ) {
        if( newIOPoint != ioPoint ) {
            NotificationChain msgs = null;
            if( ioPoint != null ) msgs = ( ( InternalEObject ) ioPoint ).eInverseRemove( this,
                    CimPackage.IO_POINT__BILATERAL_TO_IO_POINT, IOPoint.class, msgs );
            if( newIOPoint != null ) msgs = ( ( InternalEObject ) newIOPoint ).eInverseAdd( this,
                    CimPackage.IO_POINT__BILATERAL_TO_IO_POINT, IOPoint.class, msgs );
            msgs = basicSetIOPoint( newIOPoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIOPointESet = ioPointESet;
            ioPointESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT, newIOPoint, newIOPoint, !oldIOPointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIOPoint( NotificationChain msgs ) {
        IOPoint oldIOPoint = ioPoint;
        ioPoint = null;
        boolean oldIOPointESet = ioPointESet;
        ioPointESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT, oldIOPoint, null, oldIOPointESet );
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
    public void unsetIOPoint() {
        if( ioPoint != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) ioPoint ).eInverseRemove( this, CimPackage.IO_POINT__BILATERAL_TO_IO_POINT,
                    IOPoint.class, msgs );
            msgs = basicUnsetIOPoint( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIOPointESet = ioPointESet;
            ioPointESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT, null, null, oldIOPointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIOPoint() {
        return ioPointESet;
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
                    CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR, oldBilateralExchangeActor,
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
                        CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT, BilateralExchangeActor.class,
                        msgs );
            if( newBilateralExchangeActor != null )
                msgs = ( ( InternalEObject ) newBilateralExchangeActor ).eInverseAdd( this,
                        CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT, BilateralExchangeActor.class,
                        msgs );
            msgs = basicSetBilateralExchangeActor( newBilateralExchangeActor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBilateralExchangeActorESet = bilateralExchangeActorESet;
            bilateralExchangeActorESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR, newBilateralExchangeActor,
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
                    CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR, oldBilateralExchangeActor, null,
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
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT, BilateralExchangeActor.class,
                    msgs );
            msgs = basicUnsetBilateralExchangeActor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBilateralExchangeActorESet = bilateralExchangeActorESet;
            bilateralExchangeActorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR, null, null,
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
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT:
            if( ioPoint != null ) msgs = ( ( InternalEObject ) ioPoint ).eInverseRemove( this,
                    CimPackage.IO_POINT__BILATERAL_TO_IO_POINT, IOPoint.class, msgs );
            return basicSetIOPoint( ( IOPoint ) otherEnd, msgs );
        case CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR:
            if( bilateralExchangeActor != null )
                msgs = ( ( InternalEObject ) bilateralExchangeActor ).eInverseRemove( this,
                        CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT, BilateralExchangeActor.class,
                        msgs );
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
        case CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT:
            return basicUnsetIOPoint( msgs );
        case CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR:
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
        case CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT:
            return getIOPoint();
        case CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR:
            return getBilateralExchangeActor();
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
        case CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT:
            setIOPoint( ( IOPoint ) newValue );
            return;
        case CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR:
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
        case CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT:
            unsetIOPoint();
            return;
        case CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR:
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
        case CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT:
            return isSetIOPoint();
        case CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR:
            return isSetBilateralExchangeActor();
        }
        return super.eIsSet( featureID );
    }

} //ProvidedBilateralPointImpl
