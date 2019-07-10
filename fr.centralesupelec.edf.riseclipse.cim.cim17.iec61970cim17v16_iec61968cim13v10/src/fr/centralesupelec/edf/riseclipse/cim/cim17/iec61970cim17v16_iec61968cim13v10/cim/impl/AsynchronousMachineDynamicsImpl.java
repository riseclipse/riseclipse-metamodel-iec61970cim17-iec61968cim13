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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MechanicalLoadDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineGovernorDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2Dynamics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Machine Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineDynamicsImpl#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineDynamicsImpl#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineDynamicsImpl#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineDynamicsImpl#getAsynchronousMachine <em>Asynchronous Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsynchronousMachineDynamicsImpl extends RotatingMachineDynamicsImpl
        implements AsynchronousMachineDynamics {
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
     * The cached value of the '{@link #getWindTurbineType1or2Dynamics() <em>Wind Turbine Type1or2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType1or2Dynamics()
     * @generated
     * @ordered
     */
    protected WindTurbineType1or2Dynamics windTurbineType1or2Dynamics;

    /**
     * This is true if the Wind Turbine Type1or2 Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType1or2DynamicsESet;

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
     * The cached value of the '{@link #getAsynchronousMachine() <em>Asynchronous Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsynchronousMachine()
     * @generated
     * @ordered
     */
    protected AsynchronousMachine asynchronousMachine;

    /**
     * This is true if the Asynchronous Machine reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asynchronousMachineESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AsynchronousMachineDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAsynchronousMachineDynamics();
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
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS, oldTurbineGovernorDynamics,
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
                        CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        TurbineGovernorDynamics.class, msgs );
            if( newTurbineGovernorDynamics != null )
                msgs = ( ( InternalEObject ) newTurbineGovernorDynamics ).eInverseAdd( this,
                        CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        TurbineGovernorDynamics.class, msgs );
            msgs = basicSetTurbineGovernorDynamics( newTurbineGovernorDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTurbineGovernorDynamicsESet = turbineGovernorDynamicsESet;
            turbineGovernorDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS, newTurbineGovernorDynamics,
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
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS, oldTurbineGovernorDynamics,
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
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS, TurbineGovernorDynamics.class,
                    msgs );
            msgs = basicUnsetTurbineGovernorDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTurbineGovernorDynamicsESet = turbineGovernorDynamicsESet;
            turbineGovernorDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS, null, null,
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
    public WindTurbineType1or2Dynamics getWindTurbineType1or2Dynamics() {
        return windTurbineType1or2Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType1or2Dynamics(
            WindTurbineType1or2Dynamics newWindTurbineType1or2Dynamics, NotificationChain msgs ) {
        WindTurbineType1or2Dynamics oldWindTurbineType1or2Dynamics = windTurbineType1or2Dynamics;
        windTurbineType1or2Dynamics = newWindTurbineType1or2Dynamics;
        boolean oldWindTurbineType1or2DynamicsESet = windTurbineType1or2DynamicsESet;
        windTurbineType1or2DynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS,
                    oldWindTurbineType1or2Dynamics, newWindTurbineType1or2Dynamics,
                    !oldWindTurbineType1or2DynamicsESet );
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
    public void setWindTurbineType1or2Dynamics( WindTurbineType1or2Dynamics newWindTurbineType1or2Dynamics ) {
        if( newWindTurbineType1or2Dynamics != windTurbineType1or2Dynamics ) {
            NotificationChain msgs = null;
            if( windTurbineType1or2Dynamics != null )
                msgs = ( ( InternalEObject ) windTurbineType1or2Dynamics ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        WindTurbineType1or2Dynamics.class, msgs );
            if( newWindTurbineType1or2Dynamics != null )
                msgs = ( ( InternalEObject ) newWindTurbineType1or2Dynamics ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        WindTurbineType1or2Dynamics.class, msgs );
            msgs = basicSetWindTurbineType1or2Dynamics( newWindTurbineType1or2Dynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType1or2DynamicsESet = windTurbineType1or2DynamicsESet;
            windTurbineType1or2DynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS,
                    newWindTurbineType1or2Dynamics, newWindTurbineType1or2Dynamics,
                    !oldWindTurbineType1or2DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType1or2Dynamics( NotificationChain msgs ) {
        WindTurbineType1or2Dynamics oldWindTurbineType1or2Dynamics = windTurbineType1or2Dynamics;
        windTurbineType1or2Dynamics = null;
        boolean oldWindTurbineType1or2DynamicsESet = windTurbineType1or2DynamicsESet;
        windTurbineType1or2DynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS,
                    oldWindTurbineType1or2Dynamics, null, oldWindTurbineType1or2DynamicsESet );
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
    public void unsetWindTurbineType1or2Dynamics() {
        if( windTurbineType1or2Dynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType1or2Dynamics ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                    WindTurbineType1or2Dynamics.class, msgs );
            msgs = basicUnsetWindTurbineType1or2Dynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType1or2DynamicsESet = windTurbineType1or2DynamicsESet;
            windTurbineType1or2DynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS, null, null,
                    oldWindTurbineType1or2DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType1or2Dynamics() {
        return windTurbineType1or2DynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MechanicalLoadDynamics getMechanicalLoadDynamics() {
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
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, oldMechanicalLoadDynamics,
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
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        MechanicalLoadDynamics.class, msgs );
            if( newMechanicalLoadDynamics != null )
                msgs = ( ( InternalEObject ) newMechanicalLoadDynamics ).eInverseAdd( this,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        MechanicalLoadDynamics.class, msgs );
            msgs = basicSetMechanicalLoadDynamics( newMechanicalLoadDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMechanicalLoadDynamicsESet = mechanicalLoadDynamicsESet;
            mechanicalLoadDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, newMechanicalLoadDynamics,
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
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, oldMechanicalLoadDynamics, null,
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
                    CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS, MechanicalLoadDynamics.class,
                    msgs );
            msgs = basicUnsetMechanicalLoadDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMechanicalLoadDynamicsESet = mechanicalLoadDynamicsESet;
            mechanicalLoadDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, null, null,
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
    public AsynchronousMachine getAsynchronousMachine() {
        return asynchronousMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsynchronousMachine( AsynchronousMachine newAsynchronousMachine,
            NotificationChain msgs ) {
        AsynchronousMachine oldAsynchronousMachine = asynchronousMachine;
        asynchronousMachine = newAsynchronousMachine;
        boolean oldAsynchronousMachineESet = asynchronousMachineESet;
        asynchronousMachineESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE, oldAsynchronousMachine,
                    newAsynchronousMachine, !oldAsynchronousMachineESet );
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
    public void setAsynchronousMachine( AsynchronousMachine newAsynchronousMachine ) {
        if( newAsynchronousMachine != asynchronousMachine ) {
            NotificationChain msgs = null;
            if( asynchronousMachine != null ) msgs = ( ( InternalEObject ) asynchronousMachine ).eInverseRemove( this,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, AsynchronousMachine.class, msgs );
            if( newAsynchronousMachine != null )
                msgs = ( ( InternalEObject ) newAsynchronousMachine ).eInverseAdd( this,
                        CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, AsynchronousMachine.class,
                        msgs );
            msgs = basicSetAsynchronousMachine( newAsynchronousMachine, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineESet = asynchronousMachineESet;
            asynchronousMachineESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE, newAsynchronousMachine,
                    newAsynchronousMachine, !oldAsynchronousMachineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsynchronousMachine( NotificationChain msgs ) {
        AsynchronousMachine oldAsynchronousMachine = asynchronousMachine;
        asynchronousMachine = null;
        boolean oldAsynchronousMachineESet = asynchronousMachineESet;
        asynchronousMachineESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE, oldAsynchronousMachine, null,
                    oldAsynchronousMachineESet );
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
    public void unsetAsynchronousMachine() {
        if( asynchronousMachine != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asynchronousMachine ).eInverseRemove( this,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, AsynchronousMachine.class, msgs );
            msgs = basicUnsetAsynchronousMachine( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineESet = asynchronousMachineESet;
            asynchronousMachineESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE, null, null,
                    oldAsynchronousMachineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsynchronousMachine() {
        return asynchronousMachineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            if( turbineGovernorDynamics != null )
                msgs = ( ( InternalEObject ) turbineGovernorDynamics ).eInverseRemove( this,
                        CimPackage.TURBINE_GOVERNOR_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        TurbineGovernorDynamics.class, msgs );
            return basicSetTurbineGovernorDynamics( ( TurbineGovernorDynamics ) otherEnd, msgs );
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            if( windTurbineType1or2Dynamics != null )
                msgs = ( ( InternalEObject ) windTurbineType1or2Dynamics ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        WindTurbineType1or2Dynamics.class, msgs );
            return basicSetWindTurbineType1or2Dynamics( ( WindTurbineType1or2Dynamics ) otherEnd, msgs );
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            if( mechanicalLoadDynamics != null )
                msgs = ( ( InternalEObject ) mechanicalLoadDynamics ).eInverseRemove( this,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        MechanicalLoadDynamics.class, msgs );
            return basicSetMechanicalLoadDynamics( ( MechanicalLoadDynamics ) otherEnd, msgs );
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE:
            if( asynchronousMachine != null ) msgs = ( ( InternalEObject ) asynchronousMachine ).eInverseRemove( this,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, AsynchronousMachine.class, msgs );
            return basicSetAsynchronousMachine( ( AsynchronousMachine ) otherEnd, msgs );
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
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return basicUnsetTurbineGovernorDynamics( msgs );
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            return basicUnsetWindTurbineType1or2Dynamics( msgs );
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            return basicUnsetMechanicalLoadDynamics( msgs );
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE:
            return basicUnsetAsynchronousMachine( msgs );
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
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return getTurbineGovernorDynamics();
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            return getWindTurbineType1or2Dynamics();
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            return getMechanicalLoadDynamics();
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE:
            return getAsynchronousMachine();
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
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            setTurbineGovernorDynamics( ( TurbineGovernorDynamics ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            setWindTurbineType1or2Dynamics( ( WindTurbineType1or2Dynamics ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            setMechanicalLoadDynamics( ( MechanicalLoadDynamics ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE:
            setAsynchronousMachine( ( AsynchronousMachine ) newValue );
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
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            unsetTurbineGovernorDynamics();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            unsetWindTurbineType1or2Dynamics();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            unsetMechanicalLoadDynamics();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE:
            unsetAsynchronousMachine();
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
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return isSetTurbineGovernorDynamics();
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            return isSetWindTurbineType1or2Dynamics();
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            return isSetMechanicalLoadDynamics();
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE:
            return isSetAsynchronousMachine();
        }
        return super.eIsSet( featureID );
    }

} //AsynchronousMachineDynamicsImpl
