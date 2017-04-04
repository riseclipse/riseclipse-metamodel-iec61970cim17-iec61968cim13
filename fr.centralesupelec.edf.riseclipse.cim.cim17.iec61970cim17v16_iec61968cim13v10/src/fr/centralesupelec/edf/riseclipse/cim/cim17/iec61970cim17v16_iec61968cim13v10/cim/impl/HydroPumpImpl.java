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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPumpOpSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Pump</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPumpImpl#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPumpImpl#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPumpImpl#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPumpImpl#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPumpImpl#getRotatingMachine <em>Rotating Machine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPumpImpl#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPumpImpl#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroPumpImpl extends EquipmentImpl implements HydroPump {
    /**
     * The default value of the '{@link #getPumpDischAtMaxHead() <em>Pump Disch At Max Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPumpDischAtMaxHead()
     * @generated
     * @ordered
     */
    protected static final Float PUMP_DISCH_AT_MAX_HEAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPumpDischAtMaxHead() <em>Pump Disch At Max Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPumpDischAtMaxHead()
     * @generated
     * @ordered
     */
    protected Float pumpDischAtMaxHead = PUMP_DISCH_AT_MAX_HEAD_EDEFAULT;

    /**
     * This is true if the Pump Disch At Max Head attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pumpDischAtMaxHeadESet;

    /**
     * The default value of the '{@link #getPumpDischAtMinHead() <em>Pump Disch At Min Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPumpDischAtMinHead()
     * @generated
     * @ordered
     */
    protected static final Float PUMP_DISCH_AT_MIN_HEAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPumpDischAtMinHead() <em>Pump Disch At Min Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPumpDischAtMinHead()
     * @generated
     * @ordered
     */
    protected Float pumpDischAtMinHead = PUMP_DISCH_AT_MIN_HEAD_EDEFAULT;

    /**
     * This is true if the Pump Disch At Min Head attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pumpDischAtMinHeadESet;

    /**
     * The default value of the '{@link #getPumpPowerAtMaxHead() <em>Pump Power At Max Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPumpPowerAtMaxHead()
     * @generated
     * @ordered
     */
    protected static final Float PUMP_POWER_AT_MAX_HEAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPumpPowerAtMaxHead() <em>Pump Power At Max Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPumpPowerAtMaxHead()
     * @generated
     * @ordered
     */
    protected Float pumpPowerAtMaxHead = PUMP_POWER_AT_MAX_HEAD_EDEFAULT;

    /**
     * This is true if the Pump Power At Max Head attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pumpPowerAtMaxHeadESet;

    /**
     * The default value of the '{@link #getPumpPowerAtMinHead() <em>Pump Power At Min Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPumpPowerAtMinHead()
     * @generated
     * @ordered
     */
    protected static final Float PUMP_POWER_AT_MIN_HEAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPumpPowerAtMinHead() <em>Pump Power At Min Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPumpPowerAtMinHead()
     * @generated
     * @ordered
     */
    protected Float pumpPowerAtMinHead = PUMP_POWER_AT_MIN_HEAD_EDEFAULT;

    /**
     * This is true if the Pump Power At Min Head attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pumpPowerAtMinHeadESet;

    /**
     * The cached value of the '{@link #getRotatingMachine() <em>Rotating Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotatingMachine()
     * @generated
     * @ordered
     */
    protected RotatingMachine rotatingMachine;

    /**
     * This is true if the Rotating Machine reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rotatingMachineESet;

    /**
     * The cached value of the '{@link #getHydroPowerPlant() <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPowerPlant()
     * @generated
     * @ordered
     */
    protected HydroPowerPlant hydroPowerPlant;

    /**
     * This is true if the Hydro Power Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroPowerPlantESet;

    /**
     * The cached value of the '{@link #getHydroPumpOpSchedule() <em>Hydro Pump Op Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPumpOpSchedule()
     * @generated
     * @ordered
     */
    protected HydroPumpOpSchedule hydroPumpOpSchedule;

    /**
     * This is true if the Hydro Pump Op Schedule reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroPumpOpScheduleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HydroPumpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHydroPump();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPumpDischAtMaxHead() {
        return pumpDischAtMaxHead;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPumpDischAtMaxHead( Float newPumpDischAtMaxHead ) {
        Float oldPumpDischAtMaxHead = pumpDischAtMaxHead;
        pumpDischAtMaxHead = newPumpDischAtMaxHead;
        boolean oldPumpDischAtMaxHeadESet = pumpDischAtMaxHeadESet;
        pumpDischAtMaxHeadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD,
                    oldPumpDischAtMaxHead, pumpDischAtMaxHead, !oldPumpDischAtMaxHeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPumpDischAtMaxHead() {
        Float oldPumpDischAtMaxHead = pumpDischAtMaxHead;
        boolean oldPumpDischAtMaxHeadESet = pumpDischAtMaxHeadESet;
        pumpDischAtMaxHead = PUMP_DISCH_AT_MAX_HEAD_EDEFAULT;
        pumpDischAtMaxHeadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD,
                    oldPumpDischAtMaxHead, PUMP_DISCH_AT_MAX_HEAD_EDEFAULT, oldPumpDischAtMaxHeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPumpDischAtMaxHead() {
        return pumpDischAtMaxHeadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPumpDischAtMinHead() {
        return pumpDischAtMinHead;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPumpDischAtMinHead( Float newPumpDischAtMinHead ) {
        Float oldPumpDischAtMinHead = pumpDischAtMinHead;
        pumpDischAtMinHead = newPumpDischAtMinHead;
        boolean oldPumpDischAtMinHeadESet = pumpDischAtMinHeadESet;
        pumpDischAtMinHeadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD,
                    oldPumpDischAtMinHead, pumpDischAtMinHead, !oldPumpDischAtMinHeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPumpDischAtMinHead() {
        Float oldPumpDischAtMinHead = pumpDischAtMinHead;
        boolean oldPumpDischAtMinHeadESet = pumpDischAtMinHeadESet;
        pumpDischAtMinHead = PUMP_DISCH_AT_MIN_HEAD_EDEFAULT;
        pumpDischAtMinHeadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD,
                    oldPumpDischAtMinHead, PUMP_DISCH_AT_MIN_HEAD_EDEFAULT, oldPumpDischAtMinHeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPumpDischAtMinHead() {
        return pumpDischAtMinHeadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPumpPowerAtMaxHead() {
        return pumpPowerAtMaxHead;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPumpPowerAtMaxHead( Float newPumpPowerAtMaxHead ) {
        Float oldPumpPowerAtMaxHead = pumpPowerAtMaxHead;
        pumpPowerAtMaxHead = newPumpPowerAtMaxHead;
        boolean oldPumpPowerAtMaxHeadESet = pumpPowerAtMaxHeadESet;
        pumpPowerAtMaxHeadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD,
                    oldPumpPowerAtMaxHead, pumpPowerAtMaxHead, !oldPumpPowerAtMaxHeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPumpPowerAtMaxHead() {
        Float oldPumpPowerAtMaxHead = pumpPowerAtMaxHead;
        boolean oldPumpPowerAtMaxHeadESet = pumpPowerAtMaxHeadESet;
        pumpPowerAtMaxHead = PUMP_POWER_AT_MAX_HEAD_EDEFAULT;
        pumpPowerAtMaxHeadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD,
                    oldPumpPowerAtMaxHead, PUMP_POWER_AT_MAX_HEAD_EDEFAULT, oldPumpPowerAtMaxHeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPumpPowerAtMaxHead() {
        return pumpPowerAtMaxHeadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPumpPowerAtMinHead() {
        return pumpPowerAtMinHead;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPumpPowerAtMinHead( Float newPumpPowerAtMinHead ) {
        Float oldPumpPowerAtMinHead = pumpPowerAtMinHead;
        pumpPowerAtMinHead = newPumpPowerAtMinHead;
        boolean oldPumpPowerAtMinHeadESet = pumpPowerAtMinHeadESet;
        pumpPowerAtMinHeadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD,
                    oldPumpPowerAtMinHead, pumpPowerAtMinHead, !oldPumpPowerAtMinHeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPumpPowerAtMinHead() {
        Float oldPumpPowerAtMinHead = pumpPowerAtMinHead;
        boolean oldPumpPowerAtMinHeadESet = pumpPowerAtMinHeadESet;
        pumpPowerAtMinHead = PUMP_POWER_AT_MIN_HEAD_EDEFAULT;
        pumpPowerAtMinHeadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD,
                    oldPumpPowerAtMinHead, PUMP_POWER_AT_MIN_HEAD_EDEFAULT, oldPumpPowerAtMinHeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPumpPowerAtMinHead() {
        return pumpPowerAtMinHeadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RotatingMachine getRotatingMachine() {
        if( rotatingMachine != null && rotatingMachine.eIsProxy() ) {
            InternalEObject oldRotatingMachine = ( InternalEObject ) rotatingMachine;
            rotatingMachine = ( RotatingMachine ) eResolveProxy( oldRotatingMachine );
            if( rotatingMachine != oldRotatingMachine ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.HYDRO_PUMP__ROTATING_MACHINE, oldRotatingMachine, rotatingMachine ) );
            }
        }
        return rotatingMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RotatingMachine basicGetRotatingMachine() {
        return rotatingMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRotatingMachine( RotatingMachine newRotatingMachine, NotificationChain msgs ) {
        RotatingMachine oldRotatingMachine = rotatingMachine;
        rotatingMachine = newRotatingMachine;
        boolean oldRotatingMachineESet = rotatingMachineESet;
        rotatingMachineESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_PUMP__ROTATING_MACHINE, oldRotatingMachine, newRotatingMachine,
                    !oldRotatingMachineESet );
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
    public void setRotatingMachine( RotatingMachine newRotatingMachine ) {
        if( newRotatingMachine != rotatingMachine ) {
            NotificationChain msgs = null;
            if( rotatingMachine != null ) msgs = ( ( InternalEObject ) rotatingMachine ).eInverseRemove( this,
                    CimPackage.ROTATING_MACHINE__HYDRO_PUMP, RotatingMachine.class, msgs );
            if( newRotatingMachine != null ) msgs = ( ( InternalEObject ) newRotatingMachine ).eInverseAdd( this,
                    CimPackage.ROTATING_MACHINE__HYDRO_PUMP, RotatingMachine.class, msgs );
            msgs = basicSetRotatingMachine( newRotatingMachine, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRotatingMachineESet = rotatingMachineESet;
            rotatingMachineESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_PUMP__ROTATING_MACHINE,
                        newRotatingMachine, newRotatingMachine, !oldRotatingMachineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRotatingMachine( NotificationChain msgs ) {
        RotatingMachine oldRotatingMachine = rotatingMachine;
        rotatingMachine = null;
        boolean oldRotatingMachineESet = rotatingMachineESet;
        rotatingMachineESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_PUMP__ROTATING_MACHINE, oldRotatingMachine, null, oldRotatingMachineESet );
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
    public void unsetRotatingMachine() {
        if( rotatingMachine != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) rotatingMachine ).eInverseRemove( this,
                    CimPackage.ROTATING_MACHINE__HYDRO_PUMP, RotatingMachine.class, msgs );
            msgs = basicUnsetRotatingMachine( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRotatingMachineESet = rotatingMachineESet;
            rotatingMachineESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_PUMP__ROTATING_MACHINE, null, null, oldRotatingMachineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotatingMachine() {
        return rotatingMachineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPowerPlant getHydroPowerPlant() {
        return hydroPowerPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHydroPowerPlant( HydroPowerPlant newHydroPowerPlant, NotificationChain msgs ) {
        HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
        hydroPowerPlant = newHydroPowerPlant;
        boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
        hydroPowerPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT, oldHydroPowerPlant, newHydroPowerPlant,
                    !oldHydroPowerPlantESet );
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
    public void setHydroPowerPlant( HydroPowerPlant newHydroPowerPlant ) {
        if( newHydroPowerPlant != hydroPowerPlant ) {
            NotificationChain msgs = null;
            if( hydroPowerPlant != null ) msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs );
            if( newHydroPowerPlant != null ) msgs = ( ( InternalEObject ) newHydroPowerPlant ).eInverseAdd( this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs );
            msgs = basicSetHydroPowerPlant( newHydroPowerPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
            hydroPowerPlantESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT,
                        newHydroPowerPlant, newHydroPowerPlant, !oldHydroPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHydroPowerPlant( NotificationChain msgs ) {
        HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
        hydroPowerPlant = null;
        boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
        hydroPowerPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT, oldHydroPowerPlant, null, oldHydroPowerPlantESet );
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
    public void unsetHydroPowerPlant() {
        if( hydroPowerPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs );
            msgs = basicUnsetHydroPowerPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
            hydroPowerPlantESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT, null, null, oldHydroPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPowerPlant() {
        return hydroPowerPlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPumpOpSchedule getHydroPumpOpSchedule() {
        if( hydroPumpOpSchedule != null && hydroPumpOpSchedule.eIsProxy() ) {
            InternalEObject oldHydroPumpOpSchedule = ( InternalEObject ) hydroPumpOpSchedule;
            hydroPumpOpSchedule = ( HydroPumpOpSchedule ) eResolveProxy( oldHydroPumpOpSchedule );
            if( hydroPumpOpSchedule != oldHydroPumpOpSchedule ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, oldHydroPumpOpSchedule, hydroPumpOpSchedule ) );
            }
        }
        return hydroPumpOpSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HydroPumpOpSchedule basicGetHydroPumpOpSchedule() {
        return hydroPumpOpSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHydroPumpOpSchedule( HydroPumpOpSchedule newHydroPumpOpSchedule,
            NotificationChain msgs ) {
        HydroPumpOpSchedule oldHydroPumpOpSchedule = hydroPumpOpSchedule;
        hydroPumpOpSchedule = newHydroPumpOpSchedule;
        boolean oldHydroPumpOpScheduleESet = hydroPumpOpScheduleESet;
        hydroPumpOpScheduleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, oldHydroPumpOpSchedule, newHydroPumpOpSchedule,
                    !oldHydroPumpOpScheduleESet );
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
    public void setHydroPumpOpSchedule( HydroPumpOpSchedule newHydroPumpOpSchedule ) {
        if( newHydroPumpOpSchedule != hydroPumpOpSchedule ) {
            NotificationChain msgs = null;
            if( hydroPumpOpSchedule != null ) msgs = ( ( InternalEObject ) hydroPumpOpSchedule ).eInverseRemove( this,
                    CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, HydroPumpOpSchedule.class, msgs );
            if( newHydroPumpOpSchedule != null )
                msgs = ( ( InternalEObject ) newHydroPumpOpSchedule ).eInverseAdd( this,
                        CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, HydroPumpOpSchedule.class, msgs );
            msgs = basicSetHydroPumpOpSchedule( newHydroPumpOpSchedule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPumpOpScheduleESet = hydroPumpOpScheduleESet;
            hydroPumpOpScheduleESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE,
                        newHydroPumpOpSchedule, newHydroPumpOpSchedule, !oldHydroPumpOpScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHydroPumpOpSchedule( NotificationChain msgs ) {
        HydroPumpOpSchedule oldHydroPumpOpSchedule = hydroPumpOpSchedule;
        hydroPumpOpSchedule = null;
        boolean oldHydroPumpOpScheduleESet = hydroPumpOpScheduleESet;
        hydroPumpOpScheduleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, oldHydroPumpOpSchedule, null,
                    oldHydroPumpOpScheduleESet );
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
    public void unsetHydroPumpOpSchedule() {
        if( hydroPumpOpSchedule != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) hydroPumpOpSchedule ).eInverseRemove( this,
                    CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, HydroPumpOpSchedule.class, msgs );
            msgs = basicUnsetHydroPumpOpSchedule( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPumpOpScheduleESet = hydroPumpOpScheduleESet;
            hydroPumpOpScheduleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, null, null, oldHydroPumpOpScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPumpOpSchedule() {
        return hydroPumpOpScheduleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            if( rotatingMachine != null ) msgs = ( ( InternalEObject ) rotatingMachine ).eInverseRemove( this,
                    CimPackage.ROTATING_MACHINE__HYDRO_PUMP, RotatingMachine.class, msgs );
            return basicSetRotatingMachine( ( RotatingMachine ) otherEnd, msgs );
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            if( hydroPowerPlant != null ) msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs );
            return basicSetHydroPowerPlant( ( HydroPowerPlant ) otherEnd, msgs );
        case CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
            if( hydroPumpOpSchedule != null ) msgs = ( ( InternalEObject ) hydroPumpOpSchedule ).eInverseRemove( this,
                    CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, HydroPumpOpSchedule.class, msgs );
            return basicSetHydroPumpOpSchedule( ( HydroPumpOpSchedule ) otherEnd, msgs );
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
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            return basicUnsetRotatingMachine( msgs );
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            return basicUnsetHydroPowerPlant( msgs );
        case CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
            return basicUnsetHydroPumpOpSchedule( msgs );
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
        case CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
            return getPumpDischAtMaxHead();
        case CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
            return getPumpDischAtMinHead();
        case CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
            return getPumpPowerAtMaxHead();
        case CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
            return getPumpPowerAtMinHead();
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            if( resolve ) return getRotatingMachine();
            return basicGetRotatingMachine();
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            return getHydroPowerPlant();
        case CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
            if( resolve ) return getHydroPumpOpSchedule();
            return basicGetHydroPumpOpSchedule();
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
        case CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
            setPumpDischAtMaxHead( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
            setPumpDischAtMinHead( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
            setPumpPowerAtMaxHead( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
            setPumpPowerAtMinHead( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            setRotatingMachine( ( RotatingMachine ) newValue );
            return;
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            setHydroPowerPlant( ( HydroPowerPlant ) newValue );
            return;
        case CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
            setHydroPumpOpSchedule( ( HydroPumpOpSchedule ) newValue );
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
        case CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
            unsetPumpDischAtMaxHead();
            return;
        case CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
            unsetPumpDischAtMinHead();
            return;
        case CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
            unsetPumpPowerAtMaxHead();
            return;
        case CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
            unsetPumpPowerAtMinHead();
            return;
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            unsetRotatingMachine();
            return;
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            unsetHydroPowerPlant();
            return;
        case CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
            unsetHydroPumpOpSchedule();
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
        case CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
            return isSetPumpDischAtMaxHead();
        case CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
            return isSetPumpDischAtMinHead();
        case CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
            return isSetPumpPowerAtMaxHead();
        case CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
            return isSetPumpPowerAtMinHead();
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            return isSetRotatingMachine();
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            return isSetHydroPowerPlant();
        case CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
            return isSetHydroPumpOpSchedule();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (pumpDischAtMaxHead: " );
        if( pumpDischAtMaxHeadESet )
            result.append( pumpDischAtMaxHead );
        else
            result.append( "<unset>" );
        result.append( ", pumpDischAtMinHead: " );
        if( pumpDischAtMinHeadESet )
            result.append( pumpDischAtMinHead );
        else
            result.append( "<unset>" );
        result.append( ", pumpPowerAtMaxHead: " );
        if( pumpPowerAtMaxHeadESet )
            result.append( pumpPowerAtMaxHead );
        else
            result.append( "<unset>" );
        result.append( ", pumpPowerAtMinHead: " );
        if( pumpPowerAtMinHeadESet )
            result.append( pumpPowerAtMinHead );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //HydroPumpImpl
