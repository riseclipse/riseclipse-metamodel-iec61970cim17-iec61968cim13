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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcitationLimiterDynamics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overexcitation Limiter Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcitationLimiterDynamicsImpl#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverexcitationLimiterDynamicsImpl extends DynamicsFunctionBlockImpl
        implements OverexcitationLimiterDynamics {
    /**
     * The cached value of the '{@link #getExcitationSystemDynamics() <em>Excitation System Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExcitationSystemDynamics()
     * @generated
     * @ordered
     */
    protected ExcitationSystemDynamics excitationSystemDynamics;

    /**
     * This is true if the Excitation System Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean excitationSystemDynamicsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OverexcitationLimiterDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOverexcitationLimiterDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcitationSystemDynamics getExcitationSystemDynamics() {
        return excitationSystemDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExcitationSystemDynamics( ExcitationSystemDynamics newExcitationSystemDynamics,
            NotificationChain msgs ) {
        ExcitationSystemDynamics oldExcitationSystemDynamics = excitationSystemDynamics;
        excitationSystemDynamics = newExcitationSystemDynamics;
        boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
        excitationSystemDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, oldExcitationSystemDynamics,
                    newExcitationSystemDynamics, !oldExcitationSystemDynamicsESet );
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
    public void setExcitationSystemDynamics( ExcitationSystemDynamics newExcitationSystemDynamics ) {
        if( newExcitationSystemDynamics != excitationSystemDynamics ) {
            NotificationChain msgs = null;
            if( excitationSystemDynamics != null )
                msgs = ( ( InternalEObject ) excitationSystemDynamics ).eInverseRemove( this,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            if( newExcitationSystemDynamics != null )
                msgs = ( ( InternalEObject ) newExcitationSystemDynamics ).eInverseAdd( this,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            msgs = basicSetExcitationSystemDynamics( newExcitationSystemDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
            excitationSystemDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, newExcitationSystemDynamics,
                    newExcitationSystemDynamics, !oldExcitationSystemDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetExcitationSystemDynamics( NotificationChain msgs ) {
        ExcitationSystemDynamics oldExcitationSystemDynamics = excitationSystemDynamics;
        excitationSystemDynamics = null;
        boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
        excitationSystemDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, oldExcitationSystemDynamics,
                    null, oldExcitationSystemDynamicsESet );
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
    public void unsetExcitationSystemDynamics() {
        if( excitationSystemDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) excitationSystemDynamics ).eInverseRemove( this,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS,
                    ExcitationSystemDynamics.class, msgs );
            msgs = basicUnsetExcitationSystemDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
            excitationSystemDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, null, null,
                    oldExcitationSystemDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExcitationSystemDynamics() {
        return excitationSystemDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            if( excitationSystemDynamics != null )
                msgs = ( ( InternalEObject ) excitationSystemDynamics ).eInverseRemove( this,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            return basicSetExcitationSystemDynamics( ( ExcitationSystemDynamics ) otherEnd, msgs );
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
        case CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            return basicUnsetExcitationSystemDynamics( msgs );
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
        case CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            return getExcitationSystemDynamics();
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
        case CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            setExcitationSystemDynamics( ( ExcitationSystemDynamics ) newValue );
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
        case CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            unsetExcitationSystemDynamics();
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
        case CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            return isSetExcitationSystemDynamics();
        }
        return super.eIsSet( featureID );
    }

} //OverexcitationLimiterDynamicsImpl
