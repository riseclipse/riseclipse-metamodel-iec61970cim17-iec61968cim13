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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultCauseType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseConnectedFaultKind;

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
 * An implementation of the model object '<em><b>Fault</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FaultImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FaultImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FaultImpl#getImpedance <em>Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FaultImpl#getFaultyEquipment <em>Faulty Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FaultImpl#getFaultCauseTypes <em>Fault Cause Types</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FaultImpl#getOutage <em>Outage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultImpl extends IdentifiedObjectImpl implements Fault {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final PhaseConnectedFaultKind KIND_EDEFAULT = PhaseConnectedFaultKind.LINE_TO_GROUND;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected PhaseConnectedFaultKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected static final PhaseCode PHASES_EDEFAULT = PhaseCode.ABCN;

    /**
     * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected PhaseCode phases = PHASES_EDEFAULT;

    /**
     * This is true if the Phases attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phasesESet;

    /**
     * The cached value of the '{@link #getImpedance() <em>Impedance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImpedance()
     * @generated
     * @ordered
     */
    protected FaultImpedance impedance;

    /**
     * This is true if the Impedance containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean impedanceESet;

    /**
     * The cached value of the '{@link #getFaultyEquipment() <em>Faulty Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaultyEquipment()
     * @generated
     * @ordered
     */
    protected Equipment faultyEquipment;

    /**
     * This is true if the Faulty Equipment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean faultyEquipmentESet;

    /**
     * The cached value of the '{@link #getFaultCauseTypes() <em>Fault Cause Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaultCauseTypes()
     * @generated
     * @ordered
     */
    protected EList< FaultCauseType > faultCauseTypes;

    /**
     * The cached value of the '{@link #getOutage() <em>Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutage()
     * @generated
     * @ordered
     */
    protected Outage outage;

    /**
     * This is true if the Outage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outageESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FaultImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getFault();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseConnectedFaultKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( PhaseConnectedFaultKind newKind ) {
        PhaseConnectedFaultKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FAULT__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        PhaseConnectedFaultKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FAULT__KIND,
                oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseCode getPhases() {
        return phases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhases( PhaseCode newPhases ) {
        PhaseCode oldPhases = phases;
        phases = newPhases == null ? PHASES_EDEFAULT : newPhases;
        boolean oldPhasesESet = phasesESet;
        phasesESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FAULT__PHASES,
                oldPhases, phases, !oldPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhases() {
        PhaseCode oldPhases = phases;
        boolean oldPhasesESet = phasesESet;
        phases = PHASES_EDEFAULT;
        phasesESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FAULT__PHASES, oldPhases, PHASES_EDEFAULT, oldPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhases() {
        return phasesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FaultImpedance getImpedance() {
        return impedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetImpedance( FaultImpedance newImpedance, NotificationChain msgs ) {
        FaultImpedance oldImpedance = impedance;
        impedance = newImpedance;
        boolean oldImpedanceESet = impedanceESet;
        impedanceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.FAULT__IMPEDANCE,
                    oldImpedance, newImpedance, !oldImpedanceESet );
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
    public void setImpedance( FaultImpedance newImpedance ) {
        if( newImpedance != impedance ) {
            NotificationChain msgs = null;
            if( impedance != null ) msgs = ( ( InternalEObject ) impedance ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.FAULT__IMPEDANCE, null, msgs );
            if( newImpedance != null ) msgs = ( ( InternalEObject ) newImpedance ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.FAULT__IMPEDANCE, null, msgs );
            msgs = basicSetImpedance( newImpedance, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldImpedanceESet = impedanceESet;
            impedanceESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.FAULT__IMPEDANCE, newImpedance, newImpedance, !oldImpedanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetImpedance( NotificationChain msgs ) {
        FaultImpedance oldImpedance = impedance;
        impedance = null;
        boolean oldImpedanceESet = impedanceESet;
        impedanceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FAULT__IMPEDANCE, oldImpedance, null, oldImpedanceESet );
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
    public void unsetImpedance() {
        if( impedance != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) impedance ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.FAULT__IMPEDANCE, null, msgs );
            msgs = basicUnsetImpedance( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldImpedanceESet = impedanceESet;
            impedanceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FAULT__IMPEDANCE, null, null, oldImpedanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetImpedance() {
        return impedanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Equipment getFaultyEquipment() {
        return faultyEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFaultyEquipment( Equipment newFaultyEquipment, NotificationChain msgs ) {
        Equipment oldFaultyEquipment = faultyEquipment;
        faultyEquipment = newFaultyEquipment;
        boolean oldFaultyEquipmentESet = faultyEquipmentESet;
        faultyEquipmentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.FAULT__FAULTY_EQUIPMENT, oldFaultyEquipment, newFaultyEquipment,
                    !oldFaultyEquipmentESet );
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
    public void setFaultyEquipment( Equipment newFaultyEquipment ) {
        if( newFaultyEquipment != faultyEquipment ) {
            NotificationChain msgs = null;
            if( faultyEquipment != null ) msgs = ( ( InternalEObject ) faultyEquipment ).eInverseRemove( this,
                    CimPackage.EQUIPMENT__FAULTS, Equipment.class, msgs );
            if( newFaultyEquipment != null ) msgs = ( ( InternalEObject ) newFaultyEquipment ).eInverseAdd( this,
                    CimPackage.EQUIPMENT__FAULTS, Equipment.class, msgs );
            msgs = basicSetFaultyEquipment( newFaultyEquipment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFaultyEquipmentESet = faultyEquipmentESet;
            faultyEquipmentESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FAULT__FAULTY_EQUIPMENT,
                        newFaultyEquipment, newFaultyEquipment, !oldFaultyEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetFaultyEquipment( NotificationChain msgs ) {
        Equipment oldFaultyEquipment = faultyEquipment;
        faultyEquipment = null;
        boolean oldFaultyEquipmentESet = faultyEquipmentESet;
        faultyEquipmentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FAULT__FAULTY_EQUIPMENT, oldFaultyEquipment, null, oldFaultyEquipmentESet );
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
    public void unsetFaultyEquipment() {
        if( faultyEquipment != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) faultyEquipment ).eInverseRemove( this, CimPackage.EQUIPMENT__FAULTS,
                    Equipment.class, msgs );
            msgs = basicUnsetFaultyEquipment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFaultyEquipmentESet = faultyEquipmentESet;
            faultyEquipmentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FAULT__FAULTY_EQUIPMENT, null, null, oldFaultyEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFaultyEquipment() {
        return faultyEquipmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FaultCauseType > getFaultCauseTypes() {
        if( faultCauseTypes == null ) {
            faultCauseTypes = new EObjectWithInverseEList.Unsettable.ManyInverse< FaultCauseType >(
                    FaultCauseType.class, this, CimPackage.FAULT__FAULT_CAUSE_TYPES,
                    CimPackage.FAULT_CAUSE_TYPE__FAULTS );
        }
        return faultCauseTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFaultCauseTypes() {
        if( faultCauseTypes != null ) ( ( InternalEList.Unsettable< ? > ) faultCauseTypes ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFaultCauseTypes() {
        return faultCauseTypes != null && ( ( InternalEList.Unsettable< ? > ) faultCauseTypes ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Outage getOutage() {
        return outage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutage( Outage newOutage, NotificationChain msgs ) {
        Outage oldOutage = outage;
        outage = newOutage;
        boolean oldOutageESet = outageESet;
        outageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.FAULT__OUTAGE,
                    oldOutage, newOutage, !oldOutageESet );
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
    public void setOutage( Outage newOutage ) {
        if( newOutage != outage ) {
            NotificationChain msgs = null;
            if( outage != null ) msgs = ( ( InternalEObject ) outage ).eInverseRemove( this, CimPackage.OUTAGE__FAULTS,
                    Outage.class, msgs );
            if( newOutage != null ) msgs = ( ( InternalEObject ) newOutage ).eInverseAdd( this,
                    CimPackage.OUTAGE__FAULTS, Outage.class, msgs );
            msgs = basicSetOutage( newOutage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageESet = outageESet;
            outageESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.FAULT__OUTAGE, newOutage, newOutage, !oldOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOutage( NotificationChain msgs ) {
        Outage oldOutage = outage;
        outage = null;
        boolean oldOutageESet = outageESet;
        outageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, CimPackage.FAULT__OUTAGE,
                    oldOutage, null, oldOutageESet );
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
    public void unsetOutage() {
        if( outage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) outage ).eInverseRemove( this, CimPackage.OUTAGE__FAULTS, Outage.class, msgs );
            msgs = basicUnsetOutage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageESet = outageESet;
            outageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FAULT__OUTAGE, null, null, oldOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutage() {
        return outageESet;
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
        case CimPackage.FAULT__FAULTY_EQUIPMENT:
            if( faultyEquipment != null ) msgs = ( ( InternalEObject ) faultyEquipment ).eInverseRemove( this,
                    CimPackage.EQUIPMENT__FAULTS, Equipment.class, msgs );
            return basicSetFaultyEquipment( ( Equipment ) otherEnd, msgs );
        case CimPackage.FAULT__FAULT_CAUSE_TYPES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFaultCauseTypes() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.FAULT__OUTAGE:
            if( outage != null ) msgs = ( ( InternalEObject ) outage ).eInverseRemove( this, CimPackage.OUTAGE__FAULTS,
                    Outage.class, msgs );
            return basicSetOutage( ( Outage ) otherEnd, msgs );
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
        case CimPackage.FAULT__IMPEDANCE:
            return basicUnsetImpedance( msgs );
        case CimPackage.FAULT__FAULTY_EQUIPMENT:
            return basicUnsetFaultyEquipment( msgs );
        case CimPackage.FAULT__FAULT_CAUSE_TYPES:
            return ( ( InternalEList< ? > ) getFaultCauseTypes() ).basicRemove( otherEnd, msgs );
        case CimPackage.FAULT__OUTAGE:
            return basicUnsetOutage( msgs );
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
        case CimPackage.FAULT__KIND:
            return getKind();
        case CimPackage.FAULT__PHASES:
            return getPhases();
        case CimPackage.FAULT__IMPEDANCE:
            return getImpedance();
        case CimPackage.FAULT__FAULTY_EQUIPMENT:
            return getFaultyEquipment();
        case CimPackage.FAULT__FAULT_CAUSE_TYPES:
            return getFaultCauseTypes();
        case CimPackage.FAULT__OUTAGE:
            return getOutage();
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
        case CimPackage.FAULT__KIND:
            setKind( ( PhaseConnectedFaultKind ) newValue );
            return;
        case CimPackage.FAULT__PHASES:
            setPhases( ( PhaseCode ) newValue );
            return;
        case CimPackage.FAULT__IMPEDANCE:
            setImpedance( ( FaultImpedance ) newValue );
            return;
        case CimPackage.FAULT__FAULTY_EQUIPMENT:
            setFaultyEquipment( ( Equipment ) newValue );
            return;
        case CimPackage.FAULT__FAULT_CAUSE_TYPES:
            getFaultCauseTypes().clear();
            getFaultCauseTypes().addAll( ( Collection< ? extends FaultCauseType > ) newValue );
            return;
        case CimPackage.FAULT__OUTAGE:
            setOutage( ( Outage ) newValue );
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
        case CimPackage.FAULT__KIND:
            unsetKind();
            return;
        case CimPackage.FAULT__PHASES:
            unsetPhases();
            return;
        case CimPackage.FAULT__IMPEDANCE:
            unsetImpedance();
            return;
        case CimPackage.FAULT__FAULTY_EQUIPMENT:
            unsetFaultyEquipment();
            return;
        case CimPackage.FAULT__FAULT_CAUSE_TYPES:
            unsetFaultCauseTypes();
            return;
        case CimPackage.FAULT__OUTAGE:
            unsetOutage();
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
        case CimPackage.FAULT__KIND:
            return isSetKind();
        case CimPackage.FAULT__PHASES:
            return isSetPhases();
        case CimPackage.FAULT__IMPEDANCE:
            return isSetImpedance();
        case CimPackage.FAULT__FAULTY_EQUIPMENT:
            return isSetFaultyEquipment();
        case CimPackage.FAULT__FAULT_CAUSE_TYPES:
            return isSetFaultCauseTypes();
        case CimPackage.FAULT__OUTAGE:
            return isSetOutage();
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
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ", phases: " );
        if( phasesESet )
            result.append( phases );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //FaultImpl
