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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Circuit Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OpenCircuitTestImpl#getEnergisedEndStep <em>Energised End Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OpenCircuitTestImpl#getEnergisedEndVoltage <em>Energised End Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OpenCircuitTestImpl#getOpenEndStep <em>Open End Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OpenCircuitTestImpl#getOpenEndVoltage <em>Open End Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OpenCircuitTestImpl#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OpenCircuitTestImpl#getOpenEnd <em>Open End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OpenCircuitTestImpl#getEnergisedEnd <em>Energised End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenCircuitTestImpl extends TransformerTestImpl implements OpenCircuitTest {
    /**
     * The default value of the '{@link #getEnergisedEndStep() <em>Energised End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndStep()
     * @generated
     * @ordered
     */
    protected static final Integer ENERGISED_END_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergisedEndStep() <em>Energised End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndStep()
     * @generated
     * @ordered
     */
    protected Integer energisedEndStep = ENERGISED_END_STEP_EDEFAULT;

    /**
     * This is true if the Energised End Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energisedEndStepESet;

    /**
     * The default value of the '{@link #getEnergisedEndVoltage() <em>Energised End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndVoltage()
     * @generated
     * @ordered
     */
    protected static final Float ENERGISED_END_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergisedEndVoltage() <em>Energised End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndVoltage()
     * @generated
     * @ordered
     */
    protected Float energisedEndVoltage = ENERGISED_END_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Energised End Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energisedEndVoltageESet;

    /**
     * The default value of the '{@link #getOpenEndStep() <em>Open End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpenEndStep()
     * @generated
     * @ordered
     */
    protected static final Integer OPEN_END_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOpenEndStep() <em>Open End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpenEndStep()
     * @generated
     * @ordered
     */
    protected Integer openEndStep = OPEN_END_STEP_EDEFAULT;

    /**
     * This is true if the Open End Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean openEndStepESet;

    /**
     * The default value of the '{@link #getOpenEndVoltage() <em>Open End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpenEndVoltage()
     * @generated
     * @ordered
     */
    protected static final Float OPEN_END_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOpenEndVoltage() <em>Open End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpenEndVoltage()
     * @generated
     * @ordered
     */
    protected Float openEndVoltage = OPEN_END_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Open End Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean openEndVoltageESet;

    /**
     * The default value of the '{@link #getPhaseShift() <em>Phase Shift</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseShift()
     * @generated
     * @ordered
     */
    protected static final Float PHASE_SHIFT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhaseShift() <em>Phase Shift</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseShift()
     * @generated
     * @ordered
     */
    protected Float phaseShift = PHASE_SHIFT_EDEFAULT;

    /**
     * This is true if the Phase Shift attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseShiftESet;

    /**
     * The cached value of the '{@link #getOpenEnd() <em>Open End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpenEnd()
     * @generated
     * @ordered
     */
    protected TransformerEndInfo openEnd;

    /**
     * This is true if the Open End reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean openEndESet;

    /**
     * The cached value of the '{@link #getEnergisedEnd() <em>Energised End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEnd()
     * @generated
     * @ordered
     */
    protected TransformerEndInfo energisedEnd;

    /**
     * This is true if the Energised End reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energisedEndESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpenCircuitTestImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOpenCircuitTest();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getEnergisedEndStep() {
        return energisedEndStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergisedEndStep( Integer newEnergisedEndStep ) {
        Integer oldEnergisedEndStep = energisedEndStep;
        energisedEndStep = newEnergisedEndStep;
        boolean oldEnergisedEndStepESet = energisedEndStepESet;
        energisedEndStepESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP,
                    oldEnergisedEndStep, energisedEndStep, !oldEnergisedEndStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergisedEndStep() {
        Integer oldEnergisedEndStep = energisedEndStep;
        boolean oldEnergisedEndStepESet = energisedEndStepESet;
        energisedEndStep = ENERGISED_END_STEP_EDEFAULT;
        energisedEndStepESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP,
                    oldEnergisedEndStep, ENERGISED_END_STEP_EDEFAULT, oldEnergisedEndStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergisedEndStep() {
        return energisedEndStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEnergisedEndVoltage() {
        return energisedEndVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergisedEndVoltage( Float newEnergisedEndVoltage ) {
        Float oldEnergisedEndVoltage = energisedEndVoltage;
        energisedEndVoltage = newEnergisedEndVoltage;
        boolean oldEnergisedEndVoltageESet = energisedEndVoltageESet;
        energisedEndVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE,
                    oldEnergisedEndVoltage, energisedEndVoltage, !oldEnergisedEndVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergisedEndVoltage() {
        Float oldEnergisedEndVoltage = energisedEndVoltage;
        boolean oldEnergisedEndVoltageESet = energisedEndVoltageESet;
        energisedEndVoltage = ENERGISED_END_VOLTAGE_EDEFAULT;
        energisedEndVoltageESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE,
                        oldEnergisedEndVoltage, ENERGISED_END_VOLTAGE_EDEFAULT, oldEnergisedEndVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergisedEndVoltage() {
        return energisedEndVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getOpenEndStep() {
        return openEndStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOpenEndStep( Integer newOpenEndStep ) {
        Integer oldOpenEndStep = openEndStep;
        openEndStep = newOpenEndStep;
        boolean oldOpenEndStepESet = openEndStepESet;
        openEndStepESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP, oldOpenEndStep, openEndStep, !oldOpenEndStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOpenEndStep() {
        Integer oldOpenEndStep = openEndStep;
        boolean oldOpenEndStepESet = openEndStepESet;
        openEndStep = OPEN_END_STEP_EDEFAULT;
        openEndStepESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP,
                    oldOpenEndStep, OPEN_END_STEP_EDEFAULT, oldOpenEndStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpenEndStep() {
        return openEndStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOpenEndVoltage() {
        return openEndVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOpenEndVoltage( Float newOpenEndVoltage ) {
        Float oldOpenEndVoltage = openEndVoltage;
        openEndVoltage = newOpenEndVoltage;
        boolean oldOpenEndVoltageESet = openEndVoltageESet;
        openEndVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE,
                    oldOpenEndVoltage, openEndVoltage, !oldOpenEndVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOpenEndVoltage() {
        Float oldOpenEndVoltage = openEndVoltage;
        boolean oldOpenEndVoltageESet = openEndVoltageESet;
        openEndVoltage = OPEN_END_VOLTAGE_EDEFAULT;
        openEndVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE,
                    oldOpenEndVoltage, OPEN_END_VOLTAGE_EDEFAULT, oldOpenEndVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpenEndVoltage() {
        return openEndVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPhaseShift() {
        return phaseShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseShift( Float newPhaseShift ) {
        Float oldPhaseShift = phaseShift;
        phaseShift = newPhaseShift;
        boolean oldPhaseShiftESet = phaseShiftESet;
        phaseShiftESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT, oldPhaseShift, phaseShift, !oldPhaseShiftESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseShift() {
        Float oldPhaseShift = phaseShift;
        boolean oldPhaseShiftESet = phaseShiftESet;
        phaseShift = PHASE_SHIFT_EDEFAULT;
        phaseShiftESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT, oldPhaseShift, PHASE_SHIFT_EDEFAULT, oldPhaseShiftESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseShift() {
        return phaseShiftESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEndInfo getOpenEnd() {
        return openEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOpenEnd( TransformerEndInfo newOpenEnd, NotificationChain msgs ) {
        TransformerEndInfo oldOpenEnd = openEnd;
        openEnd = newOpenEnd;
        boolean oldOpenEndESet = openEndESet;
        openEndESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPEN_CIRCUIT_TEST__OPEN_END, oldOpenEnd, newOpenEnd, !oldOpenEndESet );
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
    public void setOpenEnd( TransformerEndInfo newOpenEnd ) {
        if( newOpenEnd != openEnd ) {
            NotificationChain msgs = null;
            if( openEnd != null ) msgs = ( ( InternalEObject ) openEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs );
            if( newOpenEnd != null ) msgs = ( ( InternalEObject ) newOpenEnd ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs );
            msgs = basicSetOpenEnd( newOpenEnd, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOpenEndESet = openEndESet;
            openEndESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPEN_CIRCUIT_TEST__OPEN_END, newOpenEnd, newOpenEnd, !oldOpenEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOpenEnd( NotificationChain msgs ) {
        TransformerEndInfo oldOpenEnd = openEnd;
        openEnd = null;
        boolean oldOpenEndESet = openEndESet;
        openEndESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPEN_CIRCUIT_TEST__OPEN_END, oldOpenEnd, null, oldOpenEndESet );
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
    public void unsetOpenEnd() {
        if( openEnd != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) openEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs );
            msgs = basicUnsetOpenEnd( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOpenEndESet = openEndESet;
            openEndESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPEN_CIRCUIT_TEST__OPEN_END, null, null, oldOpenEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpenEnd() {
        return openEndESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEndInfo getEnergisedEnd() {
        return energisedEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnergisedEnd( TransformerEndInfo newEnergisedEnd, NotificationChain msgs ) {
        TransformerEndInfo oldEnergisedEnd = energisedEnd;
        energisedEnd = newEnergisedEnd;
        boolean oldEnergisedEndESet = energisedEndESet;
        energisedEndESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END, oldEnergisedEnd, newEnergisedEnd,
                    !oldEnergisedEndESet );
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
    public void setEnergisedEnd( TransformerEndInfo newEnergisedEnd ) {
        if( newEnergisedEnd != energisedEnd ) {
            NotificationChain msgs = null;
            if( energisedEnd != null ) msgs = ( ( InternalEObject ) energisedEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs );
            if( newEnergisedEnd != null ) msgs = ( ( InternalEObject ) newEnergisedEnd ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs );
            msgs = basicSetEnergisedEnd( newEnergisedEnd, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergisedEndESet = energisedEndESet;
            energisedEndESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END,
                        newEnergisedEnd, newEnergisedEnd, !oldEnergisedEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnergisedEnd( NotificationChain msgs ) {
        TransformerEndInfo oldEnergisedEnd = energisedEnd;
        energisedEnd = null;
        boolean oldEnergisedEndESet = energisedEndESet;
        energisedEndESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END, oldEnergisedEnd, null, oldEnergisedEndESet );
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
    public void unsetEnergisedEnd() {
        if( energisedEnd != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) energisedEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs );
            msgs = basicUnsetEnergisedEnd( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergisedEndESet = energisedEndESet;
            energisedEndESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END, null, null, oldEnergisedEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergisedEnd() {
        return energisedEndESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END:
            if( openEnd != null ) msgs = ( ( InternalEObject ) openEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs );
            return basicSetOpenEnd( ( TransformerEndInfo ) otherEnd, msgs );
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
            if( energisedEnd != null ) msgs = ( ( InternalEObject ) energisedEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs );
            return basicSetEnergisedEnd( ( TransformerEndInfo ) otherEnd, msgs );
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
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END:
            return basicUnsetOpenEnd( msgs );
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
            return basicUnsetEnergisedEnd( msgs );
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
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP:
            return getEnergisedEndStep();
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE:
            return getEnergisedEndVoltage();
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP:
            return getOpenEndStep();
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE:
            return getOpenEndVoltage();
        case CimPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT:
            return getPhaseShift();
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END:
            return getOpenEnd();
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
            return getEnergisedEnd();
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
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP:
            setEnergisedEndStep( ( Integer ) newValue );
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE:
            setEnergisedEndVoltage( ( Float ) newValue );
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP:
            setOpenEndStep( ( Integer ) newValue );
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE:
            setOpenEndVoltage( ( Float ) newValue );
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT:
            setPhaseShift( ( Float ) newValue );
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END:
            setOpenEnd( ( TransformerEndInfo ) newValue );
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
            setEnergisedEnd( ( TransformerEndInfo ) newValue );
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
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP:
            unsetEnergisedEndStep();
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE:
            unsetEnergisedEndVoltage();
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP:
            unsetOpenEndStep();
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE:
            unsetOpenEndVoltage();
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT:
            unsetPhaseShift();
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END:
            unsetOpenEnd();
            return;
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
            unsetEnergisedEnd();
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
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP:
            return isSetEnergisedEndStep();
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE:
            return isSetEnergisedEndVoltage();
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP:
            return isSetOpenEndStep();
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE:
            return isSetOpenEndVoltage();
        case CimPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT:
            return isSetPhaseShift();
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END:
            return isSetOpenEnd();
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
            return isSetEnergisedEnd();
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
        result.append( " (energisedEndStep: " );
        if( energisedEndStepESet )
            result.append( energisedEndStep );
        else
            result.append( "<unset>" );
        result.append( ", energisedEndVoltage: " );
        if( energisedEndVoltageESet )
            result.append( energisedEndVoltage );
        else
            result.append( "<unset>" );
        result.append( ", openEndStep: " );
        if( openEndStepESet )
            result.append( openEndStep );
        else
            result.append( "<unset>" );
        result.append( ", openEndVoltage: " );
        if( openEndVoltageESet )
            result.append( openEndVoltage );
        else
            result.append( "<unset>" );
        result.append( ", phaseShift: " );
        if( phaseShiftESet )
            result.append( phaseShift );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OpenCircuitTestImpl
