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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Limit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Procedure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureImpl#getLimits <em>Limits</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProcedureImpl#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends DocumentImpl implements Procedure {
    /**
     * The default value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstruction()
     * @generated
     * @ordered
     */
    protected static final String INSTRUCTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstruction()
     * @generated
     * @ordered
     */
    protected String instruction = INSTRUCTION_EDEFAULT;

    /**
     * This is true if the Instruction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean instructionESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final ProcedureKind KIND_EDEFAULT = ProcedureKind.INSPECTION;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected ProcedureKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected static final String SEQUENCE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected String sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

    /**
     * This is true if the Sequence Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sequenceNumberESet;

    /**
     * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssets()
     * @generated
     * @ordered
     */
    protected EList< Asset > assets;

    /**
     * The cached value of the '{@link #getLimits() <em>Limits</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimits()
     * @generated
     * @ordered
     */
    protected EList< Limit > limits;

    /**
     * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurements()
     * @generated
     * @ordered
     */
    protected EList< Measurement > measurements;

    /**
     * The cached value of the '{@link #getProcedureDataSets() <em>Procedure Data Sets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcedureDataSets()
     * @generated
     * @ordered
     */
    protected EList< ProcedureDataSet > procedureDataSets;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcedureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getProcedure();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInstruction() {
        return instruction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInstruction( String newInstruction ) {
        String oldInstruction = instruction;
        instruction = newInstruction;
        boolean oldInstructionESet = instructionESet;
        instructionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PROCEDURE__INSTRUCTION, oldInstruction, instruction, !oldInstructionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInstruction() {
        String oldInstruction = instruction;
        boolean oldInstructionESet = instructionESet;
        instruction = INSTRUCTION_EDEFAULT;
        instructionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PROCEDURE__INSTRUCTION, oldInstruction, INSTRUCTION_EDEFAULT, oldInstructionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInstruction() {
        return instructionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProcedureKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( ProcedureKind newKind ) {
        ProcedureKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PROCEDURE__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        ProcedureKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PROCEDURE__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
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
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequenceNumber( String newSequenceNumber ) {
        String oldSequenceNumber = sequenceNumber;
        sequenceNumber = newSequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PROCEDURE__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber, !oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSequenceNumber() {
        String oldSequenceNumber = sequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
        sequenceNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PROCEDURE__SEQUENCE_NUMBER,
                    oldSequenceNumber, SEQUENCE_NUMBER_EDEFAULT, oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSequenceNumber() {
        return sequenceNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAssets() {
        if( assets == null ) {
            assets = new EObjectWithInverseEList.Unsettable.ManyInverse< Asset >( Asset.class, this,
                    CimPackage.PROCEDURE__ASSETS, CimPackage.ASSET__PROCEDURES );
        }
        return assets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssets() {
        if( assets != null ) ( ( InternalEList.Unsettable< ? > ) assets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssets() {
        return assets != null && ( ( InternalEList.Unsettable< ? > ) assets ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Limit > getLimits() {
        if( limits == null ) {
            limits = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Limit >( Limit.class, this,
                    CimPackage.PROCEDURE__LIMITS, CimPackage.LIMIT__PROCEDURES );
        }
        return limits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLimits() {
        if( limits != null ) ( ( InternalEList.Unsettable< ? > ) limits ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLimits() {
        return limits != null && ( ( InternalEList.Unsettable< ? > ) limits ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Measurement > getMeasurements() {
        if( measurements == null ) {
            measurements = new EObjectWithInverseEList.Unsettable.ManyInverse< Measurement >( Measurement.class, this,
                    CimPackage.PROCEDURE__MEASUREMENTS, CimPackage.MEASUREMENT__PROCEDURES );
        }
        return measurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurements() {
        if( measurements != null ) ( ( InternalEList.Unsettable< ? > ) measurements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurements() {
        return measurements != null && ( ( InternalEList.Unsettable< ? > ) measurements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProcedureDataSet > getProcedureDataSets() {
        if( procedureDataSets == null ) {
            procedureDataSets = new EObjectWithInverseResolvingEList.Unsettable< ProcedureDataSet >(
                    ProcedureDataSet.class, this, CimPackage.PROCEDURE__PROCEDURE_DATA_SETS,
                    CimPackage.PROCEDURE_DATA_SET__PROCEDURE );
        }
        return procedureDataSets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcedureDataSets() {
        if( procedureDataSets != null ) ( ( InternalEList.Unsettable< ? > ) procedureDataSets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcedureDataSets() {
        return procedureDataSets != null && ( ( InternalEList.Unsettable< ? > ) procedureDataSets ).isSet();
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
        case CimPackage.PROCEDURE__ASSETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssets() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.PROCEDURE__LIMITS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLimits() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.PROCEDURE__MEASUREMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurements() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.PROCEDURE__PROCEDURE_DATA_SETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcedureDataSets() )
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
        case CimPackage.PROCEDURE__ASSETS:
            return ( ( InternalEList< ? > ) getAssets() ).basicRemove( otherEnd, msgs );
        case CimPackage.PROCEDURE__LIMITS:
            return ( ( InternalEList< ? > ) getLimits() ).basicRemove( otherEnd, msgs );
        case CimPackage.PROCEDURE__MEASUREMENTS:
            return ( ( InternalEList< ? > ) getMeasurements() ).basicRemove( otherEnd, msgs );
        case CimPackage.PROCEDURE__PROCEDURE_DATA_SETS:
            return ( ( InternalEList< ? > ) getProcedureDataSets() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PROCEDURE__INSTRUCTION:
            return getInstruction();
        case CimPackage.PROCEDURE__KIND:
            return getKind();
        case CimPackage.PROCEDURE__SEQUENCE_NUMBER:
            return getSequenceNumber();
        case CimPackage.PROCEDURE__ASSETS:
            return getAssets();
        case CimPackage.PROCEDURE__LIMITS:
            return getLimits();
        case CimPackage.PROCEDURE__MEASUREMENTS:
            return getMeasurements();
        case CimPackage.PROCEDURE__PROCEDURE_DATA_SETS:
            return getProcedureDataSets();
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
        case CimPackage.PROCEDURE__INSTRUCTION:
            setInstruction( ( String ) newValue );
            return;
        case CimPackage.PROCEDURE__KIND:
            setKind( ( ProcedureKind ) newValue );
            return;
        case CimPackage.PROCEDURE__SEQUENCE_NUMBER:
            setSequenceNumber( ( String ) newValue );
            return;
        case CimPackage.PROCEDURE__ASSETS:
            getAssets().clear();
            getAssets().addAll( ( Collection< ? extends Asset > ) newValue );
            return;
        case CimPackage.PROCEDURE__LIMITS:
            getLimits().clear();
            getLimits().addAll( ( Collection< ? extends Limit > ) newValue );
            return;
        case CimPackage.PROCEDURE__MEASUREMENTS:
            getMeasurements().clear();
            getMeasurements().addAll( ( Collection< ? extends Measurement > ) newValue );
            return;
        case CimPackage.PROCEDURE__PROCEDURE_DATA_SETS:
            getProcedureDataSets().clear();
            getProcedureDataSets().addAll( ( Collection< ? extends ProcedureDataSet > ) newValue );
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
        case CimPackage.PROCEDURE__INSTRUCTION:
            unsetInstruction();
            return;
        case CimPackage.PROCEDURE__KIND:
            unsetKind();
            return;
        case CimPackage.PROCEDURE__SEQUENCE_NUMBER:
            unsetSequenceNumber();
            return;
        case CimPackage.PROCEDURE__ASSETS:
            unsetAssets();
            return;
        case CimPackage.PROCEDURE__LIMITS:
            unsetLimits();
            return;
        case CimPackage.PROCEDURE__MEASUREMENTS:
            unsetMeasurements();
            return;
        case CimPackage.PROCEDURE__PROCEDURE_DATA_SETS:
            unsetProcedureDataSets();
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
        case CimPackage.PROCEDURE__INSTRUCTION:
            return isSetInstruction();
        case CimPackage.PROCEDURE__KIND:
            return isSetKind();
        case CimPackage.PROCEDURE__SEQUENCE_NUMBER:
            return isSetSequenceNumber();
        case CimPackage.PROCEDURE__ASSETS:
            return isSetAssets();
        case CimPackage.PROCEDURE__LIMITS:
            return isSetLimits();
        case CimPackage.PROCEDURE__MEASUREMENTS:
            return isSetMeasurements();
        case CimPackage.PROCEDURE__PROCEDURE_DATA_SETS:
            return isSetProcedureDataSets();
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
        result.append( " (instruction: " );
        if( instructionESet )
            result.append( instruction );
        else
            result.append( "<unset>" );
        result.append( ", kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ", sequenceNumber: " );
        if( sequenceNumberESet )
            result.append( sequenceNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ProcedureImpl
