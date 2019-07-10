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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LevelVsVolumeCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Vs Volume Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LevelVsVolumeCurveImpl#getReservoir <em>Reservoir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelVsVolumeCurveImpl extends CurveImpl implements LevelVsVolumeCurve {
    /**
     * The cached value of the '{@link #getReservoir() <em>Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReservoir()
     * @generated
     * @ordered
     */
    protected Reservoir reservoir;

    /**
     * This is true if the Reservoir reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reservoirESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LevelVsVolumeCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLevelVsVolumeCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Reservoir getReservoir() {
        return reservoir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReservoir( Reservoir newReservoir, NotificationChain msgs ) {
        Reservoir oldReservoir = reservoir;
        reservoir = newReservoir;
        boolean oldReservoirESet = reservoirESet;
        reservoirESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR, oldReservoir, newReservoir, !oldReservoirESet );
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
    public void setReservoir( Reservoir newReservoir ) {
        if( newReservoir != reservoir ) {
            NotificationChain msgs = null;
            if( reservoir != null ) msgs = ( ( InternalEObject ) reservoir ).eInverseRemove( this,
                    CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES, Reservoir.class, msgs );
            if( newReservoir != null ) msgs = ( ( InternalEObject ) newReservoir ).eInverseAdd( this,
                    CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES, Reservoir.class, msgs );
            msgs = basicSetReservoir( newReservoir, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReservoirESet = reservoirESet;
            reservoirESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR, newReservoir, newReservoir, !oldReservoirESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReservoir( NotificationChain msgs ) {
        Reservoir oldReservoir = reservoir;
        reservoir = null;
        boolean oldReservoirESet = reservoirESet;
        reservoirESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR, oldReservoir, null, oldReservoirESet );
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
    public void unsetReservoir() {
        if( reservoir != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) reservoir ).eInverseRemove( this, CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES,
                    Reservoir.class, msgs );
            msgs = basicUnsetReservoir( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReservoirESet = reservoirESet;
            reservoirESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR, null, null, oldReservoirESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReservoir() {
        return reservoirESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
            if( reservoir != null ) msgs = ( ( InternalEObject ) reservoir ).eInverseRemove( this,
                    CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES, Reservoir.class, msgs );
            return basicSetReservoir( ( Reservoir ) otherEnd, msgs );
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
        case CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
            return basicUnsetReservoir( msgs );
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
        case CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
            return getReservoir();
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
        case CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
            setReservoir( ( Reservoir ) newValue );
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
        case CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
            unsetReservoir();
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
        case CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
            return isSetReservoir();
        }
        return super.eIsSet( featureID );
    }

} //LevelVsVolumeCurveImpl
