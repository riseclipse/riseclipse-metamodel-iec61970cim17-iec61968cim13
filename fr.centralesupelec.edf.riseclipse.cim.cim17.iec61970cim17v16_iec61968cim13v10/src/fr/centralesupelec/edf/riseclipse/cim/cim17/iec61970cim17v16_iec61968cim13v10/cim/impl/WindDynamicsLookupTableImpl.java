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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContCurrLimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQPQULimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3bIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindLookupTableFunctionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPitchContPowerIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantReactiveControlIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Dynamics Lookup Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getInput <em>Input</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getLookupTableFunctionType <em>Lookup Table Function Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getWindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getWindGenType3bIEC <em>Wind Gen Type3b IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getWindProtectionIEC <em>Wind Protection IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindDynamicsLookupTableImpl#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindDynamicsLookupTableImpl extends IdentifiedObjectImpl implements WindDynamicsLookupTable {
    /**
     * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected static final Float INPUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected Float input = INPUT_EDEFAULT;

    /**
     * This is true if the Input attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inputESet;

    /**
     * The default value of the '{@link #getLookupTableFunctionType() <em>Lookup Table Function Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLookupTableFunctionType()
     * @generated
     * @ordered
     */
    protected static final WindLookupTableFunctionKind LOOKUP_TABLE_FUNCTION_TYPE_EDEFAULT = WindLookupTableFunctionKind.PRR;

    /**
     * The cached value of the '{@link #getLookupTableFunctionType() <em>Lookup Table Function Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLookupTableFunctionType()
     * @generated
     * @ordered
     */
    protected WindLookupTableFunctionKind lookupTableFunctionType = LOOKUP_TABLE_FUNCTION_TYPE_EDEFAULT;

    /**
     * This is true if the Lookup Table Function Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lookupTableFunctionTypeESet;

    /**
     * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
    protected static final Float OUTPUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
    protected Float output = OUTPUT_EDEFAULT;

    /**
     * This is true if the Output attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outputESet;

    /**
     * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected static final Integer SEQUENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected Integer sequence = SEQUENCE_EDEFAULT;

    /**
     * This is true if the Sequence attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sequenceESet;

    /**
     * The cached value of the '{@link #getWindPlantFreqPcontrolIEC() <em>Wind Plant Freq Pcontrol IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantFreqPcontrolIEC()
     * @generated
     * @ordered
     */
    protected WindPlantFreqPcontrolIEC windPlantFreqPcontrolIEC;

    /**
     * This is true if the Wind Plant Freq Pcontrol IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantFreqPcontrolIECESet;

    /**
     * The cached value of the '{@link #getWindContRotorRIEC() <em>Wind Cont Rotor RIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContRotorRIEC()
     * @generated
     * @ordered
     */
    protected WindContRotorRIEC windContRotorRIEC;

    /**
     * This is true if the Wind Cont Rotor RIEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContRotorRIECESet;

    /**
     * The cached value of the '{@link #getWindPlantReactiveControlIEC() <em>Wind Plant Reactive Control IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantReactiveControlIEC()
     * @generated
     * @ordered
     */
    protected WindPlantReactiveControlIEC windPlantReactiveControlIEC;

    /**
     * This is true if the Wind Plant Reactive Control IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantReactiveControlIECESet;

    /**
     * The cached value of the '{@link #getWindContQPQULimIEC() <em>Wind Cont QPQU Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContQPQULimIEC()
     * @generated
     * @ordered
     */
    protected WindContQPQULimIEC windContQPQULimIEC;

    /**
     * This is true if the Wind Cont QPQU Lim IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContQPQULimIECESet;

    /**
     * The cached value of the '{@link #getWindContCurrLimIEC() <em>Wind Cont Curr Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContCurrLimIEC()
     * @generated
     * @ordered
     */
    protected WindContCurrLimIEC windContCurrLimIEC;

    /**
     * This is true if the Wind Cont Curr Lim IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContCurrLimIECESet;

    /**
     * The cached value of the '{@link #getWindPitchContPowerIEC() <em>Wind Pitch Cont Power IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPitchContPowerIEC()
     * @generated
     * @ordered
     */
    protected WindPitchContPowerIEC windPitchContPowerIEC;

    /**
     * This is true if the Wind Pitch Cont Power IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPitchContPowerIECESet;

    /**
     * The cached value of the '{@link #getWindGenType3bIEC() <em>Wind Gen Type3b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenType3bIEC()
     * @generated
     * @ordered
     */
    protected WindGenType3bIEC windGenType3bIEC;

    /**
     * This is true if the Wind Gen Type3b IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenType3bIECESet;

    /**
     * The cached value of the '{@link #getWindProtectionIEC() <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindProtectionIEC()
     * @generated
     * @ordered
     */
    protected WindProtectionIEC windProtectionIEC;

    /**
     * This is true if the Wind Protection IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windProtectionIECESet;

    /**
     * The cached value of the '{@link #getWindContPType3IEC() <em>Wind Cont PType3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContPType3IEC()
     * @generated
     * @ordered
     */
    protected WindContPType3IEC windContPType3IEC;

    /**
     * This is true if the Wind Cont PType3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContPType3IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindDynamicsLookupTableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindDynamicsLookupTable();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInput() {
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInput( Float newInput ) {
        Float oldInput = input;
        input = newInput;
        boolean oldInputESet = inputESet;
        inputESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__INPUT, oldInput, input, !oldInputESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInput() {
        Float oldInput = input;
        boolean oldInputESet = inputESet;
        input = INPUT_EDEFAULT;
        inputESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__INPUT, oldInput, INPUT_EDEFAULT, oldInputESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInput() {
        return inputESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindLookupTableFunctionKind getLookupTableFunctionType() {
        return lookupTableFunctionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLookupTableFunctionType( WindLookupTableFunctionKind newLookupTableFunctionType ) {
        WindLookupTableFunctionKind oldLookupTableFunctionType = lookupTableFunctionType;
        lookupTableFunctionType = newLookupTableFunctionType == null ? LOOKUP_TABLE_FUNCTION_TYPE_EDEFAULT
                : newLookupTableFunctionType;
        boolean oldLookupTableFunctionTypeESet = lookupTableFunctionTypeESet;
        lookupTableFunctionTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__LOOKUP_TABLE_FUNCTION_TYPE, oldLookupTableFunctionType,
                lookupTableFunctionType, !oldLookupTableFunctionTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLookupTableFunctionType() {
        WindLookupTableFunctionKind oldLookupTableFunctionType = lookupTableFunctionType;
        boolean oldLookupTableFunctionTypeESet = lookupTableFunctionTypeESet;
        lookupTableFunctionType = LOOKUP_TABLE_FUNCTION_TYPE_EDEFAULT;
        lookupTableFunctionTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__LOOKUP_TABLE_FUNCTION_TYPE, oldLookupTableFunctionType,
                LOOKUP_TABLE_FUNCTION_TYPE_EDEFAULT, oldLookupTableFunctionTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLookupTableFunctionType() {
        return lookupTableFunctionTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOutput() {
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutput( Float newOutput ) {
        Float oldOutput = output;
        output = newOutput;
        boolean oldOutputESet = outputESet;
        outputESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__OUTPUT, oldOutput, output, !oldOutputESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutput() {
        Float oldOutput = output;
        boolean oldOutputESet = outputESet;
        output = OUTPUT_EDEFAULT;
        outputESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__OUTPUT, oldOutput, OUTPUT_EDEFAULT, oldOutputESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutput() {
        return outputESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSequence() {
        return sequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequence( Integer newSequence ) {
        Integer oldSequence = sequence;
        sequence = newSequence;
        boolean oldSequenceESet = sequenceESet;
        sequenceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__SEQUENCE, oldSequence, sequence, !oldSequenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSequence() {
        Integer oldSequence = sequence;
        boolean oldSequenceESet = sequenceESet;
        sequence = SEQUENCE_EDEFAULT;
        sequenceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__SEQUENCE, oldSequence, SEQUENCE_EDEFAULT, oldSequenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSequence() {
        return sequenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantFreqPcontrolIEC getWindPlantFreqPcontrolIEC() {
        return windPlantFreqPcontrolIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPlantFreqPcontrolIEC( WindPlantFreqPcontrolIEC newWindPlantFreqPcontrolIEC,
            NotificationChain msgs ) {
        WindPlantFreqPcontrolIEC oldWindPlantFreqPcontrolIEC = windPlantFreqPcontrolIEC;
        windPlantFreqPcontrolIEC = newWindPlantFreqPcontrolIEC;
        boolean oldWindPlantFreqPcontrolIECESet = windPlantFreqPcontrolIECESet;
        windPlantFreqPcontrolIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC, oldWindPlantFreqPcontrolIEC,
                    newWindPlantFreqPcontrolIEC, !oldWindPlantFreqPcontrolIECESet );
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
    public void setWindPlantFreqPcontrolIEC( WindPlantFreqPcontrolIEC newWindPlantFreqPcontrolIEC ) {
        if( newWindPlantFreqPcontrolIEC != windPlantFreqPcontrolIEC ) {
            NotificationChain msgs = null;
            if( windPlantFreqPcontrolIEC != null )
                msgs = ( ( InternalEObject ) windPlantFreqPcontrolIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                        WindPlantFreqPcontrolIEC.class, msgs );
            if( newWindPlantFreqPcontrolIEC != null )
                msgs = ( ( InternalEObject ) newWindPlantFreqPcontrolIEC ).eInverseAdd( this,
                        CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                        WindPlantFreqPcontrolIEC.class, msgs );
            msgs = basicSetWindPlantFreqPcontrolIEC( newWindPlantFreqPcontrolIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantFreqPcontrolIECESet = windPlantFreqPcontrolIECESet;
            windPlantFreqPcontrolIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC, newWindPlantFreqPcontrolIEC,
                    newWindPlantFreqPcontrolIEC, !oldWindPlantFreqPcontrolIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPlantFreqPcontrolIEC( NotificationChain msgs ) {
        WindPlantFreqPcontrolIEC oldWindPlantFreqPcontrolIEC = windPlantFreqPcontrolIEC;
        windPlantFreqPcontrolIEC = null;
        boolean oldWindPlantFreqPcontrolIECESet = windPlantFreqPcontrolIECESet;
        windPlantFreqPcontrolIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC, oldWindPlantFreqPcontrolIEC,
                    null, oldWindPlantFreqPcontrolIECESet );
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
    public void unsetWindPlantFreqPcontrolIEC() {
        if( windPlantFreqPcontrolIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPlantFreqPcontrolIEC ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindPlantFreqPcontrolIEC.class,
                    msgs );
            msgs = basicUnsetWindPlantFreqPcontrolIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantFreqPcontrolIECESet = windPlantFreqPcontrolIECESet;
            windPlantFreqPcontrolIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC, null, null,
                    oldWindPlantFreqPcontrolIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantFreqPcontrolIEC() {
        return windPlantFreqPcontrolIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContRotorRIEC getWindContRotorRIEC() {
        return windContRotorRIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContRotorRIEC( WindContRotorRIEC newWindContRotorRIEC,
            NotificationChain msgs ) {
        WindContRotorRIEC oldWindContRotorRIEC = windContRotorRIEC;
        windContRotorRIEC = newWindContRotorRIEC;
        boolean oldWindContRotorRIECESet = windContRotorRIECESet;
        windContRotorRIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC, oldWindContRotorRIEC,
                    newWindContRotorRIEC, !oldWindContRotorRIECESet );
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
    public void setWindContRotorRIEC( WindContRotorRIEC newWindContRotorRIEC ) {
        if( newWindContRotorRIEC != windContRotorRIEC ) {
            NotificationChain msgs = null;
            if( windContRotorRIEC != null ) msgs = ( ( InternalEObject ) windContRotorRIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContRotorRIEC.class, msgs );
            if( newWindContRotorRIEC != null ) msgs = ( ( InternalEObject ) newWindContRotorRIEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContRotorRIEC.class, msgs );
            msgs = basicSetWindContRotorRIEC( newWindContRotorRIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContRotorRIECESet = windContRotorRIECESet;
            windContRotorRIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC, newWindContRotorRIEC,
                    newWindContRotorRIEC, !oldWindContRotorRIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContRotorRIEC( NotificationChain msgs ) {
        WindContRotorRIEC oldWindContRotorRIEC = windContRotorRIEC;
        windContRotorRIEC = null;
        boolean oldWindContRotorRIECESet = windContRotorRIECESet;
        windContRotorRIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC, oldWindContRotorRIEC, null,
                    oldWindContRotorRIECESet );
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
    public void unsetWindContRotorRIEC() {
        if( windContRotorRIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContRotorRIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContRotorRIEC.class, msgs );
            msgs = basicUnsetWindContRotorRIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContRotorRIECESet = windContRotorRIECESet;
            windContRotorRIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC, null, null,
                    oldWindContRotorRIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContRotorRIEC() {
        return windContRotorRIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantReactiveControlIEC getWindPlantReactiveControlIEC() {
        return windPlantReactiveControlIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPlantReactiveControlIEC(
            WindPlantReactiveControlIEC newWindPlantReactiveControlIEC, NotificationChain msgs ) {
        WindPlantReactiveControlIEC oldWindPlantReactiveControlIEC = windPlantReactiveControlIEC;
        windPlantReactiveControlIEC = newWindPlantReactiveControlIEC;
        boolean oldWindPlantReactiveControlIECESet = windPlantReactiveControlIECESet;
        windPlantReactiveControlIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC,
                    oldWindPlantReactiveControlIEC, newWindPlantReactiveControlIEC,
                    !oldWindPlantReactiveControlIECESet );
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
    public void setWindPlantReactiveControlIEC( WindPlantReactiveControlIEC newWindPlantReactiveControlIEC ) {
        if( newWindPlantReactiveControlIEC != windPlantReactiveControlIEC ) {
            NotificationChain msgs = null;
            if( windPlantReactiveControlIEC != null )
                msgs = ( ( InternalEObject ) windPlantReactiveControlIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                        WindPlantReactiveControlIEC.class, msgs );
            if( newWindPlantReactiveControlIEC != null )
                msgs = ( ( InternalEObject ) newWindPlantReactiveControlIEC ).eInverseAdd( this,
                        CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                        WindPlantReactiveControlIEC.class, msgs );
            msgs = basicSetWindPlantReactiveControlIEC( newWindPlantReactiveControlIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantReactiveControlIECESet = windPlantReactiveControlIECESet;
            windPlantReactiveControlIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC,
                    newWindPlantReactiveControlIEC, newWindPlantReactiveControlIEC,
                    !oldWindPlantReactiveControlIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPlantReactiveControlIEC( NotificationChain msgs ) {
        WindPlantReactiveControlIEC oldWindPlantReactiveControlIEC = windPlantReactiveControlIEC;
        windPlantReactiveControlIEC = null;
        boolean oldWindPlantReactiveControlIECESet = windPlantReactiveControlIECESet;
        windPlantReactiveControlIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC,
                    oldWindPlantReactiveControlIEC, null, oldWindPlantReactiveControlIECESet );
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
    public void unsetWindPlantReactiveControlIEC() {
        if( windPlantReactiveControlIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPlantReactiveControlIEC ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    WindPlantReactiveControlIEC.class, msgs );
            msgs = basicUnsetWindPlantReactiveControlIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantReactiveControlIECESet = windPlantReactiveControlIECESet;
            windPlantReactiveControlIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC, null, null,
                    oldWindPlantReactiveControlIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantReactiveControlIEC() {
        return windPlantReactiveControlIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContQPQULimIEC getWindContQPQULimIEC() {
        return windContQPQULimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContQPQULimIEC( WindContQPQULimIEC newWindContQPQULimIEC,
            NotificationChain msgs ) {
        WindContQPQULimIEC oldWindContQPQULimIEC = windContQPQULimIEC;
        windContQPQULimIEC = newWindContQPQULimIEC;
        boolean oldWindContQPQULimIECESet = windContQPQULimIECESet;
        windContQPQULimIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_QPQU_LIM_IEC, oldWindContQPQULimIEC,
                    newWindContQPQULimIEC, !oldWindContQPQULimIECESet );
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
    public void setWindContQPQULimIEC( WindContQPQULimIEC newWindContQPQULimIEC ) {
        if( newWindContQPQULimIEC != windContQPQULimIEC ) {
            NotificationChain msgs = null;
            if( windContQPQULimIEC != null ) msgs = ( ( InternalEObject ) windContQPQULimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QPQU_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContQPQULimIEC.class, msgs );
            if( newWindContQPQULimIEC != null ) msgs = ( ( InternalEObject ) newWindContQPQULimIEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_QPQU_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContQPQULimIEC.class, msgs );
            msgs = basicSetWindContQPQULimIEC( newWindContQPQULimIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContQPQULimIECESet = windContQPQULimIECESet;
            windContQPQULimIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_QPQU_LIM_IEC, newWindContQPQULimIEC,
                    newWindContQPQULimIEC, !oldWindContQPQULimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContQPQULimIEC( NotificationChain msgs ) {
        WindContQPQULimIEC oldWindContQPQULimIEC = windContQPQULimIEC;
        windContQPQULimIEC = null;
        boolean oldWindContQPQULimIECESet = windContQPQULimIECESet;
        windContQPQULimIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_QPQU_LIM_IEC, oldWindContQPQULimIEC, null,
                    oldWindContQPQULimIECESet );
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
    public void unsetWindContQPQULimIEC() {
        if( windContQPQULimIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContQPQULimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QPQU_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContQPQULimIEC.class, msgs );
            msgs = basicUnsetWindContQPQULimIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContQPQULimIECESet = windContQPQULimIECESet;
            windContQPQULimIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_QPQU_LIM_IEC, null, null,
                    oldWindContQPQULimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContQPQULimIEC() {
        return windContQPQULimIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContCurrLimIEC getWindContCurrLimIEC() {
        return windContCurrLimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContCurrLimIEC( WindContCurrLimIEC newWindContCurrLimIEC,
            NotificationChain msgs ) {
        WindContCurrLimIEC oldWindContCurrLimIEC = windContCurrLimIEC;
        windContCurrLimIEC = newWindContCurrLimIEC;
        boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
        windContCurrLimIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC, oldWindContCurrLimIEC,
                    newWindContCurrLimIEC, !oldWindContCurrLimIECESet );
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
    public void setWindContCurrLimIEC( WindContCurrLimIEC newWindContCurrLimIEC ) {
        if( newWindContCurrLimIEC != windContCurrLimIEC ) {
            NotificationChain msgs = null;
            if( windContCurrLimIEC != null ) msgs = ( ( InternalEObject ) windContCurrLimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContCurrLimIEC.class, msgs );
            if( newWindContCurrLimIEC != null ) msgs = ( ( InternalEObject ) newWindContCurrLimIEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContCurrLimIEC.class, msgs );
            msgs = basicSetWindContCurrLimIEC( newWindContCurrLimIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
            windContCurrLimIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC, newWindContCurrLimIEC,
                    newWindContCurrLimIEC, !oldWindContCurrLimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContCurrLimIEC( NotificationChain msgs ) {
        WindContCurrLimIEC oldWindContCurrLimIEC = windContCurrLimIEC;
        windContCurrLimIEC = null;
        boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
        windContCurrLimIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC, oldWindContCurrLimIEC, null,
                    oldWindContCurrLimIECESet );
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
    public void unsetWindContCurrLimIEC() {
        if( windContCurrLimIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContCurrLimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContCurrLimIEC.class, msgs );
            msgs = basicUnsetWindContCurrLimIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
            windContCurrLimIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC, null, null,
                    oldWindContCurrLimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContCurrLimIEC() {
        return windContCurrLimIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPitchContPowerIEC getWindPitchContPowerIEC() {
        return windPitchContPowerIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPitchContPowerIEC( WindPitchContPowerIEC newWindPitchContPowerIEC,
            NotificationChain msgs ) {
        WindPitchContPowerIEC oldWindPitchContPowerIEC = windPitchContPowerIEC;
        windPitchContPowerIEC = newWindPitchContPowerIEC;
        boolean oldWindPitchContPowerIECESet = windPitchContPowerIECESet;
        windPitchContPowerIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC, oldWindPitchContPowerIEC,
                    newWindPitchContPowerIEC, !oldWindPitchContPowerIECESet );
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
    public void setWindPitchContPowerIEC( WindPitchContPowerIEC newWindPitchContPowerIEC ) {
        if( newWindPitchContPowerIEC != windPitchContPowerIEC ) {
            NotificationChain msgs = null;
            if( windPitchContPowerIEC != null )
                msgs = ( ( InternalEObject ) windPitchContPowerIEC ).eInverseRemove( this,
                        CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindPitchContPowerIEC.class,
                        msgs );
            if( newWindPitchContPowerIEC != null )
                msgs = ( ( InternalEObject ) newWindPitchContPowerIEC ).eInverseAdd( this,
                        CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindPitchContPowerIEC.class,
                        msgs );
            msgs = basicSetWindPitchContPowerIEC( newWindPitchContPowerIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPitchContPowerIECESet = windPitchContPowerIECESet;
            windPitchContPowerIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC, newWindPitchContPowerIEC,
                    newWindPitchContPowerIEC, !oldWindPitchContPowerIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPitchContPowerIEC( NotificationChain msgs ) {
        WindPitchContPowerIEC oldWindPitchContPowerIEC = windPitchContPowerIEC;
        windPitchContPowerIEC = null;
        boolean oldWindPitchContPowerIECESet = windPitchContPowerIECESet;
        windPitchContPowerIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC, oldWindPitchContPowerIEC, null,
                    oldWindPitchContPowerIECESet );
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
    public void unsetWindPitchContPowerIEC() {
        if( windPitchContPowerIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPitchContPowerIEC ).eInverseRemove( this,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindPitchContPowerIEC.class,
                    msgs );
            msgs = basicUnsetWindPitchContPowerIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPitchContPowerIECESet = windPitchContPowerIECESet;
            windPitchContPowerIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC, null, null,
                    oldWindPitchContPowerIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPitchContPowerIEC() {
        return windPitchContPowerIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenType3bIEC getWindGenType3bIEC() {
        return windGenType3bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenType3bIEC( WindGenType3bIEC newWindGenType3bIEC, NotificationChain msgs ) {
        WindGenType3bIEC oldWindGenType3bIEC = windGenType3bIEC;
        windGenType3bIEC = newWindGenType3bIEC;
        boolean oldWindGenType3bIECESet = windGenType3bIECESet;
        windGenType3bIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_GEN_TYPE3B_IEC, oldWindGenType3bIEC,
                    newWindGenType3bIEC, !oldWindGenType3bIECESet );
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
    public void setWindGenType3bIEC( WindGenType3bIEC newWindGenType3bIEC ) {
        if( newWindGenType3bIEC != windGenType3bIEC ) {
            NotificationChain msgs = null;
            if( windGenType3bIEC != null ) msgs = ( ( InternalEObject ) windGenType3bIEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE3B_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindGenType3bIEC.class, msgs );
            if( newWindGenType3bIEC != null ) msgs = ( ( InternalEObject ) newWindGenType3bIEC ).eInverseAdd( this,
                    CimPackage.WIND_GEN_TYPE3B_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindGenType3bIEC.class, msgs );
            msgs = basicSetWindGenType3bIEC( newWindGenType3bIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenType3bIECESet = windGenType3bIECESet;
            windGenType3bIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_GEN_TYPE3B_IEC, newWindGenType3bIEC,
                    newWindGenType3bIEC, !oldWindGenType3bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenType3bIEC( NotificationChain msgs ) {
        WindGenType3bIEC oldWindGenType3bIEC = windGenType3bIEC;
        windGenType3bIEC = null;
        boolean oldWindGenType3bIECESet = windGenType3bIECESet;
        windGenType3bIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_GEN_TYPE3B_IEC, oldWindGenType3bIEC, null,
                    oldWindGenType3bIECESet );
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
    public void unsetWindGenType3bIEC() {
        if( windGenType3bIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenType3bIEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE3B_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindGenType3bIEC.class, msgs );
            msgs = basicUnsetWindGenType3bIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenType3bIECESet = windGenType3bIECESet;
            windGenType3bIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_GEN_TYPE3B_IEC, null, null, oldWindGenType3bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenType3bIEC() {
        return windGenType3bIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindProtectionIEC getWindProtectionIEC() {
        return windProtectionIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindProtectionIEC( WindProtectionIEC newWindProtectionIEC,
            NotificationChain msgs ) {
        WindProtectionIEC oldWindProtectionIEC = windProtectionIEC;
        windProtectionIEC = newWindProtectionIEC;
        boolean oldWindProtectionIECESet = windProtectionIECESet;
        windProtectionIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC, oldWindProtectionIEC,
                    newWindProtectionIEC, !oldWindProtectionIECESet );
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
    public void setWindProtectionIEC( WindProtectionIEC newWindProtectionIEC ) {
        if( newWindProtectionIEC != windProtectionIEC ) {
            NotificationChain msgs = null;
            if( windProtectionIEC != null ) msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindProtectionIEC.class, msgs );
            if( newWindProtectionIEC != null ) msgs = ( ( InternalEObject ) newWindProtectionIEC ).eInverseAdd( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindProtectionIEC.class, msgs );
            msgs = basicSetWindProtectionIEC( newWindProtectionIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindProtectionIECESet = windProtectionIECESet;
            windProtectionIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC, newWindProtectionIEC,
                    newWindProtectionIEC, !oldWindProtectionIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindProtectionIEC( NotificationChain msgs ) {
        WindProtectionIEC oldWindProtectionIEC = windProtectionIEC;
        windProtectionIEC = null;
        boolean oldWindProtectionIECESet = windProtectionIECESet;
        windProtectionIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC, oldWindProtectionIEC, null,
                    oldWindProtectionIECESet );
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
    public void unsetWindProtectionIEC() {
        if( windProtectionIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindProtectionIEC.class, msgs );
            msgs = basicUnsetWindProtectionIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindProtectionIECESet = windProtectionIECESet;
            windProtectionIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC, null, null,
                    oldWindProtectionIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindProtectionIEC() {
        return windProtectionIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType3IEC getWindContPType3IEC() {
        return windContPType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContPType3IEC( WindContPType3IEC newWindContPType3IEC,
            NotificationChain msgs ) {
        WindContPType3IEC oldWindContPType3IEC = windContPType3IEC;
        windContPType3IEC = newWindContPType3IEC;
        boolean oldWindContPType3IECESet = windContPType3IECESet;
        windContPType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC, oldWindContPType3IEC,
                    newWindContPType3IEC, !oldWindContPType3IECESet );
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
    public void setWindContPType3IEC( WindContPType3IEC newWindContPType3IEC ) {
        if( newWindContPType3IEC != windContPType3IEC ) {
            NotificationChain msgs = null;
            if( windContPType3IEC != null ) msgs = ( ( InternalEObject ) windContPType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContPType3IEC.class, msgs );
            if( newWindContPType3IEC != null ) msgs = ( ( InternalEObject ) newWindContPType3IEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContPType3IEC.class, msgs );
            msgs = basicSetWindContPType3IEC( newWindContPType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPType3IECESet = windContPType3IECESet;
            windContPType3IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC, newWindContPType3IEC,
                    newWindContPType3IEC, !oldWindContPType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContPType3IEC( NotificationChain msgs ) {
        WindContPType3IEC oldWindContPType3IEC = windContPType3IEC;
        windContPType3IEC = null;
        boolean oldWindContPType3IECESet = windContPType3IECESet;
        windContPType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC, oldWindContPType3IEC, null,
                    oldWindContPType3IECESet );
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
    public void unsetWindContPType3IEC() {
        if( windContPType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContPType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContPType3IEC.class, msgs );
            msgs = basicUnsetWindContPType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPType3IECESet = windContPType3IECESet;
            windContPType3IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC, null, null,
                    oldWindContPType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContPType3IEC() {
        return windContPType3IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC:
            if( windPlantFreqPcontrolIEC != null )
                msgs = ( ( InternalEObject ) windPlantFreqPcontrolIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                        WindPlantFreqPcontrolIEC.class, msgs );
            return basicSetWindPlantFreqPcontrolIEC( ( WindPlantFreqPcontrolIEC ) otherEnd, msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC:
            if( windContRotorRIEC != null ) msgs = ( ( InternalEObject ) windContRotorRIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContRotorRIEC.class, msgs );
            return basicSetWindContRotorRIEC( ( WindContRotorRIEC ) otherEnd, msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC:
            if( windPlantReactiveControlIEC != null )
                msgs = ( ( InternalEObject ) windPlantReactiveControlIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                        WindPlantReactiveControlIEC.class, msgs );
            return basicSetWindPlantReactiveControlIEC( ( WindPlantReactiveControlIEC ) otherEnd, msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_QPQU_LIM_IEC:
            if( windContQPQULimIEC != null ) msgs = ( ( InternalEObject ) windContQPQULimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QPQU_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContQPQULimIEC.class, msgs );
            return basicSetWindContQPQULimIEC( ( WindContQPQULimIEC ) otherEnd, msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC:
            if( windContCurrLimIEC != null ) msgs = ( ( InternalEObject ) windContCurrLimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContCurrLimIEC.class, msgs );
            return basicSetWindContCurrLimIEC( ( WindContCurrLimIEC ) otherEnd, msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC:
            if( windPitchContPowerIEC != null )
                msgs = ( ( InternalEObject ) windPitchContPowerIEC ).eInverseRemove( this,
                        CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindPitchContPowerIEC.class,
                        msgs );
            return basicSetWindPitchContPowerIEC( ( WindPitchContPowerIEC ) otherEnd, msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_GEN_TYPE3B_IEC:
            if( windGenType3bIEC != null ) msgs = ( ( InternalEObject ) windGenType3bIEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE3B_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindGenType3bIEC.class, msgs );
            return basicSetWindGenType3bIEC( ( WindGenType3bIEC ) otherEnd, msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC:
            if( windProtectionIEC != null ) msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindProtectionIEC.class, msgs );
            return basicSetWindProtectionIEC( ( WindProtectionIEC ) otherEnd, msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC:
            if( windContPType3IEC != null ) msgs = ( ( InternalEObject ) windContPType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE, WindContPType3IEC.class, msgs );
            return basicSetWindContPType3IEC( ( WindContPType3IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC:
            return basicUnsetWindPlantFreqPcontrolIEC( msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC:
            return basicUnsetWindContRotorRIEC( msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC:
            return basicUnsetWindPlantReactiveControlIEC( msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_QPQU_LIM_IEC:
            return basicUnsetWindContQPQULimIEC( msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC:
            return basicUnsetWindContCurrLimIEC( msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC:
            return basicUnsetWindPitchContPowerIEC( msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_GEN_TYPE3B_IEC:
            return basicUnsetWindGenType3bIEC( msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC:
            return basicUnsetWindProtectionIEC( msgs );
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC:
            return basicUnsetWindContPType3IEC( msgs );
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
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__INPUT:
            return getInput();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__LOOKUP_TABLE_FUNCTION_TYPE:
            return getLookupTableFunctionType();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__OUTPUT:
            return getOutput();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__SEQUENCE:
            return getSequence();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC:
            return getWindPlantFreqPcontrolIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC:
            return getWindContRotorRIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC:
            return getWindPlantReactiveControlIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_QPQU_LIM_IEC:
            return getWindContQPQULimIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC:
            return getWindContCurrLimIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC:
            return getWindPitchContPowerIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_GEN_TYPE3B_IEC:
            return getWindGenType3bIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC:
            return getWindProtectionIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC:
            return getWindContPType3IEC();
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
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__INPUT:
            setInput( ( Float ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__LOOKUP_TABLE_FUNCTION_TYPE:
            setLookupTableFunctionType( ( WindLookupTableFunctionKind ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__OUTPUT:
            setOutput( ( Float ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__SEQUENCE:
            setSequence( ( Integer ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC:
            setWindPlantFreqPcontrolIEC( ( WindPlantFreqPcontrolIEC ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC:
            setWindContRotorRIEC( ( WindContRotorRIEC ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC:
            setWindPlantReactiveControlIEC( ( WindPlantReactiveControlIEC ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_QPQU_LIM_IEC:
            setWindContQPQULimIEC( ( WindContQPQULimIEC ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC:
            setWindContCurrLimIEC( ( WindContCurrLimIEC ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC:
            setWindPitchContPowerIEC( ( WindPitchContPowerIEC ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_GEN_TYPE3B_IEC:
            setWindGenType3bIEC( ( WindGenType3bIEC ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC:
            setWindProtectionIEC( ( WindProtectionIEC ) newValue );
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC:
            setWindContPType3IEC( ( WindContPType3IEC ) newValue );
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
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__INPUT:
            unsetInput();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__LOOKUP_TABLE_FUNCTION_TYPE:
            unsetLookupTableFunctionType();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__OUTPUT:
            unsetOutput();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__SEQUENCE:
            unsetSequence();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC:
            unsetWindPlantFreqPcontrolIEC();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC:
            unsetWindContRotorRIEC();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC:
            unsetWindPlantReactiveControlIEC();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_QPQU_LIM_IEC:
            unsetWindContQPQULimIEC();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC:
            unsetWindContCurrLimIEC();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC:
            unsetWindPitchContPowerIEC();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_GEN_TYPE3B_IEC:
            unsetWindGenType3bIEC();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC:
            unsetWindProtectionIEC();
            return;
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC:
            unsetWindContPType3IEC();
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
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__INPUT:
            return isSetInput();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__LOOKUP_TABLE_FUNCTION_TYPE:
            return isSetLookupTableFunctionType();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__OUTPUT:
            return isSetOutput();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__SEQUENCE:
            return isSetSequence();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC:
            return isSetWindPlantFreqPcontrolIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC:
            return isSetWindContRotorRIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC:
            return isSetWindPlantReactiveControlIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_QPQU_LIM_IEC:
            return isSetWindContQPQULimIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC:
            return isSetWindContCurrLimIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC:
            return isSetWindPitchContPowerIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_GEN_TYPE3B_IEC:
            return isSetWindGenType3bIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC:
            return isSetWindProtectionIEC();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC:
            return isSetWindContPType3IEC();
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
        result.append( " (input: " );
        if( inputESet )
            result.append( input );
        else
            result.append( "<unset>" );
        result.append( ", lookupTableFunctionType: " );
        if( lookupTableFunctionTypeESet )
            result.append( lookupTableFunctionType );
        else
            result.append( "<unset>" );
        result.append( ", output: " );
        if( outputESet )
            result.append( output );
        else
            result.append( "<unset>" );
        result.append( ", sequence: " );
        if( sequenceESet )
            result.append( sequence );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindDynamicsLookupTableImpl
