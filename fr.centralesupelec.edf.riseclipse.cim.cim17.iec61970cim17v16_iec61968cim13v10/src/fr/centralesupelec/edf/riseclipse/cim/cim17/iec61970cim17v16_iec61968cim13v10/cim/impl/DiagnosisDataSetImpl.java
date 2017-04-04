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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnosis Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getFinalCause <em>Final Cause</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getFinalCode <em>Final Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getFinalOrigin <em>Final Origin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getFinalRemark <em>Final Remark</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getPreliminaryCode <em>Preliminary Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getPreliminaryDateTime <em>Preliminary Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getPreliminaryRemark <em>Preliminary Remark</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getRootCause <em>Root Cause</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getRootOrigin <em>Root Origin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagnosisDataSetImpl#getRootRemark <em>Root Remark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosisDataSetImpl extends ProcedureDataSetImpl implements DiagnosisDataSet {
    /**
     * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffect()
     * @generated
     * @ordered
     */
    protected static final String EFFECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffect()
     * @generated
     * @ordered
     */
    protected String effect = EFFECT_EDEFAULT;

    /**
     * This is true if the Effect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean effectESet;

    /**
     * The default value of the '{@link #getFailureMode() <em>Failure Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailureMode()
     * @generated
     * @ordered
     */
    protected static final String FAILURE_MODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFailureMode() <em>Failure Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailureMode()
     * @generated
     * @ordered
     */
    protected String failureMode = FAILURE_MODE_EDEFAULT;

    /**
     * This is true if the Failure Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean failureModeESet;

    /**
     * The default value of the '{@link #getFinalCause() <em>Final Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalCause()
     * @generated
     * @ordered
     */
    protected static final String FINAL_CAUSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFinalCause() <em>Final Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalCause()
     * @generated
     * @ordered
     */
    protected String finalCause = FINAL_CAUSE_EDEFAULT;

    /**
     * This is true if the Final Cause attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean finalCauseESet;

    /**
     * The default value of the '{@link #getFinalCode() <em>Final Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalCode()
     * @generated
     * @ordered
     */
    protected static final String FINAL_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFinalCode() <em>Final Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalCode()
     * @generated
     * @ordered
     */
    protected String finalCode = FINAL_CODE_EDEFAULT;

    /**
     * This is true if the Final Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean finalCodeESet;

    /**
     * The default value of the '{@link #getFinalOrigin() <em>Final Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalOrigin()
     * @generated
     * @ordered
     */
    protected static final String FINAL_ORIGIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFinalOrigin() <em>Final Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalOrigin()
     * @generated
     * @ordered
     */
    protected String finalOrigin = FINAL_ORIGIN_EDEFAULT;

    /**
     * This is true if the Final Origin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean finalOriginESet;

    /**
     * The default value of the '{@link #getFinalRemark() <em>Final Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalRemark()
     * @generated
     * @ordered
     */
    protected static final String FINAL_REMARK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFinalRemark() <em>Final Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalRemark()
     * @generated
     * @ordered
     */
    protected String finalRemark = FINAL_REMARK_EDEFAULT;

    /**
     * This is true if the Final Remark attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean finalRemarkESet;

    /**
     * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseCode()
     * @generated
     * @ordered
     */
    protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.ABCN;

    /**
     * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseCode()
     * @generated
     * @ordered
     */
    protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

    /**
     * This is true if the Phase Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseCodeESet;

    /**
     * The default value of the '{@link #getPreliminaryCode() <em>Preliminary Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreliminaryCode()
     * @generated
     * @ordered
     */
    protected static final String PRELIMINARY_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPreliminaryCode() <em>Preliminary Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreliminaryCode()
     * @generated
     * @ordered
     */
    protected String preliminaryCode = PRELIMINARY_CODE_EDEFAULT;

    /**
     * This is true if the Preliminary Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean preliminaryCodeESet;

    /**
     * The default value of the '{@link #getPreliminaryDateTime() <em>Preliminary Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreliminaryDateTime()
     * @generated
     * @ordered
     */
    protected static final Date PRELIMINARY_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPreliminaryDateTime() <em>Preliminary Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreliminaryDateTime()
     * @generated
     * @ordered
     */
    protected Date preliminaryDateTime = PRELIMINARY_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Preliminary Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean preliminaryDateTimeESet;

    /**
     * The default value of the '{@link #getPreliminaryRemark() <em>Preliminary Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreliminaryRemark()
     * @generated
     * @ordered
     */
    protected static final String PRELIMINARY_REMARK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPreliminaryRemark() <em>Preliminary Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreliminaryRemark()
     * @generated
     * @ordered
     */
    protected String preliminaryRemark = PRELIMINARY_REMARK_EDEFAULT;

    /**
     * This is true if the Preliminary Remark attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean preliminaryRemarkESet;

    /**
     * The default value of the '{@link #getRootCause() <em>Root Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootCause()
     * @generated
     * @ordered
     */
    protected static final String ROOT_CAUSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRootCause() <em>Root Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootCause()
     * @generated
     * @ordered
     */
    protected String rootCause = ROOT_CAUSE_EDEFAULT;

    /**
     * This is true if the Root Cause attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rootCauseESet;

    /**
     * The default value of the '{@link #getRootOrigin() <em>Root Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootOrigin()
     * @generated
     * @ordered
     */
    protected static final String ROOT_ORIGIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRootOrigin() <em>Root Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootOrigin()
     * @generated
     * @ordered
     */
    protected String rootOrigin = ROOT_ORIGIN_EDEFAULT;

    /**
     * This is true if the Root Origin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rootOriginESet;

    /**
     * The default value of the '{@link #getRootRemark() <em>Root Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootRemark()
     * @generated
     * @ordered
     */
    protected static final String ROOT_REMARK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRootRemark() <em>Root Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootRemark()
     * @generated
     * @ordered
     */
    protected String rootRemark = ROOT_REMARK_EDEFAULT;

    /**
     * This is true if the Root Remark attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rootRemarkESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagnosisDataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiagnosisDataSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEffect() {
        return effect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEffect( String newEffect ) {
        String oldEffect = effect;
        effect = newEffect;
        boolean oldEffectESet = effectESet;
        effectESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGNOSIS_DATA_SET__EFFECT, oldEffect, effect, !oldEffectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEffect() {
        String oldEffect = effect;
        boolean oldEffectESet = effectESet;
        effect = EFFECT_EDEFAULT;
        effectESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGNOSIS_DATA_SET__EFFECT, oldEffect, EFFECT_EDEFAULT, oldEffectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEffect() {
        return effectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFailureMode() {
        return failureMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFailureMode( String newFailureMode ) {
        String oldFailureMode = failureMode;
        failureMode = newFailureMode;
        boolean oldFailureModeESet = failureModeESet;
        failureModeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE, oldFailureMode, failureMode, !oldFailureModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFailureMode() {
        String oldFailureMode = failureMode;
        boolean oldFailureModeESet = failureModeESet;
        failureMode = FAILURE_MODE_EDEFAULT;
        failureModeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE,
                    oldFailureMode, FAILURE_MODE_EDEFAULT, oldFailureModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFailureMode() {
        return failureModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFinalCause() {
        return finalCause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFinalCause( String newFinalCause ) {
        String oldFinalCause = finalCause;
        finalCause = newFinalCause;
        boolean oldFinalCauseESet = finalCauseESet;
        finalCauseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE, oldFinalCause, finalCause, !oldFinalCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFinalCause() {
        String oldFinalCause = finalCause;
        boolean oldFinalCauseESet = finalCauseESet;
        finalCause = FINAL_CAUSE_EDEFAULT;
        finalCauseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE, oldFinalCause, FINAL_CAUSE_EDEFAULT, oldFinalCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFinalCause() {
        return finalCauseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFinalCode() {
        return finalCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFinalCode( String newFinalCode ) {
        String oldFinalCode = finalCode;
        finalCode = newFinalCode;
        boolean oldFinalCodeESet = finalCodeESet;
        finalCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGNOSIS_DATA_SET__FINAL_CODE, oldFinalCode, finalCode, !oldFinalCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFinalCode() {
        String oldFinalCode = finalCode;
        boolean oldFinalCodeESet = finalCodeESet;
        finalCode = FINAL_CODE_EDEFAULT;
        finalCodeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGNOSIS_DATA_SET__FINAL_CODE, oldFinalCode, FINAL_CODE_EDEFAULT, oldFinalCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFinalCode() {
        return finalCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFinalOrigin() {
        return finalOrigin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFinalOrigin( String newFinalOrigin ) {
        String oldFinalOrigin = finalOrigin;
        finalOrigin = newFinalOrigin;
        boolean oldFinalOriginESet = finalOriginESet;
        finalOriginESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN, oldFinalOrigin, finalOrigin, !oldFinalOriginESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFinalOrigin() {
        String oldFinalOrigin = finalOrigin;
        boolean oldFinalOriginESet = finalOriginESet;
        finalOrigin = FINAL_ORIGIN_EDEFAULT;
        finalOriginESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN,
                    oldFinalOrigin, FINAL_ORIGIN_EDEFAULT, oldFinalOriginESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFinalOrigin() {
        return finalOriginESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFinalRemark() {
        return finalRemark;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFinalRemark( String newFinalRemark ) {
        String oldFinalRemark = finalRemark;
        finalRemark = newFinalRemark;
        boolean oldFinalRemarkESet = finalRemarkESet;
        finalRemarkESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK, oldFinalRemark, finalRemark, !oldFinalRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFinalRemark() {
        String oldFinalRemark = finalRemark;
        boolean oldFinalRemarkESet = finalRemarkESet;
        finalRemark = FINAL_REMARK_EDEFAULT;
        finalRemarkESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK,
                    oldFinalRemark, FINAL_REMARK_EDEFAULT, oldFinalRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFinalRemark() {
        return finalRemarkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseCode( PhaseCode newPhaseCode ) {
        PhaseCode oldPhaseCode = phaseCode;
        phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
        boolean oldPhaseCodeESet = phaseCodeESet;
        phaseCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGNOSIS_DATA_SET__PHASE_CODE, oldPhaseCode, phaseCode, !oldPhaseCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseCode() {
        PhaseCode oldPhaseCode = phaseCode;
        boolean oldPhaseCodeESet = phaseCodeESet;
        phaseCode = PHASE_CODE_EDEFAULT;
        phaseCodeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGNOSIS_DATA_SET__PHASE_CODE, oldPhaseCode, PHASE_CODE_EDEFAULT, oldPhaseCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseCode() {
        return phaseCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPreliminaryCode() {
        return preliminaryCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPreliminaryCode( String newPreliminaryCode ) {
        String oldPreliminaryCode = preliminaryCode;
        preliminaryCode = newPreliminaryCode;
        boolean oldPreliminaryCodeESet = preliminaryCodeESet;
        preliminaryCodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE,
                    oldPreliminaryCode, preliminaryCode, !oldPreliminaryCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPreliminaryCode() {
        String oldPreliminaryCode = preliminaryCode;
        boolean oldPreliminaryCodeESet = preliminaryCodeESet;
        preliminaryCode = PRELIMINARY_CODE_EDEFAULT;
        preliminaryCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE,
                    oldPreliminaryCode, PRELIMINARY_CODE_EDEFAULT, oldPreliminaryCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPreliminaryCode() {
        return preliminaryCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getPreliminaryDateTime() {
        return preliminaryDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPreliminaryDateTime( Date newPreliminaryDateTime ) {
        Date oldPreliminaryDateTime = preliminaryDateTime;
        preliminaryDateTime = newPreliminaryDateTime;
        boolean oldPreliminaryDateTimeESet = preliminaryDateTimeESet;
        preliminaryDateTimeESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME,
                        oldPreliminaryDateTime, preliminaryDateTime, !oldPreliminaryDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPreliminaryDateTime() {
        Date oldPreliminaryDateTime = preliminaryDateTime;
        boolean oldPreliminaryDateTimeESet = preliminaryDateTimeESet;
        preliminaryDateTime = PRELIMINARY_DATE_TIME_EDEFAULT;
        preliminaryDateTimeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME,
                        oldPreliminaryDateTime, PRELIMINARY_DATE_TIME_EDEFAULT, oldPreliminaryDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPreliminaryDateTime() {
        return preliminaryDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPreliminaryRemark() {
        return preliminaryRemark;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPreliminaryRemark( String newPreliminaryRemark ) {
        String oldPreliminaryRemark = preliminaryRemark;
        preliminaryRemark = newPreliminaryRemark;
        boolean oldPreliminaryRemarkESet = preliminaryRemarkESet;
        preliminaryRemarkESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK,
                    oldPreliminaryRemark, preliminaryRemark, !oldPreliminaryRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPreliminaryRemark() {
        String oldPreliminaryRemark = preliminaryRemark;
        boolean oldPreliminaryRemarkESet = preliminaryRemarkESet;
        preliminaryRemark = PRELIMINARY_REMARK_EDEFAULT;
        preliminaryRemarkESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK,
                    oldPreliminaryRemark, PRELIMINARY_REMARK_EDEFAULT, oldPreliminaryRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPreliminaryRemark() {
        return preliminaryRemarkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRootCause() {
        return rootCause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRootCause( String newRootCause ) {
        String oldRootCause = rootCause;
        rootCause = newRootCause;
        boolean oldRootCauseESet = rootCauseESet;
        rootCauseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE, oldRootCause, rootCause, !oldRootCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRootCause() {
        String oldRootCause = rootCause;
        boolean oldRootCauseESet = rootCauseESet;
        rootCause = ROOT_CAUSE_EDEFAULT;
        rootCauseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE, oldRootCause, ROOT_CAUSE_EDEFAULT, oldRootCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRootCause() {
        return rootCauseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRootOrigin() {
        return rootOrigin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRootOrigin( String newRootOrigin ) {
        String oldRootOrigin = rootOrigin;
        rootOrigin = newRootOrigin;
        boolean oldRootOriginESet = rootOriginESet;
        rootOriginESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN, oldRootOrigin, rootOrigin, !oldRootOriginESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRootOrigin() {
        String oldRootOrigin = rootOrigin;
        boolean oldRootOriginESet = rootOriginESet;
        rootOrigin = ROOT_ORIGIN_EDEFAULT;
        rootOriginESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN, oldRootOrigin, ROOT_ORIGIN_EDEFAULT, oldRootOriginESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRootOrigin() {
        return rootOriginESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRootRemark() {
        return rootRemark;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRootRemark( String newRootRemark ) {
        String oldRootRemark = rootRemark;
        rootRemark = newRootRemark;
        boolean oldRootRemarkESet = rootRemarkESet;
        rootRemarkESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK, oldRootRemark, rootRemark, !oldRootRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRootRemark() {
        String oldRootRemark = rootRemark;
        boolean oldRootRemarkESet = rootRemarkESet;
        rootRemark = ROOT_REMARK_EDEFAULT;
        rootRemarkESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK, oldRootRemark, ROOT_REMARK_EDEFAULT, oldRootRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRootRemark() {
        return rootRemarkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DIAGNOSIS_DATA_SET__EFFECT:
            return getEffect();
        case CimPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
            return getFailureMode();
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
            return getFinalCause();
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
            return getFinalCode();
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
            return getFinalOrigin();
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
            return getFinalRemark();
        case CimPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
            return getPhaseCode();
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
            return getPreliminaryCode();
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
            return getPreliminaryDateTime();
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
            return getPreliminaryRemark();
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
            return getRootCause();
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
            return getRootOrigin();
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
            return getRootRemark();
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
        case CimPackage.DIAGNOSIS_DATA_SET__EFFECT:
            setEffect( ( String ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
            setFailureMode( ( String ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
            setFinalCause( ( String ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
            setFinalCode( ( String ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
            setFinalOrigin( ( String ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
            setFinalRemark( ( String ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
            setPhaseCode( ( PhaseCode ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
            setPreliminaryCode( ( String ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
            setPreliminaryDateTime( ( Date ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
            setPreliminaryRemark( ( String ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
            setRootCause( ( String ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
            setRootOrigin( ( String ) newValue );
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
            setRootRemark( ( String ) newValue );
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
        case CimPackage.DIAGNOSIS_DATA_SET__EFFECT:
            unsetEffect();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
            unsetFailureMode();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
            unsetFinalCause();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
            unsetFinalCode();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
            unsetFinalOrigin();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
            unsetFinalRemark();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
            unsetPhaseCode();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
            unsetPreliminaryCode();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
            unsetPreliminaryDateTime();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
            unsetPreliminaryRemark();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
            unsetRootCause();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
            unsetRootOrigin();
            return;
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
            unsetRootRemark();
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
        case CimPackage.DIAGNOSIS_DATA_SET__EFFECT:
            return isSetEffect();
        case CimPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
            return isSetFailureMode();
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
            return isSetFinalCause();
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
            return isSetFinalCode();
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
            return isSetFinalOrigin();
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
            return isSetFinalRemark();
        case CimPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
            return isSetPhaseCode();
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
            return isSetPreliminaryCode();
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
            return isSetPreliminaryDateTime();
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
            return isSetPreliminaryRemark();
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
            return isSetRootCause();
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
            return isSetRootOrigin();
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
            return isSetRootRemark();
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
        result.append( " (effect: " );
        if( effectESet )
            result.append( effect );
        else
            result.append( "<unset>" );
        result.append( ", failureMode: " );
        if( failureModeESet )
            result.append( failureMode );
        else
            result.append( "<unset>" );
        result.append( ", finalCause: " );
        if( finalCauseESet )
            result.append( finalCause );
        else
            result.append( "<unset>" );
        result.append( ", finalCode: " );
        if( finalCodeESet )
            result.append( finalCode );
        else
            result.append( "<unset>" );
        result.append( ", finalOrigin: " );
        if( finalOriginESet )
            result.append( finalOrigin );
        else
            result.append( "<unset>" );
        result.append( ", finalRemark: " );
        if( finalRemarkESet )
            result.append( finalRemark );
        else
            result.append( "<unset>" );
        result.append( ", phaseCode: " );
        if( phaseCodeESet )
            result.append( phaseCode );
        else
            result.append( "<unset>" );
        result.append( ", preliminaryCode: " );
        if( preliminaryCodeESet )
            result.append( preliminaryCode );
        else
            result.append( "<unset>" );
        result.append( ", preliminaryDateTime: " );
        if( preliminaryDateTimeESet )
            result.append( preliminaryDateTime );
        else
            result.append( "<unset>" );
        result.append( ", preliminaryRemark: " );
        if( preliminaryRemarkESet )
            result.append( preliminaryRemark );
        else
            result.append( "<unset>" );
        result.append( ", rootCause: " );
        if( rootCauseESet )
            result.append( rootCause );
        else
            result.append( "<unset>" );
        result.append( ", rootOrigin: " );
        if( rootOriginESet )
            result.append( rootOrigin );
        else
            result.append( "<unset>" );
        result.append( ", rootRemark: " );
        if( rootRemarkESet )
            result.append( rootRemark );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DiagnosisDataSetImpl
