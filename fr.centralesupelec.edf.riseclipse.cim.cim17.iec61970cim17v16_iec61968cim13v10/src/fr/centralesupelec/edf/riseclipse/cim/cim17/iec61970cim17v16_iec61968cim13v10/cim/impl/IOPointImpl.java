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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPointSource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint;

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
 * An implementation of the model object '<em><b>IO Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IOPointImpl#getIOPointSource <em>IO Point Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IOPointImpl#getBilateralToIOPoint <em>Bilateral To IO Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IOPointImpl extends IdentifiedObjectImpl implements IOPoint {
    /**
     * The cached value of the '{@link #getIOPointSource() <em>IO Point Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIOPointSource()
     * @generated
     * @ordered
     */
    protected IOPointSource ioPointSource;

    /**
     * This is true if the IO Point Source reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ioPointSourceESet;

    /**
     * The cached value of the '{@link #getBilateralToIOPoint() <em>Bilateral To IO Point</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBilateralToIOPoint()
     * @generated
     * @ordered
     */
    protected EList< ProvidedBilateralPoint > bilateralToIOPoint;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IOPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getIOPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IOPointSource getIOPointSource() {
        return ioPointSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIOPointSource( IOPointSource newIOPointSource, NotificationChain msgs ) {
        IOPointSource oldIOPointSource = ioPointSource;
        ioPointSource = newIOPointSource;
        boolean oldIOPointSourceESet = ioPointSourceESet;
        ioPointSourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.IO_POINT__IO_POINT_SOURCE, oldIOPointSource, newIOPointSource, !oldIOPointSourceESet );
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
    public void setIOPointSource( IOPointSource newIOPointSource ) {
        if( newIOPointSource != ioPointSource ) {
            NotificationChain msgs = null;
            if( ioPointSource != null ) msgs = ( ( InternalEObject ) ioPointSource ).eInverseRemove( this,
                    CimPackage.IO_POINT_SOURCE__IO_POINT, IOPointSource.class, msgs );
            if( newIOPointSource != null ) msgs = ( ( InternalEObject ) newIOPointSource ).eInverseAdd( this,
                    CimPackage.IO_POINT_SOURCE__IO_POINT, IOPointSource.class, msgs );
            msgs = basicSetIOPointSource( newIOPointSource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIOPointSourceESet = ioPointSourceESet;
            ioPointSourceESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.IO_POINT__IO_POINT_SOURCE, newIOPointSource, newIOPointSource, !oldIOPointSourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIOPointSource( NotificationChain msgs ) {
        IOPointSource oldIOPointSource = ioPointSource;
        ioPointSource = null;
        boolean oldIOPointSourceESet = ioPointSourceESet;
        ioPointSourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.IO_POINT__IO_POINT_SOURCE, oldIOPointSource, null, oldIOPointSourceESet );
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
    public void unsetIOPointSource() {
        if( ioPointSource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) ioPointSource ).eInverseRemove( this, CimPackage.IO_POINT_SOURCE__IO_POINT,
                    IOPointSource.class, msgs );
            msgs = basicUnsetIOPointSource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIOPointSourceESet = ioPointSourceESet;
            ioPointSourceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.IO_POINT__IO_POINT_SOURCE, null, null, oldIOPointSourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIOPointSource() {
        return ioPointSourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProvidedBilateralPoint > getBilateralToIOPoint() {
        if( bilateralToIOPoint == null ) {
            bilateralToIOPoint = new EObjectWithInverseResolvingEList.Unsettable< ProvidedBilateralPoint >(
                    ProvidedBilateralPoint.class, this, CimPackage.IO_POINT__BILATERAL_TO_IO_POINT,
                    CimPackage.PROVIDED_BILATERAL_POINT__IO_POINT );
        }
        return bilateralToIOPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBilateralToIOPoint() {
        if( bilateralToIOPoint != null ) ( ( InternalEList.Unsettable< ? > ) bilateralToIOPoint ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBilateralToIOPoint() {
        return bilateralToIOPoint != null && ( ( InternalEList.Unsettable< ? > ) bilateralToIOPoint ).isSet();
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
        case CimPackage.IO_POINT__IO_POINT_SOURCE:
            if( ioPointSource != null ) msgs = ( ( InternalEObject ) ioPointSource ).eInverseRemove( this,
                    CimPackage.IO_POINT_SOURCE__IO_POINT, IOPointSource.class, msgs );
            return basicSetIOPointSource( ( IOPointSource ) otherEnd, msgs );
        case CimPackage.IO_POINT__BILATERAL_TO_IO_POINT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBilateralToIOPoint() )
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
        case CimPackage.IO_POINT__IO_POINT_SOURCE:
            return basicUnsetIOPointSource( msgs );
        case CimPackage.IO_POINT__BILATERAL_TO_IO_POINT:
            return ( ( InternalEList< ? > ) getBilateralToIOPoint() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.IO_POINT__IO_POINT_SOURCE:
            return getIOPointSource();
        case CimPackage.IO_POINT__BILATERAL_TO_IO_POINT:
            return getBilateralToIOPoint();
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
        case CimPackage.IO_POINT__IO_POINT_SOURCE:
            setIOPointSource( ( IOPointSource ) newValue );
            return;
        case CimPackage.IO_POINT__BILATERAL_TO_IO_POINT:
            getBilateralToIOPoint().clear();
            getBilateralToIOPoint().addAll( ( Collection< ? extends ProvidedBilateralPoint > ) newValue );
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
        case CimPackage.IO_POINT__IO_POINT_SOURCE:
            unsetIOPointSource();
            return;
        case CimPackage.IO_POINT__BILATERAL_TO_IO_POINT:
            unsetBilateralToIOPoint();
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
        case CimPackage.IO_POINT__IO_POINT_SOURCE:
            return isSetIOPointSource();
        case CimPackage.IO_POINT__BILATERAL_TO_IO_POINT:
            return isSetBilateralToIOPoint();
        }
        return super.eIsSet( featureID );
    }

} //IOPointImpl
