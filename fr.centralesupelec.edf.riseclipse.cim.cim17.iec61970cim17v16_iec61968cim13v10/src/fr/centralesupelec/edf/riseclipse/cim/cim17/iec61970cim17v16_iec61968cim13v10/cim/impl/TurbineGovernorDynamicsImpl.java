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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineGovernorDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineLoadControllerDynamics;

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
 * An implementation of the model object '<em><b>Turbine Governor Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbineGovernorDynamicsImpl#getTurbineLoadControllerDynamics <em>Turbine Load Controller Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbineGovernorDynamicsImpl#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbineGovernorDynamicsImpl#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurbineGovernorDynamicsImpl extends DynamicsFunctionBlockImpl implements TurbineGovernorDynamics {
    /**
     * The cached value of the '{@link #getTurbineLoadControllerDynamics() <em>Turbine Load Controller Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineLoadControllerDynamics()
     * @generated
     * @ordered
     */
    protected TurbineLoadControllerDynamics turbineLoadControllerDynamics;

    /**
     * This is true if the Turbine Load Controller Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean turbineLoadControllerDynamicsESet;

    /**
     * The cached value of the '{@link #getAsynchronousMachineDynamics() <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected AsynchronousMachineDynamics asynchronousMachineDynamics;

    /**
     * This is true if the Asynchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asynchronousMachineDynamicsESet;

    /**
     * The cached value of the '{@link #getSynchronousMachineDynamics() <em>Synchronous Machine Dynamics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected EList< SynchronousMachineDynamics > synchronousMachineDynamics;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TurbineGovernorDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTurbineGovernorDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineLoadControllerDynamics getTurbineLoadControllerDynamics() {
        if( turbineLoadControllerDynamics != null && turbineLoadControllerDynamics.eIsProxy() ) {
            InternalEObject oldTurbineLoadControllerDynamics = ( InternalEObject ) turbineLoadControllerDynamics;
            turbineLoadControllerDynamics = ( TurbineLoadControllerDynamics ) eResolveProxy(
                    oldTurbineLoadControllerDynamics );
            if( turbineLoadControllerDynamics != oldTurbineLoadControllerDynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS,
                        oldTurbineLoadControllerDynamics, turbineLoadControllerDynamics ) );
            }
        }
        return turbineLoadControllerDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TurbineLoadControllerDynamics basicGetTurbineLoadControllerDynamics() {
        return turbineLoadControllerDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTurbineLoadControllerDynamics(
            TurbineLoadControllerDynamics newTurbineLoadControllerDynamics, NotificationChain msgs ) {
        TurbineLoadControllerDynamics oldTurbineLoadControllerDynamics = turbineLoadControllerDynamics;
        turbineLoadControllerDynamics = newTurbineLoadControllerDynamics;
        boolean oldTurbineLoadControllerDynamicsESet = turbineLoadControllerDynamicsESet;
        turbineLoadControllerDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS,
                    oldTurbineLoadControllerDynamics, newTurbineLoadControllerDynamics,
                    !oldTurbineLoadControllerDynamicsESet );
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
    public void setTurbineLoadControllerDynamics( TurbineLoadControllerDynamics newTurbineLoadControllerDynamics ) {
        if( newTurbineLoadControllerDynamics != turbineLoadControllerDynamics ) {
            NotificationChain msgs = null;
            if( turbineLoadControllerDynamics != null )
                msgs = ( ( InternalEObject ) turbineLoadControllerDynamics ).eInverseRemove( this,
                        CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS,
                        TurbineLoadControllerDynamics.class, msgs );
            if( newTurbineLoadControllerDynamics != null )
                msgs = ( ( InternalEObject ) newTurbineLoadControllerDynamics ).eInverseAdd( this,
                        CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS,
                        TurbineLoadControllerDynamics.class, msgs );
            msgs = basicSetTurbineLoadControllerDynamics( newTurbineLoadControllerDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTurbineLoadControllerDynamicsESet = turbineLoadControllerDynamicsESet;
            turbineLoadControllerDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS,
                    newTurbineLoadControllerDynamics, newTurbineLoadControllerDynamics,
                    !oldTurbineLoadControllerDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTurbineLoadControllerDynamics( NotificationChain msgs ) {
        TurbineLoadControllerDynamics oldTurbineLoadControllerDynamics = turbineLoadControllerDynamics;
        turbineLoadControllerDynamics = null;
        boolean oldTurbineLoadControllerDynamicsESet = turbineLoadControllerDynamicsESet;
        turbineLoadControllerDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS,
                    oldTurbineLoadControllerDynamics, null, oldTurbineLoadControllerDynamicsESet );
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
    public void unsetTurbineLoadControllerDynamics() {
        if( turbineLoadControllerDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) turbineLoadControllerDynamics ).eInverseRemove( this,
                    CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS,
                    TurbineLoadControllerDynamics.class, msgs );
            msgs = basicUnsetTurbineLoadControllerDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTurbineLoadControllerDynamicsESet = turbineLoadControllerDynamicsESet;
            turbineLoadControllerDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS, null, null,
                    oldTurbineLoadControllerDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTurbineLoadControllerDynamics() {
        return turbineLoadControllerDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineDynamics getAsynchronousMachineDynamics() {
        if( asynchronousMachineDynamics != null && asynchronousMachineDynamics.eIsProxy() ) {
            InternalEObject oldAsynchronousMachineDynamics = ( InternalEObject ) asynchronousMachineDynamics;
            asynchronousMachineDynamics = ( AsynchronousMachineDynamics ) eResolveProxy(
                    oldAsynchronousMachineDynamics );
            if( asynchronousMachineDynamics != oldAsynchronousMachineDynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        oldAsynchronousMachineDynamics, asynchronousMachineDynamics ) );
            }
        }
        return asynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsynchronousMachineDynamics basicGetAsynchronousMachineDynamics() {
        return asynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsynchronousMachineDynamics(
            AsynchronousMachineDynamics newAsynchronousMachineDynamics, NotificationChain msgs ) {
        AsynchronousMachineDynamics oldAsynchronousMachineDynamics = asynchronousMachineDynamics;
        asynchronousMachineDynamics = newAsynchronousMachineDynamics;
        boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
        asynchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS, oldAsynchronousMachineDynamics,
                    newAsynchronousMachineDynamics, !oldAsynchronousMachineDynamicsESet );
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
    public void setAsynchronousMachineDynamics( AsynchronousMachineDynamics newAsynchronousMachineDynamics ) {
        if( newAsynchronousMachineDynamics != asynchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( asynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS,
                        AsynchronousMachineDynamics.class, msgs );
            if( newAsynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newAsynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS,
                        AsynchronousMachineDynamics.class, msgs );
            msgs = basicSetAsynchronousMachineDynamics( newAsynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
            asynchronousMachineDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS, newAsynchronousMachineDynamics,
                    newAsynchronousMachineDynamics, !oldAsynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsynchronousMachineDynamics( NotificationChain msgs ) {
        AsynchronousMachineDynamics oldAsynchronousMachineDynamics = asynchronousMachineDynamics;
        asynchronousMachineDynamics = null;
        boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
        asynchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS, oldAsynchronousMachineDynamics,
                    null, oldAsynchronousMachineDynamicsESet );
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
    public void unsetAsynchronousMachineDynamics() {
        if( asynchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS,
                    AsynchronousMachineDynamics.class, msgs );
            msgs = basicUnsetAsynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
            asynchronousMachineDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS, null, null,
                    oldAsynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsynchronousMachineDynamics() {
        return asynchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SynchronousMachineDynamics > getSynchronousMachineDynamics() {
        if( synchronousMachineDynamics == null ) {
            synchronousMachineDynamics = new EObjectWithInverseEList.Unsettable.ManyInverse< SynchronousMachineDynamics >(
                    SynchronousMachineDynamics.class, this,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS );
        }
        return synchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSynchronousMachineDynamics() {
        if( synchronousMachineDynamics != null )
            ( ( InternalEList.Unsettable< ? > ) synchronousMachineDynamics ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachineDynamics() {
        return synchronousMachineDynamics != null
                && ( ( InternalEList.Unsettable< ? > ) synchronousMachineDynamics ).isSet();
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
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS:
            if( turbineLoadControllerDynamics != null )
                msgs = ( ( InternalEObject ) turbineLoadControllerDynamics ).eInverseRemove( this,
                        CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS,
                        TurbineLoadControllerDynamics.class, msgs );
            return basicSetTurbineLoadControllerDynamics( ( TurbineLoadControllerDynamics ) otherEnd, msgs );
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            if( asynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS,
                        AsynchronousMachineDynamics.class, msgs );
            return basicSetAsynchronousMachineDynamics( ( AsynchronousMachineDynamics ) otherEnd, msgs );
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSynchronousMachineDynamics() )
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
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS:
            return basicUnsetTurbineLoadControllerDynamics( msgs );
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetAsynchronousMachineDynamics( msgs );
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            return ( ( InternalEList< ? > ) getSynchronousMachineDynamics() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS:
            if( resolve ) return getTurbineLoadControllerDynamics();
            return basicGetTurbineLoadControllerDynamics();
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            if( resolve ) return getAsynchronousMachineDynamics();
            return basicGetAsynchronousMachineDynamics();
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            return getSynchronousMachineDynamics();
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
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS:
            setTurbineLoadControllerDynamics( ( TurbineLoadControllerDynamics ) newValue );
            return;
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            setAsynchronousMachineDynamics( ( AsynchronousMachineDynamics ) newValue );
            return;
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            getSynchronousMachineDynamics().clear();
            getSynchronousMachineDynamics().addAll( ( Collection< ? extends SynchronousMachineDynamics > ) newValue );
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
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS:
            unsetTurbineLoadControllerDynamics();
            return;
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            unsetAsynchronousMachineDynamics();
            return;
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            unsetSynchronousMachineDynamics();
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
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__TURBINE_LOAD_CONTROLLER_DYNAMICS:
            return isSetTurbineLoadControllerDynamics();
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetAsynchronousMachineDynamics();
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetSynchronousMachineDynamics();
        }
        return super.eIsSet( featureID );
    }

} //TurbineGovernorDynamicsImpl
