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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemStabilizerDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal;

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
 * An implementation of the model object '<em><b>Power System Stabilizer Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemStabilizerDynamicsImpl#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemStabilizerDynamicsImpl#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSystemStabilizerDynamicsImpl extends DynamicsFunctionBlockImpl
        implements PowerSystemStabilizerDynamics {
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
     * The cached value of the '{@link #getRemoteInputSignal() <em>Remote Input Signal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteInputSignal()
     * @generated
     * @ordered
     */
    protected EList< RemoteInputSignal > remoteInputSignal;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerSystemStabilizerDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerSystemStabilizerDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcitationSystemDynamics getExcitationSystemDynamics() {
        if( excitationSystemDynamics != null && excitationSystemDynamics.eIsProxy() ) {
            InternalEObject oldExcitationSystemDynamics = ( InternalEObject ) excitationSystemDynamics;
            excitationSystemDynamics = ( ExcitationSystemDynamics ) eResolveProxy( oldExcitationSystemDynamics );
            if( excitationSystemDynamics != oldExcitationSystemDynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        oldExcitationSystemDynamics, excitationSystemDynamics ) );
            }
        }
        return excitationSystemDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcitationSystemDynamics basicGetExcitationSystemDynamics() {
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
                    CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    oldExcitationSystemDynamics, newExcitationSystemDynamics, !oldExcitationSystemDynamicsESet );
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
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            if( newExcitationSystemDynamics != null )
                msgs = ( ( InternalEObject ) newExcitationSystemDynamics ).eInverseAdd( this,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            msgs = basicSetExcitationSystemDynamics( newExcitationSystemDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
            excitationSystemDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    newExcitationSystemDynamics, newExcitationSystemDynamics, !oldExcitationSystemDynamicsESet ) );
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
                    CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    oldExcitationSystemDynamics, null, oldExcitationSystemDynamicsESet );
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS,
                    ExcitationSystemDynamics.class, msgs );
            msgs = basicUnsetExcitationSystemDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
            excitationSystemDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, null, null,
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
    public EList< RemoteInputSignal > getRemoteInputSignal() {
        if( remoteInputSignal == null ) {
            remoteInputSignal = new EObjectWithInverseResolvingEList.Unsettable< RemoteInputSignal >(
                    RemoteInputSignal.class, this, CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL,
                    CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS );
        }
        return remoteInputSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemoteInputSignal() {
        if( remoteInputSignal != null ) ( ( InternalEList.Unsettable< ? > ) remoteInputSignal ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteInputSignal() {
        return remoteInputSignal != null && ( ( InternalEList.Unsettable< ? > ) remoteInputSignal ).isSet();
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
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            if( excitationSystemDynamics != null )
                msgs = ( ( InternalEObject ) excitationSystemDynamics ).eInverseRemove( this,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            return basicSetExcitationSystemDynamics( ( ExcitationSystemDynamics ) otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRemoteInputSignal() )
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
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            return basicUnsetExcitationSystemDynamics( msgs );
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return ( ( InternalEList< ? > ) getRemoteInputSignal() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            if( resolve ) return getExcitationSystemDynamics();
            return basicGetExcitationSystemDynamics();
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return getRemoteInputSignal();
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
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            setExcitationSystemDynamics( ( ExcitationSystemDynamics ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL:
            getRemoteInputSignal().clear();
            getRemoteInputSignal().addAll( ( Collection< ? extends RemoteInputSignal > ) newValue );
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
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            unsetExcitationSystemDynamics();
            return;
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL:
            unsetRemoteInputSignal();
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
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            return isSetExcitationSystemDynamics();
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return isSetRemoteInputSignal();
        }
        return super.eIsSet( featureID );
    }

} //PowerSystemStabilizerDynamicsImpl
