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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscontinuousExcitationControlDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType1Dynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemStabilizerDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSignalKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcitationLimiterDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2Dynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4Dynamics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Input Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteInputSignalImpl#getRemoteSignalType <em>Remote Signal Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteInputSignalImpl#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteInputSignalImpl#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteInputSignalImpl#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteInputSignalImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteInputSignalImpl#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteInputSignalImpl#getWindPlantDynamics <em>Wind Plant Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteInputSignalImpl#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteInputSignalImpl#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteInputSignalImpl#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteInputSignalImpl extends IdentifiedObjectImpl implements RemoteInputSignal {
    /**
     * The default value of the '{@link #getRemoteSignalType() <em>Remote Signal Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteSignalType()
     * @generated
     * @ordered
     */
    protected static final RemoteSignalKind REMOTE_SIGNAL_TYPE_EDEFAULT = RemoteSignalKind.REMOTE_BUS_VOLTAGE_FREQUENCY;

    /**
     * The cached value of the '{@link #getRemoteSignalType() <em>Remote Signal Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteSignalType()
     * @generated
     * @ordered
     */
    protected RemoteSignalKind remoteSignalType = REMOTE_SIGNAL_TYPE_EDEFAULT;

    /**
     * This is true if the Remote Signal Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remoteSignalTypeESet;

    /**
     * The cached value of the '{@link #getVoltageCompensatorDynamics() <em>Voltage Compensator Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageCompensatorDynamics()
     * @generated
     * @ordered
     */
    protected VoltageCompensatorDynamics voltageCompensatorDynamics;

    /**
     * This is true if the Voltage Compensator Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageCompensatorDynamicsESet;

    /**
     * The cached value of the '{@link #getPowerSystemStabilizerDynamics() <em>Power System Stabilizer Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemStabilizerDynamics()
     * @generated
     * @ordered
     */
    protected PowerSystemStabilizerDynamics powerSystemStabilizerDynamics;

    /**
     * This is true if the Power System Stabilizer Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerSystemStabilizerDynamicsESet;

    /**
     * The cached value of the '{@link #getWindTurbineType3or4Dynamics() <em>Wind Turbine Type3or4 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3or4Dynamics()
     * @generated
     * @ordered
     */
    protected WindTurbineType3or4Dynamics windTurbineType3or4Dynamics;

    /**
     * This is true if the Wind Turbine Type3or4 Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3or4DynamicsESet;

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected Terminal terminal;

    /**
     * This is true if the Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean terminalESet;

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
     * The cached value of the '{@link #getWindPlantDynamics() <em>Wind Plant Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantDynamics()
     * @generated
     * @ordered
     */
    protected WindPlantDynamics windPlantDynamics;

    /**
     * This is true if the Wind Plant Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantDynamicsESet;

    /**
     * The cached value of the '{@link #getDiscontinuousExcitationControlDynamics() <em>Discontinuous Excitation Control Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiscontinuousExcitationControlDynamics()
     * @generated
     * @ordered
     */
    protected DiscontinuousExcitationControlDynamics discontinuousExcitationControlDynamics;

    /**
     * This is true if the Discontinuous Excitation Control Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean discontinuousExcitationControlDynamicsESet;

    /**
     * The cached value of the '{@link #getUnderexcitationLimiterDynamics() <em>Underexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderexcitationLimiterDynamics()
     * @generated
     * @ordered
     */
    protected UnderexcitationLimiterDynamics underexcitationLimiterDynamics;

    /**
     * This is true if the Underexcitation Limiter Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean underexcitationLimiterDynamicsESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoteInputSignalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRemoteInputSignal();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteSignalKind getRemoteSignalType() {
        return remoteSignalType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemoteSignalType( RemoteSignalKind newRemoteSignalType ) {
        RemoteSignalKind oldRemoteSignalType = remoteSignalType;
        remoteSignalType = newRemoteSignalType == null ? REMOTE_SIGNAL_TYPE_EDEFAULT : newRemoteSignalType;
        boolean oldRemoteSignalTypeESet = remoteSignalTypeESet;
        remoteSignalTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REMOTE_INPUT_SIGNAL__REMOTE_SIGNAL_TYPE,
                    oldRemoteSignalType, remoteSignalType, !oldRemoteSignalTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemoteSignalType() {
        RemoteSignalKind oldRemoteSignalType = remoteSignalType;
        boolean oldRemoteSignalTypeESet = remoteSignalTypeESet;
        remoteSignalType = REMOTE_SIGNAL_TYPE_EDEFAULT;
        remoteSignalTypeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.REMOTE_INPUT_SIGNAL__REMOTE_SIGNAL_TYPE,
                        oldRemoteSignalType, REMOTE_SIGNAL_TYPE_EDEFAULT, oldRemoteSignalTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteSignalType() {
        return remoteSignalTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageCompensatorDynamics getVoltageCompensatorDynamics() {
        return voltageCompensatorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVoltageCompensatorDynamics(
            VoltageCompensatorDynamics newVoltageCompensatorDynamics, NotificationChain msgs ) {
        VoltageCompensatorDynamics oldVoltageCompensatorDynamics = voltageCompensatorDynamics;
        voltageCompensatorDynamics = newVoltageCompensatorDynamics;
        boolean oldVoltageCompensatorDynamicsESet = voltageCompensatorDynamicsESet;
        voltageCompensatorDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__VOLTAGE_COMPENSATOR_DYNAMICS, oldVoltageCompensatorDynamics,
                    newVoltageCompensatorDynamics, !oldVoltageCompensatorDynamicsESet );
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
    public void setVoltageCompensatorDynamics( VoltageCompensatorDynamics newVoltageCompensatorDynamics ) {
        if( newVoltageCompensatorDynamics != voltageCompensatorDynamics ) {
            NotificationChain msgs = null;
            if( voltageCompensatorDynamics != null )
                msgs = ( ( InternalEObject ) voltageCompensatorDynamics ).eInverseRemove( this,
                        CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS__REMOTE_INPUT_SIGNAL, VoltageCompensatorDynamics.class,
                        msgs );
            if( newVoltageCompensatorDynamics != null )
                msgs = ( ( InternalEObject ) newVoltageCompensatorDynamics ).eInverseAdd( this,
                        CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS__REMOTE_INPUT_SIGNAL, VoltageCompensatorDynamics.class,
                        msgs );
            msgs = basicSetVoltageCompensatorDynamics( newVoltageCompensatorDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageCompensatorDynamicsESet = voltageCompensatorDynamicsESet;
            voltageCompensatorDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__VOLTAGE_COMPENSATOR_DYNAMICS, newVoltageCompensatorDynamics,
                    newVoltageCompensatorDynamics, !oldVoltageCompensatorDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVoltageCompensatorDynamics( NotificationChain msgs ) {
        VoltageCompensatorDynamics oldVoltageCompensatorDynamics = voltageCompensatorDynamics;
        voltageCompensatorDynamics = null;
        boolean oldVoltageCompensatorDynamicsESet = voltageCompensatorDynamicsESet;
        voltageCompensatorDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__VOLTAGE_COMPENSATOR_DYNAMICS, oldVoltageCompensatorDynamics, null,
                    oldVoltageCompensatorDynamicsESet );
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
    public void unsetVoltageCompensatorDynamics() {
        if( voltageCompensatorDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) voltageCompensatorDynamics ).eInverseRemove( this,
                    CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS__REMOTE_INPUT_SIGNAL, VoltageCompensatorDynamics.class,
                    msgs );
            msgs = basicUnsetVoltageCompensatorDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageCompensatorDynamicsESet = voltageCompensatorDynamicsESet;
            voltageCompensatorDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__VOLTAGE_COMPENSATOR_DYNAMICS, null, null,
                    oldVoltageCompensatorDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageCompensatorDynamics() {
        return voltageCompensatorDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemStabilizerDynamics getPowerSystemStabilizerDynamics() {
        return powerSystemStabilizerDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerSystemStabilizerDynamics(
            PowerSystemStabilizerDynamics newPowerSystemStabilizerDynamics, NotificationChain msgs ) {
        PowerSystemStabilizerDynamics oldPowerSystemStabilizerDynamics = powerSystemStabilizerDynamics;
        powerSystemStabilizerDynamics = newPowerSystemStabilizerDynamics;
        boolean oldPowerSystemStabilizerDynamicsESet = powerSystemStabilizerDynamicsESet;
        powerSystemStabilizerDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS, oldPowerSystemStabilizerDynamics,
                    newPowerSystemStabilizerDynamics, !oldPowerSystemStabilizerDynamicsESet );
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
    public void setPowerSystemStabilizerDynamics( PowerSystemStabilizerDynamics newPowerSystemStabilizerDynamics ) {
        if( newPowerSystemStabilizerDynamics != powerSystemStabilizerDynamics ) {
            NotificationChain msgs = null;
            if( powerSystemStabilizerDynamics != null )
                msgs = ( ( InternalEObject ) powerSystemStabilizerDynamics ).eInverseRemove( this,
                        CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        PowerSystemStabilizerDynamics.class, msgs );
            if( newPowerSystemStabilizerDynamics != null )
                msgs = ( ( InternalEObject ) newPowerSystemStabilizerDynamics ).eInverseAdd( this,
                        CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        PowerSystemStabilizerDynamics.class, msgs );
            msgs = basicSetPowerSystemStabilizerDynamics( newPowerSystemStabilizerDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemStabilizerDynamicsESet = powerSystemStabilizerDynamicsESet;
            powerSystemStabilizerDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS, newPowerSystemStabilizerDynamics,
                    newPowerSystemStabilizerDynamics, !oldPowerSystemStabilizerDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerSystemStabilizerDynamics( NotificationChain msgs ) {
        PowerSystemStabilizerDynamics oldPowerSystemStabilizerDynamics = powerSystemStabilizerDynamics;
        powerSystemStabilizerDynamics = null;
        boolean oldPowerSystemStabilizerDynamicsESet = powerSystemStabilizerDynamicsESet;
        powerSystemStabilizerDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS, oldPowerSystemStabilizerDynamics,
                    null, oldPowerSystemStabilizerDynamicsESet );
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
    public void unsetPowerSystemStabilizerDynamics() {
        if( powerSystemStabilizerDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerSystemStabilizerDynamics ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL,
                    PowerSystemStabilizerDynamics.class, msgs );
            msgs = basicUnsetPowerSystemStabilizerDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemStabilizerDynamicsESet = powerSystemStabilizerDynamicsESet;
            powerSystemStabilizerDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS, null, null,
                    oldPowerSystemStabilizerDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemStabilizerDynamics() {
        return powerSystemStabilizerDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3or4Dynamics getWindTurbineType3or4Dynamics() {
        return windTurbineType3or4Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3or4Dynamics(
            WindTurbineType3or4Dynamics newWindTurbineType3or4Dynamics, NotificationChain msgs ) {
        WindTurbineType3or4Dynamics oldWindTurbineType3or4Dynamics = windTurbineType3or4Dynamics;
        windTurbineType3or4Dynamics = newWindTurbineType3or4Dynamics;
        boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
        windTurbineType3or4DynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS, oldWindTurbineType3or4Dynamics,
                    newWindTurbineType3or4Dynamics, !oldWindTurbineType3or4DynamicsESet );
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
    public void setWindTurbineType3or4Dynamics( WindTurbineType3or4Dynamics newWindTurbineType3or4Dynamics ) {
        if( newWindTurbineType3or4Dynamics != windTurbineType3or4Dynamics ) {
            NotificationChain msgs = null;
            if( windTurbineType3or4Dynamics != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4Dynamics ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        WindTurbineType3or4Dynamics.class, msgs );
            if( newWindTurbineType3or4Dynamics != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3or4Dynamics ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        WindTurbineType3or4Dynamics.class, msgs );
            msgs = basicSetWindTurbineType3or4Dynamics( newWindTurbineType3or4Dynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
            windTurbineType3or4DynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS, newWindTurbineType3or4Dynamics,
                    newWindTurbineType3or4Dynamics, !oldWindTurbineType3or4DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3or4Dynamics( NotificationChain msgs ) {
        WindTurbineType3or4Dynamics oldWindTurbineType3or4Dynamics = windTurbineType3or4Dynamics;
        windTurbineType3or4Dynamics = null;
        boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
        windTurbineType3or4DynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS, oldWindTurbineType3or4Dynamics,
                    null, oldWindTurbineType3or4DynamicsESet );
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
    public void unsetWindTurbineType3or4Dynamics() {
        if( windTurbineType3or4Dynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3or4Dynamics ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL, WindTurbineType3or4Dynamics.class,
                    msgs );
            msgs = basicUnsetWindTurbineType3or4Dynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
            windTurbineType3or4DynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS, null, null,
                    oldWindTurbineType3or4DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3or4Dynamics() {
        return windTurbineType3or4DynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTerminal( Terminal newTerminal, NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = newTerminal;
        boolean oldTerminalESet = terminalESet;
        terminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL, oldTerminal, newTerminal, !oldTerminalESet );
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
    public void setTerminal( Terminal newTerminal ) {
        if( newTerminal != terminal ) {
            NotificationChain msgs = null;
            if( terminal != null ) msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL, Terminal.class, msgs );
            if( newTerminal != null ) msgs = ( ( InternalEObject ) newTerminal ).eInverseAdd( this,
                    CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL, Terminal.class, msgs );
            msgs = basicSetTerminal( newTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL, newTerminal, newTerminal, !oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTerminal( NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = null;
        boolean oldTerminalESet = terminalESet;
        terminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL, oldTerminal, null, oldTerminalESet );
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
    public void unsetTerminal() {
        if( terminal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL,
                    Terminal.class, msgs );
            msgs = basicUnsetTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL, null, null, oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType1Dynamics getPFVArControllerType1Dynamics() {
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
                    CimPackage.REMOTE_INPUT_SIGNAL__PFV_AR_CONTROLLER_TYPE1_DYNAMICS, oldPFVArControllerType1Dynamics,
                    newPFVArControllerType1Dynamics, !oldPFVArControllerType1DynamicsESet );
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
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        PFVArControllerType1Dynamics.class, msgs );
            if( newPFVArControllerType1Dynamics != null )
                msgs = ( ( InternalEObject ) newPFVArControllerType1Dynamics ).eInverseAdd( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        PFVArControllerType1Dynamics.class, msgs );
            msgs = basicSetPFVArControllerType1Dynamics( newPFVArControllerType1Dynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType1DynamicsESet = pfvArControllerType1DynamicsESet;
            pfvArControllerType1DynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__PFV_AR_CONTROLLER_TYPE1_DYNAMICS, newPFVArControllerType1Dynamics,
                    newPFVArControllerType1Dynamics, !oldPFVArControllerType1DynamicsESet ) );
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
                    CimPackage.REMOTE_INPUT_SIGNAL__PFV_AR_CONTROLLER_TYPE1_DYNAMICS, oldPFVArControllerType1Dynamics,
                    null, oldPFVArControllerType1DynamicsESet );
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
                    CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__REMOTE_INPUT_SIGNAL,
                    PFVArControllerType1Dynamics.class, msgs );
            msgs = basicUnsetPFVArControllerType1Dynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType1DynamicsESet = pfvArControllerType1DynamicsESet;
            pfvArControllerType1DynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__PFV_AR_CONTROLLER_TYPE1_DYNAMICS, null, null,
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
    public WindPlantDynamics getWindPlantDynamics() {
        return windPlantDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPlantDynamics( WindPlantDynamics newWindPlantDynamics,
            NotificationChain msgs ) {
        WindPlantDynamics oldWindPlantDynamics = windPlantDynamics;
        windPlantDynamics = newWindPlantDynamics;
        boolean oldWindPlantDynamicsESet = windPlantDynamicsESet;
        windPlantDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS, oldWindPlantDynamics, newWindPlantDynamics,
                    !oldWindPlantDynamicsESet );
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
    public void setWindPlantDynamics( WindPlantDynamics newWindPlantDynamics ) {
        if( newWindPlantDynamics != windPlantDynamics ) {
            NotificationChain msgs = null;
            if( windPlantDynamics != null ) msgs = ( ( InternalEObject ) windPlantDynamics ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL, WindPlantDynamics.class, msgs );
            if( newWindPlantDynamics != null ) msgs = ( ( InternalEObject ) newWindPlantDynamics ).eInverseAdd( this,
                    CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL, WindPlantDynamics.class, msgs );
            msgs = basicSetWindPlantDynamics( newWindPlantDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantDynamicsESet = windPlantDynamicsESet;
            windPlantDynamicsESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS,
                            newWindPlantDynamics, newWindPlantDynamics, !oldWindPlantDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPlantDynamics( NotificationChain msgs ) {
        WindPlantDynamics oldWindPlantDynamics = windPlantDynamics;
        windPlantDynamics = null;
        boolean oldWindPlantDynamicsESet = windPlantDynamicsESet;
        windPlantDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS, oldWindPlantDynamics, null,
                    oldWindPlantDynamicsESet );
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
    public void unsetWindPlantDynamics() {
        if( windPlantDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPlantDynamics ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL, WindPlantDynamics.class, msgs );
            msgs = basicUnsetWindPlantDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantDynamicsESet = windPlantDynamicsESet;
            windPlantDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS, null, null, oldWindPlantDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantDynamics() {
        return windPlantDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscontinuousExcitationControlDynamics getDiscontinuousExcitationControlDynamics() {
        return discontinuousExcitationControlDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiscontinuousExcitationControlDynamics(
            DiscontinuousExcitationControlDynamics newDiscontinuousExcitationControlDynamics, NotificationChain msgs ) {
        DiscontinuousExcitationControlDynamics oldDiscontinuousExcitationControlDynamics = discontinuousExcitationControlDynamics;
        discontinuousExcitationControlDynamics = newDiscontinuousExcitationControlDynamics;
        boolean oldDiscontinuousExcitationControlDynamicsESet = discontinuousExcitationControlDynamicsESet;
        discontinuousExcitationControlDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS,
                    oldDiscontinuousExcitationControlDynamics, newDiscontinuousExcitationControlDynamics,
                    !oldDiscontinuousExcitationControlDynamicsESet );
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
    public void setDiscontinuousExcitationControlDynamics(
            DiscontinuousExcitationControlDynamics newDiscontinuousExcitationControlDynamics ) {
        if( newDiscontinuousExcitationControlDynamics != discontinuousExcitationControlDynamics ) {
            NotificationChain msgs = null;
            if( discontinuousExcitationControlDynamics != null )
                msgs = ( ( InternalEObject ) discontinuousExcitationControlDynamics ).eInverseRemove( this,
                        CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        DiscontinuousExcitationControlDynamics.class, msgs );
            if( newDiscontinuousExcitationControlDynamics != null )
                msgs = ( ( InternalEObject ) newDiscontinuousExcitationControlDynamics ).eInverseAdd( this,
                        CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        DiscontinuousExcitationControlDynamics.class, msgs );
            msgs = basicSetDiscontinuousExcitationControlDynamics( newDiscontinuousExcitationControlDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiscontinuousExcitationControlDynamicsESet = discontinuousExcitationControlDynamicsESet;
            discontinuousExcitationControlDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS,
                    newDiscontinuousExcitationControlDynamics, newDiscontinuousExcitationControlDynamics,
                    !oldDiscontinuousExcitationControlDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDiscontinuousExcitationControlDynamics( NotificationChain msgs ) {
        DiscontinuousExcitationControlDynamics oldDiscontinuousExcitationControlDynamics = discontinuousExcitationControlDynamics;
        discontinuousExcitationControlDynamics = null;
        boolean oldDiscontinuousExcitationControlDynamicsESet = discontinuousExcitationControlDynamicsESet;
        discontinuousExcitationControlDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS,
                    oldDiscontinuousExcitationControlDynamics, null, oldDiscontinuousExcitationControlDynamicsESet );
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
    public void unsetDiscontinuousExcitationControlDynamics() {
        if( discontinuousExcitationControlDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) discontinuousExcitationControlDynamics ).eInverseRemove( this,
                    CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS__REMOTE_INPUT_SIGNAL,
                    DiscontinuousExcitationControlDynamics.class, msgs );
            msgs = basicUnsetDiscontinuousExcitationControlDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiscontinuousExcitationControlDynamicsESet = discontinuousExcitationControlDynamicsESet;
            discontinuousExcitationControlDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS, null, null,
                    oldDiscontinuousExcitationControlDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiscontinuousExcitationControlDynamics() {
        return discontinuousExcitationControlDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcitationLimiterDynamics getUnderexcitationLimiterDynamics() {
        return underexcitationLimiterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUnderexcitationLimiterDynamics(
            UnderexcitationLimiterDynamics newUnderexcitationLimiterDynamics, NotificationChain msgs ) {
        UnderexcitationLimiterDynamics oldUnderexcitationLimiterDynamics = underexcitationLimiterDynamics;
        underexcitationLimiterDynamics = newUnderexcitationLimiterDynamics;
        boolean oldUnderexcitationLimiterDynamicsESet = underexcitationLimiterDynamicsESet;
        underexcitationLimiterDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__UNDEREXCITATION_LIMITER_DYNAMICS, oldUnderexcitationLimiterDynamics,
                    newUnderexcitationLimiterDynamics, !oldUnderexcitationLimiterDynamicsESet );
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
    public void setUnderexcitationLimiterDynamics( UnderexcitationLimiterDynamics newUnderexcitationLimiterDynamics ) {
        if( newUnderexcitationLimiterDynamics != underexcitationLimiterDynamics ) {
            NotificationChain msgs = null;
            if( underexcitationLimiterDynamics != null )
                msgs = ( ( InternalEObject ) underexcitationLimiterDynamics ).eInverseRemove( this,
                        CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        UnderexcitationLimiterDynamics.class, msgs );
            if( newUnderexcitationLimiterDynamics != null )
                msgs = ( ( InternalEObject ) newUnderexcitationLimiterDynamics ).eInverseAdd( this,
                        CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        UnderexcitationLimiterDynamics.class, msgs );
            msgs = basicSetUnderexcitationLimiterDynamics( newUnderexcitationLimiterDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUnderexcitationLimiterDynamicsESet = underexcitationLimiterDynamicsESet;
            underexcitationLimiterDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__UNDEREXCITATION_LIMITER_DYNAMICS, newUnderexcitationLimiterDynamics,
                    newUnderexcitationLimiterDynamics, !oldUnderexcitationLimiterDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetUnderexcitationLimiterDynamics( NotificationChain msgs ) {
        UnderexcitationLimiterDynamics oldUnderexcitationLimiterDynamics = underexcitationLimiterDynamics;
        underexcitationLimiterDynamics = null;
        boolean oldUnderexcitationLimiterDynamicsESet = underexcitationLimiterDynamicsESet;
        underexcitationLimiterDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__UNDEREXCITATION_LIMITER_DYNAMICS, oldUnderexcitationLimiterDynamics,
                    null, oldUnderexcitationLimiterDynamicsESet );
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
    public void unsetUnderexcitationLimiterDynamics() {
        if( underexcitationLimiterDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) underexcitationLimiterDynamics ).eInverseRemove( this,
                    CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS__REMOTE_INPUT_SIGNAL,
                    UnderexcitationLimiterDynamics.class, msgs );
            msgs = basicUnsetUnderexcitationLimiterDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUnderexcitationLimiterDynamicsESet = underexcitationLimiterDynamicsESet;
            underexcitationLimiterDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__UNDEREXCITATION_LIMITER_DYNAMICS, null, null,
                    oldUnderexcitationLimiterDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnderexcitationLimiterDynamics() {
        return underexcitationLimiterDynamicsESet;
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
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS, oldWindTurbineType1or2Dynamics,
                    newWindTurbineType1or2Dynamics, !oldWindTurbineType1or2DynamicsESet );
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
                        CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        WindTurbineType1or2Dynamics.class, msgs );
            if( newWindTurbineType1or2Dynamics != null )
                msgs = ( ( InternalEObject ) newWindTurbineType1or2Dynamics ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        WindTurbineType1or2Dynamics.class, msgs );
            msgs = basicSetWindTurbineType1or2Dynamics( newWindTurbineType1or2Dynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType1or2DynamicsESet = windTurbineType1or2DynamicsESet;
            windTurbineType1or2DynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS, newWindTurbineType1or2Dynamics,
                    newWindTurbineType1or2Dynamics, !oldWindTurbineType1or2DynamicsESet ) );
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
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS, oldWindTurbineType1or2Dynamics,
                    null, oldWindTurbineType1or2DynamicsESet );
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
                    CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL, WindTurbineType1or2Dynamics.class,
                    msgs );
            msgs = basicUnsetWindTurbineType1or2Dynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType1or2DynamicsESet = windTurbineType1or2DynamicsESet;
            windTurbineType1or2DynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS, null, null,
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.REMOTE_INPUT_SIGNAL__VOLTAGE_COMPENSATOR_DYNAMICS:
            if( voltageCompensatorDynamics != null )
                msgs = ( ( InternalEObject ) voltageCompensatorDynamics ).eInverseRemove( this,
                        CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS__REMOTE_INPUT_SIGNAL, VoltageCompensatorDynamics.class,
                        msgs );
            return basicSetVoltageCompensatorDynamics( ( VoltageCompensatorDynamics ) otherEnd, msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS:
            if( powerSystemStabilizerDynamics != null )
                msgs = ( ( InternalEObject ) powerSystemStabilizerDynamics ).eInverseRemove( this,
                        CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        PowerSystemStabilizerDynamics.class, msgs );
            return basicSetPowerSystemStabilizerDynamics( ( PowerSystemStabilizerDynamics ) otherEnd, msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            if( windTurbineType3or4Dynamics != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4Dynamics ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        WindTurbineType3or4Dynamics.class, msgs );
            return basicSetWindTurbineType3or4Dynamics( ( WindTurbineType3or4Dynamics ) otherEnd, msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL:
            if( terminal != null ) msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL, Terminal.class, msgs );
            return basicSetTerminal( ( Terminal ) otherEnd, msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            if( pfvArControllerType1Dynamics != null )
                msgs = ( ( InternalEObject ) pfvArControllerType1Dynamics ).eInverseRemove( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        PFVArControllerType1Dynamics.class, msgs );
            return basicSetPFVArControllerType1Dynamics( ( PFVArControllerType1Dynamics ) otherEnd, msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS:
            if( windPlantDynamics != null ) msgs = ( ( InternalEObject ) windPlantDynamics ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL, WindPlantDynamics.class, msgs );
            return basicSetWindPlantDynamics( ( WindPlantDynamics ) otherEnd, msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            if( discontinuousExcitationControlDynamics != null )
                msgs = ( ( InternalEObject ) discontinuousExcitationControlDynamics ).eInverseRemove( this,
                        CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        DiscontinuousExcitationControlDynamics.class, msgs );
            return basicSetDiscontinuousExcitationControlDynamics( ( DiscontinuousExcitationControlDynamics ) otherEnd,
                    msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__UNDEREXCITATION_LIMITER_DYNAMICS:
            if( underexcitationLimiterDynamics != null )
                msgs = ( ( InternalEObject ) underexcitationLimiterDynamics ).eInverseRemove( this,
                        CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        UnderexcitationLimiterDynamics.class, msgs );
            return basicSetUnderexcitationLimiterDynamics( ( UnderexcitationLimiterDynamics ) otherEnd, msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            if( windTurbineType1or2Dynamics != null )
                msgs = ( ( InternalEObject ) windTurbineType1or2Dynamics ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS__REMOTE_INPUT_SIGNAL,
                        WindTurbineType1or2Dynamics.class, msgs );
            return basicSetWindTurbineType1or2Dynamics( ( WindTurbineType1or2Dynamics ) otherEnd, msgs );
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
        case CimPackage.REMOTE_INPUT_SIGNAL__VOLTAGE_COMPENSATOR_DYNAMICS:
            return basicUnsetVoltageCompensatorDynamics( msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS:
            return basicUnsetPowerSystemStabilizerDynamics( msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return basicUnsetWindTurbineType3or4Dynamics( msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL:
            return basicUnsetTerminal( msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            return basicUnsetPFVArControllerType1Dynamics( msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS:
            return basicUnsetWindPlantDynamics( msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            return basicUnsetDiscontinuousExcitationControlDynamics( msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__UNDEREXCITATION_LIMITER_DYNAMICS:
            return basicUnsetUnderexcitationLimiterDynamics( msgs );
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            return basicUnsetWindTurbineType1or2Dynamics( msgs );
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
        case CimPackage.REMOTE_INPUT_SIGNAL__REMOTE_SIGNAL_TYPE:
            return getRemoteSignalType();
        case CimPackage.REMOTE_INPUT_SIGNAL__VOLTAGE_COMPENSATOR_DYNAMICS:
            return getVoltageCompensatorDynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS:
            return getPowerSystemStabilizerDynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return getWindTurbineType3or4Dynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL:
            return getTerminal();
        case CimPackage.REMOTE_INPUT_SIGNAL__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            return getPFVArControllerType1Dynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS:
            return getWindPlantDynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            return getDiscontinuousExcitationControlDynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__UNDEREXCITATION_LIMITER_DYNAMICS:
            return getUnderexcitationLimiterDynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            return getWindTurbineType1or2Dynamics();
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
        case CimPackage.REMOTE_INPUT_SIGNAL__REMOTE_SIGNAL_TYPE:
            setRemoteSignalType( ( RemoteSignalKind ) newValue );
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__VOLTAGE_COMPENSATOR_DYNAMICS:
            setVoltageCompensatorDynamics( ( VoltageCompensatorDynamics ) newValue );
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS:
            setPowerSystemStabilizerDynamics( ( PowerSystemStabilizerDynamics ) newValue );
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            setWindTurbineType3or4Dynamics( ( WindTurbineType3or4Dynamics ) newValue );
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL:
            setTerminal( ( Terminal ) newValue );
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            setPFVArControllerType1Dynamics( ( PFVArControllerType1Dynamics ) newValue );
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS:
            setWindPlantDynamics( ( WindPlantDynamics ) newValue );
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            setDiscontinuousExcitationControlDynamics( ( DiscontinuousExcitationControlDynamics ) newValue );
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__UNDEREXCITATION_LIMITER_DYNAMICS:
            setUnderexcitationLimiterDynamics( ( UnderexcitationLimiterDynamics ) newValue );
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            setWindTurbineType1or2Dynamics( ( WindTurbineType1or2Dynamics ) newValue );
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
        case CimPackage.REMOTE_INPUT_SIGNAL__REMOTE_SIGNAL_TYPE:
            unsetRemoteSignalType();
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__VOLTAGE_COMPENSATOR_DYNAMICS:
            unsetVoltageCompensatorDynamics();
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS:
            unsetPowerSystemStabilizerDynamics();
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            unsetWindTurbineType3or4Dynamics();
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL:
            unsetTerminal();
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            unsetPFVArControllerType1Dynamics();
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS:
            unsetWindPlantDynamics();
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            unsetDiscontinuousExcitationControlDynamics();
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__UNDEREXCITATION_LIMITER_DYNAMICS:
            unsetUnderexcitationLimiterDynamics();
            return;
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            unsetWindTurbineType1or2Dynamics();
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
        case CimPackage.REMOTE_INPUT_SIGNAL__REMOTE_SIGNAL_TYPE:
            return isSetRemoteSignalType();
        case CimPackage.REMOTE_INPUT_SIGNAL__VOLTAGE_COMPENSATOR_DYNAMICS:
            return isSetVoltageCompensatorDynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__POWER_SYSTEM_STABILIZER_DYNAMICS:
            return isSetPowerSystemStabilizerDynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return isSetWindTurbineType3or4Dynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL:
            return isSetTerminal();
        case CimPackage.REMOTE_INPUT_SIGNAL__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            return isSetPFVArControllerType1Dynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS:
            return isSetWindPlantDynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            return isSetDiscontinuousExcitationControlDynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__UNDEREXCITATION_LIMITER_DYNAMICS:
            return isSetUnderexcitationLimiterDynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE1OR2_DYNAMICS:
            return isSetWindTurbineType1or2Dynamics();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (remoteSignalType: " );
        if( remoteSignalTypeESet )
            result.append( remoteSignalType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RemoteInputSignalImpl
