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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType1Dynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageAdjusterDynamics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voltage Adjuster Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VoltageAdjusterDynamicsImpl#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoltageAdjusterDynamicsImpl extends DynamicsFunctionBlockImpl implements VoltageAdjusterDynamics {
    /**
     * The cached value of the '{@link #getPFVArControllerType1Dynamics() <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPFVArControllerType1Dynamics()
     * @generated
     * @ordered
     */
    protected PFVArControllerType1Dynamics pfvArControllerType1Dynamics;

    /**
     * This is true if the PFV Ar Controller Type1 Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pfvArControllerType1DynamicsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VoltageAdjusterDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVoltageAdjusterDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType1Dynamics getPFVArControllerType1Dynamics() {
        if( pfvArControllerType1Dynamics != null && pfvArControllerType1Dynamics.eIsProxy() ) {
            InternalEObject oldPFVArControllerType1Dynamics = ( InternalEObject ) pfvArControllerType1Dynamics;
            pfvArControllerType1Dynamics = ( PFVArControllerType1Dynamics ) eResolveProxy(
                    oldPFVArControllerType1Dynamics );
            if( pfvArControllerType1Dynamics != oldPFVArControllerType1Dynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS,
                        oldPFVArControllerType1Dynamics, pfvArControllerType1Dynamics ) );
            }
        }
        return pfvArControllerType1Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PFVArControllerType1Dynamics basicGetPFVArControllerType1Dynamics() {
        return pfvArControllerType1Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPFVArControllerType1Dynamics(
            PFVArControllerType1Dynamics newPFVArControllerType1Dynamics, NotificationChain msgs ) {
        PFVArControllerType1Dynamics oldPFVArControllerType1Dynamics = pfvArControllerType1Dynamics;
        pfvArControllerType1Dynamics = newPFVArControllerType1Dynamics;
        boolean oldPFVArControllerType1DynamicsESet = pfvArControllerType1DynamicsESet;
        pfvArControllerType1DynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS,
                    oldPFVArControllerType1Dynamics, newPFVArControllerType1Dynamics,
                    !oldPFVArControllerType1DynamicsESet );
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
    public void setPFVArControllerType1Dynamics( PFVArControllerType1Dynamics newPFVArControllerType1Dynamics ) {
        if( newPFVArControllerType1Dynamics != pfvArControllerType1Dynamics ) {
            NotificationChain msgs = null;
            if( pfvArControllerType1Dynamics != null )
                msgs = ( ( InternalEObject ) pfvArControllerType1Dynamics ).eInverseRemove( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__VOLTAGE_ADJUSTER_DYNAMICS,
                        PFVArControllerType1Dynamics.class, msgs );
            if( newPFVArControllerType1Dynamics != null )
                msgs = ( ( InternalEObject ) newPFVArControllerType1Dynamics ).eInverseAdd( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__VOLTAGE_ADJUSTER_DYNAMICS,
                        PFVArControllerType1Dynamics.class, msgs );
            msgs = basicSetPFVArControllerType1Dynamics( newPFVArControllerType1Dynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType1DynamicsESet = pfvArControllerType1DynamicsESet;
            pfvArControllerType1DynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS,
                    newPFVArControllerType1Dynamics, newPFVArControllerType1Dynamics,
                    !oldPFVArControllerType1DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPFVArControllerType1Dynamics( NotificationChain msgs ) {
        PFVArControllerType1Dynamics oldPFVArControllerType1Dynamics = pfvArControllerType1Dynamics;
        pfvArControllerType1Dynamics = null;
        boolean oldPFVArControllerType1DynamicsESet = pfvArControllerType1DynamicsESet;
        pfvArControllerType1DynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS,
                    oldPFVArControllerType1Dynamics, null, oldPFVArControllerType1DynamicsESet );
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
    public void unsetPFVArControllerType1Dynamics() {
        if( pfvArControllerType1Dynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) pfvArControllerType1Dynamics ).eInverseRemove( this,
                    CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__VOLTAGE_ADJUSTER_DYNAMICS,
                    PFVArControllerType1Dynamics.class, msgs );
            msgs = basicUnsetPFVArControllerType1Dynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType1DynamicsESet = pfvArControllerType1DynamicsESet;
            pfvArControllerType1DynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS, null, null,
                    oldPFVArControllerType1DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPFVArControllerType1Dynamics() {
        return pfvArControllerType1DynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            if( pfvArControllerType1Dynamics != null )
                msgs = ( ( InternalEObject ) pfvArControllerType1Dynamics ).eInverseRemove( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__VOLTAGE_ADJUSTER_DYNAMICS,
                        PFVArControllerType1Dynamics.class, msgs );
            return basicSetPFVArControllerType1Dynamics( ( PFVArControllerType1Dynamics ) otherEnd, msgs );
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
        case CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            return basicUnsetPFVArControllerType1Dynamics( msgs );
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
        case CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            if( resolve ) return getPFVArControllerType1Dynamics();
            return basicGetPFVArControllerType1Dynamics();
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
        case CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            setPFVArControllerType1Dynamics( ( PFVArControllerType1Dynamics ) newValue );
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
        case CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            unsetPFVArControllerType1Dynamics();
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
        case CimPackage.VOLTAGE_ADJUSTER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            return isSetPFVArControllerType1Dynamics();
        }
        return super.eIsSet( featureID );
    }

} //VoltageAdjusterDynamicsImpl
