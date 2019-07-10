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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscontinuousExcitationControlDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcitationLimiterDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType1Dynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType2Dynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemStabilizerDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcitationLimiterDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorDynamics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Excitation System Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcitationSystemDynamicsImpl#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcitationSystemDynamicsImpl#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcitationSystemDynamicsImpl#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcitationSystemDynamicsImpl#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcitationSystemDynamicsImpl#getPFVArControllerType2Dynamics <em>PFV Ar Controller Type2 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcitationSystemDynamicsImpl#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcitationSystemDynamicsImpl#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcitationSystemDynamicsImpl#getOverexcitationLimiterDynamics <em>Overexcitation Limiter Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcitationSystemDynamicsImpl extends DynamicsFunctionBlockImpl implements ExcitationSystemDynamics {
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
     * The cached value of the '{@link #getPFVArControllerType2Dynamics() <em>PFV Ar Controller Type2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPFVArControllerType2Dynamics()
     * @generated
     * @ordered
     */
    protected PFVArControllerType2Dynamics pfvArControllerType2Dynamics;

    /**
     * This is true if the PFV Ar Controller Type2 Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pfvArControllerType2DynamicsESet;

    /**
     * The cached value of the '{@link #getSynchronousMachineDynamics() <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected SynchronousMachineDynamics synchronousMachineDynamics;

    /**
     * This is true if the Synchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchronousMachineDynamicsESet;

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
     * The cached value of the '{@link #getOverexcitationLimiterDynamics() <em>Overexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOverexcitationLimiterDynamics()
     * @generated
     * @ordered
     */
    protected OverexcitationLimiterDynamics overexcitationLimiterDynamics;

    /**
     * This is true if the Overexcitation Limiter Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean overexcitationLimiterDynamicsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcitationSystemDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcitationSystemDynamics();
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS,
                    oldPowerSystemStabilizerDynamics, newPowerSystemStabilizerDynamics,
                    !oldPowerSystemStabilizerDynamicsESet );
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
                        CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        PowerSystemStabilizerDynamics.class, msgs );
            if( newPowerSystemStabilizerDynamics != null )
                msgs = ( ( InternalEObject ) newPowerSystemStabilizerDynamics ).eInverseAdd( this,
                        CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        PowerSystemStabilizerDynamics.class, msgs );
            msgs = basicSetPowerSystemStabilizerDynamics( newPowerSystemStabilizerDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemStabilizerDynamicsESet = powerSystemStabilizerDynamicsESet;
            powerSystemStabilizerDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS,
                    newPowerSystemStabilizerDynamics, newPowerSystemStabilizerDynamics,
                    !oldPowerSystemStabilizerDynamicsESet ) );
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS,
                    oldPowerSystemStabilizerDynamics, null, oldPowerSystemStabilizerDynamicsESet );
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
                    CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    PowerSystemStabilizerDynamics.class, msgs );
            msgs = basicUnsetPowerSystemStabilizerDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemStabilizerDynamicsESet = powerSystemStabilizerDynamicsESet;
            powerSystemStabilizerDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS, null, null,
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
    public UnderexcitationLimiterDynamics getUnderexcitationLimiterDynamics() {
        if( underexcitationLimiterDynamics != null && underexcitationLimiterDynamics.eIsProxy() ) {
            InternalEObject oldUnderexcitationLimiterDynamics = ( InternalEObject ) underexcitationLimiterDynamics;
            underexcitationLimiterDynamics = ( UnderexcitationLimiterDynamics ) eResolveProxy(
                    oldUnderexcitationLimiterDynamics );
            if( underexcitationLimiterDynamics != oldUnderexcitationLimiterDynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS,
                        oldUnderexcitationLimiterDynamics, underexcitationLimiterDynamics ) );
            }
        }
        return underexcitationLimiterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnderexcitationLimiterDynamics basicGetUnderexcitationLimiterDynamics() {
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS,
                    oldUnderexcitationLimiterDynamics, newUnderexcitationLimiterDynamics,
                    !oldUnderexcitationLimiterDynamicsESet );
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
                        CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        UnderexcitationLimiterDynamics.class, msgs );
            if( newUnderexcitationLimiterDynamics != null )
                msgs = ( ( InternalEObject ) newUnderexcitationLimiterDynamics ).eInverseAdd( this,
                        CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        UnderexcitationLimiterDynamics.class, msgs );
            msgs = basicSetUnderexcitationLimiterDynamics( newUnderexcitationLimiterDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUnderexcitationLimiterDynamicsESet = underexcitationLimiterDynamicsESet;
            underexcitationLimiterDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS,
                    newUnderexcitationLimiterDynamics, newUnderexcitationLimiterDynamics,
                    !oldUnderexcitationLimiterDynamicsESet ) );
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS,
                    oldUnderexcitationLimiterDynamics, null, oldUnderexcitationLimiterDynamicsESet );
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
                    CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    UnderexcitationLimiterDynamics.class, msgs );
            msgs = basicUnsetUnderexcitationLimiterDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUnderexcitationLimiterDynamicsESet = underexcitationLimiterDynamicsESet;
            underexcitationLimiterDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS, null, null,
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
    public PFVArControllerType1Dynamics getPFVArControllerType1Dynamics() {
        if( pfvArControllerType1Dynamics != null && pfvArControllerType1Dynamics.eIsProxy() ) {
            InternalEObject oldPFVArControllerType1Dynamics = ( InternalEObject ) pfvArControllerType1Dynamics;
            pfvArControllerType1Dynamics = ( PFVArControllerType1Dynamics ) eResolveProxy(
                    oldPFVArControllerType1Dynamics );
            if( pfvArControllerType1Dynamics != oldPFVArControllerType1Dynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS,
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS,
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
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        PFVArControllerType1Dynamics.class, msgs );
            if( newPFVArControllerType1Dynamics != null )
                msgs = ( ( InternalEObject ) newPFVArControllerType1Dynamics ).eInverseAdd( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        PFVArControllerType1Dynamics.class, msgs );
            msgs = basicSetPFVArControllerType1Dynamics( newPFVArControllerType1Dynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType1DynamicsESet = pfvArControllerType1DynamicsESet;
            pfvArControllerType1DynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS,
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS,
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
                    CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    PFVArControllerType1Dynamics.class, msgs );
            msgs = basicUnsetPFVArControllerType1Dynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType1DynamicsESet = pfvArControllerType1DynamicsESet;
            pfvArControllerType1DynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS, null, null,
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
    public DiscontinuousExcitationControlDynamics getDiscontinuousExcitationControlDynamics() {
        if( discontinuousExcitationControlDynamics != null && discontinuousExcitationControlDynamics.eIsProxy() ) {
            InternalEObject oldDiscontinuousExcitationControlDynamics = ( InternalEObject ) discontinuousExcitationControlDynamics;
            discontinuousExcitationControlDynamics = ( DiscontinuousExcitationControlDynamics ) eResolveProxy(
                    oldDiscontinuousExcitationControlDynamics );
            if( discontinuousExcitationControlDynamics != oldDiscontinuousExcitationControlDynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS,
                        oldDiscontinuousExcitationControlDynamics, discontinuousExcitationControlDynamics ) );
            }
        }
        return discontinuousExcitationControlDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiscontinuousExcitationControlDynamics basicGetDiscontinuousExcitationControlDynamics() {
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS,
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
                        CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        DiscontinuousExcitationControlDynamics.class, msgs );
            if( newDiscontinuousExcitationControlDynamics != null )
                msgs = ( ( InternalEObject ) newDiscontinuousExcitationControlDynamics ).eInverseAdd( this,
                        CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        DiscontinuousExcitationControlDynamics.class, msgs );
            msgs = basicSetDiscontinuousExcitationControlDynamics( newDiscontinuousExcitationControlDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiscontinuousExcitationControlDynamicsESet = discontinuousExcitationControlDynamicsESet;
            discontinuousExcitationControlDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS,
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS,
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
                    CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    DiscontinuousExcitationControlDynamics.class, msgs );
            msgs = basicUnsetDiscontinuousExcitationControlDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiscontinuousExcitationControlDynamicsESet = discontinuousExcitationControlDynamicsESet;
            discontinuousExcitationControlDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS, null, null,
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
    public PFVArControllerType2Dynamics getPFVArControllerType2Dynamics() {
        return pfvArControllerType2Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPFVArControllerType2Dynamics(
            PFVArControllerType2Dynamics newPFVArControllerType2Dynamics, NotificationChain msgs ) {
        PFVArControllerType2Dynamics oldPFVArControllerType2Dynamics = pfvArControllerType2Dynamics;
        pfvArControllerType2Dynamics = newPFVArControllerType2Dynamics;
        boolean oldPFVArControllerType2DynamicsESet = pfvArControllerType2DynamicsESet;
        pfvArControllerType2DynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_DYNAMICS,
                    oldPFVArControllerType2Dynamics, newPFVArControllerType2Dynamics,
                    !oldPFVArControllerType2DynamicsESet );
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
    public void setPFVArControllerType2Dynamics( PFVArControllerType2Dynamics newPFVArControllerType2Dynamics ) {
        if( newPFVArControllerType2Dynamics != pfvArControllerType2Dynamics ) {
            NotificationChain msgs = null;
            if( pfvArControllerType2Dynamics != null )
                msgs = ( ( InternalEObject ) pfvArControllerType2Dynamics ).eInverseRemove( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE2_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        PFVArControllerType2Dynamics.class, msgs );
            if( newPFVArControllerType2Dynamics != null )
                msgs = ( ( InternalEObject ) newPFVArControllerType2Dynamics ).eInverseAdd( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE2_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        PFVArControllerType2Dynamics.class, msgs );
            msgs = basicSetPFVArControllerType2Dynamics( newPFVArControllerType2Dynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType2DynamicsESet = pfvArControllerType2DynamicsESet;
            pfvArControllerType2DynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_DYNAMICS,
                    newPFVArControllerType2Dynamics, newPFVArControllerType2Dynamics,
                    !oldPFVArControllerType2DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPFVArControllerType2Dynamics( NotificationChain msgs ) {
        PFVArControllerType2Dynamics oldPFVArControllerType2Dynamics = pfvArControllerType2Dynamics;
        pfvArControllerType2Dynamics = null;
        boolean oldPFVArControllerType2DynamicsESet = pfvArControllerType2DynamicsESet;
        pfvArControllerType2DynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_DYNAMICS,
                    oldPFVArControllerType2Dynamics, null, oldPFVArControllerType2DynamicsESet );
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
    public void unsetPFVArControllerType2Dynamics() {
        if( pfvArControllerType2Dynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) pfvArControllerType2Dynamics ).eInverseRemove( this,
                    CimPackage.PFV_AR_CONTROLLER_TYPE2_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    PFVArControllerType2Dynamics.class, msgs );
            msgs = basicUnsetPFVArControllerType2Dynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType2DynamicsESet = pfvArControllerType2DynamicsESet;
            pfvArControllerType2DynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_DYNAMICS, null, null,
                    oldPFVArControllerType2DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPFVArControllerType2Dynamics() {
        return pfvArControllerType2DynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDynamics getSynchronousMachineDynamics() {
        if( synchronousMachineDynamics != null && synchronousMachineDynamics.eIsProxy() ) {
            InternalEObject oldSynchronousMachineDynamics = ( InternalEObject ) synchronousMachineDynamics;
            synchronousMachineDynamics = ( SynchronousMachineDynamics ) eResolveProxy( oldSynchronousMachineDynamics );
            if( synchronousMachineDynamics != oldSynchronousMachineDynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS,
                        oldSynchronousMachineDynamics, synchronousMachineDynamics ) );
            }
        }
        return synchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineDynamics basicGetSynchronousMachineDynamics() {
        return synchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSynchronousMachineDynamics(
            SynchronousMachineDynamics newSynchronousMachineDynamics, NotificationChain msgs ) {
        SynchronousMachineDynamics oldSynchronousMachineDynamics = synchronousMachineDynamics;
        synchronousMachineDynamics = newSynchronousMachineDynamics;
        boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
        synchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics,
                    newSynchronousMachineDynamics, !oldSynchronousMachineDynamicsESet );
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
    public void setSynchronousMachineDynamics( SynchronousMachineDynamics newSynchronousMachineDynamics ) {
        if( newSynchronousMachineDynamics != synchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( synchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        SynchronousMachineDynamics.class, msgs );
            if( newSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newSynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        SynchronousMachineDynamics.class, msgs );
            msgs = basicSetSynchronousMachineDynamics( newSynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
            synchronousMachineDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, newSynchronousMachineDynamics,
                    newSynchronousMachineDynamics, !oldSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSynchronousMachineDynamics( NotificationChain msgs ) {
        SynchronousMachineDynamics oldSynchronousMachineDynamics = synchronousMachineDynamics;
        synchronousMachineDynamics = null;
        boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
        synchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics,
                    null, oldSynchronousMachineDynamicsESet );
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
    public void unsetSynchronousMachineDynamics() {
        if( synchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    SynchronousMachineDynamics.class, msgs );
            msgs = basicUnsetSynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
            synchronousMachineDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, null, null,
                    oldSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachineDynamics() {
        return synchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageCompensatorDynamics getVoltageCompensatorDynamics() {
        if( voltageCompensatorDynamics != null && voltageCompensatorDynamics.eIsProxy() ) {
            InternalEObject oldVoltageCompensatorDynamics = ( InternalEObject ) voltageCompensatorDynamics;
            voltageCompensatorDynamics = ( VoltageCompensatorDynamics ) eResolveProxy( oldVoltageCompensatorDynamics );
            if( voltageCompensatorDynamics != oldVoltageCompensatorDynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS,
                        oldVoltageCompensatorDynamics, voltageCompensatorDynamics ) );
            }
        }
        return voltageCompensatorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VoltageCompensatorDynamics basicGetVoltageCompensatorDynamics() {
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS, oldVoltageCompensatorDynamics,
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
                        CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        VoltageCompensatorDynamics.class, msgs );
            if( newVoltageCompensatorDynamics != null )
                msgs = ( ( InternalEObject ) newVoltageCompensatorDynamics ).eInverseAdd( this,
                        CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        VoltageCompensatorDynamics.class, msgs );
            msgs = basicSetVoltageCompensatorDynamics( newVoltageCompensatorDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageCompensatorDynamicsESet = voltageCompensatorDynamicsESet;
            voltageCompensatorDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS, newVoltageCompensatorDynamics,
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
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS, oldVoltageCompensatorDynamics,
                    null, oldVoltageCompensatorDynamicsESet );
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
                    CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    VoltageCompensatorDynamics.class, msgs );
            msgs = basicUnsetVoltageCompensatorDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageCompensatorDynamicsESet = voltageCompensatorDynamicsESet;
            voltageCompensatorDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS, null, null,
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
    public OverexcitationLimiterDynamics getOverexcitationLimiterDynamics() {
        if( overexcitationLimiterDynamics != null && overexcitationLimiterDynamics.eIsProxy() ) {
            InternalEObject oldOverexcitationLimiterDynamics = ( InternalEObject ) overexcitationLimiterDynamics;
            overexcitationLimiterDynamics = ( OverexcitationLimiterDynamics ) eResolveProxy(
                    oldOverexcitationLimiterDynamics );
            if( overexcitationLimiterDynamics != oldOverexcitationLimiterDynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS,
                        oldOverexcitationLimiterDynamics, overexcitationLimiterDynamics ) );
            }
        }
        return overexcitationLimiterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OverexcitationLimiterDynamics basicGetOverexcitationLimiterDynamics() {
        return overexcitationLimiterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOverexcitationLimiterDynamics(
            OverexcitationLimiterDynamics newOverexcitationLimiterDynamics, NotificationChain msgs ) {
        OverexcitationLimiterDynamics oldOverexcitationLimiterDynamics = overexcitationLimiterDynamics;
        overexcitationLimiterDynamics = newOverexcitationLimiterDynamics;
        boolean oldOverexcitationLimiterDynamicsESet = overexcitationLimiterDynamicsESet;
        overexcitationLimiterDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS,
                    oldOverexcitationLimiterDynamics, newOverexcitationLimiterDynamics,
                    !oldOverexcitationLimiterDynamicsESet );
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
    public void setOverexcitationLimiterDynamics( OverexcitationLimiterDynamics newOverexcitationLimiterDynamics ) {
        if( newOverexcitationLimiterDynamics != overexcitationLimiterDynamics ) {
            NotificationChain msgs = null;
            if( overexcitationLimiterDynamics != null )
                msgs = ( ( InternalEObject ) overexcitationLimiterDynamics ).eInverseRemove( this,
                        CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        OverexcitationLimiterDynamics.class, msgs );
            if( newOverexcitationLimiterDynamics != null )
                msgs = ( ( InternalEObject ) newOverexcitationLimiterDynamics ).eInverseAdd( this,
                        CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        OverexcitationLimiterDynamics.class, msgs );
            msgs = basicSetOverexcitationLimiterDynamics( newOverexcitationLimiterDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOverexcitationLimiterDynamicsESet = overexcitationLimiterDynamicsESet;
            overexcitationLimiterDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS,
                    newOverexcitationLimiterDynamics, newOverexcitationLimiterDynamics,
                    !oldOverexcitationLimiterDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOverexcitationLimiterDynamics( NotificationChain msgs ) {
        OverexcitationLimiterDynamics oldOverexcitationLimiterDynamics = overexcitationLimiterDynamics;
        overexcitationLimiterDynamics = null;
        boolean oldOverexcitationLimiterDynamicsESet = overexcitationLimiterDynamicsESet;
        overexcitationLimiterDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS,
                    oldOverexcitationLimiterDynamics, null, oldOverexcitationLimiterDynamicsESet );
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
    public void unsetOverexcitationLimiterDynamics() {
        if( overexcitationLimiterDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) overexcitationLimiterDynamics ).eInverseRemove( this,
                    CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                    OverexcitationLimiterDynamics.class, msgs );
            msgs = basicUnsetOverexcitationLimiterDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOverexcitationLimiterDynamicsESet = overexcitationLimiterDynamicsESet;
            overexcitationLimiterDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS, null, null,
                    oldOverexcitationLimiterDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOverexcitationLimiterDynamics() {
        return overexcitationLimiterDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS:
            if( powerSystemStabilizerDynamics != null )
                msgs = ( ( InternalEObject ) powerSystemStabilizerDynamics ).eInverseRemove( this,
                        CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        PowerSystemStabilizerDynamics.class, msgs );
            return basicSetPowerSystemStabilizerDynamics( ( PowerSystemStabilizerDynamics ) otherEnd, msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS:
            if( underexcitationLimiterDynamics != null )
                msgs = ( ( InternalEObject ) underexcitationLimiterDynamics ).eInverseRemove( this,
                        CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        UnderexcitationLimiterDynamics.class, msgs );
            return basicSetUnderexcitationLimiterDynamics( ( UnderexcitationLimiterDynamics ) otherEnd, msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            if( pfvArControllerType1Dynamics != null )
                msgs = ( ( InternalEObject ) pfvArControllerType1Dynamics ).eInverseRemove( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        PFVArControllerType1Dynamics.class, msgs );
            return basicSetPFVArControllerType1Dynamics( ( PFVArControllerType1Dynamics ) otherEnd, msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            if( discontinuousExcitationControlDynamics != null )
                msgs = ( ( InternalEObject ) discontinuousExcitationControlDynamics ).eInverseRemove( this,
                        CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        DiscontinuousExcitationControlDynamics.class, msgs );
            return basicSetDiscontinuousExcitationControlDynamics( ( DiscontinuousExcitationControlDynamics ) otherEnd,
                    msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_DYNAMICS:
            if( pfvArControllerType2Dynamics != null )
                msgs = ( ( InternalEObject ) pfvArControllerType2Dynamics ).eInverseRemove( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE2_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        PFVArControllerType2Dynamics.class, msgs );
            return basicSetPFVArControllerType2Dynamics( ( PFVArControllerType2Dynamics ) otherEnd, msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            if( synchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        SynchronousMachineDynamics.class, msgs );
            return basicSetSynchronousMachineDynamics( ( SynchronousMachineDynamics ) otherEnd, msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS:
            if( voltageCompensatorDynamics != null )
                msgs = ( ( InternalEObject ) voltageCompensatorDynamics ).eInverseRemove( this,
                        CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        VoltageCompensatorDynamics.class, msgs );
            return basicSetVoltageCompensatorDynamics( ( VoltageCompensatorDynamics ) otherEnd, msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS:
            if( overexcitationLimiterDynamics != null )
                msgs = ( ( InternalEObject ) overexcitationLimiterDynamics ).eInverseRemove( this,
                        CimPackage.OVEREXCITATION_LIMITER_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        OverexcitationLimiterDynamics.class, msgs );
            return basicSetOverexcitationLimiterDynamics( ( OverexcitationLimiterDynamics ) otherEnd, msgs );
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
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS:
            return basicUnsetPowerSystemStabilizerDynamics( msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS:
            return basicUnsetUnderexcitationLimiterDynamics( msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            return basicUnsetPFVArControllerType1Dynamics( msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            return basicUnsetDiscontinuousExcitationControlDynamics( msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_DYNAMICS:
            return basicUnsetPFVArControllerType2Dynamics( msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetSynchronousMachineDynamics( msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS:
            return basicUnsetVoltageCompensatorDynamics( msgs );
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS:
            return basicUnsetOverexcitationLimiterDynamics( msgs );
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
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS:
            return getPowerSystemStabilizerDynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS:
            if( resolve ) return getUnderexcitationLimiterDynamics();
            return basicGetUnderexcitationLimiterDynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            if( resolve ) return getPFVArControllerType1Dynamics();
            return basicGetPFVArControllerType1Dynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            if( resolve ) return getDiscontinuousExcitationControlDynamics();
            return basicGetDiscontinuousExcitationControlDynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_DYNAMICS:
            return getPFVArControllerType2Dynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            if( resolve ) return getSynchronousMachineDynamics();
            return basicGetSynchronousMachineDynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS:
            if( resolve ) return getVoltageCompensatorDynamics();
            return basicGetVoltageCompensatorDynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS:
            if( resolve ) return getOverexcitationLimiterDynamics();
            return basicGetOverexcitationLimiterDynamics();
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
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS:
            setPowerSystemStabilizerDynamics( ( PowerSystemStabilizerDynamics ) newValue );
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS:
            setUnderexcitationLimiterDynamics( ( UnderexcitationLimiterDynamics ) newValue );
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            setPFVArControllerType1Dynamics( ( PFVArControllerType1Dynamics ) newValue );
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            setDiscontinuousExcitationControlDynamics( ( DiscontinuousExcitationControlDynamics ) newValue );
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_DYNAMICS:
            setPFVArControllerType2Dynamics( ( PFVArControllerType2Dynamics ) newValue );
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            setSynchronousMachineDynamics( ( SynchronousMachineDynamics ) newValue );
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS:
            setVoltageCompensatorDynamics( ( VoltageCompensatorDynamics ) newValue );
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS:
            setOverexcitationLimiterDynamics( ( OverexcitationLimiterDynamics ) newValue );
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
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS:
            unsetPowerSystemStabilizerDynamics();
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS:
            unsetUnderexcitationLimiterDynamics();
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            unsetPFVArControllerType1Dynamics();
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            unsetDiscontinuousExcitationControlDynamics();
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_DYNAMICS:
            unsetPFVArControllerType2Dynamics();
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            unsetSynchronousMachineDynamics();
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS:
            unsetVoltageCompensatorDynamics();
            return;
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS:
            unsetOverexcitationLimiterDynamics();
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
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__POWER_SYSTEM_STABILIZER_DYNAMICS:
            return isSetPowerSystemStabilizerDynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__UNDEREXCITATION_LIMITER_DYNAMICS:
            return isSetUnderexcitationLimiterDynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            return isSetPFVArControllerType1Dynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            return isSetDiscontinuousExcitationControlDynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_DYNAMICS:
            return isSetPFVArControllerType2Dynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetSynchronousMachineDynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__VOLTAGE_COMPENSATOR_DYNAMICS:
            return isSetVoltageCompensatorDynamics();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS__OVEREXCITATION_LIMITER_DYNAMICS:
            return isSetOverexcitationLimiterDynamics();
        }
        return super.eIsSet( featureID );
    }

} //ExcitationSystemDynamicsImpl
