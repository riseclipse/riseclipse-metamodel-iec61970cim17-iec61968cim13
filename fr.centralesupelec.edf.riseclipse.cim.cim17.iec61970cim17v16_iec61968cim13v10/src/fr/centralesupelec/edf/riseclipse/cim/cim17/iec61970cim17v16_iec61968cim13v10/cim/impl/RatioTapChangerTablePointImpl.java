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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTable;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTablePoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio Tap Changer Table Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RatioTapChangerTablePointImpl#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatioTapChangerTablePointImpl extends TapChangerTablePointImpl implements RatioTapChangerTablePoint {
    /**
     * The cached value of the '{@link #getRatioTapChangerTable() <em>Ratio Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatioTapChangerTable()
     * @generated
     * @ordered
     */
    protected RatioTapChangerTable ratioTapChangerTable;

    /**
     * This is true if the Ratio Tap Changer Table reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratioTapChangerTableESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RatioTapChangerTablePointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRatioTapChangerTablePoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RatioTapChangerTable getRatioTapChangerTable() {
        return ratioTapChangerTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRatioTapChangerTable( RatioTapChangerTable newRatioTapChangerTable,
            NotificationChain msgs ) {
        RatioTapChangerTable oldRatioTapChangerTable = ratioTapChangerTable;
        ratioTapChangerTable = newRatioTapChangerTable;
        boolean oldRatioTapChangerTableESet = ratioTapChangerTableESet;
        ratioTapChangerTableESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE, oldRatioTapChangerTable,
                    newRatioTapChangerTable, !oldRatioTapChangerTableESet );
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
    public void setRatioTapChangerTable( RatioTapChangerTable newRatioTapChangerTable ) {
        if( newRatioTapChangerTable != ratioTapChangerTable ) {
            NotificationChain msgs = null;
            if( ratioTapChangerTable != null ) msgs = ( ( InternalEObject ) ratioTapChangerTable ).eInverseRemove( this,
                    CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT, RatioTapChangerTable.class,
                    msgs );
            if( newRatioTapChangerTable != null )
                msgs = ( ( InternalEObject ) newRatioTapChangerTable ).eInverseAdd( this,
                        CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT, RatioTapChangerTable.class,
                        msgs );
            msgs = basicSetRatioTapChangerTable( newRatioTapChangerTable, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRatioTapChangerTableESet = ratioTapChangerTableESet;
            ratioTapChangerTableESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE, newRatioTapChangerTable,
                    newRatioTapChangerTable, !oldRatioTapChangerTableESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRatioTapChangerTable( NotificationChain msgs ) {
        RatioTapChangerTable oldRatioTapChangerTable = ratioTapChangerTable;
        ratioTapChangerTable = null;
        boolean oldRatioTapChangerTableESet = ratioTapChangerTableESet;
        ratioTapChangerTableESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE, oldRatioTapChangerTable, null,
                    oldRatioTapChangerTableESet );
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
    public void unsetRatioTapChangerTable() {
        if( ratioTapChangerTable != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) ratioTapChangerTable ).eInverseRemove( this,
                    CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT, RatioTapChangerTable.class,
                    msgs );
            msgs = basicUnsetRatioTapChangerTable( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRatioTapChangerTableESet = ratioTapChangerTableESet;
            ratioTapChangerTableESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE, null, null,
                    oldRatioTapChangerTableESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatioTapChangerTable() {
        return ratioTapChangerTableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE:
            if( ratioTapChangerTable != null ) msgs = ( ( InternalEObject ) ratioTapChangerTable ).eInverseRemove( this,
                    CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT, RatioTapChangerTable.class,
                    msgs );
            return basicSetRatioTapChangerTable( ( RatioTapChangerTable ) otherEnd, msgs );
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE:
            return basicUnsetRatioTapChangerTable( msgs );
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE:
            return getRatioTapChangerTable();
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE:
            setRatioTapChangerTable( ( RatioTapChangerTable ) newValue );
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE:
            unsetRatioTapChangerTable();
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE:
            return isSetRatioTapChangerTable();
        }
        return super.eIsSet( featureID );
    }

} //RatioTapChangerTablePointImpl
