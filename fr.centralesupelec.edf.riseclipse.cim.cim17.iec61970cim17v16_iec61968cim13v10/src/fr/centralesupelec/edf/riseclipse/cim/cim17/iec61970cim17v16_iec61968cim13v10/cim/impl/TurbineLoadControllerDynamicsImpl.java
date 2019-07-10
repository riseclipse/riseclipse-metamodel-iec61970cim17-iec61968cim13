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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineGovernorDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineLoadControllerDynamics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turbine Load Controller Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbineLoadControllerDynamicsImpl#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurbineLoadControllerDynamicsImpl extends DynamicsFunctionBlockImpl
        implements TurbineLoadControllerDynamics {
    /**
     * The cached value of the '{@link #getTurbineGovernorDynamics() <em>Turbine Governor Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineGovernorDynamics()
     * @generated
     * @ordered
     */
    protected TurbineGovernorDynamics turbineGovernorDynamics;

    /**
     * This is true if the Turbine Governor Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean turbineGovernorDynamicsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TurbineLoadControllerDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTurbineLoadControllerDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineGovernorDynamics getTurbineGovernorDynamics() {
        return turbineGovernorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTurbineGovernorDynamics( TurbineGovernorDynamics newTurbineGovernorDynamics,
            NotificationChain msgs ) {
        TurbineGovernorDynamics oldTurbineGovernorDynamics = turbineGovernorDynamics;
        turbineGovernorDynamics = newTurbineGovernorDynamics;
        boolean oldTurbineGovernorDynamicsESet = turbineGovernorDynamicsESet;
        turbineGovernorDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS, oldTurbineGovernorDynamics,
                    newTurbineGovernorDynamics, !oldTurbineGovernorDynamicsESet );
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
    public void setTurbineGovernorDynamics( TurbineGovernorDynamics newTurbineGovernorDynamics ) {
        if( newTurbineGovernorDynamics != turbineGovernorDynamics ) {
            NotificationChain msgs = null;
            if( turbineGovernorDynamics != null )
                msgs = ( ( InternalEObject ) turbineGovernorDynamics ).eInverseRemove( this,
                        CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS,
                        TurbineGovernorDynamics.class, msgs );
            if( newTurbineGovernorDynamics != null )
                msgs = ( ( InternalEObject ) newTurbineGovernorDynamics ).eInverseAdd( this,
                        CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS,
                        TurbineGovernorDynamics.class, msgs );
            msgs = basicSetTurbineGovernorDynamics( newTurbineGovernorDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTurbineGovernorDynamicsESet = turbineGovernorDynamicsESet;
            turbineGovernorDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS, newTurbineGovernorDynamics,
                    newTurbineGovernorDynamics, !oldTurbineGovernorDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTurbineGovernorDynamics( NotificationChain msgs ) {
        TurbineGovernorDynamics oldTurbineGovernorDynamics = turbineGovernorDynamics;
        turbineGovernorDynamics = null;
        boolean oldTurbineGovernorDynamicsESet = turbineGovernorDynamicsESet;
        turbineGovernorDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS, oldTurbineGovernorDynamics,
                    null, oldTurbineGovernorDynamicsESet );
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
    public void unsetTurbineGovernorDynamics() {
        if( turbineGovernorDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) turbineGovernorDynamics ).eInverseRemove( this,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS,
                    TurbineGovernorDynamics.class, msgs );
            msgs = basicUnsetTurbineGovernorDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTurbineGovernorDynamicsESet = turbineGovernorDynamicsESet;
            turbineGovernorDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS, null, null,
                    oldTurbineGovernorDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTurbineGovernorDynamics() {
        return turbineGovernorDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            if( turbineGovernorDynamics != null )
                msgs = ( ( InternalEObject ) turbineGovernorDynamics ).eInverseRemove( this,
                        CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS,
                        TurbineGovernorDynamics.class, msgs );
            return basicSetTurbineGovernorDynamics( ( TurbineGovernorDynamics ) otherEnd, msgs );
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
        case CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return basicUnsetTurbineGovernorDynamics( msgs );
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
        case CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return getTurbineGovernorDynamics();
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
        case CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            setTurbineGovernorDynamics( ( TurbineGovernorDynamics ) newValue );
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
        case CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            unsetTurbineGovernorDynamics();
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
        case CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return isSetTurbineGovernorDynamics();
        }
        return super.eIsSet( featureID );
    }

} //TurbineLoadControllerDynamicsImpl
