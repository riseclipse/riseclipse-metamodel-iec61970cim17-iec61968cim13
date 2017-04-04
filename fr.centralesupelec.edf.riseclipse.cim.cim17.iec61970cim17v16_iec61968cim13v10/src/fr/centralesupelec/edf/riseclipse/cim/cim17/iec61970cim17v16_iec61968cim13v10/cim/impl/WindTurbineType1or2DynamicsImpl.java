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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2Dynamics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Turbine Type1or2 Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType1or2DynamicsImpl#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType1or2DynamicsImpl#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindTurbineType1or2DynamicsImpl extends DynamicsFunctionBlockImpl implements WindTurbineType1or2Dynamics {
    /**
     * The cached value of the '{@link #getRemoteInputSignal() <em>Remote Input Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteInputSignal()
     * @generated
     * @ordered
     */
    protected RemoteInputSignal remoteInputSignal;

    /**
     * This is true if the Remote Input Signal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remoteInputSignalESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindTurbineType1or2DynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindTurbineType1or2Dynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteInputSignal getRemoteInputSignal() {
        if( remoteInputSignal != null && remoteInputSignal.eIsProxy() ) {
            InternalEObject oldRemoteInputSignal = ( InternalEObject ) remoteInputSignal;
            remoteInputSignal = ( RemoteInputSignal ) eResolveProxy( oldRemoteInputSignal );
            if( remoteInputSignal != oldRemoteInputSignal ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL, oldRemoteInputSignal,
                        remoteInputSignal ) );
            }
        }
        return remoteInputSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteInputSignal basicGetRemoteInputSignal() {
        return remoteInputSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRemoteInputSignal( RemoteInputSignal newRemoteInputSignal,
            NotificationChain msgs ) {
        RemoteInputSignal oldRemoteInputSignal = remoteInputSignal;
        remoteInputSignal = newRemoteInputSignal;
        boolean oldRemoteInputSignalESet = remoteInputSignalESet;
        remoteInputSignalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL, oldRemoteInputSignal,
                    newRemoteInputSignal, !oldRemoteInputSignalESet );
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
    public void setRemoteInputSignal( RemoteInputSignal newRemoteInputSignal ) {
        if( newRemoteInputSignal != remoteInputSignal ) {
            NotificationChain msgs = null;
            if( remoteInputSignal != null ) msgs = ( ( InternalEObject ) remoteInputSignal ).eInverseRemove( this,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS, RemoteInputSignal.class, msgs );
            if( newRemoteInputSignal != null ) msgs = ( ( InternalEObject ) newRemoteInputSignal ).eInverseAdd( this,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS, RemoteInputSignal.class, msgs );
            msgs = basicSetRemoteInputSignal( newRemoteInputSignal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRemoteInputSignalESet = remoteInputSignalESet;
            remoteInputSignalESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL, newRemoteInputSignal,
                    newRemoteInputSignal, !oldRemoteInputSignalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRemoteInputSignal( NotificationChain msgs ) {
        RemoteInputSignal oldRemoteInputSignal = remoteInputSignal;
        remoteInputSignal = null;
        boolean oldRemoteInputSignalESet = remoteInputSignalESet;
        remoteInputSignalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL, oldRemoteInputSignal, null,
                    oldRemoteInputSignalESet );
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
    public void unsetRemoteInputSignal() {
        if( remoteInputSignal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) remoteInputSignal ).eInverseRemove( this,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS, RemoteInputSignal.class, msgs );
            msgs = basicUnsetRemoteInputSignal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRemoteInputSignalESet = remoteInputSignalESet;
            remoteInputSignalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL, null, null,
                    oldRemoteInputSignalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteInputSignal() {
        return remoteInputSignalESet;
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
                        CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
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
                    CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                    oldAsynchronousMachineDynamics, newAsynchronousMachineDynamics,
                    !oldAsynchronousMachineDynamicsESet );
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
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS,
                        AsynchronousMachineDynamics.class, msgs );
            if( newAsynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newAsynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS,
                        AsynchronousMachineDynamics.class, msgs );
            msgs = basicSetAsynchronousMachineDynamics( newAsynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
            asynchronousMachineDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                    newAsynchronousMachineDynamics, newAsynchronousMachineDynamics,
                    !oldAsynchronousMachineDynamicsESet ) );
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
                    CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                    oldAsynchronousMachineDynamics, null, oldAsynchronousMachineDynamicsESet );
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
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS,
                    AsynchronousMachineDynamics.class, msgs );
            msgs = basicUnsetAsynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
            asynchronousMachineDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS, null, null,
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL:
            if( remoteInputSignal != null ) msgs = ( ( InternalEObject ) remoteInputSignal ).eInverseRemove( this,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS, RemoteInputSignal.class, msgs );
            return basicSetRemoteInputSignal( ( RemoteInputSignal ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            if( asynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS,
                        AsynchronousMachineDynamics.class, msgs );
            return basicSetAsynchronousMachineDynamics( ( AsynchronousMachineDynamics ) otherEnd, msgs );
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
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return basicUnsetRemoteInputSignal( msgs );
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetAsynchronousMachineDynamics( msgs );
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
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL:
            if( resolve ) return getRemoteInputSignal();
            return basicGetRemoteInputSignal();
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            if( resolve ) return getAsynchronousMachineDynamics();
            return basicGetAsynchronousMachineDynamics();
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
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL:
            setRemoteInputSignal( ( RemoteInputSignal ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            setAsynchronousMachineDynamics( ( AsynchronousMachineDynamics ) newValue );
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
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL:
            unsetRemoteInputSignal();
            return;
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            unsetAsynchronousMachineDynamics();
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
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return isSetRemoteInputSignal();
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetAsynchronousMachineDynamics();
        }
        return super.eIsSet( featureID );
    }

} //WindTurbineType1or2DynamicsImpl
