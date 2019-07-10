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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MechanicalLoadDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineGovernorDynamics;

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
 * An implementation of the model object '<em><b>Synchronous Machine Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineDynamicsImpl#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineDynamicsImpl#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineDynamicsImpl#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineDynamicsImpl#getSynchronousMachine <em>Synchronous Machine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineDynamicsImpl#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronousMachineDynamicsImpl extends RotatingMachineDynamicsImpl implements SynchronousMachineDynamics {
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
     * The cached value of the '{@link #getMechanicalLoadDynamics() <em>Mechanical Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMechanicalLoadDynamics()
     * @generated
     * @ordered
     */
    protected MechanicalLoadDynamics mechanicalLoadDynamics;

    /**
     * This is true if the Mechanical Load Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mechanicalLoadDynamicsESet;

    /**
     * The cached value of the '{@link #getTurbineGovernorDynamics() <em>Turbine Governor Dynamics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineGovernorDynamics()
     * @generated
     * @ordered
     */
    protected EList< TurbineGovernorDynamics > turbineGovernorDynamics;

    /**
     * The cached value of the '{@link #getSynchronousMachine() <em>Synchronous Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachine()
     * @generated
     * @ordered
     */
    protected SynchronousMachine synchronousMachine;

    /**
     * This is true if the Synchronous Machine reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchronousMachineESet;

    /**
     * The cached value of the '{@link #getGenICompensationForGenJ() <em>Gen ICompensation For Gen J</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenICompensationForGenJ()
     * @generated
     * @ordered
     */
    protected EList< GenICompensationForGenJ > genICompensationForGenJ;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SynchronousMachineDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSynchronousMachineDynamics();
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
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, oldExcitationSystemDynamics,
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
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            if( newExcitationSystemDynamics != null )
                msgs = ( ( InternalEObject ) newExcitationSystemDynamics ).eInverseAdd( this,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            msgs = basicSetExcitationSystemDynamics( newExcitationSystemDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
            excitationSystemDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, newExcitationSystemDynamics,
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
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, oldExcitationSystemDynamics,
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, ExcitationSystemDynamics.class,
                    msgs );
            msgs = basicUnsetExcitationSystemDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
            excitationSystemDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, null, null,
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
    public MechanicalLoadDynamics getMechanicalLoadDynamics() {
        if( mechanicalLoadDynamics != null && mechanicalLoadDynamics.eIsProxy() ) {
            InternalEObject oldMechanicalLoadDynamics = ( InternalEObject ) mechanicalLoadDynamics;
            mechanicalLoadDynamics = ( MechanicalLoadDynamics ) eResolveProxy( oldMechanicalLoadDynamics );
            if( mechanicalLoadDynamics != oldMechanicalLoadDynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, oldMechanicalLoadDynamics,
                        mechanicalLoadDynamics ) );
            }
        }
        return mechanicalLoadDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MechanicalLoadDynamics basicGetMechanicalLoadDynamics() {
        return mechanicalLoadDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMechanicalLoadDynamics( MechanicalLoadDynamics newMechanicalLoadDynamics,
            NotificationChain msgs ) {
        MechanicalLoadDynamics oldMechanicalLoadDynamics = mechanicalLoadDynamics;
        mechanicalLoadDynamics = newMechanicalLoadDynamics;
        boolean oldMechanicalLoadDynamicsESet = mechanicalLoadDynamicsESet;
        mechanicalLoadDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, oldMechanicalLoadDynamics,
                    newMechanicalLoadDynamics, !oldMechanicalLoadDynamicsESet );
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
    public void setMechanicalLoadDynamics( MechanicalLoadDynamics newMechanicalLoadDynamics ) {
        if( newMechanicalLoadDynamics != mechanicalLoadDynamics ) {
            NotificationChain msgs = null;
            if( mechanicalLoadDynamics != null )
                msgs = ( ( InternalEObject ) mechanicalLoadDynamics ).eInverseRemove( this,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, MechanicalLoadDynamics.class,
                        msgs );
            if( newMechanicalLoadDynamics != null )
                msgs = ( ( InternalEObject ) newMechanicalLoadDynamics ).eInverseAdd( this,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, MechanicalLoadDynamics.class,
                        msgs );
            msgs = basicSetMechanicalLoadDynamics( newMechanicalLoadDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMechanicalLoadDynamicsESet = mechanicalLoadDynamicsESet;
            mechanicalLoadDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, newMechanicalLoadDynamics,
                    newMechanicalLoadDynamics, !oldMechanicalLoadDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMechanicalLoadDynamics( NotificationChain msgs ) {
        MechanicalLoadDynamics oldMechanicalLoadDynamics = mechanicalLoadDynamics;
        mechanicalLoadDynamics = null;
        boolean oldMechanicalLoadDynamicsESet = mechanicalLoadDynamicsESet;
        mechanicalLoadDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, oldMechanicalLoadDynamics, null,
                    oldMechanicalLoadDynamicsESet );
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
    public void unsetMechanicalLoadDynamics() {
        if( mechanicalLoadDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) mechanicalLoadDynamics ).eInverseRemove( this,
                    CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, MechanicalLoadDynamics.class,
                    msgs );
            msgs = basicUnsetMechanicalLoadDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMechanicalLoadDynamicsESet = mechanicalLoadDynamicsESet;
            mechanicalLoadDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, null, null,
                    oldMechanicalLoadDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMechanicalLoadDynamics() {
        return mechanicalLoadDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TurbineGovernorDynamics > getTurbineGovernorDynamics() {
        if( turbineGovernorDynamics == null ) {
            turbineGovernorDynamics = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< TurbineGovernorDynamics >(
                    TurbineGovernorDynamics.class, this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS );
        }
        return turbineGovernorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTurbineGovernorDynamics() {
        if( turbineGovernorDynamics != null ) ( ( InternalEList.Unsettable< ? > ) turbineGovernorDynamics ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTurbineGovernorDynamics() {
        return turbineGovernorDynamics != null && ( ( InternalEList.Unsettable< ? > ) turbineGovernorDynamics ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachine getSynchronousMachine() {
        if( synchronousMachine != null && synchronousMachine.eIsProxy() ) {
            InternalEObject oldSynchronousMachine = ( InternalEObject ) synchronousMachine;
            synchronousMachine = ( SynchronousMachine ) eResolveProxy( oldSynchronousMachine );
            if( synchronousMachine != oldSynchronousMachine ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, oldSynchronousMachine,
                        synchronousMachine ) );
            }
        }
        return synchronousMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachine basicGetSynchronousMachine() {
        return synchronousMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSynchronousMachine( SynchronousMachine newSynchronousMachine,
            NotificationChain msgs ) {
        SynchronousMachine oldSynchronousMachine = synchronousMachine;
        synchronousMachine = newSynchronousMachine;
        boolean oldSynchronousMachineESet = synchronousMachineESet;
        synchronousMachineESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, oldSynchronousMachine,
                    newSynchronousMachine, !oldSynchronousMachineESet );
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
    public void setSynchronousMachine( SynchronousMachine newSynchronousMachine ) {
        if( newSynchronousMachine != synchronousMachine ) {
            NotificationChain msgs = null;
            if( synchronousMachine != null ) msgs = ( ( InternalEObject ) synchronousMachine ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, SynchronousMachine.class, msgs );
            if( newSynchronousMachine != null ) msgs = ( ( InternalEObject ) newSynchronousMachine ).eInverseAdd( this,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, SynchronousMachine.class, msgs );
            msgs = basicSetSynchronousMachine( newSynchronousMachine, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineESet = synchronousMachineESet;
            synchronousMachineESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, newSynchronousMachine,
                    newSynchronousMachine, !oldSynchronousMachineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSynchronousMachine( NotificationChain msgs ) {
        SynchronousMachine oldSynchronousMachine = synchronousMachine;
        synchronousMachine = null;
        boolean oldSynchronousMachineESet = synchronousMachineESet;
        synchronousMachineESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, oldSynchronousMachine, null,
                    oldSynchronousMachineESet );
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
    public void unsetSynchronousMachine() {
        if( synchronousMachine != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) synchronousMachine ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, SynchronousMachine.class, msgs );
            msgs = basicUnsetSynchronousMachine( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineESet = synchronousMachineESet;
            synchronousMachineESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, null, null,
                    oldSynchronousMachineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachine() {
        return synchronousMachineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GenICompensationForGenJ > getGenICompensationForGenJ() {
        if( genICompensationForGenJ == null ) {
            genICompensationForGenJ = new EObjectWithInverseResolvingEList.Unsettable< GenICompensationForGenJ >(
                    GenICompensationForGenJ.class, this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J,
                    CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS );
        }
        return genICompensationForGenJ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenICompensationForGenJ() {
        if( genICompensationForGenJ != null ) ( ( InternalEList.Unsettable< ? > ) genICompensationForGenJ ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenICompensationForGenJ() {
        return genICompensationForGenJ != null && ( ( InternalEList.Unsettable< ? > ) genICompensationForGenJ ).isSet();
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            if( excitationSystemDynamics != null )
                msgs = ( ( InternalEObject ) excitationSystemDynamics ).eInverseRemove( this,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            return basicSetExcitationSystemDynamics( ( ExcitationSystemDynamics ) otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            if( mechanicalLoadDynamics != null )
                msgs = ( ( InternalEObject ) mechanicalLoadDynamics ).eInverseRemove( this,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, MechanicalLoadDynamics.class,
                        msgs );
            return basicSetMechanicalLoadDynamics( ( MechanicalLoadDynamics ) otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTurbineGovernorDynamics() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            if( synchronousMachine != null ) msgs = ( ( InternalEObject ) synchronousMachine ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, SynchronousMachine.class, msgs );
            return basicSetSynchronousMachine( ( SynchronousMachine ) otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGenICompensationForGenJ() )
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            return basicUnsetExcitationSystemDynamics( msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            return basicUnsetMechanicalLoadDynamics( msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return ( ( InternalEList< ? > ) getTurbineGovernorDynamics() ).basicRemove( otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            return basicUnsetSynchronousMachine( msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            return ( ( InternalEList< ? > ) getGenICompensationForGenJ() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            return getExcitationSystemDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            if( resolve ) return getMechanicalLoadDynamics();
            return basicGetMechanicalLoadDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return getTurbineGovernorDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            if( resolve ) return getSynchronousMachine();
            return basicGetSynchronousMachine();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            return getGenICompensationForGenJ();
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            setExcitationSystemDynamics( ( ExcitationSystemDynamics ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            setMechanicalLoadDynamics( ( MechanicalLoadDynamics ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            getTurbineGovernorDynamics().clear();
            getTurbineGovernorDynamics().addAll( ( Collection< ? extends TurbineGovernorDynamics > ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            setSynchronousMachine( ( SynchronousMachine ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            getGenICompensationForGenJ().clear();
            getGenICompensationForGenJ().addAll( ( Collection< ? extends GenICompensationForGenJ > ) newValue );
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            unsetExcitationSystemDynamics();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            unsetMechanicalLoadDynamics();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            unsetTurbineGovernorDynamics();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            unsetSynchronousMachine();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            unsetGenICompensationForGenJ();
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            return isSetExcitationSystemDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            return isSetMechanicalLoadDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return isSetTurbineGovernorDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            return isSetSynchronousMachine();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            return isSetGenICompensationForGenJ();
        }
        return super.eIsSet( featureID );
    }

} //SynchronousMachineDynamicsImpl
